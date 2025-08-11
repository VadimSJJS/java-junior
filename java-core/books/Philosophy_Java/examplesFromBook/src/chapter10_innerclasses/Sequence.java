package chapter10_innerclasses;

/*
(2) Создайте класс, который содержит String и метод toString(), выводящий хранимую строку. Добавьте несколько экземпляров нового класса в объект Sequence и выведите их.
 */

/*
(4) Добавьте в класс Sequence.SequenceSelector метод для получения ссылки на внешний класс Sequence
 */

interface Selector {
    boolean end();
    Object current();
    void next();
}

class SequenceString {
    private String str;

    public SequenceString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

// Последовательность
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public Sequence getSequence() {
            return Sequence.this;
        }

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);

        sequence.add(new SequenceString("Первая строка"));
        sequence.add(new SequenceString("Вторая строка"));
        sequence.add(new SequenceString("Третья строка"));
        sequence.add(new SequenceString("Четвертая строка"));
        sequence.add(new SequenceString("Пятая строка"));

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
