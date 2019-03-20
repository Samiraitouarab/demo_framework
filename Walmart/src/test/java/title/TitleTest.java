package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends CommonAPI {

    @Test
    public void title(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Walmart.com | Save Money. Live Better.");
    }

}
