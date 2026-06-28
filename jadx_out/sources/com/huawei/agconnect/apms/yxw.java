package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.custom.ApmsLog;
import com.huawei.agconnect.apms.hilog.task.FetchTask;
import com.huawei.agconnect.apms.hilog.task.HiLogConfig;

/* loaded from: classes3.dex */
public class yxw implements ApmsLog {
    public static yxw bcd = new yxw();
    public boolean abc = false;

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void d(String str, String str2) {
        if (this.abc) {
            wvu.abc(3, str, str2);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void deny() {
        if (!Agent.isDisabled() && this.abc) {
            wvu.abc(HiLogConfig.ghi.fgh());
            HiLogConfig.ghi.abc(null);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void e(String str, String str2) {
        if (this.abc) {
            wvu.abc(6, str, str2);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void fetch(FetchTask.FetchCallback fetchCallback) {
        if (!Agent.isDisabled() && this.abc) {
            wvu.abc(fetchCallback);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void flush() {
        onm onmVar;
        if (!Agent.isDisabled() && this.abc && (onmVar = wvu.bcd) != null) {
            onmVar.flush();
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void grant() {
        if (!Agent.isDisabled() && this.abc) {
            wvu.bcd(HiLogConfig.ghi.fgh());
            HiLogConfig.ghi.abc(null);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void i(String str, String str2) {
        if (this.abc) {
            wvu.abc(4, str, str2);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void release() {
        if (!Agent.isDisabled() && this.abc) {
            onm onmVar = wvu.bcd;
            if (onmVar != null) {
                onmVar.release();
            }
            wvu.bcd = null;
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void v(String str, String str2) {
        if (this.abc) {
            wvu.abc(2, str, str2);
        }
    }

    @Override // com.huawei.agconnect.apms.custom.ApmsLog
    public void w(String str, String str2) {
        if (this.abc) {
            wvu.abc(5, str, str2);
        }
    }
}
