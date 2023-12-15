package fr.pokemon.Models;

public class Pokeball {

    public Pokemon pokemonInPokeball;

    public String namePokeball;




    /**
     * On récupère le pokemon qui est dans la pokeball
     * @param pokemonInPokeball
     */
    public Pokeball(Pokemon pokemonInPokeball, String nammePokeball) {
        this.pokemonInPokeball = pokemonInPokeball;
        this.namePokeball = nammePokeball;

    }

    /**
     * On permet de créer des pokeballs vides
     */
    public Pokeball(){
        this.namePokeball = "pokeball";
    }

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

    public String getNamePokeball() {
        return namePokeball;
    }

    public void setNamePokeball(String namePokeball) {
        this.namePokeball = namePokeball;
    }

}
