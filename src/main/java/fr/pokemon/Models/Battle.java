package fr.pokemon.Models;

public class Battle {
    public int currentRound;
    public boolean endGame;
    public boolean next;
    Pokemon rivalPokemon;
    public int maxDresseur;
    Pokeball listPokeball;

    public Battle(int currentRound, boolean next, Pokemon rivalPokemon, int maxDresseur, Pokeball listPokeball) {
        this.currentRound = currentRound;
        this.endGame = false;
        this.next = next;
        this.rivalPokemon = rivalPokemon;
        this.maxDresseur = maxDresseur;
        this.listPokeball = listPokeball;
    }

    /**
     * On récupère le tour actuel
     * @return : tour actuel
     */
    public int getCurrentRound() {
        return currentRound;
    }

    /**
     * On met à jour le nombre de tour
     * @param currentRound
     */
    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    /**
     * On retourne un boolean pour savoir si la game est finie
     * @return
     */
    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public Pokemon getRivalPokemon() {
        return rivalPokemon;
    }

    public void setRivalPokemon(Pokemon rivalPokemon) {
        this.rivalPokemon = rivalPokemon;
    }

    public int getMaxDresseur() {
        return maxDresseur;
    }

    public void setMaxDresseur(int maxDresseur) {
        this.maxDresseur = maxDresseur;
    }

    /**
     * On vérifie si la partie est bien commencée, si c'est le cas, on passe isReady à true
     * @param isReady
     * @return : true si la game peut commencer
     */
    public boolean isStartedBattle(boolean isReady){
        if(isReady){
            return true;
        }
        return false;
    }

    public int getCurrentRound(int currentRound){
        return currentRound;
    }

    /**
     * On récupère une liste de pokemon, si cette liste est vide, la game est finie
     * @param listPokeball
     * @return : true si la game est finie
     */
    public boolean isGameIsFinish(int listPokeball) {
        if (listPokeball == 0) {
            this.endGame = true;
        }
        this.endGame = false;
        return this.endGame;
    }
}
