package com.huawei.hms.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface lmn extends IInterface {

    /* renamed from: com.huawei.hms.analytics.lmn$lmn, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0162lmn extends Binder implements lmn {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.analytics.lmn$lmn$lmn, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0163lmn implements lmn {
            public static lmn lmn;
            private IBinder klm;

            C0163lmn(IBinder iBinder) {
                this.klm = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.klm;
            }

            @Override // com.huawei.hms.analytics.lmn
            public final String lmn() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    if (!this.klm.transact(1, obtain, obtain2, 0) && AbstractBinderC0162lmn.klm() != null) {
                        return AbstractBinderC0162lmn.klm().lmn();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static lmn klm() {
            return C0163lmn.lmn;
        }

        public static lmn lmn(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof lmn)) ? new C0163lmn(iBinder) : (lmn) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                return true;
            }
            parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
            String lmn = lmn();
            parcel2.writeNoException();
            parcel2.writeString(lmn);
            return true;
        }
    }

    String lmn();
}
