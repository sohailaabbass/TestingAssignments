import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter an Integer number to check even or odd:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        Lab2 x=new Lab2();
        x.evenandodd(n);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        int[] arr_num = new int[5];
        System.out.println("Enter the 5 numbers you want to get maximum and minimum for");

        for (int i = 0; i <arr_num.length; i++)
        {
            arr_num[i]=input.nextInt();
        }

        x.maxandmin(arr_num);

    }
}
