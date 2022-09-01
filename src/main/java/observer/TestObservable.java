package observer;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TestObservable {

    public static void f1() {
        Stream.of("Hello")
                .forEach(System.out::println);
    }

    public static void f2(int limit) {
        Stream.iterate(1, n -> n + 1)
                .limit(limit)
                .forEach(System.out::println);
    }

    public static int f3(int[] tab) {
        return Arrays.stream(tab).max().getAsInt();
    }

    public static long f4(String str) {
        return str.chars()
                .filter(c -> Pattern.matches("[aoeiyu]", Character.toString(c)))
                .count();
    }


    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subsrcribe(observer1);
        observable.subsrcribe(observer2);

        observable.setEtat(100);
        System.out.println("**********************");
        observable.setEtat(50);
        System.out.println("#####################");

        observable.unsubscribe(observer2);
        observable.setEtat(800);

    }
}