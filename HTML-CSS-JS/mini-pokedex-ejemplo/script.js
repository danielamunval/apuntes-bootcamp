//Referencia al DOM
const contenedor = document.getElementById("pokedex");
const agregar = document.getElementById("agregar");
const quitar = document.getElementById("quitar");

let contadorPokemon = 1 // Empezamos desde la Id 1

//Función para consumir una API
async function obtenerPokemon(id) {
    const respuesta = await fetch(`https://pokeapi.co/api/v2/pokemon/${id}`);
    const datos = await respuesta.json();

    return {
        nombre: datos.name,
        imagen: datos.sprites.other["official-artwork"].front_default,
        tipo: datos.types.map(t => t.type.name).join(", "),
        experiencia: datos.base_experience
    }
}

// Función para crear cartas con BOOTSTRAP

function crearCarta(pokemon) {
    const div = document.createElement("div");
    div.classList.add("col")

    div.innerHTML = `
        <div class="card h-100 shadow-sm">
        <img src="${pokemon.imagen}" class="card-img-top" alt="poke foto">
            <div class="card-body">
                <h4 class= "card-title text-capitalize">${pokemon.nombre}</h4>
                <p class="card text"><strong>Tipo:</strong>${pokemon.tipo}</p>
                <p class="cart-text"><strong>Experiencia:</strong>${pokemon.experiencia}</p>
                </div>
        </div>
    `
    return div
        
}

agregar.addEventListener("click", async() => {
    const pokemon = await obtenerPokemon(contadorPokemon);
    const carta = crearCarta(pokemon);
    contenedor.appendChild(carta);
    contadorPokemon++;
})

quitar.addEventListener("click", async () => {
    const cartas = contenedor.querySelectorAll(".col");
    if (cartas.length > 0) {
        cartas[cartas.length - 1].remove();
        contadorPokemon--;
    }
})
