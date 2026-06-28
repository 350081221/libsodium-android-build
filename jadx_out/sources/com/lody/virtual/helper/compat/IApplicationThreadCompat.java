package com.lody.virtual.helper.compat;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import mirror.android.app.IApplicationThread;
import mirror.android.app.IApplicationThreadICSMR1;
import mirror.android.app.IApplicationThreadKitkat;
import mirror.android.app.IApplicationThreadOreo;
import mirror.android.app.ServiceStartArgs;
import mirror.android.content.res.CompatibilityInfo;

/* loaded from: classes3.dex */
public class IApplicationThreadCompat {
    public static void scheduleBindService(IInterface iInterface, IBinder iBinder, Intent intent, boolean z4) throws RemoteException {
        IApplicationThreadKitkat.scheduleBindService.call(iInterface, iBinder, intent, Boolean.valueOf(z4), 0);
    }

    public static void scheduleCreateService(IInterface iInterface, IBinder iBinder, ServiceInfo serviceInfo) throws RemoteException {
        IApplicationThreadKitkat.scheduleCreateService.call(iInterface, iBinder, serviceInfo, CompatibilityInfo.DEFAULT_COMPATIBILITY_INFO.get(), 0);
    }

    public static void scheduleServiceArgs(IInterface iInterface, IBinder iBinder, int i5, Intent intent) throws RemoteException {
        if (BuildCompat.isOreo()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(ServiceStartArgs.ctor.newInstance(Boolean.FALSE, Integer.valueOf(i5), 0, intent));
            IApplicationThreadOreo.scheduleServiceArgs.call(iInterface, iBinder, ParceledListSliceCompat.create(arrayList));
            return;
        }
        IApplicationThreadICSMR1.scheduleServiceArgs.call(iInterface, iBinder, Boolean.FALSE, Integer.valueOf(i5), 0, intent);
    }

    public static void scheduleStopService(IInterface iInterface, IBinder iBinder) throws RemoteException {
        IApplicationThread.scheduleStopService.call(iInterface, iBinder);
    }

    public static void scheduleUnbindService(IInterface iInterface, IBinder iBinder, Intent intent) throws RemoteException {
        IApplicationThread.scheduleUnbindService.call(iInterface, iBinder, intent);
    }
}
