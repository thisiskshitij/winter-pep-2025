//Define polymorphism
//ability of an object to exist in different forms

//compile time PM - function overloading
//runtime pm - function overriding
class Doctor{
    void Treat(){System.out.println("I treat patients");}
}

class Physician extends Doctor{
    void Treat(){System.out.println("I treat with meds");}
}

class Surgeon extends Doctor{
    void Treat(){System.out.println("I treat with surgery");}
}

class Dentist extends Doctor{
    void Treat(){System.out.println("I treat dental patients");}
}

public class Polymorphism {
    //compile time pm

    // public void add(int n1,int n2) {System.out.println(n1+n2);}
    // public void add(int n1,float n2) {System.out.println(n1+n2);}
    // public void add(float n1,int n2) {System.out.println(n1+n2);}
    // public void add(int n1,int n2,int n3) {System.out.println(n1+n2+n3);}

    public static void main(String []args){
        //compile time pm

        // Polymorphism p3 = new Polymorphism();
        // p3.add(10,20,30);


        // below is function overriding
        Doctor doc;
        System.out.println("1.Physician\n2.Surgeon\n3.Dentist");
        int choice = new java.util.Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
        
            default:
                doc = new Doctor();
        }
        doc.Treat();

    }

    
}
