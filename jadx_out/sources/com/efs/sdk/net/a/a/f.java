package com.efs.sdk.net.a.a;

import java.io.InputStream;
import p4.m;

/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public interface a {
        String a(int i5);

        String b(int i5);

        int e();
    }

    /* loaded from: classes2.dex */
    public interface b extends c {
        String b();

        String c();

        @m
        byte[] d();
    }

    /* loaded from: classes2.dex */
    public interface c extends a {
        String a();
    }

    /* loaded from: classes2.dex */
    public interface d extends e {
    }

    /* loaded from: classes2.dex */
    public interface e extends a {
        String a();

        int b();
    }

    @m
    InputStream a(String str, @m String str2, @m String str3, @m InputStream inputStream);

    void a();

    void a(b bVar);

    void a(d dVar);

    String b();
}
