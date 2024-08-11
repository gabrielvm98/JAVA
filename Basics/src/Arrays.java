import java.util.ArrayList;
import java.util.Comparator;

public class Arrays {
    public static void main(String[] args) {
        double[] grades = new double[4];
        grades[0] = 13.0;
        grades[1] = 18.5;
        grades[2] = 19.8;
        grades[3] = 16.5;

        String[] courses = {"History", "Math", "Science", "Chemistry"};

        System.out.println(java.util.Arrays.toString(courses));
        System.out.println(courses.length);

        for (String course: courses) {
            System.out.println(course);
        }

        courses[0] = "Geography";
        System.out.println(courses[0] + ": " + grades[0]);

        java.util.Arrays.sort(courses);
        System.out.println(java.util.Arrays.toString(courses));

        System.out.println(java.util.Arrays.binarySearch(courses, "Science"));


        String[] coursesCopyA = courses;
        String[] coursesCopyB = java.util.Arrays.copyOf(courses, courses.length);
        String[] coursesCopyC = java.util.Arrays.copyOfRange(courses, 0,2);
        String[] coursesCopyD = java.util.Arrays.copyOfRange(courses, 0,6);

        System.out.println(courses == coursesCopyA);
        System.out.println(courses == coursesCopyB);
        System.out.println(java.util.Arrays.equals(courses, coursesCopyB));


        java.util.Arrays.fill(courses, 1, 3, "English");
        System.out.println(java.util.Arrays.toString(courses));
        System.out.println(java.util.Arrays.toString(coursesCopyA));
        System.out.println(java.util.Arrays.toString(coursesCopyB));
        System.out.println(java.util.Arrays.toString(coursesCopyC));
        System.out.println(java.util.Arrays.toString(coursesCopyD));


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lima");
        cities.add("Bogota");
        cities.add("Quito");
        cities.add("Paris");
        System.out.println(cities);

        cities.set(0, "Athens");
        cities.remove("Paris");
        cities.remove(1);
        System.out.println(cities);
        System.out.println(cities.get(1));

        cities.clear();
        System.out.println(cities);

        cities.add("Lima");
        cities.add("Bogota");
        cities.add("Quito");
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);
        cities.sort(Comparator.reverseOrder());
        System.out.println(cities);

        System.out.println(cities.size());
        System.out.println(cities.isEmpty());
        System.out.println(cities.contains("Lima"));

        cities.forEach(city -> {
            System.out.println(city);
        });
    }
}