# JAVA BASICO 
## PRACTICA 2
## Lector del nivel de la calidad del agua en el Atlántico

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Cada objetivo tiene metas específicas que deben alcanzarse en los próximos 15 años.

El departamento del Atlántico se ha comprometido con esta causa y por ello ha decidido adoptar estos retos, se lista uno de los principales relacionados con el agua potable:

De aquí a 2030, se busca lograr el acceso universal y equitativo al agua potable a un precio asequible para todos.

Algunas ONG’s se atribuyeron la tarea de poder diseñar un dispositivo para analizar la calidad del agua de poblaciones apartadas. Para comenzar, requieren que el dispositivo cuente con un lector de la calidad del agua. Después de la lectura, el dispositivo nos entrega el índice de riesgo de la calidad del agua, IRCA, y según este resultado debe indicar el nivel de riesgo.


| Clasificación IRCA (%) | Nivel de riesgo | Entidades a notificar | Entidades a tomar acciones |
| --- | --- | --- | --- |
| 80.1 - 100 | INVIABLE SANITARIAMENTE | Persona prestadora, COVE, Alcaldía, Gobernación, Contraloría General, Procuraduría General | Gobernación (Nivel 4) |
| 35.1 - 80 | ALTO | Persona prestadora, COVE, Alcaldía, Gobernación, SSPD | Alcaldía (Nivel 3) | 
| 14.1 - 35 | MEDIO | Persona prestadora, COVE, Alcaldía, Gobernación	| Persona prestadora (Nivel 2) |
| 5.1 - 14	| BAJO	| Persona prestadora, COVE	| Persona prestadora (Nivel 2)	|
| 0 - 5	| SIN RIESGO	| Continuar el control y la vigilancia | Continuar vigilancia (Nivel 1)	| 

Se requiere que usted desarrolle un programa que debe realizar lo siguiente:

- Leer la cantidad de cuerpos de agua a analizar.
- Leer y almacenar el nombre de cada cuerpo de agua (siempre será una sola palabra), número con el que se identifica, el municipio del que forma parte (Siempre será una sola palabra) y la clasificación IRCA.

Una vez leídos los datos:

- Indicar el nivel de riesgo de cada cuerpo de agua y su respectivo nombre.
- Indicar cuántos cuerpos de agua no requieren la acción de la ALCALDIA.
- Indicar la calificación IRCA de los cuerpos de agua que tienen un nivel de riesgo SIN RIESGO separados por espacio, en caso de no haber ninguno devolver NA.
- Indicar la clasificación IRCA promedio entre de todos los cuerpos de agua ingresados.

En cuanto al diseño del programa se debe realizar lo siguiente:

Implementar POO creando una clase llamada CuerpoDeAgua.
Implementar un método dentro de la clase CuerpoDeAgua llamado nivel que calcule el nivel de riesgo de un cuerpo de agua de acuerdo con los valores de la instancia. 

Ejemplo:
| Entrada esperada | Id_cuerpo_agua | Municipio | IRCA |
| --- | --- | --- | --- |
| Cuenca	| 2 | Puerto-Colombia | 14 |
| Guajaro	| 3 | Sabanalarga | 4 |

Cuerpo de agua 1:
Nivel de riesgo de cada cuerpo de agua y su respectivo nombre: BAJO Cuenca

Cuerpo de agua 2:
Nivel de riesgo de cada cuerpo de agua y su respectivo nombre: SIN RIESGO Guajaro

Número de cuerpos de agua que no requieren la acción de la ALCALDIA: 2

Calificación IRCA de los cuerpos de agua que tienen un nivel de riesgo SIN RIESGO:  4

Clasificación IRCA promedio entre de todos los cuerpos de agua ingresados: 9

Formato entrada y salida esperada:
| Entrada esperada | Salida esperada |
| --- | --- |
| 2	| BAJO Cuenca |
| Cuenca 2 Puerto-Colombia 14	| SIN RIESGO Guajaro |
| Guajaro 3 Sabanalarga 4 | 2.00 |
|  | 4.00 |
|  | 9.00 |
