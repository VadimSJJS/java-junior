package chapter7_reusingclasses;

public class ExConstant {
    final ExConstant exConstant;

    public ExConstant() {
        exConstant = new ExConstant();
        // exConstant = new ExConstant();
        // после инициализации константу
        // нельзя изменять
    }


}
