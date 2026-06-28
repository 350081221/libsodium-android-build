package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ck;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f12369a;

    /* renamed from: b, reason: collision with root package name */
    private final dc f12370b;

    /* renamed from: c, reason: collision with root package name */
    private cq f12371c;

    public ca() {
        this(new ck.a());
    }

    public byte[] a(br brVar) throws bx {
        this.f12369a.reset();
        brVar.write(this.f12371c);
        return this.f12369a.toByteArray();
    }

    public String b(br brVar) throws bx {
        return new String(a(brVar));
    }

    public ca(cs csVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12369a = byteArrayOutputStream;
        dc dcVar = new dc(byteArrayOutputStream);
        this.f12370b = dcVar;
        this.f12371c = csVar.a(dcVar);
    }

    public String a(br brVar, String str) throws bx {
        try {
            return new String(a(brVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new bx("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
