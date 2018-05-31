import requests

url = "http://localhost:8080/Service_Fuzzy/fuzzy/"

def recepcion(p_calific,raiting,vejez):
    url2 = url + str(p_calific)+'/' + str(raiting)+'/'+ str(vejez)
    response =requests.get(url2)
    return response.text

