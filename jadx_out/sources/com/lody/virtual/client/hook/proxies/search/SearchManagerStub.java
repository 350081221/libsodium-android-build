package com.lody.virtual.client.hook.proxies.search;

import android.annotation.TargetApi;
import android.content.ComponentName;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.ss.android.download.api.constant.BaseConstants;
import java.lang.reflect.Method;
import mirror.android.app.ISearchManager;

@TargetApi(17)
/* loaded from: classes3.dex */
public class SearchManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class GetSearchableInfo extends MethodProxy {
        private GetSearchableInfo() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            if (componentName != null && VirtualCore.getPM().getActivityInfo(componentName, 0) != null) {
                return null;
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getSearchableInfo";
        }
    }

    public SearchManagerStub() {
        super(ISearchManager.Stub.asInterface, BaseConstants.MARKET_URI_AUTHORITY_SEARCH);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("launchLegacyAssist"));
        addMethodProxy(new GetSearchableInfo());
    }
}
