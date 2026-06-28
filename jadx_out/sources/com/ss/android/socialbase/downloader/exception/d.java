package com.ss.android.socialbase.downloader.exception;

/* loaded from: classes3.dex */
public class d extends BaseException {

    /* renamed from: a, reason: collision with root package name */
    private final long f10697a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10698b;

    public d(long j5, long j6) {
        super(1006, String.format("space is not enough required space is : %s but available space is :%s", String.valueOf(j6), String.valueOf(j5)));
        this.f10697a = j5;
        this.f10698b = j6;
    }

    public long a() {
        return this.f10697a;
    }

    public long b() {
        return this.f10698b;
    }
}
