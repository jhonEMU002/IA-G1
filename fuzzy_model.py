import numpy as np
import sys
import skfuzzy as fuzz
from skfuzzy import control as ctrl

print ('preparando modulo de fuzificacion')
calidad = ctrl.Antecedent(np.arange(0,11), 'calidad')
gusto = ctrl.Antecedent(np.arange(-1.0,2.0),'gusto')
recomendado = ctrl.Consequent(np.arange(0,101,1),'Recomendado')
calidad.automf(3)
gusto.automf(3)
recomendado['poco']=fuzz.trimf(recomendado.universe,[0,0,34])
recomendado['medio']=fuzz.trimf(recomendado.universe,[20,54,88])
recomendado['mucho'] = fuzz.trimf(recomendado.universe,[74,100,100])
rule1 = ctrl.Rule(calidad['poor']&gusto['poor'],recomendado['poco'])
rule2 = ctrl.Rule(calidad['average']&gusto['poor'],recomendado['poco'])
rule3 = ctrl.Rule(calidad['good']&gusto['poor'],recomendado['medio'])
rule4 = ctrl.Rule(calidad['poor']&gusto['average'],recomendado['poco'])
rule5 = ctrl.Rule(calidad['average']&gusto['average'],recomendado['medio'])
rule6 = ctrl.Rule(calidad['good']&gusto['average'],recomendado['medio'])
rule7 = ctrl.Rule(calidad['poor']&gusto['good'],recomendado['medio'])
rule8 = ctrl.Rule(calidad['average']&gusto['good'],recomendado['medio'])
rule9 = ctrl.Rule(calidad['good']&gusto['good'],recomendado['mucho'])

control_de_reglas = ctrl.ControlSystem([rule1,rule2,rule3,
                                        rule4,rule5,rule6,
                                        rule7,rule8,rule9])
indicador = ctrl.ControlSystemSimulation(control_de_reglas)
print('modulo fuzzy preparado')
def fuzzyFunction(cal,rait):
    indicador.input['calidad'] = cal
    indicador.input['gusto'] = rait
    indicador.compute()
    print str(indicador.output['Recomendado']) + '%'
    recomendado.view(sim=indicador)
def mostrar():
    calidad.view()
    gusto.view()
    recomendado.view()
