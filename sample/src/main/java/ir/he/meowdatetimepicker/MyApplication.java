package ir.he.meowdatetimepicker;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by 1HE on 1/10/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");
        Typeface medium = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Medium.ttf");
        Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");
        Typeface light = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        MeowTypefaceHelper.init(regular, medium, bold, light);
    }
}
