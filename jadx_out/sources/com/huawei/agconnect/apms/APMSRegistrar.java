package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Handler;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class APMSRegistrar implements ServiceRegistrar {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();

    /* loaded from: classes3.dex */
    public class abc implements AccessNetworkManager.AccessNetworkCallback {
        public final /* synthetic */ Context abc;

        public abc(Context context) {
            this.abc = context;
        }

        @Override // com.huawei.agconnect.common.network.AccessNetworkManager.AccessNetworkCallback
        public void onNetWorkReady() {
            APMSRegistrar.this.initHiAnalyticsManager(this.abc);
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements Runnable {
        public final /* synthetic */ Context abc;

        public bcd(APMSRegistrar aPMSRegistrar, Context context) {
            this.abc = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HiAnalyticsManager.getInstance().init(this.abc);
                HiAnalyticsManager.getInstance().setAnalyticsEnable(APMS.getInstance().isUserPrivacyAgreed());
            } catch (Throwable th) {
                com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while init HiAnalyticsManager: "), APMSRegistrar.LOG);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initHiAnalyticsManager(Context context) {
        new Handler().post(new bcd(this, context));
    }

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public List<Service> getServices(Context context) {
        return Arrays.asList(Service.builder(APMS.class).build());
    }

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public void initialize(Context context) {
        AccessNetworkManager.getInstance().addCallback(new abc(context));
    }
}
