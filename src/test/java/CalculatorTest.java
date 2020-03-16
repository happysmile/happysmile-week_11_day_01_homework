import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        assertEquals(9, calculator.add(2,7));
    }

    @Test
    public void canSubtract() {
        assertEquals(10, calculator.subtract(15,5));
    }

    @Test
    public void canMultiply() {
        assertEquals(21, calculator.multiply(3,7));
    }

    @Test
    public void canDivide() {
        assertEquals(5.00, calculator.divide(20,4), 0.01);
    }



}


//
//public class BearTest {
//
//    Bear bear;
//
//    @Before
//    public void before(){
//        bear = new Bear("Baloo", 28, 95.62);
//    }
//
//    @Test
//    public void hasName() {
//        assertEquals("Baloo", bear.getName());
//    }
//
//    @Test
//    public void hasAge() {
//        assertEquals(28, bear.getAge());
//    }
//
//    @Test
//    public void hasWeight() {
//        assertEquals(95.62, bear.getWeight(), 0.01);
//    }
//
//    @Test
//    public void readyToHibernateIfGreaterThanOrEqualTo80() {
//        assertEquals(true, bear.readyToHibernate());
//    }
//
//    @Test
//    public void notReadyToHibernateIfLessThan80() {
//        Bear skinnyBear = new Bear("Yogi's Pal", 34, 65.30);
//        assertEquals(false, skinnyBear.readyToHibernate());
//    }
//
//}
