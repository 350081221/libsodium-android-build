package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public String f8347b;

    /* renamed from: a, reason: collision with root package name */
    public int f8346a = 4;

    /* renamed from: c, reason: collision with root package name */
    public b f8348c = new e();

    public void a(Context context, int i5, String str) {
        this.f8346a = i5;
        this.f8347b = str;
        this.f8348c.a(context, "HMSCore");
    }

    public void b(int i5, String str, String str2, Throwable th) {
        if (a(i5)) {
            c a5 = a(i5, str, str2, th);
            String str3 = a5.c() + a5.a();
            this.f8348c.a(str3, i5, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    public b a() {
        return this.f8348c;
    }

    public void a(b bVar) {
        this.f8348c = bVar;
    }

    public boolean a(int i5) {
        return i5 >= this.f8346a;
    }

    public void a(int i5, String str, String str2) {
        if (a(i5)) {
            c a5 = a(i5, str, str2, null);
            this.f8348c.a(a5.c() + a5.a(), i5, str, str2);
        }
    }

    public void a(String str, String str2) {
        c a5 = a(4, str, str2, null);
        this.f8348c.a(a5.c() + '\n' + a5.a(), 4, str, str2);
    }

    public final c a(int i5, String str, String str2, Throwable th) {
        c cVar = new c(8, this.f8347b, i5, str);
        cVar.a((c) str2);
        cVar.a(th);
        return cVar;
    }
}
