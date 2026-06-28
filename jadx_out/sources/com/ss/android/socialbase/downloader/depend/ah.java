package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface ah extends IInterface {
    long a(int i5, int i6) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements ah {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.ah$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0201a implements ah {

            /* renamed from: a, reason: collision with root package name */
            public static ah f10542a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10543b;

            C0201a(IBinder iBinder) {
                this.f10543b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ah
            public long a(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f10543b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(i5, i6);
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10543b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        public static ah a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ah)) {
                return (ah) queryLocalInterface;
            }
            return new C0201a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            long a5 = a(parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(a5);
            return true;
        }

        public static ah a() {
            return C0201a.f10542a;
        }
    }
}
