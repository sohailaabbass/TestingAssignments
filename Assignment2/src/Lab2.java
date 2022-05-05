public class Lab2 {
    int evenandodd(int n) //assume this program is only for integers
    {
        if (n % 2 == 0){
            System.out.println("this number is even");
        return 1;}
        else{
            System.out.println("this number is odd");
        return 0;}
    }

    int maxandmin(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)   // max
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum number in array is: "); System.out.println(max);
        System.out.println("Minimum number in array is: "); System.out.println(min);
        return 0;
    }
}