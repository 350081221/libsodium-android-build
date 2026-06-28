package com.huawei.agconnect.apms;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class p0 implements MessageQueue.IdleHandler {
    public final List<q0> abc = new ArrayList();
    public String bcd;

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public final /* synthetic */ q0 abc;

        public abc(q0 q0Var) {
            this.abc = q0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.abc(j0.TIMEOUT);
            p0.this.bcd(this.abc);
            r0.abc.remove(p0.this.bcd);
        }
    }

    public p0(String str) {
        this.bcd = str;
    }

    public final synchronized void bcd(q0 q0Var) {
        synchronized (this.abc) {
            this.abc.remove(q0Var);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        abc(j0.QUEUE_IDLE);
        return false;
    }

    public void abc(q0 q0Var) {
        new Handler(Looper.getMainLooper()).postDelayed(new abc(q0Var), 6000L);
        synchronized (this.abc) {
            if (q0Var != null) {
                this.abc.add(q0Var);
            }
        }
    }

    public final void abc(j0 j0Var) {
        Iterator<q0> it = this.abc.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).abc(j0Var);
        }
    }
}
