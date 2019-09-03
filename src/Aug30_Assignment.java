import java.util.*;
public class Aug30_Assignment {
    public static void main(String[] args) {
        int a=10,b=20,c=2,cc,choice,aa,bb,temp;
        float si,si1,s1,s2,f,ff,p=100,pp,t=2,tt,r=3,rr,s11,s22,n=2,nn;
        System.out.println("Please Enter Choice of Operation");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){

            case 1:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                c=a-b;
                System.out.println("Difference of given two number is " +c);
                break;
            case 11:  System.out.println("Please enter two integer numbers");
                Scanner sc1 = new Scanner(System.in);
                aa = sc1.nextInt();
                bb = sc1.nextInt();
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                cc = aa - bb;
                System.out.println("Difference of given two dynamically entered number is " +cc);
                break;

            case 2:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                c=a*b;
                System.out.println("Product of given two number is " +c);
                break;
            case 22:  System.out.println("Please enter two integer numbers");
                Scanner sc2 = new Scanner(System.in);
                aa = sc2.nextInt();
                bb = sc2.nextInt();
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                cc = aa * bb;
                System.out.println("Product of given two dynamically entered number is " +cc);
                break;

            case 3:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                c=a/b;
                System.out.println("Division of given two number is " +c);
                break;
            case 33:  System.out.println("Please enter two integer numbers");
                Scanner sc3 = new Scanner(System.in);
                aa = sc3.nextInt();
                bb = sc3.nextInt();
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                cc = aa / bb;
                System.out.println("Division of given two dynamically entered number is " +cc);
                break;

            case 4:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                c=a%b;
                System.out.println("Modulus of given two number is " +c);
                break;
            case 44:  System.out.println("Please enter two integer numbers");
                Scanner sc4 = new Scanner(System.in);
                aa = sc4.nextInt();
                bb = sc4.nextInt();
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                cc = aa % bb;
                System.out.println("Modulus of given two dynamically entered number is " +cc);
                break;

            case 5:
                System.out.println("Value of 'p' is "+p);
                System.out.println("Value of 't' is "+t);
                System.out.println("Value of 'r' is "+r);
                si = p * t *r/100;
                System.out.println("Simple Interest of given values is " +si);
                break;
            case 55:  System.out.println("Please enter values of P, T & R values");
                Scanner sc5 = new Scanner(System.in);
                pp = sc5.nextInt();
                tt = sc5.nextInt();
                rr = sc5.nextInt();
                System.out.println("Value of 'p' is "+pp);
                System.out.println("Value of 't' is "+tt);
                System.out.println("Value of 'r' is "+rr);
                si1 = pp*tt*rr/100;
                System.out.println("Simple Interest of given P,T & R dynamically entered number is " +si1);
                break;

            case 6:
                System.out.println("Value of 'n' is "+n);
                s1 = (n*(n+1))/2;
                System.out.println("Series of given values is " +s1);
                break;
            case 66:  System.out.println("Please enter values");
                Scanner sc6 = new Scanner(System.in);
                nn = sc6.nextInt();
                System.out.println("Value keyed for 'n' is "+nn);
                s11 = nn*(nn+1)/2;
                System.out.println("Series of given dynamically entered number is " +s11);
                break;

            case 7:
                System.out.println("Value of 'n' is "+n);
                s2 = (n*(n+1)*(2*n+1))/6;
                System.out.println("Series of given values is " +s2);
                break;
            case 77:  System.out.println("Please enter values");
                Scanner sc7 = new Scanner(System.in);
                nn = sc7.nextInt();
                System.out.println("Value keyed for 'n' is "+nn);
                s22 = (nn*(nn+1)*((2*nn)+1))/6;
                System.out.println("Series of given dynamically entered number is " +s22);
                break;

            case 8:
                System.out.println("Value of 'c' is "+c);
                f = c*9/5 - 32;
                System.out.println("value of f is " +f);
                break;
            case 88:  System.out.println("Please enter values");
                Scanner sc8 = new Scanner(System.in);
                cc = sc8.nextInt();
                System.out.println("Value keyed for 'n' is "+cc);
                ff = cc*9/5 - 32;;
                System.out.println("Value of given dynamically entered number is " +ff);
                break;

            case 9:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                temp = a;
                a = b;
                b = temp;
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                break;
            case 99:  System.out.println("Please enter two values");
                Scanner sc9 = new Scanner(System.in);
                aa = sc9.nextInt();
                bb = sc9.nextInt();
                temp = aa;
                aa = bb;
                bb = temp;
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                break;

            case 10:
                System.out.println("Value of 'a' is "+a);
                System.out.println("Value of 'b' is "+b);
                a = a*b;
                b = a/b;
                a = a/b;
                System.out.println("Swapped Value of 'a' is "+a);
                System.out.println("Swapped Value of 'b' is "+b);
                break;
            case 100:  System.out.println("Please enter two values");
                Scanner sc10 = new Scanner(System.in);
                aa = sc10.nextInt();
                bb = sc10.nextInt();
                System.out.println("Value of 'a' is "+aa);
                System.out.println("Value of 'b' is "+bb);
                aa = aa*bb;
                bb = aa/bb;
                aa = aa/bb;
                System.out.println("Swapped Value of 'a' is "+aa);
                System.out.println("Swapped Value of 'b' is "+bb);
                break;



        }


    }
}
