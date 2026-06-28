package com.efs.sdk.base.core.c;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.b.h;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f6517a;

    /* renamed from: b, reason: collision with root package name */
    public c f6518b;

    /* renamed from: c, reason: collision with root package name */
    private c f6519c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f6520d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicInteger f6521e;

    /* renamed from: f, reason: collision with root package name */
    private com.efs.sdk.base.core.b.f f6522f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f6523a = new d(0);
    }

    /* synthetic */ d(byte b5) {
        this();
    }

    public static d a() {
        return a.f6523a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar;
        com.efs.sdk.base.core.b.a aVar;
        List<File> list;
        com.efs.sdk.base.core.f.f fVar2;
        int i5;
        super.handleMessage(message);
        fVar = f.a.f6531a;
        if (fVar.a()) {
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 == 1) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f6520d.remove(obj.toString());
                    }
                    if (message.arg1 != 0) {
                        i5 = this.f6521e.incrementAndGet();
                    } else {
                        i5 = 0;
                    }
                    if (this.f6520d.isEmpty()) {
                        if (i5 < 5) {
                            sendEmptyMessage(0);
                            return;
                        }
                        this.f6521e.set(0);
                        sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                        Log.i("efs.send_log", "request error cnt gt 5, next request delay 10s");
                        return;
                    }
                    return;
                }
                return;
            }
            String netStatus = GlobalInfoManager.getInstance().getNetStatus();
            if (!NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(netStatus) && !NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(netStatus)) {
                List<com.efs.sdk.base.core.d.b> emptyList = Collections.emptyList();
                try {
                    aVar = a.b.f6500a;
                    int i7 = this.f6517a;
                    com.efs.sdk.base.core.b.f fVar3 = this.f6522f;
                    aVar.a();
                    aVar.a();
                    File f5 = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
                    if (!f5.exists()) {
                        list = Collections.emptyList();
                    } else {
                        List<File> d5 = com.efs.sdk.base.core.util.b.d(f5);
                        if (aVar.f6497b) {
                            fVar2 = f.a.f6622a;
                            int size = d5.size();
                            if (fVar2.f6619b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                                com.efs.sdk.base.core.f.b bVar = new com.efs.sdk.base.core.f.b("efs_core", "log_lag", fVar2.f6618a.f6612c);
                                bVar.put("cnt", Integer.valueOf(size));
                                fVar2.f6619b.send(bVar);
                            }
                            aVar.f6497b = false;
                        }
                        Collections.sort(d5, aVar.f6499d);
                        ArrayList arrayList = new ArrayList(i7);
                        for (int size2 = d5.size() - 1; size2 >= 0 && arrayList.size() < i7; size2--) {
                            File file = d5.get(size2);
                            if (file.exists() && (fVar3 == null || !fVar3.a(file))) {
                                arrayList.add(file);
                            }
                        }
                        list = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList(i7);
                    for (File file2 : list) {
                        com.efs.sdk.base.core.d.b a5 = aVar.a(file2);
                        if (a5 == null) {
                            Log.w("efs.cache", "file upload error, name is " + file2.getName());
                        } else {
                            arrayList2.add(a5);
                        }
                    }
                    emptyList = arrayList2;
                } catch (Throwable unused) {
                }
                for (com.efs.sdk.base.core.d.b bVar2 : emptyList) {
                    if ("wa".equals(bVar2.f6591a.f6584a) || b.a().a(bVar2.f6591a.f6584a, bVar2.a())) {
                        c cVar = this.f6518b;
                        if ("wa".equals(bVar2.f6591a.f6584a)) {
                            cVar = this.f6519c;
                        }
                        String uuid = UUID.randomUUID().toString();
                        this.f6520d.add(uuid);
                        if (WorkThreadUtil.submit(new e(bVar2, cVar, uuid)) == null) {
                            a(uuid, -1);
                        }
                    }
                }
                if (this.f6520d.size() <= 0) {
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                    return;
                }
                return;
            }
            Log.i("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(netStatus)));
            sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
        }
    }

    private d() {
        super(com.efs.sdk.base.core.util.concurrent.a.f6647a.getLooper());
        this.f6517a = 5;
        this.f6520d = new ArrayList();
        this.f6521e = new AtomicInteger(0);
        this.f6518b = new com.efs.sdk.base.core.c.a();
        this.f6519c = new com.efs.sdk.base.core.f.e();
        this.f6522f = new h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj, int i5) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i5;
        sendMessage(obtain);
    }
}
