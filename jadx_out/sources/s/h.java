package s;

import android.content.Context;

/* loaded from: classes2.dex */
public class h implements q.b {
    @Override // q.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean e5 = t0.e.e(context);
        u.a.d("getOAID", "isSupported", Boolean.valueOf(e5));
        if (!e5) {
            return null;
        }
        return t0.e.a(context);
    }
}
