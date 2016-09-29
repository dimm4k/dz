package dz12;

public class GoodTipsCount extends TipsPolymorphism{

    public void calculate(Float amount){

        this.amount = (float)(amount / 100.0) * 10;

    }
}
