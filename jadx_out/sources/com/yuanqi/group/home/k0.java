package com.yuanqi.group.home;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.stub.ExtLaunchAppActivity;
import com.lody.virtual.client.stub.RequestExternalStorageManagerActivity;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.open.MultiAppHelper;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.umeng.analytics.pro.bi;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.DialogClearCacheBinding;
import com.yuanqi.group.home.models.AppInfoLite;
import com.yuanqi.group.home.r;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.manager.ManagerActivity;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.q0;
import com.yuanqi.master.tools.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jonathanfinerty.once.Once;
import kotlin.e1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@kotlin.i0(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020'H\u0017J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0016\u0010+\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0-H\u0016J\u0012\u0010.\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0014\u0010/\u001a\u0004\u0018\u00010\b2\b\u00100\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203J\u0018\u00104\u001a\u00020\u001d2\u0006\u00102\u001a\u0002032\u0006\u00100\u001a\u00020\bH\u0002J \u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002032\u0006\u00100\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0017J\u0010\u00107\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\bH\u0002J\b\u00108\u001a\u00020\u001dH\u0016J\u0016\u00109\u001a\u00020\u001d2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020*0;H\u0016J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020?H\u0016JV\u0010A\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020*2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020'2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001d0IH\u0016J\b\u0010K\u001a\u00020\u001dH\u0016J\u0016\u0010L\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u0010M\u001a\u00020NR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/yuanqi/group/home/HomePresenterImpl;", "Lcom/yuanqi/group/home/HomeContract$HomePresenter;", "mView", "Lcom/yuanqi/group/home/HomeContract$HomeView;", "homeViewModel", "Lcom/yuanqi/group/home/HomeViewModel;", "(Lcom/yuanqi/group/home/HomeContract$HomeView;Lcom/yuanqi/group/home/HomeViewModel;)V", "<set-?>", "", "appNameList", "getAppNameList", "()Ljava/lang/String;", "setAppNameList", "(Ljava/lang/String;)V", "appNameList$delegate", "Lcom/yuanqi/master/tools/MVFast;", "getHomeViewModel", "()Lcom/yuanqi/group/home/HomeViewModel;", "mActivity", "Landroid/app/Activity;", "mRepo", "Lcom/yuanqi/group/home/repo/AppRepository;", "packageNameList", "getPackageNameList", "setPackageNameList", "packageNameList$delegate", "popupMenu", "Landroid/widget/PopupWindow;", "addApp", "", "info", "Lcom/yuanqi/group/home/models/AppInfoLite;", "calculatePopWindowPos", "", "anchorView", "Landroid/view/View;", "contentView", "activity", "checkExtPackageBootPermission", "", "deleteApp", "data", "Lcom/yuanqi/group/home/models/AppData;", "deleteAppList", "dataList", "", "enterAppSetting", "getLabel", TTDownloadField.TT_PACKAGE_NAME, "installHonor", "userId", "", "launchApp", "launchAppBefore", "name", "quickClone", "requestVirtualApp", "saveConfig", "list", "", "showAddingDialog", "Landroid/app/Dialog;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "showInstall32BitExt", "showPopupMenu", "position", "view", "model", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "isFirst", "shouldLogin", "Lkotlin/Function0;", "shouldVip", "start", "updateBaseContextLocale", "locale", "Ljava/util/Locale;", "AddResult", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nHomePresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePresenterImpl.kt\ncom/yuanqi/group/home/HomePresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,673:1\n1549#2:674\n1620#2,3:675\n1#3:678\n*S KotlinDebug\n*F\n+ 1 HomePresenterImpl.kt\ncom/yuanqi/group/home/HomePresenterImpl\n*L\n442#1:674\n442#1:675,3\n*E\n"})
/* loaded from: classes3.dex */
public final class k0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final r.b f13990a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final HomeViewModel f13991b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final Activity f13992c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final t2.f f13993d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final x0 f13994e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final x0 f13995f;

    /* renamed from: g, reason: collision with root package name */
    @p4.m
    private PopupWindow f13996g;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f13989i = {l1.k(new kotlin.jvm.internal.x0(k0.class, "appNameList", "getAppNameList()Ljava/lang/String;", 0)), l1.k(new kotlin.jvm.internal.x0(k0.class, "packageNameList", "getPackageNameList()Ljava/lang/String;", 0))};

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    public static final b f13988h = new b(null);

    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/group/home/HomePresenterImpl$AddResult;", "", "(Lcom/yuanqi/group/home/HomePresenterImpl;)V", "appData", "Lcom/yuanqi/group/home/models/PackageAppData;", "getAppData", "()Lcom/yuanqi/group/home/models/PackageAppData;", "setAppData", "(Lcom/yuanqi/group/home/models/PackageAppData;)V", "userId", "", "getUserId", "()I", "setUserId", "(I)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        private com.yuanqi.group.home.models.i f13997a;

        /* renamed from: b, reason: collision with root package name */
        private int f13998b;

        public a() {
        }

        @p4.m
        public final com.yuanqi.group.home.models.i a() {
            return this.f13997a;
        }

        public final int b() {
            return this.f13998b;
        }

        public final void c(@p4.m com.yuanqi.group.home.models.i iVar) {
            this.f13997a = iVar;
        }

        public final void d(int i5) {
            this.f13998b = i5;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/group/home/HomePresenterImpl$Companion;", "", "()V", "checkStorageManagerPermissin", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean a(@p4.l Context context) {
            boolean isExternalStorageManager;
            kotlin.jvm.internal.l0.p(context, "context");
            if (Build.VERSION.SDK_INT < 30) {
                return true;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                return true;
            }
            Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomePresenterImpl$launchApp$1", f = "HomePresenterImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ int $userId;
        int label;
        final /* synthetic */ k0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, k0 k0Var, int i5, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$packageName = str;
            this.this$0 = k0Var;
            this.$userId = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new c(this.$packageName, this.this$0, this.$userId, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (VirtualCore.get().isRunInExtProcess(this.$packageName)) {
                    if (!VirtualCore.get().isExtPackageInstalled()) {
                        String string = this.this$0.f13992c.getString(R.string.ext_package_mgs);
                        kotlin.jvm.internal.l0.o(string, "getString(...)");
                        f1.r(string, 0, 2, null);
                        return r2.f19517a;
                    }
                    if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                        String string2 = this.this$0.f13992c.getString(R.string.permission_boot_content);
                        kotlin.jvm.internal.l0.o(string2, "getString(...)");
                        f1.r(string2, 0, 2, null);
                        return r2.f19517a;
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(StubManifest.EXT_PACKAGE_NAME, ExtLaunchAppActivity.class.getName()));
                    intent.addFlags(268435456);
                    intent.putExtra("_VA_|_userid_", this.$userId);
                    intent.putExtra("_VA_|_package_", this.$packageName);
                    this.this$0.f13992c.startActivity(intent);
                } else {
                    VActivityManager.get().launchApp(this.$userId, this.$packageName);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/config/SortApp;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.n0 implements v3.l<com.yuanqi.master.config.e, CharSequence> {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final CharSequence invoke(@p4.l com.yuanqi.master.config.e it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return it.a();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/config/SortApp;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.n0 implements v3.l<com.yuanqi.master.config.e, CharSequence> {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final CharSequence invoke(@p4.l com.yuanqi.master.config.e it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return it.c();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/yuanqi/group/home/HomePresenterImpl$showAddingDialog$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dialog f14000a;

        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomePresenterImpl$showAddingDialog$1$onAnimationEnd$1", f = "HomePresenterImpl.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Dialog $dialog;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Dialog dialog, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$dialog = dialog;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.$dialog, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    this.label = 1;
                    if (d1.b(1000L, this) == l5) {
                        return l5;
                    }
                }
                this.$dialog.dismiss();
                return r2.f19517a;
            }
        }

        f(Dialog dialog) {
            this.f14000a = dialog;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
            kotlinx.coroutines.k.f(t0.a(k1.c()), null, null, new a(this.f14000a, null), 3, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        g() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k0.this.f13992c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.yuanqi.master.config.c.f14548r)));
        }
    }

    public k0(@p4.l r.b mView, @p4.l HomeViewModel homeViewModel) {
        kotlin.jvm.internal.l0.p(mView, "mView");
        kotlin.jvm.internal.l0.p(homeViewModel, "homeViewModel");
        this.f13990a = mView;
        this.f13991b = homeViewModel;
        this.f13994e = new x0(com.yuanqi.master.config.c.A, "");
        this.f13995f = new x0(com.yuanqi.master.config.c.B, "");
        Activity r5 = mView.r();
        kotlin.jvm.internal.l0.o(r5, "getActivity(...)");
        this.f13992c = r5;
        this.f13993d = new t2.f(r5);
        mView.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Dialog dialog, k0 this$0, AppInfoLite appInfoLite, Throwable e5) {
        kotlin.jvm.internal.l0.p(dialog, "$dialog");
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(e5, "e");
        e5.printStackTrace();
        dialog.dismiss();
        if (e5.getMessage() != null) {
            Toast.makeText(this$0.f13992c, e5.getMessage(), 0).show();
        }
        q0 a5 = q0.f15237a.a();
        Activity activity = this$0.f13992c;
        String label = appInfoLite.f14005c;
        kotlin.jvm.internal.l0.o(label, "label");
        a5.h(activity, label, appInfoLite.f14009g, appInfoLite.f14006d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(k0 this$0, Dialog dialog, Void r22) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(dialog, "$dialog");
        this$0.h();
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(AppInfoLite appInfoLite, k0 this$0) {
        boolean z4;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.m(appInfoLite);
        int i5 = appInfoLite.f14009g;
        for (int i6 = 0; i6 < i5; i6++) {
            a aVar = new a();
            InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(appInfoLite.f14003a, 0);
            if (installedAppInfo != null) {
                aVar.d(MultiAppHelper.installExistedPackage(installedAppInfo));
                Log.d(com.yuanqi.master.config.c.f14519a, installedAppInfo.toString());
            } else {
                VAppInstallerResult d5 = this$0.f13993d.d(appInfoLite);
                if (d5.status == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalStateException(("error code: " + d5.status).toString());
                }
            }
            aVar.c(t2.i.d().e(appInfoLite.f14003a));
            if (com.yuanqi.master.tools.e.f15100a.h()) {
                this$0.Q(aVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Void r02) {
    }

    private final int[] I(View view, View view2, Activity activity) {
        boolean z4;
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.heightPixels;
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        view2.getMeasuredWidth();
        int i6 = iArr2[1];
        if ((i5 - i6) - height < height) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            iArr[0] = iArr2[0];
            iArr[1] = (i6 - measuredHeight) - 10;
        } else {
            iArr[0] = iArr2[0];
            iArr[1] = i6 + height + 10;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(k0 this$0, com.yuanqi.group.home.models.b bVar) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.f13993d.c(bVar.getPackageName(), bVar.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(k0 this$0, com.yuanqi.group.home.models.b bVar, Void r42) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.f13991b.s(bVar);
        this$0.f13990a.m();
        q0 a5 = q0.f15237a.a();
        Activity activity = this$0.f13992c;
        String name = bVar.getName();
        kotlin.jvm.internal.l0.o(name, "getName(...)");
        a5.f(activity, name, String.valueOf(bVar.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(List dataList, k0 this$0) {
        kotlin.jvm.internal.l0.p(dataList, "$dataList");
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        Iterator it = dataList.iterator();
        while (it.hasNext()) {
            com.yuanqi.group.home.models.b bVar = (com.yuanqi.group.home.models.b) it.next();
            this$0.f13993d.c(bVar.getPackageName(), bVar.getUserId());
            this$0.f13991b.s(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(List dataList, k0 this$0, Void r42) {
        kotlin.jvm.internal.l0.p(dataList, "$dataList");
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        Iterator it = dataList.iterator();
        while (it.hasNext()) {
            this$0.f13990a.h((com.yuanqi.group.home.models.b) it.next());
        }
        this$0.f13990a.k();
        this$0.f13990a.m();
        q0.f15237a.a().m(this$0.f13992c, dataList);
    }

    private final String N() {
        return (String) this.f13994e.getValue(this, f13989i[0]);
    }

    private final String P() {
        return (String) this.f13995f.getValue(this, f13989i[1]);
    }

    private final void R(int i5, String str) {
        kotlinx.coroutines.k.f(this.f13991b.G(), k1.e(), null, new c(str, this, i5, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(boolean z4, DialogInterface dialogInterface, int i5) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), z4);
    }

    private final void T(final String str) {
        final a aVar = new a();
        final ProgressDialog show = ProgressDialog.show(this.f13992c, null, g0(new ContextThemeWrapper(this.f13992c, R.style.MyPopupTheme), com.yuanqi.master.config.a.f14505g.a().e()).getString(R.string.tip_add_apps));
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.group.home.e0
            @Override // java.lang.Runnable
            public final void run() {
                k0.U(str, aVar);
            }
        }).a(new org.jdeferred.g() { // from class: com.yuanqi.group.home.f0
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.V(k0.this, str, (Void) obj);
            }
        }).p(new org.jdeferred.j() { // from class: com.yuanqi.group.home.g0
            @Override // org.jdeferred.j
            public final void onFail(Object obj) {
                k0.W(show, this, (Throwable) obj);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.group.home.h0
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.X(k0.this, show, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(String packageName, a addResult) {
        kotlin.jvm.internal.l0.p(packageName, "$packageName");
        kotlin.jvm.internal.l0.p(addResult, "$addResult");
        InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(packageName, 0);
        if (installedAppInfo != null) {
            addResult.d(MultiAppHelper.installExistedPackage(installedAppInfo));
            addResult.c(t2.i.d().e(packageName));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(k0 this$0, String packageName, Void r22) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(packageName, "$packageName");
        q0.f15237a.a().p(this$0.f13992c, packageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(ProgressDialog progressDialog, k0 this$0, Throwable e5) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(e5, "e");
        e5.printStackTrace();
        progressDialog.dismiss();
        if (e5.getMessage() != null) {
            Toast.makeText(this$0.f13992c, e5.getMessage(), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(k0 this$0, ProgressDialog progressDialog, Void r22) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.h();
        progressDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(k0 this$0, List appModels) {
        List<com.yuanqi.group.home.models.b> V5;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(appModels, "appModels");
        r.b bVar = this$0.f13990a;
        V5 = kotlin.collections.e0.V5(appModels);
        bVar.d(V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(k0 this$0, Throwable th) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        r.b bVar = this$0.f13990a;
        kotlin.jvm.internal.l0.m(th);
        bVar.p(th);
    }

    private final void a0(String str) {
        this.f13994e.setValue(this, f13989i[0], str);
    }

    private final void b0(String str) {
        this.f13995f.setValue(this, f13989i[1], str);
    }

    private final Dialog c0(Context context) {
        DialogClearCacheBinding inflate = DialogClearCacheBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        inflate.animationView.setAnimation(R.raw.adding);
        Dialog dialog = new Dialog(context, R.style.MyDialogTheme2);
        dialog.setContentView(inflate.getRoot());
        inflate.animationView.i(new f(dialog));
        dialog.show();
        return dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(k0 this$0, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        PopupWindow popupWindow = this$0.f13996g;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(View view, View backgroundView, k0 this$0) {
        kotlin.jvm.internal.l0.p(view, "$view");
        kotlin.jvm.internal.l0.p(backgroundView, "$backgroundView");
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        View rootView = view.getRootView();
        kotlin.jvm.internal.l0.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) rootView).removeView(backgroundView);
        view.findViewById(R.id.linear).setBackgroundResource(R.drawable.item_launcher_bg);
        this$0.f13996g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Activity activity, k0 this$0, v3.a shouldLogin, v3.a shouldVip, com.yuanqi.group.home.models.b model, int i5, boolean z4, v2.b bVar, View view) {
        kotlin.jvm.internal.l0.p(activity, "$activity");
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(shouldLogin, "$shouldLogin");
        kotlin.jvm.internal.l0.p(shouldVip, "$shouldVip");
        kotlin.jvm.internal.l0.p(model, "$model");
        switch (view.getId()) {
            case R.id.menu_delete /* 2131296781 */:
                this$0.f13991b.A().postValue(Boolean.TRUE);
                break;
            case R.id.menu_manager /* 2131296784 */:
                Intent intent = new Intent(activity, (Class<?>) ManagerActivity.class);
                intent.putExtra("screen", com.yuanqi.master.manager.i.f14757b);
                intent.putExtra("index", i5);
                intent.putExtra(bi.f12269o, model.getPackageName());
                intent.putExtra("user_id", model.getUserId());
                intent.putExtra("app_name", model.getName());
                intent.putExtra("is_first", z4);
                if (bVar != null) {
                    intent.putExtra("app_note", bVar);
                }
                activity.startActivity(intent);
                break;
            case R.id.menu_qick_clone /* 2131296787 */:
                com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
                if (!aVar.c()) {
                    shouldLogin.invoke();
                    return;
                } else {
                    if (!aVar.k()) {
                        shouldVip.invoke();
                        return;
                    }
                    String packageName = model.getPackageName();
                    kotlin.jvm.internal.l0.o(packageName, "getPackageName(...)");
                    this$0.T(packageName);
                    break;
                }
            case R.id.menu_sort /* 2131296791 */:
                Intent intent2 = new Intent(activity, (Class<?>) AddAppActivity.class);
                intent2.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14527e);
                activity.startActivityForResult(intent2, 7);
                q0.f15237a.a().w(this$0.f13992c);
                break;
        }
        PopupWindow popupWindow = this$0.f13996g;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @p4.l
    public final HomeViewModel O() {
        return this.f13991b;
    }

    public final void Q(int i5) {
        Object Rb;
        VirtualCore virtualCore = VirtualCore.get();
        Rb = kotlin.collections.p.Rb(com.yuanqi.master.config.c.c());
        if (virtualCore.isAppInstalled((String) Rb)) {
            return;
        }
        int i6 = 0;
        if (i5 == 0) {
            VAppInstallerParams vAppInstallerParams = new VAppInstallerParams(2);
            String[] c5 = com.yuanqi.master.config.c.c();
            int length = c5.length;
            while (i6 < length) {
                virtualCore.installPackage(Uri.parse("package:" + c5[i6]), vAppInstallerParams);
                i6++;
            }
            return;
        }
        String[] c6 = com.yuanqi.master.config.c.c();
        int length2 = c6.length;
        while (i6 < length2) {
            virtualCore.installPackageAsUser(i5, c6[i6]);
            i6++;
        }
        virtualCore.installPackageAsUser(i5, GmsSupport.GSF_PKG);
        virtualCore.installPackageAsUser(i5, GmsSupport.VENDING_PKG);
    }

    @Override // com.yuanqi.group.home.r.a
    @p4.m
    public String a(@p4.m String str) {
        return this.f13993d.a(str);
    }

    @Override // com.yuanqi.group.home.r.a
    public void b(@p4.m final com.yuanqi.group.home.models.b bVar) {
        r.b bVar2 = this.f13990a;
        kotlin.jvm.internal.l0.m(bVar);
        bVar2.h(bVar);
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.group.home.w
            @Override // java.lang.Runnable
            public final void run() {
                k0.J(k0.this, bVar);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.group.home.x
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.K(k0.this, bVar, (Void) obj);
            }
        });
    }

    @Override // com.yuanqi.group.home.r.a
    public void c(@p4.m final AppInfoLite appInfoLite) {
        kotlin.jvm.internal.l0.m(appInfoLite);
        Log.d(com.yuanqi.master.config.c.f14519a, appInfoLite.toString());
        new ArrayList();
        final Dialog c02 = c0(this.f13992c);
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.group.home.s
            @Override // java.lang.Runnable
            public final void run() {
                k0.G(AppInfoLite.this, this);
            }
        }).a(new org.jdeferred.g() { // from class: com.yuanqi.group.home.b0
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.H((Void) obj);
            }
        }).p(new org.jdeferred.j() { // from class: com.yuanqi.group.home.c0
            @Override // org.jdeferred.j
            public final void onFail(Object obj) {
                k0.E(c02, this, appInfoLite, (Throwable) obj);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.group.home.d0
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.F(k0.this, c02, (Void) obj);
            }
        });
    }

    @Override // com.yuanqi.group.home.r.a
    public void d(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        Activity activity = this.f13992c;
        String string = context.getString(R.string.tip);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        String string2 = context.getString(R.string.need_ext);
        kotlin.jvm.internal.l0.o(string2, "getString(...)");
        String string3 = context.getString(R.string.cancel_msg);
        kotlin.jvm.internal.l0.o(string3, "getString(...)");
        String string4 = context.getString(R.string.go_download);
        kotlin.jvm.internal.l0.o(string4, "getString(...)");
        com.yuanqi.master.tools.o0.Y(o0Var, activity, string, string2, string3, string4, false, false, false, false, null, null, null, new g(), 4064, null);
    }

    @Override // com.yuanqi.group.home.r.a
    public void e(@p4.l final List<? extends com.yuanqi.group.home.models.b> dataList) {
        kotlin.jvm.internal.l0.p(dataList, "dataList");
        this.f13990a.l();
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.group.home.i0
            @Override // java.lang.Runnable
            public final void run() {
                k0.L(dataList, this);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.group.home.j0
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.M(dataList, this, (Void) obj);
            }
        });
    }

    @Override // com.yuanqi.group.home.r.a
    @RequiresApi(30)
    public boolean f() {
        if (VirtualCore.get().isExtPackageInstalled()) {
            if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                this.f13990a.n();
                return true;
            }
            if (BuildCompat.isQ() && !Settings.canDrawOverlays(this.f13992c)) {
                this.f13990a.c();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(this.f13992c, "android.permission.POST_NOTIFICATIONS") != 0) {
            ActivityCompat.requestPermissions(this.f13992c, new String[]{"android.permission.POST_NOTIFICATIONS"}, 0);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r11.f13992c) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r11.f13992c) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (r5 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x018a, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r11.f13992c) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r11.f13992c) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x018c, code lost:
    
        com.yuanqi.master.tools.q0.f15237a.a().j(r11.f13992c, r14, java.lang.String.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r11.f13992c) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x01ab, code lost:
    
        r11.f13990a.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x01b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x019c, code lost:
    
        com.yuanqi.master.tools.q0.f15237a.a().k(r11.f13992c, r14, java.lang.String.valueOf(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #2 {all -> 0x0143, blocks: (B:11:0x0012, B:13:0x0021, B:20:0x0061, B:22:0x0067, B:25:0x0083, B:51:0x0099, B:52:0x00b2, B:27:0x00c4, B:31:0x00ce, B:34:0x00d8, B:36:0x00e6, B:40:0x00e0, B:42:0x011c, B:44:0x0122, B:46:0x0132, B:48:0x013f, B:58:0x00af), top: B:10:0x0012, inners: #1 }] */
    @Override // com.yuanqi.group.home.r.a
    @androidx.annotation.RequiresApi(api = 30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r12, @p4.l java.lang.String r13, @p4.l java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.group.home.k0.g(int, java.lang.String, java.lang.String):void");
    }

    @p4.l
    public final Context g0(@p4.l Context context, @p4.l Locale locale) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(locale, "locale");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.l0.o(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @Override // com.yuanqi.group.home.r.a
    public void h() {
        this.f13990a.l();
        this.f13993d.f().d(new org.jdeferred.g() { // from class: com.yuanqi.group.home.y
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                k0.Y(k0.this, (List) obj);
            }
        }).p(new org.jdeferred.j() { // from class: com.yuanqi.group.home.z
            @Override // org.jdeferred.j
            public final void onFail(Object obj) {
                k0.Z(k0.this, (Throwable) obj);
            }
        });
    }

    @Override // com.yuanqi.group.home.r.a
    public void i(@p4.m com.yuanqi.group.home.models.b bVar) {
        Activity activity = this.f13992c;
        kotlin.jvm.internal.l0.m(bVar);
        AppSettingActivity.J(activity, bVar.getPackageName(), bVar.getUserId());
    }

    @Override // com.yuanqi.group.home.r.a
    public void j(@p4.l List<com.yuanqi.group.home.models.b> list) {
        String j32;
        String j33;
        int Y;
        kotlin.jvm.internal.l0.p(list, "list");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            com.yuanqi.group.home.models.b bVar = list.get(i5);
            Y = kotlin.collections.x.Y(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(Y);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.yuanqi.master.config.e) it.next()).c());
            }
            if (!arrayList2.contains(bVar.getPackageName())) {
                com.yuanqi.master.config.e eVar = new com.yuanqi.master.config.e();
                String name = bVar.getName();
                kotlin.jvm.internal.l0.o(name, "getName(...)");
                eVar.e(name);
                eVar.h(arrayList.size());
                String packageName = bVar.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "getPackageName(...)");
                eVar.g(packageName);
                arrayList.add(eVar);
            }
        }
        j32 = kotlin.collections.e0.j3(arrayList, ",", null, null, 0, null, d.INSTANCE, 30, null);
        a0(j32);
        j33 = kotlin.collections.e0.j3(arrayList, ",", null, null, 0, null, e.INSTANCE, 30, null);
        b0(j33);
        com.yuanqi.master.config.a.f14505g.a().i();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    @Override // com.yuanqi.group.home.r.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(@p4.l final android.app.Activity r17, final int r18, @p4.l final android.view.View r19, @p4.l final com.yuanqi.group.home.models.b r20, @p4.m final v2.b r21, final boolean r22, @p4.l final v3.a<kotlin.r2> r23, @p4.l final v3.a<kotlin.r2> r24) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.group.home.k0.k(android.app.Activity, int, android.view.View, com.yuanqi.group.home.models.b, v2.b, boolean, v3.a, v3.a):void");
    }

    @Override // q2.a
    public void start() {
        if (!Once.beenDone(com.yuanqi.group.c.f13748b)) {
            this.f13990a.f();
            Once.markDone(com.yuanqi.group.c.f13748b);
        }
    }
}
