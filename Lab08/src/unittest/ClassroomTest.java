package unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    private Classroom c = new Classroom();
    private Student s1,s2,s3;
    @Test
    void addStudent() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        assertEquals(3,c.size());
    }

    @Test
    void addScoreById() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.addScoreById("1",20);
        assertEquals(20,s1.getScore());
    }

    @Test
    void getScoreById() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        s1.addScore(20);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        assertEquals(20,c.getScoreById("1"));
    }

    @Test
    void averageScore() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        s1.addScore(20);
        s2.addScore(20);
        s3.addScore(20);
        assertEquals(20,c.averageScore());
    }

    @Test
    void totalScore() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        s1.addScore(20);
        s2.addScore(20);
        s3.addScore(20);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        assertEquals(60,c.totalScore());
    }

    @Test
    void size() {
        s1 = new Student("a", "1");
        s2 = new Student("b", "2");
        s3 = new Student("c", "3");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        s1.addScore(20);
        s2.addScore(20);
        s3.addScore(20);
        assertEquals(3,c.size());
    }
}