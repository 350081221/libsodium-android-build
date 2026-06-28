package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import external.org.apache.commons.lang3.d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace('$', d.f15957a);

    /* loaded from: classes.dex */
    public static class Default implements IResultReceiver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i5, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IResultReceiver {
        static final int TRANSACTION_send = 1;

        /* loaded from: classes.dex */
        private static class Proxy implements IResultReceiver {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IResultReceiver.DESCRIPTOR;
            }

            @Override // android.support.v4.os.IResultReceiver
            public void send(int i5, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver.DESCRIPTOR);
                    obtain.writeInt(i5);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver.DESCRIPTOR);
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                return (IResultReceiver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            String str = IResultReceiver.DESCRIPTOR;
            if (i5 >= 1 && i5 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i5 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i5 != 1) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            send(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t5, int i5) {
            if (t5 != null) {
                parcel.writeInt(1);
                t5.writeToParcel(parcel, i5);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void send(int i5, Bundle bundle) throws RemoteException;
}
