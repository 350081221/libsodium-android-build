package com.lody.virtual;

import android.content.Context;
import android.os.Build;
import android.os.StatsManagerServiceStub;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.swift.sandhook.HookLog;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import com.swift.sandhook.xcompat.a;
import com.swift.sandhook.xcompat.o;
import java.io.File;
import java.lang.reflect.Member;
import u.dont.know.what.i.am.g;
import u.dont.know.what.i.am.h;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public class SandXposed {
    public static void init() {
        boolean z4;
        SandHookConfig.DEBUG = false;
        HookLog.DEBUG = SandHookConfig.DEBUG;
        if (SandHookConfig.SDK_INT < 26) {
            z4 = true;
        } else {
            z4 = false;
        }
        SandHookConfig.compiler = z4;
        SandHookConfig.delayHook = false;
        SandHook.setHookModeCallBack(new SandHook.HookModeCallBack() { // from class: com.lody.virtual.SandXposed.1
            @Override // com.swift.sandhook.SandHook.HookModeCallBack
            public int hookMode(Member member) {
                return Build.VERSION.SDK_INT >= 30 ? 2 : 0;
            }
        });
        SandHook.disableVMInline();
        a.cacheDir = new File(VirtualCore.get().getContext().getCacheDir(), "sandhook_cache_general");
    }

    public static void initForXposed(Context context, String str) {
        a.cacheDir = new File(context.getCacheDir(), o.MD5(str));
        try {
            if (BinderInvocationProxy.getService(StatsManagerServiceStub.SERVER_NAME) == null) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.app.StatsManager");
                h hVar = new h() { // from class: com.lody.virtual.SandXposed.2
                    protected Object e(g.a aVar) throws Throwable {
                        return null;
                    }
                };
                j.e(loadClass, "addConfig", hVar);
                j.e(loadClass, "setFetchReportsOperation", hVar);
                j.e(loadClass, "removeConfig", hVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
