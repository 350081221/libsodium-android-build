package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class r1 {
    public static final AgentLog efg = AgentLogManager.getAgentLog();
    public static volatile r1 fgh;
    public AGConnectConfig abc;
    public final ExecutorService bcd = Executors.newSingleThreadExecutor(new NamedThreadFactory("RemoteConfigManager"));
    public boolean cde = false;
    public def def;

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r1.this.abc(86400L);
            } catch (Throwable th) {
                com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("exception occurred while fetch remote config: "), r1.efg);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements com.huawei.hmf.tasks.h {
        public bcd() {
        }

        @Override // com.huawei.hmf.tasks.h
        public void onFailure(Exception exc) {
            def defVar = r1.this.def;
            if (defVar != null) {
                ((com.huawei.agconnect.apms.bcd) defVar).abc(exc);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class cde implements com.huawei.hmf.tasks.i<ConfigValues> {
        public cde() {
        }

        @Override // com.huawei.hmf.tasks.i
        public void onSuccess(ConfigValues configValues) {
            ConfigValues configValues2 = configValues;
            if (configValues2 != null) {
                r1.this.abc.apply(configValues2);
            }
            def defVar = r1.this.def;
            if (defVar != null) {
                ((com.huawei.agconnect.apms.bcd) defVar).abc(configValues2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface def {
    }

    public static r1 def() {
        if (fgh == null) {
            synchronized (r1.class) {
                if (fgh == null) {
                    fgh = new r1();
                }
            }
        }
        return fgh;
    }

    public final boolean bcd() {
        if (this.abc != null) {
            return true;
        }
        efg.error("can not get remote config with AGConnectConfig null instance.");
        return false;
    }

    public void cde() {
        this.bcd.execute(new abc());
    }

    public void abc() {
        this.abc = AGConnectConfig.getInstance();
    }

    public final void abc(long j5) {
        efg.info("begin to fetch remote config.");
        if (bcd()) {
            this.abc.apply(this.abc.loadLastFetched());
            this.abc.fetch(j5).k(new cde()).h(new bcd());
        }
    }
}
