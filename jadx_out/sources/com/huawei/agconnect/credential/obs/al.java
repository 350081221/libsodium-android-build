package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.analytics.connector.ConnectorManager;
import com.huawei.hms.analytics.instance.CallBack;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class al implements ak {

    /* renamed from: a, reason: collision with root package name */
    an f7840a;

    /* renamed from: b, reason: collision with root package name */
    private ConnectorManager f7841b;

    public al(Context context, an anVar) {
        a(context, anVar);
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final void a() {
        ConnectorManager connectorManager = this.f7841b;
        if (connectorManager != null) {
            connectorManager.onReport();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, an anVar) {
        this.f7840a = anVar;
        try {
            if (TextUtils.isEmpty(anVar.f7847c)) {
                this.f7841b = new ConnectorManager(context, anVar.f7845a, anVar.f7846b);
            } else {
                this.f7841b = new ConnectorManager(context, anVar.f7845a, anVar.f7846b, anVar.f7847c);
            }
        } catch (Exception | NoClassDefFoundError unused) {
            Log.e("BridgeInstance", "createInstance error");
            this.f7841b = null;
        }
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final void a(String str, Bundle bundle) {
        ConnectorManager connectorManager = this.f7841b;
        if (connectorManager != null) {
            connectorManager.onEvent(str, bundle);
        }
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final void a(boolean z4) {
        ConnectorManager connectorManager = this.f7841b;
        if (connectorManager != null) {
            connectorManager.setEnableAndroidID(Boolean.valueOf(z4));
        }
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final Map<String, String> b(boolean z4) {
        ConnectorManager connectorManager = this.f7841b;
        return connectorManager != null ? connectorManager.getUserProfiles(z4) : new HashMap();
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final void c(boolean z4) {
        ConnectorManager connectorManager = this.f7841b;
        if (connectorManager != null) {
            try {
                connectorManager.setAnalyticsEnabled(z4);
            } catch (Throwable th) {
                Log.w("BridgeInstance", "setAnalyticsEnabled: " + th.getMessage());
            }
        }
    }

    @Override // com.huawei.agconnect.credential.obs.ak
    public final void syncOaid(final ai aiVar) {
        if (aiVar == null) {
            return;
        }
        ConnectorManager connectorManager = this.f7841b;
        if (connectorManager == null) {
            aiVar.result(-101, "Ha sdk init failed");
            return;
        }
        try {
            connectorManager.syncOaid(new CallBack() { // from class: com.huawei.agconnect.credential.obs.al.1
                @Override // com.huawei.hms.analytics.instance.CallBack
                public final void onResult(int i5, String str) {
                    aiVar.result(i5, str);
                }
            });
        } catch (Throwable th) {
            Log.w("BridgeInstance", "syncOaid error, " + th.getMessage());
        }
    }
}
