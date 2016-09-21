package dz11;

public class Figures {

    public int sideSize;
    public String name;
    public int hight;
    public int area;

    // constructor
    public Figures(int sideSize, int hight, String name){
        this.sideSize = sideSize;
        this.name = name;
        this.hight = hight;
    }

    public int triangleArea(int sideSize, int hight){
        this.area = (sideSize / 2) * hight;
        return area;
    }

    public void squareArea(int sideSize){
        this.area = sideSize * 4;
    }


}
