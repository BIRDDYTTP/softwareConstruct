import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataTest {

    @Test
    void average_ShouldWorkWithStudentScore_WhenCall() {
        Collection<Measurable> students = new ArrayList<>();
        Student s1 = new Student(15);
        s1.addScore(20);
        Student s2 = new Student(20);
        s1.addScore(32.2);
        students.add(s1);
        students.add(s2);

        double actual = Data.average(students);
        assertEquals(0,actual);
    }

    @Test
    void average_ShouldWorkWithMemberCardPoint_WhenCall() {
        Collection<Measurable> cards = new ArrayList<>();
        MemberCard m1 = new MemberCard();
        m1.addCost(100);
        MemberCard m2 = new MemberCard();
        m1.addCost(200);
        cards.add(m1);
        cards.add(m2);

        double actual = Data.average(cards);
        assertEquals(0,actual);
    }

    @Test
    void average_ShouldWorkWithStudentScore_WhenCallBack() {
        Collection<Measurable> students = new ArrayList<>();
        Student s1 = new Student(15);
        s1.addScore(20);
        Student s2 = new Student(19);
        s1.addScore(32.2);
        students.add(s1);
        students.add(s2);

        double actualScore = Data.average(students, (obj)-> {
                return 0;
        });
        assertEquals(26.1,actualScore);

        double actualAge = Data.average(students, (obj)-> {
                return 0;
        });
        assertEquals(16.5,actualAge);
    }
}