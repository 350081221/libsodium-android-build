package com.lody.virtual.helper.compat;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class PendingIntentCompat {
    public static PendingIntent readPendingIntent(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        obtain.writeStrongBinder(iBinder);
        obtain.setDataPosition(0);
        try {
            return PendingIntent.readPendingIntentOrNullFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }
}
