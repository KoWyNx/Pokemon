## Présentation
Bienvenue dans le projet de Combats de Pokémon fait avec JAVA 21 !
Ce projet a été créer pour simuler des combats entre différents Pokémon, 
en utilisant le langage de programmation Java.
Le principe du projet est la création de différent pokemon, la mise en place de combats entre 2 dresseurs et ses pokemons de différents types
dans une arène. 

### Pour lancer le projet
- Assure toi d'avoir installer JAVA et d'avoir une IDE comme Intellij ou encore eclipse
- Cloner le répertoire avec un "git clone (url du répertoire)" dans le terminal
- Une fois le programme lancé suivez juste les instrutions afin de faire combattre vos pokemon


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
public boolen areAllPokeballEmpty(ListPokeball);

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