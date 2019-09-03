import java.util.Scanner;

public class Swap_withoutTemp {
    public static void main(String[] args) {
        int x,y;

        System.out.println("Please Enter two Numbers to be Swapped");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Value of Two Values Entered are " +x +" " +y);
/* We Could use addition & substraction or multiplication & division accordingly*/
        x = x + y;
        y =x -y;
        x= x -y;
        System.out.println("Swapped  Value of Two Values are " +x + " " +y);
    }
}
