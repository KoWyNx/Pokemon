package fr.pokemon.Models;

public class Pokemon {
    public String namePokemon;
    public int lp;
    private int maxPower;
    private int minPower;
    public boolean dead;
    public String attackName;
    public String typeBetter;
    public  String typeWeaker;

    public Pokemon(String namePokemon, int lp, int maxPower, int minPower, boolean dead, String attackName, String typeBetter, String typeWeaker) {
        this.namePokemon = namePokemon;
        this.lp = lp;
        this.maxPower = maxPower;
        this.minPower = minPower;
        this.dead = dead;
        this.attackName = attackName;
        this.typeBetter = typeBetter;
        this.typeWeaker = typeWeaker;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getTypeBetter() {
        return typeBetter;
    }

    public void setTypeBetter(String typeBetter) {
        this.typeBetter = typeBetter;
    }

    public String getTypeWeaker() {
        return typeWeaker;
    }

    public void setTypeWeaker(String typeWeaker) {
        this.typeWeaker = typeWeaker;
    }
}
