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
                "lance eau",
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
                "flamme",
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

        carapuce.setLifePoint(carapuce.getLifePoint() - salameche.getMinPower());
        System.out.println(salameche.getNamePokemon() + " attaque " + salameche.getAttackName());
        System.out.println("Il reste : " + carapuce.getLifePoint() + " pv à " + carapuce.getNamePokemon());

        salameche.setLifePoint(salameche.getLifePoint() - carapuce.getMaxPower());
        System.out.println(carapuce.getNamePokemon() + " attaque " + carapuce.getAttackName());
        System.out.println("Il reste : " + salameche.getLifePoint()+ " pv à " + salameche.getNamePokemon());


    }




}
