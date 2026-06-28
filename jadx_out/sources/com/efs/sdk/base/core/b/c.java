package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes2.dex */
public final class c extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f6503a = new c(0);
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    public static c a() {
        return a.f6503a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            Log.w("efs.cache", "disk listener not support command: " + message.what);
            return;
        }
        WorkThreadUtil.submit(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z4;
        com.efs.sdk.base.core.b.a unused;
        unused = a.b.f6500a;
        File f5 = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (f5.exists()) {
            for (File file : com.efs.sdk.base.core.util.b.d(f5)) {
                if (com.efs.sdk.base.core.b.a.a(file.getName())) {
                    com.efs.sdk.base.core.b.a.c(file);
                }
            }
        }
        com.efs.sdk.base.core.config.a.c a5 = com.efs.sdk.base.core.config.a.c.a();
        String str2 = "4194304";
        if (!a5.f6564d.f6558g.containsKey("disk_bytes")) {
            str = "4194304";
        } else {
            str = a5.f6564d.f6558g.get("disk_bytes");
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        long parseLong = Long.parseLong(str2);
        long c5 = com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        if (c5 < parseLong) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6502a = z4;
        if (!z4) {
            Log.w("efs.cache", "Cache Limited! curr " + c5 + "byte, max " + parseLong + " byte.");
        }
        sendEmptyMessageDelayed(2, 600000L);
    }

    private c() {
        super(com.efs.sdk.base.core.util.concurrent.a.f6647a.getLooper());
        this.f6502a = true;
        sendEmptyMessageDelayed(2, OpenStreetMapTileProviderConstants.ONE_MINUTE);
    }
}
