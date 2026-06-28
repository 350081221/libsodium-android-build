package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface e extends IInterface {
    int a(long j5) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements e {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0203a implements e {

            /* renamed from: a, reason: collision with root package name */
            public static e f10547a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10548b;

            C0203a(IBinder iBinder) {
                this.f10548b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.e
            public int a(long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j5);
                    if (!this.f10548b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10548b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new C0203a(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            int a5 = a(parcel.readLong());
            parcel2.writeNoException();
            parcel2.writeInt(a5);
            return true;
        }

        public static e a() {
            return C0203a.f10547a;
        }
    }
}
