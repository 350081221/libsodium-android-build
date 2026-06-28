package com.lody.virtual.client.hook.proxies.alarm;

import android.app.AlarmManager;
import android.os.IInterface;
import android.os.WorkSource;
import androidx.core.app.NotificationCompat;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.utils.ArrayUtils;
import java.lang.reflect.Method;
import mirror.RefObject;
import mirror.android.app.IAlarmManager;

/* loaded from: classes3.dex */
public class AlarmManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class Set extends MethodProxy {
        private Set() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean beforeCall(Object obj, Method method, Object... objArr) {
            if (objArr[0] instanceof String) {
                objArr[0] = MethodProxy.getHostPkg();
            }
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, WorkSource.class);
            if (indexOfFirst >= 0) {
                objArr[indexOfFirst] = null;
                return true;
            }
            return true;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return super.call(obj, method, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "set";
        }
    }

    /* loaded from: classes3.dex */
    private static class SetTime extends MethodProxy {
        private SetTime() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.FALSE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setTime";
        }
    }

    public AlarmManagerStub() {
        super(IAlarmManager.Stub.asInterface, NotificationCompat.CATEGORY_ALARM);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        AlarmManager alarmManager = (AlarmManager) VirtualCore.get().getContext().getSystemService(NotificationCompat.CATEGORY_ALARM);
        RefObject<IInterface> refObject = mirror.android.app.AlarmManager.mService;
        if (refObject != null) {
            try {
                refObject.set(alarmManager, getInvocationStub().getProxyInterface());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new Set());
        addMethodProxy(new SetTime());
        addMethodProxy(new ReplaceFirstPkgMethodProxy("removeAll"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getNextAlarmClock"));
        addMethodProxy(new ResultStaticMethodProxy("setTimeZone", null));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("canScheduleExactAlarms"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("hasScheduleExactAlarm"));
    }
}
