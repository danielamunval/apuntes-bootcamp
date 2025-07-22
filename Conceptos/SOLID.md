# Principios SOLID en Programación

## Definición

Los **principios SOLID** son cinco principios de diseño de software orientado a objetos que fueron introducidos por Robert C. Martin (Uncle Bob). Estos principios tienen como objetivo hacer que el software sea más comprensible, flexible y mantenible.

SOLID es un acrónimo que representa:

- **S** - Single Responsibility Principle (Principio de Responsabilidad Única)
- **O** - Open/Closed Principle (Principio Abierto/Cerrado)
- **L** - Liskov Substitution Principle (Principio de Sustitución de Liskov)
- **I** - Interface Segregation Principle (Principio de Segregación de Interfaces)
- **D** - Dependency Inversion Principle (Principio de Inversión de Dependencias)

## 1. Single Responsibility Principle (SRP)

**Definición:** Una clase debe tener una sola razón para cambiar, es decir, debe tener una única responsabilidad.

### Ejemplo Incorrecto:
```python
class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
    
    def guardar_en_db(self):
        # Lógica para guardar en base de datos
        pass
    
    def enviar_email(self):
        # Lógica para enviar email
        pass
    
    def validar_email(self):
        # Lógica para validar email
        pass
```

### Ejemplo Correcto:
```python
class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email

class RepositorioUsuario:
    def guardar(self, usuario):
        # Lógica para guardar en base de datos
        pass

class ServicioEmail:
    def enviar(self, email, mensaje):
        # Lógica para enviar email
        pass

class ValidadorEmail:
    def validar(self, email):
        # Lógica para validar email
        pass
```

## 2. Open/Closed Principle (OCP)

**Definición:** Las entidades de software deben estar abiertas para extensión pero cerradas para modificación.

### Ejemplo Incorrecto:
```python
class CalculadorDescuento:
    def calcular(self, tipo_cliente, precio):
        if tipo_cliente == "regular":
            return precio
        elif tipo_cliente == "premium":
            return precio * 0.9
        elif tipo_cliente == "vip":
            return precio * 0.8
```

### Ejemplo Correcto:
```python
from abc import ABC, abstractmethod

class EstrategiaDescuento(ABC):
    @abstractmethod
    def calcular(self, precio):
        pass

class DescuentoRegular(EstrategiaDescuento):
    def calcular(self, precio):
        return precio

class DescuentoPremium(EstrategiaDescuento):
    def calcular(self, precio):
        return precio * 0.9

class DescuentoVIP(EstrategiaDescuento):
    def calcular(self, precio):
        return precio * 0.8

class CalculadorDescuento:
    def __init__(self, estrategia):
        self.estrategia = estrategia
    
    def calcular(self, precio):
        return self.estrategia.calcular(precio)
```

## 3. Liskov Substitution Principle (LSP)

**Definición:** Los objetos de una clase derivada deben poder reemplazar objetos de la clase base sin alterar el correcto funcionamiento del programa.

### Ejemplo Incorrecto:
```python
class Ave:
    def volar(self):
        return "Volando"

class Pinguino(Ave):
    def volar(self):
        raise Exception("Los pingüinos no pueden volar")
```

### Ejemplo Correcto:
```python
from abc import ABC, abstractmethod

class Ave(ABC):
    @abstractmethod
    def moverse(self):
        pass

class AveVoladora(Ave):
    def moverse(self):
        return "Volando"
    
    def volar(self):
        return "Volando"

class AveNadadora(Ave):
    def moverse(self):
        return "Nadando"
    
    def nadar(self):
        return "Nadando"

class Aguila(AveVoladora):
    pass

class Pinguino(AveNadadora):
    pass
```

## 4. Interface Segregation Principle (ISP)

**Definición:** Los clientes no deben ser forzados a depender de interfaces que no utilizan.

### Ejemplo Incorrecto:
```python
from abc import ABC, abstractmethod

class Trabajador(ABC):
    @abstractmethod
    def trabajar(self):
        pass
    
    @abstractmethod
    def comer(self):
        pass
    
    @abstractmethod
    def dormir(self):
        pass

class TrabajadorHumano(Trabajador):
    def trabajar(self):
        return "Trabajando"
    
    def comer(self):
        return "Comiendo"
    
    def dormir(self):
        return "Durmiendo"

class Robot(Trabajador):
    def trabajar(self):
        return "Trabajando"
    
    def comer(self):
        # Los robots no comen
        raise NotImplementedError
    
    def dormir(self):
        # Los robots no duermen
        raise NotImplementedError
```

### Ejemplo Correcto:
```python
from abc import ABC, abstractmethod

class Trabajable(ABC):
    @abstractmethod
    def trabajar(self):
        pass

class Comible(ABC):
    @abstractmethod
    def comer(self):
        pass

class Durmiente(ABC):
    @abstractmethod
    def dormir(self):
        pass

class TrabajadorHumano(Trabajable, Comible, Durmiente):
    def trabajar(self):
        return "Trabajando"
    
    def comer(self):
        return "Comiendo"
    
    def dormir(self):
        return "Durmiendo"

class Robot(Trabajable):
    def trabajar(self):
        return "Trabajando"
```

## 5. Dependency Inversion Principle (DIP)

**Definición:** Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

### Ejemplo Incorrecto:
```python
class BaseDatosMySQL:
    def guardar(self, datos):
        # Lógica específica de MySQL
        pass

class ServicioUsuario:
    def __init__(self):
        self.bd = BaseDatosMySQL()  # Dependencia directa
    
    def crear_usuario(self, datos):
        # Lógica de negocio
        self.bd.guardar(datos)
```

### Ejemplo Correcto:
```python
from abc import ABC, abstractmethod

class RepositorioDatos(ABC):
    @abstractmethod
    def guardar(self, datos):
        pass

class BaseDatosMySQL(RepositorioDatos):
    def guardar(self, datos):
        # Lógica específica de MySQL
        pass

class BaseDatosPostgreSQL(RepositorioDatos):
    def guardar(self, datos):
        # Lógica específica de PostgreSQL
        pass

class ServicioUsuario:
    def __init__(self, repositorio: RepositorioDatos):
        self.repositorio = repositorio  # Dependencia de abstracción
    
    def crear_usuario(self, datos):
        # Lógica de negocio
        self.repositorio.guardar(datos)

# Uso
repositorio = BaseDatosMySQL()
servicio = ServicioUsuario(repositorio)
```

## Beneficios de los Principios SOLID

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

## Conclusión

Los principios SOLID son fundamentales para crear software de calidad. Aunque pueden parecer complejos al principio, su aplicación consistente resulta en código más robusto, mantenible y escalable. Es importante recordar que estos principios son guías, no reglas absolutas, y deben aplicarse con criterio según el contexto específico del proyecto.