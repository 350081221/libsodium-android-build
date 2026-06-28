package com.lody.virtual.client.ipc;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.app.Activity;
import android.content.pm.SharedLibraryInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.stub.AmsTask;
import com.lody.virtual.helper.compat.AccountManagerCompat;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.interfaces.IAccountManager;
import java.util.Map;

/* loaded from: classes3.dex */
public class VAccountManager {
    private static VAccountManager sMgr = new VAccountManager();
    private IAccountManager mService;

    public static VAccountManager get() {
        return sMgr;
    }

    private Object getStubInterface() {
        return IAccountManager.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.ACCOUNT));
    }

    public boolean accountAuthenticated(Account account) {
        try {
            return getService().accountAuthenticated(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void addAccount(int i5, IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        try {
            getService().addAccount(i5, iAccountManagerResponse, str, str2, strArr, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean addAccountExplicitly(Account account, String str, Bundle bundle) {
        try {
            return getService().addAccountExplicitly(VUserHandle.myUserId(), account, str, bundle);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map) {
        try {
            return getService().addAccountExplicitlyWithVisibility(VUserHandle.myUserId(), account, str, bundle, map);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void clearPassword(Account account) {
        try {
            getService().clearPassword(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void confirmCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z4) {
        try {
            getService().confirmCredentials(VUserHandle.myUserId(), iAccountManagerResponse, account, bundle, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z4) {
        try {
            getService().editProperties(VUserHandle.myUserId(), iAccountManagerResponse, str, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void finishSessionAsUser(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, boolean z4, Bundle bundle2, int i5) {
        try {
            getService().finishSessionAsUser(iAccountManagerResponse, bundle, z4, bundle2, i5);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public int getAccountVisibility(Account account, String str) {
        try {
            return getService().getAccountVisibility(VUserHandle.myUserId(), account, str);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public Account[] getAccounts(int i5, String str) {
        try {
            return getService().getAccounts(i5, str);
        } catch (RemoteException e5) {
            return (Account[]) VirtualRuntime.crash(e5);
        }
    }

    public Map getAccountsAndVisibilityForPackage(String str, String str2) {
        try {
            return getService().getAccountsAndVisibilityForPackage(VUserHandle.myUserId(), str, str2);
        } catch (RemoteException e5) {
            return (Map) VirtualRuntime.crash(e5);
        }
    }

    public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        try {
            getService().getAccountsByFeatures(VUserHandle.myUserId(), iAccountManagerResponse, str, strArr);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, boolean z5, Bundle bundle) {
        try {
            getService().getAuthToken(VUserHandle.myUserId(), iAccountManagerResponse, account, str, z4, z5, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        try {
            getService().getAuthTokenLabel(VUserHandle.myUserId(), iAccountManagerResponse, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public AuthenticatorDescription[] getAuthenticatorTypes(int i5) {
        try {
            return getService().getAuthenticatorTypes(i5);
        } catch (RemoteException e5) {
            return (AuthenticatorDescription[]) VirtualRuntime.crash(e5);
        }
    }

    public Map getPackagesAndVisibilityForAccount(Account account) {
        try {
            return getService().getPackagesAndVisibilityForAccount(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            return (Map) VirtualRuntime.crash(e5);
        }
    }

    public Object getPassword(Account account) {
        try {
            return getService().getPassword(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            return VirtualRuntime.crash(e5);
        }
    }

    public String getPreviousName(Account account) {
        try {
            return getService().getPreviousName(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public IAccountManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (VAccountManager.class) {
                this.mService = (IAccountManager) LocalProxyUtils.genProxy(IAccountManager.class, getStubInterface());
            }
        }
        return this.mService;
    }

    public String getUserData(Account account, String str) {
        try {
            return getService().getUserData(VUserHandle.myUserId(), account, str);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public void hasFeatures(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
        try {
            getService().hasFeatures(VUserHandle.myUserId(), iAccountManagerResponse, account, strArr);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void invalidateAuthToken(String str, String str2) {
        try {
            getService().invalidateAuthToken(VUserHandle.myUserId(), str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void isCredentialsUpdateSuggested(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        try {
            getService().isCredentialsUpdateSuggested(iAccountManagerResponse, account, str);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public String peekAuthToken(Account account, String str) {
        try {
            return getService().peekAuthToken(VUserHandle.myUserId(), account, str);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public void registerAccountListener(String[] strArr) {
        try {
            getService().registerAccountListener(strArr);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void removeAccount(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z4) {
        try {
            getService().removeAccount(VUserHandle.myUserId(), iAccountManagerResponse, account, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean removeAccountExplicitly(Account account) {
        try {
            return getService().removeAccountExplicitly(VUserHandle.myUserId(), account);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void renameAccount(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        try {
            getService().renameAccount(VUserHandle.myUserId(), iAccountManagerResponse, account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean setAccountVisibility(Account account, String str, int i5) {
        try {
            return getService().setAccountVisibility(VUserHandle.myUserId(), account, str, i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void setAuthToken(Account account, String str, String str2) {
        try {
            getService().setAuthToken(VUserHandle.myUserId(), account, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void setPassword(Account account, String str) {
        try {
            getService().setPassword(VUserHandle.myUserId(), account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void setUserData(Account account, String str, String str2) {
        try {
            getService().setUserData(VUserHandle.myUserId(), account, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void startAddAccountSession(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        try {
            getService().startAddAccountSession(iAccountManagerResponse, str, str2, strArr, z4, bundle);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void startUpdateCredentialsSession(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        try {
            getService().startUpdateCredentialsSession(iAccountManagerResponse, account, str, z4, bundle);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void unregisterAccountListener(String[] strArr) {
        try {
            getService().unregisterAccountListener(strArr);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        try {
            getService().updateCredentials(VUserHandle.myUserId(), iAccountManagerResponse, account, str, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        try {
            getService().addAccount(VUserHandle.myUserId(), iAccountManagerResponse, str, str2, strArr, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public Account[] getAccounts(String str) {
        try {
            return getService().getAccounts(VUserHandle.myUserId(), str);
        } catch (RemoteException e5) {
            return (Account[]) VirtualRuntime.crash(e5);
        }
    }

    public AccountManagerFuture<Bundle> addAccount(final int i5, final String str, final String str2, final String[] strArr, Bundle bundle, final Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        if (str != null) {
            final Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putString(AccountManagerCompat.KEY_ANDROID_PACKAGE_NAME, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
            return new AmsTask(activity, handler, accountManagerCallback) { // from class: com.lody.virtual.client.ipc.VAccountManager.1
                @Override // com.lody.virtual.client.stub.AmsTask
                public void doWork() throws RemoteException {
                    VAccountManager.this.addAccount(i5, this.mResponse, str, str2, strArr, activity != null, bundle2);
                }
            }.start();
        }
        throw new IllegalArgumentException("accountType is null");
    }
}
