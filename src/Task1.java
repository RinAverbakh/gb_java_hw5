import java.util.ArrayList;
import java.util.HashMap;

class StudentDirectory {
    
    private HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        
    public void addStudent(String name, Integer grade){
        students.computeIfAbsent(name,  k -> new ArrayList<>()).add(grade);
    }

    public ArrayList<Integer> findStudent(String name) {
        return students.get(name);
    }

    public HashMap<String, ArrayList<Integer>> getAllStudents(){
        return students;
    }

    public void removeStudent(String name){
        students.remove(name);
    }
    
}

public class Task1{
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);

        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice")); // [90, 95]
        System.out.println(directory.getAllStudents()); // {Bob=[85], Alice=[90, 95]}

        directory.removeStudent("Alice");
        
        System.out.println("After removal:");
        System.out.println(directory.findStudent("Alice")); //[]
        System.out.println(directory.getAllStudents()); //{Bob=[85]}
    }
}
