package Pages;
import org.testng.Assert;
import static Test.TestClass.driver;
public class HomePage {

    public static String options_btn_xpath= "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]";
    public static String trash_btn_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";

    public static String add_note_btn_xpath= "//android.widget.Button[@content-desc=\"Add note\"]" ;

    public static String add_note_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText" ;

    public static String save_note_id= "com.yocto.wenote:id/confirm_image_button" ;

    public static String notes_btn_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView";

    public static String calendar_xpath= "//android.widget.LinearLayout[@content-desc=\"Calendar\"]";
    public static String add_to_do_id= "com.yocto.wenote:id/action_add_checklist";
    public static String settings_btn_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]\n";



    public static void click_on_notes(){
        driver.findElementByXPath(notes_btn_xpath).click();
    }
    public static void click_for_options(){
        driver.findElementByXPath(options_btn_xpath).click();
    }

    public static void option_verify(){
        String expectedOptionName= "Trash";
        String actualOptionName= driver.findElementByXPath(trash_btn_xpath).getText();
        Assert.assertEquals(expectedOptionName,actualOptionName);
    }

    public static void click_add_note_btn(){
        driver.findElementByXPath(add_note_btn_xpath).click();
    }

    public static void add_notes_text(){
        driver.findElementByXPath(add_note_xpath).click();
        driver.findElementByXPath(add_note_xpath).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    }

    public static void click_save_note(){
        driver.findElementById(save_note_id).click();
    }

    public static void click_calendar_btn(){
        driver.findElementByXPath(calendar_xpath).click();
    }

    public static void click_add_to_do_btn(){
        driver.findElementById(add_to_do_id).click();
    }

    public static void click_settings_btn(){
        driver.findElementByXPath(settings_btn_xpath).click();
    }



}
