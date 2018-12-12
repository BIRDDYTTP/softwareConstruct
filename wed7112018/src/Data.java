import java.util.Collection;

public class Data {
    public static double average(Collection<Measurable> objects){
        double total = Data.total(objects);
        if (objects.size() == 0) return 0;
        return total/objects.size();
    }

    public static double total(Collection<Measurable> objects){
        double total = 0;
        for (Measurable m : objects) {
            total += m.getMeasure();
        }

        return total;
    }

    public static double average(Collection<?> objects, Measurer measurer){
        double total = Data.total(objects,measurer);
        if (objects.size() == 0) return 0;

        return total/objects.size();
    }

    private static double total(Collection<?> objects, Measurer measurer) {
        double total = 0;
        for (Object o: objects){
            total += measurer.measure(o);
        }
        return total;
    }
}
