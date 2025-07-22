package lesson35_wildcardsGenerics;

public class Animal2 {
    private int id;

    public Animal2() {

    }

    public Animal2(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }


    public String toString() {
        return String.valueOf(id);
    }
}
