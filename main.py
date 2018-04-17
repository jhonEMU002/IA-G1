import exc as conjunto
import fuzzy_model as fuz
import Learning as learn


if __name__ == '__main__':
    #inicializacion de la base de datos
    conjunto.inicializacion()
    s = 0
    while(s!='e'):
        categorias=[]
        lista =[]
        print("Por favor ingrese el numero de categorias de peliculas que desea")
        num=int(raw_input())
        for i in range(0,num):
            tup = ['1','2']
            print("Ingrese el nombre de una categoria, ejm: Accion,romance")
            caracteristica=str(raw_input())
            tup[0] = caracteristica
            print("Ingrese su gusto por esta categoria de -1 como minimo a 1 como maximo")
            tup[1] = float(raw_input())
            categorias.append(tup)
        for i in range(0,len(categorias)):
            s = conjunto.categoria(categorias[i][0])
            for j in range(0,len(s)):
                if not(s[j] in lista):
                    lista.append(s[j])
    
        for i in range(0,len(lista)):
            print str(i+1) +' '+conjunto.nombre[lista[i]]
        print('Ingrese el numero de la pelicula')
        pel = int(raw_input())
        punt =  conjunto.puntuacion[lista[pel-1]]
        gust = 0
        d = conjunto.generos[lista[pel-1]]
        if isinstance(d,list):
            for j in range(0,len(d)):
                d[j]= d[j].lower()
        
            for i in range(0,len(categorias)):
                if categorias[i][0].lower() in d:
                    gust = categorias[i][1]
                else:
                    for i in range(0,len(categorias)):
                        if categorias[i][0].lower() == d.lower():
                            gust = categorias[i][1]
        fuz.fuzzyFunction(int(punt),gust)
        print ('ejecutar el aprendizaje? Y: si N:no')
        des = str(raw_input())
        if(des == 'Y'):
            learn.inicializacion()
        print('si desea salir ingrese la letra "e"')
        s = str(raw_input())
        
    
 