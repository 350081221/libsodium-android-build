package com.yuanqi.master.mine;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.yuanqi.master.ViewModelFactoryKt;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@Instrumented
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/mine/MineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "getMineViewModel", "()Lcom/yuanqi/master/mine/MineViewModel;", "mineViewModel$delegate", "Lkotlin/Lazy;", "backAccount", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,104:1\n75#2,13:105\n*S KotlinDebug\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivity\n*L\n28#1:105,13\n*E\n"})
/* loaded from: classes3.dex */
public final class MineActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final a f14760b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14761c = 8;

    /* renamed from: d, reason: collision with root package name */
    @m
    private static MineActivity f14762d;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final d0 f14763a;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/mine/MineActivity$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/mine/MineActivity;", "getInstance", "()Lcom/yuanqi/master/mine/MineActivity;", "setInstance", "(Lcom/yuanqi/master/mine/MineActivity;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @m
        public final MineActivity a() {
            return MineActivity.f14762d;
        }

        public final void b(@m MineActivity mineActivity) {
            MineActivity.f14762d = mineActivity;
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

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements v3.a<r2> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ k1.h<String> $startScreen;
        final /* synthetic */ MineActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ k1.h<String> $startScreen;
            final /* synthetic */ MineActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<String> hVar, MineActivity mineActivity) {
                super(2);
                this.$startScreen = hVar;
                this.this$0 = mineActivity;
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
                    ComposerKt.traceEventStart(-683648038, i5, -1, "com.yuanqi.master.mine.MineActivity.onCreate.<anonymous>.<anonymous> (MineActivity.kt:62)");
                }
                com.yuanqi.master.mine.b.a(this.$startScreen.element, composer, 0, 0);
                if (this.this$0.G().x().getValue().booleanValue()) {
                    com.yuanqi.master.mine.a.a(this.this$0.G(), composer, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.h<String> hVar, MineActivity mineActivity) {
            super(2);
            this.$startScreen = hVar;
            this.this$0 = mineActivity;
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
                ComposerKt.traceEventStart(1730865827, i5, -1, "com.yuanqi.master.mine.MineActivity.onCreate.<anonymous> (MineActivity.kt:61)");
            }
            com.yuanqi.master.theme.d.a(false, false, ComposableLambdaKt.composableLambda(composer, -683648038, true, new a(this.$startScreen, this.this$0)), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
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
    public static final class f extends n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
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
    public static final class g extends n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v3.a aVar, ComponentActivity componentActivity) {
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

    public MineActivity() {
        v3.a aVar = b.INSTANCE;
        this.f14763a = new ViewModelLazy(l1.d(MineViewModel.class), new f(this), aVar == null ? new e(this) : aVar, new g(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MineViewModel G() {
        return (MineViewModel) this.f14763a.getValue();
    }

    public final void F() {
        G().e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        T t5;
        TraceManager.startActivityTrace(MineActivity.class.getName());
        super.onCreate(bundle);
        f14762d = this;
        G().F(this);
        com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
        aVar.n(G().t(), c.INSTANCE);
        k1.h hVar = new k1.h();
        ?? stringExtra = getIntent().getStringExtra("screen");
        hVar.element = stringExtra;
        if (stringExtra == 0) {
            if (aVar.c()) {
                t5 = com.yuanqi.master.mine.c.f14821c;
            } else {
                t5 = com.yuanqi.master.mine.c.f14820b;
            }
            hVar.element = t5;
        }
        if (getIntent().hasExtra("register")) {
            G().S(Boolean.FALSE);
        }
        if (getIntent().hasExtra("isHomeToVip")) {
            G().R(true);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1730865827, true, new d(hVar, this)), 1, null);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(MineActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(MineActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(MineActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
