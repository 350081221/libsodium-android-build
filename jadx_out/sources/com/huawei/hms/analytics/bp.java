package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.type.ReportPolicy;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bp {
    private static bp ikl = new bp();
    private lmn ijk;
    public JSONObject lmn;
    private boolean hij = false;
    public boolean klm = false;
    private bh ghi = fgh.lmn().lmn("_openness_config_tag");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.analytics.bp$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] lmn;

        static {
            int[] iArr = new int[ReportPolicy.values().length];
            lmn = iArr;
            try {
                iArr[ReportPolicy.ON_APP_LAUNCH_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lmn[ReportPolicy.ON_SCHEDULED_TIME_POLICY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lmn[ReportPolicy.ON_CACHE_THRESHOLD_POLICY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                lmn[ReportPolicy.ON_MOVE_BACKGROUND_POLICY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class lmn extends TimerTask {
        private long ikl = -1;
        private Timer klm = new Timer();

        public lmn() {
        }

        public final boolean klm(long j5) {
            long j6 = this.ikl;
            return (j6 == -1 || j6 == j5) ? false : true;
        }

        public final void lmn() {
            this.klm.cancel();
            this.klm.purge();
            this.klm = null;
        }

        public final void lmn(long j5) {
            this.ikl = j5;
            long j6 = j5 * 1000;
            this.klm.schedule(this, j6, j6);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            HiLog.i("PoliceCommander", "Timer report timer running");
            if (bp.this.ghi != null) {
                bp.this.ghi.lmn();
                bp.this.ghi.klm();
            }
            fgh.lmn().klm();
        }
    }

    public static bp lmn() {
        return ikl;
    }

    public static void lmn(long j5) {
        ar.lmn().lmn.f8141c = j5;
    }

    private void lmn(JSONObject jSONObject) {
        if (this.lmn != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.lmn.remove(keys.next());
            }
            Iterator<String> keys2 = this.lmn.keys();
            if (keys2.hasNext()) {
                String next = keys2.next();
                if ("onMoveBackgroundPolicy".equals(next)) {
                    lmn(false);
                } else if ("onScheduledTime".equals(next)) {
                    this.ijk.lmn();
                    this.ijk = null;
                } else if ("onCacheThreshold".equals(next)) {
                    lmn(30L);
                }
            }
        }
        HiLog.i("PoliceCommander", "save policies : " + jSONObject.toString());
        dl.lmn(ar.lmn().lmn.ghi, "global_v2", "policies", jSONObject.toString());
    }

    private static void lmn(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HiLog.w("PoliceCommander", "jsonPut json Exception");
        }
    }

    public static void lmn(boolean z4) {
        a.lmn(ar.lmn().lmn.ghi).klm = z4;
    }

    public final void ikl() {
        if (this.hij) {
            return;
        }
        if (this.ghi != null) {
            this.hij = true;
            HiLog.i("PoliceCommander", "onAppLaunchPolicy onReport");
            this.ghi.lmn();
            this.ghi.klm();
        }
        fgh.lmn().klm();
    }

    public final void klm() {
        JSONObject jSONObject = new JSONObject();
        this.lmn = jSONObject;
        try {
            jSONObject.put("onMoveBackgroundPolicy", "");
            this.lmn.put("onCacheThreshold", 30L);
        } catch (JSONException unused) {
            HiLog.w("PoliceCommander", "defPolicies json exception");
        }
    }

    public final void klm(long j5) {
        lmn lmnVar = this.ijk;
        if (lmnVar == null) {
            lmn lmnVar2 = new lmn();
            this.ijk = lmnVar2;
            lmnVar2.lmn(j5);
        } else if (lmnVar.klm(j5)) {
            this.ijk.lmn();
            lmn lmnVar3 = new lmn();
            this.ijk = lmnVar3;
            lmnVar3.lmn(j5);
        }
    }

    public final synchronized void lmn(Set<ReportPolicy> set) {
        if (set != null) {
            if (set.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (ReportPolicy reportPolicy : set) {
                    int i5 = AnonymousClass1.lmn[reportPolicy.ordinal()];
                    boolean z4 = true;
                    if (i5 == 1) {
                        lmn(jSONObject, "onAppLaunch", "");
                        ikl();
                    } else if (i5 == 2) {
                        long threshold = reportPolicy.getThreshold();
                        lmn(jSONObject, "onScheduledTime", Long.valueOf(threshold));
                        JSONObject jSONObject2 = this.lmn;
                        if (jSONObject2 != null && jSONObject2.optLong("onScheduledTime", -1L) == threshold) {
                            z4 = false;
                        }
                        if (z4) {
                            klm(threshold);
                        }
                    } else if (i5 == 3) {
                        long threshold2 = reportPolicy.getThreshold();
                        lmn(jSONObject, "onCacheThreshold", Long.valueOf(threshold2));
                        lmn(threshold2);
                    } else if (i5 == 4) {
                        lmn(jSONObject, "onMoveBackgroundPolicy", "");
                        lmn(true);
                    }
                }
                lmn(jSONObject);
                this.lmn = jSONObject;
            }
        }
    }
}
