import spade
import time
import Learning
import GUI
import exc

#import fuzzy_model
###############################################################################
class AgenteLearn(spade.Agent.Agent):
    
    class comportamiento(spade.Behaviour.OneShotBehaviour):
        def onStart(self):
			print ('iniciando aprendizaje')

        def _process(self):
                 
                  Learning.puntaje(dicc)

        def onEnd(self):
			print("ya entregue el puntaje")
    def _setup(self):
         print("iniciando agente de aprendizaje")
         b = self.comportamiento()
         self.addBehaviour(b,None)
###############################################################################         
class AgenteGui(spade.Agent.Agent):
    class comportamiento2(spade.Behaviour.OneShotBehaviour):
        def onStart(self):
            print ('iniciando gui')
        def _process(self):
            GUI.lanzar()
        def onEnd(self):
            print('Acabamos ya murio IA :V')
    def _setup(self):
        print ('iniciando agente de interfaz')
        b2 = self.comportamiento2()
        self.addBehaviour(b2,None)
###############################################################################
class AgenteDatos(spade.Agent.Agent):
    class comportamiento3(spade.Behaviour.OneShotBehaviour):
        def onStart(self):
            print("iniciando conjunto de datos")
        def _process(self):
            exc.inicializacion()
        def onEnd(self):
            print("conjunto de datos cargado")
    def _setup(self):
        print('iniciando agente de datos')
        b3 = self.comportamiento3()
        self.addBehaviour(b3,None)
###############################################################################
def ini():
    host= "127.0.0.1"
    aprendizaje = AgenteLearn("learn@"+host,"secret")  
    aprendizaje.start()

if __name__ == "__main__":
    host= "127.0.0.1" 
    dicc = {} 
    puntaje_c = 0
    NAME = ""
    interfaz = AgenteGui("agent@"+host, "secret")
    
    conjunto = AgenteDatos("datos@"+host,"secret")
    conjunto.start()
    time.sleep(1)
    interfaz.start()
    time.sleep(1)
    
    
    