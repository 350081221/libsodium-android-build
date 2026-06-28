package com.lody.virtual.server.secondary;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.lody.virtual.os.VEnvironment;

/* loaded from: classes3.dex */
public class FakeIdentityBinder extends Binder {
    protected Binder mBase;
    protected int mFakePid;
    protected int mFakeUid;

    public FakeIdentityBinder(Binder binder, int i5, int i6) {
        this.mBase = binder;
        this.mFakeUid = i5;
        this.mFakePid = i6;
    }

    public static long getIdentity(int i5, int i6) {
        return i6 | (i5 << 32);
    }

    public static void setIdentity(int i5, int i6) {
        Binder.restoreCallingIdentity(getIdentity(i5, i6));
    }

    public static void setSystemIdentity() {
        Binder.restoreCallingIdentity(getIdentity(VEnvironment.SYSTEM_UID, Process.myPid()));
    }

    @Override // android.os.Binder
    public void attachInterface(IInterface iInterface, String str) {
        this.mBase.attachInterface(iInterface, str);
    }

    protected long getFakeIdentity() {
        return getIdentity(getFakeUid(), getFakePid());
    }

    protected int getFakePid() {
        return this.mFakePid;
    }

    protected int getFakeUid() {
        return this.mFakeUid;
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.mBase.getInterfaceDescriptor();
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean isBinderAlive() {
        return this.mBase.isBinderAlive();
    }

    @Override // android.os.Binder, android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i5) {
        this.mBase.linkToDeath(deathRecipient, i5);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Binder.restoreCallingIdentity(getFakeIdentity());
            return this.mBase.transact(i5, parcel, parcel2, i6);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean pingBinder() {
        return this.mBase.pingBinder();
    }

    @Override // android.os.Binder, android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return this.mBase.queryLocalInterface(str);
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i5) {
        return this.mBase.unlinkToDeath(deathRecipient, i5);
    }
}
