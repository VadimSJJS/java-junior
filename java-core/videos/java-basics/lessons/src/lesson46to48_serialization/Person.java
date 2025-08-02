package lesson46to48_serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -3722919817238172312L;
    private transient int id;
    private String name;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
