import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api. Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WatermelonTest
{
    @Test
    void ifNegativeorzero()
    {
        Watermelon x = new Watermelon() ;
        assertThrows(IllegalArgumentException. class, () -> {x.check(-1) ;}) ;
        assertThrows(IllegalArgumentException. class, () -> {x.check(0) ;}) ;
    }

    @Test
    void ifEven()
    {
        Watermelon x = new Watermelon() ;
        assertEquals(1, x.check(4) ) ;
    }
    @Test
    void ifOdd()
    {
        Watermelon x = new Watermelon() ;
        assertEquals(0, x.check(3) ) ;
    }
}
