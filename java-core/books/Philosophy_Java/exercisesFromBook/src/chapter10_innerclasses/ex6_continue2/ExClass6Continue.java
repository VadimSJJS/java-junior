package chapter10_innerclasses.ex6_continue2;

import chapter10_innerclasses.ex6.MyInterface;
import chapter10_innerclasses.ex6_continue.OuterClass;

public class ExClass6Continue extends OuterClass {
    public MyInterface method() {
        return (MyInterface) new ExClass6Continue();
    }
}
