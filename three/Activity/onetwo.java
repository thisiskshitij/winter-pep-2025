
public class onetwo {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int number = 5;
        arithmetic.square(number);
}
}

interface test {
    void square(int n);

}

class Arithmetic implements test{
    @Override
    public void square(int n) {
        System.out.println(n*n);
    }
}

class ToTestInt{
    
    }
