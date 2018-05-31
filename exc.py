import openpyxl
doc = openpyxl.load_workbook('listado_videoteca_sobradiel.xlsx')
hoja = doc.get_sheet_by_name('Listado')
nombre = []
generos = []
produccion = []
puntuacion = []
reviews = []
def inicializacion():
    for i in range(2,483):
        tup=()
        nombre.append(hoja['A' + str(i)].value)
        produccion.append(hoja['B'+ str(i)].value)
        genero = hoja['C'+ str(i)].value
        review = hoja['F'+str(i)].value
        tup = review
        reviews.append(tup)
        if (' ' in genero):
            tup = genero.split()
        else:
            tup=(genero)
        puntuacion.append(hoja['D'+ str(i)].value)
        generos.append(tup)
def categoria(x):
    indices=[]
    a = 'a'
    for i in range(0,len(generos)):  
        if isinstance(generos[i],list):
            for j in range(0,len(generos[i])):
                a = generos[i][j]
                if x.lower() == a.lower():
                    indices.append(i)
        else:
            a = generos[i]
            if x.lower() == a.lower():
                indices.append(i)
    return indices

def separarReview(i):
    a = reviews[i]
    au = [] 
    if not(a is None):
        au = au + a.split('/')      
    return au
def unirreviews(i,coment):
    print coment
    a = reviews[i]
    if not(a is None):
        a.append(coment)
    else:
        a = [] 
        a.append(coment)
    aux = ""
    for j in a:
     if len(a) > 1:
         aux = aux +"/"+ j
    else:
        aux = aux + j
    hoja['F'+str(i+2)] = aux
    doc.save('listado_videoteca_sobradiel.xlsx')
    for i in range(0,len(reviews)):
        reviews.pop()
    for i in range(2,483):
        tup=()
        review = hoja['F'+str(i)].value
        tup = review
        reviews.append(tup)
#print (categoria('accion'))
#print (separarReview(0))
#separador = "/"
#a = reviews[0]
#au = []
#au = au + a.split('/')
#print au

