package com.huawei.hms.analytics;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public final class ae implements IInterface, i {
    private final IBinder ikl;
    private final String klm;
    private final int lmn = 1;

    public ae(String str, IBinder iBinder) {
        this.klm = str;
        this.ikl = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.ikl;
    }

    public final boolean klm() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(this.klm);
            this.ikl.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String lmn(String... strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken(this.klm);
                for (String str : strArr) {
                    obtain.writeString(str);
                }
                this.ikl.transact(this.lmn, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Exception unused) {
                HiLog.w("OaidService", "getId, Exception");
                obtain2.recycle();
                obtain.recycle();
                return null;
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean lmn() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z4 = false;
        try {
            try {
                obtain.writeInterfaceToken(this.klm);
                obtain.writeInt(1);
                this.ikl.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z4 = true;
                }
            } catch (Exception unused) {
                HiLog.w("OaidService", "isOaidTrackLimited, Exception");
            }
            return z4;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
