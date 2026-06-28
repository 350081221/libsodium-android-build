package com.lody.virtual.client.fixer;

import android.content.Context;
import android.content.ContextWrapper;
import com.lody.virtual.client.core.InvocationStubManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.proxies.am.ActivityManagerStub;
import com.lody.virtual.client.hook.proxies.clipboard.ClipBoardStub;
import com.lody.virtual.client.hook.proxies.graphics.GraphicsStatsStub;
import com.lody.virtual.client.hook.proxies.pm.PackageManagerStub;
import com.lody.virtual.helper.compat.BuildCompat;
import mirror.RefObject;
import mirror.android.app.ContextImpl;
import mirror.android.app.ContextImplKitkat;
import mirror.android.content.AttributionSource;
import mirror.android.content.AttributionSourceState;
import mirror.android.content.ContentResolverJBMR2;

/* loaded from: classes3.dex */
public class ContextFixer {
    public static void fixAttributionSource(Object obj, int i5) {
        fixAttributionSource(obj, VirtualCore.get().getHostPkg(), i5);
    }

    public static void fixAttributionSourceState(Object obj, String str, int i5) {
        if (obj != null && AttributionSourceState.TYPE.isInstance(obj)) {
            AttributionSourceState.packageName(obj, str);
            AttributionSourceState.uid(obj, i5);
        }
    }

    public static void fixContext(Context context, String str) {
        try {
            context.getPackageName();
            int i5 = 0;
            while (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                i5++;
                if (i5 >= 10) {
                    return;
                }
            }
            ContextImpl.mPackageManager.set(context, null);
            try {
                context.getPackageManager();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!VirtualCore.get().isVAppProcess()) {
                return;
            }
            InvocationStubManager invocationStubManager = InvocationStubManager.getInstance();
            invocationStubManager.checkEnv(GraphicsStatsStub.class);
            invocationStubManager.checkEnv(ActivityManagerStub.class);
            invocationStubManager.checkEnv(PackageManagerStub.class);
            invocationStubManager.checkEnv(ClipBoardStub.class);
            if (str != null) {
                String hostPkg = VirtualCore.get().getHostPkg();
                ContextImpl.mBasePackageName.set(context, hostPkg);
                if (ContextImplKitkat.mOpPackageName == null) {
                    try {
                        Class<?> cls = ContextImplKitkat.TYPE;
                        ContextImplKitkat.mOpPackageName = new RefObject<>(cls, cls.getDeclaredField("mOpPackageName"));
                    } catch (Throwable unused) {
                    }
                }
                RefObject<String> refObject = ContextImplKitkat.mOpPackageName;
                if (refObject != null) {
                    refObject.set(context, hostPkg);
                }
                ContentResolverJBMR2.mPackageName.set(context.getContentResolver(), str);
                if (BuildCompat.isS()) {
                    fixAttributionSource(ContextImpl.getAttributionSource(context), VirtualCore.get().myUid());
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void fixAttributionSource(Object obj, String str, int i5) {
        if (obj == null) {
            return;
        }
        fixAttributionSourceState(AttributionSource.mAttributionSourceState(obj), str, i5);
        fixAttributionSource(AttributionSource.getNext.call(obj, new Object[0]), str, i5);
    }

    public static void fixAttributionSourceState(Object obj, int i5) {
        fixAttributionSourceState(obj, VirtualCore.get().getHostPkg(), i5);
    }
}
