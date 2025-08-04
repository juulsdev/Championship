------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:DP Tennis
VERSION or DATE:2.0
HOW TO START THIS PROJECT:Ejecutar el metodo main de la Clase TennisDemo
AUTHORS:Julia Herrera Bravo


# Miembro del grupo

-Herrera Bravo,Julia

# Clases para la simulación

La simulación está preparada mediante las clases “TennisDemo”.
Unicamente hay que ejecutar para hacer una salida completa por pantalla.
En la clase InitTennisData es posible ejecutar cualquiera de las 3 opciones en el orden que se desee basta con comentar las que no 
se deseen ejecutar y descomentar la que se quiera ejecutar, ya que son pruebas independientes y crean log diferentes por pantalla y por fichero.
La 3ª opción la he creado para simular una situación donde no haya raquetas suficientes para todos los competidores.
MethodTemplate Pattern en la jerarquia TennisPlayer 
Singleton Pattern en la clase Championship
Se han creado las 3 instancias de medios de comunicación en la clase TennisDemo.

# Extras

## Uso correcto de Iterator
En la clase TennisPlayer el método chooseShoes donde recorre la lista de zapatillas hasta encontrar el mismo numero que el del tenista
En la clase Championship el método assignRackets recorre ambas listas para asignar las raquetas a los tenistas

## Uso de la funcionalidad de Git proporcionada por BlueJ

## Usar cuando sea apropiado y de forma correcta un tipo Enum
Usado para crear StringingStyle donde almacena dos tipos de valores: power y control

## Aplicación correcta de un patrón de diseño para laimplementación de la siguiente funcionalidad relacionada conmedios de comunicación
Observer Pattern en la jerarquia MassMedia que se encarga de transmitir los medios de comunicación

## En el proyecto se habrá hecho un uso correcto y justificado delmecanismo de excepciones
En la clase Championship, el método assignRackets donde arroja una excepción propia por pantalla que muestra 
el error donde, no hay suficientes raquetas para asignar a los participantes y muestra la jerarquía de excepción.La clase creada de excepción es RacketException

## Escritura de la salida por fichero con el mismo formato que elutilizado para la salida por defecto por pantalla
Visitor Pattern en la jerarquía OutputClass donde muestra los mensajes por consola y los escribe en fichero.Escritura de la salida por fichero con el mismo formato que elutilizado para la salida por defecto por pantalla.