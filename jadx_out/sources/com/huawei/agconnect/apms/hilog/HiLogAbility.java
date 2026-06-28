package com.huawei.agconnect.apms.hilog;

import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.agconnect.apms.hilog.HiLogAbility;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class HiLogAbility {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public long abc;
    public final HandlerThread bcd;
    public final Handler cde;

    static {
        System.loadLibrary("hilog");
    }

    public HiLogAbility(String str, int i5, String str2, boolean z4) {
        this.abc = 0L;
        try {
            this.abc = initNative(str, i5, str2, z4);
        } catch (Exception e5) {
            def.error("HiLogAbility", e5);
        }
        if (this.abc == 0) {
            def.error("HiLogAbility HiLog init fail");
        }
        HandlerThread handlerThread = new HandlerThread("hilog");
        this.bcd = handlerThread;
        handlerThread.start();
        this.cde = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cde() {
        try {
            flushAsyncNative(this.abc);
        } catch (Exception e5) {
            def.error("HiLogAbility", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void def(String str) {
        try {
            writeNative(this.abc, str);
        } catch (Exception e5) {
            def.error("HiLogAbility", e5);
        }
    }

    public static native void enableDebugNative();

    public static native long initNative(String str, int i5, String str2, boolean z4);

    public void abc() {
        if (this.abc != 0) {
            this.cde.post(new Runnable() { // from class: t1.c
                @Override // java.lang.Runnable
                public final void run() {
                    HiLogAbility.this.cde();
                }
            });
        }
    }

    public void bcd(final String str) {
        if (this.abc != 0) {
            this.cde.post(new Runnable() { // from class: t1.d
                @Override // java.lang.Runnable
                public final void run() {
                    HiLogAbility.this.def(str);
                }
            });
        }
    }

    public final native void changeLogPathNative(long j5, String str);

    public final native void flushAsyncNative(long j5);

    public final native void releaseNative(long j5);

    public final native void writeNative(long j5, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cde(String str) {
        try {
            changeLogPathNative(this.abc, str);
        } catch (Exception e5) {
            def.error("HiLogAbility", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void def() {
        try {
            releaseNative(this.abc);
        } catch (Exception e5) {
            def.error("HiLogAbility", e5);
        }
        this.abc = 0L;
        this.bcd.quitSafely();
    }

    public void abc(final String str) {
        if (this.abc != 0) {
            this.cde.postAtFrontOfQueue(new Runnable() { // from class: t1.a
                @Override // java.lang.Runnable
                public final void run() {
                    HiLogAbility.this.cde(str);
                }
            });
        }
    }

    public void bcd() {
        if (this.abc != 0) {
            this.cde.post(new Runnable() { // from class: t1.b
                @Override // java.lang.Runnable
                public final void run() {
                    HiLogAbility.this.def();
                }
            });
        }
    }
}
