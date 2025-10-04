# 🚗 Trabajo Práctico: Simulador de Precios de Vehículos y Accesorios

## 📖 Introducción
El presente trabajo práctico tiene como objetivo desarrollar un **sistema de simulación de precios de vehículos** en función de sus características y accesorios adicionales.  
Se aplican los principios de **Programación Orientada a Objetos en Java**, con especial énfasis en:
- **Interfaces y polimorfismo**
- **Herencia y clases abstractas**
- **Estrategias de cálculo (Patrón Strategy)**
- **Colecciones (HashSet)**
- **Pruebas unitarias con JUnit 4**

---

## 🎯 Objetivos
- Modelar vehículos y sus accesorios utilizando abstracción e interfaces.
- Implementar **estrategias de cálculo de precios finales** (con y sin descuento).
- Aplicar conceptos de **polimorfismo** al calcular costos de diferentes accesorios.
- Validar la funcionalidad mediante **tests unitarios**.

---

## 🛠️ Herramientas utilizadas
- **Lenguaje**: Java 8+
- **Entorno**: Eclipse IDE
- **Testing**: JUnit 4

---

## 📂 Estructura del proyecto

### Dominio (`ar.edu.unlam.pb2.dominio`)
- **Vehículo (abstracta)**  
  Clase base con atributos comunes:
  - Precio base
  - Cantidad de puertas
  - Velocidad máxima
  - Superficie
  - Accesorios instalados (`HashSet<Accesorio>`)

  Métodos destacados:
  - `esDeportivo()`: determina si el vehículo es deportivo (2 puertas y velocidad ≥ 160).  
  - `esVeloz()`: determina si es veloz (velocidad ≥ 140).  
  - `precioFinalConAccesorios()`: suma el costo de los accesorios instalados.

- **Auto**  
  Implementa `Vehiculo`. Se inicializa con sus datos y hereda toda la lógica.

- **Accesorio (interfaz)**  
  Contrato para todos los accesorios que deben implementar `calcularCosto(Vehiculo)`.

- **Accesorios concretos**:
  - `LevantaVidrios`: costo proporcional a la cantidad de puertas.  
  - `Estereo`: costo según parlantes + instalación.  
  - `Alarma`: costo fijo con recargo en vehículos veloces.  
  - `Nitro`: incrementa el precio base y aumenta la velocidad máxima.  
  - `Pulido`: costo según superficie y velocidad, con tope máximo.  

- **EstrategiaPrecioFinal (interfaz)**  
  Define el cálculo del precio final de un vehículo.

- **Estrategias concretas**:
  - `PrecioFinal`: precio base + accesorios.  
  - `PrecioFinalConDescuentoImporte`: aplica un descuento fijo de $200.000.  
  - `PrecioFinalConDescuentoPorcentaje`: aplica un 10% de descuento sobre el total.

---

## ✅ Pruebas Unitarias (`ar.edu.unlam.pb2.test`)

1. **VehiculoTest**  
   - Validación de creación de vehículos.  
   - Comprobación de condiciones `esVeloz` y `esDeportivo`.

2. **AccesoriosTest**  
   - Cálculo de costos de cada accesorio.  
   - Verificación de límites en el pulido.  
   - Prueba del nitro y cambio en la velocidad máxima.  

3. **DiferentesTiposDePreciosFinalTest**  
   - Cálculo del precio final sin descuentos.  
   - Cálculo con descuento del 10%.  
   - Cálculo con descuento fijo de $200.000.  

---

## ⚙️ Ejemplo de funcionamiento

1. Crear un auto:
```java
Auto auto = new Auto(5000000, 4, 170.0, 5);
```

2. Agregar accesorios:
```java
auto.agregarAccesorio(new Estereo(15000, 20000));
auto.agregarAccesorio(new LevantaVidrios(30000));
auto.agregarAccesorio(new Pulido(100000.0));
```

3. Calcular precio final:
```java
EstrategiaPrecioFinal estrategia = new PrecioFinalConDescuentoPorcentaje();
Double total = estrategia.calcular(auto);
System.out.println("Precio final con descuento: " + total);
```

---

## 📌 Conclusión

El sistema permite simular con precisión el precio final de un vehículo teniendo en cuenta:
- **Sus características base.**
- **Los accesorios instalados.**
- **La estrategia de cálculo aplicada (sin descuento, con descuento fijo o con porcentaje).**

Este trabajo práctico refuerza el uso de interfaces, polimorfismo, colecciones y pruebas unitarias.
Brindando un ejemplo claro de cómo aplicar patrones de diseño y buenas prácticas en Java.
