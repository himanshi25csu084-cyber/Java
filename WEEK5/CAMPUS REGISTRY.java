public class CampusManagementApp {

    static abstract class Person {
        private String name;
        private String id;

        Person(String name, String id) {
            this.name = name;
            this.id = id;
        }

        String getName() {
            return name;
        }

        String getId() {
            return id;
        }

        abstract String getRole();
        abstract String getSummary();
        abstract double getPerformanceScore();

        public String toString() {
            return getRole() + ": " + name + " (ID: " + id + ") - " + getSummary();
        }
    }

    static class Student extends Person {
        int[] marks;

        Student(String name, String id, int[] marks) {
            super(name, id);
            this.marks = marks;
        }

        String getRole() {
            return "Student";
        }

        double getPerformanceScore() {
            int total = 0;
            for (int i = 0; i < marks.length; i++) {
                total = total + marks[i];
            }
            return (double) total / marks.length;
        }

        String getSummary() {
            return "Average marks = " + String.format("%.2f", getPerformanceScore());
        }
    }

    static class Instructor extends Person {
        String department;

        Instructor(String name, String id, String department) {
            super(name, id);
            this.department = department;
        }

        String getRole() {
            return "Instructor";
        }

        double getPerformanceScore() {
            return -1;
        }

        String getSummary() {
            return "Department: " + department;
        }
    }

    static class CampusRegistry {
        private Person[] people;
        private int count;

        CampusRegistry(int capacity) {
            people = new Person[capacity];
            count = 0;
        }

        boolean addPerson(Person p) {
            if (count < people.length) {
                people[count] = p;
                count = count + 1;
                return true;
            }
            return false;
        }

        void displayAll() {
            for (int i = 0; i < count; i++) {
                System.out.println(people[i]);
            }
        }

        void countByRole() {
            int studentCount = 0;
            int instructorCount = 0;
            for (int i = 0; i < count; i++) {
                String role = people[i].getRole();
                if (role.equals("Student")) {
                    studentCount = studentCount + 1;
                } else if (role.equals("Instructor")) {
                    instructorCount = instructorCount + 1;
                }
            }
            System.out.println("Students: " + studentCount);
            System.out.println("Instructors: " + instructorCount);
        }

        void findTopStudent() {
            String topName = "";
            double topScore = -1;
            for (int i = 0; i < count; i++) {
                if (people[i].getRole().equals("Student")) {
                    double score = people[i].getPerformanceScore();
                    if (score > topScore) {
                        topScore = score;
                        topName = people[i].getName();
                    }
                }
            }
            if (topName.equals("")) {
                System.out.println("No students found");
            } else {
                System.out.println("Top student: " + topName + " with average = " + String.format("%.2f", topScore));
            }
        }
    }

    public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(10);

        registry.addPerson(new Student("Aman", "S101", new int[] { 78, 82, 91 }));
        registry.addPerson(new Student("Riya", "S102", new int[] { 65, 70, 60 }));
        registry.addPerson(new Instructor("Dr. Sharma", "I201", "Computer Science"));
        registry.addPerson(new Student("Karan", "S103", new int[] { 88, 92, 95 }));
        registry.addPerson(new Instructor("Dr. Mehta", "I202", "Mathematics"));
        registry.addPerson(new Student("Neha", "S104", new int[] { 55, 60, 58 }));

        System.out.println("---- All People ----");
        registry.displayAll();

        System.out.println();
        System.out.println("---- Count By Role ----");
        registry.countByRole();

        System.out.println();
        System.out.println("---- Top Student ----");
        registry.findTopStudent();
    }
}
