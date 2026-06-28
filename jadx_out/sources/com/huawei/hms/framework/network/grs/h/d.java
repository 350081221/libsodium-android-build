package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f8510a = new ConcurrentHashMap(16);

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f8511a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8512b;

        public a(long j5, long j6) {
            this.f8511a = j5;
            this.f8512b = j6;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.f8512b <= this.f8511a;
        }
    }

    public static a a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("map size of get is before:");
        Map<String, a> map = f8510a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        a aVar = map.get(str);
        Logger.v("RequestUtil", "map size of get is after:" + map.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("map size of put is before:");
        Map<String, a> map = f8510a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after:" + map.size());
    }
}
