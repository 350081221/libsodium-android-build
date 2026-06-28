package com.tendcloud.tenddata;

import android.os.Process;
import java.util.Properties;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class cq extends Properties implements Comparable<cq> {

    /* renamed from: a, reason: collision with root package name */
    private String f11624a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f11625b;

    /* renamed from: c, reason: collision with root package name */
    private int f11626c;

    /* renamed from: d, reason: collision with root package name */
    private int f11627d;

    /* renamed from: e, reason: collision with root package name */
    private CRC32 f11628e;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final String DATA = "data";
        public static final String LENGTH = "length";
        public static final String RCS32 = "rcs32";
    }

    public cq(String str) {
        this.f11624a = str;
    }

    public static String a() {
        return System.currentTimeMillis() + "_" + Long.toString(Process.myPid());
    }

    public String b() {
        return this.f11624a;
    }

    public byte[] c() {
        return this.f11625b;
    }

    public int d() {
        return this.f11626c;
    }

    public int e() {
        return this.f11627d;
    }

    public final void writeData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (this.f11628e == null) {
            this.f11628e = new CRC32();
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f11625b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f11627d = this.f11625b.length;
        this.f11628e.reset();
        this.f11628e.update(this.f11625b);
        this.f11626c = (int) this.f11628e.getValue();
    }

    public int a(String str, int i5) {
        String str2 = (String) setProperty(str, String.valueOf(i5));
        if (str2 == null) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    public byte[] b(String str) {
        return c(super.getProperty(str));
    }

    public byte[] c(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    public cq(byte[] bArr) {
        this(a(), bArr);
    }

    private cq(String str, byte[] bArr) {
        this(str);
        this.f11628e = new CRC32();
        writeData(bArr);
    }

    public byte[] a(String str, byte[] bArr) {
        String str2 = (String) setProperty(str, a(bArr));
        if (str2 == null) {
            return null;
        }
        return c(str2);
    }

    public int a(String str) {
        return Integer.parseInt(super.getProperty(str));
    }

    public String a(byte[] bArr) {
        return new String(bArr);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cq cqVar) {
        return b().compareTo(cqVar.b());
    }
}
