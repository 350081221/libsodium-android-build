package android.content;

import android.accounts.Account;
import android.content.ISyncContext;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ISyncAdapter extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ISyncAdapter {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.ISyncAdapter
        public void cancelSync(ISyncContext iSyncContext) throws RemoteException {
        }

        @Override // android.content.ISyncAdapter
        public void initialize(Account account, String str) throws RemoteException {
        }

        @Override // android.content.ISyncAdapter
        public void startSync(ISyncContext iSyncContext, String str, Account account, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ISyncAdapter {
        private static final String DESCRIPTOR = "android.content.ISyncAdapter";
        static final int TRANSACTION_cancelSync = 2;
        static final int TRANSACTION_initialize = 3;
        static final int TRANSACTION_startSync = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements ISyncAdapter {
            public static ISyncAdapter sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.content.ISyncAdapter
            public void cancelSync(ISyncContext iSyncContext) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iSyncContext != null) {
                        iBinder = iSyncContext.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelSync(iSyncContext);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.content.ISyncAdapter
            public void initialize(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().initialize(account, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.ISyncAdapter
            public void startSync(ISyncContext iSyncContext, String str, Account account, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iSyncContext != null) {
                        iBinder = iSyncContext.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().startSync(iSyncContext, str, account, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISyncAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISyncAdapter)) {
                return (ISyncAdapter) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static ISyncAdapter getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISyncAdapter iSyncAdapter) {
            if (Proxy.sDefaultImpl == null) {
                if (iSyncAdapter != null) {
                    Proxy.sDefaultImpl = iSyncAdapter;
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
            Account account;
            Bundle bundle = null;
            Account account2 = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString(DESCRIPTOR);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        account2 = (Account) Account.CREATOR.createFromParcel(parcel);
                    }
                    initialize(account2, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                cancelSync(ISyncContext.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            ISyncContext asInterface = ISyncContext.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                account = (Account) Account.CREATOR.createFromParcel(parcel);
            } else {
                account = null;
            }
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            startSync(asInterface, readString, account, bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    void cancelSync(ISyncContext iSyncContext) throws RemoteException;

    void initialize(Account account, String str) throws RemoteException;

    void startSync(ISyncContext iSyncContext, String str, Account account, Bundle bundle) throws RemoteException;
}
