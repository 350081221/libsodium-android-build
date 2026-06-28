package com.ss.android.socialbase.downloader.network;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final double f11187a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11188b;

    /* renamed from: c, reason: collision with root package name */
    private double f11189c = -1.0d;

    /* renamed from: d, reason: collision with root package name */
    private int f11190d;

    public d(double d5) {
        int ceil;
        this.f11187a = d5;
        if (d5 == 0.0d) {
            ceil = Integer.MAX_VALUE;
        } else {
            ceil = (int) Math.ceil(1.0d / d5);
        }
        this.f11188b = ceil;
    }

    public void a(double d5) {
        double d6 = 1.0d - this.f11187a;
        int i5 = this.f11190d;
        if (i5 > this.f11188b) {
            this.f11189c = Math.exp((d6 * Math.log(this.f11189c)) + (this.f11187a * Math.log(d5)));
        } else if (i5 > 0) {
            double d7 = (d6 * i5) / (i5 + 1.0d);
            this.f11189c = Math.exp((d7 * Math.log(this.f11189c)) + ((1.0d - d7) * Math.log(d5)));
        } else {
            this.f11189c = d5;
        }
        this.f11190d++;
    }

    public double a() {
        return this.f11189c;
    }
}
