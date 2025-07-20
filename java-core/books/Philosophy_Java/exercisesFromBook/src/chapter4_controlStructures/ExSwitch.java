package chapter4_controlStructures;

public class ExSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.printf("%d - ноль\n", i);
                    break;
                case 1:
                    System.out.printf("%d - один\n", i);
                    break;
                case 2:
                    System.out.printf("%d - два\n", i);
                    break;
                case 3:
                    System.out.printf("%d - три\n", i);
                    break;
                case 4:
                    System.out.printf("%d - четыре\n", i);
                    break;
                default:
                    System.out.printf("%d - не входит в диапазон от 0 до 4\n", i);
                    break;
            }
        }
    }
}
