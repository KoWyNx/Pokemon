package fr.pokemon;


import fr.pokemon.Models.Pokeball;
import fr.pokemon.Models.Pokemon;
import fr.pokemon.Models.Type;

public class Main {

    public static void main(String[] args){
        Pokemon carapuce = new Pokemon(
                "carapuce",
                100,
                80,
                20,
                false,
                "normal, griffe",
                "feu",
                "test",
                "eau"
        );

        Pokemon salameche = new Pokemon(
                "salameche",
                100,
                100,
                40,
                false,
                "normal, griffe",
                "plante",
                "eau",
                "feu"
        );




        Pokeball pokeball = new Pokeball();
        Pokeball masterBall = new Pokeball(carapuce, "masterBall");
        Pokeball hyperBall = new Pokeball(salameche, "hyperbBall");



        System.out.println(carapuce);
        System.out.println(pokeball.getNamePokeball());
        System.out.println(masterBall.getNamePokeball() + " contient " + carapuce.getNamePokemon());
        System.out.println(masterBall.isPokeballEmpty());
        System.out.println(pokeball.isPokeballEmpty());


        System.out.println(salameche);
        System.out.println(hyperBall.getNamePokeball() +  " contient " + salameche.getNamePokemon());
        System.out.println(hyperBall.isPokeballEmpty());


    }




}
