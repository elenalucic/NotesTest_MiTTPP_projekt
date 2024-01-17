package Pages;
import static Test.TestClass.driver;

public class CalendarPage {
    public static String date_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.view.View";
    public static String permission_allow_btn= "com.android.permissioncontroller:id/permission_allow_button" ;
    public static String new_note_btn= "com.yocto.wenote:id/new_note_button" ;


    public static void click_on_date(){
        driver.findElementByXPath(date_xpath).click();
    }

    public static void click_for_permission(){
        driver.findElementById(permission_allow_btn).click();
    }

    public static void click_for_new_note(){
        driver.findElementById(new_note_btn).click();
    }




}
