package com.yuanqi.master.addapp;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.RequestExternalStorageManagerActivity;
import com.orhanobut.logger.j;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.w0;
import com.yuanqi.master.tools.x0;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.reflect.o;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@Instrumented
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J+\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140'2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u001aH\u0015J\b\u0010,\u001a\u00020\u001aH\u0014J\b\u0010-\u001a\u00020\u001aH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lcom/yuanqi/master/addapp/AddAppActivity;", "Landroidx/activity/ComponentActivity;", "()V", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "getAddAppViewModel", "()Lcom/yuanqi/master/addapp/AddAppViewModel;", "addAppViewModel$delegate", "Lkotlin/Lazy;", "requestSDPressCode", "", "<set-?>", "showPermissionKey", "getShowPermissionKey", "()I", "setShowPermissionKey", "(I)V", "showPermissionKey$delegate", "Lcom/yuanqi/master/tools/MVFast;", com.yuanqi.master.config.c.f14521b, "", "getStartScreen", "()Ljava/lang/String;", "setStartScreen", "(Ljava/lang/String;)V", "checkQueryAppPressmion", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "showPermissionDialog", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAddAppActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddAppActivity.kt\ncom/yuanqi/master/addapp/AddAppActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,216:1\n75#2,13:217\n*S KotlinDebug\n*F\n+ 1 AddAppActivity.kt\ncom/yuanqi/master/addapp/AddAppActivity\n*L\n51#1:217,13\n*E\n"})
/* loaded from: classes3.dex */
public final class AddAppActivity extends ComponentActivity {

    /* renamed from: h, reason: collision with root package name */
    @m
    private static AddAppActivity f14430h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14431i = 123;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final d0 f14432a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private String f14433b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final x0 f14434c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14435d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14428f = {l1.k(new kotlin.jvm.internal.x0(AddAppActivity.class, "showPermissionKey", "getShowPermissionKey()I", 0))};

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final a f14427e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f14429g = 8;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/addapp/AddAppActivity$Companion;", "", "()V", "RESULT_RESTART", "", "instance", "Lcom/yuanqi/master/addapp/AddAppActivity;", "getInstance", "()Lcom/yuanqi/master/addapp/AddAppActivity;", "setInstance", "(Lcom/yuanqi/master/addapp/AddAppActivity;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @m
        public final AddAppActivity a() {
            return AddAppActivity.f14430h;
        }

        public final void b(@m AddAppActivity addAppActivity) {
            AddAppActivity.f14430h = addAppActivity;
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements v3.a<ViewModelProvider.Factory> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final ViewModelProvider.Factory invoke() {
            return ViewModelFactoryKt.a();
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements p<Composer, Integer, r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ AddAppActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddAppActivity addAppActivity) {
                super(2);
                this.this$0 = addAppActivity;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(199571277, i5, -1, "com.yuanqi.master.addapp.AddAppActivity.onCreate.<anonymous>.<anonymous> (AddAppActivity.kt:67)");
                }
                com.yuanqi.master.addapp.g.a(this.this$0.F(), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        c() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041118378, i5, -1, "com.yuanqi.master.addapp.AddAppActivity.onCreate.<anonymous> (AddAppActivity.kt:66)");
            }
            com.yuanqi.master.theme.d.a(false, false, ComposableLambdaKt.composableLambda(composer, 199571277, true, new a(AddAppActivity.this)), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.a<r2> {
        d() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AddAppActivity.this.G(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.a<r2> {
        e() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AddAppActivity.this.G(2);
            if (Build.VERSION.SDK_INT >= 30) {
                RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), false);
            } else {
                AddAppActivity addAppActivity = AddAppActivity.this;
                ActivityCompat.requestPermissions(addAppActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, addAppActivity.f14435d);
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final ViewModelProvider.Factory invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v3.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            v3.a aVar = this.$extrasProducer;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public AddAppActivity() {
        v3.a aVar = b.INSTANCE;
        this.f14432a = new ViewModelLazy(l1.d(AddAppViewModel.class), new g(this), aVar == null ? new f(this) : aVar, new h(null, this));
        this.f14433b = com.yuanqi.master.config.c.f14525d;
        this.f14434c = new x0(com.yuanqi.master.config.c.J, 0);
        this.f14435d = 1024;
    }

    private final AddAppViewModel D() {
        return (AddAppViewModel) this.f14432a.getValue();
    }

    private final int E() {
        return ((Number) this.f14434c.getValue(this, f14428f[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i5) {
        this.f14434c.setValue(this, f14428f[0], Integer.valueOf(i5));
    }

    private final void n() {
        String string;
        if (w0.f15264a.b(com.yuanqi.master.config.c.J)) {
            return;
        }
        o0 o0Var = o0.f15213a;
        if (Build.VERSION.SDK_INT >= 30) {
            string = getResources().getString(R.string.scan_files_request_all_file_access_permissions);
        } else {
            string = getResources().getString(R.string.scan_files_request_all_file_access_permissions_blew31);
        }
        String str = string;
        l0.m(str);
        o0.Y(o0Var, this, "存储权限申请", str, null, null, false, false, false, false, null, new d(), null, new e(), 3064, null);
    }

    public final void C() {
        try {
            if (getApplicationContext().getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0) != null) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), "com.android.permission.GET_INSTALLED_APPS") != 0) {
                    ActivityCompat.requestPermissions(this, new String[]{"com.android.permission.GET_INSTALLED_APPS"}, 999);
                } else {
                    D().W(this);
                }
            } else {
                D().W(this);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            D().W(this);
        }
    }

    @l
    public final String F() {
        return this.f14433b;
    }

    public final void H(@l String str) {
        l0.p(str, "<set-?>");
        this.f14433b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        TraceManager.startActivityTrace(AddAppActivity.class.getName());
        super.onCreate(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        D().n0(this, com.yuanqi.master.config.a.f14505g.a().e());
        f14430h = this;
        if (getIntent().hasExtra(com.yuanqi.master.config.c.f14521b)) {
            this.f14433b = String.valueOf(getIntent().getStringExtra(com.yuanqi.master.config.c.f14521b));
        }
        if (getIntent().hasExtra("appNum")) {
            D().l0(getIntent().getIntExtra("appNum", 0));
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1041118378, true, new c()), 1, null);
        j.e("onCreate coast time=" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, @m KeyEvent keyEvent) {
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i5, @l String[] permissions, @l int[] grantResults) {
        boolean s8;
        boolean q8;
        l0.p(permissions, "permissions");
        l0.p(grantResults, "grantResults");
        super.onRequestPermissionsResult(i5, permissions, grantResults);
        if (i5 == this.f14435d && D().s()) {
            D().X(this);
            return;
        }
        if (i5 == 999) {
            s8 = kotlin.collections.p.s8(permissions, "com.android.permission.GET_INSTALLED_APPS");
            if (s8) {
                q8 = kotlin.collections.p.q8(grantResults, 0);
                if (q8) {
                    D().W(this);
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(AddAppActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    @RequiresApi(30)
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(AddAppActivity.class.getName());
        super.onResume();
        if (D().s()) {
            D().X(this);
        }
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(AddAppActivity.class.getName());
        super.onStart();
        D().J(this);
        D().B().setValue(Boolean.FALSE);
        String str = this.f14433b;
        switch (str.hashCode()) {
            case -1359822686:
                str.equals(com.yuanqi.master.config.c.f14531g);
                break;
            case 374927710:
                if (str.equals(com.yuanqi.master.config.c.f14537j)) {
                    D().h(this);
                    break;
                }
                break;
            case 859583759:
                if (str.equals(com.yuanqi.master.config.c.f14525d)) {
                    if (!D().s()) {
                        n();
                    } else {
                        D().X(this);
                    }
                    C();
                    break;
                }
                break;
            case 1017924535:
                if (str.equals(com.yuanqi.master.config.c.f14543m)) {
                    String valueOf = String.valueOf(getIntent().getStringExtra("url"));
                    D().t0(String.valueOf(getIntent().getStringExtra(com.alipay.sdk.m.x.d.f3030v)));
                    D().p0(valueOf);
                    break;
                }
                break;
            case 1382799917:
                if (str.equals(com.yuanqi.master.config.c.f14527e)) {
                    D().V();
                    break;
                }
                break;
        }
        AppInstrumentation.onActivityStartEnd();
    }
}
