package s;

import android.content.Context;

/* loaded from: classes2.dex */
public class f implements q.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22332a = false;

    @Override // q.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f22332a) {
            d0.a.f(context);
            this.f22332a = true;
        }
        boolean b5 = d0.a.b();
        u.a.d("getOAID", "isSupported", Boolean.valueOf(b5));
        if (!b5) {
            return null;
        }
        return d0.a.c(context);
    }
}
