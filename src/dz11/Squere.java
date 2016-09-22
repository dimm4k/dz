package dz11;

public class Squere extends Figures {

    public Squere(int sideSize, int hight, String name){
        super(sideSize, hight, name);
    }

    public void area(){
        System.out.println("Area of " + name + ": " + squareArea(sideSize));
    }
}
