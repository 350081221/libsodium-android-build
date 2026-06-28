package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class bt extends ByteArrayOutputStream {
    public bt(int i5) {
        super(i5);
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int b() {
        return ((ByteArrayOutputStream) this).count;
    }

    public bt() {
    }
}
