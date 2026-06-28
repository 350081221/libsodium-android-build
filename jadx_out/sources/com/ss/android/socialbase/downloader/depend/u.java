package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.t;

/* loaded from: classes3.dex */
public interface u extends IInterface {
    boolean a(t tVar) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements u {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0213a implements u {

            /* renamed from: a, reason: collision with root package name */
            public static u f10567a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10568b;

            C0213a(IBinder iBinder) {
                this.f10568b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.u
            public boolean a(t tVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (tVar != null) {
                        iBinder = tVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.f10568b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(tVar);
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
                return this.f10568b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        public static u a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            if (queryLocalInterface != null && (queryLocalInterface instanceof u)) {
                return (u) queryLocalInterface;
            }
            return new C0213a(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            boolean a5 = a(t.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(a5 ? 1 : 0);
            return true;
        }

        public static u a() {
            return C0213a.f10567a;
        }
    }
}
