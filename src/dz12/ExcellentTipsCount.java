package dz12;

public class ExcellentTipsCount extends TipsPolymorphism {


    @Override
    public Float calculate(Float amount){

        amount = (float)(amount / 100.0) * 20;
        return amount;
    }

}
