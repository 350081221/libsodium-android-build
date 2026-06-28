package com.ss.android.downloadlib.a.a;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.downloadlib.a.a.d;
import com.ss.android.downloadlib.addownload.k;
import com.umeng.analytics.pro.bi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface c extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements c {

        /* renamed from: a, reason: collision with root package name */
        private static String f9562a = "";

        /* renamed from: com.ss.android.downloadlib.a.a.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0181a implements c {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f9563a;

            C0181a(IBinder iBinder) {
                if (TextUtils.isEmpty(a.f9562a)) {
                    JSONObject j5 = k.j();
                    String unused = a.f9562a = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("r"), j5.optString(bi.aE));
                }
                this.f9563a = iBinder;
            }

            @Override // com.ss.android.downloadlib.a.a.c
            public void a(b bVar, d dVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f9562a);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f9563a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9563a;
            }
        }

        @Override // android.os.Binder
        @SuppressLint({"WrongConstant"})
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            b bVar;
            if (i5 != 1598968902) {
                if (i5 != 1) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel.enforceInterface(f9562a);
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                } else {
                    bVar = null;
                }
                a(bVar, d.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(f9562a);
            return true;
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f9562a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0181a(iBinder);
        }
    }

    void a(b bVar, d dVar) throws RemoteException;
}
