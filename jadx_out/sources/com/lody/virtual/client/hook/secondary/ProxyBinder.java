package com.lody.virtual.client.hook.secondary;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;

/* loaded from: classes3.dex */
public class ProxyBinder implements IBinder {
    private IBinder mBase;
    IInterface mProxyInterface;

    public ProxyBinder(IBinder iBinder, IInterface iInterface) {
        this.mBase = iBinder;
        this.mProxyInterface = iInterface;
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.mBase.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.mBase.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() throws RemoteException {
        return this.mBase.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.mBase.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i5) throws RemoteException {
        this.mBase.linkToDeath(deathRecipient, i5);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.mBase.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return this.mProxyInterface;
    }

    @Override // android.os.IBinder
    public boolean transact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        return this.mBase.transact(i5, parcel, parcel2, i6);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i5) {
        return this.mBase.unlinkToDeath(deathRecipient, i5);
    }
}
