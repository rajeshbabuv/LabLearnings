public class Lab1 {
    int aa=10,bb=22,cc=33,maxx;



     public static void main(String[] args) {
         int a=10,b=322,c=33,max;

         max = (a>b)& (a>c)?a:c;
         System.out.println("Largest of 3 number is " +max);

         max = (b>c)?b:c;
         System.out.println("Largest of 3 number is " +max);


        System.out.println("Welcome Java Program");

        Lab1 l =new Lab1();
        if(l.aa>l.bb){
            if(l.aa > l.cc) {
                l.maxx =l.aa;
            System.out.println("Largest of 3 numbers is" +l.maxx);}
            else
            {
                l.maxx = l.cc;
                System.out.println("Largest of 3 numbers is" + l.maxx);
            }

        }
        else
            if(l.bb>l.cc){
                l.maxx =l.bb;
        System.out.println("Largest of 3 numbers is" +l.maxx);}
            else
                l.maxx=l.cc;
        System.out.println("Largest of 3 numbers is" +l.maxx);

    }
}
