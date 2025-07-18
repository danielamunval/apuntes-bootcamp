// ** JAVASCRIPT **//

//Mostrar mensaje por consola, similar a un print
console.log("INICIANDO JAVASCRIPT")

//Esto es un comentario.

// ** VARIABLES Y TIPOS DE DATOS **
// Variable -> "cajita" que almacena información.

/* Reglas importantes: OJO 
    const = caja sellada (no puede cambiar, viene de constante)
    let = caja normal (puede cambiar)
    var = caja vieja (ya no se usa) */

    //Const
    const nombre = "Alumno1"; //No es necesario explicar y declarar la variable, ya que la identifica sin necesidad de poner "String".
    const nombre2 = "Alumno1" //acá la linea se leerá igual en caso de que no se registre el ; , sin embargo, es una buena práctica agregarlo siempre.
    const edad = 25; //Acá se identifica como número - number, ya que no tiene ""; en caso de que tenga, se identifica como texto, o variable String.
    const esDeveloper = true; //Acá identifica valor boolean.
    const ciudad = null; //null - vacío.
    let telefono;  // en este caso, es una variable "undefined", no tiene valor.

    console.log(nombre)
    console.log(nombre2)

    var antiguoNoUsar = "no usar" // NO SE USA PORQUE CAUSA BUG EXTRAÑOS.

    console.log("***** VARIABLE *****")
    console.log("Nombre: ", nombre, "- Tipo: ", typeof nombre);
    console.log("Edad: ", edad, "- Tipo: ", typeof edad);
    console.log("Eres develeloper: ", esDeveloper, "- Tipo: ", typeof esDeveloper);
    
    //Operadores básicos.
    let suma = 5 + 3; // Suma
    let resta = 10 - 4; // Resta 
    let multiplicacion = 6 * 7 // Multiplicación
    let division = 15 / 3; // División
    let modulo = 10 % 3; // módulo o resto

    console.log("Suma: ", suma);
    console.log("Resta: ", resta);
    console.warn("Multiplicación: ", multiplicacion); 
    console.info("División: ", division); //.warn y .info son otras formas de registrar que algo se imprima, sin embargo; no se utilizan, generalmente se usa .log --- .warn debería usarse en un "posible error", y .info debería usarse en "entrega de información. Sin embargo, comúnmente no se usan".

    //Concatenación
    let saludo = "Hola" + nombre;
    let saludoClase = `Hola ${nombre}, estamos aprendiendo JS` +
                    `Hola ${nombre}, estamos aprendiendo JS`; //acá no se imprimirá nada porque no está escrito el console.log

    console.log(saludo);
    console.log(saludoClase);

    /* `` --> son Backticks, alt + 96
    - permite escribir múltiples líneas de código
    - con ellas es más fácil concatenar, se debe concatenar con + si o si, si se agrega coma arrojará error.
    - permite incluir variables. */

    // ***** NUEVA REGLA MUY IMPORTANTE ***** //
    /* 
    En JS hay dos formas de realizar comparaciones: 
    1. == (débil): convierte típicos automáticamente (MUY PELIGROSO)
    2. === (estricta): compara valor y tipo */

    console.log("\n** COMPARACIONES **")

    console.log("5 === 5: ", 5 === 5); // true - el mismo número.
    console.log("5 === '5'", 5 === "5"); // false - se está comparando un número vs un texto.
    console.log("5 !== '5'", 5 !== "5") // true, porque son distintos.
    console.log("5 == '5'", 5 == "5") // da como resultado true, que el número 5 es igual al 5 texto. Por lo tanto no corresponde y es peligroso hacer comparaciones con ==, ya que no se compara el tipo de variable.

    console.log("5 === '5'", 5 === "5"); // debería imprimir true
    console.log("0 == false", 0 == false); // debería imprimir true
    console.log("[] == false", [] == false); // debería imprimir true
    console.log("0 == []", 0 == []); // debería imprimir true
    console.log("'0' == []", "0" == []) // debería imprimir false


    // CONDICIONALES

    // Condicional simple
    let edades1 = 20;

    if (edades1 > 18) {
        console.log("Es mayor de edad");
    } else {
        console.log("Es menor de edad");
    }
    
    // else if
    let edades2 = 65;
     if (edades2 > 18 && edades2 < 65) { // operador lógico && and - ambas deben cumplirse).
        console.log("Es mayor de edad");
    } else if (edades2 >= 65){
        console.log("Adulto mayor");
    } else {
        console.log("Es menor de edad");
    }
    
    // operador ternario
    let edad1 = 10;
    let categoria = edad1 >= 18 ? "Adulto": "Menor";
    console.log(categoria);

    // ** SWITCH **
    // Switch es útil en muchas opciones.
    let nombres = "ana"
    switch(nombre){
        case "Ana": 
            console.log("Hola Ana");
            break;
        case "Carlos":
            console.log("Hola Carlos")
            break;
        default: 
            console.log("Nombre no encontrado.")        

    }

    // **** BUCLES **** 
    console.log("Bucles clásicos: ")

    // FOR
    for (let i = 1; i < 3; i++){
        console.log(`Iteracion ${i}`);
    }

    // WHILE
    let contador = 0;

    while (contador < 3) {
        console.log(`Contador: ${contador}`);
        contador++ // MUY IMPORTANTE, SIN ESTO EL BUCLE SERÁ INFINITO. SIEMPRE SE DEBE INCREMENTAR EL CONTADOR O EL BUCLE NUNCA TERMINARÁ.
    }
   
    // ***** ARRAY *****

    // Crear Array

    const frutas = ["manzana", "naranja"];
    const numero = [1, 2, 3, 4];
    const mixto = ["Texto", 42, true, null]; // Puede tener diferentes tipos 

    console.log("Frutas: ", frutas);
    console.log("Primer número: ", numero[0]); // no olvidar que los arrays empiezan desde el índice 0.
    console.log("Último elemento: ", frutas[frutas.length -1]); //imprime el último valor del arreglo.
    console.log("Longitud: ", frutas.length);

    // Métodos simples para modificar arrays.

    frutas.push("uva"); // Agrega elemento al final.
    frutas.unshift("kiwi"); // Agrega elemento al inicio.
    frutas.pop(); // Remueve el último elemento del array.
    frutas.shift(); // Remueve el elemento del inicio del array.

    console.log("Frutas modificadas: ", frutas); // Si se ejecuta con todas las condiciones en estricto rigor no debería haber modificaciones.


    // FOR para recorrer elementos: FOR EACH
    console.log("Recorriendo Frutas: ");
    for (const fruta of frutas) {
        console.log(`- ${fruta}`);
    }

    const fruta1 = ["manzana", "naranja"];
    fruta1.forEach(fruta => console.log(fruta));

    // Filtro con largo de elemento.
    const tecnologias = ["HTML", "REACT", "NODE", "JavaScript"];
    const tecnologiasC = tecnologias.filter(tech => tech.length <= 4); //imprimirá solo lo que tenga largo 4 o menos caracteres.
    console.log("Tecnologias Cortas: ", tecnologiasC);
    const tecnologiasL = tecnologias.filter(tech => tech.length > 4);
    console.log("Tecnologías largas: ", tecnologiasL);

    // MAP
    const tecnoMayus = tecnologias.map(tech => tech.toLocaleUpperCase()); // traspasa toda las variables a mayúsculas.
    console.log("Tecnologías en mayúsculas: ", tecnoMayus);

    /*
    ¿Qué hace este código?
    Convierte todos los elementos del array tecnologias a mayúsculas, y los guarda en una nueva variable llamada tecnoMayus.
    
    A. tecnologias
    - Es un array (lista) que contiene nombres de tecnologías. Ejemplo:
    - const tecnologias = ["html", "css", "javascript"];
    
    B. .map()
    - Es un método de los arrays que sirve para recorrer cada elemento y devolver un nuevo array con los resultados. No modifica el original.
    
    C. tech => tech.toLocaleUpperCase()
    - Esta es una función flecha (te explico abajo qué es). En este caso, por cada tech (elemento del array), se aplica el método:
    - toLocaleUpperCase(): convierte el texto a mayúsculas, teniendo en cuenta configuraciones locales (como acentos o ñ).
    
    Ejemplo: "html".toLocaleUpperCase(); // "HTML"
 
    Resultado en Resumen:
    Si tienes una lista en minusculas
    const tecnologias = ["html", "css", "javascript"];
    
    El resultado será:
    ["HTML", "CSS", "JAVASCRIPT"]

    */
 
    /// IMPORTANTE
    // ¿Qué significa const?
    // const define una variable constante, lo que no significa que su contenido no pueda cambiar, sino que no puedes reasignarla (no puedes darle otro valor por completo).
    
    // let — variable mutable (puede cambiar)
    // let nombre = "Ana";
    // nombre = "Carlos"; //Esto es válido
    // const — variable no reasignable
    // const edad = 30;
    // edad = 35; // Error: no puedes reasignar
    
    // Pero ojo: con arrays y objetos...
    // Aunque uses const, puedes modificar el contenido interno de arrays y objetos:
    //
    // const tecnologias = ["html", "css"];
    // tecnologias.push("js"); // Esto sí se puede
    // console.log(tecnologias); // ["html", "css", "js"]
    // Lo que no puedes hacer es esto:
    //
    // tecnologias = ["react", "vue"]; // Error
    
    // Entonces, ¿es correcto llamarla "variable"?
    // Sí, es correcto.
    // 🔹 Técnicamente, const, let y var declaran variables.
    // 🔹 El término "constante" se refiere a la restricción de reasignación, no a su naturaleza como variable.

    const tecnologias1 = ["HTML", "CSS", "REACT", "NODE", "JavaScript"];
    // REDUCE -> "reducir todo el array a un solo valor"
    const totalLetras = tecnologias1.reduce((total, tech) => total + tech.length, 0);
    console.log("Total de Letras: ", totalLetras)

    /* REDUCE suma la longitud de cada tecnología:
        - total: el acumulador (empieza en 0)
        - tech: cada elemento del array
        - total + tech.length: se convierte en la nueva suma */


    //FIND - encuentra el primer elemento que cumple una condición
    const tecnologias2 = ["HTML", "CSS", "REACT", "NODE", "JavaScript"];
    const react = tecnologias2.find(tech => tech === "");
    console.log("Encontrado: ", react);

    // OJO! JAMÁS HACER ESTO - NUNCA, es una mala práctica
    x = 10; //está mal planteada la variable, no hay uso de let o const
    console.log(x); //si bien imprimirá el valor, no está bien planteado

    //OJO!!
    const resultado = "10" - 5;
    console.log(resultado) //en este caso, si bien hay un String y un entero; se consideran ambas como entero y se ejecuta la suma, y se imprime 5.

    const resultado2 = "10" - 5 + 2 + "4" - "8";
    console.log(resultado2) //en este caso los string al lado de un + se concatenan y no se agregan, los string al lado de - son forzados a ser números. En este caso: 10 - 5 = 5 + 2 = 7 + "4" = 74 - "8" = 66 (lo cual no tiene sentido matemáticamente hablando, no hay lógica, se mezclan ambos tipos de variables).

    
    // **** OBJETOS ****
    const estudiante = {
        nombre: "Alumno1",
        edad: 23,
        tecnologias: ["JavaScript", "React", "Node"],
        activo: true,

        //Método dentro del objeto o función
        saludar: function(){
            return `Hola, soy ${this.nombre} y tengo ${this.edad} años`;
        }
    } 
    console.log(estudiante.saludar()); //esta es la forma de llamar una función dentro de un objeto. NO OLVIDAR LOS PARÉNTESIS. Para hacer válida la función se debe llamar si o si al objeto primero!!
    console.log("Nombre: ", estudiante.nombre); // en este caso, solo se llamaría la variable nombre.
    console.log("Edad: ", estudiante.edad); //esto es una notación punto.
    console.log("Edad: ", estudiante["edad"]); // esto se conoce como notación corchete.

    //ambas notaciones - punto y corchete - son válidas.

    // *** SCOPE *** información que se encuentra entre llaves.
    let x = 10 ;
    console.log(x);
    
    if (true) {
        let x = 20;
        console.log(x);
    }
    //en el caso de arriba, se imprimen ambos valores asignados para variable X ya que se consideran variables independientes y ambas válidas ya que una de ellas se encuentra dentro del scope. Se imprimen ambos valores: 10 y 20.

    let variableGlobal = "Soy Global";

    function ejemplo(){
        let variableLocal = "Soy Local";

        if (true) {
            let variableBloque = "Soy Bloque";
            console.log("Desde Bloque: ", variableGlobal);
            console.log("Desde Bloque: ", variableLocal);
            console.log("Desde Bloque: ", variableBloque);
        }
        console.log("Desde función: ", variableLocal);
    }
    ejemplo();
    // en este caso, la función se encuentra fuera, o no hay un objeto que deba llamarse previamente, por lo tanto se puede llamar la función sola sin problemas.

       
    console.log()


