package dz10_game;

public class Player {
    String name;
    int age;
    char type;

    public Player (String name, int age, char type){
        this.name = name;
        this.age = age;
        this.type = type;

    }

    public char getType(){
        return type;
    }
}
