package testsuite;

import org.testng.annotations.DataProvider;
import test.TestBase;

public class DataSet extends TestBase {
    @DataProvider(name = "JobsearchData")
    public Object[][] createData1() {
        return new Object[][]{

                {"Tester", "Harrow, Greater London", "5 Miles", "30000", "50000", "Per annum", "Permanent"},
                {"software", "Surray, Greater London", "10 Miles", "55000", "60000", "per annum", "Permanent"},
                {"Developer", "Hayes, Greater London", "7 Miles", "65000", "70000", "per annum", "Contract"},
                {"Q.A", "Wartford, Greater London", "15 Miles", "35000", "40000", "Per annum", "Part Time"},
                {"Physiotherapist", "Neasden, Greater London", "25 Miles", "75000", "80000", "per month", "Temporary"},
                {"software", "Sudnury, Greater London", "50 Miles", "500", "600", "Per da", "Permanent"},

        };
    }
}