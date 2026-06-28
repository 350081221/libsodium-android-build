package android.accounts;

import android.accounts.IAccountAuthenticatorResponse;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IAccountAuthenticator extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IAccountAuthenticator {
        @Override // android.accounts.IAccountAuthenticator
        public void addAccount(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void addAccountFromCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.accounts.IAccountAuthenticator
        public void confirmCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void editProperties(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void getAccountCredentialsForCloning(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void getAccountRemovalAllowed(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void getAuthToken(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void getAuthTokenLabel(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void hasFeatures(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String[] strArr) throws RemoteException {
        }

        @Override // android.accounts.IAccountAuthenticator
        public void updateCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IAccountAuthenticator {
        private static final String DESCRIPTOR = "android.accounts.IAccountAuthenticator";
        static final int TRANSACTION_addAccount = 1;
        static final int TRANSACTION_addAccountFromCredentials = 10;
        static final int TRANSACTION_confirmCredentials = 2;
        static final int TRANSACTION_editProperties = 6;
        static final int TRANSACTION_getAccountCredentialsForCloning = 9;
        static final int TRANSACTION_getAccountRemovalAllowed = 8;
        static final int TRANSACTION_getAuthToken = 3;
        static final int TRANSACTION_getAuthTokenLabel = 4;
        static final int TRANSACTION_hasFeatures = 7;
        static final int TRANSACTION_updateCredentials = 5;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IAccountAuthenticator {
            public static IAccountAuthenticator sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.accounts.IAccountAuthenticator
            public void addAccount(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addAccount(iAccountAuthenticatorResponse, str, str2, strArr, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void addAccountFromCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addAccountFromCredentials(iAccountAuthenticatorResponse, account, bundle);
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
                return this.mRemote;
            }

            @Override // android.accounts.IAccountAuthenticator
            public void confirmCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().confirmCredentials(iAccountAuthenticatorResponse, account, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void editProperties(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().editProperties(iAccountAuthenticatorResponse, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void getAccountCredentialsForCloning(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getAccountCredentialsForCloning(iAccountAuthenticatorResponse, account);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void getAccountRemovalAllowed(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getAccountRemovalAllowed(iAccountAuthenticatorResponse, account);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void getAuthToken(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getAuthToken(iAccountAuthenticatorResponse, account, str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void getAuthTokenLabel(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getAuthTokenLabel(iAccountAuthenticatorResponse, str);
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

            @Override // android.accounts.IAccountAuthenticator
            public void hasFeatures(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String[] strArr) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().hasFeatures(iAccountAuthenticatorResponse, account, strArr);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.accounts.IAccountAuthenticator
            public void updateCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iAccountAuthenticatorResponse != null) {
                        iBinder = iAccountAuthenticatorResponse.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().updateCredentials(iAccountAuthenticatorResponse, account, str, bundle);
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

        public static IAccountAuthenticator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAccountAuthenticator)) {
                return (IAccountAuthenticator) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IAccountAuthenticator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAccountAuthenticator iAccountAuthenticator) {
            if (Proxy.sDefaultImpl == null) {
                if (iAccountAuthenticator != null) {
                    Proxy.sDefaultImpl = iAccountAuthenticator;
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
            Account account2;
            Account account3;
            Account account4;
            if (i5 != 1598968902) {
                Bundle bundle = null;
                Bundle bundle2 = null;
                Account account5 = null;
                Account account6 = null;
                Account account7 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String[] createStringArray = parcel.createStringArray();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        addAccount(asInterface, readString, readString2, createStringArray, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface2 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        confirmCredentials(asInterface2, account, bundle5);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface3 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account2 = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account2 = null;
                        }
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        getAuthToken(asInterface3, account2, readString3, bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        getAuthTokenLabel(IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface4 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account3 = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account3 = null;
                        }
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        updateCredentials(asInterface4, account3, readString4, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        editProperties(IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface5 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account7 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        hasFeatures(asInterface5, account7, parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface6 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account6 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        getAccountRemovalAllowed(asInterface6, account6);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface7 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account5 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        getAccountCredentialsForCloning(asInterface7, account5);
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        IAccountAuthenticatorResponse asInterface8 = IAccountAuthenticatorResponse.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            account4 = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account4 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        addAccountFromCredentials(asInterface8, account4, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void addAccount(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws RemoteException;

    void addAccountFromCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException;

    void confirmCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, Bundle bundle) throws RemoteException;

    void editProperties(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException;

    void getAccountCredentialsForCloning(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException;

    void getAccountRemovalAllowed(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account) throws RemoteException;

    void getAuthToken(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException;

    void getAuthTokenLabel(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, String str) throws RemoteException;

    void hasFeatures(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String[] strArr) throws RemoteException;

    void updateCredentials(IAccountAuthenticatorResponse iAccountAuthenticatorResponse, Account account, String str, Bundle bundle) throws RemoteException;
}
