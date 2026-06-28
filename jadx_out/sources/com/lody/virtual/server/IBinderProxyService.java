package com.lody.virtual.server;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IBinderProxyService extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IBinderProxyService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.IBinderProxyService
        public ComponentName getComponent() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IBinderProxyService
        public IBinder getService() throws RemoteException {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBinderProxyService {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IBinderProxyService";
        static final int TRANSACTION_getComponent = 1;
        static final int TRANSACTION_getService = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBinderProxyService {
            public static IBinderProxyService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.IBinderProxyService
            public ComponentName getComponent() throws RemoteException {
                ComponentName componentName;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getComponent();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        componentName = (ComponentName) ComponentName.CREATOR.createFromParcel(obtain2);
                    } else {
                        componentName = null;
                    }
                    return componentName;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.IBinderProxyService
            public IBinder getService() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getService();
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBinderProxyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBinderProxyService)) {
                return (IBinderProxyService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IBinderProxyService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBinderProxyService iBinderProxyService) {
            if (Proxy.sDefaultImpl == null) {
                if (iBinderProxyService != null) {
                    Proxy.sDefaultImpl = iBinderProxyService;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 1598968902) {
                        return super.onTransact(i5, parcel, parcel2, i6);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                IBinder service = getService();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(service);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            ComponentName component = getComponent();
            parcel2.writeNoException();
            if (component != null) {
                parcel2.writeInt(1);
                component.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    ComponentName getComponent() throws RemoteException;

    IBinder getService() throws RemoteException;
}
