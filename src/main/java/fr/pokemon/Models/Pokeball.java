package fr.pokemon.Models;

public class Pokeball {

    public Pokemon pokemonInPokeball;

    /**
     * On récupère le pokemon qui est dans la pokeball
     * @param pokemonInPokeball
     */
    public Pokeball(Pokemon pokemonInPokeball) {
        this.pokemonInPokeball = pokemonInPokeball;
    }

    /**
     * On permet de créer des pokeballs vides
     */
    public Pokeball(){}

    /**
     * On vient vérifier si un pokemon est ajouté dans la pokeball, si oui, return true, sinon false
     * @return : si la pokeball est vide
     */
    public boolean isPokeballEmpty(){
        if(this.pokemonInPokeball == null) {
            return true;
        }
        return false;
    }
}
