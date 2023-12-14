package fr.pokemon.Models;

public class Arene {
    public String name;
    public int nombreDeDresseurs;
    public boolean ready;

    /**
     * Constructeur vide qui instancie le nom de l'arene et le nombre de dresseurs
     */
    public Arene(){
        this.name = "La street";
        this.nombreDeDresseurs = 2;
    }

    /**
     * Constructeur qui prend un nom et un nombre de dresseurs
     * @param name
     * @param nombreDeDresseurs
     */
    public Arene(String name, int nombreDeDresseurs){
        this.name = name;
        this.nombreDeDresseurs = nombreDeDresseurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNombreDeDresseurs() {
        return nombreDeDresseurs;
    }

    public void setNombreDeDresseurs(int nombreDeDresseurs) {
        this.nombreDeDresseurs = nombreDeDresseurs;
    }

    /**
     * Renvoie true si les combattants sont chauds patate
     * @return
     */
    public boolean isReady(){
        return true;
    }

    /**
     * Récupère l'information si la battle est finie, si c'est le cas, on passe à la suivante
     * @param battle
     * @return
     */
    public boolean nextBattle(Battle battle){
        if(battle.isEndGame() == true) {
            return true;
        }
        return false;
    }
}
