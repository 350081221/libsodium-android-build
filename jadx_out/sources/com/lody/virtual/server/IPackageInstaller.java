package com.lody.virtual.server;

import android.content.IntentSender;
import android.content.pm.IPackageInstallerCallback;
import android.content.pm.IPackageInstallerSession;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.VParceledListSlice;
import com.lody.virtual.server.pm.installer.SessionInfo;
import com.lody.virtual.server.pm.installer.SessionParams;

/* loaded from: classes3.dex */
public interface IPackageInstaller extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IPackageInstaller {
        @Override // com.lody.virtual.server.IPackageInstaller
        public void abandonSession(int i5) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public int createSession(SessionParams sessionParams, String str, int i5) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public VParceledListSlice getAllSessions(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public VParceledListSlice getMySessions(String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public SessionInfo getSessionInfo(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public android.content.pm.IPackageInstallerSession openSession(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void registerCallback(IPackageInstallerCallback iPackageInstallerCallback, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void setPermissionsResult(int i5, boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void uninstall(String str, String str2, int i5, IntentSender intentSender, int i6) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void unregisterCallback(IPackageInstallerCallback iPackageInstallerCallback) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void updateSessionAppIcon(int i5, Bitmap bitmap) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstaller
        public void updateSessionAppLabel(int i5, String str) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IPackageInstaller {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageInstaller";
        static final int TRANSACTION_abandonSession = 4;
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_getAllSessions = 7;
        static final int TRANSACTION_getMySessions = 8;
        static final int TRANSACTION_getSessionInfo = 6;
        static final int TRANSACTION_openSession = 5;
        static final int TRANSACTION_registerCallback = 9;
        static final int TRANSACTION_setPermissionsResult = 12;
        static final int TRANSACTION_uninstall = 11;
        static final int TRANSACTION_unregisterCallback = 10;
        static final int TRANSACTION_updateSessionAppIcon = 2;
        static final int TRANSACTION_updateSessionAppLabel = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IPackageInstaller {
            public static IPackageInstaller sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void abandonSession(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().abandonSession(i5);
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

            @Override // com.lody.virtual.server.IPackageInstaller
            public int createSession(SessionParams sessionParams, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (sessionParams != null) {
                        obtain.writeInt(1);
                        sessionParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createSession(sessionParams, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public VParceledListSlice getAllSessions(int i5) throws RemoteException {
                VParceledListSlice vParceledListSlice;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllSessions(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vParceledListSlice = VParceledListSlice.CREATOR.createFromParcel(obtain2);
                    } else {
                        vParceledListSlice = null;
                    }
                    return vParceledListSlice;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public VParceledListSlice getMySessions(String str, int i5) throws RemoteException {
                VParceledListSlice vParceledListSlice;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMySessions(str, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vParceledListSlice = VParceledListSlice.CREATOR.createFromParcel(obtain2);
                    } else {
                        vParceledListSlice = null;
                    }
                    return vParceledListSlice;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public SessionInfo getSessionInfo(int i5) throws RemoteException {
                SessionInfo sessionInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSessionInfo(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        sessionInfo = SessionInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        sessionInfo = null;
                    }
                    return sessionInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public android.content.pm.IPackageInstallerSession openSession(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openSession(i5);
                    }
                    obtain2.readException();
                    return IPackageInstallerSession.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void registerCallback(IPackageInstallerCallback iPackageInstallerCallback, int i5) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPackageInstallerCallback != null) {
                        iBinder = iPackageInstallerCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerCallback(iPackageInstallerCallback, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void setPermissionsResult(int i5, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setPermissionsResult(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void uninstall(String str, String str2, int i5, IntentSender intentSender, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    if (intentSender != null) {
                        obtain.writeInt(1);
                        intentSender.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().uninstall(str, str2, i5, intentSender, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void unregisterCallback(IPackageInstallerCallback iPackageInstallerCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPackageInstallerCallback != null) {
                        iBinder = iPackageInstallerCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterCallback(iPackageInstallerCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void updateSessionAppIcon(int i5, Bitmap bitmap) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().updateSessionAppIcon(i5, bitmap);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstaller
            public void updateSessionAppLabel(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().updateSessionAppLabel(i5, str);
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

        public static IPackageInstaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPackageInstaller)) {
                return (IPackageInstaller) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IPackageInstaller getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPackageInstaller iPackageInstaller) {
            if (Proxy.sDefaultImpl == null) {
                if (iPackageInstaller != null) {
                    Proxy.sDefaultImpl = iPackageInstaller;
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
            if (i5 != 1598968902) {
                boolean z4 = false;
                SessionParams sessionParams = null;
                IntentSender intentSender = null;
                IBinder iBinder = null;
                Bitmap bitmap = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            sessionParams = SessionParams.CREATOR.createFromParcel(parcel);
                        }
                        int createSession = createSession(sessionParams, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(createSession);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bitmap = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
                        }
                        updateSessionAppIcon(readInt, bitmap);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        updateSessionAppLabel(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        abandonSession(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        android.content.pm.IPackageInstallerSession openSession = openSession(parcel.readInt());
                        parcel2.writeNoException();
                        if (openSession != null) {
                            iBinder = openSession.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        SessionInfo sessionInfo = getSessionInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (sessionInfo != null) {
                            parcel2.writeInt(1);
                            sessionInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        VParceledListSlice allSessions = getAllSessions(parcel.readInt());
                        parcel2.writeNoException();
                        if (allSessions != null) {
                            parcel2.writeInt(1);
                            allSessions.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        VParceledListSlice mySessions = getMySessions(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (mySessions != null) {
                            parcel2.writeInt(1);
                            mySessions.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        registerCallback(IPackageInstallerCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        unregisterCallback(IPackageInstallerCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            intentSender = (IntentSender) IntentSender.CREATOR.createFromParcel(parcel);
                        }
                        uninstall(readString, readString2, readInt2, intentSender, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        setPermissionsResult(readInt3, z4);
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

    void abandonSession(int i5) throws RemoteException;

    int createSession(SessionParams sessionParams, String str, int i5) throws RemoteException;

    VParceledListSlice getAllSessions(int i5) throws RemoteException;

    VParceledListSlice getMySessions(String str, int i5) throws RemoteException;

    SessionInfo getSessionInfo(int i5) throws RemoteException;

    android.content.pm.IPackageInstallerSession openSession(int i5) throws RemoteException;

    void registerCallback(IPackageInstallerCallback iPackageInstallerCallback, int i5) throws RemoteException;

    void setPermissionsResult(int i5, boolean z4) throws RemoteException;

    void uninstall(String str, String str2, int i5, IntentSender intentSender, int i6) throws RemoteException;

    void unregisterCallback(IPackageInstallerCallback iPackageInstallerCallback) throws RemoteException;

    void updateSessionAppIcon(int i5, Bitmap bitmap) throws RemoteException;

    void updateSessionAppLabel(int i5, String str) throws RemoteException;
}
