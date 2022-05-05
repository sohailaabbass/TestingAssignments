public class Physics {
        static void vectorAddition(int a[][], int N)
        {
            // Sum1 to store sum of xi
            // Sum2 to store sum of yi
            // Sum3 to store sum of zi
            int sumx = 0, sumy = 0, sumz = 0;

            for (int i = 0; i < N; i++)
            {
                sumx += a[i][0];
                sumy += a[i][1];
                sumz += a[i][2];
            }

            // If the sum1, sum2 and sum3
            // are all equal to zero
            if (sumx == 0 && sumy == 0 &&
                    sumz == 0)
            {
                // Body is in
                // equilibrium
                System.out.print("YES");
            }
            else
            {
                // Body is not in
                // equilibrium
                System.out.print("NO");
            }
        }
}
