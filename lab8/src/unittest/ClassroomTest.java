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
        c.addScoreById("1",20);
        assertEquals(20,s1.getScore());
    }

    @Test
    void getScoreById() {
        assertEquals(20,c.getScoreById("1"));
    }

    @Test
    void averageScore() {
        s2.addScore(20);
        s3.addScore(20);
        assertEquals(20,c.averageScore());
    }

    @Test
    void totalScore() {
        assertEquals(60,c.totalScore());
    }

    @Test
    void size() {
        assertEquals(3,c.size());
    }
}