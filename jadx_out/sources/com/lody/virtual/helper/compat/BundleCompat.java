package com.lody.virtual.helper.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import mirror.android.os.BaseBundle;
import mirror.android.os.BundleICS;

/* loaded from: classes3.dex */
public class BundleCompat {
    public static void clearParcelledData(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(0);
        obtain.setDataPosition(0);
        if (BaseBundle.TYPE != null) {
            Parcel parcel = BaseBundle.mParcelledData.get(bundle);
            if (parcel != null) {
                parcel.recycle();
            }
            BaseBundle.mParcelledData.set(bundle, obtain);
            return;
        }
        if (BundleICS.TYPE != null) {
            Parcel parcel2 = BundleICS.mParcelledData.get(bundle);
            if (parcel2 != null) {
                parcel2.recycle();
            }
            BundleICS.mParcelledData.set(bundle, obtain);
        }
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }

    public static IBinder getBinder(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return getBinder(bundleExtra, "binder");
        }
        return null;
    }

    public static void putBinder(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = new Bundle();
        putBinder(bundle, "binder", iBinder);
        intent.putExtra(str, bundle);
    }
}
