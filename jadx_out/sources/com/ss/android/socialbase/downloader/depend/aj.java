package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface aj extends IInterface {
    void a(int i5, int i6) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements aj {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.aj$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0202a implements aj {

            /* renamed from: a, reason: collision with root package name */
            public static aj f10544a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10545b;

            C0202a(IBinder iBinder) {
                this.f10545b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.aj
            public void a(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f10545b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(i5, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10545b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        public static aj a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof aj)) {
                return (aj) queryLocalInterface;
            }
            return new C0202a(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            a(parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public static aj a() {
            return C0202a.f10544a;
        }
    }
}
