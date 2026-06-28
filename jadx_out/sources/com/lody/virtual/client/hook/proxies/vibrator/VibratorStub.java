package com.lody.virtual.client.hook.proxies.vibrator;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class VibratorStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static final class VibrateMethodProxy extends ReplaceCallingPkgMethodProxy {
        @Override // com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public boolean beforeCall(Object obj, Method method, Object... objArr) {
            if (objArr[0] instanceof Integer) {
                objArr[0] = Integer.valueOf(MethodProxy.getRealUid());
            }
            return super.beforeCall(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return super.call(obj, method, objArr);
        }

        private VibrateMethodProxy(String str) {
            super(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VibratorStub() {
        /*
            r2 = this;
            boolean r0 = com.lody.virtual.helper.compat.BuildCompat.isS()
            if (r0 == 0) goto L9
            mirror.RefStaticMethod<android.os.IInterface> r0 = mirror.com.android.internal.os.IVibratorManagerService.Stub.asInterface
            goto Lb
        L9:
            mirror.RefStaticMethod<android.os.IInterface> r0 = mirror.com.android.internal.os.IVibratorService.Stub.asInterface
        Lb:
            boolean r1 = com.lody.virtual.helper.compat.BuildCompat.isS()
            if (r1 == 0) goto L14
            java.lang.String r1 = "vibrator_manager"
            goto L16
        L14:
            java.lang.String r1 = "vibrator"
        L16:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.hook.proxies.vibrator.VibratorStub.<init>():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        addMethodProxy(new VibrateMethodProxy("vibrateMagnitude"));
        addMethodProxy(new VibrateMethodProxy("vibratePatternMagnitude"));
        addMethodProxy(new VibrateMethodProxy("vibrate"));
        addMethodProxy(new VibrateMethodProxy("vibratePattern"));
    }
}
