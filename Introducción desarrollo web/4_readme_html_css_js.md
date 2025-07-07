## Tema: Soy nuevo y aprendí Java… ¿y ahora qué con HTML, CSS y JS?

**🎯 Objetivo:** Dar una primera mirada sencilla a HTML, CSS y JavaScript.

---

## 1. ¿Qué hace cada tecnología?

### 🧱 HTML (HyperText Markup Language)
Es el **esqueleto** de una página web. Define la estructura y el contenido: títulos, párrafos, imágenes, formularios, botones, etc.

**Ejemplo:**
```html
<h1>Hola mundo</h1>
<p>Bienvenido a mi primera página web</p>
```

---

### 🎨 CSS (Cascading Style Sheets)
Es el **maquillaje** de la web. Le da estilo y diseño visual a los elementos de HTML: colores, tamaños, márgenes, tipografías, etc.

**Ejemplo:**
```css
h1 {
  color: blue;
  font-size: 2em;
}
```

---

### ⚙️ JavaScript
Es el **cerebro** de la web. Permite agregar interactividad, dinamismo y lógica: botones que responden, validaciones, sliders, juegos, etc.

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

```markdown
# 🌐 Mi primer vistazo a tecnologías web

Este mini resumen explica qué hacen HTML, CSS y JavaScript:

- **HTML** estructura la información: lo que ves como títulos, párrafos o formularios.
- **CSS** decora esa información: cambia colores, fuentes, márgenes y distribuciones.
- **JavaScript** permite que todo sea interactivo: botones que reaccionan, formularios que validan datos, etc.

### 🧪 Mini ejemplo completo:

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

✅ Este código crea una pequeña página con un título, un fondo gris y un botón que lanza un mensaje al hacer clic.
```
