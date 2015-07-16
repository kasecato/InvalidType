import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class InvalidTypeTest {

    @Test
    public void convertTest() throws Exception {
        // arrange
        String key = "status";
        BigDecimal val = new BigDecimal("2");

        // act
        FooEntity actual = InvalidType.convert(FooEntity.class, key, val);

        // assert
        assertEquals(val, actual.status);
    }
}