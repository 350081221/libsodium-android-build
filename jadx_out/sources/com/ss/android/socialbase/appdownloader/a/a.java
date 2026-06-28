package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class a implements e {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f10187a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.ss.android.socialbase.downloader.g.a f10188b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f10189c;

    public a(Context context, com.ss.android.socialbase.downloader.g.a aVar, String str) {
        this.f10187a = context;
        this.f10188b = aVar;
        this.f10189c = str;
    }

    public boolean a() {
        if (this.f10187a == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                Log.e("AbsDevicePlan", "check is valid failed!", th);
            }
        }
        if (b().resolveActivity(this.f10187a.getPackageManager()) == null) {
            return false;
        }
        return true;
    }
}
