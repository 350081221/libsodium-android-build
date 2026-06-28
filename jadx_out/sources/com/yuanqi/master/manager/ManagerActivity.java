package com.yuanqi.master.manager;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.umeng.analytics.pro.bi;
import com.yuanqi.master.ViewModelFactoryKt;
import java.io.Serializable;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.e0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@Instrumented
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yuanqi/master/manager/ManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "managerViewModel", "Lcom/yuanqi/master/manager/ManagerViewModel;", "getManagerViewModel", "()Lcom/yuanqi/master/manager/ManagerViewModel;", "managerViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerActivity.kt\ncom/yuanqi/master/manager/ManagerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,64:1\n75#2,13:65\n*S KotlinDebug\n*F\n+ 1 ManagerActivity.kt\ncom/yuanqi/master/manager/ManagerActivity\n*L\n14#1:65,13\n*E\n"})
/* loaded from: classes3.dex */
public final class ManagerActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final a f14722b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14723c = 8;

    /* renamed from: d, reason: collision with root package name */
    @m
    private static ManagerActivity f14724d;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final d0 f14725a;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/manager/ManagerActivity$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/manager/ManagerActivity;", "getInstance", "()Lcom/yuanqi/master/manager/ManagerActivity;", "setInstance", "(Lcom/yuanqi/master/manager/ManagerActivity;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @m
        public final ManagerActivity a() {
            return ManagerActivity.f14724d;
        }

        public final void b(@m ManagerActivity managerActivity) {
            ManagerActivity.f14724d = managerActivity;
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

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
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
    public static final class d extends n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
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
    public static final class e extends n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v3.a aVar, ComponentActivity componentActivity) {
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

    public ManagerActivity() {
        v3.a aVar = b.INSTANCE;
        this.f14725a = new ViewModelLazy(l1.d(ManagerViewModel.class), new d(this), aVar == null ? new c(this) : aVar, new e(null, this));
    }

    @l
    public final ManagerViewModel E() {
        return (ManagerViewModel) this.f14725a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        v2.b bVar;
        TraceManager.startActivityTrace(ManagerActivity.class.getName());
        super.onCreate(bundle);
        f14724d = this;
        try {
            boolean z4 = false;
            E().W(getIntent().getIntExtra("index", 0));
            E().Y(getIntent().getStringExtra(bi.f12269o));
            E().b0(getIntent().getIntExtra("user_id", -1));
            E().S(getIntent().getStringExtra("app_name"));
            E().V(getIntent().getBooleanExtra("is_first", false));
            if (getIntent().hasExtra("app_note")) {
                ManagerViewModel E = E();
                if (Build.VERSION.SDK_INT >= 33) {
                    bVar = (v2.b) getIntent().getSerializableExtra("app_note", v2.b.class);
                } else {
                    Serializable serializableExtra = getIntent().getSerializableExtra("app_note");
                    l0.n(serializableExtra, "null cannot be cast to non-null type com.yuanqi.master.database.model.AppNote");
                    bVar = (v2.b) serializableExtra;
                }
                E.X(bVar);
            } else {
                E().X(null);
            }
            if (E().C() != null) {
                e0<String> B = E().B();
                v2.b C = E().C();
                l0.m(C);
                B.setValue(C.getNoteName());
                v2.b C2 = E().C();
                l0.m(C2);
                if (C2.getAppPwd().length() > 0) {
                    z4 = true;
                }
                if (z4) {
                    E().E().setValue("修改密码");
                } else {
                    E().E().setValue("应用锁");
                }
            } else {
                E().E().setValue("应用锁");
                E().B().setValue("设置名称");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        ComponentActivityKt.setContent$default(this, null, com.yuanqi.master.manager.b.f14745a.b(), 1, null);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(ManagerActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(ManagerActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(ManagerActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
