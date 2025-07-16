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

    // 


    
    console.log()


