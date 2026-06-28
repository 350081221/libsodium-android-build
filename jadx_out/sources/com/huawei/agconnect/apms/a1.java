package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;

/* loaded from: classes3.dex */
public class a1 implements AgentLog {
    public final Object abc = new Object();
    public AgentLog bcd = new z0();

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void debug(String str) {
        synchronized (this.abc) {
            this.bcd.debug(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void error(String str) {
        synchronized (this.abc) {
            this.bcd.error(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public int getLevel() {
        int level;
        synchronized (this.abc) {
            level = this.bcd.getLevel();
        }
        return level;
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void info(String str) {
        synchronized (this.abc) {
            this.bcd.info(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void setLevel(int i5) {
        synchronized (this.abc) {
            this.bcd.setLevel(i5);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void warn(String str) {
        synchronized (this.abc) {
            this.bcd.warn(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public void error(String str, Throwable th) {
        synchronized (this.abc) {
            this.bcd.error(str, th);
        }
    }
}
