package android.app.job;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IJobCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IJobCallback {
        @Override // android.app.job.IJobCallback
        public void acknowledgeStartMessage(int i5, boolean z4) throws RemoteException {
        }

        @Override // android.app.job.IJobCallback
        public void acknowledgeStopMessage(int i5, boolean z4) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.app.job.IJobCallback
        public boolean completeWork(int i5, int i6) throws RemoteException {
            return false;
        }

        @Override // android.app.job.IJobCallback
        public JobWorkItem dequeueWork(int i5) throws RemoteException {
            return null;
        }

        @Override // android.app.job.IJobCallback
        public void jobFinished(int i5, boolean z4) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IJobCallback {
        private static final String DESCRIPTOR = "android.app.job.IJobCallback";
        static final int TRANSACTION_acknowledgeStartMessage = 1;
        static final int TRANSACTION_acknowledgeStopMessage = 2;
        static final int TRANSACTION_completeWork = 4;
        static final int TRANSACTION_dequeueWork = 3;
        static final int TRANSACTION_jobFinished = 5;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IJobCallback {
            public static IJobCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.app.job.IJobCallback
            public void acknowledgeStartMessage(int i5, boolean z4) throws RemoteException {
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
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().acknowledgeStartMessage(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.app.job.IJobCallback
            public void acknowledgeStopMessage(int i5, boolean z4) throws RemoteException {
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().acknowledgeStopMessage(i5, z4);
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

            @Override // android.app.job.IJobCallback
            public boolean completeWork(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    boolean z4 = false;
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().completeWork(i5, i6);
                    }
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

            @Override // android.app.job.IJobCallback
            public JobWorkItem dequeueWork(int i5) throws RemoteException {
                JobWorkItem jobWorkItem;
                Parcelable.Creator creator;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dequeueWork(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        creator = JobWorkItem.CREATOR;
                        jobWorkItem = (JobWorkItem) creator.createFromParcel(obtain2);
                    } else {
                        jobWorkItem = null;
                    }
                    return jobWorkItem;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.app.job.IJobCallback
            public void jobFinished(int i5, boolean z4) throws RemoteException {
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
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().jobFinished(i5, z4);
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

        public static IJobCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IJobCallback)) {
                return (IJobCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IJobCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IJobCallback iJobCallback) {
            if (Proxy.sDefaultImpl == null) {
                if (iJobCallback != null) {
                    Proxy.sDefaultImpl = iJobCallback;
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
            boolean z4 = false;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                if (i5 != 1598968902) {
                                    return super.onTransact(i5, parcel, parcel2, i6);
                                }
                                parcel2.writeString(DESCRIPTOR);
                                return true;
                            }
                            parcel.enforceInterface(DESCRIPTOR);
                            int readInt = parcel.readInt();
                            if (parcel.readInt() != 0) {
                                z4 = true;
                            }
                            jobFinished(readInt, z4);
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean completeWork = completeWork(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(completeWork ? 1 : 0);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    JobWorkItem dequeueWork = dequeueWork(parcel.readInt());
                    parcel2.writeNoException();
                    if (dequeueWork != null) {
                        parcel2.writeInt(1);
                        dequeueWork.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                acknowledgeStopMessage(readInt2, z4);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int readInt3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            acknowledgeStartMessage(readInt3, z4);
            parcel2.writeNoException();
            return true;
        }
    }

    void acknowledgeStartMessage(int i5, boolean z4) throws RemoteException;

    void acknowledgeStopMessage(int i5, boolean z4) throws RemoteException;

    boolean completeWork(int i5, int i6) throws RemoteException;

    JobWorkItem dequeueWork(int i5) throws RemoteException;

    void jobFinished(int i5, boolean z4) throws RemoteException;
}
