package chapter5_initializationAndTermination;

import java.lang.reflect.Type;

public class ExEnum {
    public static void main(String[] args) {
        for (TypeMoney typeMoney : TypeMoney.values()) {
            System.out.println(typeMoney + ", ordinal " + typeMoney.ordinal());
        }

        TypeMoney type = TypeMoney.BANKNOTES;
        describe(type);

        type = TypeMoney.FEDERAL_RESERVE_NOTES;
        describe(type);
    }

    public static void describe(TypeMoney typeMoney) {
        switch (typeMoney) {
            case BANKNOTES:
                System.out.println("BANKNOTES");
                break;
            case FEDERAL_RESERVE_NOTES:
                System.out.println("FEDERAL_RESERVE_NOTES");
                break;
            case BILLS:
                System.out.println("BILLS");
                break;
            case LEGAL_TENDER:
                System.out.println("LEGAL_TENDER");
                break;
            case DISCONTINUED_CURRENCY:
                System.out.println("DISCONTINUED_CURRENCY");
                break;
            default:
                System.out.println("NO TYPE");
                break;
        }
    }
}
