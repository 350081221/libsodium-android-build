package com.ss.android.downloadlib.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.k;
import com.umeng.analytics.pro.bi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface d extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements d {

        /* renamed from: a, reason: collision with root package name */
        private static String f9564a = "";

        /* renamed from: com.ss.android.downloadlib.a.a.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0182a implements d {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f9565a;

            C0182a(IBinder iBinder) {
                if (TextUtils.isEmpty(a.f9564a)) {
                    JSONObject j5 = k.j();
                    String unused = a.f9564a = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString(bi.aL), j5.optString(bi.aE));
                }
                this.f9565a = iBinder;
            }

            @Override // com.ss.android.downloadlib.a.a.d
            public void a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f9564a);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9565a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9565a;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            b bVar;
            if (i5 == 1) {
                parcel.enforceInterface(f9564a);
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                } else {
                    bVar = null;
                }
                a(bVar);
                parcel2.writeNoException();
                return true;
            }
            if (i5 != 1598968902) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel2.writeString(f9564a);
            return true;
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f9564a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new C0182a(iBinder);
        }
    }

    void a(b bVar) throws RemoteException;
}
