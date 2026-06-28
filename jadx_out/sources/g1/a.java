package g1;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16107c;

    public a(String str, String str2, long j5) {
        this.f16105a = str;
        this.f16106b = str2;
        this.f16107c = j5;
    }

    public static boolean d(a aVar) {
        return aVar == null || TextUtils.isEmpty(aVar.f16105a);
    }

    public String a() {
        return this.f16105a;
    }

    public String b() {
        return this.f16106b;
    }

    public long c() {
        return this.f16107c;
    }
}
