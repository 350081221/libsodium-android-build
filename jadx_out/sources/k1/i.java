package k1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static Toast f19063a;

    @SuppressLint({"ShowToast"})
    private static Toast a(Context context) {
        if (context == null) {
            return f19063a;
        }
        Toast makeText = Toast.makeText(context.getApplicationContext(), "", 0);
        f19063a = makeText;
        return makeText;
    }

    public static void b(Context context, String str) {
        c(context, str, 0);
    }

    public static void c(Context context, String str, int i5) {
        Toast a5 = a(context);
        if (a5 != null) {
            a5.setDuration(i5);
            a5.setText(String.valueOf(str));
            a5.show();
        } else {
            Log.i("TToast", "toast msg: " + String.valueOf(str));
        }
    }
}
