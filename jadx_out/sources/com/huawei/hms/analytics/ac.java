package com.huawei.hms.analytics;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;

/* loaded from: classes3.dex */
public final class ac extends ad {
    private boolean ijk;

    /* JADX INFO: Access modifiers changed from: protected */
    public ac(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
        this.ijk = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private String ijk() {
        ContentProviderClient acquireContentProviderClient;
        Bundle call;
        ?? r12;
        String str = "";
        ContentProviderClient contentProviderClient = null;
        ContentProviderClient contentProviderClient2 = null;
        try {
            try {
                acquireContentProviderClient = this.klm.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
        }
        if (acquireContentProviderClient == null) {
            if (acquireContentProviderClient != null) {
                acquireContentProviderClient.close();
            }
            return "";
        }
        try {
            call = acquireContentProviderClient.call("getOAID", null, null);
        } catch (Exception unused2) {
            contentProviderClient2 = acquireContentProviderClient;
            HiLog.w("NibOaid", "contentResolver query exception");
            contentProviderClient = contentProviderClient2;
            if (contentProviderClient2 != null) {
                contentProviderClient2.close();
                contentProviderClient = contentProviderClient2;
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            contentProviderClient = acquireContentProviderClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            throw th;
        }
        if (call == null) {
            acquireContentProviderClient.close();
            return "";
        }
        if (call.getInt(PluginConstants.KEY_ERROR_CODE, -1) == 0) {
            str = call.getString("id");
            r12 = call;
        } else {
            r12 = 1;
            this.ijk = true;
        }
        acquireContentProviderClient.close();
        contentProviderClient = r12;
        return str;
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.huawei.hms.analytics.ad
    public final void lmn() {
        String ijk = ijk();
        if (!TextUtils.isEmpty(ijk) || this.ijk) {
            this.lmn.lmn(ijk, "", "oaid");
        } else {
            lmn("oaid is empty, begin get gaid");
        }
    }
}
