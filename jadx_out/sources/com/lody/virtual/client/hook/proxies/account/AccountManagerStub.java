package com.lody.virtual.client.hook.proxies.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.IAccountManagerResponse;
import android.annotation.TargetApi;
import android.os.Bundle;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.lody.virtual.client.ipc.VAccountManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;
import java.util.Map;
import mirror.android.accounts.IAccountManager;

/* loaded from: classes3.dex */
public class AccountManagerStub extends BinderInvocationProxy {
    private static VAccountManager Mgr = VAccountManager.get();

    /* loaded from: classes3.dex */
    private static class accountAuthenticated extends MethodProxy {
        private accountAuthenticated() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(AccountManagerStub.Mgr.accountAuthenticated((Account) objArr[0]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "accountAuthenticated";
        }
    }

    /* loaded from: classes3.dex */
    private static class addAccount extends MethodProxy {
        private addAccount() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.addAccount((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addAccount";
        }
    }

    /* loaded from: classes3.dex */
    private static class addAccountAsUser extends MethodProxy {
        private addAccountAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.addAccount((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addAccountAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class addAccountExplicitly extends MethodProxy {
        private addAccountExplicitly() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(AccountManagerStub.Mgr.addAccountExplicitly((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addAccountExplicitly";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class addAccountExplicitlyWithVisibility extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(AccountManagerStub.Mgr.addAccountExplicitlyWithVisibility((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2], (Map) objArr[3]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addAccountExplicitlyWithVisibility";
        }

        private addAccountExplicitlyWithVisibility() {
        }
    }

    /* loaded from: classes3.dex */
    private static class addSharedAccountAsUser extends MethodProxy {
        private addSharedAccountAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[1]).intValue();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "addSharedAccountAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class clearPassword extends MethodProxy {
        private clearPassword() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.clearPassword((Account) objArr[0]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "clearPassword";
        }
    }

    /* loaded from: classes3.dex */
    private static class confirmCredentialsAsUser extends MethodProxy {
        private confirmCredentialsAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.confirmCredentials((IAccountManagerResponse) objArr[0], (Account) objArr[1], (Bundle) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "confirmCredentialsAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class copyAccountToUser extends MethodProxy {
        private copyAccountToUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[2]).intValue();
            ((Integer) objArr[3]).intValue();
            method.invoke(obj, objArr);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "copyAccountToUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class editProperties extends MethodProxy {
        private editProperties() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.editProperties((IAccountManagerResponse) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "editProperties";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class finishSessionAsUser extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.finishSessionAsUser((IAccountManagerResponse) objArr[0], (Bundle) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Bundle) objArr[3], ((Integer) objArr[4]).intValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "finishSessionAsUser";
        }

        private finishSessionAsUser() {
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccountByTypeAndFeatures extends MethodProxy {
        private getAccountByTypeAndFeatures() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            return AccountManagerStub.Mgr.getAccounts(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountByTypeAndFeatures";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class getAccountVisibility extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(AccountManagerStub.Mgr.getAccountVisibility((Account) objArr[0], (String) objArr[1]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountVisibility";
        }

        private getAccountVisibility() {
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccounts extends MethodProxy {
        private getAccounts() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getAccounts((String) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccounts";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class getAccountsAndVisibilityForPackage extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getAccountsAndVisibilityForPackage((String) objArr[0], (String) objArr[1]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountsAndVisibilityForPackage";
        }

        private getAccountsAndVisibilityForPackage() {
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccountsAsUser extends MethodProxy {
        private getAccountsAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getAccounts((String) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountsAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccountsByFeatures extends MethodProxy {
        private getAccountsByFeatures() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.getAccountsByFeatures((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountsByFeatures";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccountsByTypeForPackage extends MethodProxy {
        private getAccountsByTypeForPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            return AccountManagerStub.Mgr.getAccounts(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountsByTypeForPackage";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAccountsForPackage extends MethodProxy {
        private getAccountsForPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getAccounts(null);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAccountsForPackage";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAuthToken extends MethodProxy {
        private getAuthToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.getAuthToken((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAuthToken";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAuthTokenLabel extends MethodProxy {
        private getAuthTokenLabel() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.getAuthTokenLabel((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAuthTokenLabel";
        }
    }

    /* loaded from: classes3.dex */
    private static class getAuthenticatorTypes extends MethodProxy {
        private getAuthenticatorTypes() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getAuthenticatorTypes(VUserHandle.myUserId());
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAuthenticatorTypes";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class getPackagesAndVisibilityForAccount extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getPackagesAndVisibilityForAccount((Account) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPackagesAndVisibilityForAccount";
        }

        private getPackagesAndVisibilityForAccount() {
        }
    }

    /* loaded from: classes3.dex */
    private static class getPassword extends MethodProxy {
        private getPassword() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getPassword((Account) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPassword";
        }
    }

    /* loaded from: classes3.dex */
    private static class getPreviousName extends MethodProxy {
        private getPreviousName() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getPreviousName((Account) objArr[0]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPreviousName";
        }
    }

    /* loaded from: classes3.dex */
    private static class getSharedAccountsAsUser extends MethodProxy {
        private getSharedAccountsAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[0]).intValue();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getSharedAccountsAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class getUserData extends MethodProxy {
        private getUserData() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.getUserData((Account) objArr[0], (String) objArr[1]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getUserData";
        }
    }

    /* loaded from: classes3.dex */
    private static class hasFeatures extends MethodProxy {
        private hasFeatures() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.hasFeatures((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String[]) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "hasFeatures";
        }
    }

    /* loaded from: classes3.dex */
    private static class invalidateAuthToken extends MethodProxy {
        private invalidateAuthToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.invalidateAuthToken((String) objArr[0], (String) objArr[1]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "invalidateAuthToken";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class isCredentialsUpdateSuggested extends MethodProxy {
        private isCredentialsUpdateSuggested() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.isCredentialsUpdateSuggested((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isCredentialsUpdateSuggested";
        }
    }

    /* loaded from: classes3.dex */
    private static class peekAuthToken extends MethodProxy {
        private peekAuthToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return AccountManagerStub.Mgr.peekAuthToken((Account) objArr[0], (String) objArr[1]);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "peekAuthToken";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class registerAccountListener extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.registerAccountListener((String[]) objArr[0]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "registerAccountListener";
        }

        private registerAccountListener() {
        }
    }

    /* loaded from: classes3.dex */
    private static class removeAccount extends MethodProxy {
        private removeAccount() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.removeAccount((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "removeAccount";
        }
    }

    /* loaded from: classes3.dex */
    private static class removeAccountAsUser extends MethodProxy {
        private removeAccountAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.removeAccount((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "removeAccountAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class removeAccountExplicitly extends MethodProxy {
        private removeAccountExplicitly() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(AccountManagerStub.Mgr.removeAccountExplicitly((Account) objArr[0]));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "removeAccountExplicitly";
        }
    }

    /* loaded from: classes3.dex */
    private static class removeSharedAccountAsUser extends MethodProxy {
        private removeSharedAccountAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[1]).intValue();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "removeSharedAccountAsUser";
        }
    }

    /* loaded from: classes3.dex */
    private static class renameAccount extends MethodProxy {
        private renameAccount() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.renameAccount((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "renameAccount";
        }
    }

    /* loaded from: classes3.dex */
    private static class renameSharedAccountAsUser extends MethodProxy {
        private renameSharedAccountAsUser() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[2]).intValue();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "renameSharedAccountAsUser";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class setAccountVisibility extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(AccountManagerStub.Mgr.setAccountVisibility((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setAccountVisibility";
        }

        private setAccountVisibility() {
        }
    }

    /* loaded from: classes3.dex */
    private static class setAuthToken extends MethodProxy {
        private setAuthToken() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.setAuthToken((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setAuthToken";
        }
    }

    /* loaded from: classes3.dex */
    private static class setPassword extends MethodProxy {
        private setPassword() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.setPassword((Account) objArr[0], (String) objArr[1]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setPassword";
        }
    }

    /* loaded from: classes3.dex */
    private static class setUserData extends MethodProxy {
        private setUserData() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.setUserData((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setUserData";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class startAddAccountSession extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.startAddAccountSession((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startAddAccountSession";
        }

        private startAddAccountSession() {
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class startUpdateCredentialsSession extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.startUpdateCredentialsSession((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startUpdateCredentialsSession";
        }

        private startUpdateCredentialsSession() {
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private static class unregisterAccountListener extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.unregisterAccountListener((String[]) objArr[0]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "unregisterAccountListener";
        }

        private unregisterAccountListener() {
        }
    }

    /* loaded from: classes3.dex */
    private static class updateAppPermission extends MethodProxy {
        private updateAppPermission() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            ((Integer) objArr[2]).intValue();
            ((Boolean) objArr[3]).booleanValue();
            method.invoke(obj, objArr);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "updateAppPermission";
        }
    }

    /* loaded from: classes3.dex */
    private static class updateCredentials extends MethodProxy {
        private updateCredentials() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            AccountManagerStub.Mgr.updateCredentials((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "updateCredentials";
        }
    }

    public AccountManagerStub() {
        super(IAccountManager.Stub.asInterface, ServiceManagerNative.ACCOUNT);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        try {
            Reflect.on((AccountManager) getContext().getSystemService(ServiceManagerNative.ACCOUNT)).set("mService", getInvocationStub().getProxyInterface());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new getPassword());
        addMethodProxy(new getUserData());
        addMethodProxy(new getAuthenticatorTypes());
        addMethodProxy(new getAccounts());
        addMethodProxy(new getAccountsForPackage());
        addMethodProxy(new getAccountsByTypeForPackage());
        addMethodProxy(new getAccountsAsUser());
        addMethodProxy(new hasFeatures());
        addMethodProxy(new getAccountsByFeatures());
        addMethodProxy(new addAccountExplicitly());
        addMethodProxy(new removeAccount());
        addMethodProxy(new removeAccountAsUser());
        addMethodProxy(new removeAccountExplicitly());
        addMethodProxy(new copyAccountToUser());
        addMethodProxy(new invalidateAuthToken());
        addMethodProxy(new peekAuthToken());
        addMethodProxy(new setAuthToken());
        addMethodProxy(new setPassword());
        addMethodProxy(new clearPassword());
        addMethodProxy(new setUserData());
        addMethodProxy(new updateAppPermission());
        addMethodProxy(new getAuthToken());
        addMethodProxy(new addAccount());
        addMethodProxy(new addAccountAsUser());
        addMethodProxy(new updateCredentials());
        addMethodProxy(new editProperties());
        addMethodProxy(new confirmCredentialsAsUser());
        addMethodProxy(new accountAuthenticated());
        addMethodProxy(new getAuthTokenLabel());
        addMethodProxy(new addSharedAccountAsUser());
        addMethodProxy(new getSharedAccountsAsUser());
        addMethodProxy(new removeSharedAccountAsUser());
        addMethodProxy(new renameAccount());
        addMethodProxy(new getPreviousName());
        addMethodProxy(new renameSharedAccountAsUser());
        if (BuildCompat.isOreo()) {
            addMethodProxy(new finishSessionAsUser());
            addMethodProxy(new getAccountVisibility());
            addMethodProxy(new addAccountExplicitlyWithVisibility());
            addMethodProxy(new getAccountsAndVisibilityForPackage());
            addMethodProxy(new getPackagesAndVisibilityForAccount());
            addMethodProxy(new setAccountVisibility());
            addMethodProxy(new startAddAccountSession());
            addMethodProxy(new startUpdateCredentialsSession());
            addMethodProxy(new registerAccountListener());
            addMethodProxy(new unregisterAccountListener());
        }
    }
}
