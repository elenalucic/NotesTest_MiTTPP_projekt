package Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import Pages.ActivitiesAddPage;
import Pages.CalendarPage;
import Pages.HomePage;
import Pages.SettingsPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestClass{
    public static AndroidDriver driver;

    @BeforeClass()
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Marijana\\Desktop\\WeNote_ Notes Notepad Notebook_5.43_Apkpure.apk");
        capabilities.setCapability("VERSION", "13.0");
        capabilities.setCapability("deviceName", "emulator");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void Add_Note()  {
        HomePage.click_add_note_btn();
        HomePage.add_notes_text();
        HomePage.click_save_note();

    }

    @Test
    public void Add_Note_On_Date() {
        HomePage.click_calendar_btn();
        CalendarPage.click_on_date();
        CalendarPage.click_for_permission();
        CalendarPage.click_for_new_note();
        HomePage.add_notes_text();
        HomePage.click_save_note();

    }

    @Test
    public  void Add_activities(){
        HomePage.click_add_to_do_btn();
        ActivitiesAddPage.add_activity();
        ActivitiesAddPage.click_to_add_new_activity();
        ActivitiesAddPage.add_second_activity();
        ActivitiesAddPage.click_to_check_activity();
       ActivitiesAddPage.save_activities();

    }

    @Test
    public void Option_verify(){
        HomePage.click_for_options();
        HomePage.option_verify();
        HomePage.click_on_notes();
    }


    @Test
    public void Change_color(){
        HomePage.click_settings_btn();
        SettingsPage.click_on_color_btn();
        SettingsPage.click_to_select_color();
    }

    @Test
    public void Rename_label() {
        HomePage.click_settings_btn();
        SettingsPage.click_to_rename_label();
        SettingsPage.click_to_save();

    }

    @AfterClass
    public void teardown() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }
}
