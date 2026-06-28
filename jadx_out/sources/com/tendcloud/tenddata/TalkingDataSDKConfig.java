package com.tendcloud.tenddata;

/* loaded from: classes3.dex */
public class TalkingDataSDKConfig {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11311a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11312b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11313c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11314d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11315e = true;

    public int getRules() {
        int i5;
        int i6;
        int i7;
        boolean z4 = this.f11311a;
        int i8 = 0;
        if (this.f11312b) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        if (this.f11313c) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        if (this.f11314d) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if (this.f11315e) {
            i8 = 16;
        }
        return (z4 ? 1 : 0) | i5 | i8 | i7 | i6;
    }

    public boolean isAppListEnabled() {
        return this.f11313c;
    }

    public boolean isIMEIAndMEIDEnabled() {
        return this.f11312b;
    }

    public boolean isLocationEnabled() {
        return this.f11314d;
    }

    public boolean isMACEnabled() {
        return this.f11311a;
    }

    public boolean isWiFiEnable() {
        return this.f11315e;
    }

    public TalkingDataSDKConfig setAppListEnabled(boolean z4) {
        this.f11313c = z4;
        return this;
    }

    public TalkingDataSDKConfig setIMEIAndMEIDEnabled(boolean z4) {
        this.f11312b = z4;
        return this;
    }

    public TalkingDataSDKConfig setLocationEnabled(boolean z4) {
        this.f11314d = z4;
        return this;
    }

    public TalkingDataSDKConfig setMACEnabled(boolean z4) {
        this.f11311a = z4;
        return this;
    }

    public TalkingDataSDKConfig setWifiEnabled(boolean z4) {
        this.f11315e = z4;
        return this;
    }
}
