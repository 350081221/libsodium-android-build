package com.ss.android.socialbase.appdownloader.f.a;

import java.io.IOException;

/* loaded from: classes3.dex */
public class b {
    public static final void a(d dVar, int i5) throws IOException {
        int b5 = dVar.b();
        if (b5 == i5) {
            return;
        }
        throw new IOException("Expected chunk of type 0x" + Integer.toHexString(i5) + ", read 0x" + Integer.toHexString(b5) + ".");
    }
}
