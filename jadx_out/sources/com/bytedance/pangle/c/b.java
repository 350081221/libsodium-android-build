package com.bytedance.pangle.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static String f4271b = "request_finish";

    /* renamed from: c, reason: collision with root package name */
    public static String f4272c = "download_start";

    /* renamed from: d, reason: collision with root package name */
    public static String f4273d = "download_finish";

    /* renamed from: e, reason: collision with root package name */
    public static String f4274e = "install_start";

    /* renamed from: f, reason: collision with root package name */
    public static String f4275f = "install_finish";

    /* renamed from: g, reason: collision with root package name */
    public static String f4276g = "7z_unzip_start";

    /* renamed from: h, reason: collision with root package name */
    public static String f4277h = "7z_unzip_finish";

    /* renamed from: i, reason: collision with root package name */
    public static String f4278i = "load_start";

    /* renamed from: j, reason: collision with root package name */
    public static String f4279j = "load_finish";

    /* renamed from: k, reason: collision with root package name */
    public static String f4280k = "rm_entry_finish";

    /* renamed from: l, reason: collision with root package name */
    private static volatile b f4281l;

    /* renamed from: a, reason: collision with root package name */
    public final List<com.bytedance.pangle.c.a> f4282a = new ArrayList();

    /* loaded from: classes2.dex */
    public static class a {
        public static int A = 32007;
        public static int B = 32008;
        public static int C = 32999;
        public static int D = 40000;
        public static int E = 41000;
        public static int F = 42000;
        public static int G = 50000;
        public static int H = 50004;

        /* renamed from: a, reason: collision with root package name */
        public static int f4283a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static int f4284b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static int f4285c = -1;

        /* renamed from: d, reason: collision with root package name */
        public static int f4286d = -2;

        /* renamed from: e, reason: collision with root package name */
        public static int f4287e = 12000;

        /* renamed from: f, reason: collision with root package name */
        public static int f4288f = 12001;

        /* renamed from: g, reason: collision with root package name */
        public static int f4289g = 12002;

        /* renamed from: h, reason: collision with root package name */
        public static int f4290h = 12003;

        /* renamed from: i, reason: collision with root package name */
        public static int f4291i = 12004;

        /* renamed from: j, reason: collision with root package name */
        public static int f4292j = 20000;

        /* renamed from: k, reason: collision with root package name */
        public static int f4293k = 21000;

        /* renamed from: l, reason: collision with root package name */
        public static int f4294l = 21001;

        /* renamed from: m, reason: collision with root package name */
        public static int f4295m = 21002;

        /* renamed from: n, reason: collision with root package name */
        public static int f4296n = 22000;

        /* renamed from: o, reason: collision with root package name */
        public static int f4297o = 22001;

        /* renamed from: p, reason: collision with root package name */
        public static int f4298p = 22002;

        /* renamed from: q, reason: collision with root package name */
        public static int f4299q = 22999;

        /* renamed from: r, reason: collision with root package name */
        public static int f4300r = 30000;

        /* renamed from: s, reason: collision with root package name */
        public static int f4301s = 31000;

        /* renamed from: t, reason: collision with root package name */
        public static int f4302t = 32000;

        /* renamed from: u, reason: collision with root package name */
        public static int f4303u = 32001;

        /* renamed from: v, reason: collision with root package name */
        public static int f4304v = 32002;

        /* renamed from: w, reason: collision with root package name */
        public static int f4305w = 32003;

        /* renamed from: x, reason: collision with root package name */
        public static int f4306x = 32004;

        /* renamed from: y, reason: collision with root package name */
        public static int f4307y = 32005;

        /* renamed from: z, reason: collision with root package name */
        public static int f4308z = 32006;
    }

    private b() {
    }

    public static b a() {
        if (f4281l == null) {
            synchronized (b.class) {
                f4281l = new b();
            }
        }
        return f4281l;
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        synchronized (this.f4282a) {
            Iterator<com.bytedance.pangle.c.a> it = this.f4282a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(str, jSONObject, jSONObject2, jSONObject3);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
