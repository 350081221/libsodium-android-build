package com.yuanqi.master.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/tools/PermissionTools;", "", "()V", "goPermissionPage", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "activityResultLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a1 f15052a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15053b = 0;

    private a1() {
    }

    public final void a(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        e eVar = e.f15100a;
        if (eVar.j()) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", context.getPackageName());
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
            context.startActivity(intent);
            return;
        }
        if (eVar.i()) {
            Intent intent2 = new Intent();
            intent2.setFlags(268435456);
            intent2.putExtra(TTDownloadField.TT_PACKAGE_NAME, context.getPackageName());
            intent2.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            context.startActivity(intent2);
            return;
        }
        Intent intent3 = new Intent();
        intent3.addFlags(268435456);
        intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent3.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent3);
    }

    public final void b(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> activityResultLauncher) {
        Intent intent;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(activityResultLauncher, "activityResultLauncher");
        e eVar = e.f15100a;
        if (eVar.j()) {
            intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", context.getPackageName());
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        } else if (eVar.i()) {
            intent = new Intent();
            intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, context.getPackageName());
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        } else {
            intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        }
        activityResultLauncher.launch(intent);
    }
}
