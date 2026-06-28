package android.content;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IIntentReceiver extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IIntentReceiver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.IIntentReceiver
        public void performReceive(Intent intent, int i5, String str, Bundle bundle, boolean z4, boolean z5, int i6) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IIntentReceiver {
        private static final String DESCRIPTOR = "android.content.IIntentReceiver";
        static final int TRANSACTION_performReceive = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IIntentReceiver {
            public static IIntentReceiver sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.content.IIntentReceiver
            public void performReceive(Intent intent, int i5, String str, Bundle bundle, boolean z4, boolean z5, int i6) throws RemoteException {
                int i7;
                int i8;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z4) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    obtain.writeInt(i7);
                    if (z5) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    obtain.writeInt(i8);
                    obtain.writeInt(i6);
                    try {
                        if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            Stub.getDefaultImpl().performReceive(intent, i5, str, bundle, z4, z5, i6);
                            obtain2.recycle();
                            obtain.recycle();
                        } else {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIntentReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIntentReceiver)) {
                return (IIntentReceiver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IIntentReceiver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIntentReceiver iIntentReceiver) {
            if (Proxy.sDefaultImpl == null) {
                if (iIntentReceiver != null) {
                    Proxy.sDefaultImpl = iIntentReceiver;
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
            Intent intent;
            boolean z4;
            boolean z5;
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Bundle bundle = null;
            if (parcel.readInt() != 0) {
                intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            } else {
                intent = null;
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            Bundle bundle2 = bundle;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            performReceive(intent, readInt, readString, bundle2, z4, z5, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void performReceive(Intent intent, int i5, String str, Bundle bundle, boolean z4, boolean z5, int i6) throws RemoteException;
}
