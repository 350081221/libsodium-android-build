package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.analytics.connector.ConnectorManager;
import com.huawei.hms.analytics.instance.CallBack;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a2 implements v1.a {
    public ConnectorManager abc;
    public c2 bcd;

    /* loaded from: classes3.dex */
    public class abc implements CallBack {
        public abc(a2 a2Var) {
        }

        @Override // com.huawei.hms.analytics.instance.CallBack
        public final void onResult(int i5, String str) {
            throw null;
        }
    }

    public a2(Context context, c2 c2Var) {
        abc(context, c2Var);
    }

    public final void abc(Context context, c2 c2Var) {
        this.bcd = c2Var;
        try {
            if (TextUtils.isEmpty(c2Var.cde)) {
                this.abc = new ConnectorManager(context, c2Var.abc, c2Var.bcd);
            } else {
                this.abc = new ConnectorManager(context, c2Var.abc, c2Var.bcd, c2Var.cde);
            }
        } catch (Exception | NoClassDefFoundError unused) {
            Log.e("BridgeInstance", "createInstance error");
            this.abc = null;
        }
    }

    @Override // v1.a
    public final Map<String, String> getUserProfiles(boolean z4) {
        ConnectorManager connectorManager = this.abc;
        return connectorManager != null ? connectorManager.getUserProfiles(z4) : new HashMap();
    }

    @Override // v1.a
    public final void onEvent(String str, Bundle bundle) {
        ConnectorManager connectorManager = this.abc;
        if (connectorManager != null) {
            connectorManager.onEvent(str, bundle);
        }
    }

    @Override // v1.a
    public final void onReport() {
        ConnectorManager connectorManager = this.abc;
        if (connectorManager != null) {
            connectorManager.onReport();
        }
    }

    @Override // v1.a
    public final void setAnalyticsEnabled(boolean z4) {
        ConnectorManager connectorManager = this.abc;
        if (connectorManager != null) {
            try {
                connectorManager.setAnalyticsEnabled(z4);
            } catch (Throwable th) {
                Log.w("BridgeInstance", "setAnalyticsEnabled: " + th.getMessage());
            }
        }
    }

    @Override // v1.a
    public final void setEnableAndroidID(boolean z4) {
        ConnectorManager connectorManager = this.abc;
        if (connectorManager != null) {
            connectorManager.setEnableAndroidID(Boolean.valueOf(z4));
        }
    }

    @Override // v1.a
    public final void syncOaid(y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        ConnectorManager connectorManager = this.abc;
        if (connectorManager == null) {
            y1Var.abc(-101, "Ha sdk init failed");
            return;
        }
        try {
            connectorManager.syncOaid(new abc(this));
        } catch (Throwable th) {
            Log.w("BridgeInstance", "syncOaid error, " + th.getMessage());
        }
    }
}
