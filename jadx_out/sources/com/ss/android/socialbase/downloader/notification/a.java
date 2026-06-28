package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Notification f11227a;

    /* renamed from: b, reason: collision with root package name */
    private int f11228b;

    /* renamed from: c, reason: collision with root package name */
    private long f11229c;

    /* renamed from: d, reason: collision with root package name */
    private long f11230d;

    /* renamed from: e, reason: collision with root package name */
    private String f11231e;

    /* renamed from: f, reason: collision with root package name */
    private int f11232f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f11233g;

    /* renamed from: h, reason: collision with root package name */
    private int f11234h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11235i;

    public a(int i5, String str) {
        this.f11228b = i5;
        this.f11231e = str;
    }

    public abstract void a(BaseException baseException, boolean z4);

    public void a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.f11228b = downloadInfo.getId();
        this.f11231e = downloadInfo.getTitle();
    }

    public long b() {
        return this.f11229c;
    }

    public long c() {
        return this.f11230d;
    }

    public String d() {
        return this.f11231e;
    }

    public int e() {
        return this.f11232f;
    }

    public long f() {
        if (this.f11233g == 0) {
            this.f11233g = System.currentTimeMillis();
        }
        return this.f11233g;
    }

    public synchronized void g() {
        this.f11234h++;
    }

    public boolean h() {
        return this.f11235i;
    }

    public void b(long j5) {
        this.f11230d = j5;
    }

    public int a() {
        return this.f11228b;
    }

    public void a(long j5) {
        this.f11229c = j5;
    }

    public void a(int i5, BaseException baseException, boolean z4) {
        a(i5, baseException, z4, false);
    }

    public void a(int i5, BaseException baseException, boolean z4, boolean z5) {
        if (z5 || this.f11232f != i5) {
            this.f11232f = i5;
            a(baseException, z4);
        }
    }

    public void a(long j5, long j6) {
        this.f11229c = j5;
        this.f11230d = j6;
        this.f11232f = 4;
        a((BaseException) null, false);
    }

    public void a(Notification notification) {
        if (this.f11228b == 0 || notification == null) {
            return;
        }
        b.a().a(this.f11228b, this.f11232f, notification);
    }
}
