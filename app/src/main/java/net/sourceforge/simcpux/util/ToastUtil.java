package net.sourceforge.simcpux.util;

import android.app.Activity;
import android.widget.Toast;

/**
 * @author scottwang1996@qq.com
 * @since 2017/11/2.
 */

public class ToastUtil {

    public static void shortToastInBackgroundThread(final Activity activity, final String msg) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
