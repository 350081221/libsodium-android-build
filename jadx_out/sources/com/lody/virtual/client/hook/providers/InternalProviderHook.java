package com.lody.virtual.client.hook.providers;

import android.os.IInterface;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import mirror.android.content.AttributionSource;

/* loaded from: classes3.dex */
public class InternalProviderHook extends ProviderHook {
    public InternalProviderHook(IInterface iInterface) {
        super(iInterface);
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public void processArgs(Method method, Object... objArr) {
        int index;
        if (objArr != null && objArr.length != 0) {
            try {
                if (!BuildCompat.isS() || (index = MethodParameterUtils.getIndex(objArr, AttributionSource.TYPE)) < 0) {
                    return;
                }
                ContextFixer.fixAttributionSource(objArr[index], VClient.get().getVUid());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
