package com.bytedance.sdk.openadsdk;

/* loaded from: classes2.dex */
public class TTLocation implements LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    private double f4754a;

    /* renamed from: b, reason: collision with root package name */
    private double f4755b;

    public TTLocation(double d5, double d6) {
        this.f4754a = d5;
        this.f4755b = d6;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLatitude() {
        return this.f4754a;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLongitude() {
        return this.f4755b;
    }

    public void setLatitude(double d5) {
        this.f4754a = d5;
    }

    public void setLongitude(double d5) {
        this.f4755b = d5;
    }
}
