## Tema: Soy nuevo y aprendí Java… ¿y ahora qué con HTML, CSS y JS?

**🎯 Objetivo:** Dar una primera mirada sencilla a HTML, CSS y JavaScript.

---

## 1. ¿Qué hace cada tecnología?

### 🧱 HTML (HyperText Markup Language)
Es el lenguaje que estructura el contenido de una página web. Es como el **esqueleto** de un sitio: organiza los textos, imágenes, botones, formularios, enlaces y todo lo que el usuario ve y usa.
 * Define qué elementos hay en la página (títulos, listas, párrafos, etc.).
 * Establece el orden y la jerarquía de esos elementos.
 * Permite que los navegadores entiendan cómo mostrar el contenido.

**Ejemplo:**
```html
<h1>Hola mundo</h1>
<p>Bienvenido a mi primera página web</p>
```

---

### 🎨 CSS (Cascading Style Sheets)
Es el **maquillaje** de la web. Le da estilo y diseño visual a los elementos de HTML: colores, tamaños, márgenes, tipografías, etc. Sirve para darle estilo y diseño a las páginas web. Es lo que hace que una página se vea linda, ordenada y visualmente atractiva. Sin CSS, todos los sitios web se verían planos y sin color.
 * Cambia colores, tipografías, tamaños, espaciados y alineación.
 * Permite organizar el contenido en columnas, cuadrículas o diseños responsivos.
 * Separa el contenido (HTML) del diseño, lo que facilita el mantenimiento.


**Ejemplo:**
```css
h1 {
  color: blue;
  font-size: 2em;
}
```

---

### ⚙️ JavaScript
JavaScript es el lenguaje que hace que una página web sea **interactiva y dinámica**. Permite que los elementos de la página respondan a las acciones del usuario, sin necesidad de recargarla.
 * Agrega interactividad: botones que hacen cosas, menús desplegables, sliders, etc.
 * Permite validar formularios antes de enviarlos.
 * Actualiza el contenido de la página en tiempo real.
 * Se comunica con servidores para cargar datos sin recargar la página (por ejemplo, usando Fetch o AJAX).


**Ejemplo:**
```javascript
alert("¡Hola desde JavaScript!");
```

---

## 2. ¿Java y JavaScript son lo mismo?

### ❌ **No, son diferentes**, pero tienen algunas similitudes.

| Característica         | Java                             | JavaScript                        |
|------------------------|----------------------------------|-----------------------------------|
| Lenguaje               | Compilado                        | Interpretado en el navegador      |
| Entorno principal      | Aplicaciones backend, móviles    | Web (frontend)                    |
| Sintaxis               | Similar en estructuras básicas   | Similar pero más flexible         |
| Tipado                 | Estático (tipo fijo)             | Dinámico (el tipo puede variar)   |
| Ejemplo de uso         | Crear una app Android            | Crear una página web interactiva  |

---

## 3. 📝 README - Primera mirada a HTML, CSS y JavaScript

# 🌐 Mi primer vistazo a tecnologías web

Este mini resumen explica qué hacen HTML, CSS y JavaScript:

- **HTML** estructura la información: lo que ves como títulos, párrafos o formularios.
Ejemplo:

```html
  <h1>Bienvenida a mi sitio web</h1>
  <p>Este es un párrafo explicando de qué trata la página.</p>

- **CSS** decora esa información: cambia colores, fuentes, márgenes y distribuciones.
Ejemplo:

<style>
  h1 {
    color: purple;
    font-family: Arial, sans-serif;
  }
</style>


- **JavaScript** permite que todo sea interactivo: botones que reaccionan, formularios que validan datos, etc.
Ejemplo: 
<button onclick="alert('¡Hola, Mundo!')">Haz clic aquí</button>


### Mini ejemplo completo:
✅ Este ejemplo de código crea una pequeña página con un título, un fondo gris y un botón que lanza un mensaje al hacer clic.

```html
<!DOCTYPE html>
<html>
<head>
  <title>Mi primera web</title>
  <style>
    body { font-family: Arial; background: #f0f0f0; }
    h1 { color: darkgreen; }
  </style>
</head>
<body>
  <h1>¡Hola mundo!</h1>
  <button onclick="alert('Gracias por visitarme')">Haz clic</button>
</body>
</html>
```

