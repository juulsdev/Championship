# DP Tennis - Simulador de Torneos de Tenis

Un proyecto Java que implementa un simulador de torneos de tenis utilizando múltiples patrones de diseño para demostrar conceptos avanzados de programación orientada a objetos.

## 📋 Información del Proyecto

- **Título:** DP Tennis
- **Versión:** 2.0
- **Autor:** Julia Herrera Bravo
- **Lenguaje:** Java
- **Entorno:** BlueJ

## 🚀 Cómo Ejecutar el Proyecto

1. Abre el proyecto en BlueJ
2. Ejecuta el método `main` de la clase `TennisDemo`
3. La simulación mostrará la salida completa por pantalla

### Opciones de Simulación

En la clase `InitTennisData` puedes ejecutar cualquiera de las 3 opciones disponibles:

1. **Opción 1:** Simulación estándar
2. **Opción 2:** Simulación con configuración alternativa
3. **Opción 3:** Simulación con escasez de raquetas (para demostrar manejo de excepciones)

Para cambiar entre opciones, comenta/descomenta las líneas correspondientes en `InitTennisData`. Cada opción es independiente y genera logs diferentes tanto por pantalla como por archivo.

## 🏗️ Arquitectura y Patrones de Diseño

### Patrones Implementados

- **Template Method Pattern:** Implementado en la jerarquía `TennisPlayer`
- **Singleton Pattern:** Implementado en la clase `Championship`
- **Observer Pattern:** Implementado en la jerarquía `MassMedia` para la gestión de medios de comunicación
- **Visitor Pattern:** Implementado en la jerarquía `OutputClass` para el manejo de salidas

### Características Técnicas

#### ✅ Uso de Iterator
- **Clase `TennisPlayer`:** Método `chooseShoes()` que recorre la lista de zapatillas hasta encontrar el número correspondiente al tenista
- **Clase `Championship`:** Método `assignRackets()` que recorre ambas listas para asignar raquetas a los tenistas

#### ✅ Enumeraciones (Enum)
- **`StringingStyle`:** Define dos tipos de encordado: `power` y `control`

#### ✅ Manejo de Excepciones
- **Clase `RacketException`:** Excepción personalizada para manejar la situación cuando no hay suficientes raquetas para todos los participantes
- Implementado en el método `assignRackets()` de la clase `Championship`

#### ✅ Sistema de Salida Dual
- **Salida por consola:** Usando `ConsoleOutput`
- **Salida por archivo:** Usando `FileOutput`
- Ambas mantienen el mismo formato gracias al patrón Visitor

## 📁 Estructura Principal

```
├── TennisDemo.java          # Clase principal con método main
├── Championship.java        # Gestión del torneo (Singleton)
├── TennisPlayer.java       # Jerarquía de jugadores (Template Method)
├── MassMedia.java          # Jerarquía de medios (Observer)
├── OutputClass.java        # Sistema de salida (Visitor)
├── RacketException.java    # Excepción personalizada
├── StringingStyle.java     # Enumeración de estilos de encordado
└── InitTennisData.java     # Inicialización de datos de prueba
```

## 🧪 Testing

El proyecto incluye clases de prueba para validar la funcionalidad:
- `BalancedRacketTest.java`
- `ChampionshipTest.java`
- `ControlledRacketTest.java`
- `DampedTest.java`
- `PickguardPlayerTest.java`
- `PowerfulRacketTest.java`
- `VolleyerPlayerTest.java`
- `WithGripTest.java`

## 📝 Control de Versiones

El proyecto utiliza la funcionalidad de Git proporcionada por BlueJ para el control de versiones.

## 📄 Archivos de Salida

- `Salida1.txt` - Archivo de ejemplo con la salida generada por el simulador


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
