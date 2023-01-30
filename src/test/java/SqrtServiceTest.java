import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.SqrtService;

public class SqrtServiceTest {

    @Test

    public void shouldCalcExact() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(400, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldCalcInexact() {

        SqrtService service = new SqrtService();
        int expected = 8;
        int actual = service.calcSqrt(300, 100);

Assertions.assertEquals(expected, actual);
    }
}
