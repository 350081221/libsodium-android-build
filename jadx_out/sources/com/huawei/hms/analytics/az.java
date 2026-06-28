package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.common.ApiException;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public abstract class az {
    private Object[] ijk;
    private Class<?>[] ikl;
    private String klm;
    private String lmn;

    /* loaded from: classes3.dex */
    public static class ijk extends az {
        private final Context lmn;

        public ijk(Context context) {
            super("com.vivo.push.PushClient", "getInstance", new Class[]{Context.class}, new Object[]{context});
            this.lmn = context;
        }

        @Override // com.huawei.hms.analytics.az
        final Object klm() {
            try {
                Class<?> cls = Class.forName("com.vivo.push.PushClient");
                Object invoke = cls.getMethod("getInstance", Context.class).invoke(null, this.lmn);
                if (invoke != null) {
                    return cls.getDeclaredMethod("getRegId", new Class[0]).invoke(cls.cast(invoke), new Object[0]);
                }
            } catch (Exception unused) {
                HiLog.i("PtokenAccess", "invoke token Exception");
            }
            return null;
        }

        @Override // com.huawei.hms.analytics.az
        public final Bundle lmn(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("$HuaweiMedium", "");
            bundle.putString("$XiaomiMedium", "");
            bundle.putString("$VivoMedium", str);
            bundle.putString("$OppoMedium", "");
            return bundle;
        }

        @Override // com.huawei.hms.analytics.az
        public final String lmn() {
            Object klm = klm();
            return klm instanceof String ? (String) klm : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class ikl extends az {
        public ikl() {
            super("com.heytap.msp.push.HeytapPushManager", "getRegisterID", null, null);
        }

        @Override // com.huawei.hms.analytics.az
        public final Bundle lmn(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("$HuaweiMedium", "");
            bundle.putString("$XiaomiMedium", "");
            bundle.putString("$VivoMedium", "");
            bundle.putString("$OppoMedium", str);
            return bundle;
        }

        @Override // com.huawei.hms.analytics.az
        public final String lmn() {
            Object klm = klm();
            return klm instanceof String ? (String) klm : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class klm extends az {
        public klm(Context context) {
            super("com.xiaomi.mipush.sdk.MiPushClient", "getRegId", new Class[]{Context.class}, new Object[]{context});
        }

        @Override // com.huawei.hms.analytics.az
        public final Bundle lmn(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("$HuaweiMedium", "");
            bundle.putString("$XiaomiMedium", str);
            bundle.putString("$VivoMedium", "");
            bundle.putString("$OppoMedium", "");
            return bundle;
        }

        @Override // com.huawei.hms.analytics.az
        public final String lmn() {
            long j5 = ar.lmn().lmn.f8155q;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j5 < OpenStreetMapTileProviderConstants.ONE_MINUTE) {
                HiLog.i("PtokenAccess", "Get MI token interval < 1min");
                return "";
            }
            ar.lmn().lmn.f8155q = currentTimeMillis;
            Object klm = klm();
            return klm instanceof String ? (String) klm : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class lmn extends az {
        private final Context lmn;

        public lmn(Context context) {
            super(null, null, null, null);
            this.lmn = context;
        }

        private String klm(String str) {
            try {
                return HmsInstanceId.getInstance(this.lmn).getToken(str, "HCM");
            } catch (ApiException e5) {
                throw new IllegalArgumentException(e5.getMessage());
            }
        }

        @Override // com.huawei.hms.analytics.az
        public final Bundle lmn(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("$HuaweiMedium", str);
            bundle.putString("$XiaomiMedium", "");
            bundle.putString("$VivoMedium", "");
            bundle.putString("$OppoMedium", "");
            return bundle;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        @Override // com.huawei.hms.analytics.az
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String lmn() {
            /*
                r3 = this;
                com.huawei.hms.analytics.ar r0 = com.huawei.hms.analytics.ar.lmn()
                com.huawei.hms.analytics.at r0 = r0.lmn
                com.huawei.hms.analytics.ay r0 = r0.f8152n
                java.lang.String r0 = r0.klm
                java.lang.String r1 = r3.klm(r0)     // Catch: java.lang.IllegalArgumentException -> L1b
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.IllegalArgumentException -> L19
                if (r2 == 0) goto L27
                java.lang.String r1 = r3.klm(r0)     // Catch: java.lang.IllegalArgumentException -> L19
                goto L27
            L19:
                r0 = move-exception
                goto L1e
            L1b:
                r0 = move-exception
                java.lang.String r1 = ""
            L1e:
                java.lang.String r2 = "PtokenAccess"
                java.lang.String r0 = r0.getMessage()
                com.huawei.hms.analytics.core.log.HiLog.w(r2, r0)
            L27:
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L35
                com.huawei.hms.analytics.ar r0 = com.huawei.hms.analytics.ar.lmn()
                com.huawei.hms.analytics.at r0 = r0.lmn
                java.lang.String r1 = r0.f8153o
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.az.lmn.lmn():java.lang.String");
        }
    }

    az(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        this.lmn = str;
        this.klm = str2;
        this.ikl = clsArr;
        this.ijk = objArr;
    }

    Object klm() {
        try {
            return Class.forName(this.lmn).getMethod(this.klm, this.ikl).invoke(null, this.ijk);
        } catch (Exception unused) {
            HiLog.i("PtokenAccess", "invokeStaticFun() Exception");
            return null;
        }
    }

    public abstract Bundle lmn(String str);

    public abstract String lmn();
}
