import graphlab as gl
import MultiAgentes

data = gl.SFrame.read_csv('conjunto.csv')
data.remove_column('label')
data['word_count'] = gl.text_analytics.count_words(data['review'])
data = data[data['raiting']!=3]
data['sentiment'] = data['raiting'] >= 4
training,test=data.random_split(.8,seed=0)
sentiment = gl.sentiment_analysis.create(training,
                                        'raiting',
                                        features=['review'], validation_set = test)
   
                                        
def puntaje(diccionario):
   
    datosaevaluar = gl.SFrame(diccionario)
    datosaevaluar['word_count'] = gl.text_analytics.count_words(datosaevaluar['review'])
    results = sentiment.predict(datosaevaluar)
    acum = 0
    for i in results:
        acum = acum + i
    prom = acum/len(results)
    MultiAgentes.puntaje_c = prom



