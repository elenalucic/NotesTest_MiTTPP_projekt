package Pages;

import static Test.TestClass.driver;

public class SettingsPage {
    public static String color_btn_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.ImageButton[2]";
    public static String select_color= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.view.View";
    public static String rename_label= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout[1]/android.widget.EditText";
    public static String save_btn= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.ImageButton";

    public static void click_on_color_btn(){
        driver.findElementByXPath(color_btn_xpath).click();
    }

    public static void click_to_select_color(){
        driver.findElementByXPath(select_color).click();
    }

    public static void click_to_rename_label(){
        driver.findElementByXPath(rename_label).click();
        driver.findElementByXPath(rename_label).clear();
        driver.findElementByXPath(rename_label).sendKeys("School");

    }

    public static void click_to_save(){
        driver.findElementByXPath(save_btn).click();
    }





}
