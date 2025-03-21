/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

/**
 * Representa un Pokémon con estadísticas y acciones que puede realizar.
 * Esta clase incluye atributos como vida, defensa, ataque y habilidades especiales, 
 * y proporciona métodos para interactuar con estos atributos y realizar acciones de batalla.
 * 
 * @author Galba
 */
public class Pokemon {
    /**
     * Dificultad para capturar al Pokémon.
     */
    private float dificultad;

    /**
     * Puntos de vida actuales del Pokémon.
     */
    private float vida;

    /**
     * Valor de defensa del Pokémon, utilizado para reducir el daño recibido.
     */
    private float defensa;

    /**
     * Valor de ataque físico del Pokémon.
     */
    private float ataque;

    /**
     * Valor de ataque especial del Pokémon.
     */
    private float ataqueEspecial;

    /**
     * Valor de defensa especial del Pokémon, utilizado para reducir daño de habilidades especiales.
     */
    private float defensaEspecial;

    /**
     * Nombre del Pokémon.
     */
    private String nombre;

    /**
     * Constructor por defecto que inicializa un Pokémon sin valores específicos.
     */
    public Pokemon() {
    }

    /**
     * Constructor que inicializa un Pokémon con estadísticas definidas.
     *
     * @param dificultad     Dificultad para capturarlo.
     * @param vida           Puntos de vida iniciales.
     * @param defensa        Valor de defensa.
     * @param ataque         Valor de ataque físico.
     * @param ataqueEspecial Valor de ataque especial.
     * @param defensaEspecial Valor de defensa especial.
     * @param nombre         Nombre del Pokémon.
     */
    public Pokemon(float dificultad, float vida, float defensa, float ataque, float ataqueEspecial, float defensaEspecial, String nombre) {
        this.dificultad = dificultad;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.nombre = nombre;
    }

    // Getters y Setters

    /**
     * Obtiene la dificultad del Pokémon.
     *
     * @return Dificultad para capturar al Pokémon.
     */
    public float getDificultad() {
        return dificultad;
    }

    /**
     * Modifica la dificultad del Pokémon.
     *
     * @param dificultad Nueva dificultad para capturar al Pokémon.
     */
    public void setDificultad(float dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Obtiene los puntos de vida actuales del Pokémon.
     *
     * @return Puntos de vida del Pokémon.
     */
    public float getVida() {
        return vida;
    }

    /**
     * Modifica los puntos de vida del Pokémon.
     *
     * @param vida Nueva cantidad de puntos de vida.
     */
    public void setVida(float vida) {
        this.vida = vida;
    }

    /**
     * Obtiene el valor de defensa del Pokémon.
     *
     * @return Valor de defensa.
     */
    public float getDefensa() {
        return defensa;
    }

    /**
     * Modifica el valor de defensa del Pokémon.
     *
     * @param defensa Nuevo valor de defensa.
     */
    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }

    /**
     * Obtiene el valor de ataque físico del Pokémon.
     *
     * @return Valor de ataque físico.
     */
    public float getAtaque() {
        return ataque;
    }

    /**
     * Modifica el valor de ataque físico del Pokémon.
     *
     * @param ataque Nuevo valor de ataque físico.
     */
    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    /**
     * Obtiene el valor de ataque especial del Pokémon.
     *
     * @return Valor de ataque especial.
     */
    public float getAtaqueEspecial() {
        return ataqueEspecial;
    }

    /**
     * Modifica el valor de ataque especial del Pokémon.
     *
     * @param ataqueEspecial Nuevo valor de ataque especial.
     */
    public void setAtaqueEspecial(float ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * Obtiene el valor de defensa especial del Pokémon.
     *
     * @return Valor de defensa especial.
     */
    public float getDefensaEspecial() {
        return defensaEspecial;
    }

    /**
     * Modifica el valor de defensa especial del Pokémon.
     *
     * @param defensaEspecial Nuevo valor de defensa especial.
     */
    public void setDefensaEspecial(float defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    /**
     * Obtiene el nombre del Pokémon.
     *
     * @return Nombre del Pokémon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del Pokémon.
     *
     * @param nombre Nuevo nombre del Pokémon.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos adicionales

    /**
     * Realiza un ataque físico sobre otro Pokémon.
     *
     * @param objetivo El Pokémon objetivo que recibe el ataque.
     */
    public void atacar(Pokemon objetivo) {
        float daño = this.ataque - objetivo.getDefensa();
        objetivo.setVida(objetivo.getVida() - Math.max(daño, 0));
        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " y causa " + Math.max(daño, 0) + " puntos de daño.");
    }

    /**
     * Permite al Pokémon usar un objeto.
     *
     * @param objeto El objeto a usar.
     */
    public void usarObjeto(String objeto) {
        System.out.println(this.nombre + " usa " + objeto + ".");
        // Lógica adicional para el uso de objetos puede añadirse aquí.
    }

    /**
     * Permite que el Pokémon se retire de la batalla.
     */
    public void retirarse() {
        System.out.println(this.nombre + " se ha retirado de la batalla.");
    }

    /**
     * Permite que el Pokémon se cure una cantidad específica de vida.
     *
     * @param cantidad La cantidad de vida a recuperar.
     */
    public void curarse(float cantidad) {
        this.vida += cantidad;
        System.out.println(this.nombre + " se ha curado " + cantidad + " puntos de vida.");
    }

    /**
     * Activa el estado de defensa del Pokémon.
     */
    public void defender() {
        System.out.println(this.nombre + " se está defendiendo.");
        // Lógica adicional para la defensa puede añadirse aquí.
    }
}


