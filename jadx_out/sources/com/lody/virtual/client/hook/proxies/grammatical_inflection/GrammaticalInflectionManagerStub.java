package com.lody.virtual.client.hook.proxies.grammatical_inflection;

import android.os.IInterface;
import androidx.annotation.RequiresApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgAndFirstUidMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUidMethodProxy;
import com.lody.virtual.helper.utils.VLog;
import java.lang.reflect.Method;
import mirror.android.app.GrammaticalInflectionManager;
import mirror.android.app.IGrammaticalInflectionManager;

@RequiresApi(api = 34)
/* loaded from: classes3.dex */
public class GrammaticalInflectionManagerStub extends BinderInvocationProxy {
    public GrammaticalInflectionManagerStub() {
        super(IGrammaticalInflectionManager.Stub.asInterface, "grammatical_inflection");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        try {
            if (GrammaticalInflectionManager.TYPE != null) {
                IInterface proxyInterface = getInvocationStub().getProxyInterface();
                Object systemService = getContext().getSystemService(GrammaticalInflectionManager.TYPE);
                if (systemService != null && proxyInterface != null) {
                    GrammaticalInflectionManager.mService.set(systemService, proxyInterface);
                }
            }
        } catch (Throwable th) {
            VLog.e(VLog.TAG_DEFAULT, "GrammaticalInflectionManagerStub inject error.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("setRequestedApplicationGrammaticalGender"));
        addMethodProxy(new ReplaceLastUidMethodProxy("setSystemWideGrammaticalGender"));
        addMethodProxy(new FixAttributionSourceMethodProxy("peekSystemGrammaticalGenderByUserId") { // from class: com.lody.virtual.client.hook.proxies.grammatical_inflection.GrammaticalInflectionManagerStub.1
            @Override // com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
            public boolean beforeCall(Object obj, Method method, Object... objArr) {
                MethodProxy.replaceLastUserId(objArr);
                return super.beforeCall(obj, method, objArr);
            }
        });
    }
}
