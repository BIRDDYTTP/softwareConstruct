public class DivideSequence {
    private int num;

    public DivideSequence(int num) {
        this.num = num;
    }

    public double calculate(){
        if (num == 1){
            return (num/(num+2));
        }
        num -= 2;
        return (num/(num+2))+ calculate();
    }
}
