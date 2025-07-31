package chapter6_accessControl;

public class ExVector {
    public static void main(String[] args) {
        /*
        класс Vector объявлен сразу в двух пакетах
        поэтому необходимо указывать два разных пакета
         */

        chapter6_accessControl.exmypackage.Vector  vector
                = new chapter6_accessControl.exmypackage.Vector();

        chapter6_accessControl.packagevector.Vector vector1 =
                new chapter6_accessControl.packagevector.Vector();
    }
}
