
public class oneone {
    public static void main(String[] args) {
        A myObject = new MyClass();

        myObject.meth1();
        myObject.meth2();
    }
}

interface A{
    void meth1();
    void meth2();
}


class MyClass implements A{
    @Override
    public void meth1(){
        System.out.println("Implementation of meth1 in MyClass");
    }
    @Override
    public void meth2(){
        System.out.println("Implementation of meth2 in MyClass");
    }
}
