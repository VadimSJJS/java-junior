package strategy.example1;

class CarStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Маршрут на машине: " + from + " - " + to);
    }
}

class BikeStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Маршрут на велосипеде: " + from + " - " + to);
    }
}

class WalkStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Маршрут пешком: " + from + " - " + to);
    }
}

class Navigator {
    private RouteStrategy strategy;

    // Устанавливаем стратению
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Используем стратегию
    public void buildRoute(String from, String to) {
        if (strategy != null) {
            strategy.buildRoute(from, to);
        } else {
            System.out.println("Стратегия не выбрана!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        // Выбираем стратегию на машине
        navigator.setStrategy(new CarStrategy());
        navigator.buildRoute("Москва", "Санкт-Петербург");

        // Выбираем стратегию пешком
        navigator.setStrategy(new BikeStrategy());
        navigator.buildRoute("Парк", "Кафе");
    }
}
