package com.uyumao.sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.commonsdk.UMConfigure;
import com.uyumao.b;
import com.uyumao.c;
import com.uyumao.d;
import com.uyumao.e;
import com.uyumao.g;
import com.uyumao.h;
import com.uyumao.l;
import com.uyumao.q;
import com.uyumao.s;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UYMManager {

    /* renamed from: a, reason: collision with root package name */
    public static UYMManager f13714a;

    /* loaded from: classes3.dex */
    public class a implements ActionInfo {
        public a(UYMManager uYMManager) {
        }

        @Override // com.umeng.ccg.ActionInfo
        public String getModule(Context context) {
            return "anti";
        }

        @Override // com.umeng.ccg.ActionInfo
        public String[] getSupportAction(Context context) {
            return new String[]{com.umeng.ccg.a.f12826e, com.umeng.ccg.a.f12825d, com.umeng.ccg.a.f12824c, com.umeng.ccg.a.f12823b};
        }

        @Override // com.umeng.ccg.ActionInfo
        public boolean getSwitchState(Context context, String str) {
            boolean z4;
            if (com.umeng.ccg.a.f12826e.equals(str)) {
                z4 = d.f13650f;
            } else {
                z4 = false;
            }
            if (com.umeng.ccg.a.f12825d.equals(str)) {
                boolean z5 = d.f13645a;
                boolean z6 = d.f13646b;
                if (z5 || z6) {
                    z4 = true;
                }
            }
            if (com.umeng.ccg.a.f12824c.equals(str)) {
                z4 = d.f13649e;
            }
            if (com.umeng.ccg.a.f12823b.equals(str)) {
                boolean z7 = d.f13647c;
                boolean z8 = d.f13648d;
                if (z7 || z8) {
                    return true;
                }
            }
            return z4;
        }

        @Override // com.umeng.ccg.ActionInfo
        public void onCommand(Context context, String str, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean z4 = d.f13645a;
            d.f13651g = context.getApplicationContext();
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("actionName")) {
                        Integer num = d.f13657m.get(jSONObject.optString("actionName"));
                        if (num != null) {
                            g.a(context, num.intValue(), d.e.f13662a, jSONObject);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void enableYm1(Context context, boolean z4) {
        d.f13645a = z4;
    }

    public static void enableYm2(Context context, boolean z4) {
        d.f13646b = z4;
    }

    public static void enableYm3(Context context, boolean z4) {
        d.f13647c = z4;
    }

    public static void enableYm4(Context context, boolean z4) {
        d.f13648d = z4;
    }

    public static void enableYm5(Context context, boolean z4) {
        d.f13649e = z4;
    }

    public static void enableYm6(Context context, boolean z4) {
        d.f13650f = z4;
    }

    public static synchronized UYMManager getInstance() {
        UYMManager uYMManager;
        synchronized (UYMManager.class) {
            if (f13714a == null) {
                f13714a = new UYMManager();
            }
            uYMManager = f13714a;
        }
        return uYMManager;
    }

    public static String getSdkVersion() {
        return "1.1.2";
    }

    public static void processEvent(Context context, String str) {
        boolean z4 = d.f13645a;
        d.f13651g = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("actionName")) {
                    Integer num = d.f13657m.get(jSONObject.optString("actionName"));
                    if (num != null) {
                        g.a(context, num.intValue(), d.e.f13662a, jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void init(Context context) {
        Future<?> future;
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean z4 = true;
        if (!c.f13643a) {
            c.f13643a = true;
            if (applicationContext.getSharedPreferences("uyumao_info", 0).getBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), false)) {
                new Thread(new com.uyumao.a(applicationContext)).start();
            } else {
                l.a().b().execute(new b(applicationContext));
            }
            try {
                h hVar = c.f13644b;
                if (hVar != null) {
                    applicationContext.unregisterReceiver(hVar);
                }
                c.f13644b = new h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                applicationContext.registerReceiver(c.f13644b, intentFilter);
            } catch (Throwable unused) {
            }
        }
        e.f13663a = context;
        try {
            if (Class.forName("com.umeng.commonsdk.UMConfigure").getDeclaredMethod("registerActionInfo", ActionInfo.class) == null) {
                z4 = false;
            }
            if (z4) {
                UMConfigure.registerActionInfo(new a(this));
            }
        } catch (Throwable unused2) {
        }
        if (!d.f13650f) {
            return;
        }
        try {
            WeakReference<Future<?>> weakReference = e.f13664b;
            if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
                e.f13664b = new WeakReference<>(s.a(new q()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
