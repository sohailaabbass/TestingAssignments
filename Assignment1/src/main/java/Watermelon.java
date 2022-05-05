import java.util.Scanner;

public class Watermelon {

   int check (int w) {

       if(w<=0)
       {
           throw new IllegalArgumentException("Weight can't be 0 or less than 0") ;
       }
        if(w%2==0 && w>0)
        {
            System.out.println("Yes");
            return 1;
        }
        else {
            System.out.println("No");
            return 0;
        }
    }
}


