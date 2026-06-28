package com.huawei.hms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.lmn;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m {
    public l ikl;
    public ServiceConnection klm;
    public Context lmn;

    /* loaded from: classes3.dex */
    public final class lmn implements ServiceConnection {
        private lmn() {
        }

        public /* synthetic */ lmn(m mVar, byte b5) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.huawei.hms.analytics.lmn lmn;
            l lVar;
            String str;
            String str2;
            HiLog.i("PpsServiceCommander", "onServiceConnected");
            try {
                try {
                    try {
                        lmn = lmn.AbstractBinderC0162lmn.lmn(iBinder);
                    } catch (JSONException unused) {
                        m.this.ikl.lmn("parseChannelJson: json exception", "102");
                    }
                } catch (RemoteException e5) {
                    HiLog.e("PpsServiceCommander", "getChannelInfo Exception");
                    m.this.ikl.lmn(e5.getMessage(), "998");
                }
                if (lmn == null) {
                    lVar = m.this.ikl;
                    str = "pps service is null";
                    str2 = "006";
                } else {
                    String lmn2 = lmn.lmn();
                    if (!TextUtils.isEmpty(lmn2)) {
                        m.this.ikl.lmn(new JSONObject(lmn2).optString("channelInfo", ""));
                    } else {
                        lVar = m.this.ikl;
                        str = "channelInfo is empty";
                        str2 = "007";
                    }
                }
                lVar.lmn(str, str2);
            } finally {
                m.this.lmn();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HiLog.i("PpsServiceCommander", "onServiceDisconnected");
            m.this.ikl.lmn("onServiceDisconnected", "008");
        }
    }

    public m(Context context, l lVar) {
        this.lmn = context;
        this.ikl = lVar;
    }

    public final void lmn() {
        ServiceConnection serviceConnection;
        HiLog.i("PpsServiceCommander", "ads unBindService..");
        Context context = this.lmn;
        if (context == null || (serviceConnection = this.klm) == null) {
            return;
        }
        context.unbindService(serviceConnection);
    }
}
