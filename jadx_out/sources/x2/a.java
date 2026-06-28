package x2;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22642a = "NewbieGuide";

    /* renamed from: b, reason: collision with root package name */
    public static final int f22643b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22644c = -1;

    public static void a(Context context, String str) {
        context.getSharedPreferences(f22642a, 0).edit().putInt(str, 0).apply();
    }

    public static com.yuanqi.master.tools.guide.core.a b(Activity activity) {
        return new com.yuanqi.master.tools.guide.core.a(activity);
    }

    public static com.yuanqi.master.tools.guide.core.a c(Fragment fragment) {
        return new com.yuanqi.master.tools.guide.core.a(fragment);
    }
}
