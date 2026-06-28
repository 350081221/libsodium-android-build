package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "I", "O", "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "Lkotlin/r2;", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 this$0, int i5, ActivityResultContract.SynchronousResult synchronousResult) {
        l0.p(this$0, "this$0");
        this$0.dispatchResult(i5, synchronousResult.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 this$0, int i5, IntentSender.SendIntentException e5) {
        l0.p(this$0, "this$0");
        l0.p(e5, "$e");
        this$0.dispatchResult(i5, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, e5));
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(final int i5, @p4.l ActivityResultContract<I, O> contract, I i6, @p4.m ActivityOptionsCompat activityOptionsCompat) {
        Bundle bundle;
        Bundle bundle2;
        l0.p(contract, "contract");
        ComponentActivity componentActivity = this.this$0;
        final ActivityResultContract.SynchronousResult<O> synchronousResult = contract.getSynchronousResult(componentActivity, i6);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1.this, i5, synchronousResult);
                }
            });
            return;
        }
        Intent createIntent = contract.createIntent(componentActivity, i6);
        if (createIntent.getExtras() != null) {
            Bundle extras = createIntent.getExtras();
            l0.m(extras);
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (createIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            Bundle bundleExtra = createIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            createIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            bundle2 = bundleExtra;
        } else {
            if (activityOptionsCompat != null) {
                bundle = activityOptionsCompat.toBundle();
            } else {
                bundle = null;
            }
            bundle2 = bundle;
        }
        if (l0.g(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, createIntent.getAction())) {
            String[] stringArrayExtra = createIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i5);
            return;
        }
        if (l0.g(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, createIntent.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
            try {
                l0.m(intentSenderRequest);
                ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i5, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1.this, i5, e5);
                    }
                });
                return;
            }
        }
        ActivityCompat.startActivityForResult(componentActivity, createIntent, i5, bundle2);
    }
}
