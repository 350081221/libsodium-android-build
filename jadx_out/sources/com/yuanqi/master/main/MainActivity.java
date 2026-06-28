package com.yuanqi.master.main;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.utils.VLog;
import com.yuanqi.group.home.models.AppInfoLite;
import com.yuanqi.master.ViewModelFactoryKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/main/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "lastTime", "", "getLastTime", "()J", "setLastTime", "(J)V", "mainViewModel", "Lcom/yuanqi/master/main/MainViewModel;", "getMainViewModel", "()Lcom/yuanqi/master/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/yuanqi/master/main/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,76:1\n75#2,13:77\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/yuanqi/master/main/MainActivity\n*L\n21#1:77,13\n*E\n"})
/* loaded from: classes3.dex */
public final class MainActivity extends ComponentActivity {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f14671c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f14672d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static MainActivity f14673e;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final d0 f14674a;

    /* renamed from: b, reason: collision with root package name */
    private long f14675b;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/main/MainActivity$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/main/MainActivity;", "getInstance", "()Lcom/yuanqi/master/main/MainActivity;", "setInstance", "(Lcom/yuanqi/master/main/MainActivity;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @p4.l
        public final MainActivity a() {
            MainActivity mainActivity = MainActivity.f14673e;
            if (mainActivity != null) {
                return mainActivity;
            }
            l0.S("instance");
            return null;
        }

        public final void b(@p4.l MainActivity mainActivity) {
            l0.p(mainActivity, "<set-?>");
            MainActivity.f14673e = mainActivity;
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
        @p4.l
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
        @p4.l
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
        @p4.l
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
        @p4.l
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            v3.a aVar = this.$extrasProducer;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public MainActivity() {
        v3.a aVar = b.INSTANCE;
        this.f14674a = new ViewModelLazy(l1.d(MainViewModel.class), new d(this), aVar == null ? new c(this) : aVar, new e(null, this));
    }

    public final void A(long j5) {
        this.f14675b = j5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i5, int i6, @p4.m Intent intent) {
        ArrayList parcelableArrayListExtra;
        super.onActivityResult(i5, i6, intent);
        if (i5 != 5) {
            if (i5 != 6) {
                if (i5 == 7) {
                    com.yuanqi.master.config.a.f14505g.a().i();
                    z().w();
                    return;
                }
                return;
            }
            if (i6 == -1) {
                l0.m(intent);
                VActivityManager.get().launchApp(intent.getIntExtra("user_id", -1), intent.getStringExtra("pkg"));
                return;
            }
            return;
        }
        if (i6 == -1 && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra(com.yuanqi.group.c.f13754h)) != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                z().p((AppInfoLite) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        super.onCreate(bundle);
        f14671c.b(this);
        z().U(this);
        ComponentActivityKt.setContent$default(this, null, com.yuanqi.master.main.a.f14693a.b(), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (System.currentTimeMillis() - this.f14675b > 1000) {
            VLog.d(VLog.TAG_DEFAULT, "[onResume] checkExtPackageBootPermission", new Object[0]);
            if (Build.VERSION.SDK_INT >= 30) {
                z().u(this);
            }
            this.f14675b = System.currentTimeMillis();
        }
    }

    public final long y() {
        return this.f14675b;
    }

    @p4.l
    public final MainViewModel z() {
        return (MainViewModel) this.f14674a.getValue();
    }
}
