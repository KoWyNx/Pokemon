package fr.pokemon.Models;

public class Battle {
    public int currentRound;
    public boolean isDead;
    public boolean endGame;
    public boolean next;
    Pokemon rivalPokemon;
    public int maxDresseur;

    public Battle(int currentRound, boolean isDead, boolean endGame, boolean next, Pokemon rivalPokemon, int maxDresseur) {
        this.currentRound = currentRound;
        this.isDead = isDead;
        this.endGame = endGame;
        this.next = next;
        this.rivalPokemon = rivalPokemon;
        this.maxDresseur = maxDresseur;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

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

    public boolean isStartedBattle(boolean isReady){
        if(isReady){
            System.out.println("Le joueur est prêt");
        }
        return isReady;
    }

    public int getCurrentRound(int currentRound){
        for( int i = 0; i > 1; i++){
            this.currentRound = currentRound++;
        }
        return this.currentRound;
    }

    public boolean isGameIsFinish(boolean endGame){
        if (this.endGame){
            endGame = true;
            System.out.println("Le combat est terminé");
        }
        return endGame;
    }
}
