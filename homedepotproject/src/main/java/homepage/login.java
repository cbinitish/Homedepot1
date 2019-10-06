package homepage;

import common.CommonAPI;
import org.junit.Test;

public class login extends CommonAPI {
    @Test
    public void searchvalue() {
        typeByXpath("//input[@class='SearchBox__input']", "Chair");
        clickByXpath("//*[@class='SearchBox__buttonIcon']");

    }
}