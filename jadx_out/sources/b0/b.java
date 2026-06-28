package b0;

import android.content.Context;
import v.d;
import z.c;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public static a f630a;

    /* renamed from: b, reason: collision with root package name */
    public static v.a f631b;

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f630a == null) {
            f631b = d.b(context, str);
            f630a = new b();
        }
        return f630a;
    }

    @Override // b0.a
    public c a(z.d dVar) {
        return z.b.b(f631b.a(z.b.a(dVar)));
    }

    @Override // b0.a
    public boolean logCollect(String str) {
        return f631b.logCollect(str);
    }
}
