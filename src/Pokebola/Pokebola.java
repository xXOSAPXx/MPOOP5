/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokebola;

import java.util.Random;
import Pokemon.Pokemon;

/**
 * Representa una Pokebola utilizada para capturar Pokémon. 
 * La clase incluye atributos como el tipo de Pokebola, el ratio de captura 
 * y el Pokémon capturado, además de métodos para establecer, obtener y realizar
 * la acción de atrapar un Pokémon.
 * 
 * @author Galba
 */
public class Pokebola {
    /**
     * Tipo de Pokebola (e.g., Superball, Ultraball, Masterball).
     */
    private String tipo;

    /**
     * Ratio de captura que determina la probabilidad de atrapar un Pokémon.
     */
    private float ratioCaptura;

    /**
     * Pokémon capturado por la Pokebola.
     */
    private Pokemon pokemon;

    /**
     * Constructor por defecto que inicializa una Pokebola sin atributos definidos.
     */
    public Pokebola() {
    }

    /**
     * Constructor que inicializa una Pokebola con sus atributos.
     *
     * @param tipo         El tipo de Pokebola.
     * @param ratioCaptura El ratio de captura (probabilidad de éxito).
     * @param pokemon      El Pokémon capturado.
     */
    public Pokebola(String tipo, float ratioCaptura, Pokemon pokemon) {
        this.tipo = tipo;
        this.ratioCaptura = ratioCaptura;
        this.pokemon = pokemon;
    }

    /**
     * Obtiene el tipo de Pokebola.
     *
     * @return El tipo de Pokebola.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Modifica el tipo de Pokebola.
     *
     * @param tipo El nuevo tipo de Pokebola.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el ratio de captura de la Pokebola.
     *
     * @return El ratio de captura.
     */
    public float getRatioCaptura() {
        return ratioCaptura;
    }

    /**
     * Modifica el ratio de captura de la Pokebola.
     *
     * @param ratioCaptura El nuevo ratio de captura.
     */
    public void setRatioCaptura(float ratioCaptura) {
        this.ratioCaptura = ratioCaptura;
    }

    /**
     * Obtiene el Pokémon capturado por la Pokebola.
     *
     * @return El Pokémon capturado.
     */
    public Pokemon getPokemon() {
        return pokemon;
    }

    /**
     * Modifica el Pokémon capturado por la Pokebola.
     *
     * @param pokemon El nuevo Pokémon capturado.
     */
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Intenta atrapar un Pokémon. 
     * Genera un número aleatorio basado en la dificultad del Pokémon
     * y compara este valor con el ratio de captura para determinar 
     * si la captura fue exitosa.
     *
     * @param pokemon El Pokémon que se intenta capturar.
     */
    public void atraparPokemon(Pokemon pokemon) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt((int) pokemon.getDificultad()); // Convertir float a int
        System.out.println(numeroAleatorio);
        if (numeroAleatorio <= ratioCaptura) {
            this.pokemon = pokemon;
            System.out.println("Se atrapó a " + pokemon.getNombre());
        } else {
            System.out.println("No se atrapó al Pokémon");
        }
    }
}
