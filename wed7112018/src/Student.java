public class Student implements Measurable{
    private int age;
    private double score;
    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void addScore(double score){
        this.score = score;
    }

    @Override
    public double getMeasure() {
        return score;
    }
}
