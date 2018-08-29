import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Checker implements Comparator<Student>  {
    public int compare(Student a, Student b) {
        if (a.getCgpa() == b.getCgpa()) {
            if (a.getFname().equals(b.getFname())) {
                Integer aId = Integer.valueOf(a.getId());
                Integer bId = Integer.valueOf(b.getId());
                return aId.compareTo(bId);
            } 
            return a.getFname().compareTo(b.getFname());
        }
        
        Double aCgpa = new Double(a.getCgpa());
        Double bCgpa = new Double(b.getCgpa());
        return bCgpa.compareTo(aCgpa);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<Student> studentList = new ArrayList<Student>();
        Checker checker = new Checker();

        while(testCases-- > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student student = new Student(id, fname, cgpa);
            studentList.add(student);
        }

        Collections.sort(studentList, checker);

        for(Student st: studentList) {
            System.out.println(st.getFname());
        }
    }
}