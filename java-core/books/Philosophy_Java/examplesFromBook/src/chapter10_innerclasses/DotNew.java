package chapter10_innerclasses;

// Прямое создание объекта внутреннего класса с синтаксисом .new.
public class DotNew {
    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
