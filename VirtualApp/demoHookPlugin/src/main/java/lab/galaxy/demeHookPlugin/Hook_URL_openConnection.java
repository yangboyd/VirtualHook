package lab.galaxy.demeHookPlugin;

import android.util.Log;

import java.net.URL;
import java.net.URLConnection;


/**
 * Created by liuruikai756 on 31/03/2017.
 */

public class Hook_URL_openConnection {
    public static String className = "java.net.URL";
    public static String methodName = "openConnection";
    public static String methodSig = "()Ljava/net/URLConnection;";
    public static URLConnection hook(URL thiz) {
        Log.e("YAHFA", "openConnection to "+thiz.toString());
        return backup(thiz);
    }

    public static URLConnection backup(URL thiz) {
        Log.e("YAHFA", "should not be here");
        return null;
    }
}
