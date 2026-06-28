package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.o;

/* loaded from: classes3.dex */
public interface p extends IInterface {
    boolean a(long j5, long j6, o oVar) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements p {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0211a implements p {

            /* renamed from: a, reason: collision with root package name */
            public static p f10563a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10564b;

            C0211a(IBinder iBinder) {
                this.f10564b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.p
            public boolean a(long j5, long j6, o oVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j5);
                    obtain.writeLong(j6);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.f10564b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(j5, j6, oVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z4 = true;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10564b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        public static p a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            if (queryLocalInterface != null && (queryLocalInterface instanceof p)) {
                return (p) queryLocalInterface;
            }
            return new C0211a(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            boolean a5 = a(parcel.readLong(), parcel.readLong(), o.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(a5 ? 1 : 0);
            return true;
        }

        public static p a() {
            return C0211a.f10563a;
        }
    }
}
