package fr.pokemon.Models;

import java.util.Arrays;
import java.util.List;

public class Dresseur {
    public Pokeball pokeball;
    public String name;
    public List listePokeball;


    public Dresseur(String name, List listePokeball, Pokeball pokeball){
        this.name = name;
        this.listePokeball = listePokeball;
        this.pokeball = pokeball;
    }
    public Pokeball getPokeball() {
        return pokeball;
    }

    public void setPokeball(Pokeball pokeball) {
        this.pokeball = pokeball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getListePokeball() {
        return listePokeball;
    }

    public void setListePokeball(List listePokeball) {
        this.listePokeball = listePokeball;
    }


    public String attackNamePokemon() {

        return null;
    }

    public void selectPokemon() {
    }



}
