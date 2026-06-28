package com.huawei.hms.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.a;
import com.huawei.hms.analytics.ak;
import com.huawei.hms.analytics.an;
import com.huawei.hms.analytics.ar;
import com.huawei.hms.analytics.ba;
import com.huawei.hms.analytics.bh;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.cx;
import com.huawei.hms.analytics.dc;
import com.huawei.hms.analytics.dd;
import com.huawei.hms.analytics.di;
import com.huawei.hms.analytics.dj;
import com.huawei.hms.analytics.dq;
import com.huawei.hms.analytics.fgh;
import com.huawei.hms.analytics.framework.SyncManager;
import com.huawei.hms.analytics.hij;
import com.huawei.hms.analytics.instance.CallBack;
import com.huawei.hms.analytics.klm;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ConnectorManager {
    private String ikl;
    private ak klm;
    private boolean lmn;

    public ConnectorManager(Context context, String str, String str2) {
        lmn(context, str, str2, GrsBaseInfo.CountryCodeSource.UNKNOWN);
    }

    public ConnectorManager(Context context, String str, String str2, String str3) {
        lmn(context, str, str2, str3);
    }

    private void klm(Context context, String str, String str2, String str3) {
        Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        fgh.lmn();
        fgh.lmn(new hij(context, new klm(!GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str3), str3), str, str3, SyncManager.TaskNames.INIT_TASK_CONNECTOR));
        bh lmn = fgh.lmn().lmn(str);
        if (lmn == null) {
            ak akVar = new ak(applicationContext, str);
            this.klm = akVar;
            akVar.ikl(str2);
            fgh.lmn().lmn(str, this.klm);
        } else {
            this.klm = (ak) lmn;
        }
        a.lmn(context);
    }

    private void lmn(Context context, String str, String str2, String str3) {
        if (!dq.lmn().lmn(context)) {
            HiLog.w("InteractionManager", "user unlock");
            return;
        }
        if (context == null || TextUtils.isEmpty(str) || str.length() > 256 || TextUtils.isEmpty(str2) || str2.length() > 256) {
            HiLog.w("InteractionManager", "connectManager param is not right");
            return;
        }
        try {
            this.ikl = str;
            klm(context, str, str2, str3);
            this.lmn = true;
        } catch (Throwable th) {
            HiLog.e("InteractionManager", "other exception,init connector instance error ");
            di.lmn(th);
        }
    }

    public Map<String, String> getUserProfiles(boolean z4) {
        if (this.lmn) {
            if (ba.klm(this.ikl)) {
                return this.klm.lmn(z4);
            }
            try {
                SyncManager.getInstance().await(SyncManager.TaskNames.INIT_TASK_CONNECTOR, 150L);
                return this.klm.lmn(z4);
            } catch (InterruptedException unused) {
                HiLog.w("InteractionManager", "getUserProfiles Interrupted Exception");
            }
        }
        return new HashMap();
    }

    public void onEvent(final String str, Bundle bundle) {
        if (this.lmn) {
            HiLog.i("InteractionManager", "connectManager onEvent");
            final Bundle lmn = dd.lmn(bundle);
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.connector.ConnectorManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    Bundle bundle2;
                    if (ba.klm(ConnectorManager.this.ikl)) {
                        ak akVar = ConnectorManager.this.klm;
                        String str2 = str;
                        Bundle bundle3 = lmn;
                        if (!ar.lmn().lmn.fgh || !ar.lmn().lmn(akVar.hij).ikl) {
                            HiLog.w("interactionInstance", "The Analytics Kit is disabled");
                            return;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            HiLog.w("interactionInstance", HiLog.ErrorCode.PE001, " param is null");
                            return;
                        }
                        if (bundle3 == null) {
                            HiLog.w("interactionInstance", "bundle is null");
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = (Bundle) bundle3.clone();
                        }
                        dj djVar = new dj(str2, akVar.hij);
                        if (!dc.lmn(str2, an.klm)) {
                            djVar.ikl(bundle2);
                            akVar.lmn(str2, djVar);
                        } else if (dc.lmn(str2, 256)) {
                            if (djVar.lmn(bundle2)) {
                                akVar.lmn(str2, djVar, System.currentTimeMillis());
                            } else {
                                HiLog.w("interactionInstance", HiLog.ErrorCode.PE006, "bundle params is invalid.");
                            }
                        }
                    }
                }
            });
        }
    }

    public void onReport() {
        if (this.lmn) {
            HiLog.i("InteractionManager", "connectManager onReport");
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.connector.ConnectorManager.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!ar.lmn().lmn(ConnectorManager.this.ikl).ikl) {
                        HiLog.w("InteractionManager", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
                    } else if (ba.klm(ConnectorManager.this.ikl)) {
                        ConnectorManager.this.klm.lmn();
                    }
                }
            });
        }
    }

    public void setAnalyticsEnabled(final boolean z4) {
        if (this.lmn) {
            final ak akVar = this.klm;
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.ak.1
                @Override // java.lang.Runnable
                public final void run() {
                    au lmn = ar.lmn().lmn(ak.this.hij);
                    boolean z5 = lmn.ikl;
                    boolean z6 = z4;
                    if (z5 == z6) {
                        return;
                    }
                    lmn.ikl = z6;
                    dl.lmn(ak.this.ijk, "global_v2", "is_analytics_enabled" + ak.this.hij, z4);
                }
            });
        }
    }

    @Deprecated
    public void setEnableAndroidID(Boolean bool) {
        if (this.lmn) {
            ar.lmn().lmn(this.klm.hij).lmn = bool.booleanValue();
        }
    }

    public void syncOaid(CallBack callBack) {
        if (callBack == null) {
            HiLog.w("InteractionManager", "callback is null");
            return;
        }
        if (this.lmn) {
            this.klm.lmn(callBack);
            return;
        }
        callBack.onResult(-101, this.ikl + " init failed");
    }
}
