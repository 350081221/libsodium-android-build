package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IRemoteServiceCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        public static final String DESCRIPTOR = "com.alipay.android.app.IRemoteServiceCallback";
        public static final int TRANSACTION_getVersion = 4;
        public static final int TRANSACTION_isHideLoadingScreen = 3;
        public static final int TRANSACTION_payEnd = 2;
        public static final int TRANSACTION_r03 = 5;
        public static final int TRANSACTION_startActivity = 1;

        /* loaded from: classes2.dex */
        public static class a implements IRemoteServiceCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2689a;

            public a(IBinder iBinder) {
                this.f2689a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2689a;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f2689a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    this.f2689a.transact(3, obtain, obtain2, 0);
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

            public String m() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z4, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeString(str);
                    this.f2689a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void r03(String str, String str2, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    this.f2689a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i5, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2689a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRemoteServiceCallback)) {
                return (IRemoteServiceCallback) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            Bundle bundle;
            boolean z4;
            if (i5 != 1598968902) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    return super.onTransact(i5, parcel, parcel2, i6);
                                }
                                parcel.enforceInterface(DESCRIPTOR);
                                r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                                return true;
                            }
                            parcel.enforceInterface(DESCRIPTOR);
                            int version = getVersion();
                            parcel2.writeNoException();
                            parcel2.writeInt(version);
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isHideLoadingScreen = isHideLoadingScreen();
                        parcel2.writeNoException();
                        parcel2.writeInt(isHideLoadingScreen ? 1 : 0);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    payEnd(z4, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                startActivity(readString, readString2, readInt, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    int getVersion() throws RemoteException;

    boolean isHideLoadingScreen() throws RemoteException;

    void payEnd(boolean z4, String str) throws RemoteException;

    void r03(String str, String str2, Map map) throws RemoteException;

    void startActivity(String str, String str2, int i5, Bundle bundle) throws RemoteException;
}
