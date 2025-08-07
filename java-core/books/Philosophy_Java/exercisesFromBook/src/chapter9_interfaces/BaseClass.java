package chapter9_interfaces;

public abstract class BaseClass {
    public abstract void print();

    public BaseClass() {
        print();
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.print();
        subClass.print();
        subClass.print();
    }
}

class SubClass extends BaseClass{
    int i = 1;
    public void print() {
        System.out.println(i++);
    }
}