package com.efs.sdk.net.a.a;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f f6793a;

    /* renamed from: b, reason: collision with root package name */
    public ByteArrayOutputStream f6794b;

    /* renamed from: c, reason: collision with root package name */
    public a f6795c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6796d;

    public h(f fVar, String str) {
        this.f6793a = fVar;
        this.f6796d = str;
    }

    public final boolean a() {
        return this.f6794b != null;
    }

    public final void b() {
        if (a()) {
        } else {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }
}
