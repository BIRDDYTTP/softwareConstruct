import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("James");
        studentArray[1] = new Student("Jack");
        studentArray[2] = new Student("Ken");

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
//        HashSet<Student> studentHashSet = new HashSet<Student>();
//        studentHashSet.add(new Student("Boat"));
//        studentHashSet.add(new Student("Gunner"));
//        Student s1 = new Student("Bird");
//        studentHashSet.add(s1);
//        System.out.println(studentHashSet.toString());
//        for (Student s: studentHashSet){
//            System.out.println(s);
//        }
//        TreeSet<Student> studentTreeSet = new TreeSet<>();
//        studentTreeSet.add(new Student("A"));
//        studentTreeSet.add(new Student("B"));
//        studentTreeSet.add(new Student("C"));
//        System.out.println(studentTreeSet.toString());
//        HashMap<String, Student> studentHashMap = new HashMap<>();
//        studentHashMap.put("6010400001",new Student("Bew"));
//        studentHashMap.put("6010400002", new Student("Gun"));
//        for (String id: studentHashMap.keySet()){
//            Student s = studentHashMap.get(id);
//            s.addScore(10);
//            System.out.println(s);
//        }
//        System.out.println(studentHashMap.toString());

        studentList.add(new Student("Boat"));
        studentList.add(new Student("Gunner"));
        Student s1 = new Student("Bird");
        studentList.add(s1);
        s1.addScore(0);
        System.out.println("Empty? "+studentList.isEmpty());
        System.out.println("Size: "+studentList.size());
        System.out.println(
                Arrays.toString(
                        studentList.toArray()
                )
        );
        System.out.println(studentList.contains(new Student("Gunner")));
        System.out.println(studentList.contains(s1));
        numbers.add(1);
        numbers.add(100);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(0));
        numbers.set(1,200);
        System.out.println(numbers.toString());
    }
}
