package com.tendcloud.tenddata;

/* loaded from: classes3.dex */
public class ax {

    /* renamed from: a, reason: collision with root package name */
    private String f11441a;

    /* renamed from: b, reason: collision with root package name */
    private String f11442b;

    /* renamed from: c, reason: collision with root package name */
    private byte f11443c;

    /* renamed from: d, reason: collision with root package name */
    private byte f11444d;

    /* renamed from: e, reason: collision with root package name */
    private byte f11445e;

    public ax() {
        this.f11441a = "";
        this.f11442b = a1.c.f92a;
        this.f11443c = (byte) -127;
        this.f11444d = (byte) 1;
        this.f11445e = (byte) 1;
    }

    public String a() {
        return this.f11441a;
    }

    public String b() {
        return this.f11442b;
    }

    public byte c() {
        return this.f11443c;
    }

    public byte d() {
        return this.f11444d;
    }

    public byte e() {
        return this.f11445e;
    }

    public ax f() {
        return new ax(this.f11441a, this.f11442b, this.f11443c, this.f11444d, this.f11445e);
    }

    public void setBand(byte b5) {
        this.f11444d = b5;
    }

    public void setBssid(String str) {
        this.f11442b = str;
    }

    public void setChannel(byte b5) {
        this.f11445e = b5;
    }

    public void setRssi(byte b5) {
        this.f11443c = b5;
    }

    public void setSsid(String str) {
        this.f11441a = str;
    }

    public ax(String str, String str2, byte b5, byte b6, byte b7) {
        this.f11441a = str;
        this.f11442b = str2;
        this.f11443c = b5;
        this.f11444d = b6;
        this.f11445e = b7;
    }
}
