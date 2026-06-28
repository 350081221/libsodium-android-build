package com.uyumao;

import android.content.Context;
import com.uyumao.j;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13641a;

    public a(Context context) {
        this.f13641a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context context = this.f13641a;
            if (j.f13678a == null && context != null) {
                j.f13678a = context.getApplicationContext();
            }
            c.a(this.f13641a, c.a(this.f13641a, j.a.f13679a.a(), (JSONArray) null), false);
        } catch (Throwable unused) {
        }
    }
}
