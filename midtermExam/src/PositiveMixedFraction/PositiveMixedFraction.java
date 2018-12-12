package PositiveMixedFraction;

public class PositiveMixedFraction {
    private long wholeNumber;
    private long nominator;
    private long denominator;

    public PositiveMixedFraction() {
        this.wholeNumber = 0;
        this.nominator = 0;
        this.denominator = 1;
    }

    public PositiveMixedFraction(long wholeNumber, long nominator, long denominator) {
        if (denominator <= 0 || nominator < 0 || wholeNumber < 0){
            throw new RuntimeException();
        }
        this.wholeNumber = wholeNumber;
        if (nominator > denominator) {
            this.nominator = nominator%denominator;
            this.denominator = denominator;
            this.wholeNumber +=  (nominator-(nominator%denominator))/denominator;
        }else if (nominator == denominator || nominator == 0){
            this.nominator = nominator%denominator;
            this.denominator = 1;
            this.wholeNumber += nominator/denominator;
        }
        else{
            this.nominator = nominator;
            this.denominator = denominator;
        }
    }

    public long getWholeNumber() {
        return wholeNumber;
    }

    public long getNominator() {
        return nominator;
    }

    public long getDenominator() {
        return denominator;
    }
}
