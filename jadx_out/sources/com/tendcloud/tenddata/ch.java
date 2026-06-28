package com.tendcloud.tenddata;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tendcloud.tenddata.by;

/* loaded from: classes3.dex */
interface ch extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements ch {

        /* renamed from: c, reason: collision with root package name */
        public static final int f11590c = 0;

        /* renamed from: com.tendcloud.tenddata.ch$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0231a implements ch {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f11591a;

            public C0231a(IBinder iBinder) {
                this.f11591a = iBinder;
            }

            @Override // com.tendcloud.tenddata.ch
            public void a(by byVar) {
                by.a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                        if (byVar != null) {
                            aVar = (by.a) byVar;
                        } else {
                            aVar = null;
                        }
                        obtain.writeStrongBinder(aVar);
                        this.f11591a.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11591a;
            }

            @Override // com.tendcloud.tenddata.ch
            public void b(by byVar) {
                by.a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                        if (byVar != null) {
                            aVar = (by.a) byVar;
                        } else {
                            aVar = null;
                        }
                        obtain.writeStrongBinder(aVar);
                        this.f11591a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    void a(by byVar);

    void b(by byVar);
}
