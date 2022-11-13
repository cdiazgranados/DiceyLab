

import org.junit.Assert;

import static org.junit.Test.*;

public class Test {
@org.junit.Test
    public void tossAnSumTest1() { //test test
    Dice dice = new Dice();

    boolean expected = true;
    boolean actual = dice.tossAndSum(2) > 2 && dice.tossAndSum(2) <= 12;

    Assert.assertEquals(expected, actual);
}

    @org.junit.Test
    public void tossAnSumTest2() { //test test
        Dice dice = new Dice();

        boolean expected = true;
        boolean actual = dice.tossAndSum(3) >= 3 && dice.tossAndSum(3) <= 18;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void tossAnSumTest3() { //test test
        Dice dice = new Dice();

        boolean expected = false;
        boolean actual = dice.tossAndSum(3) < 1 && dice.tossAndSum(3) <= 18;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void tossAnSumTest4() { //test test
        Dice dice = new Dice();

        boolean expected = true;
        boolean actual = dice.tossAndSum(1000) <= 6000;

        Assert.assertEquals(expected, actual);
    }


}
