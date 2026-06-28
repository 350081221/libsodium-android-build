package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class PackageManagerCompat {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @RequiresApi(30)
    /* loaded from: classes2.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            boolean isAutoRevokeWhitelisted;
            isAutoRevokeWhitelisted = context.getPackageManager().isAutoRevokeWhitelisted();
            return !isAutoRevokeWhitelisted;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i5 < 30) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPermissionRevocationVerifierApp(packageManager) != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4) {
            return true;
        }
        if (z5 && z6) {
            return true;
        }
        return false;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static n1.a<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture<Integer> create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return create;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        if (i5 < 30) {
            create.set(0);
            Log.e(LOG_TAG, "Target SDK version below API 30");
            return create;
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = 4;
        if (i6 >= 31) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                if (i5 >= 31) {
                    i7 = 5;
                }
                create.set(Integer.valueOf(i7));
            } else {
                create.set(2);
            }
            return create;
        }
        if (i6 == 30) {
            if (!Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                i7 = 2;
            }
            create.set(Integer.valueOf(i7));
            return create;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        create.addListener(new Runnable() { // from class: androidx.core.content.f0
            @Override // java.lang.Runnable
            public final void run() {
                UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
        return create;
    }
}
