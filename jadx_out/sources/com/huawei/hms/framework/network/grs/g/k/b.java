package com.huawei.hms.framework.network.grs.g.k;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f8498a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8499b = SystemClock.elapsedRealtime();

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f8498a = future;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f8498a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f8499b <= 300000;
    }
}
