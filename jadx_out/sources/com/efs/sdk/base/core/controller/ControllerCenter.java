package com.efs.sdk.base.core.controller;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.a.a;
import com.efs.sdk.base.core.d.b;
import com.efs.sdk.base.core.e.d;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ControllerCenter implements Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    private static GlobalEnvStruct f6573h;

    /* renamed from: a, reason: collision with root package name */
    private int f6574a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f6575b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f6576c = 1;

    /* renamed from: d, reason: collision with root package name */
    private final int f6577d = 2;

    /* renamed from: e, reason: collision with root package name */
    private final int f6578e = 3;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f6579f = false;

    /* renamed from: g, reason: collision with root package name */
    private a f6580g;

    /* renamed from: i, reason: collision with root package name */
    private Handler f6581i;

    public ControllerCenter(EfsReporter.Builder builder) {
        f6573h = builder.getGlobalEnvStruct();
        Handler handler = new Handler(com.efs.sdk.base.core.util.concurrent.a.f6647a.getLooper(), this);
        this.f6581i = handler;
        handler.sendEmptyMessage(0);
    }

    private void a() {
        if (this.f6580g == null) {
            this.f6580g = new a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f6573h.mAppContext.registerReceiver(this.f6580g, intentFilter);
        } catch (Throwable th) {
            Log.w("efs.base", "register network change receiver error", th);
            int i5 = this.f6574a + 1;
            this.f6574a = i5;
            if (i5 < 3) {
                this.f6581i.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    private void b(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.controller.ControllerCenter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(GlobalInfoManager.getInstance().getGlobalInfo());
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        ControllerCenter.a(iLogProtocol);
                    }
                    if (!ControllerCenter.getGlobalEnvStruct().isEnableSendLog()) {
                        return;
                    }
                    final b a5 = b.a(iLogProtocol);
                    final d a6 = d.a.a();
                    WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.e.d.1

                        /* renamed from: a */
                        final /* synthetic */ com.efs.sdk.base.core.d.b f6602a;

                        public AnonymousClass1(final com.efs.sdk.base.core.d.b a52) {
                            r2 = a52;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.f6601a.a(r2);
                        }
                    });
                } catch (Throwable th) {
                    Log.e("efs.base", "log send error", th);
                }
            }
        });
    }

    @NonNull
    public static GlobalEnvStruct getGlobalEnvStruct() {
        return f6573h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        int i5 = message.what;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 3) {
                    a();
                }
            } else {
                Object obj = message.obj;
                if (obj != null && (obj instanceof ILogProtocol)) {
                    b((ILogProtocol) obj);
                }
            }
        } else {
            GlobalInfoManager.getInstance().initGlobalInfo();
            f.a.a();
            c.a().b();
            a();
            com.efs.sdk.base.core.f.f a5 = f.a.a();
            boolean isIntl = f6573h.isIntl();
            com.efs.sdk.base.core.f.c cVar = a5.f6618a;
            if (isIntl) {
                cVar.f6610a = "https://errnewlogos.umeng.com/api/crashsdk/logcollect";
                cVar.f6611b = "4ea4e41a3993";
            } else {
                cVar.f6610a = "https://errnewlog.umeng.com/api/crashsdk/logcollect";
                cVar.f6611b = "28ef1713347d";
            }
            a5.f6619b = this;
            a5.f6620c.f6605a = this;
            a5.f6621d.f6605a = this;
            this.f6579f = true;
            com.efs.sdk.base.core.c.d.a().sendEmptyMessageDelayed(0, f6573h.getLogSendDelayMills());
            com.efs.sdk.base.core.f.f a6 = f.a.a();
            if (a6.f6619b != null && getGlobalEnvStruct().isEnableWaStat()) {
                a6.f6619b.send(new com.efs.sdk.base.core.f.b("efs_core", "pvuv", a6.f6618a.f6612c));
            }
        }
        return true;
    }

    public void send(ILogProtocol iLogProtocol) {
        if (!this.f6579f) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = iLogProtocol;
            this.f6581i.sendMessage(obtain);
            return;
        }
        b(iLogProtocol);
    }

    @Nullable
    public HttpResponse sendSyncImmediately(String str, int i5, String str2, boolean z4, File file) {
        b bVar = new b(str, (byte) 2);
        bVar.b(1);
        bVar.f6594d = file;
        bVar.a(str2);
        bVar.a(i5);
        bVar.f6592b.f6596b = z4;
        bVar.c();
        d.a.a().f6601a.a(bVar);
        return bVar.f6592b.f6597c;
    }

    static /* synthetic */ void a(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : getGlobalEnvStruct().getCallback(9)) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("log_type", iLogProtocol.getLogType());
            hashMap.put("log_data", iLogProtocol.generateString());
            hashMap.put("link_key", iLogProtocol.getLinkKey());
            hashMap.put("link_id", iLogProtocol.getLinkId());
            Message obtain = Message.obtain(null, 9, hashMap);
            Message obtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
