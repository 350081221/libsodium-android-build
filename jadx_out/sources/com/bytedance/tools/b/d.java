package com.bytedance.tools.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<a> f6285a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Message message);
    }

    public d(Looper looper, a aVar) {
        super(looper);
        this.f6285a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f6285a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }
}
