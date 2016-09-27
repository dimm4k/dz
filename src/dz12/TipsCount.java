package dz12;

public class TipsCount extends TipsPolymorphism {

    public TipsCount(Float amount){

        super(amount);
        this.amount = poorPercent(amount);

    }


    public Float poorPercent(Float amount){
        amount = (float)(amount / 100.0) * 5;
        return amount;

    }
}
