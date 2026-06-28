package com.tendcloud.tenddata;

import android.util.EventLogTags;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes3.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f11422a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f11423b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile IvParameterSpec f11424c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile byte[] f11425d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile SecretKey f11426e;

    static {
        synchronized (EventLogTags.class) {
            try {
                if (f11423b == 0) {
                    f11423b = aw.a();
                }
                if (f11424c == null) {
                    f11424c = au.a();
                }
                if (f11425d == null) {
                    f11425d = au.b();
                }
                if (f11426e == null) {
                    f11426e = au.a(String.valueOf(f11423b).toCharArray(), f11425d);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private as() {
    }

    public static byte[] a(byte[] bArr) {
        try {
            return au.a(bArr, f11426e, f11424c);
        } catch (Throwable unused) {
            return f11422a;
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return au.b(bArr, f11426e, f11424c);
        } catch (Throwable unused) {
            return f11422a;
        }
    }
}
