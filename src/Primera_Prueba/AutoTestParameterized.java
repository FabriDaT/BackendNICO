package Primera_Prueba;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
//Para construir test
//        parametrizados, JUnit
//        utiliza un custom runner
//        que es Parametrized.
//        Este el cual nos permite
//        definir los parámetros de
//        varias ejecuciones de un
//        solo test.
public class AutoTestParameterized {
    private int multiplierOne;
    private int expected;
    private int multiplierTwo;

    public void MultiplicarTest(int expected, int multiplierOne, int multiplierTwo) {
        this.multiplierOne = multiplierOne;
        this.expected = expected;
        this.multiplierTwo = multiplierTwo;
    }
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
                {4,2,3},{6,10,5},{7,2,8},{1,2,3},
    });
}
    @Test
    public void debeMultiplicarElResultado(){
        Assert.assertEquals(expected,multiplierOne*multiplierTwo);
    }
}


