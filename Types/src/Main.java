import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (num) -> num % 2 == 0;
        System.out.println(p1.test(10));
        System.out.println(p1.test(35));
        Predicate<String> p2 = (s) -> s.isEmpty();
        System.out.println(p2.test(""));


        //Function  i.e., Function<dataType, ReturnType>
//when we want to map data from one data to another
        Function<String, Integer> f1=(str) -> str.length();
        System.out.println(f1.apply("rafi"));

        Function<Integer,Integer> f2=(num) -> num*num;
        System.out.println(f2.apply(6));

        //Consumer one argment no return type

        Consumer<String> c1=(s) -> System.out.println("String:" +s);
        c1.accept("Aashi");

        //Supplier is predifined functional interface, kind of opposite to consumer, no value but return type

        Supplier<Integer> su1=() -> (int) Math.random();
        System.out.println(su1.get());

    }
}