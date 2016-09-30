package dz12;

public class PoorTipsCount extends TipsPolymorphism {


    @Override
    public Float calculate(Float amount){

        amount = (float)(amount / 100.0) * 5;
        return amount;
    }

}
