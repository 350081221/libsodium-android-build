package com.tendcloud.tenddata;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public static CountDownLatch f11506a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        private static bi instance = new bi();

        private a() {
        }
    }

    private void a(final Context context) {
        if (context == null) {
            return;
        }
        try {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bi.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (cf.a()) {
                            cf.reflectMSA(context);
                            try {
                                bi.f11506a.await(2L, TimeUnit.SECONDS);
                                if (!y.b(df.a().c())) {
                                    return;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        if (cm.a()) {
                            cm.reflectMiUi(context);
                            return;
                        }
                        if (cb.a(context)) {
                            cb.bindHonorServiceGetOAID(context);
                            return;
                        }
                        if (ca.a(context)) {
                            ca.bindHWServiceGetOAID(context);
                            return;
                        }
                        if (ck.a(context)) {
                            ck.bindSECServiceGetOAID(context);
                            return;
                        }
                        if (cj.a(context)) {
                            cj.bindOPPOServiceGetOAID(context);
                            return;
                        }
                        if (ci.a(context)) {
                            ci.bindONEPLUSServiceGetOAID(context);
                            return;
                        }
                        if (cl.a()) {
                            cl.reflectVIVO(context);
                            return;
                        }
                        if (bz.a(context)) {
                            bz.bindASUSServiceGetOAID(context);
                            return;
                        }
                        if (ce.a(context)) {
                            ce.reflectMEiZU(context);
                            return;
                        }
                        if (cn.a(context)) {
                            cn.bindZTEServiceGetOAID(context);
                        } else if (cd.a(context)) {
                            cd.bindLENOVOServiceGetOAID(context);
                        } else if (cg.a(context)) {
                            cg.reflectNUBIA(context);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private bi() {
        a(ab.f11351g);
    }

    public static bi a() {
        return a.instance;
    }
}
