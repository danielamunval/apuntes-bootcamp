// Ejercicio 1: Variables y Operadores
// Crea variables para almacenar tu nombre, edad y si eres estudiante
// Luego crea un mensaje que las utilice todas

let nombre = "Daniela";
let edad = 29;
let esEstudiante = true;

console.log("Hola, mi nombre es "+ nombre + ", mi edad es " + edad + " años, y estudio actualmente: " + esEstudiante);


// Ejercicio 2: Condicionales
// Crea una función que determine si un número es par o impar
// y retorne un mensaje apropiado

let numero = 15;

function esParOImpar() {
    if (numero % 2 === 0){
        return `El número es Par`;
    } else {
        return `El número es Impar`;
    }
}
console.log(esParOImpar());

//otra forma de plantearlo, no se declara la variable antes
function condicionales(numero){
    if(numero % 2 === 0){
        return `El número ${numero} es par`
    }
    else{
        return `El número ${numero} es impar`
    }
}
console.log(condicionales(5));


// Ejercicio 3: Bucles
// Crea un bucle que imprima los números del 1 al 10
// pero que salte el número 7

for (let i = 1; i <= 10; i++) {
    if (i !== 7) {
        console.log(i);
    } 
}

//otra forma de solucionarlo
for (let i = 1; i <= 10; i++) {
    if (i === 7) continue; // continue se salta la interacción
        console.log(i);
}


// Ejercicio 4: Arrays
// Crea un array con 5 nombres
// Filtra solo los nombres que tengan más de 4 letras
// Convierte cada nombre a mayúsculas
const nombres = ["Carolina", "Daniela", "Maria", "Luis", "Jose"];
const nombresLargos = nombres.filter(nombre => nombre.length > 4);
const nombreMayuscula = nombresLargos.map(nombre => nombre.toUpperCase());
console.log("Nombres en Mayúscula: ", nombreMayuscula);

//el ejercicio realizado en clase abajo:
const nombres1 = ["cosme", "fulanito", "pepito", "socorro", "juanito"];
const nombreFiltrado = nombres1.filter(nombre => nombre.length > 4);
const nombresEnMayuscula = nombreFiltrado.map(nombre => nombre.toUpperCase());
console.log(nombresEnMayuscula);


// Ejercicio 5: Objetos
// Crea un objeto "libro" con título, autor, páginas y leído (boolean)
// Crea un método que cambie el estado de "leído"

const libro = {
    título: "Título1",
    autor: "Autor1",
    paginas: 100,
    leido: false,

    cambioEstado: function(){
        this.leido = true;
        return `El libro ${this.título} está leído: ${this.leido}`;
    }
} 
console.log("El libro está leido: ", libro.leido); //estado inicial
console.log(libro.cambioEstado()); //estado modificado







console.log();