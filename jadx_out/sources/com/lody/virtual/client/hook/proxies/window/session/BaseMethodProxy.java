package com.lody.virtual.client.hook.proxies.window.session;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.WindowManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.helper.utils.ArrayUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class BaseMethodProxy extends StaticMethodProxy {
    private boolean mDrawOverlays;

    public BaseMethodProxy(String str) {
        super(str);
        this.mDrawOverlays = false;
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    @SuppressLint({"SwitchIntDef"})
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        WindowManager.LayoutParams layoutParams;
        this.mDrawOverlays = false;
        int indexOfFirst = ArrayUtils.indexOfFirst(objArr, WindowManager.LayoutParams.class);
        if (indexOfFirst != -1 && (layoutParams = (WindowManager.LayoutParams) objArr[indexOfFirst]) != null) {
            layoutParams.packageName = MethodProxy.getHostPkg();
            int i5 = layoutParams.type;
            if (i5 == 2002 || i5 == 2003 || i5 == 2006 || i5 == 2007 || i5 == 2010 || i5 == 2038) {
                this.mDrawOverlays = true;
            }
            if (Build.VERSION.SDK_INT >= 26 && VirtualCore.get().getTargetSdkVersion() >= 26 && this.mDrawOverlays) {
                layoutParams.type = 2038;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isDrawOverlays() {
        return this.mDrawOverlays;
    }
}
