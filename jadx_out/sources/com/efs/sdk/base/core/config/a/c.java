package com.efs.sdk.base.core.config.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f6561a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public IConfigRefreshAction f6562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6563c;

    /* renamed from: d, reason: collision with root package name */
    public b f6564d;

    /* renamed from: e, reason: collision with root package name */
    public Map<IConfigCallback, String[]> f6565e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f6566f;

    /* renamed from: g, reason: collision with root package name */
    private e f6567g;

    /* renamed from: h, reason: collision with root package name */
    private long f6568h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f6570a = new c(0);
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    private void e() {
        f fVar;
        fVar = f.a.f6531a;
        if (!fVar.a()) {
            Log.i("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.f6563c) {
            Log.i("efs.config", "disable refresh config from remote");
            return;
        }
        String refresh = g().refresh();
        Log.i("efs.config", "from server. efs config is ".concat(String.valueOf(refresh)));
        if (TextUtils.isEmpty(refresh)) {
            return;
        }
        a(refresh);
    }

    private void f() {
        boolean z4;
        try {
            z4 = this.f6567g.a(this.f6564d);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (!z4) {
            this.f6566f.sendEmptyMessageDelayed(3, a1.b.f90a);
        }
    }

    @NonNull
    private IConfigRefreshAction g() {
        IConfigRefreshAction iConfigRefreshAction = this.f6562b;
        return iConfigRefreshAction == null ? com.efs.sdk.base.core.config.a.a.a() : iConfigRefreshAction;
    }

    private boolean h() {
        e.b();
        long j5 = 0;
        try {
            e eVar = this.f6567g;
            eVar.c();
            if (eVar.f6572a != null) {
                j5 = eVar.f6572a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        if (System.currentTimeMillis() - j5 >= this.f6564d.f6556e * 60 * 1000) {
            return true;
        }
        return false;
    }

    private void i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.f6564d.f6558g).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers().iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            Log.e("efs.config", th);
        }
    }

    public final Map<String, String> c() {
        return new HashMap(this.f6564d.f6558g);
    }

    public final void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : c.this.f6565e.keySet()) {
                        String[] strArr = (String[]) c.this.f6565e.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (c.this.f6564d.f6558g.containsKey(str)) {
                                    hashMap.put(str, c.this.c().get(str));
                                    Log.i("efs.config", "--->>> configCallback key is " + str + " ## value is " + c.this.c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    c.this.f6565e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        b bVar;
        f fVar;
        int i5 = message.what;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        f();
                    }
                } else {
                    try {
                        fVar = f.a.f6531a;
                        if (fVar.a()) {
                            if (!h()) {
                                Log.i("efs.config", "No update is required, less than 8h since the last update");
                            } else {
                                e();
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } else {
                int i6 = message.arg1;
                if (i6 <= this.f6564d.f6552a) {
                    Log.i("efs.config", "current config version is " + i6 + ", no need to refresh");
                    Log.i("efs.config", "current config version(" + this.f6564d.f6552a + ") is " + i6 + ", no need to refresh");
                } else {
                    e();
                }
            }
        } else {
            boolean a5 = e.a();
            Log.i("efs.config", "delete old config is ".concat(String.valueOf(a5)));
            if (a5) {
                this.f6566f.sendEmptyMessage(1);
            } else {
                e eVar = this.f6567g;
                eVar.c();
                if (eVar.f6572a == null) {
                    bVar = null;
                } else {
                    b a6 = b.a();
                    a6.f6552a = eVar.f6572a.getInt("cver", -1);
                    Set<String> keySet = eVar.f6572a.getAll().keySet();
                    HashMap hashMap = new HashMap();
                    for (String str : keySet) {
                        String string = eVar.f6572a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str, string);
                        }
                    }
                    a6.a(hashMap);
                    a6.a(eVar.f6572a.getString("sign", ""));
                    bVar = a6;
                }
                if (bVar == null) {
                    Log.i("efs.config", "first load local config false.");
                } else if (a(bVar)) {
                    Log.i("efs.config", "current config to same.");
                } else {
                    this.f6564d = bVar;
                    String str2 = "load config from storage";
                    if (-1 != bVar.f6552a) {
                        i();
                        d();
                        str2 = "load config from storage and notify observer";
                    }
                    Log.i("efs.config", str2);
                }
            }
        }
        return true;
    }

    private c() {
        this.f6563c = true;
        this.f6565e = new HashMap();
        this.f6566f = new Handler(com.efs.sdk.base.core.util.concurrent.a.f6647a.getLooper(), this);
        this.f6567g = new e();
        this.f6564d = b.a();
        this.f6568h = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
    }

    public static c a() {
        return a.f6570a;
    }

    public final void b() {
        this.f6566f.sendEmptyMessage(0);
        this.f6566f.sendEmptyMessageDelayed(2, this.f6568h);
    }

    public final void a(int i5) {
        if (i5 <= this.f6564d.f6552a) {
            Log.i("efs.config", "current config version is " + i5 + ", no need to refresh");
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i5;
        obtain.what = 1;
        this.f6566f.sendMessage(obtain);
    }

    public final String a(boolean z4) {
        if (z4) {
            return "https://" + this.f6564d.f6555d;
        }
        return this.f6564d.f6554c + this.f6564d.f6555d;
    }

    public final void a(String str) {
        b a5 = b.a();
        if (d.a(str, a5)) {
            if (a(a5)) {
                return;
            }
            this.f6564d = a5;
            f();
            i();
            d();
            return;
        }
        this.f6566f.sendEmptyMessageDelayed(1, a1.b.f90a);
    }

    private boolean a(b bVar) {
        if (this.f6564d.f6552a >= bVar.f6552a) {
            return true;
        }
        Log.i("efs.config", "current config version (" + this.f6564d.f6552a + ") is older than another (" + bVar.f6552a + ")");
        return false;
    }
}
