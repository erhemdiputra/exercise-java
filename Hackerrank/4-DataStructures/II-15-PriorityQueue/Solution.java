import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Checker implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() == s2.getCGPA()) {
            if (s1.getName().equals(s2.getName())) {
                Integer s1ID = Integer.valueOf(s1.getID());
                Integer s2ID = Integer.valueOf(s2.getID());
                return s1ID.compareTo(s2ID);
            }
            return s1.getName().compareTo(s2.getName());
        }

        Double aCGPA = new Double(s1.getCGPA());
        Double bCGPA = new Double(s2.getCGPA());
        return bCGPA.compareTo(aCGPA);
    }
}

class Priorities {
    public PriorityQueue<Student> getStudents(List<String> events) {
        Checker checker = new Checker();
        PriorityQueue<Student> pq = new PriorityQueue<Student>(events.size(), checker);

        for (String e: events) {
            String[] parts = e.split(" ");

            switch (parts[0]) {
                case "SERVED":
                    pq.poll();
                    break;
                case "ENTER": 
                    String name = parts[1];
                    double cgpa = Double.valueOf(parts[2]);
                    int id = Integer.valueOf(parts[3]);
                    Student student = new Student(id, name, cgpa);

                    pq.add(student);
                    break;
                default:
                    break;
            }
        }

        return pq;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        PriorityQueue<Student> pq = priorities.getStudents(events);
        
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                Student s = pq.remove();
                System.out.println(s.getName() + " " + s.getCGPA() + " " + s.getID());
            }
        }
    }
}