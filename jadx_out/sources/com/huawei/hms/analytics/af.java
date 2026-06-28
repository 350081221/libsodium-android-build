package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;

/* loaded from: classes3.dex */
public final class af implements i.lmn {
    private static ad klm;
    private static final af lmn = new af();

    private static void klm(String str, String str2, String str3) {
        ar.lmn().lmn.f8146h = str;
        ar.lmn().lmn.f8148j = str2;
        ar.lmn().lmn.f8147i = str3;
    }

    public static void lmn(Context context, String str) {
        boolean z4;
        HiLog.d("oaidMg", "start get oaid");
        ad adVar = null;
        if (!"CN".equals(str) && !"RU".equals(str) && !"SG".equals(str)) {
            if ("DE".equals(str)) {
                new by(str).klm();
                z4 = ar.lmn().lmn.f8151m;
            } else {
                z4 = false;
            }
            if (!z4) {
                klm(null, null, null);
                HiLog.i("oaidMg", "The current region does not support oaid collection.");
                return;
            }
        }
        if (!ar.lmn().lmn.f8149k) {
            klm("", "", "");
            HiLog.i("oaidMg", "Stopped collecting oaid.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ar.lmn().lmn.f8161w <= 86400000) {
            return;
        }
        ar.lmn().lmn.f8161w = currentTimeMillis;
        ad adVar2 = klm;
        if (adVar2 != null) {
            adVar = adVar2;
        } else {
            if (!z.lmn() && !z.klm()) {
                String str2 = Build.MANUFACTURER;
                if (!"COOLPAD".equalsIgnoreCase(str2) && !"XIAOLAJIAO".equalsIgnoreCase(str2) && !"GIONEE".equalsIgnoreCase(str2)) {
                    if (z.ikl() || "ONEPLUS".equalsIgnoreCase(str2)) {
                        adVar = new ag(context, lmn);
                    } else if ("MOTOROLA".equalsIgnoreCase(str2)) {
                        adVar = new aa(context, lmn);
                    } else if (z.ijk() || z.ghi()) {
                        adVar = new aj(context, lmn);
                    } else if ("NUBIA".equalsIgnoreCase(str2)) {
                        adVar = new ac(context, lmn);
                    } else {
                        if (!"DOOV".equalsIgnoreCase(str2)) {
                            if (!("FREEMEOS".equalsIgnoreCase(str2) || !TextUtils.isEmpty(dg.lmn("ro.build.freeme.label", "")))) {
                                if ("SAMSUNG".equalsIgnoreCase(str2)) {
                                    adVar = new ah(context, lmn);
                                } else if (z.hij()) {
                                    adVar = new ai(context, lmn);
                                } else {
                                    if ("MEIZU".equalsIgnoreCase(str2) || "FLYME".equals(Build.DISPLAY)) {
                                        adVar = new ab(context, lmn);
                                    }
                                }
                            }
                        }
                        adVar = new y(context, lmn);
                    }
                }
            }
            adVar = new y(context, lmn);
        }
        klm = adVar;
        if (adVar == null) {
            klm("", "", "");
        } else if (adVar.klm()) {
            klm.lmn();
        } else {
            klm.lmn("No support collect oid");
        }
    }

    @Override // com.huawei.hms.analytics.i.lmn
    public final void lmn(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str = cy.lmn().klm();
            str2 = "";
            str3 = com.huawei.agconnect.credential.obs.c.f7851a;
        }
        klm(str, str2, str3);
    }
}
