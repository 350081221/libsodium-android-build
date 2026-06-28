package com.lody.virtual.os;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.LocalProxyUtils;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.server.interfaces.IUserManager;
import java.util.List;

/* loaded from: classes3.dex */
public class VUserManager {
    private static String TAG = "VUserManager";
    private static final VUserManager sInstance = new VUserManager();
    private IUserManager mService;

    public static synchronized VUserManager get() {
        VUserManager vUserManager;
        synchronized (VUserManager.class) {
            vUserManager = sInstance;
        }
        return vUserManager;
    }

    public static int getMaxSupportedUsers() {
        return Integer.MAX_VALUE;
    }

    private Object getRemoteInterface() {
        return IUserManager.Stub.asInterface(ServiceManagerNative.getService("user"));
    }

    public static boolean supportsMultipleUsers() {
        return getMaxSupportedUsers() > 1;
    }

    public VUserInfo createUser(String str, int i5) {
        try {
            return getService().createUser(str, i5);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not create a user", e5);
            return null;
        }
    }

    public long getSerialNumberForUser(VUserHandle vUserHandle) {
        return getUserSerialNumber(vUserHandle.getIdentifier());
    }

    public IUserManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService) || VirtualCore.get().isExtHelperProcess()) {
            synchronized (VUserManager.class) {
                this.mService = (IUserManager) LocalProxyUtils.genProxy(IUserManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public int getUserCount() {
        List<VUserInfo> users = getUsers();
        if (users != null) {
            return users.size();
        }
        return 1;
    }

    public VUserHandle getUserForSerialNumber(long j5) {
        int userHandle = getUserHandle((int) j5);
        if (userHandle >= 0) {
            return new VUserHandle(userHandle);
        }
        return null;
    }

    public int getUserHandle() {
        return VUserHandle.myUserId();
    }

    public Bitmap getUserIcon(int i5) {
        try {
            return getService().getUserIcon(i5);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not get the user icon ", e5);
            return null;
        }
    }

    public VUserInfo getUserInfo(int i5) {
        try {
            return getService().getUserInfo(i5);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not get user info", e5);
            return null;
        }
    }

    public String getUserName() {
        try {
            return getService().getUserInfo(getUserHandle()).name;
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not get user name", e5);
            return "";
        }
    }

    public int getUserSerialNumber(int i5) {
        try {
            return getService().getUserSerialNumber(i5);
        } catch (RemoteException unused) {
            Log.w(TAG, "Could not get serial number for user " + i5);
            return -1;
        }
    }

    public List<VUserInfo> getUsers() {
        try {
            return getService().getUsers(false);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            Log.w(TAG, "Could not get user list", e5);
            return null;
        }
    }

    public boolean isGuestEnabled() {
        try {
            return getService().isGuestEnabled();
        } catch (RemoteException unused) {
            Log.w(TAG, "Could not retrieve guest enabled state");
            return false;
        }
    }

    public boolean isUserAGoat() {
        return false;
    }

    public boolean removeUser(int i5) {
        try {
            return getService().removeUser(i5);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not remove user ", e5);
            return false;
        }
    }

    public void setGuestEnabled(boolean z4) {
        try {
            getService().setGuestEnabled(z4);
        } catch (RemoteException unused) {
            Log.w(TAG, "Could not change guest account availability to " + z4);
        }
    }

    public void setUserIcon(int i5, Bitmap bitmap) {
        try {
            getService().setUserIcon(i5, bitmap);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not set the user icon ", e5);
        }
    }

    public void setUserName(int i5, String str) {
        try {
            getService().setUserName(i5, str);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not set the user name ", e5);
        }
    }

    public void wipeUser(int i5) {
        try {
            getService().wipeUser(i5);
        } catch (RemoteException unused) {
            Log.w(TAG, "Could not wipe user " + i5);
        }
    }

    public int getUserHandle(int i5) {
        try {
            return getService().getUserHandle(i5);
        } catch (RemoteException unused) {
            Log.w(TAG, "Could not get VUserHandle for user " + i5);
            return -1;
        }
    }

    public List<VUserInfo> getUsers(boolean z4) {
        try {
            return getService().getUsers(z4);
        } catch (RemoteException e5) {
            Log.w(TAG, "Could not get user list", e5);
            return null;
        }
    }
}
