package com.lody.virtual.helper.utils;

import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;

/* loaded from: classes3.dex */
public class IInterfaceUtils {
    public static boolean isAlive(IInterface iInterface) {
        if (iInterface == null) {
            return false;
        }
        if (VirtualCore.get().isMainProcess()) {
            return iInterface.asBinder().pingBinder();
        }
        return iInterface.asBinder().isBinderAlive();
    }
}
