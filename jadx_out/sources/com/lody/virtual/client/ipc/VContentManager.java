package com.lody.virtual.client.ipc;

import android.accounts.Account;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncAdapterType;
import android.content.SyncInfo;
import android.content.SyncRequest;
import android.content.SyncStatusInfo;
import android.database.IContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.server.interfaces.IContentService;
import java.util.List;

/* loaded from: classes3.dex */
public class VContentManager {
    private static final VContentManager sInstance = new VContentManager();
    private IContentService mService;

    public static VContentManager get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return IContentService.Stub.asInterface(ServiceManagerNative.getService("content"));
    }

    public void addPeriodicSync(Account account, String str, Bundle bundle, long j5) throws RemoteException {
        getService().addPeriodicSync(account, str, bundle, j5);
    }

    public void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        getService().addStatusChangeListener(i5, iSyncStatusObserver);
    }

    public void cancelSync(Account account, String str) throws RemoteException {
        getService().cancelSync(account, str);
    }

    public List<SyncInfo> getCurrentSyncs() throws RemoteException {
        return getService().getCurrentSyncs();
    }

    public int getIsSyncable(Account account, String str) throws RemoteException {
        return getService().getIsSyncable(account, str);
    }

    public boolean getMasterSyncAutomatically() throws RemoteException {
        return getService().getMasterSyncAutomatically();
    }

    public List<PeriodicSync> getPeriodicSyncs(Account account, String str) throws RemoteException {
        return getService().getPeriodicSyncs(account, str);
    }

    public IContentService getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (this) {
                this.mService = (IContentService) LocalProxyUtils.genProxy(IContentService.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public SyncAdapterType[] getSyncAdapterTypes() throws RemoteException {
        return getService().getSyncAdapterTypes();
    }

    public boolean getSyncAutomatically(Account account, String str) throws RemoteException {
        return getService().getSyncAutomatically(account, str);
    }

    public SyncStatusInfo getSyncStatus(Account account, String str) throws RemoteException {
        return getService().getSyncStatus(account, str);
    }

    public boolean isSyncActive(Account account, String str) throws RemoteException {
        return getService().isSyncActive(account, str);
    }

    public boolean isSyncPending(Account account, String str) throws RemoteException {
        return getService().isSyncPending(account, str);
    }

    public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i5) throws RemoteException {
        getService().notifyChange(uri, iContentObserver, z4, z5, i5);
    }

    public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i5) throws RemoteException {
        getService().registerContentObserver(uri, z4, iContentObserver, i5);
    }

    public void removePeriodicSync(Account account, String str, Bundle bundle) throws RemoteException {
        getService().removePeriodicSync(account, str, bundle);
    }

    public void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        getService().removeStatusChangeListener(iSyncStatusObserver);
    }

    public void requestSync(Account account, String str, Bundle bundle) throws RemoteException {
        getService().requestSync(account, str, bundle);
    }

    public void setIsSyncable(Account account, String str, int i5) throws RemoteException {
        getService().setIsSyncable(account, str, i5);
    }

    public void setMasterSyncAutomatically(boolean z4) throws RemoteException {
        getService().setMasterSyncAutomatically(z4);
    }

    public void setSyncAutomatically(Account account, String str, boolean z4) throws RemoteException {
        getService().setSyncAutomatically(account, str, z4);
    }

    public void sync(SyncRequest syncRequest) throws RemoteException {
        getService().sync(syncRequest);
    }

    public void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException {
        getService().unregisterContentObserver(iContentObserver);
    }
}
