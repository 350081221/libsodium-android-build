package com.lody.virtual.server.interfaces;

import android.app.job.JobInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.VJobWorkItem;
import java.util.List;

/* loaded from: classes3.dex */
public interface IJobService extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IJobService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public void cancel(int i5, int i6) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public void cancelAll(int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public int enqueue(int i5, JobInfo jobInfo, VJobWorkItem vJobWorkItem) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public List<JobInfo> getAllPendingJobs(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public JobInfo getPendingJob(int i5, int i6) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IJobService
        public int schedule(int i5, JobInfo jobInfo) throws RemoteException {
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IJobService {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IJobService";
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_enqueue = 6;
        static final int TRANSACTION_getAllPendingJobs = 4;
        static final int TRANSACTION_getPendingJob = 5;
        static final int TRANSACTION_schedule = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IJobService {
            public static IJobService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public void cancel(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancel(i5, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public void cancelAll(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelAll(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public int enqueue(int i5, JobInfo jobInfo, VJobWorkItem vJobWorkItem) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (jobInfo != null) {
                        obtain.writeInt(1);
                        jobInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (vJobWorkItem != null) {
                        obtain.writeInt(1);
                        vJobWorkItem.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enqueue(i5, jobInfo, vJobWorkItem);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public List<JobInfo> getAllPendingJobs(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllPendingJobs(i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(JobInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public JobInfo getPendingJob(int i5, int i6) throws RemoteException {
                JobInfo jobInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPendingJob(i5, i6);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        jobInfo = (JobInfo) JobInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        jobInfo = null;
                    }
                    return jobInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IJobService
            public int schedule(int i5, JobInfo jobInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (jobInfo != null) {
                        obtain.writeInt(1);
                        jobInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().schedule(i5, jobInfo);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IJobService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IJobService)) {
                return (IJobService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IJobService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IJobService iJobService) {
            if (Proxy.sDefaultImpl == null) {
                if (iJobService != null) {
                    Proxy.sDefaultImpl = iJobService;
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
            JobInfo jobInfo;
            if (i5 != 1598968902) {
                JobInfo jobInfo2 = null;
                VJobWorkItem vJobWorkItem = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            jobInfo2 = (JobInfo) JobInfo.CREATOR.createFromParcel(parcel);
                        }
                        int schedule = schedule(readInt, jobInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(schedule);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancel(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelAll(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<JobInfo> allPendingJobs = getAllPendingJobs(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(allPendingJobs);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        JobInfo pendingJob = getPendingJob(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (pendingJob != null) {
                            parcel2.writeInt(1);
                            pendingJob.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            jobInfo = (JobInfo) JobInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            jobInfo = null;
                        }
                        if (parcel.readInt() != 0) {
                            vJobWorkItem = VJobWorkItem.CREATOR.createFromParcel(parcel);
                        }
                        int enqueue = enqueue(readInt2, jobInfo, vJobWorkItem);
                        parcel2.writeNoException();
                        parcel2.writeInt(enqueue);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void cancel(int i5, int i6) throws RemoteException;

    void cancelAll(int i5) throws RemoteException;

    int enqueue(int i5, JobInfo jobInfo, VJobWorkItem vJobWorkItem) throws RemoteException;

    List<JobInfo> getAllPendingJobs(int i5) throws RemoteException;

    JobInfo getPendingJob(int i5, int i6) throws RemoteException;

    int schedule(int i5, JobInfo jobInfo) throws RemoteException;
}
