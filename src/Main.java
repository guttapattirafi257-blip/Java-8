public class Main{
    public static void main(String args[]){

        Vehicle v1=() -> System.out.println("Car started");
        v1.start();

        Task t1=() -> {
            System.out.println("Task stated");
            System.out.println("Task ended");
        };
        t1.work();

        Maths m1=(num) -> num*num;
        System.out.println(m1.cal(20));
    }
}