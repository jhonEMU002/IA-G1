from Tkinter import *
import exc
import MultiAgentes
import time
import fuzzy_model
def on_select(event):
    diccionario = {}
    texto.delete('1.0',END)
    a = peliculas.curselection()[0]
    b = peliculas.get(a)
    MultiAgentes.NAME = b
    c = exc.nombre.index(b)
    produccionPelicula = exc.produccion[c]
    raiting = exc.puntuacion[c]
    comentarios = exc.separarReview(c)
    raitings = []
    for i in range (0,len(comentarios)):
        raitings.append(raiting)
    diccionario.update({'review':comentarios})
    diccionario.update({'raiting':raitings})
    if len(comentarios)> 0:
        MultiAgentes.dicc = diccionario
        MultiAgentes.ini()
        time.sleep(1)
    else:
        MultiAgentes.puntaje_c = 0
    fuz = str(fuzzy_model.recepcion(MultiAgentes.puntaje_c,raiting,
                                    produccionPelicula))
    texto.insert(END,fuz+" % recomendada")
 
def buscar():
    peliculas.delete(0,peliculas.size()-1)
    lista = exc.categoria(combo.get())
    for i in lista:
        peliculas.insert(END,exc.nombre[i])
def comentar():
    a = comentario.get('1.0',END)
    comentario.delete('1.0',END)
  
    b = MultiAgentes.NAME
    c = exc.nombre.index(b)
    
    exc.unirreviews(c,a)
app = Tk()
app.title("Recomendador")
app.geometry("400x500")
etiqueta = Label(app,text="Genero").place(x=20,y=20)
combo = Spinbox(app,values=("comic","accion","aventuras","fantastico",
"drama","ficcion","Animacion","Comedia","thriller","belico",
"biografico","historico","epico","musical","romantico","familiar","terror",
"documental","deportivo","western","tragicomedia","social"))
combo.place(x=20 , y = 50)
boton = Button(app,text ="Buscar",command = buscar).place(x=20, y=90)
etiqueta2 = Label(app,text="Peliculas").place(x=20,y=140)
peliculas = Listbox(app)
peliculas.place(x= 20 , y = 160)
peliculas.bind('<<ListboxSelect>>', on_select)

etiqueta3 = Label(app,text = "Porcentaje").place(x=200,y=160)
texto = Text(app,height=2,width=20)
texto.place(x=200, y=180)
etiqueta4 = Label (app,text = "Comentario").place(x=200,y=230)
comentario = Text(app,height=4,width=20)
comentario.place(x=200, y=250)
botoncomentar = Button(app,text='Comentar',command = comentar).place(x=150, y = 330)

def lanzar():
    app.mainloop() 
