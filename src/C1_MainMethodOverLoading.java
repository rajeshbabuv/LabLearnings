public class C1_MainMethodOverLoading {
    public static void main(int x){
        System.out.println("Message from main method");
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("Message from main method");
        System.out.println("Please main() method also could be overloaded however overloaded method needs to have different signature");
        main(10);
    }
}
