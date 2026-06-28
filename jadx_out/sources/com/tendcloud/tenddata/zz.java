package com.tendcloud.tenddata;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.ss.android.download.api.constant.BaseConstants;
import com.tendcloud.tenddata.af;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class zz implements ao {

    /* renamed from: a, reason: collision with root package name */
    public static String f11851a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f11852b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f11853c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f11854d = false;

    /* renamed from: e, reason: collision with root package name */
    public static b f11855e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11856f = 102;

    /* renamed from: g, reason: collision with root package name */
    private static volatile zz f11857g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final String f11858h = "Function startA was not executed correctly!";

    /* renamed from: i, reason: collision with root package name */
    private static String f11859i = null;

    /* renamed from: j, reason: collision with root package name */
    private static String f11860j = null;

    /* renamed from: k, reason: collision with root package name */
    private static String f11861k = null;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f11862l = false;

    /* renamed from: m, reason: collision with root package name */
    private static final int f11863m = 101;

    /* renamed from: n, reason: collision with root package name */
    private static final int f11864n = 103;

    /* renamed from: o, reason: collision with root package name */
    private static Handler f11865o;

    /* renamed from: p, reason: collision with root package name */
    private static final HandlerThread f11866p;

    /* renamed from: q, reason: collision with root package name */
    private static Handler f11867q;

    /* renamed from: r, reason: collision with root package name */
    private static final HandlerThread f11868r;

    /* loaded from: classes3.dex */
    public static class a {
        public HashMap<String, Object> paraMap = new HashMap<>();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ProcessingThread", 10);
        f11866p = handlerThread;
        f11867q = null;
        HandlerThread handlerThread2 = new HandlerThread("PauseEventThread", 10);
        f11868r = handlerThread2;
        handlerThread.start();
        f11865o = new Handler(handlerThread.getLooper()) { // from class: com.tendcloud.tenddata.zz.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                cp.a();
                co.a();
                Object obj = message.obj;
                if (obj != null && (obj instanceof a)) {
                    try {
                        z.a().post((a) obj);
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        handlerThread2.start();
        f11867q = new Handler(handlerThread2.getLooper()) { // from class: com.tendcloud.tenddata.zz.12
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    com.tendcloud.tenddata.a aVar = (com.tendcloud.tenddata.a) message.obj;
                    if (ab.f11358n == 1) {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 11);
                        aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        aVar2.paraMap.put("sessionEnd", 1);
                        aVar2.paraMap.put("service", aVar);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                        ab.Z.set(true);
                        ab.f11358n = 2;
                    }
                } catch (Exception unused) {
                }
            }
        };
    }

    public zz() {
        f11857g = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized zz a() {
        zz zzVar;
        synchronized (zz.class) {
            if (f11857g == null) {
                synchronized (zz.class) {
                    if (f11857g == null) {
                        f11857g = new zz();
                    }
                }
            }
            zzVar = f11857g;
        }
        return zzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Handler b() {
        return f11867q;
    }

    public static Handler c() {
        return f11865o;
    }

    @Override // com.tendcloud.tenddata.ao
    public Context d() {
        try {
            return ab.f11351g;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void e() {
        try {
            h.f11713a = false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void removeGlobalKV(String str) {
        if (!f11852b) {
            h.eForDeveloper(f11858h);
            return;
        }
        if (str != null) {
            h.iForDeveloper("removeGlobalKV# key:" + str);
        }
        ab.f11348d.remove(str);
    }

    @Override // com.tendcloud.tenddata.ao
    public void setCustomDataSwitch(TalkingDataSharingFilter talkingDataSharingFilter) {
        ab.f11365u = talkingDataSharingFilter;
    }

    @Override // com.tendcloud.tenddata.ao
    public String b(Context context, com.tendcloud.tenddata.a aVar) {
        if (context != null) {
            try {
                if (!f11852b) {
                    h.iForDeveloper(f11858h);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return j.a(context);
    }

    @Override // com.tendcloud.tenddata.ao
    public String c(Context context, com.tendcloud.tenddata.a aVar) {
        return ab.a(context, aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public String d(Context context, com.tendcloud.tenddata.a aVar) {
        return ab.b(context, aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public String e(Context context, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
            }
            return df.a().c();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(boolean z4) {
        try {
            ab.f11349e = z4;
            h.iForDeveloper(" setReportUncaughtExceptions: " + z4);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void d(final String str, final String str2, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            h.iForDeveloper("onPunch called --> profileId: " + str + " punchId: " + str2);
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.29
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 17);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "user");
                        aVar2.paraMap.put("action", "punch");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("punchId", str2);
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public String b(Context context) {
        try {
            return j.a(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(final String str, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onReceiveDeepLink: url could not be null or empty");
                return;
            }
            h.iForDeveloper("onReceiveDeepLink --> link: " + str);
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.25
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ct.a().setDeepLink(str);
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 1);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "app");
                        aVar2.paraMap.put("action", "deeplink");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("link", str);
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(Activity activity, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
            } else {
                if (f11862l) {
                    return;
                }
                a(activity);
                c.b(activity, aVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, com.tendcloud.tenddata.a aVar) {
        a(context, (String) null, (String) null, aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, String str, String str2, com.tendcloud.tenddata.a aVar) {
        a(context, str, str2, (String) null, aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, String str, String str2, String str3, final com.tendcloud.tenddata.a aVar) {
        try {
            if (context == null) {
                h.iForDeveloper("start SDK failed Context is null");
                return;
            }
            if (!y.b(context, "android.permission.INTERNET")) {
                h.eForDeveloper("[startA] Permission \"android.permission.INTERNET\" is needed.");
                return;
            }
            if (aVar == null) {
                h.eForDeveloper("Failed to start SDK!");
                return;
            }
            try {
                if (f11852b) {
                    return;
                }
                ab.f11351g = context.getApplicationContext();
                f11859i = str;
                f11861k = str2;
                f11851a = str3;
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                String a5 = y.a(bundle, ab.ac);
                String a6 = y.a(bundle, "TD_CHANNEL_ID");
                if (y.b(a5)) {
                    a5 = f11859i;
                }
                f11859i = a5;
                if (y.b(a6)) {
                    a6 = f11861k;
                }
                f11861k = a6;
                ab.c(f11851a, aVar);
                String a7 = y.a(context, "ChannelConfig.json");
                if (y.b(a7)) {
                    a7 = f11861k;
                }
                f11861k = a7;
                if (y.b(f11859i)) {
                    h.eForDeveloper("[startA] TD AppId is null");
                    return;
                }
                String trim = f11859i.trim();
                f11859i = trim;
                ab.a(trim, f11861k, aVar);
                bi.a();
                a(context);
                bh.a();
                y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.23
                    @Override // java.lang.Runnable
                    public void run() {
                        String str4;
                        try {
                            bl.a();
                            a aVar2 = new a();
                            aVar2.paraMap.put("apiType", 1);
                            HashMap<String, Object> hashMap = aVar2.paraMap;
                            String str5 = "";
                            if (zz.f11859i == null) {
                                str4 = "";
                            } else {
                                str4 = zz.f11859i;
                            }
                            hashMap.put("appId", str4);
                            HashMap<String, Object> hashMap2 = aVar2.paraMap;
                            if (zz.f11861k != null) {
                                str5 = zz.f11861k;
                            }
                            hashMap2.put("channelId", str5);
                            aVar2.paraMap.put("service", aVar);
                            aVar2.paraMap.put("action", "init");
                            Message.obtain(zz.c(), 101, aVar2).sendToTarget();
                            bm.a();
                            if (y.a(ab.f11351g)) {
                                c.a(aVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                f11852b = true;
            } catch (Throwable th) {
                h.a("[startA] Failed to start SDK!", th);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(Context context, String str, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (y.b(str)) {
                    str = activity.getLocalClassName();
                }
                if ((activity.getChangingConfigurations() & 128) == 128) {
                    f11854d = true;
                    return;
                }
            }
            a(context, str, 5, aVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(String str, String str2, com.tendcloud.tenddata.a aVar) {
        c(str, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void c(final String str, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onShare called --> profileId: ");
            sb.append(str);
            sb.append(", content: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.28
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 17);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "user");
                        aVar2.paraMap.put("action", "share");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(String str, af.ProfileType profileType, String str2, com.tendcloud.tenddata.a aVar) {
        b(str, profileType, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(final String str, final af.ProfileType profileType, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onLogin called --> profileId is ");
            sb.append(str);
            sb.append(" ，profile is ");
            sb.append(profileType);
            sb.append(" , name is ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("action", "login");
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("accountId", str);
                        af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar2.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar2.paraMap.put("name", str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(String str, com.tendcloud.tenddata.a aVar) {
        b(str, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(final String str, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str2;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb.append(str2);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("action", "register");
                        aVar2.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(final String str, final String str2, final int i5, final String str3, final String str4, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str != null && str.trim().length() > 0) {
                h.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i5 + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.15
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onPay: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Activity activity, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
            } else {
                if (f11862l && ab.J) {
                    return;
                }
                a(activity);
                c.a(activity, aVar);
                ab.J = true;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(final String str, final int i5, final String str2, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                h.iForDeveloper("onCancelOrder called --> orderId: " + str + " ,amount: " + i5 + " ,currencyType: " + str2);
                if (str2 != null && str2.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.19
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("action", "cancelOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str2);
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onCancelOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Activity activity, String str, String str2, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
            } else {
                a(activity);
                a(activity, aVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, String str, com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (f11854d) {
                f11854d = false;
                return;
            }
            if (y.b(str) && (context instanceof Activity)) {
                str = ((Activity) context).getLocalClassName();
            }
            a(context, str, 4, aVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(String str, String str2, com.tendcloud.tenddata.a aVar) {
        b(str, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void b(final String str, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onFavorite called --> category: ");
            sb.append(str);
            sb.append(", content: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 17);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "user");
                        aVar2.paraMap.put("action", "favorites");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("category", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void a(Context context, final String str, final int i5, final com.tendcloud.tenddata.a aVar) {
        y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.30
            @Override // java.lang.Runnable
            public void run() {
                String a5;
                try {
                    if (zz.f11852b) {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", Integer.valueOf(i5));
                        aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        HashMap<String, Object> hashMap = aVar2.paraMap;
                        String str2 = str;
                        if (str2 == null) {
                            a5 = "";
                        } else {
                            a5 = y.a(str2);
                        }
                        hashMap.put("pageName", a5);
                        aVar2.paraMap.put("service", aVar);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, String str, String str2, Map<String, Object> map, com.tendcloud.tenddata.a aVar) {
        a(context, str, str2, map, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, final String str, final String str2, final Map<String, Object> map, final Map<String, Object> map2, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            String str3 = "null";
            if (aVar.index() != 3) {
                sb.append(", eventLabel: ");
                sb.append(str2 == null ? "null" : str2);
            }
            sb.append(", eventMap: ");
            if (map != null) {
                str3 = map.toString();
            }
            sb.append(str3);
            if (map2 != null && !map2.isEmpty()) {
                sb.append(", eventValue: ");
                sb.append(map2.toString());
            }
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.31
                @Override // java.lang.Runnable
                public void run() {
                    String a5;
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("apiType", 2);
                        aVar2.paraMap.put("eventId", y.a(str));
                        HashMap<String, Object> hashMap = aVar2.paraMap;
                        String str4 = str2;
                        if (str4 == null) {
                            a5 = null;
                        } else {
                            a5 = y.a(str4);
                        }
                        hashMap.put("eventLabel", a5);
                        aVar2.paraMap.put("map", map);
                        aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Map map3 = map2;
                        if (map3 != null && !map3.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map2);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, final String str, final String str2, final Map<String, Object> map, final double d5, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            String str3 = "null";
            if (aVar.index() != 3) {
                sb.append(", eventLabel: ");
                sb.append(str2 == null ? "null" : str2);
            }
            sb.append(", eventMap: ");
            if (map != null) {
                str3 = map.toString();
            }
            sb.append(str3);
            sb.append(", value: ");
            sb.append(d5);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.32
                @Override // java.lang.Runnable
                public void run() {
                    String a5;
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("apiType", 2);
                        aVar2.paraMap.put("eventId", y.a(str));
                        HashMap<String, Object> hashMap = aVar2.paraMap;
                        String str4 = str2;
                        if (str4 == null) {
                            a5 = null;
                        } else {
                            a5 = y.a(str4);
                        }
                        hashMap.put("eventLabel", a5);
                        aVar2.paraMap.put("map", map);
                        aVar2.paraMap.put(t0.b.f22420d, Double.valueOf(d5));
                        aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, final String str, final Map<String, Object> map, final double d5, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            sb.append(", eventMap: ");
            sb.append(map == null ? "null" : map.toString());
            sb.append(", value: ");
            sb.append(d5);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.33
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("apiType", 2);
                        aVar2.paraMap.put("eventId", y.a(str));
                        aVar2.paraMap.put("map", map);
                        aVar2.paraMap.put(t0.b.f22420d, Double.valueOf(d5));
                        aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Context context, final Throwable th, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
            } else {
                if (th == null) {
                    return;
                }
                y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.34
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar2 = new a();
                            aVar2.paraMap.put("apiType", 3);
                            aVar2.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                            aVar2.paraMap.put("throwable", th);
                            aVar2.paraMap.put("service", aVar);
                            Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, Object obj) {
        if (!f11852b) {
            h.eForDeveloper(f11858h);
            return;
        }
        if (str != null && obj != null) {
            h.iForDeveloper("setGlobalKV# key:" + str + " value:" + obj.toString());
        }
        ab.f11348d.put(str, obj);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, com.tendcloud.tenddata.a aVar) {
        a(str, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str2;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onLogin called --> profileId is ");
            sb.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb.append(str2);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.35
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("action", "login");
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, af.ProfileType profileType, String str2, com.tendcloud.tenddata.a aVar) {
        a(str, profileType, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final af.ProfileType profileType, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            sb.append(" ，type is ");
            sb.append(profileType);
            sb.append(" , name is ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("action", "register");
                        aVar2.paraMap.put("accountId", str);
                        af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar2.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar2.paraMap.put("name", str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, TalkingDataProfile talkingDataProfile, String str2, com.tendcloud.tenddata.a aVar) {
        a(str, talkingDataProfile, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final TalkingDataProfile talkingDataProfile, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            String str3 = "";
            if (talkingDataProfile != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onRegister called --> profileId is ");
                sb.append(str);
                sb.append(" , profile is ");
                sb.append(y.a(talkingDataProfile).toString());
                sb.append(" , invitationCode is ");
                sb.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb.append(str3);
                h.iForDeveloper(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onRegister called --> profileId is ");
                sb2.append(str);
                sb2.append(" , invitationCode is ");
                sb2.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb2.append(str3);
                h.iForDeveloper(sb2.toString());
            }
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("action", "register");
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(aVar.name())) {
                            aVar2.paraMap.put("action", "_td_register");
                        }
                        aVar2.paraMap.put("accountId", str);
                        aVar2.paraMap.put("invitationCode", str2);
                        aVar2.paraMap.put("data", y.a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, TalkingDataProfile talkingDataProfile, com.tendcloud.tenddata.a aVar) {
        a(str, talkingDataProfile, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final TalkingDataProfile talkingDataProfile, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            String str2 = "";
            if (talkingDataProfile != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLogin called --> profileId is ");
                sb.append(str);
                sb.append(" ，profile is ");
                sb.append(y.a(talkingDataProfile).toString());
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb.append(str2);
                h.iForDeveloper(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLogin called --> profileId is ");
                sb2.append(str);
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb2.append(str2);
                h.iForDeveloper(sb2.toString());
            }
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("action", "login");
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(aVar.name())) {
                            aVar2.paraMap.put("action", "_td_login");
                        }
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("accountId", str);
                        aVar2.paraMap.put("data", y.a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataProfile talkingDataProfile, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            h.iForDeveloper("onProfileUpdate called --> profile is " + y.a(talkingDataProfile).toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("action", "update");
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(aVar.name())) {
                            aVar2.paraMap.put("action", "_td_update");
                        }
                        aVar2.paraMap.put("data", y.a(talkingDataProfile));
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, String str2, com.tendcloud.tenddata.a aVar) {
        a(str, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            sb.append(" invitationCode: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 9);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put("action", "register");
                        aVar2.paraMap.put("accountId", str);
                        aVar2.paraMap.put("invitationCode", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar2.paraMap.put("eventValue", map);
                        }
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final String str3, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            h.iForDeveloper("onCreateCard called --> profileId: " + str + " method: " + str2 + "  content: " + str3);
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 17);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, ServiceManagerNative.ACCOUNT);
                        aVar2.paraMap.put("action", "card");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("method", str2);
                        treeMap.put("content", str3);
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, String str2, String str3, int i5, int i6, com.tendcloud.tenddata.a aVar) {
        a(str, str2, str3, i5, i6, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final String str3, final int i5, final int i6, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str4;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onAddItemToShoppingCart called --> itemId: ");
            sb.append(str);
            sb.append(" ,category: ");
            sb.append(str2);
            sb.append(" ,name: ");
            sb.append(str3);
            sb.append(" ,unitPrice: ");
            sb.append(i5);
            sb.append(" ,amount: ");
            sb.append(i6);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb.append(str4);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 8);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                        aVar2.paraMap.put("action", "addItem");
                        aVar2.paraMap.put("service", aVar);
                        TreeMap treeMap = new TreeMap();
                        if (aVar.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put("id", str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put("name", str3);
                            }
                            treeMap.put("unitPrice", Integer.valueOf(i5));
                            treeMap.put("count", Integer.valueOf(i6));
                        } else {
                            treeMap.put("id", str);
                            treeMap.put("category", str2);
                            treeMap.put("name", str3);
                            treeMap.put("unitPrice", Integer.valueOf(i5));
                            treeMap.put("count", Integer.valueOf(i6));
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final int i5, final String str2, final String str3, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                h.iForDeveloper("onOrderPaySucc called --> orderid: " + str + " ,amount: " + i5 + " ,currencyType: " + str2 + " ,payType: " + str3);
                if (str2 != null && str2.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.11
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("action", "pay");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str2);
                                treeMap.put("payType", str3);
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onOrderPaySucc: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataOrder talkingDataOrder, final String str, final String str2, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (talkingDataOrder == null) {
                h.eForDeveloper("onPay: order could not be null or empty");
                return;
            }
            h.iForDeveloper("onOrderPaySucc called --> order: " + talkingDataOrder.toString() + " ,paymentType: " + str + " ,profileId: " + str2);
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.13
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 8);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                        aVar2.paraMap.put("action", "pay");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str2);
                        treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                        treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                        String optString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                        if (TextUtils.isEmpty(optString)) {
                            optString = "CNY";
                        }
                        treeMap.put("currencyType", optString);
                        if (!TextUtils.isEmpty(str)) {
                            treeMap.put("payType", str);
                        }
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final int i5, final String str3, final String str4, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str != null && str.trim().length() > 0) {
                h.iForDeveloper("onOrderPaySucc called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i5 + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.14
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onOrderPaySucc: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final int i5, final String str3, final String str4, final String str5, final int i6, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str2 != null && str2.trim().length() > 0) {
                h.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i5 + " ,currencyType: " + str3 + " ,payType: " + str4 + " ,itemId: " + str5 + " ,itemCount: " + i6);
                if (str3 != null && str3.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.16
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("action", "currencyPurchase");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                treeMap.put("itemId", str5);
                                treeMap.put("itemCount", Integer.valueOf(i6));
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onPay: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, int i5, String str2, com.tendcloud.tenddata.a aVar) {
        a(str, i5, str2, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final int i5, final String str2, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str3;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlaceOrder called --> orderId: ");
                sb.append(str);
                sb.append(" ,amount: ");
                sb.append(i5);
                sb.append(" ,currencyType: ");
                sb.append(str2);
                if (map == null || map.isEmpty()) {
                    str3 = "";
                } else {
                    str3 = ", eventValue: " + map.toString();
                }
                sb.append(str3);
                h.iForDeveloper(sb.toString());
                if (str2 != null && str2.trim().length() == 3) {
                    y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.17
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar2 = new a();
                                aVar2.paraMap.put("apiType", 8);
                                aVar2.paraMap.put("service", aVar);
                                aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                                aVar2.paraMap.put("action", "placeOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i5));
                                treeMap.put("currencyType", str2);
                                Map map2 = map;
                                if (map2 != null && !map2.isEmpty()) {
                                    treeMap.put("eventValue", map);
                                }
                                aVar2.paraMap.put("data", treeMap);
                                Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            h.eForDeveloper("onPlaceOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(TalkingDataOrder talkingDataOrder, String str, com.tendcloud.tenddata.a aVar) {
        a(talkingDataOrder, str, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataOrder talkingDataOrder, final String str, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str2;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString(TalkingDataOrder.keyOrderId).isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlaceOrder called --> order: ");
                sb.append(talkingDataOrder.toString());
                sb.append(", profileId: ");
                sb.append(str);
                if (map == null || map.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", eventValue: " + map.toString();
                }
                sb.append(str2);
                h.iForDeveloper(sb.toString());
                y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.18
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONArray jSONArray;
                        try {
                            a aVar2 = new a();
                            aVar2.paraMap.put("apiType", 8);
                            aVar2.paraMap.put("service", aVar);
                            aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                            aVar2.paraMap.put("action", "placeOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("accountId", str);
                            treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                            String optString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                            if (TextUtils.isEmpty(optString)) {
                                optString = "CNY";
                            }
                            treeMap.put("currencyType", optString);
                            if (talkingDataOrder.has(TalkingDataOrder.keyOrderDetail) && (jSONArray = talkingDataOrder.getJSONArray(TalkingDataOrder.keyOrderDetail)) != null && jSONArray.length() > 0) {
                                treeMap.put("items", jSONArray);
                            }
                            Map map2 = map;
                            if (map2 != null && !map2.isEmpty()) {
                                treeMap.put("eventValue", map);
                            }
                            aVar2.paraMap.put("data", treeMap);
                            Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            h.eForDeveloper("onPlaceOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataOrder talkingDataOrder, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString(TalkingDataOrder.keyOrderId).isEmpty()) {
                h.iForDeveloper("onCancelOrder called --> order: " + talkingDataOrder.toString());
                y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.20
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar2 = new a();
                            aVar2.paraMap.put("apiType", 8);
                            aVar2.paraMap.put("service", aVar);
                            aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                            aVar2.paraMap.put("action", "cancelOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                            String optString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                            if (TextUtils.isEmpty(optString)) {
                                optString = "CNY";
                            }
                            treeMap.put("currencyType", optString);
                            aVar2.paraMap.put("data", treeMap);
                            Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            h.eForDeveloper("onCancelOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(String str, String str2, String str3, int i5, com.tendcloud.tenddata.a aVar) {
        a(str, str2, str3, i5, new HashMap(), aVar);
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final String str, final String str2, final String str3, final int i5, final Map<String, Object> map, final com.tendcloud.tenddata.a aVar) {
        String str4;
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onViewItem called --> itemId: ");
            sb.append(str);
            sb.append(" ,category: ");
            sb.append(str2);
            sb.append(" ,name: ");
            sb.append(str3);
            sb.append(" ,unitPrice: ");
            sb.append(i5);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb.append(str4);
            h.iForDeveloper(sb.toString());
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.21
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 8);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                        aVar2.paraMap.put("action", "viewItem");
                        TreeMap treeMap = new TreeMap();
                        if (aVar.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put("id", str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put("name", str3);
                            }
                            treeMap.put("unitPrice", Integer.valueOf(i5));
                        } else {
                            treeMap.put("id", str);
                            treeMap.put("category", str2);
                            treeMap.put("name", str3);
                            treeMap.put("unitPrice", Integer.valueOf(i5));
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar2.paraMap.put("data", treeMap);
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataShoppingCart talkingDataShoppingCart, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            h.iForDeveloper("onViewShoppingCart called --> shoppingCart: " + talkingDataShoppingCart);
            if (talkingDataShoppingCart != null && talkingDataShoppingCart.length() > 0) {
                y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.22
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar2 = new a();
                            aVar2.paraMap.put("apiType", 8);
                            aVar2.paraMap.put("service", aVar);
                            aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, "iap");
                            aVar2.paraMap.put("action", "viewItems");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("items", talkingDataShoppingCart);
                            aVar2.paraMap.put("data", treeMap);
                            Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            h.eForDeveloper("viewShoppingCart# shoppingCart can't be null or empty");
        } catch (Throwable unused) {
        }
    }

    private void a(final Context context) {
        Application application;
        if (y.a(14)) {
            try {
                Context context2 = ab.f11351g;
                if (context2 instanceof Activity) {
                    application = ((Activity) context2).getApplication();
                } else {
                    application = context2 instanceof Application ? (Application) context2 : null;
                }
                if (application == null || f11862l) {
                    return;
                }
                b bVar = new b();
                f11855e = bVar;
                application.registerActivityLifecycleCallbacks(bVar);
                f11862l = true;
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            y.a(Class.forName("android.app.ActivityManagerNative"), new v() { // from class: com.tendcloud.tenddata.zz.24
                @Override // com.tendcloud.tenddata.v
                public void afterMethodInvoked(Object obj, Method method, Object[] objArr, Object obj2) {
                }

                @Override // com.tendcloud.tenddata.v
                public void beforeMethodInvoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (context instanceof Activity) {
                        if (name.equalsIgnoreCase("activityPaused")) {
                            c.b((Activity) context, com.tendcloud.tenddata.a.UNIVERSAL);
                        } else if (name.equalsIgnoreCase("activityIdle")) {
                            c.a((Activity) context, com.tendcloud.tenddata.a.UNIVERSAL);
                        }
                    }
                }
            }, "gDefault", "android.app.IActivityManager");
            f11862l = true;
        } catch (Throwable th) {
            h.eForDeveloper("registerActivityLifecycleListener " + th.getMessage());
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(final TalkingDataSearch talkingDataSearch, final com.tendcloud.tenddata.a aVar) {
        try {
            if (!f11852b) {
                h.eForDeveloper(f11858h);
                return;
            }
            if (talkingDataSearch == null) {
                h.eForDeveloper("TDSearch cannot be null ");
                return;
            }
            h.iForDeveloper("onSearch called --> search: " + talkingDataSearch);
            y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar2 = new a();
                        aVar2.paraMap.put("apiType", 17);
                        aVar2.paraMap.put("service", aVar);
                        aVar2.paraMap.put(ClientCookie.DOMAIN_ATTR, com.umeng.analytics.pro.bi.az);
                        aVar2.paraMap.put("action", BaseConstants.MARKET_URI_AUTHORITY_SEARCH);
                        aVar2.paraMap.put("data", y.a(talkingDataSearch));
                        Message.obtain(zz.c(), 102, aVar2).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.ao
    public void a(Map<String, Object> map, TDGenerateUrl tDGenerateUrl) {
        bc.a().a(map).getShortUrl(tDGenerateUrl);
    }
}
