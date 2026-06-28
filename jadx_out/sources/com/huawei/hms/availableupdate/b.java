package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8339c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8340d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8341a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public List<Activity> f8342b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f8340d) {
            for (Activity activity2 : this.f8342b) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f8342b.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (f8340d) {
            this.f8342b.remove(activity);
        }
    }

    public void a(boolean z4) {
        this.f8341a.set(z4);
    }

    public AtomicBoolean a() {
        return this.f8341a;
    }
}
