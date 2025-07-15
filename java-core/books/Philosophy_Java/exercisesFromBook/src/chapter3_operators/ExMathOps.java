package chapter3_operators;

/*
Напишите программу, уоторая вычисляет скорость для
постоянных значений расстояния и времени
 */

public class ExMathOps {
    public static void main(String[] args) {
        double distance = 45.5;
        double time = 2.33;

        double speed = distance / time;
        System.out.println("distance=" + distance + ",  time=" + time + ", => speed=" + speed);
    }
}
