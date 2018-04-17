import openpyxl
doc = openpyxl.load_workbook('listado_videoteca_sobradiel.xlsx')
hoja = doc.get_sheet_by_name('Listado')
nombre = []
generos = []
produccion = []
puntuacion = []
duracion = []
def inicializacion():
    print('cargando conjunto de datos')
    for i in range(2,483):
        tup=()
        nombre.append(hoja['A' + str(i)].value)
        produccion.append(hoja['B'+ str(i)].value)
        genero = hoja['C'+ str(i)].value
        if (' ' in genero):
            tup = genero.split()
        else:
            tup=(genero)
        puntuacion.append(hoja['D'+ str(i)].value)
        duracion.append(hoja['E'+ str(i)].value)
        generos.append(tup)
    print('conjunto de datos cargado')
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

            

        


