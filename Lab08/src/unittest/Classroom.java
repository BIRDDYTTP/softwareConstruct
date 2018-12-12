package unittest;

import java.util.ArrayList;
import java.util.Collection;

public class Classroom {
    private Collection<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addScoreById(String id, double score) {
        Boolean flag = false;
        for (Student student : students) {
            if (student.getId().equals(id)){
                student.addScore(score);
                flag = true;
            }
        }
        if (!flag){
            throw new RuntimeException("NoSuchElementException");
        }
    }

    public double getScoreById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)){
                return student.getScore();
            }
        }
        throw new RuntimeException("NoSuchElementException");
    }

    public double averageScore() {
        double total = 0;
        if (students.size() == 0) return 0;
        for (Student student : students) {
            total += student.getScore();
        }
        return total / students.size();
    }

    public double totalScore() {
        double total = 0;
        if (students.size() == 0) return 0;
        for (Student student : students) {
            total += student.getScore();
        }
        return total;
    }

    public int size() {
        return students.size();
    }


}
