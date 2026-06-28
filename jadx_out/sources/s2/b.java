package s2;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public class b extends a {
    public b() {
        super("com.tencent.mm");
    }

    @Override // s2.a
    public boolean a(PackageInfo packageInfo) {
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr == null) {
            return false;
        }
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (activityInfo.name.endsWith("WXEntryActivity")) {
                return true;
            }
        }
        return false;
    }
}
