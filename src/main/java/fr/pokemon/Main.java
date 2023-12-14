package fr.pokemon;


import fr.pokemon.Models.Pokeball;
import fr.pokemon.Models.Pokemon;

public class Main {

    public static void main(String[] args){
        Pokemon pokemon = new Pokemon(
                "carapuce",
                100,
                80,
                20,
                false,
                "normal",
                "feu"
        );

        Pokeball pokeball = new Pokeball(pokemon);

        System.out.println(pokeball.isPokeballEmpty());


        System.out.println(pokemon);
    }




}
