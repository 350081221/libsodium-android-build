package s;

import android.content.Context;

/* loaded from: classes2.dex */
public class d implements q.b {
    @Override // q.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean c5 = f0.b.c();
        u.a.d("getOAID", "isSupported", Boolean.valueOf(c5));
        if (!c5) {
            return null;
        }
        return f0.b.d(context);
    }
}
