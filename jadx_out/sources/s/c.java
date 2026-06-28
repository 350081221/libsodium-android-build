package s;

import android.content.Context;

/* loaded from: classes2.dex */
public class c implements q.b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22327d = 1;

    /* renamed from: a, reason: collision with root package name */
    public x0.b f22328a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22329b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22330c = false;

    @Override // q.b
    public String a(Context context) {
        boolean z4;
        if (context == null) {
            return null;
        }
        if (!this.f22329b) {
            x0.b bVar = new x0.b();
            this.f22328a = bVar;
            if (bVar.a(context, null) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f22330c = z4;
            this.f22329b = true;
        }
        u.a.d("getOAID", "isSupported", Boolean.valueOf(this.f22330c));
        if (!this.f22330c || !this.f22328a.l()) {
            return null;
        }
        return this.f22328a.h();
    }
}
