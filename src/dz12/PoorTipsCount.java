package dz12;

public class PoorTipsCount extends TipsPolymorphism {

    public void calculate(Float amount){

        this.amount = (float)(amount / 100.0) * 5;

    }

}
