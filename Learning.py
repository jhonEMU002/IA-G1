import graphlab as gl

data = 0
training =0
sentiment = 0
def inicializacion():
    data = gl.SFrame.read_csv('conjunto.csv')
    data.head()
    data['word_count'] = gl.text_analytics.count_words(data['review'])
    data = data[data['raiting']!=3]
    data['sentiment'] = data['raiting'] >= 4
    training,test=data.random_split(.5,seed=0)
    gl.canvas.set_target('ipynb')
    sentiment = gl.logistic_classifier.create(training,
                                              target='label',
                                              features=['word_count'],
                                              validation_set = test)
    sentiment.evaluate(test,metric='roc_curve')
    sentiment.show()
    data['predicted_sentiment']= sentiment.predict(data,output_type='probability')
    data = data.sort('predicted_sentiment',ascending=False)
    data.head()


