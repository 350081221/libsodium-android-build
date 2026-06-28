package com.ss.android.socialbase.downloader.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private volatile Handler f10876a = new Handler(a.f10877a, this);

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Looper f10877a;

        static {
            HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
            handlerThread.start();
            f10877a = handlerThread.getLooper();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        long a();
    }

    public static Looper a() {
        return a.f10877a;
    }

    public void b() {
        Handler handler = this.f10876a;
        if (handler == null) {
            return;
        }
        this.f10876a = null;
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 0) {
            try {
                b bVar = (b) message.obj;
                long a5 = bVar.a();
                if (a5 > 0) {
                    a(bVar, a5);
                    return true;
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        }
        return true;
    }

    public void a(b bVar, long j5) {
        Handler handler = this.f10876a;
        if (handler == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = bVar;
        handler.sendMessageDelayed(obtain, j5);
    }
}
