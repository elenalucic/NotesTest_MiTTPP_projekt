package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Test.TestClass.driver;

public class ActivitiesAddPage {
    public static String add_text_id= "com.yocto.wenote:id/backspace_detectable_edit_text";
    public static String add2_text_id= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.EditText";
    public static String add_activity_btn= "com.yocto.wenote:id/add_image_button";
    public static String check_btn= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageButton[2]";
    public static String save_btn= "com.yocto.wenote:id/confirm_image_button" ;



    public static void add_activity(){
        driver.findElementById(add_text_id).click();
        driver.findElementById(add_text_id).sendKeys("First activity");

    }

    public static void add_second_activity(){
        driver.findElementByXPath(add2_text_id).click();
        driver.findElementByXPath(add2_text_id).sendKeys("Second activity");

    }

    public static void click_to_add_new_activity(){
        driver.findElementById(add_activity_btn).click();
    }

    public static void click_to_check_activity(){
        driver.findElementByXPath(check_btn).click();
    }

    public static void save_activities(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(save_btn))).click();
    }




}
