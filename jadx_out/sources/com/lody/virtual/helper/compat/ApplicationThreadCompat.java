package com.lody.virtual.helper.compat;

import android.os.IBinder;
import android.os.IInterface;
import mirror.android.app.ApplicationThreadNative;
import mirror.android.app.IApplicationThreadOreo;

/* loaded from: classes3.dex */
public class ApplicationThreadCompat {
    public static IInterface asInterface(IBinder iBinder) {
        if (BuildCompat.isOreo()) {
            return IApplicationThreadOreo.Stub.asInterface.call(iBinder);
        }
        return ApplicationThreadNative.asInterface.call(iBinder);
    }
}
