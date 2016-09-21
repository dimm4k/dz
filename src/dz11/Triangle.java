package dz11;

public class Triangle extends Figures{

    private boolean isosceles  = true;
    private String color = "green";

    public Triangle(int sideSize, int hight, String name) {
        super(sideSize, hight, name);
    }
    public void area(){
        System.out.println("Area of " + name + ": " + triangleArea(sideSize, hight));
    }


}
