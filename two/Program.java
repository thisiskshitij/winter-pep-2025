public class Program {
    public static void main(String[] args) {
        
        Employee timi = new Employee();

        System.out.println("Employee salary "+timi.salary);
        timi.takeAttendance();
    }
}

class Employee{

    public int salary = 5000;

    public void takeAttendance(){
        System.out.println("I take attendance !");
    }
}