/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo;

/**
 * Representa un círculo con métodos para calcular su área y perímetro. 
 * La clase incluye un valor constante de PI y un atributo de radio, 
 * además de métodos para establecer, obtener y calcular propiedades del círculo.
 * 
 * @author Galba
 */
public class Circulo {
    /**
     * Constante que representa el valor de PI.
     */
    final float PI = (float) Math.PI;

    /**
     * Radio del círculo.
     */
    float radio;

    /**
     * Constructor por defecto que inicializa un círculo sin un radio definido.
     */
    public Circulo() {
    }

    /**
     * Constructor que inicializa el círculo con un radio específico.
     *
     * @param radio El radio del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    /**
     * Obtiene el radio del círculo.
     *
     * @return El radio del círculo.
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Modifica el radio del círculo.
     * Si el radio proporcionado es negativo, se convierte a su valor absoluto.
     *
     * @param radio El nuevo radio del círculo.
     */
    public void setRadio(float radio) {
        this.radio = Math.abs(radio);
    }

    /**
     * Calcula el perímetro del círculo.
     *
     * @return El perímetro del círculo (2 * PI * radio).
     */
    public float calcularPerimetro() {
        return (2 * PI * radio);
    }

    /**
     * Calcula el área del círculo.
     *
     * @return El área del círculo (PI * radio^2).
     */
    public float calcularArea() {
        return (float) (PI * Math.pow(radio, 2));
    }
}
