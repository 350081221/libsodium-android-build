package com.bytedance.pangle.f;

import android.os.RemoteException;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.d;

/* loaded from: classes2.dex */
public final class c extends ZeusPluginStateListener {

    /* renamed from: a, reason: collision with root package name */
    final int f4407a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4408b;

    public c(d dVar, int i5) {
        this.f4408b = dVar;
        this.f4407a = i5;
    }

    @Override // com.bytedance.pangle.ZeusPluginStateListener
    public final void onStateChangeOnCurThread(String str, int i5, Object... objArr) {
        if (i5 == 5 || i5 == 7 || i5 == 6) {
            String str2 = "";
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        str2 = String.valueOf(objArr[0]);
                    }
                } catch (RemoteException unused) {
                    return;
                }
            }
            this.f4408b.a(str, i5, str2);
        }
    }
}
