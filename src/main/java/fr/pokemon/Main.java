package fr.pokemon;


import fr.pokemon.Models.Pokeball;
import fr.pokemon.Models.Pokemon;
import fr.pokemon.Models.Type;


public class Main {

    public static void main(String[] args) {
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

        while (carapuce.getLifePoint() > 0 && salameche.getLifePoint() > 0) {
            // Tour de Carapuce
            salameche.setLifePoint(salameche.getLifePoint() - carapuce.getMaxPower());
            System.out.println(carapuce.getNamePokemon() + " attaque " + carapuce.getAttackName());

            // Vérifier si Salamèche a été vaincu
            if (salameche.getLifePoint() <= 0) {
                System.out.println(carapuce.getNamePokemon() + " a vaincu " + salameche.getNamePokemon());
                break;
            }

            System.out.println("Il reste : " + salameche.getLifePoint() + " pv à " + salameche.getNamePokemon());



            // Tour de Salamèche
            carapuce.setLifePoint(carapuce.getLifePoint() - salameche.getMinPower());
            System.out.println(salameche.getNamePokemon() + " attaque " + salameche.getAttackName());

            // Vérifier si Carapuce a été vaincu
            if (carapuce.getLifePoint() <= 0) {
                System.out.println(salameche.getNamePokemon() + " a vaincu " + carapuce.getNamePokemon());
                break;
            }

            System.out.println("Il reste : " + carapuce.getLifePoint() + " pv à " + carapuce.getNamePokemon());

        }
    }
}

