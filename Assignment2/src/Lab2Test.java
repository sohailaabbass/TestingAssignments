import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Lab2Test {
    @Test
    void ifEven()
    {
        Lab2 x = new Lab2() ;
        assertEquals(1, x.evenandodd(102) ) ;
    }
    @Test
    void ifOdd()
    {
        Lab2 x = new Lab2() ;
        assertEquals(0, x.evenandodd(303)) ;
    }
    @Test
    void checkMax()
    {
        Lab2 x = new Lab2() ;
        int[] arr={4,5,6,9,10};
        assertEquals(0, x.maxandmin(arr));
    }
    @Test
    void checkMin()
    {
        Lab2 x = new Lab2() ;
        int[] arr={15,50,26,89,110};
        assertEquals(0, x.maxandmin(arr));
    }
}