package com.efs.sdk.pa.a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes2.dex */
final class e implements Printer {

    /* renamed from: f, reason: collision with root package name */
    private long f6888f;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6884b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f6885c = null;

    /* renamed from: d, reason: collision with root package name */
    private long f6886d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f6887e = -1;

    /* renamed from: a, reason: collision with root package name */
    Vector<d> f6883a = new Vector<>();

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f6886d = SystemClock.elapsedRealtime();
            this.f6887e = SystemClock.currentThreadTimeMillis();
            this.f6885c = str;
            this.f6884b = true;
            Iterator<d> it = this.f6883a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f6884b && str.startsWith("<")) {
            this.f6884b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6886d;
            if (elapsedRealtime > this.f6888f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f6887e;
                Iterator<d> it2 = this.f6883a.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f6885c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
