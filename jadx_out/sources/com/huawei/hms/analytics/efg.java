package com.huawei.hms.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public interface efg extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class lmn extends Binder implements efg {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.analytics.efg$lmn$lmn, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0160lmn implements efg {
            public static efg lmn;
            private IBinder klm;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0160lmn(IBinder iBinder) {
                this.klm = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.klm;
            }

            @Override // com.huawei.hms.analytics.efg
            public final int lmn(List<CustomEvent> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.analytics.IHiAnalyticsCallback");
                    obtain.writeTypedList(list);
                    if (!this.klm.transact(1, obtain, obtain2, 0) && lmn.lmn() != null) {
                        return lmn.lmn().lmn(list);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public lmn() {
            attachInterface(this, "com.huawei.hms.analytics.IHiAnalyticsCallback");
        }

        public static efg lmn() {
            return C0160lmn.lmn;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.huawei.hms.analytics.IHiAnalyticsCallback");
                return true;
            }
            parcel.enforceInterface("com.huawei.hms.analytics.IHiAnalyticsCallback");
            int lmn = lmn(parcel.createTypedArrayList(CustomEvent.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(lmn);
            return true;
        }
    }

    int lmn(List<CustomEvent> list);
}
