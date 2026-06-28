package com.bytedance.pangle.flipped;

import android.annotation.SuppressLint;
import android.util.Log;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.log.IZeusReporter;
import dalvik.system.VMRuntime;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class b implements c {
    @Override // com.bytedance.pangle.flipped.c
    @SuppressLint({"DiscouragedPrivateApi"})
    public final void invokeHiddenApiRestrictions() {
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, com.alipay.sdk.m.x.c.f3016c);
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Method method = (Method) declaredMethod.invoke(VMRuntime.class, "getRuntime", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = (Method) declaredMethod.invoke(VMRuntime.class, "setHiddenApiExemptions", new Class[]{String[].class});
            method2.setAccessible(true);
            method2.invoke(invoke, new String[]{"L"});
        } catch (Exception e5) {
            GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, "V1 invokeHiddenApiRestrictions fail: " + Log.getStackTraceString(e5));
            Log.e("FlippedV1Impl", "V1 invokeHiddenApiRestrictions fail: " + Log.getStackTraceString(e5));
        }
    }
}
