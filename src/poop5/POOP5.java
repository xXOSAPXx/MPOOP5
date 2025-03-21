/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

import Pokemon.Pokemon;
import Pokebola.Pokebola;
import Circulo.Circulo;

/**
 *
 * @author Galba
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(2f);
        System.out.println("Perimetro " + circulo1.calcularPerimetro() + " Area " + circulo1.calcularArea() );
        circulo1.setRadio(10f);
        System.out.println("Perimetro " + circulo1.calcularPerimetro() + " Area " + circulo1.calcularArea() );
        circulo1.setRadio(-33f);
        System.out.println("Perimetro " + circulo1.calcularPerimetro() + " Area " + circulo1.calcularArea() );
        
        
       float a = 3.5f;
       float b = (float) 3.5;
       
       Pokemon pokemon1 = new Pokemon();
       pokemon1.setDificultad(55f);
       pokemon1.setAtaque(100f);
       pokemon1.setDefensa(100f);
       pokemon1.setAtaqueEspecial(100f);
       pokemon1.setDefensaEspecial(100f);
       pokemon1.setVida(100f);
       pokemon1.setNombre("Chorizard");
       
       Pokebola pokebola1 = new Pokebola ();
       pokebola1.setRatioCaptura(65);
       pokebola1.setTipo("Master");
       pokebola1.setPokemon(pokemon1);
       
        System.out.println("Se lanzo la pokebola " + pokebola1.getTipo() + " al pokemon " + pokemon1.getNombre());
        pokebola1.atraparPokemon(pokemon1);
       
       
    }
    
}
