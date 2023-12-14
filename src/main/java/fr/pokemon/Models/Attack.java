package fr.pokemon.Models;

public interface Attack extends Type {
    /**
     * Permet de récupérer l'attaque
     * @param coefMin double - Coefficient minimum
     * @param coefMax double - Coefficient maximum
     * @return
     */
    public double getAttack(double coefMin, double coefMax);

    /**
     * Récupere le nom de l'attaque
     * @return
     */
    public String getNameAttack();
}
