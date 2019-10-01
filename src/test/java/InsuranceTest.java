
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsuranceTest {
     Insurance insurance;


    @Before
    public void init() {
        insurance = new Insurance();
    }


    @Test
    public void getInsurance() {
        int expectedAmountTillTwelve = 10;
        int actualAmountTillTwelve = insurance.getInsurance(0);
        int expectedAmountTillTwelve1 = 10;
        int actualAmountTillTwelve1 = insurance.getInsurance(12);

        int expectedAmountTillTwentyFive = 20;
        int actualAmountTillTwentyFive = insurance.getInsurance(13);
        int expectedAmountTillTwentyFive1 = 20;
        int actualAmountTillTwentyFive1 = insurance.getInsurance(25);

        int expectedAmountTillFortyFive = 30;
        int actualAmountTillFortyFive = insurance.getInsurance(26);
        int expectedAmountTillFortyFive1 = 30;
        int actualAmountTillFortyFive1 = insurance.getInsurance(45);

        int expectedAmountTillSixty = 40;
        int actualAmountTillSixty = insurance.getInsurance(46);
        int expectedAmountTillSixty1 = 40;
        int actualAmountTillSixty1 = insurance.getInsurance(60);
        int expectedAmountAfterSixty = 0;
        int actualAmountAfterSixty = insurance.getInsurance(66);//Вот тут не знаю как сделать- но уже нет сил!

        Assert.assertEquals("Amount for zero age  is incorrect", expectedAmountTillTwelve, actualAmountTillTwelve);
        Assert.assertEquals("Amount for twelve age  is incorrect", expectedAmountTillTwelve1, actualAmountTillTwelve1);
        Assert.assertEquals("Amount for thirteen age  is incorrect", expectedAmountTillTwentyFive, actualAmountTillTwentyFive);
        Assert.assertEquals("Amount for twenty five age  is incorrect", expectedAmountTillTwentyFive1, actualAmountTillTwentyFive1);
        Assert.assertEquals("Amount for twenty six age  is incorrect", expectedAmountTillFortyFive, actualAmountTillFortyFive);
        Assert.assertEquals("Amount for forty five age  is incorrect", expectedAmountTillFortyFive1, actualAmountTillFortyFive1);
        Assert.assertEquals("Amount for forty six age  is incorrect", expectedAmountTillSixty, actualAmountTillSixty);
        Assert.assertEquals("Amount for sixty age  is incorrect", expectedAmountTillSixty1, actualAmountTillSixty1);
        Assert.assertEquals("Sorry, your age is improper to get the insurance", expectedAmountAfterSixty, actualAmountAfterSixty);

    }}









