package com.lody.virtual.client.stub;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.lody.virtual.R;
import com.lody.virtual.client.ipc.VAccountManager;
import com.lody.virtual.helper.utils.VLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Instrumented
/* loaded from: classes3.dex */
public class ChooseTypeAndAccountActivity extends Activity implements AccountManagerCallback<Bundle> {
    private static final boolean DEBUG = false;
    public static final String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";
    public static final String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";
    public static final String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";
    public static final String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";
    public static final String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";

    @Deprecated
    public static final String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";
    public static final String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";
    public static final String EXTRA_SELECTED_ACCOUNT = "selectedAccount";
    private static final String KEY_INSTANCE_STATE_ACCOUNT_LIST = "accountList";
    private static final String KEY_INSTANCE_STATE_EXISTING_ACCOUNTS = "existingAccounts";
    private static final String KEY_INSTANCE_STATE_PENDING_REQUEST = "pendingRequest";
    private static final String KEY_INSTANCE_STATE_SELECTED_ACCOUNT_NAME = "selectedAccountName";
    private static final String KEY_INSTANCE_STATE_SELECTED_ADD_ACCOUNT = "selectedAddAccount";
    public static final String KEY_USER_ID = "userId";
    public static final int REQUEST_ADD_ACCOUNT = 2;
    public static final int REQUEST_CHOOSE_TYPE = 1;
    public static final int REQUEST_NULL = 0;
    private static final int SELECTED_ITEM_NONE = -1;
    private static final String TAG = "AccountChooser";
    private ArrayList<Account> mAccounts;
    private int mCallingUserId;
    private String mDescriptionOverride;
    private boolean mDontShowPicker;
    private Button mOkButton;
    private int mSelectedItemIndex;
    private Set<Account> mSetOfAllowableAccounts;
    private Set<String> mSetOfRelevantAccountTypes;
    private String mSelectedAccountName = null;
    private boolean mSelectedAddNewAccount = false;
    private int mPendingRequest = 0;
    private Parcelable[] mExistingAccounts = null;

    private ArrayList<Account> getAcceptableAccountChoices(VAccountManager vAccountManager) {
        Set<String> set;
        Account[] accounts = vAccountManager.getAccounts(this.mCallingUserId, null);
        ArrayList<Account> arrayList = new ArrayList<>(accounts.length);
        for (Account account : accounts) {
            Set<Account> set2 = this.mSetOfAllowableAccounts;
            if ((set2 == null || set2.contains(account)) && ((set = this.mSetOfRelevantAccountTypes) == null || set.contains(account.type))) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    private Set<Account> getAllowableAccountSet(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("allowableAccounts");
        if (parcelableArrayListExtra != null) {
            HashSet hashSet = new HashSet(parcelableArrayListExtra.size());
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                hashSet.add((Account) ((Parcelable) it.next()));
            }
            return hashSet;
        }
        return null;
    }

    private int getItemIndexToSelect(ArrayList<Account> arrayList, String str, boolean z4) {
        if (z4) {
            return arrayList.size();
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (arrayList.get(i5).name.equals(str)) {
                return i5;
            }
        }
        return -1;
    }

    private String[] getListOfDisplayableOptions(ArrayList<Account> arrayList) {
        String[] strArr = new String[arrayList.size() + 1];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            strArr[i5] = arrayList.get(i5).name;
        }
        strArr[arrayList.size()] = getResources().getString(R.string.add_account_button_label);
        return strArr;
    }

    private Set<String> getReleventAccountTypes(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("allowableAccountTypes");
        AuthenticatorDescription[] authenticatorTypes = VAccountManager.get().getAuthenticatorTypes(this.mCallingUserId);
        HashSet hashSet = new HashSet(authenticatorTypes.length);
        for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
            hashSet.add(authenticatorDescription.type);
        }
        if (stringArrayExtra != null) {
            HashSet hashSet2 = new HashSet();
            Collections.addAll(hashSet2, stringArrayExtra);
            hashSet2.retainAll(hashSet);
            return hashSet2;
        }
        return hashSet;
    }

    private void onAccountSelected(Account account) {
        Log.d(TAG, "selected account " + account);
        setResultAndFinish(account.name, account.type);
    }

    private void overrideDescriptionIfSupplied(String str) {
        TextView textView = (TextView) findViewById(R.id.description);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    private void populateUIAccountList(String[] strArr) {
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, strArr));
        listView.setChoiceMode(1);
        listView.setItemsCanFocus(false);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.lody.virtual.client.stub.ChooseTypeAndAccountActivity.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                ChooseTypeAndAccountActivity.this.mSelectedItemIndex = i5;
                ChooseTypeAndAccountActivity.this.mOkButton.setEnabled(true);
            }
        });
        int i5 = this.mSelectedItemIndex;
        if (i5 != -1) {
            listView.setItemChecked(i5, true);
        }
    }

    private void setNonLabelThemeAndCallSuperCreate(Bundle bundle) {
        setTheme(android.R.style.Theme.Material.Light.Dialog.NoActionBar);
        super.onCreate(bundle);
    }

    private void setResultAndFinish(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        setResult(-1, new Intent().putExtras(bundle));
        VLog.v(TAG, "ChooseTypeAndAccountActivity.setResultAndFinish: selected account " + str + ", " + str2);
        finish();
    }

    private void startChooseAccountTypeActivity() {
        Intent intent = new Intent(this, (Class<?>) ChooseAccountTypeActivity.class);
        intent.setFlags(524288);
        intent.putExtra("allowableAccountTypes", getIntent().getStringArrayExtra("allowableAccountTypes"));
        intent.putExtra("addAccountOptions", getIntent().getBundleExtra("addAccountOptions"));
        intent.putExtra("addAccountRequiredFeatures", getIntent().getStringArrayExtra("addAccountRequiredFeatures"));
        intent.putExtra("authTokenType", getIntent().getStringExtra("authTokenType"));
        intent.putExtra("userId", this.mCallingUserId);
        startActivityForResult(intent, 1);
        this.mPendingRequest = 1;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i5, int i6, Intent intent) {
        String str;
        String str2;
        String stringExtra;
        Bundle bundle;
        if (Log.isLoggable(TAG, 2)) {
            if (intent != null && intent.getExtras() != null) {
                intent.getExtras().keySet();
            }
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            Log.v(TAG, "ChooseTypeAndAccountActivity.onActivityResult(reqCode=" + i5 + ", resCode=" + i6 + ", extras=" + bundle + ")");
        }
        this.mPendingRequest = 0;
        if (i6 == 0) {
            if (this.mAccounts.isEmpty()) {
                setResult(0);
                finish();
                return;
            }
            return;
        }
        if (i6 == -1) {
            if (i5 == 1) {
                if (intent != null && (stringExtra = intent.getStringExtra("accountType")) != null) {
                    runAddAccountForAuthenticator(stringExtra);
                    return;
                }
                Log.d(TAG, "ChooseTypeAndAccountActivity.onActivityResult: unable to find account type, pretending the request was canceled");
            } else if (i5 == 2) {
                if (intent != null) {
                    str = intent.getStringExtra("authAccount");
                    str2 = intent.getStringExtra("accountType");
                } else {
                    str = null;
                    str2 = null;
                }
                if (str == null || str2 == null) {
                    Account[] accounts = VAccountManager.get().getAccounts(this.mCallingUserId, null);
                    HashSet hashSet = new HashSet();
                    for (Parcelable parcelable : this.mExistingAccounts) {
                        hashSet.add((Account) parcelable);
                    }
                    int length = accounts.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        Account account = accounts[i7];
                        if (!hashSet.contains(account)) {
                            str = account.name;
                            str2 = account.type;
                            break;
                        }
                        i7++;
                    }
                }
                if (str != null || str2 != null) {
                    setResultAndFinish(str, str2);
                    return;
                }
            }
            Log.d(TAG, "ChooseTypeAndAccountActivity.onActivityResult: unable to find added account, pretending the request was canceled");
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "ChooseTypeAndAccountActivity.onActivityResult: canceled");
        }
        setResult(0);
        finish();
    }

    public void onCancelButtonClicked(View view) {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        Intent intent = getIntent();
        boolean z4 = false;
        if (bundle != null) {
            this.mPendingRequest = bundle.getInt(KEY_INSTANCE_STATE_PENDING_REQUEST);
            this.mExistingAccounts = bundle.getParcelableArray(KEY_INSTANCE_STATE_EXISTING_ACCOUNTS);
            this.mSelectedAccountName = bundle.getString(KEY_INSTANCE_STATE_SELECTED_ACCOUNT_NAME);
            this.mSelectedAddNewAccount = bundle.getBoolean(KEY_INSTANCE_STATE_SELECTED_ADD_ACCOUNT, false);
            this.mAccounts = bundle.getParcelableArrayList(KEY_INSTANCE_STATE_ACCOUNT_LIST);
            this.mCallingUserId = bundle.getInt("userId");
        } else {
            this.mPendingRequest = 0;
            this.mExistingAccounts = null;
            this.mCallingUserId = intent.getIntExtra("userId", -1);
            Account account = (Account) intent.getParcelableExtra("selectedAccount");
            if (account != null) {
                this.mSelectedAccountName = account.name;
            }
        }
        VLog.v(TAG, "selected account name is " + this.mSelectedAccountName);
        this.mSetOfAllowableAccounts = getAllowableAccountSet(intent);
        this.mSetOfRelevantAccountTypes = getReleventAccountTypes(intent);
        this.mDescriptionOverride = intent.getStringExtra("descriptionTextOverride");
        ArrayList<Account> acceptableAccountChoices = getAcceptableAccountChoices(VAccountManager.get());
        this.mAccounts = acceptableAccountChoices;
        if (this.mDontShowPicker) {
            super.onCreate(bundle);
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        if (this.mPendingRequest == 0 && acceptableAccountChoices.isEmpty()) {
            setNonLabelThemeAndCallSuperCreate(bundle);
            if (this.mSetOfRelevantAccountTypes.size() == 1) {
                runAddAccountForAuthenticator(this.mSetOfRelevantAccountTypes.iterator().next());
            } else {
                startChooseAccountTypeActivity();
            }
        }
        String[] listOfDisplayableOptions = getListOfDisplayableOptions(this.mAccounts);
        this.mSelectedItemIndex = getItemIndexToSelect(this.mAccounts, this.mSelectedAccountName, this.mSelectedAddNewAccount);
        super.onCreate(bundle);
        setContentView(R.layout.choose_type_and_account);
        overrideDescriptionIfSupplied(this.mDescriptionOverride);
        populateUIAccountList(listOfDisplayableOptions);
        Button button = (Button) findViewById(android.R.id.button2);
        this.mOkButton = button;
        if (this.mSelectedItemIndex != -1) {
            z4 = true;
        }
        button.setEnabled(z4);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "ChooseTypeAndAccountActivity.onDestroy()");
        }
        super.onDestroy();
    }

    public void onOkButtonClicked(View view) {
        if (this.mSelectedItemIndex == this.mAccounts.size()) {
            startChooseAccountTypeActivity();
            return;
        }
        int i5 = this.mSelectedItemIndex;
        if (i5 != -1) {
            onAccountSelected(this.mAccounts.get(i5));
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(KEY_INSTANCE_STATE_PENDING_REQUEST, this.mPendingRequest);
        if (this.mPendingRequest == 2) {
            bundle.putParcelableArray(KEY_INSTANCE_STATE_EXISTING_ACCOUNTS, this.mExistingAccounts);
        }
        int i5 = this.mSelectedItemIndex;
        if (i5 != -1) {
            if (i5 == this.mAccounts.size()) {
                bundle.putBoolean(KEY_INSTANCE_STATE_SELECTED_ADD_ACCOUNT, true);
            } else {
                bundle.putBoolean(KEY_INSTANCE_STATE_SELECTED_ADD_ACCOUNT, false);
                bundle.putString(KEY_INSTANCE_STATE_SELECTED_ACCOUNT_NAME, this.mAccounts.get(this.mSelectedItemIndex).name);
            }
        }
        bundle.putParcelableArrayList(KEY_INSTANCE_STATE_ACCOUNT_LIST, this.mAccounts);
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.accounts.AccountManagerCallback
    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        try {
            Intent intent = (Intent) accountManagerFuture.getResult().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (intent != null) {
                this.mPendingRequest = 2;
                this.mExistingAccounts = VAccountManager.get().getAccounts(this.mCallingUserId, null);
                intent.setFlags(intent.getFlags() & (-268435457));
                startActivityForResult(intent, 2);
                return;
            }
        } catch (AuthenticatorException e5) {
            e = e5;
            e.printStackTrace();
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "error communicating with server");
            setResult(-1, new Intent().putExtras(bundle));
            finish();
        } catch (OperationCanceledException unused) {
            setResult(0);
            finish();
            return;
        } catch (IOException e6) {
            e = e6;
            e.printStackTrace();
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "error communicating with server");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
        }
        Bundle bundle22 = new Bundle();
        bundle22.putString("errorMessage", "error communicating with server");
        setResult(-1, new Intent().putExtras(bundle22));
        finish();
    }

    protected void runAddAccountForAuthenticator(String str) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "runAddAccountForAuthenticator: " + str);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("addAccountOptions");
        VAccountManager.get().addAccount(this.mCallingUserId, str, getIntent().getStringExtra("authTokenType"), getIntent().getStringArrayExtra("addAccountRequiredFeatures"), bundleExtra, null, this, null);
    }
}
