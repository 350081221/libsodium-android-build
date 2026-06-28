package com.lody.virtual.client.hook.providers;

import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import mirror.android.content.AttributionSource;

/* loaded from: classes3.dex */
public class ExternalProviderHook extends ProviderHook {
    public ExternalProviderHook(IInterface iInterface) {
        super(iInterface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public void processArgs(Method method, Object... objArr) {
        int index;
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                if (VirtualCore.get().isAppInstalled((String) obj)) {
                    objArr[0] = VirtualCore.get().getHostPkg();
                }
            }
            try {
                if (!BuildCompat.isS() || (index = MethodParameterUtils.getIndex(objArr, AttributionSource.TYPE)) < 0) {
                    return;
                }
                ContextFixer.fixAttributionSource(objArr[index], VirtualCore.get().myUid());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
