package com.swift.sandhook;

import com.swift.sandhook.wrapper.HookErrorException;
import com.swift.sandhook.wrapper.HookWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class PendingHookHandler {
    private static boolean canUsePendingHook;
    private static Map<Class, Vector<HookWrapper.HookEntity>> pendingHooks = new ConcurrentHashMap();

    static {
        if (SandHookConfig.delayHook) {
            canUsePendingHook = SandHook.initForPendingHook();
        }
    }

    public static synchronized void addPendingHook(HookWrapper.HookEntity hookEntity) {
        synchronized (PendingHookHandler.class) {
            Vector<HookWrapper.HookEntity> vector = pendingHooks.get(hookEntity.target.getDeclaringClass());
            if (vector == null) {
                vector = new Vector<>();
                pendingHooks.put(hookEntity.target.getDeclaringClass(), vector);
            }
            vector.add(hookEntity);
            SandHook.addPendingHookNative(hookEntity.target);
        }
    }

    public static boolean canWork() {
        return canUsePendingHook && SandHook.canGetObject();
    }

    public static void onClassInit(long j5) {
        Class cls;
        Vector<HookWrapper.HookEntity> vector;
        if (j5 == 0 || (cls = (Class) SandHook.getObject(j5)) == null || (vector = pendingHooks.get(cls)) == null) {
            return;
        }
        Iterator<HookWrapper.HookEntity> it = vector.iterator();
        while (it.hasNext()) {
            HookWrapper.HookEntity next = it.next();
            HookLog.w("do pending hook for method: " + next.target.toString());
            try {
                next.initClass = false;
                SandHook.hook(next);
            } catch (HookErrorException e5) {
                HookLog.e("Pending Hook Error!", e5);
            }
        }
        pendingHooks.remove(cls);
    }
}
