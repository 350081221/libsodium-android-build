package com.a.a.a;

import com.bytedance.librarian.Librarian;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e implements com.bytedance.android.alog.a {
    @Override // com.bytedance.android.alog.a
    public void a(String str) {
        try {
            Librarian.loadLibraryForModule("alog", a.f751b.a());
        } catch (Throwable unused) {
            System.loadLibrary("alog");
        }
    }
}
