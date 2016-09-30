package dz12;

public class GoodTipsCount extends TipsPolymorphism{


    @Override
    public Float calculate(Float amount){

        amount = (float)(amount / 100.0) * 10;
        return amount;
    }

}
