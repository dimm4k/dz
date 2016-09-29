package dz12;

public class ExcellentTipsCount extends TipsPolymorphism {

    public void calculate(Float amount){

        this.amount = (float)(amount / 100.0) * 20;

    }
}
