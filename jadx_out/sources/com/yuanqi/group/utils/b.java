package com.yuanqi.group.utils;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f14074a = "IBinderTool";

    public static void a() {
        for (String str : (String[]) Reflect.on(ServiceManager.TYPE).call("listServices").get()) {
            IBinder iBinder = (IBinder) Reflect.on(ServiceManager.TYPE).call("getService", str).get();
            if (iBinder == null) {
                Log.w(f14074a, "srv=" + str + " no find ");
            } else {
                try {
                    Log.i(f14074a, "srv=" + str + "@" + iBinder.getInterfaceDescriptor());
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static void b(String str) {
        try {
            for (Method method : Class.forName(str).getDeclaredMethods()) {
                Log.i(f14074a, "method=" + method);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(String str) {
        f14074a = str;
    }
}
