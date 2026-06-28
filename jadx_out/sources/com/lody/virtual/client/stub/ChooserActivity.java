package com.lody.virtual.client.stub;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.R;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VUserHandle;

@Instrumented
/* loaded from: classes3.dex */
public class ChooserActivity extends ResolverActivity {
    public static final String ACTION = Intent.createChooser(new Intent(), "").getAction();
    public static final String EXTRA_DATA = "android.intent.extra.virtual.data";
    public static final String EXTRA_INTENT = "android.intent.extra.virtual.intent";
    public static final String EXTRA_REQUEST_CODE = "android.intent.extra.virtual.request_code";
    public static final String EXTRA_RESULTTO = "_va|ibinder|resultTo";
    public static final String EXTRA_WHO = "android.intent.extra.virtual.who";

    public static boolean check(Intent intent) {
        try {
            if (!TextUtils.equals(ACTION, intent.getAction())) {
                if (!TextUtils.equals("android.intent.action.CHOOSER", intent.getAction())) {
                    return false;
                }
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.lody.virtual.client.stub.ResolverActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    protected void onCreate(Bundle bundle) {
        Intent[] intentArr;
        TraceManager.startActivityTrace(getClass().getName());
        Bundle extras = getIntent().getExtras();
        Intent intent = getIntent();
        int i5 = extras.getInt(Constants.EXTRA_USER_HANDLE, VUserHandle.getCallingUserId());
        this.mOptions = (Bundle) extras.getParcelable(EXTRA_DATA);
        this.mResultWho = extras.getString(EXTRA_WHO);
        this.mRequestCode = extras.getInt(EXTRA_REQUEST_CODE, 0);
        this.mResultTo = BundleCompat.getBinder(extras, EXTRA_RESULTTO);
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        if (!(parcelableExtra instanceof Intent)) {
            VLog.w("ChooseActivity", "Target is not an intent: %s", parcelableExtra);
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TITLE");
        if (charSequenceExtra == null) {
            charSequenceExtra = getString(R.string.choose);
        }
        CharSequence charSequence = charSequenceExtra;
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
        if (parcelableArrayExtra != null) {
            Intent[] intentArr2 = new Intent[parcelableArrayExtra.length];
            for (int i6 = 0; i6 < parcelableArrayExtra.length; i6++) {
                Parcelable parcelable = parcelableArrayExtra[i6];
                if (!(parcelable instanceof Intent)) {
                    VLog.w("ChooseActivity", "Initial intent #" + i6 + " not an Intent: %s", parcelableArrayExtra[i6]);
                    finish();
                    AppInstrumentation.onActivityCreateEnd();
                    return;
                }
                intentArr2[i6] = (Intent) parcelable;
            }
            intentArr = intentArr2;
        } else {
            intentArr = null;
        }
        super.onCreate(bundle, intent2, charSequence, intentArr, null, false, i5);
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.stub.ResolverActivity, android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.stub.ResolverActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.stub.ResolverActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
