package com.tendcloud.tenddata;

import android.content.Context;

/* loaded from: classes3.dex */
public class i {
    private static final String A = "TDtime_set_collect_net";
    private static final String B = "TDtd_role_id";
    private static final String C = "TDpref.accountid.key";
    private static final String D = "TDpref.accountgame.key";
    private static final String E = "TDpref.missionid.key";
    private static final String F = "TDpref.game.session.startsystem.key";

    /* renamed from: a, reason: collision with root package name */
    public static final String f11714a = "TDpref.profile.key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11715b = "TDpref.session.key";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11716c = "TDpref.session.backup.key";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11717d = "TDpref.lastactivity.key";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11718e = "TDpref.start.key";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11719f = "TDpref.init.key";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11720g = "TDpref.init.flag";

    /* renamed from: h, reason: collision with root package name */
    public static final String f11721h = "TDpref.actstart.key";

    /* renamed from: i, reason: collision with root package name */
    public static final String f11722i = "TDpref.end.key";

    /* renamed from: j, reason: collision with root package name */
    public static final String f11723j = "TDpref.ip";

    /* renamed from: k, reason: collision with root package name */
    public static final String f11724k = "TD_CHANNEL_ID";

    /* renamed from: l, reason: collision with root package name */
    public static final String f11725l = "TDappcontext_push";

    /* renamed from: m, reason: collision with root package name */
    public static final String f11726m = "TDpref.tokensync.key";

    /* renamed from: n, reason: collision with root package name */
    public static final String f11727n = "TDpref.push.msgid.key";

    /* renamed from: o, reason: collision with root package name */
    public static final String f11728o = "TDpref.running.app.key";

    /* renamed from: p, reason: collision with root package name */
    public static final String f11729p = "TDpref_longtime";

    /* renamed from: q, reason: collision with root package name */
    public static final String f11730q = "TDpref_shorttime";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11731r = "TDapp.account.key";

    /* renamed from: s, reason: collision with root package name */
    public static final String f11732s = "TDuniversal.account.key";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11733t = "TDaes_key";

    /* renamed from: u, reason: collision with root package name */
    public static final String f11734u = "TDpref_game";

    /* renamed from: v, reason: collision with root package name */
    public static final String f11735v = "TD_push_pref_file";

    /* renamed from: w, reason: collision with root package name */
    static final String f11736w = "TDisAppQuiting";

    /* renamed from: x, reason: collision with root package name */
    public static final String f11737x = "TDpref.last.sdk.check";

    /* renamed from: y, reason: collision with root package name */
    public static final String f11738y = "TDadditionalVersionName";

    /* renamed from: z, reason: collision with root package name */
    public static final String f11739z = "TDadditionalVersionCode";

    public static String a() {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11729p, f11733t, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(String str, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11729p + aVar.index(), f11716c, str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c() {
        Context context = ab.f11351g;
        if (context == null) {
            return false;
        }
        try {
            return context.getSharedPreferences("TD_CHANNEL_ID", 0).getBoolean("location_called", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d() {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11730q, f11717d, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long e(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11729p + aVar.index(), f11720g, 1L);
            } catch (Throwable unused) {
            }
        }
        return 1L;
    }

    public static long f() {
        Context context = ab.f11351g;
        if (context == null) {
            return 0L;
        }
        try {
            return s.b(context, f11730q, f11721h, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long g() {
        Context context = ab.f11351g;
        if (context == null) {
            return 0L;
        }
        try {
            return s.b(context, f11729p, f11728o, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String h() {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11729p, f11738y, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long i() {
        Context context = ab.f11351g;
        if (context == null) {
            return -1L;
        }
        try {
            return s.b(context, f11729p, f11739z, -1L);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static int j() {
        try {
            if (i() != -1) {
                return Integer.parseInt(String.valueOf(i()));
            }
            return g.a().b(ab.f11351g);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String k() {
        try {
            if (h() != null) {
                return h();
            }
            return g.a().c(ab.f11351g);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String l() {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11730q, f11731r, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String m() {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11730q, f11732s, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String n() {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11730q, B, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o() {
        Context context = ab.f11351g;
        if (context == null) {
            return 0L;
        }
        try {
            return s.b(context, f11730q, A, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String p() {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11734u, C, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String q() {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11734u, E, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void r() {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11734u, F, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    public static String s() {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11735v, f11725l, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void setAESKey(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11729p, f11733t, str);
        } catch (Throwable unused) {
        }
    }

    public static void setActivityStartTime(long j5) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, f11721h, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionCode(long j5) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11729p, f11739z, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionName(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11729p, f11738y, str);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectNetInfoTime(long j5) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, A, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectRunningTime(long j5) {
        try {
            s.a(ab.f11351g, f11729p, f11728o, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setInitTime(long j5) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11729p, f11719f, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setLastActivity(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, f11717d, str);
        } catch (Throwable unused) {
        }
    }

    public static void setLastRoleName(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, B, str);
        } catch (Throwable unused) {
        }
    }

    public static void setMissionId(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11734u, E, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPostProfile(boolean z4) {
        try {
            s.a(ab.f11351g, f11729p, f11714a, z4 ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileId(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11734u, C, str);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileInfo(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, f11731r, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushAppContext(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11735v, f11725l, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushLastMsgId(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11735v, f11727n, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushSyncTokenLastTime(long j5) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11735v, f11726m, j5);
        } catch (Throwable unused) {
        }
    }

    public static void setUniversalProfileInfo(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, f11732s, str);
        } catch (Throwable unused) {
        }
    }

    public static long t() {
        Context context = ab.f11351g;
        if (context == null) {
            return 0L;
        }
        try {
            return s.b(context, f11735v, f11726m, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String u() {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11735v, f11727n, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11729p + aVar.index(), f11715b, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String b(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11729p + aVar.index(), f11716c, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static long d(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11729p + aVar.index(), f11719f, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static long e() {
        Context context = ab.f11351g;
        if (context == null) {
            return 0L;
        }
        try {
            return s.b(context, f11729p, f11719f, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long f(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11730q + aVar.index(), f11722i, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static long c(a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                return s.b(context, f11729p + aVar.index(), f11718e, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static void a(String str, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11729p + aVar.index(), f11715b, str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b() {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences("TD_CHANNEL_ID", 0).edit().putBoolean("location_called", true).commit();
        } catch (Throwable unused) {
        }
    }

    public static void c(long j5, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11730q + aVar.index(), f11722i, j5);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(long j5, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11729p + aVar.index(), f11718e, j5);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j5, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11729p + aVar.index(), f11719f, j5);
            } catch (Throwable unused) {
            }
        }
    }

    public static String c(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return "";
        }
        try {
            return s.b(context, f11734u, str + D, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(boolean z4, a aVar) {
        Context context = ab.f11351g;
        if (context != null && aVar != null) {
            try {
                s.a(context, f11729p + aVar.index(), f11720g, z4 ? 1L : 0L);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str, String str2) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void c(String str, String str2) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11734u, str + D, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        Context context = ab.f11351g;
        if (context == null) {
            return;
        }
        try {
            s.a(context, f11730q, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static String b(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11730q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str) {
        Context context = ab.f11351g;
        if (context == null) {
            return null;
        }
        try {
            return s.b(context, f11730q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
