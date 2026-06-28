package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@a
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\b\u0010\u0018\"\u0004\b\u001d\u0010\u001aR+\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u000e\u0010\u0018\"\u0004\b \u0010\u001aR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b\u001f\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00148V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/google/accompanist/permissions/e;", "Lcom/google/accompanist/permissions/f;", "Lkotlin/r2;", "i", "c", bi.aJ, "()V", "", bi.ay, "Ljava/lang/String;", "d", "()Ljava/lang/String;", "permission", "Landroid/content/Context;", "b", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "", "<set-?>", "Landroidx/compose/runtime/MutableState;", socket.g.f22386a, "()Z", "n", "(Z)V", "_hasPermission", "e", "m", "shouldShowRationale", "f", "l", "permissionRequested", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "()Landroidx/activity/result/ActivityResultLauncher;", "k", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", t0.b.f22420d, "j", "hasPermission", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V", "permissions_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String f7115a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final Context f7116b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final Activity f7117c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final MutableState f7118d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final MutableState f7119e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final MutableState f7120f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private ActivityResultLauncher<String> f7121g;

    public e(@l String permission, @l Context context, @l Activity activity) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        l0.p(permission, "permission");
        l0.p(context, "context");
        l0.p(activity, "activity");
        this.f7115a = permission;
        this.f7116b = context;
        this.f7117c = activity;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(PermissionsUtilKt.g(context, d())), null, 2, null);
        this.f7118d = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(PermissionsUtilKt.i(activity, d())), null, 2, null);
        this.f7119e = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f7120f = mutableStateOf$default3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.f7118d.getValue()).booleanValue();
    }

    private final void i() {
        m(PermissionsUtilKt.i(this.f7117c, d()));
    }

    private void m(boolean z4) {
        this.f7119e.setValue(Boolean.valueOf(z4));
    }

    private final void n(boolean z4) {
        this.f7118d.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.f
    public boolean a() {
        return ((Boolean) this.f7119e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.f
    public boolean b() {
        return ((Boolean) this.f7120f.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.permissions.f
    public void c() {
        r2 r2Var;
        ActivityResultLauncher<String> activityResultLauncher = this.f7121g;
        if (activityResultLauncher == null) {
            r2Var = null;
        } else {
            activityResultLauncher.launch(d());
            r2Var = r2.f19517a;
        }
        if (r2Var != null) {
        } else {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // com.google.accompanist.permissions.f
    @l
    public String d() {
        return this.f7115a;
    }

    @Override // com.google.accompanist.permissions.f
    public boolean e() {
        return g();
    }

    @m
    public final ActivityResultLauncher<String> f() {
        return this.f7121g;
    }

    public final void h() {
        j(PermissionsUtilKt.g(this.f7116b, d()));
    }

    public void j(boolean z4) {
        n(z4);
        i();
    }

    public final void k(@m ActivityResultLauncher<String> activityResultLauncher) {
        this.f7121g = activityResultLauncher;
    }

    public void l(boolean z4) {
        this.f7120f.setValue(Boolean.valueOf(z4));
    }
}
