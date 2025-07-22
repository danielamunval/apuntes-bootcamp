# Principios SOLID en Programación

## Definición

Los **principios SOLID** son cinco principios de diseño de software orientado a objetos que fueron introducidos por Robert C. Martin (Uncle Bob). Estos principios tienen como objetivo hacer que el software sea más comprensible, flexible y mantenible.

SOLID es un acrónimo que representa:

- **S** - Single Responsibility Principle (Principio de Responsabilidad Única)
- **O** - Open/Closed Principle (Principio Abierto/Cerrado)
- **L** - Liskov Substitution Principle (Principio de Sustitución de Liskov)
- **I** - Interface Segregation Principle (Principio de Segregación de Interfaces)
- **D** - Dependency Inversion Principle (Principio de Inversión de Dependencias)

## 1. 🟡 "S" = Single Responsibility Principle (SRP)

> _Una clase debe tener una única razón para cambiar._

Esto significa que una clase debe encargarse de **una sola funcionalidad** o tarea del sistema.

### ✅ Ejemplo en Java:

```java
// ❌ Mala práctica: una clase que gestiona empleados y también guarda en archivos
public class Employee {
    public void calculatePay() { /* ... */ }
    public void saveToFile() { /* ... */ } // responsabilidad extra
}

// ✅ Buena práctica: separar responsabilidades
public class Employee {
    public void calculatePay() { /* ... */ }
}

public class EmployeeFileSaver {
    public void saveToFile(Employee emp) { /* ... */ }
}
```

### ✅ Ejemplo en JavaScript:

```javascript

// ❌ Una clase hace demasiado: gestiona datos y renderiza
class User {
  constructor(name) {
    this.name = name;
  }

  saveUser() {
    // lógica para guardar en DB
  }

  renderUserCard() {
    // lógica para mostrarlo en el DOM
  }
}

// ✅ Separar responsabilidades
class User {
  constructor(name) {
    this.name = name;
  }
}

class UserService {
  saveUser(user) {
    // lógica para guardar en DB
  }
}

class UserRenderer {
  renderUserCard(user) {
    // lógica para mostrarlo en el DOM
  }
}
```

---

## 2. 🟢 "O" = Open/Closed Principle (OCP)

> _Las clases deben estar abiertas para la extensión, pero cerradas para la modificación._

Puedes **agregar nuevas funcionalidades** sin modificar el código existente.

### ✅ Ejemplo en Java:
```java
// Clase base
public abstract class Shape {
    public abstract double area();
}

// Nuevas formas pueden extender esta clase sin modificarla
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}
```

### ✅ Ejemplo en JavaScript:

```javascript
// ❌ Agregar nuevos tipos obliga a modificar la función
function getArea(shape) {
  if (shape.type === 'square') {
    return shape.size * shape.size;
  } else if (shape.type === 'circle') {
    return Math.PI * shape.radius ** 2;
  }
}

// ✅ Usamos clases y polimorfismo
class Shape {
  getArea() {
    throw new Error('Debe implementarse en la subclase');
  }
}

class Square extends Shape {
  constructor(size) {
    super();
    this.size = size;
  }
  getArea() {
    return this.size * this.size;
  }
}

class Circle extends Shape {
  constructor(radius) {
    super();
    this.radius = radius;
  }
  getArea() {
    return Math.PI * this.radius ** 2;
  }
}
```

---






## 3. 🔵 "L" = Liskov Substitution Principle (LSP)

**Definición:** Los objetos de una clase derivada (subclase) deben poder reemplazar objetos de la clase base sin alterar el correcto funcionamiento del programa.

### ✅ Ejemplo en Java:

```java
class Bird {
    public void fly() {
        System.out.println("This bird flies.");
    }
}

class Eagle extends Bird { } // ✅ ok

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly"); // ❌ rompe LSP
    }
}
```

**Solución:** Separar las clases en jerarquías coherentes.

```java
class Bird { }

class FlyingBird extends Bird {
    public void fly() { }
}

class Eagle extends FlyingBird { }

class Ostrich extends Bird { } // ✅ ahora no se espera que vuele
```

### ✅ Ejemplo en JavaScript:

```javascript
class Bird {
  fly() {
    console.log("Estoy volando!");
  }
}

// ❌ Este pato rompe el principio porque no vuela
class Duck extends Bird {}
class Penguin extends Bird {
  fly() {
    throw new Error("¡Los pingüinos no vuelan!"); // ❌
  }
}

// ✅ Solución: separar comportamientos
class Bird {}
class FlyingBird extends Bird {
  fly() {
    console.log("Estoy volando!");
  }
}

class Duck extends FlyingBird {}
class Penguin extends Bird {}
```

---

## 4. 🟠 "I" = Interface Segregation Principle (ISP)

**Definición:** > _Ninguna clase debe ser forzada a depender de métodos que no usa._

### ✅ Ejemplo en Java:

```java
// ❌ Interface con métodos innecesarios
interface Worker {
    void work();
    void eat();
}

// ✅ Separar responsabilidades
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}
```

### ✅ Ejemplo en JavaScript:

```javascript
// ❌ Forzar a una clase a tener métodos que no usa
class Worker {
  work() {}
  eat() {}
}

class Robot extends Worker {
  eat() {
    throw new Error("¡Los robots no comen!"); // ❌
  }
}

// ✅ Separar interfaces conceptualmente
class Workable {
  work() {}
}

class Eatable {
  eat() {}
}

class Human extends Workable {
  work() {}
  eat() {}
}

class Robot extends Workable {
  work() {}
}

```

---

## 5. 🔴 "D" = Dependency Inversion Principle (DIP)

**Definición:** Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

### ✅ Ejemplo en Java:

```java
// ❌ Clase de alto nivel depende de una implementación concreta
class LightBulb {
    public void turnOn() { System.out.println("On"); }
    public void turnOff() { System.out.println("Off"); }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}
```

**Solución usando una interfaz:**

```java
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() { System.out.println("On"); }
    public void turnOff() { System.out.println("Off"); }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
```

✅ Ejemplo en JavaScript:

```javascript
// ❌ Switch depende directamente de LightBulb
class LightBulb {
  turnOn() { console.log("On"); }
  turnOff() { console.log("Off"); }
}

class Switch {
  constructor(bulb) {
    this.bulb = bulb;
  }

  operate() {
    this.bulb.turnOn();
  }
}

// ✅ Usar una "abstracción" mediante interface conceptual
class Switch {
  constructor(device) {
    this.device = device;
  }

  operate() {
    this.device.turnOn();
  }
}

class Fan {
  turnOn() { console.log("Fan On"); }
  turnOff() { console.log("Fan Off"); }
}

const myFan = new Fan();
const mySwitch = new Switch(myFan);
mySwitch.operate();

```

---

## Beneficios de los Principios SOLID 💡

### Mantenibilidad
El código es más fácil de mantener y modificar sin afectar otras partes del sistema.

### Flexibilidad
Permite agregar nuevas funcionalidades con cambios mínimos en el código existente.

### Testabilidad
Facilita la creación de pruebas unitarias al reducir las dependencias entre componentes.

### Reutilización
Los componentes pueden ser reutilizados en diferentes contextos sin modificaciones.

### Legibilidad
El código es más claro y fácil de entender para otros desarrolladores.

## Conclusión 🌟

Los principios SOLID son fundamentales para crear software de calidad. Aunque pueden parecer complejos al principio, su aplicación consistente resulta en código más robusto, mantenible y escalable. Es importante recordar que estos principios son guías, no reglas absolutas, y deben aplicarse con criterio según el contexto específico del proyecto.