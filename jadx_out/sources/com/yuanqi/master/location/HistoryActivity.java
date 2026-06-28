package com.yuanqi.master.location;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.tools.f1;
import kotlin.d0;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.p;
import v3.q;
import v3.r;

@StabilityInferred(parameters = 0)
@Instrumented
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yuanqi/master/location/HistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "historyViewModel", "Lcom/yuanqi/master/location/HistoryViewModel;", "getHistoryViewModel", "()Lcom/yuanqi/master/location/HistoryViewModel;", "historyViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,141:1\n75#2,13:142\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity\n*L\n53#1:142,13\n*E\n"})
/* loaded from: classes3.dex */
public final class HistoryActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f14608b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14609c = 8;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private static HistoryActivity f14610d;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final d0 f14611a;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/location/HistoryActivity$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/location/HistoryActivity;", "getInstance", "()Lcom/yuanqi/master/location/HistoryActivity;", "setInstance", "(Lcom/yuanqi/master/location/HistoryActivity;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @p4.m
        public final HistoryActivity a() {
            return HistoryActivity.f14610d;
        }

        public final void b(@p4.m HistoryActivity historyActivity) {
            HistoryActivity.f14610d = historyActivity;
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

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements p<Composer, Integer, r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,141:1\n74#2:142\n25#3:143\n1116#4,6:144\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1\n*L\n66#1:142\n68#1:143\n68#1:144,6\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ HistoryActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.location.HistoryActivity$onCreate$1$1$1", f = "HistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0331a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                int label;
                final /* synthetic */ HistoryActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0331a(HistoryActivity historyActivity, kotlin.coroutines.d<? super C0331a> dVar) {
                    super(2, dVar);
                    this.this$0 = historyActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0331a(this.this$0, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0331a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.this$0.F().c();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class b extends n0 implements v3.a<r2> {
                public static final b INSTANCE = new b();

                b() {
                    super(0);
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    HistoryActivity a5 = HistoryActivity.f14608b.a();
                    if (a5 != null) {
                        a5.finish();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0332c extends n0 implements p<Composer, Integer, r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                final /* synthetic */ HistoryActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,141:1\n86#2,7:142\n93#2:177\n97#2:184\n79#3,11:149\n92#3:183\n456#4,8:160\n464#4,3:174\n467#4,3:180\n3737#5,6:168\n154#6:178\n154#6:179\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1$3$1\n*L\n83#1:142,7\n83#1:177\n83#1:184\n83#1:149,11\n83#1:183\n83#1:160,8\n83#1:174,3\n83#1:180,3\n83#1:168,6\n87#1:178\n94#1:179\n*E\n"})
                /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0333a extends n0 implements q<RowScope, Composer, Integer, r2> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                    final /* synthetic */ HistoryActivity this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0334a extends n0 implements v3.a<r2> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ HistoryActivity this$0;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$c$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0335a extends n0 implements v3.a<r2> {
                            public static final C0335a INSTANCE = new C0335a();

                            C0335a() {
                                super(0);
                            }

                            @Override // v3.a
                            public /* bridge */ /* synthetic */ r2 invoke() {
                                invoke2();
                                return r2.f19517a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                f1.r("删除已完成！", 0, 2, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0334a(HistoryActivity historyActivity, Context context) {
                            super(0);
                            this.this$0 = historyActivity;
                            this.$context = context;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.F().f(this.$context, C0335a.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0333a(SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity, Context context) {
                        super(3);
                        this.$historyList = snapshotStateList;
                        this.this$0 = historyActivity;
                        this.$context = context;
                    }

                    @Override // v3.q
                    public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
                        invoke(rowScope, composer, num.intValue());
                        return r2.f19517a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@p4.l RowScope CustomTopBar, @p4.m Composer composer, int i5) {
                        l0.p(CustomTopBar, "$this$CustomTopBar");
                        if ((i5 & 81) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1272046785, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:81)");
                        }
                        if (!this.$historyList.isEmpty()) {
                            HistoryActivity historyActivity = this.this$0;
                            Context context = this.$context;
                            composer.startReplaceableGroup(693286680);
                            Modifier.Companion companion = Modifier.Companion;
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
                            composer.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
                            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.menu_delete, composer, 6), "", ClickableKt.m235clickableXHw0xAI$default(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(24)), false, null, null, new C0334a(historyActivity, context), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                            SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(10)), composer, 6);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$c$b */
                /* loaded from: classes3.dex */
                public static final class b extends n0 implements v3.a<r2> {
                    public static final b INSTANCE = new b();

                    b() {
                        super(0);
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        HistoryActivity a5 = HistoryActivity.f14608b.a();
                        if (a5 != null) {
                            a5.finish();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0332c(SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity, Context context) {
                    super(2);
                    this.$historyList = snapshotStateList;
                    this.this$0 = historyActivity;
                    this.$context = context;
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.m Composer composer, int i5) {
                    if ((i5 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(176046652, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:80)");
                    }
                    com.yuanqi.master.tools.a.f("历史记录", ComposableLambdaKt.composableLambda(composer, 1272046785, true, new C0333a(this.$historyList, this.this$0, this.$context)), b.INSTANCE, composer, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements q<PaddingValues, Composer, Integer, r2> {
                final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                final /* synthetic */ HistoryActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1$4$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,141:1\n68#2,6:142\n74#2:176\n67#2,7:177\n74#2:212\n78#2:217\n78#2:222\n79#3,11:148\n79#3,11:184\n92#3:216\n92#3:221\n456#4,8:159\n464#4,3:173\n456#4,8:195\n464#4,3:209\n467#4,3:213\n467#4,3:218\n3737#5,6:167\n3737#5,6:203\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1$4$1\n*L\n102#1:142,6\n102#1:176\n108#1:177,7\n108#1:212\n108#1:217\n102#1:222\n102#1:148,11\n108#1:184,11\n108#1:216\n102#1:221\n102#1:159,8\n102#1:173,3\n108#1:195,8\n108#1:209,3\n108#1:213,3\n102#1:218,3\n102#1:167,6\n108#1:203,6\n*E\n"})
                /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0336a extends n0 implements q<BoxScope, Composer, Integer, r2> {
                    final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                    final /* synthetic */ PaddingValues $it;
                    final /* synthetic */ HistoryActivity this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$d$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0337a extends n0 implements v3.l<LazyListScope, r2> {
                        final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                        final /* synthetic */ HistoryActivity this$0;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$d$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0338a extends n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
                            final /* synthetic */ SnapshotStateList<v2.c> $historyList;
                            final /* synthetic */ HistoryActivity this$0;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "latitude", "", "longitude", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                            /* renamed from: com.yuanqi.master.location.HistoryActivity$c$a$d$a$a$a$a, reason: collision with other inner class name */
                            /* loaded from: classes3.dex */
                            public static final class C0339a extends n0 implements p<Double, Double, r2> {
                                final /* synthetic */ HistoryActivity this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C0339a(HistoryActivity historyActivity) {
                                    super(2);
                                    this.this$0 = historyActivity;
                                }

                                @Override // v3.p
                                public /* bridge */ /* synthetic */ r2 invoke(Double d5, Double d6) {
                                    invoke(d5.doubleValue(), d6.doubleValue());
                                    return r2.f19517a;
                                }

                                public final void invoke(double d5, double d6) {
                                    HistoryActivity historyActivity = this.this$0;
                                    Intent intent = new Intent();
                                    intent.putExtra(com.yuanqi.group.c.f13758l, d5);
                                    intent.putExtra(com.yuanqi.group.c.f13759m, d6);
                                    r2 r2Var = r2.f19517a;
                                    historyActivity.setResult(-1, intent);
                                    this.this$0.finish();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0338a(SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity) {
                                super(4);
                                this.$historyList = snapshotStateList;
                                this.this$0 = historyActivity;
                            }

                            @Override // v3.r
                            public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                return r2.f19517a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@p4.l LazyItemScope items, int i5, @p4.m Composer composer, int i6) {
                                int i7;
                                l0.p(items, "$this$items");
                                if ((i6 & 112) == 0) {
                                    i7 = (composer.changed(i5) ? 32 : 16) | i6;
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 721) == 144 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1934024793, i6, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:113)");
                                }
                                com.yuanqi.master.tools.a.i(this.$historyList.get(i5), new C0339a(this.this$0), composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0337a(SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity) {
                            super(1);
                            this.$historyList = snapshotStateList;
                            this.this$0 = historyActivity;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l LazyListScope LazyColumn) {
                            l0.p(LazyColumn, "$this$LazyColumn");
                            LazyListScope.items$default(LazyColumn, this.$historyList.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1934024793, true, new C0338a(this.$historyList, this.this$0)), 6, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0336a(PaddingValues paddingValues, SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity) {
                        super(3);
                        this.$it = paddingValues;
                        this.$historyList = snapshotStateList;
                        this.this$0 = historyActivity;
                    }

                    @Override // v3.q
                    public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                        invoke(boxScope, composer, num.intValue());
                        return r2.f19517a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@p4.l BoxScope GradientBox, @p4.m Composer composer, int i5) {
                        l0.p(GradientBox, "$this$GradientBox");
                        if ((i5 & 81) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-792095282, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:101)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$it), 0.0f, 1, null);
                        SnapshotStateList<v2.c> snapshotStateList = this.$historyList;
                        HistoryActivity historyActivity = this.this$0;
                        composer.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
                        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (snapshotStateList.isEmpty()) {
                            composer.startReplaceableGroup(1625903861);
                            composer.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                            composer.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
                            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        } else {
                            composer.startReplaceableGroup(1625903971);
                            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new C0337a(snapshotStateList, historyActivity), composer, 0, 255);
                            composer.endReplaceableGroup();
                        }
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(SnapshotStateList<v2.c> snapshotStateList, HistoryActivity historyActivity) {
                    super(3);
                    this.$historyList = snapshotStateList;
                    this.this$0 = historyActivity;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                    invoke(paddingValues, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l PaddingValues it, @p4.m Composer composer, int i5) {
                    int i6;
                    l0.p(it, "it");
                    if ((i5 & 14) == 0) {
                        i6 = (composer.changed(it) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 91) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1447099719, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:100)");
                    }
                    com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -792095282, true, new C0336a(it, this.$historyList, this.this$0)), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HistoryActivity historyActivity) {
                super(2);
                this.this$0 = historyActivity;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1049351560, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous> (HistoryActivity.kt:65)");
                }
                Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                HistoryActivity historyActivity = this.this$0;
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = historyActivity.F().b();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
                EffectsKt.LaunchedEffect(Boolean.TRUE, new C0331a(this.this$0, null), composer, 70);
                BackHandlerKt.BackHandler(false, b.INSTANCE, composer, 48, 1);
                ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(composer, 176046652, true, new C0332c(snapshotStateList, this.this$0, context)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer, 1447099719, true, new d(snapshotStateList, this.this$0)), composer, 805306416, 509);
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
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214934527, i5, -1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous> (HistoryActivity.kt:63)");
            }
            com.yuanqi.master.theme.d.a(false, false, ComposableLambdaKt.composableLambda(composer, -1049351560, true, new a(HistoryActivity.this)), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
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
    public static final class e extends n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
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
    public static final class f extends n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v3.a aVar, ComponentActivity componentActivity) {
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

    public HistoryActivity() {
        v3.a aVar = b.INSTANCE;
        this.f14611a = new ViewModelLazy(l1.d(HistoryViewModel.class), new e(this), aVar == null ? new d(this) : aVar, new f(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryViewModel F() {
        return (HistoryViewModel) this.f14611a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        TraceManager.startActivityTrace(HistoryActivity.class.getName());
        super.onCreate(bundle);
        f14610d = this;
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1214934527, true, new c()), 1, null);
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.orhanobut.logger.j.d("onDestroy", new Object[0]);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(HistoryActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(HistoryActivity.class.getName());
        super.onResume();
        com.orhanobut.logger.j.d("onResume", new Object[0]);
        F().c();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(HistoryActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
