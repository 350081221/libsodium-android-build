package com.uyumao;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.uyumao.g;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f extends Handler {
    public f(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        g.a aVar;
        if (message.what == 256) {
            int i5 = message.arg1;
            Object obj = message.obj;
            Integer valueOf = Integer.valueOf(i5 / 100);
            HashMap<Integer, g.a> hashMap = g.f13668c;
            if (hashMap != null) {
                if (hashMap.containsKey(valueOf)) {
                    aVar = g.f13668c.get(valueOf);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.a(obj, i5);
                }
            }
        }
    }
}
