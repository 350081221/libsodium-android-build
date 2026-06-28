package com.lody.virtual.server.accounts;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.AccountManagerCompat;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VBinder;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.am.VActivityManagerService;
import com.lody.virtual.server.interfaces.IAccountManager;
import com.lody.virtual.server.pm.VPackageManagerService;
import com.tendcloud.tenddata.da;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mirror.com.android.internal.R_Hide;

/* loaded from: classes3.dex */
public class VAccountManagerService extends IAccountManager.Stub {
    private static final long CHECK_IN_TIME = 43200000;
    private static final Singleton<VAccountManagerService> sInstance = new Singleton<VAccountManagerService>() { // from class: com.lody.virtual.server.accounts.VAccountManagerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VAccountManagerService create() {
            return new VAccountManagerService();
        }
    };
    private static final String TAG = VAccountManagerService.class.getSimpleName();
    private final SparseArray<List<VAccount>> accountsByUserId = new SparseArray<>();
    private final SparseArray<List<VAccountVisibility>> accountsVisibilitiesByUserId = new SparseArray<>();
    private final LinkedList<AuthTokenRecord> authTokenRecords = new LinkedList<>();
    private final LinkedHashMap<String, Session> mSessions = new LinkedHashMap<>();
    private final AuthenticatorCache cache = new AuthenticatorCache();
    private Context mContext = VirtualCore.get().getContext();
    private long lastAccountChangeTime = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class AuthenticatorCache {
        final Map<String, AuthenticatorInfo> authenticators;

        private AuthenticatorCache() {
            this.authenticators = new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class AuthenticatorInfo {
        final AuthenticatorDescription desc;
        final ServiceInfo serviceInfo;

        AuthenticatorInfo(AuthenticatorDescription authenticatorDescription, ServiceInfo serviceInfo) {
            this.desc = authenticatorDescription;
            this.serviceInfo = serviceInfo;
        }
    }

    /* loaded from: classes3.dex */
    private class GetAccountsByTypeAndFeatureSession extends Session {
        private volatile Account[] mAccountsOfType;
        private volatile ArrayList<Account> mAccountsWithFeatures;
        private volatile int mCurrentAccount;
        private final String[] mFeatures;

        public GetAccountsByTypeAndFeatureSession(IAccountManagerResponse iAccountManagerResponse, int i5, AuthenticatorInfo authenticatorInfo, String[] strArr) {
            super(VAccountManagerService.this, iAccountManagerResponse, i5, authenticatorInfo, false, true, null);
            this.mAccountsOfType = null;
            this.mAccountsWithFeatures = null;
            this.mCurrentAccount = 0;
            this.mFeatures = strArr;
        }

        public void checkAccount() {
            if (this.mCurrentAccount >= this.mAccountsOfType.length) {
                sendResult();
                return;
            }
            IAccountAuthenticator iAccountAuthenticator = this.mAuthenticator;
            if (iAccountAuthenticator == null) {
                Log.v(VAccountManagerService.TAG, "checkAccount: aborting session since we are no longer connected to the authenticator, " + toDebugString());
                return;
            }
            try {
                iAccountAuthenticator.hasFeatures(this, this.mAccountsOfType[this.mCurrentAccount], this.mFeatures);
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.mNumResults++;
            if (bundle == null) {
                onError(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.mAccountsWithFeatures.add(this.mAccountsOfType[this.mCurrentAccount]);
            }
            this.mCurrentAccount++;
            checkAccount();
        }

        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
        public void run() throws RemoteException {
            this.mAccountsOfType = VAccountManagerService.this.getAccounts(this.mUserId, this.mAuthenticatorInfo.desc.type);
            this.mAccountsWithFeatures = new ArrayList<>(this.mAccountsOfType.length);
            this.mCurrentAccount = 0;
            checkAccount();
        }

        public void sendResult() {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    int size = this.mAccountsWithFeatures.size();
                    Account[] accountArr = new Account[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        accountArr[i5] = this.mAccountsWithFeatures.get(i5);
                    }
                    if (Log.isLoggable(VAccountManagerService.TAG, 2)) {
                        Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray(da.f11669a, accountArr);
                    responseAndClose.onResult(bundle);
                } catch (RemoteException e5) {
                    Log.v(VAccountManagerService.TAG, "failure while notifying response", e5);
                }
            }
        }

        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
        protected String toDebugString(long j5) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toDebugString(j5));
            sb.append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.mFeatures;
            if (strArr != null) {
                str = TextUtils.join(",", strArr);
            } else {
                str = null;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public abstract class Session extends IAccountAuthenticatorResponse.Stub implements IBinder.DeathRecipient, ServiceConnection {
        private String mAccountName;
        private boolean mAuthDetailsRequired;
        IAccountAuthenticator mAuthenticator;
        final AuthenticatorInfo mAuthenticatorInfo;
        private long mCreationTime;
        private boolean mExpectActivityLaunch;
        private int mNumErrors;
        private int mNumRequestContinued;
        public int mNumResults;
        private IAccountManagerResponse mResponse;
        private final boolean mStripAuthTokenFromResult;
        private boolean mUpdateLastAuthenticatedTime;
        final int mUserId;

        Session(IAccountManagerResponse iAccountManagerResponse, int i5, AuthenticatorInfo authenticatorInfo, boolean z4, boolean z5, String str, boolean z6, boolean z7) {
            if (authenticatorInfo != null) {
                this.mStripAuthTokenFromResult = z5;
                this.mResponse = iAccountManagerResponse;
                this.mUserId = i5;
                this.mAuthenticatorInfo = authenticatorInfo;
                this.mExpectActivityLaunch = z4;
                this.mCreationTime = SystemClock.elapsedRealtime();
                this.mAccountName = str;
                this.mAuthDetailsRequired = z6;
                this.mUpdateLastAuthenticatedTime = z7;
                synchronized (VAccountManagerService.this.mSessions) {
                    VAccountManagerService.this.mSessions.put(toString(), this);
                }
                if (iAccountManagerResponse != null) {
                    try {
                        iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                        return;
                    } catch (RemoteException unused) {
                        this.mResponse = null;
                        binderDied();
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("accountType is null");
        }

        private void close() {
            synchronized (VAccountManagerService.this.mSessions) {
                if (VAccountManagerService.this.mSessions.remove(toString()) == null) {
                    return;
                }
                IAccountManagerResponse iAccountManagerResponse = this.mResponse;
                if (iAccountManagerResponse != null) {
                    iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                    this.mResponse = null;
                }
                unbind();
            }
        }

        private void unbind() {
            if (this.mAuthenticator != null) {
                this.mAuthenticator = null;
                VActivityManager.get().unbindService(VAccountManagerService.this.mContext, this);
            }
        }

        void bind() {
            Log.v(VAccountManagerService.TAG, "initiating bind to authenticator type " + this.mAuthenticatorInfo.desc.type);
            Intent intent = new Intent();
            intent.setAction("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = this.mAuthenticatorInfo.serviceInfo;
            intent.setClassName(serviceInfo.packageName, serviceInfo.name);
            if (!VActivityManager.get().bindService(VAccountManagerService.this.mContext, intent, this, 1, this.mUserId)) {
                Log.d(VAccountManagerService.TAG, "bind attempt failed for " + toDebugString());
                onError(1, "bind failure");
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mResponse = null;
            close();
        }

        IAccountManagerResponse getResponseAndClose() {
            IAccountManagerResponse iAccountManagerResponse = this.mResponse;
            if (iAccountManagerResponse == null) {
                return null;
            }
            close();
            return iAccountManagerResponse;
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onError(int i5, String str) {
            this.mNumErrors++;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                try {
                    responseAndClose.onError(i5, str);
                    return;
                } catch (RemoteException e5) {
                    Log.v(VAccountManagerService.TAG, "Session.onError: caught RemoteException while responding", e5);
                    return;
                }
            }
            Log.v(VAccountManagerService.TAG, "Session.onError: already closed");
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onRequestContinued() {
            this.mNumRequestContinued++;
        }

        public void onResult(Bundle bundle) throws RemoteException {
            Intent intent;
            IAccountManagerResponse responseAndClose;
            boolean z4;
            long j5;
            boolean z5 = true;
            this.mNumResults++;
            if (bundle != null) {
                boolean z6 = bundle.getBoolean("booleanResult", false);
                if (bundle.containsKey("authAccount") && bundle.containsKey("accountType")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!this.mUpdateLastAuthenticatedTime || (!z6 && !z4)) {
                    z5 = false;
                }
                if (z5 || this.mAuthDetailsRequired) {
                    synchronized (VAccountManagerService.this.accountsByUserId) {
                        VAccount account = VAccountManagerService.this.getAccount(this.mUserId, this.mAccountName, this.mAuthenticatorInfo.desc.type);
                        if (z5 && account != null) {
                            account.lastAuthenticatedTime = System.currentTimeMillis();
                            VAccountManagerService.this.saveAllAccounts();
                        }
                        if (this.mAuthDetailsRequired) {
                            if (account != null) {
                                j5 = account.lastAuthenticatedTime;
                            } else {
                                j5 = -1;
                            }
                            bundle.putLong(AccountManagerCompat.KEY_LAST_AUTHENTICATED_TIME, j5);
                        }
                    }
                }
            }
            if (bundle != null) {
                TextUtils.isEmpty(bundle.getString("authtoken"));
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            } else {
                intent = null;
            }
            if (this.mExpectActivityLaunch && bundle != null && bundle.containsKey(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                responseAndClose = this.mResponse;
            } else {
                responseAndClose = getResponseAndClose();
            }
            if (responseAndClose != null) {
                try {
                    if (bundle == null) {
                        Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                        responseAndClose.onError(5, "null bundle returned");
                        return;
                    }
                    if (this.mStripAuthTokenFromResult) {
                        bundle.remove("authtoken");
                    }
                    Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    if (bundle.getInt(MediationConstant.KEY_ERROR_CODE, -1) > 0 && intent == null) {
                        responseAndClose.onError(bundle.getInt(MediationConstant.KEY_ERROR_CODE), bundle.getString("errorMessage"));
                    } else {
                        responseAndClose.onResult(bundle);
                    }
                } catch (RemoteException e5) {
                    Log.v(VAccountManagerService.TAG, "failure while notifying response", e5);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mAuthenticator = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                run();
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mAuthenticator = null;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    responseAndClose.onError(1, NetworkUtil.NETWORK_CLASS_DISCONNECTED);
                } catch (RemoteException e5) {
                    Log.v(VAccountManagerService.TAG, "Session.onServiceDisconnected: caught RemoteException while responding", e5);
                }
            }
        }

        public abstract void run() throws RemoteException;

        protected String toDebugString() {
            return toDebugString(SystemClock.elapsedRealtime());
        }

        protected String toDebugString(long j5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Session: expectLaunch ");
            sb.append(this.mExpectActivityLaunch);
            sb.append(", connected ");
            sb.append(this.mAuthenticator != null);
            sb.append(", stats (");
            sb.append(this.mNumResults);
            sb.append("/");
            sb.append(this.mNumRequestContinued);
            sb.append("/");
            sb.append(this.mNumErrors);
            sb.append("), lifetime ");
            sb.append((j5 - this.mCreationTime) / 1000.0d);
            return sb.toString();
        }

        Session(VAccountManagerService vAccountManagerService, IAccountManagerResponse iAccountManagerResponse, int i5, AuthenticatorInfo authenticatorInfo, boolean z4, boolean z5, String str) {
            this(iAccountManagerResponse, i5, authenticatorInfo, z4, z5, str, false, false);
        }
    }

    private void broadcastCheckInNowIfNeed(int i5) {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.lastAccountChangeTime) > CHECK_IN_TIME) {
            this.lastAccountChangeTime = currentTimeMillis;
            saveAllAccounts();
            VActivityManagerService.get().sendBroadcastAsUser(new Intent("android.server.checkin.CHECKIN_NOW"), new VUserHandle(i5));
        }
    }

    private void generateServicesMap(List<ResolveInfo> list, Map<String, AuthenticatorInfo> map, RegisteredServicesParser registeredServicesParser) {
        int next;
        AuthenticatorDescription parseAuthenticatorDescription;
        for (ResolveInfo resolveInfo : list) {
            XmlResourceParser parser = registeredServicesParser.getParser(this.mContext, resolveInfo.serviceInfo, "android.accounts.AccountAuthenticator");
            if (parser != null) {
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
                    do {
                        next = parser.next();
                        if (next == 1) {
                            break;
                        }
                    } while (next != 2);
                    if ("account-authenticator".equals(parser.getName()) && (parseAuthenticatorDescription = parseAuthenticatorDescription(registeredServicesParser.getResources(this.mContext, resolveInfo.serviceInfo.applicationInfo), resolveInfo.serviceInfo.packageName, asAttributeSet)) != null) {
                        map.put(parseAuthenticatorDescription.type, new AuthenticatorInfo(parseAuthenticatorDescription, resolveInfo.serviceInfo));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static VAccountManagerService get() {
        return sInstance.get();
    }

    private VAccount getAccount(int i5, Account account) {
        return getAccount(i5, account.name, account.type);
    }

    private List<Account> getAccountList(int i5, String str) {
        ArrayList arrayList;
        synchronized (this.accountsByUserId) {
            arrayList = new ArrayList();
            List<VAccount> list = this.accountsByUserId.get(i5);
            if (list != null) {
                for (VAccount vAccount : list) {
                    if (str == null || vAccount.type.equals(str)) {
                        arrayList.add(new Account(vAccount.name, vAccount.type));
                    }
                }
            }
        }
        return arrayList;
    }

    private AuthenticatorInfo getAuthenticatorInfo(String str) {
        AuthenticatorInfo authenticatorInfo;
        synchronized (this.cache) {
            if (str == null) {
                authenticatorInfo = null;
            } else {
                authenticatorInfo = this.cache.authenticators.get(str);
            }
        }
        return authenticatorInfo;
    }

    private String getCustomAuthToken(int i5, Account account, String str, String str2) {
        String str3;
        AuthTokenRecord authTokenRecord = new AuthTokenRecord(i5, account, str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.authTokenRecords) {
            Iterator<AuthTokenRecord> it = this.authTokenRecords.iterator();
            str3 = null;
            while (it.hasNext()) {
                AuthTokenRecord next = it.next();
                long j5 = next.expiryEpochMillis;
                if (j5 > 0 && j5 < currentTimeMillis) {
                    it.remove();
                } else if (authTokenRecord.equals(next)) {
                    str3 = authTokenRecord.authToken;
                }
            }
        }
        return str3;
    }

    private boolean insertAccountIntoDatabase(int i5, Account account, String str, Bundle bundle) {
        if (account == null) {
            return false;
        }
        synchronized (this.accountsByUserId) {
            if (getAccount(i5, account.name, account.type) != null) {
                return false;
            }
            VAccount vAccount = new VAccount(i5, account);
            vAccount.password = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        vAccount.userDatas.put(str2, (String) obj);
                    }
                }
            }
            List<VAccount> list = this.accountsByUserId.get(i5);
            if (list == null) {
                list = new ArrayList<>();
                this.accountsByUserId.put(i5, list);
            }
            list.add(vAccount);
            saveAllAccounts();
            sendAccountsChangedBroadcast(vAccount.userId);
            return true;
        }
    }

    @TargetApi(26)
    private boolean insertAccountVisibilityIntoDatabase(int i5, Account account, Map<String, Integer> map) {
        if (account == null) {
            return false;
        }
        synchronized (this.accountsVisibilitiesByUserId) {
            VAccountVisibility vAccountVisibility = new VAccountVisibility(i5, account, map);
            List<VAccountVisibility> list = this.accountsVisibilitiesByUserId.get(i5);
            if (list == null) {
                list = new ArrayList<>();
                this.accountsVisibilitiesByUserId.put(i5, list);
            }
            list.add(vAccountVisibility);
            saveAllAccountVisibilities();
            sendAccountsChangedBroadcast(vAccountVisibility.userId);
        }
        return true;
    }

    private void onResult(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    private static AuthenticatorDescription parseAuthenticatorDescription(Resources resources, String str, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R_Hide.styleable.AccountAuthenticator.get());
        try {
            String string = obtainAttributes.getString(R_Hide.styleable.AccountAuthenticator_accountType.get());
            int resourceId = obtainAttributes.getResourceId(R_Hide.styleable.AccountAuthenticator_label.get(), 0);
            int resourceId2 = obtainAttributes.getResourceId(R_Hide.styleable.AccountAuthenticator_icon.get(), 0);
            int resourceId3 = obtainAttributes.getResourceId(R_Hide.styleable.AccountAuthenticator_smallIcon.get(), 0);
            int resourceId4 = obtainAttributes.getResourceId(R_Hide.styleable.AccountAuthenticator_accountPreferences.get(), 0);
            boolean z4 = obtainAttributes.getBoolean(R_Hide.styleable.AccountAuthenticator_customTokens.get(), false);
            if (TextUtils.isEmpty(string)) {
                obtainAttributes.recycle();
                return null;
            }
            return new AuthenticatorDescription(string, str, resourceId, resourceId2, resourceId3, resourceId4, z4);
        } finally {
            obtainAttributes.recycle();
        }
    }

    @TargetApi(26)
    private void readAllAccountVisibilities() {
        File accountVisibilityConfigFile = VEnvironment.getAccountVisibilityConfigFile();
        Parcel obtain = Parcel.obtain();
        if (accountVisibilityConfigFile.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(accountVisibilityConfigFile);
                int length = (int) accountVisibilityConfigFile.length();
                byte[] bArr = new byte[length];
                int read = fileInputStream.read(bArr);
                fileInputStream.close();
                if (read == length) {
                    obtain.unmarshall(bArr, 0, length);
                    obtain.setDataPosition(0);
                    obtain.readInt();
                    int readInt = obtain.readInt();
                    for (int i5 = 0; i5 < readInt; i5++) {
                        int readInt2 = obtain.readInt();
                        int readInt3 = obtain.readInt();
                        ArrayList arrayList = new ArrayList();
                        this.accountsVisibilitiesByUserId.put(readInt2, arrayList);
                        for (int i6 = 0; i6 < readInt3; i6++) {
                            arrayList.add(new VAccountVisibility(obtain));
                        }
                    }
                    this.lastAccountChangeTime = obtain.readLong();
                } else {
                    throw new IOException(String.format("Expect length %d, but got %d.", Integer.valueOf(length), Integer.valueOf(read)));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        obtain.recycle();
    }

    private void readAllAccounts() {
        int length;
        byte[] bArr;
        int read;
        File accountConfigFile = VEnvironment.getAccountConfigFile();
        refreshAuthenticatorCache(null);
        if (accountConfigFile.exists()) {
            this.accountsByUserId.clear();
            Parcel obtain = Parcel.obtain();
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(accountConfigFile);
                    length = (int) accountConfigFile.length();
                    bArr = new byte[length];
                    read = fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (read == length) {
                    obtain.unmarshall(bArr, 0, length);
                    obtain.setDataPosition(0);
                    obtain.readInt();
                    int readInt = obtain.readInt();
                    while (true) {
                        int i5 = readInt - 1;
                        if (readInt <= 0) {
                            break;
                        }
                        VAccount vAccount = new VAccount(obtain);
                        VLog.d(TAG, "Reading account : " + vAccount.type, new Object[0]);
                        List<VAccount> list = this.accountsByUserId.get(vAccount.userId);
                        if (list == null) {
                            list = new ArrayList<>();
                            this.accountsByUserId.put(vAccount.userId, list);
                        }
                        list.add(vAccount);
                        readInt = i5;
                    }
                    this.lastAccountChangeTime = obtain.readLong();
                    return;
                }
                throw new IOException(String.format(Locale.ENGLISH, "Expect length %d, but got %d.", Integer.valueOf(length), Integer.valueOf(read)));
            } finally {
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeAccountInternal(int i5, Account account) {
        List<VAccount> list = this.accountsByUserId.get(i5);
        if (list != null) {
            Iterator<VAccount> it = list.iterator();
            while (it.hasNext()) {
                VAccount next = it.next();
                if (i5 == next.userId && TextUtils.equals(next.name, account.name) && TextUtils.equals(account.type, next.type)) {
                    it.remove();
                    saveAllAccounts();
                    sendAccountsChangedBroadcast(i5);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @TargetApi(26)
    private boolean removeAccountVisibility(int i5, Account account) {
        List<VAccountVisibility> list = this.accountsVisibilitiesByUserId.get(i5);
        if (list != null) {
            Iterator<VAccountVisibility> it = list.iterator();
            while (it.hasNext()) {
                VAccountVisibility next = it.next();
                if (i5 == next.userId && TextUtils.equals(next.name, account.name) && TextUtils.equals(account.type, next.type)) {
                    it.remove();
                    saveAllAccountVisibilities();
                    sendAccountsChangedBroadcast(i5);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private Account renameAccountInternal(int i5, Account account, String str) {
        synchronized (this.accountsByUserId) {
            VAccount account2 = getAccount(i5, account);
            if (account2 != null) {
                account2.previousName = account2.name;
                account2.name = str;
                saveAllAccounts();
                Account account3 = new Account(account2.name, account2.type);
                synchronized (this.authTokenRecords) {
                    Iterator<AuthTokenRecord> it = this.authTokenRecords.iterator();
                    while (it.hasNext()) {
                        AuthTokenRecord next = it.next();
                        if (next.userId == i5 && next.account.equals(account)) {
                            next.account = account3;
                        }
                    }
                }
                sendAccountsChangedBroadcast(i5);
                return account3;
            }
            return account;
        }
    }

    @TargetApi(26)
    private boolean renameAccountVisibility(int i5, Account account, String str) {
        synchronized (this.accountsVisibilitiesByUserId) {
            VAccountVisibility accountVisibility = getAccountVisibility(i5, account);
            if (accountVisibility != null) {
                accountVisibility.name = str;
                saveAllAccountVisibilities();
                sendAccountsChangedBroadcast(i5);
                return true;
            }
            return false;
        }
    }

    @TargetApi(26)
    private void saveAllAccountVisibilities() {
        File accountVisibilityConfigFile = VEnvironment.getAccountVisibilityConfigFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInt(1);
            obtain.writeInt(this.accountsVisibilitiesByUserId.size());
            for (int i5 = 0; i5 < this.accountsVisibilitiesByUserId.size(); i5++) {
                obtain.writeInt(i5);
                List<VAccountVisibility> valueAt = this.accountsVisibilitiesByUserId.valueAt(i5);
                if (valueAt == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(valueAt.size());
                    Iterator<VAccountVisibility> it = valueAt.iterator();
                    while (it.hasNext()) {
                        it.next().writeToParcel(obtain, 0);
                    }
                }
            }
            obtain.writeLong(this.lastAccountChangeTime);
            FileOutputStream fileOutputStream = new FileOutputStream(accountVisibilityConfigFile);
            fileOutputStream.write(obtain.marshall());
            fileOutputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        obtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveAllAccounts() {
        File accountConfigFile = VEnvironment.getAccountConfigFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInt(1);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.accountsByUserId.size(); i5++) {
                List<VAccount> valueAt = this.accountsByUserId.valueAt(i5);
                if (valueAt != null) {
                    arrayList.addAll(valueAt);
                }
            }
            obtain.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((VAccount) it.next()).writeToParcel(obtain, 0);
            }
            obtain.writeLong(this.lastAccountChangeTime);
            FileOutputStream fileOutputStream = new FileOutputStream(accountConfigFile);
            fileOutputStream.write(obtain.marshall());
            fileOutputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        obtain.recycle();
    }

    private void sendAccountsChangedBroadcast(int i5) {
        VActivityManagerService.get().sendBroadcastAsUser(new Intent("android.accounts.LOGIN_ACCOUNTS_CHANGED"), new VUserHandle(i5));
        VActivityManagerService.get().sendBroadcastAsUser(new Intent("android.accounts.action.VISIBLE_ACCOUNTS_CHANGED"), new VUserHandle(i5));
        broadcastCheckInNowIfNeed(i5);
    }

    private void setPasswordInternal(int i5, Account account, String str) {
        synchronized (this.accountsByUserId) {
            VAccount account2 = getAccount(i5, account);
            if (account2 != null) {
                account2.password = str;
                account2.authTokens.clear();
                saveAllAccounts();
                synchronized (this.authTokenRecords) {
                    Iterator<AuthTokenRecord> it = this.authTokenRecords.iterator();
                    while (it.hasNext()) {
                        AuthTokenRecord next = it.next();
                        if (next.userId == i5 && next.account.equals(account)) {
                            it.remove();
                        }
                    }
                }
                sendAccountsChangedBroadcast(i5);
            }
        }
    }

    public static void systemReady() {
        get().readAllAccounts();
        get().readAllAccountVisibilities();
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public boolean accountAuthenticated(int i5, Account account) {
        if (account != null) {
            synchronized (this.accountsByUserId) {
                VAccount account2 = getAccount(i5, account);
                if (account2 != null) {
                    account2.lastAuthenticatedTime = System.currentTimeMillis();
                    saveAllAccounts();
                    return true;
                }
                return false;
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void addAccount(int i5, IAccountManagerResponse iAccountManagerResponse, final String str, final String str2, final String[] strArr, boolean z4, final Bundle bundle) {
        if (iAccountManagerResponse != null) {
            if (str != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(str);
                if (authenticatorInfo == null) {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("authtoken", str2);
                        bundle2.putString("accountType", str);
                        bundle2.putBoolean("booleanResult", false);
                        iAccountManagerResponse.onResult(bundle2);
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, z4, true, null, false, true) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.8
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.addAccount(this, this.mAuthenticatorInfo.desc.type, str2, strArr, bundle);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    protected String toDebugString(long j5) {
                        String str3;
                        StringBuilder sb = new StringBuilder();
                        sb.append(super.toDebugString(j5));
                        sb.append(", addAccount, accountType ");
                        sb.append(str);
                        sb.append(", requiredFeatures ");
                        String[] strArr2 = strArr;
                        if (strArr2 != null) {
                            str3 = TextUtils.join(",", strArr2);
                        } else {
                            str3 = null;
                        }
                        sb.append(str3);
                        return sb.toString();
                    }
                }.bind();
                return;
            }
            throw new IllegalArgumentException("accountType is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public boolean addAccountExplicitly(int i5, Account account, String str, Bundle bundle) {
        if (account != null) {
            return insertAccountIntoDatabase(i5, account, str, bundle);
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    @TargetApi(26)
    public boolean addAccountExplicitlyWithVisibility(int i5, Account account, String str, Bundle bundle, Map map) {
        if (account != null) {
            boolean insertAccountIntoDatabase = insertAccountIntoDatabase(i5, account, str, bundle);
            insertAccountVisibilityIntoDatabase(i5, account, map);
            return insertAccountIntoDatabase;
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void clearPassword(int i5, Account account) {
        if (account != null) {
            setPasswordInternal(i5, account, null);
            return;
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void confirmCredentials(int i5, IAccountManagerResponse iAccountManagerResponse, final Account account, final Bundle bundle, boolean z4) {
        if (iAccountManagerResponse != null) {
            if (account != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(account.type);
                if (authenticatorInfo == null) {
                    try {
                        iAccountManagerResponse.onError(7, "account.type does not exist");
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, z4, true, account.name, true, true) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.7
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.confirmCredentials(this, account, bundle);
                    }
                }.bind();
                return;
            }
            throw new IllegalArgumentException("account is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void editProperties(int i5, IAccountManagerResponse iAccountManagerResponse, final String str, boolean z4) {
        if (iAccountManagerResponse != null) {
            if (str != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(str);
                if (authenticatorInfo == null) {
                    try {
                        iAccountManagerResponse.onError(7, "account.type does not exist");
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, z4, true, null) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.5
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.editProperties(this, this.mAuthenticatorInfo.desc.type);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    protected String toDebugString(long j5) {
                        return super.toDebugString(j5) + ", editProperties, accountType " + str;
                    }
                }.bind();
                return;
            }
            throw new IllegalArgumentException("accountType is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void finishSessionAsUser(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, boolean z4, Bundle bundle2, int i5) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    @TargetApi(26)
    public int getAccountVisibility(int i5, Account account, String str) {
        VAccountVisibility accountVisibility = getAccountVisibility(i5, account);
        if (accountVisibility == null || !accountVisibility.visibility.containsKey(str)) {
            return 0;
        }
        return accountVisibility.visibility.get(str).intValue();
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public Account[] getAccounts(int i5, String str) {
        List<Account> accountList = getAccountList(i5, str);
        return (Account[]) accountList.toArray(new Account[accountList.size()]);
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    @TargetApi(26)
    public Map<Account, Integer> getAccountsAndVisibilityForPackage(int i5, String str, String str2) {
        HashMap hashMap = new HashMap();
        for (Account account : getAccountList(i5, str2)) {
            VAccountVisibility accountVisibility = getAccountVisibility(i5, account);
            if (accountVisibility != null && accountVisibility.visibility.containsKey(str)) {
                hashMap.put(account, accountVisibility.visibility.get(str));
            }
        }
        return hashMap;
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void getAccountsByFeatures(int i5, IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        if (iAccountManagerResponse != null) {
            if (str != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(str);
                if (authenticatorInfo == null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray(da.f11669a, new Account[0]);
                    try {
                        iAccountManagerResponse.onResult(bundle);
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                if (strArr != null && strArr.length != 0) {
                    new GetAccountsByTypeAndFeatureSession(iAccountManagerResponse, i5, authenticatorInfo, strArr).bind();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray(da.f11669a, getAccounts(i5, str));
                try {
                    iAccountManagerResponse.onResult(bundle2);
                    return;
                } catch (RemoteException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            throw new IllegalArgumentException("accountType is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    public AccountAndUser[] getAllAccounts() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.accountsByUserId.size(); i5++) {
            for (VAccount vAccount : this.accountsByUserId.valueAt(i5)) {
                arrayList.add(new AccountAndUser(new Account(vAccount.name, vAccount.type), vAccount.userId));
            }
        }
        return (AccountAndUser[]) arrayList.toArray(new AccountAndUser[0]);
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public final void getAuthToken(final int i5, IAccountManagerResponse iAccountManagerResponse, final Account account, final String str, final boolean z4, boolean z5, final Bundle bundle) {
        String customAuthToken;
        VAccount account2;
        String str2;
        if (iAccountManagerResponse != null) {
            try {
                if (account == null) {
                    VLog.w(TAG, "getAuthToken called with null account", new Object[0]);
                    iAccountManagerResponse.onError(7, "account is null");
                    return;
                }
                if (str == null) {
                    VLog.w(TAG, "getAuthToken called with null authTokenType", new Object[0]);
                    iAccountManagerResponse.onError(7, "authTokenType is null");
                    return;
                }
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(account.type);
                if (authenticatorInfo == null) {
                    try {
                        iAccountManagerResponse.onError(7, "account.type does not exist");
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                final String string = bundle.getString(AccountManagerCompat.KEY_ANDROID_PACKAGE_NAME);
                final boolean z6 = authenticatorInfo.desc.customTokens;
                bundle.putInt("callerUid", VBinder.getCallingUid());
                bundle.putInt("callerPid", VBinder.getCallingPid());
                if (z4) {
                    bundle.putBoolean(AccountManagerCompat.KEY_NOTIFY_ON_FAILURE, true);
                }
                if (!z6) {
                    synchronized (this.accountsByUserId) {
                        account2 = getAccount(i5, account);
                    }
                    if (account2 != null) {
                        str2 = account2.authTokens.get(str);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("authtoken", str2);
                        bundle2.putString("authAccount", account.name);
                        bundle2.putString("accountType", account.type);
                        onResult(iAccountManagerResponse, bundle2);
                        return;
                    }
                }
                if (z6 && (customAuthToken = getCustomAuthToken(i5, account, str, string)) != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authtoken", customAuthToken);
                    bundle3.putString("authAccount", account.name);
                    bundle3.putString("accountType", account.type);
                    onResult(iAccountManagerResponse, bundle3);
                    return;
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, z5, false, account.name) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.2
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                    public void onResult(Bundle bundle4) throws RemoteException {
                        if (bundle4 != null) {
                            String string2 = bundle4.getString("authtoken");
                            if (string2 != null) {
                                String string3 = bundle4.getString("authAccount");
                                String string4 = bundle4.getString("accountType");
                                if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string3)) {
                                    if (!z6) {
                                        synchronized (VAccountManagerService.this.accountsByUserId) {
                                            if (VAccountManagerService.this.getAccount(i5, string3, string4) == null) {
                                                List list = (List) VAccountManagerService.this.accountsByUserId.get(i5);
                                                if (list == null) {
                                                    list = new ArrayList();
                                                    VAccountManagerService.this.accountsByUserId.put(i5, list);
                                                }
                                                list.add(new VAccount(i5, new Account(string3, string4)));
                                                VAccountManagerService.this.saveAllAccounts();
                                            }
                                        }
                                    }
                                    long j5 = bundle4.getLong(AccountManagerCompat.KEY_CUSTOM_TOKEN_EXPIRY, 0L);
                                    if (z6 && j5 > System.currentTimeMillis()) {
                                        AuthTokenRecord authTokenRecord = new AuthTokenRecord(i5, account, str, string, string2, j5);
                                        synchronized (VAccountManagerService.this.authTokenRecords) {
                                            VAccountManagerService.this.authTokenRecords.remove(authTokenRecord);
                                            VAccountManagerService.this.authTokenRecords.add(authTokenRecord);
                                        }
                                    }
                                } else {
                                    onError(5, "the type and name should not be empty");
                                    return;
                                }
                            }
                        }
                        super.onResult(bundle4);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.getAuthToken(this, account, str, bundle);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    protected String toDebugString(long j5) {
                        return super.toDebugString(j5) + ", getAuthToken, " + account + ", authTokenType " + str + ", loginOptions " + bundle + ", notifyOnAuthFailure " + z4;
                    }
                }.bind();
                return;
            } catch (RemoteException e6) {
                e6.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void getAuthTokenLabel(int i5, IAccountManagerResponse iAccountManagerResponse, String str, final String str2) {
        if (str != null) {
            if (str2 != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(str);
                if (authenticatorInfo == null) {
                    try {
                        iAccountManagerResponse.onError(7, "account.type does not exist");
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, false, false, null) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.6
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                    public void onResult(Bundle bundle) throws RemoteException {
                        if (bundle != null) {
                            String string = bundle.getString("authTokenLabelKey");
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("authTokenLabelKey", string);
                            super.onResult(bundle2);
                            return;
                        }
                        super.onResult(null);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.getAuthTokenLabel(this, str2);
                    }
                }.bind();
                return;
            }
            throw new IllegalArgumentException("authTokenType is null");
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public AuthenticatorDescription[] getAuthenticatorTypes(int i5) {
        AuthenticatorDescription[] authenticatorDescriptionArr;
        synchronized (this.cache) {
            authenticatorDescriptionArr = new AuthenticatorDescription[this.cache.authenticators.size()];
            Iterator<AuthenticatorInfo> it = this.cache.authenticators.values().iterator();
            int i6 = 0;
            while (it.hasNext()) {
                authenticatorDescriptionArr[i6] = it.next().desc;
                i6++;
            }
        }
        return authenticatorDescriptionArr;
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    @TargetApi(26)
    public Map<String, Integer> getPackagesAndVisibilityForAccount(int i5, Account account) {
        VAccountVisibility accountVisibility = getAccountVisibility(i5, account);
        if (accountVisibility != null) {
            return accountVisibility.visibility;
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public String getPassword(int i5, Account account) {
        if (account != null) {
            synchronized (this.accountsByUserId) {
                VAccount account2 = getAccount(i5, account);
                if (account2 != null) {
                    return account2.password;
                }
                return null;
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public final String getPreviousName(int i5, Account account) {
        String str;
        if (account != null) {
            synchronized (this.accountsByUserId) {
                VAccount account2 = getAccount(i5, account);
                if (account2 != null) {
                    str = account2.previousName;
                } else {
                    str = null;
                }
            }
            return str;
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public String getUserData(int i5, Account account, String str) {
        if (account != null) {
            if (str != null) {
                synchronized (this.accountsByUserId) {
                    VAccount account2 = getAccount(i5, account);
                    if (account2 != null) {
                        return account2.userDatas.get(str);
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("key is null");
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void hasFeatures(int i5, IAccountManagerResponse iAccountManagerResponse, final Account account, final String[] strArr) {
        if (iAccountManagerResponse != null) {
            if (account != null) {
                if (strArr != null) {
                    AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(account.type);
                    if (authenticatorInfo == null) {
                        try {
                            iAccountManagerResponse.onError(7, "account.type does not exist");
                            return;
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                            return;
                        }
                    }
                    new Session(iAccountManagerResponse, i5, authenticatorInfo, false, true, account.name) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.3
                        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                        public void onResult(Bundle bundle) throws RemoteException {
                            IAccountManagerResponse responseAndClose = getResponseAndClose();
                            if (responseAndClose != null) {
                                try {
                                    if (bundle == null) {
                                        responseAndClose.onError(5, "null bundle");
                                        return;
                                    }
                                    Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                                    responseAndClose.onResult(bundle2);
                                } catch (RemoteException e6) {
                                    Log.v(VAccountManagerService.TAG, "failure while notifying response", e6);
                                }
                            }
                        }

                        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                        public void run() throws RemoteException {
                            try {
                                this.mAuthenticator.hasFeatures(this, account, strArr);
                            } catch (RemoteException unused) {
                                onError(1, "remote exception");
                            }
                        }
                    }.bind();
                    return;
                }
                throw new IllegalArgumentException("features is null");
            }
            throw new IllegalArgumentException("account is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void invalidateAuthToken(int i5, String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                synchronized (this.accountsByUserId) {
                    List<VAccount> list = this.accountsByUserId.get(i5);
                    if (list != null) {
                        boolean z4 = false;
                        for (VAccount vAccount : list) {
                            if (vAccount.type.equals(str)) {
                                vAccount.authTokens.values().remove(str2);
                                z4 = true;
                            }
                        }
                        if (z4) {
                            saveAllAccounts();
                        }
                    }
                    synchronized (this.authTokenRecords) {
                        Iterator<AuthTokenRecord> it = this.authTokenRecords.iterator();
                        while (it.hasNext()) {
                            AuthTokenRecord next = it.next();
                            if (next.userId == i5 && next.authTokenType.equals(str) && next.authToken.equals(str2)) {
                                it.remove();
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalArgumentException("authToken is null");
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void isCredentialsUpdateSuggested(IAccountManagerResponse iAccountManagerResponse, Account account, String str) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public String peekAuthToken(int i5, Account account, String str) {
        if (account != null) {
            if (str != null) {
                synchronized (this.accountsByUserId) {
                    VAccount account2 = getAccount(i5, account);
                    if (account2 != null) {
                        return account2.authTokens.get(str);
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("authTokenType is null");
        }
        throw new IllegalArgumentException("account is null");
    }

    public void refreshAuthenticatorCache(String str) {
        this.cache.authenticators.clear();
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        if (str != null) {
            intent.setPackage(str);
        }
        generateServicesMap(VPackageManagerService.get().queryIntentServices(intent, null, 128, 0), this.cache.authenticators, new RegisteredServicesParser());
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void registerAccountListener(String[] strArr) throws RemoteException {
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void removeAccount(final int i5, IAccountManagerResponse iAccountManagerResponse, final Account account, boolean z4) {
        if (iAccountManagerResponse != null) {
            if (account != null) {
                AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(account.type);
                if (authenticatorInfo == null) {
                    try {
                        iAccountManagerResponse.onError(7, "account.type does not exist");
                        return;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                new Session(iAccountManagerResponse, i5, authenticatorInfo, z4, true, account.name) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.9
                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                    public void onResult(Bundle bundle) throws RemoteException {
                        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                            boolean z5 = bundle.getBoolean("booleanResult");
                            if (z5) {
                                VAccountManagerService.this.removeAccountInternal(i5, account);
                            }
                            IAccountManagerResponse responseAndClose = getResponseAndClose();
                            if (responseAndClose != null) {
                                Log.v(VAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("booleanResult", z5);
                                try {
                                    responseAndClose.onResult(bundle2);
                                } catch (RemoteException e6) {
                                    e6.printStackTrace();
                                }
                            }
                        }
                        super.onResult(bundle);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    public void run() throws RemoteException {
                        this.mAuthenticator.getAccountRemovalAllowed(this, account);
                    }

                    @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                    protected String toDebugString(long j5) {
                        return super.toDebugString(j5) + ", removeAccount, account " + account;
                    }
                }.bind();
                return;
            }
            throw new IllegalArgumentException("account is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public boolean removeAccountExplicitly(int i5, Account account) {
        return account != null && removeAccountInternal(i5, account);
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void renameAccount(int i5, IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        if (account != null) {
            Account renameAccountInternal = renameAccountInternal(i5, account, str);
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", renameAccountInternal.name);
            bundle.putString("accountType", renameAccountInternal.type);
            try {
                iAccountManagerResponse.onResult(bundle);
                return;
            } catch (RemoteException e5) {
                Log.w(TAG, e5.getMessage());
                return;
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    @TargetApi(26)
    public boolean setAccountVisibility(int i5, Account account, String str, int i6) {
        VAccountVisibility accountVisibility = getAccountVisibility(i5, account);
        if (accountVisibility == null) {
            return false;
        }
        accountVisibility.visibility.put(str, Integer.valueOf(i6));
        saveAllAccountVisibilities();
        sendAccountsChangedBroadcast(i5);
        return true;
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void setAuthToken(int i5, Account account, String str, String str2) {
        if (account != null) {
            if (str != null) {
                synchronized (this.accountsByUserId) {
                    VAccount account2 = getAccount(i5, account);
                    if (account2 != null) {
                        account2.authTokens.put(str, str2);
                        saveAllAccounts();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("authTokenType is null");
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void setPassword(int i5, Account account, String str) {
        if (account != null) {
            setPasswordInternal(i5, account, str);
            return;
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void setUserData(int i5, Account account, String str, String str2) {
        if (str != null) {
            if (account != null) {
                VAccount account2 = getAccount(i5, account);
                if (account2 != null) {
                    synchronized (this.accountsByUserId) {
                        account2.userDatas.put(str, str2);
                        saveAllAccounts();
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("account is null");
        }
        throw new IllegalArgumentException("key is null");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void startAddAccountSession(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void startUpdateCredentialsSession(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void unregisterAccountListener(String[] strArr) throws RemoteException {
    }

    @Override // com.lody.virtual.server.interfaces.IAccountManager
    public void updateCredentials(int i5, IAccountManagerResponse iAccountManagerResponse, final Account account, final String str, boolean z4, final Bundle bundle) {
        if (iAccountManagerResponse != null) {
            if (account != null) {
                if (str != null) {
                    AuthenticatorInfo authenticatorInfo = getAuthenticatorInfo(account.type);
                    if (authenticatorInfo == null) {
                        try {
                            iAccountManagerResponse.onError(7, "account.type does not exist");
                            return;
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                            return;
                        }
                    }
                    new Session(iAccountManagerResponse, i5, authenticatorInfo, z4, false, account.name) { // from class: com.lody.virtual.server.accounts.VAccountManagerService.4
                        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                        public void run() throws RemoteException {
                            this.mAuthenticator.updateCredentials(this, account, str, bundle);
                        }

                        @Override // com.lody.virtual.server.accounts.VAccountManagerService.Session
                        protected String toDebugString(long j5) {
                            Bundle bundle2 = bundle;
                            if (bundle2 != null) {
                                bundle2.keySet();
                            }
                            return super.toDebugString(j5) + ", updateCredentials, " + account + ", authTokenType " + str + ", loginOptions " + bundle;
                        }
                    }.bind();
                    return;
                }
                throw new IllegalArgumentException("authTokenType is null");
            }
            throw new IllegalArgumentException("account is null");
        }
        throw new IllegalArgumentException("response is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VAccount getAccount(int i5, String str, String str2) {
        List<VAccount> list = this.accountsByUserId.get(i5);
        if (list == null) {
            return null;
        }
        for (VAccount vAccount : list) {
            if (TextUtils.equals(vAccount.name, str) && TextUtils.equals(vAccount.type, str2)) {
                return vAccount;
            }
        }
        return null;
    }

    @TargetApi(26)
    private VAccountVisibility getAccountVisibility(int i5, String str, String str2) {
        List<VAccountVisibility> list = this.accountsVisibilitiesByUserId.get(i5);
        if (list == null) {
            return null;
        }
        for (VAccountVisibility vAccountVisibility : list) {
            if (TextUtils.equals(vAccountVisibility.name, str) && TextUtils.equals(vAccountVisibility.type, str2)) {
                return vAccountVisibility;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class AuthTokenRecord {
        public Account account;
        public String authToken;
        private String authTokenType;
        public long expiryEpochMillis;
        private String packageName;
        public int userId;

        AuthTokenRecord(int i5, Account account, String str, String str2, String str3, long j5) {
            this.userId = i5;
            this.account = account;
            this.authTokenType = str;
            this.packageName = str2;
            this.authToken = str3;
            this.expiryEpochMillis = j5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AuthTokenRecord.class != obj.getClass()) {
                return false;
            }
            AuthTokenRecord authTokenRecord = (AuthTokenRecord) obj;
            if (this.userId == authTokenRecord.userId && this.account.equals(authTokenRecord.account) && this.authTokenType.equals(authTokenRecord.authTokenType) && this.packageName.equals(authTokenRecord.packageName)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.userId * 31) + this.account.hashCode()) * 31) + this.authTokenType.hashCode()) * 31) + this.packageName.hashCode();
        }

        AuthTokenRecord(int i5, Account account, String str, String str2) {
            this.userId = i5;
            this.account = account;
            this.authTokenType = str;
            this.packageName = str2;
        }
    }

    @TargetApi(26)
    private VAccountVisibility getAccountVisibility(int i5, Account account) {
        return getAccountVisibility(i5, account.name, account.type);
    }
}
