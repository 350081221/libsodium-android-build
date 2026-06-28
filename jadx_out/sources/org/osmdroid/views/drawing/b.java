package org.osmdroid.views.drawing;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes4.dex */
public class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private a f21860a;

    public b(a aVar) {
        this.f21860a = aVar;
    }

    public void a() {
        this.f21860a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        if (message.what == 0 && (aVar = this.f21860a) != null) {
            aVar.g();
        }
    }
}
