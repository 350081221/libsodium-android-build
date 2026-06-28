package com.efs.sdk.base.core.c;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    static FileLock f6527b;

    /* renamed from: a, reason: collision with root package name */
    volatile int f6528a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f6531a = new f(0);

        public static /* synthetic */ f a() {
            return f6531a;
        }
    }

    /* synthetic */ f(byte b5) {
        this();
    }

    public final boolean a() {
        if (this.f6528a == 2) {
            return true;
        }
        if (this.f6528a != 0) {
            return false;
        }
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        return false;
    }

    private f() {
        this.f6528a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    private synchronized void a(final Context context) {
        Log.w("efs.send_log", "tryFileLock start! ");
        this.f6528a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.c.f.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock lock;
                try {
                    File a5 = com.efs.sdk.base.core.util.a.a(context);
                    if (!a5.exists()) {
                        a5.mkdirs();
                    }
                    File file = new File(a5.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        f.f6527b = lock;
                    } while (!lock.isValid());
                    Log.w("efs.send_log", "tryFileLock sendlock sucess! processname: " + ProcessUtil.getCurrentProcessName());
                    f.this.f6528a = 2;
                } catch (Exception e5) {
                    Log.w("efs.send_log", "tryFileLock fail! " + e5.getMessage());
                    f.this.f6528a = 0;
                }
            }
        }).start();
    }
}
