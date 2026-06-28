package com.huawei.hms.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.analytics.efg;

/* loaded from: classes3.dex */
public interface def extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class lmn extends Binder implements def {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.analytics.def$lmn$lmn, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0159lmn implements def {
            public static def lmn;
            private IBinder klm;

            C0159lmn(IBinder iBinder) {
                this.klm = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.klm;
            }

            @Override // com.huawei.hms.analytics.def
            public final String lmn() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.analytics.IHiAnalyticsService");
                    if (!this.klm.transact(2, obtain, obtain2, 0) && lmn.klm() != null) {
                        return lmn.klm().lmn();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.analytics.def
            public final void lmn(efg efgVar, UploadInfo uploadInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.analytics.IHiAnalyticsService");
                    obtain.writeStrongBinder(efgVar != null ? efgVar.asBinder() : null);
                    if (uploadInfo != null) {
                        obtain.writeInt(1);
                        uploadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.klm.transact(1, obtain, obtain2, 0) || lmn.klm() == null) {
                        obtain2.readException();
                    } else {
                        lmn.klm().lmn(efgVar, uploadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static def klm() {
            return C0159lmn.lmn;
        }

        public static def lmn(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.analytics.IHiAnalyticsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof def)) ? new C0159lmn(iBinder) : (def) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            efg c0160lmn;
            if (i5 == 1) {
                parcel.enforceInterface("com.huawei.hms.analytics.IHiAnalyticsService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0160lmn = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.huawei.hms.analytics.IHiAnalyticsCallback");
                    c0160lmn = (queryLocalInterface == null || !(queryLocalInterface instanceof efg)) ? new efg.lmn.C0160lmn(readStrongBinder) : (efg) queryLocalInterface;
                }
                lmn(c0160lmn, parcel.readInt() != 0 ? UploadInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i5 != 2) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.huawei.hms.analytics.IHiAnalyticsService");
                return true;
            }
            parcel.enforceInterface("com.huawei.hms.analytics.IHiAnalyticsService");
            String lmn = lmn();
            parcel2.writeNoException();
            parcel2.writeString(lmn);
            return true;
        }
    }

    String lmn();

    void lmn(efg efgVar, UploadInfo uploadInfo);
}
