package com.efs.sdk.base.core.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes2.dex */
public class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f6509a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.1
        {
            put("flow_5min", 300000L);
            put("flow_hour", Long.valueOf(OpenStreetMapTileProviderConstants.ONE_HOUR));
            put("flow_day", 86400000L);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f6510b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.2
        {
            put("flow_5min", 1048576L);
            put("flow_hour", 1048576L);
            put("flow_day", Long.valueOf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private Map<String, AtomicInteger> f6511c;

    /* renamed from: d, reason: collision with root package name */
    private volatile SharedPreferences f6512d;

    /* renamed from: e, reason: collision with root package name */
    private volatile SharedPreferences.Editor f6513e;

    /* renamed from: f, reason: collision with root package name */
    private Context f6514f;

    /* renamed from: g, reason: collision with root package name */
    private String f6515g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f6516a = new b(0);
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a() {
        return a.f6516a;
    }

    private void b() {
        try {
            c();
        } catch (Throwable th) {
            Log.e("efs.flow", "init sharedpreferences error", th);
        }
    }

    private void c() {
        if (this.f6512d == null) {
            synchronized (b.class) {
                if (this.f6512d == null) {
                    this.f6512d = SharedPreferencesUtils.getSharedPreferences(this.f6514f, this.f6515g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f6513e == null) {
            synchronized (b.class) {
                if (this.f6513e == null) {
                    this.f6513e = this.f6512d.edit();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        int i5 = message.what;
        if (i5 != 0) {
            if (i5 != 1) {
                Log.w("efs.flow", "flow stat listener not support action '" + message.what + "'");
                return;
            }
            String valueOf = String.valueOf(message.obj);
            long j5 = message.arg1;
            b();
            if (this.f6512d == null) {
                Log.w("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp");
                return;
            }
            if (this.f6513e == null) {
                Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp");
                return;
            }
            String concat = "curr_time_".concat(valueOf);
            if (Math.abs(System.currentTimeMillis() - this.f6512d.getLong(concat, System.currentTimeMillis())) >= j5) {
                for (String str : this.f6512d.getAll().keySet()) {
                    if (str.startsWith(valueOf)) {
                        this.f6513e.putLong(str, 0L);
                    }
                }
                this.f6513e.putLong(concat, System.currentTimeMillis());
                this.f6513e.apply();
                this.f6511c.clear();
                return;
            }
            return;
        }
        b();
        if (this.f6512d == null) {
            Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return;
        }
        if (this.f6513e == null) {
            Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat");
            return;
        }
        String valueOf2 = String.valueOf(message.obj);
        long j6 = message.arg1;
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        for (String str2 : f6509a.keySet()) {
            String concat2 = "curr_time_".concat(String.valueOf(str2));
            if (!this.f6512d.contains(concat2)) {
                this.f6513e.putLong(concat2, System.currentTimeMillis());
            }
            for (String str3 : a(str2, valueOf2, netStatus)) {
                this.f6513e.putLong(str3, this.f6512d.getLong(str3, 0L) + j6);
            }
        }
        this.f6513e.apply();
    }

    private b() {
        super(com.efs.sdk.base.core.util.concurrent.a.f6647a.getLooper());
        this.f6511c = new ConcurrentHashMap(5);
        this.f6514f = ControllerCenter.getGlobalEnvStruct().mAppContext;
        this.f6515g = ControllerCenter.getGlobalEnvStruct().getAppid();
        b();
        File c5 = com.efs.sdk.base.core.util.a.c(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (c5.exists()) {
            com.efs.sdk.base.core.util.b.b(c5);
        }
    }

    public final boolean a(@NonNull String str, long j5) {
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        boolean z4 = true;
        for (Map.Entry<String, Long> entry : f6509a.entrySet()) {
            z4 = a(entry.getKey(), entry.getValue().longValue(), str, netStatus, j5);
            if (!z4) {
                break;
            }
        }
        return z4;
    }

    private boolean a(@NonNull String str, long j5, @NonNull String str2, @NonNull String str3, long j6) {
        b();
        if (this.f6512d == null) {
            Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return false;
        }
        List<String> a5 = a(str, str2, str3);
        Map<String, String> c5 = com.efs.sdk.base.core.config.a.c.a().c();
        for (String str4 : a5) {
            if (Math.abs(System.currentTimeMillis() - this.f6512d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j5) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = str;
                obtain.arg1 = Long.valueOf(j5).intValue();
                sendMessage(obtain);
            }
            long a6 = a(c5, str, str4);
            long j7 = this.f6512d.getLong(str4, 0L);
            if (j7 + j6 > a6) {
                Log.i("efs.flow", "flow limit, key: " + str4 + ", max: " + a6 + ", now: " + j7 + ", size: " + j6);
                a(str4);
                return false;
            }
        }
        return true;
    }

    private void a(String str) {
        com.efs.sdk.base.core.f.f fVar;
        com.efs.sdk.base.core.f.f fVar2;
        if (!this.f6511c.containsKey(str) || this.f6511c.get(str) == null || this.f6511c.get(str).get() <= 10) {
            fVar = f.a.f6622a;
            fVar.a(com.efs.sdk.base.core.config.a.c.a().f6564d.f6552a, str);
            if (str.equals("flow_day")) {
                fVar2 = f.a.f6622a;
                fVar2.a(com.efs.sdk.base.core.config.a.c.a().f6564d.f6552a);
            }
            if (!this.f6511c.containsKey(str)) {
                this.f6511c.put(str, new AtomicInteger());
            }
            this.f6511c.get(str).incrementAndGet();
        }
    }

    private static long a(Map<String, String> map, @NonNull String str, @NonNull String str2) {
        long longValue = f6510b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return longValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th) {
            Log.w("efs.flow", "get max flow error", th);
            return longValue;
        }
    }

    private static List<String> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + "_" + str2);
        }
        if (!TextUtils.isEmpty(str3) && !"unknown".equalsIgnoreCase(str3)) {
            arrayList.add(str + "_" + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + "_" + str2 + "_" + str3);
        }
        return arrayList;
    }
}
