package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ghi {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public static volatile ghi cde;
    public Bundle abc = new Bundle();

    public static synchronized ghi def() {
        ghi ghiVar;
        synchronized (ghi.class) {
            if (cde == null) {
                cde = new ghi();
            }
            ghiVar = cde;
        }
        return ghiVar;
    }

    public long abc() {
        return 1000L;
    }

    public void abc(Context context) {
        Bundle bundle = new Bundle();
        if (context != null) {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (Throwable th) {
                bcd.warn(String.format(Locale.ENGLISH, "failed to load meta data: %s", th.getMessage()));
            }
        }
        this.abc = bundle;
    }

    public final boolean abc(int i5) {
        return i5 > 0;
    }

    public long bcd() {
        return 1000L;
    }

    public long cde() {
        return a1.b.f90a;
    }
}
