public class Student implements Comparable{
    private String name;
    private  double score;

    public Student(String name) {
        this.name = name;
    }
    public void addScore(double score){
        if (score > 0){
            this.score += score;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
//        return this.name.compareTo(other.name);
        return (int) (this.score - other.score);
    }
}
