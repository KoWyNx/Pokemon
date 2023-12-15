```plantuml

@startUml

class Pokemon implements Type, Attack{

private String name;
private int lp;
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
public List pokeball;

public String attackNamePokemon();
public selectPokemon();
}

class Arene {

private String name;
public int dresseur;

public boolen isReady();
public boolen nextFight();
}

class Pokeball{

Pokemon pokemon
public boolen isEmpty();

}

class Battle{

public int currentRound;
public boolen isDead;
public boolen endGame;
public boolen next;
public Pokemon rivalPokemon
public int maxDresseur

public boolen isStartedBattle();
public int getCurrentRound();
public boolen isGameIsFinish();

}

Arene "1" o-- "1" Battle
Arene "1" o-- "2..*" Dresseur
Battle "1" o-- "2" Dresseur
Dresseur "1" o-- "6" Pokeball
Pokeball "1" o-- "0..1" Pokemon
Pokemon "1" o-- "1..3" Attack


@endUml