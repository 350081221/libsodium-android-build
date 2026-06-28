package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.umcrash.UMCrash;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class au {
    public static final String A = "rtd";
    public static final String B = "lepd";
    public static final String C = "ccfg";
    private static Map<String, String> D = null;
    private static String E = null;

    /* renamed from: a, reason: collision with root package name */
    public static final String f12193a = "env";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12194b = "exp";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12195c = "imp";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12196d = "ua";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12197e = "zc";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12198f = "id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12199g = "zf";

    /* renamed from: h, reason: collision with root package name */
    public static final String f12200h = "exid";

    /* renamed from: i, reason: collision with root package name */
    public static final String f12201i = "ucc";

    /* renamed from: j, reason: collision with root package name */
    public static final String f12202j = "ugc";

    /* renamed from: k, reason: collision with root package name */
    public static final String f12203k = "usi";

    /* renamed from: l, reason: collision with root package name */
    public static final String f12204l = "uso";

    /* renamed from: m, reason: collision with root package name */
    public static final String f12205m = "user";

    /* renamed from: n, reason: collision with root package name */
    public static final String f12206n = "uspi";

    /* renamed from: o, reason: collision with root package name */
    public static final String f12207o = "dtfn";

    /* renamed from: p, reason: collision with root package name */
    public static final String f12208p = "pr";

    /* renamed from: q, reason: collision with root package name */
    public static final String f12209q = "upg";

    /* renamed from: r, reason: collision with root package name */
    public static final String f12210r = "pri";

    /* renamed from: s, reason: collision with root package name */
    public static final String f12211s = "probe";

    /* renamed from: t, reason: collision with root package name */
    public static final String f12212t = "bl";

    /* renamed from: u, reason: collision with root package name */
    public static final String f12213u = "wl";

    /* renamed from: v, reason: collision with root package name */
    public static final String f12214v = "subp";

    /* renamed from: w, reason: collision with root package name */
    public static final String f12215w = "subua";

    /* renamed from: x, reason: collision with root package name */
    public static final String f12216x = "sta";

    /* renamed from: y, reason: collision with root package name */
    public static final String f12217y = "emi";

    /* renamed from: z, reason: collision with root package name */
    public static final String f12218z = "sli";

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final au f12219a = new au();

        private a() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        D = hashMap;
        E = "";
        hashMap.put(f12193a, "envelope");
        D.put(f12194b, ".umeng");
        D.put(f12195c, ".imprint");
        D.put(f12196d, "ua.db");
        D.put(f12197e, "umeng_zero_cache.db");
        D.put("id", "umeng_it.cache");
        D.put(f12199g, "umeng_zcfg_flag");
        D.put(f12200h, "exid.dat");
        D.put(f12201i, "umeng_common_config");
        D.put(f12202j, "umeng_general_config");
        D.put(f12203k, UMCrash.KEY_CALLBACK_SESSION_ID);
        D.put(f12204l, "umeng_sp_oaid");
        D.put("user", "mobclick_agent_user_");
        D.put(f12206n, "umeng_subprocess_info");
        D.put(f12207o, "delayed_transmission_flag_new");
        D.put("pr", "umeng_policy_result_flag");
        D.put(f12209q, "um_policy_grant");
        D.put(f12210r, "um_pri");
        D.put(f12211s, "UM_PROBE_DATA");
        D.put(f12212t, "ekv_bl");
        D.put(f12213u, "ekv_wl");
        D.put(f12214v, e.f12517a);
        D.put(f12215w, "ua_");
        D.put(f12216x, "stateless");
        D.put(f12217y, ".emitter");
        D.put(f12218z, "um_slmode_sp");
        D.put(A, "um_rtd_conf");
        D.put(B, "");
        D.put(C, ".dmpvedpogjhejs.cfg");
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(E)) {
            if (str.length() > 3) {
                E = str.substring(0, 3) + "_";
                return;
            }
            E = str + "_";
        }
    }

    public String b(String str) {
        if (!D.containsKey(str)) {
            return "";
        }
        String str2 = D.get(str);
        if (!f12194b.equalsIgnoreCase(str) && !f12195c.equalsIgnoreCase(str) && !f12217y.equalsIgnoreCase(str)) {
            return E + str2;
        }
        return "." + E + str2.substring(1);
    }

    private au() {
    }

    public void a() {
        E = "";
    }

    public static au b() {
        return a.f12219a;
    }
}
