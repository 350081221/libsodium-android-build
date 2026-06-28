package com.lody.virtual.client.hook.proxies.usage;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.ipc.VActivityManager;
import java.lang.reflect.Method;
import mirror.android.app.IUsageStatsManager;

@TargetApi(22)
/* loaded from: classes3.dex */
public class UsageStatsManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private class ReplacePkgAndUserIdMethodProxy extends ReplaceLastPkgMethodProxy {
        public ReplacePkgAndUserIdMethodProxy(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[objArr.length - 1] instanceof Integer) {
                objArr[objArr.length - 1] = 0;
            }
            return super.call(obj, method, objArr);
        }
    }

    public UsageStatsManagerStub() {
        super(IUsageStatsManager.Stub.asInterface, "usagestats");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAppStandbyBucket"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("queryUsageStats"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("queryConfigurations"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("queryEvents"));
        addMethodProxy(new StaticMethodProxy("setAppInactive") { // from class: com.lody.virtual.client.hook.proxies.usage.UsageStatsManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                int i5;
                if (objArr.length > 2) {
                    i5 = ((Integer) objArr[2]).intValue();
                } else {
                    i5 = 0;
                }
                VActivityManager.get().setAppInactive((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), i5);
                return 0;
            }
        });
        addMethodProxy(new StaticMethodProxy("isAppInactive") { // from class: com.lody.virtual.client.hook.proxies.usage.UsageStatsManagerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                int i5;
                if (objArr.length > 1) {
                    i5 = ((Integer) objArr[1]).intValue();
                } else {
                    i5 = 0;
                }
                return Boolean.valueOf(VActivityManager.get().isAppInactive((String) objArr[0], i5));
            }
        });
        addMethodProxy(new ReplacePkgAndUserIdMethodProxy("whitelistAppTemporarily"));
        addMethodProxy(new ResultStaticMethodProxy("setAppStandbyBucket", null));
        addMethodProxy(new ResultStaticMethodProxy("setAppStandbyBuckets", null));
        addMethodProxy(new ResultStaticMethodProxy("registerAppUsageObserver", null));
        addMethodProxy(new ResultStaticMethodProxy("unregisterAppUsageObserver", null));
    }
}
