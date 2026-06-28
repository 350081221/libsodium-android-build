package com.huawei.agconnect.apms;

import android.util.Log;
import com.huawei.agconnect.apms.log.AgentLog;

/* loaded from: classes3.dex */
public class z0 implements AgentLog {
    public int abc = 4;

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void debug(String str) {
        if (this.abc == 3) {
            Log.d(AgentLog.TAG, str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void error(String str) {
        if (this.abc <= 6) {
            Log.e(AgentLog.TAG, str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public int getLevel() {
        return this.abc;
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void info(String str) {
        if (this.abc <= 4) {
            Log.i(AgentLog.TAG, str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void setLevel(int i5) {
        if (i5 >= 3 && i5 <= 6) {
            this.abc = i5;
            return;
        }
        throw new IllegalArgumentException("Log level is not between DEBUG and ERROR");
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void warn(String str) {
        if (this.abc <= 5) {
            Log.w(AgentLog.TAG, str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void error(String str, Throwable th) {
        if (this.abc <= 6) {
            Log.e(AgentLog.TAG, str, th);
        }
    }
}
