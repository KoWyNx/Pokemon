```plantuml

@startUml
class Pokemon implements Type, Attack{
private String name;
private int heal;
private int maxPower;
private int minPower;
public boolen dead;
public String attackName;
Public String typeBetter;
public String typeWeaker;

}

interface Type {
public String getType();
}

interface Attack implements Type{
public double getAttack(double coef min,double coef max);
public String getNameAttack();
}

class Dresseur{
public String name;
public List pokemon;
}

class Arene {
public String name;
public int dresseur;
}

class Pokeball{
Pokemon pokemon
public boolen isEmpty();
}

class Battle{
public boolen isDead;
public boolen endGame;
public boolen next;
public Pokemon rivalPokemon
public int maxDresseur
}

@endUml