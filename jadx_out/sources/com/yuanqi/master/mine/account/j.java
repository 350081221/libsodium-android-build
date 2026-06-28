package com.yuanqi.master.mine.account;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.mine.MineViewModel;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.x0;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"RegisterScreen", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "showSmallRegisterTipKey", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRegisterScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterScreen.kt\ncom/yuanqi/master/mine/account/RegisterScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,178:1\n81#2,11:179\n74#3:190\n25#4:191\n25#4:198\n25#4:205\n25#4:212\n25#4:219\n1116#5,6:192\n1116#5,6:199\n1116#5,6:206\n1116#5,6:213\n1116#5,6:220\n*S KotlinDebug\n*F\n+ 1 RegisterScreen.kt\ncom/yuanqi/master/mine/account/RegisterScreenKt\n*L\n51#1:179,11\n54#1:190\n58#1:191\n62#1:198\n66#1:205\n70#1:212\n74#1:219\n58#1:192,6\n62#1:199,6\n66#1:206,6\n70#1:213,6\n74#1:220,6\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14805a = {l1.j(new v0(j.class, "showSmallRegisterTipKey", "<v#0>", 1))};

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.RegisterScreenKt$RegisterScreen$1", f = "RegisterScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ x0<Boolean> $showSmallRegisterTipKey$delegate;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0406a extends n0 implements v3.a<r2> {
            final /* synthetic */ x0<Boolean> $showSmallRegisterTipKey$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0406a(x0<Boolean> x0Var) {
                super(0);
                this.$showSmallRegisterTipKey$delegate = x0Var;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                j.c(this.$showSmallRegisterTipKey$delegate, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, x0<Boolean> x0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$showSmallRegisterTipKey$delegate = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new a(this.$context, this.$showSmallRegisterTipKey$delegate, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (j.b(this.$showSmallRegisterTipKey$delegate)) {
                    o0 o0Var = o0.f15213a;
                    String string = this.$context.getString(R.string.warn_tip);
                    String string2 = this.$context.getString(R.string.small_register_tip_content);
                    String string3 = this.$context.getString(R.string.i_know);
                    Context context = this.$context;
                    l0.m(string);
                    l0.m(string2);
                    l0.m(string3);
                    o0.Y(o0Var, context, string, string2, null, string3, false, true, false, false, null, null, null, new C0406a(this.$showSmallRegisterTipKey$delegate), 4008, null);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NavHostController navHostController) {
                super(0);
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$navController.popBackStack(com.yuanqi.master.mine.c.f14821c, false, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NavHostController navHostController) {
            super(2);
            this.$navController = navHostController;
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
                ComposerKt.traceEventStart(120062824, i5, -1, "com.yuanqi.master.mine.account.RegisterScreen.<anonymous> (RegisterScreen.kt:92)");
            }
            com.yuanqi.master.tools.a.f("", null, new a(this.$navController), composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<String> $phone;
        final /* synthetic */ MutableState<String> $userName;
        final /* synthetic */ MutableState<String> $userNameError;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nRegisterScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterScreen.kt\ncom/yuanqi/master/mine/account/RegisterScreenKt$RegisterScreen$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,178:1\n68#2,6:179\n74#2:213\n69#2,5:249\n74#2:282\n78#2:287\n78#2:306\n79#3,11:185\n79#3,11:220\n79#3,11:254\n92#3:286\n92#3:300\n92#3:305\n456#4,8:196\n464#4,3:210\n456#4,8:231\n464#4,3:245\n456#4,8:265\n464#4,3:279\n467#4,3:283\n467#4,3:297\n467#4,3:302\n3737#5,6:204\n3737#5,6:239\n3737#5,6:273\n74#6,6:214\n80#6:248\n84#6:301\n154#7:288\n154#7:289\n154#7:290\n154#7:291\n154#7:292\n154#7:293\n154#7:294\n154#7:295\n154#7:296\n*S KotlinDebug\n*F\n+ 1 RegisterScreen.kt\ncom/yuanqi/master/mine/account/RegisterScreenKt$RegisterScreen$3$1\n*L\n100#1:179,6\n100#1:213\n102#1:249,5\n102#1:282\n102#1:287\n100#1:306\n100#1:185,11\n101#1:220,11\n102#1:254,11\n102#1:286\n101#1:300\n100#1:305\n100#1:196,8\n100#1:210,3\n101#1:231,8\n101#1:245,3\n102#1:265,8\n102#1:279,3\n102#1:283,3\n101#1:297,3\n100#1:302,3\n100#1:204,6\n101#1:239,6\n102#1:273,6\n101#1:214,6\n101#1:248\n101#1:301\n108#1:288\n110#1:289\n117#1:290\n119#1:291\n128#1:292\n130#1:293\n153#1:294\n165#1:295\n166#1:296\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ MutableState<String> $code;
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MutableState<String> $phone;
            final /* synthetic */ MutableState<String> $userName;
            final /* synthetic */ MutableState<String> $userNameError;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.j$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0407a extends h0 implements v3.l<String, String> {
                C0407a(Object obj) {
                    super(1, obj, MineViewModel.class, "verifyUname", "verifyUname(Ljava/lang/String;)Ljava/lang/String;", 0);
                }

                @Override // v3.l
                @l
                public final String invoke(@l String p02) {
                    l0.p(p02, "p0");
                    return ((MineViewModel) this.receiver).g0(p02);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public /* synthetic */ class b extends h0 implements v3.l<String, String> {
                b(Object obj) {
                    super(1, obj, MineViewModel.class, "verifyPhone", "verifyPhone(Ljava/lang/String;)Ljava/lang/String;", 0);
                }

                @Override // v3.l
                @l
                public final String invoke(@l String p02) {
                    l0.p(p02, "p0");
                    return ((MineViewModel) this.receiver).c0(p02);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.j$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0408c extends h0 implements v3.l<String, String> {
                C0408c(Object obj) {
                    super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
                }

                @Override // v3.l
                @l
                public final String invoke(@l String p02) {
                    l0.p(p02, "p0");
                    return ((MineViewModel) this.receiver).a0(p02);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Integer> $countDown;
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ MutableState<String> $phone;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.j$c$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0409a extends n0 implements v3.l<Integer, r2> {
                    final /* synthetic */ MutableState<Integer> $countDown;
                    final /* synthetic */ MineViewModel $mineViewModel;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.RegisterScreenKt$RegisterScreen$3$1$1$1$5$1$1", f = "RegisterScreen.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.mine.account.j$c$a$d$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0410a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ MutableState<Integer> $countDown;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0410a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0410a> dVar) {
                            super(2, dVar);
                            this.$countDown = mutableState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @l
                        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                            return new C0410a(this.$countDown, dVar);
                        }

                        @Override // v3.p
                        @m
                        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0410a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object obj) {
                            Object l5;
                            l5 = kotlin.coroutines.intrinsics.d.l();
                            int i5 = this.label;
                            if (i5 != 0 && i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e1.n(obj);
                            while (this.$countDown.getValue().intValue() > 0) {
                                this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                                this.label = 1;
                                if (d1.b(1000L, this) == l5) {
                                    return l5;
                                }
                            }
                            if (this.$countDown.getValue().intValue() <= 0) {
                                this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                            }
                            return r2.f19517a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0409a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                        super(1);
                        this.$mineViewModel = mineViewModel;
                        this.$countDown = mutableState;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                        invoke(num.intValue());
                        return r2.f19517a;
                    }

                    public final void invoke(int i5) {
                        if (i5 != 200) {
                            return;
                        }
                        k.f(this.$mineViewModel.t(), k1.c(), null, new C0410a(this.$countDown, null), 2, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
                    super(0);
                    this.$mineViewModel = mineViewModel;
                    this.$phone = mutableState;
                    this.$countDown = mutableState2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mineViewModel.N(this.$phone.getValue(), new C0409a(this.$mineViewModel, this.$countDown));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<String> $code;
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ MutableState<String> $phone;
                final /* synthetic */ MutableState<String> $userName;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.j$c$a$e$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0411a extends n0 implements v3.a<r2> {
                    final /* synthetic */ NavHostController $navController;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0411a(NavHostController navHostController) {
                        super(0);
                        this.$navController = navHostController;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$navController.popBackStack(com.yuanqi.master.mine.c.f14821c, false, false);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, NavHostController navHostController) {
                    super(0);
                    this.$mineViewModel = mineViewModel;
                    this.$userName = mutableState;
                    this.$phone = mutableState2;
                    this.$code = mutableState3;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mineViewModel.f(this.$userName.getValue(), this.$phone.getValue(), this.$code.getValue(), new C0411a(this.$navController));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, MutableState<String> mutableState, MineViewModel mineViewModel, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Integer> mutableState5, NavHostController navHostController) {
                super(3);
                this.$it = paddingValues;
                this.$userName = mutableState;
                this.$mineViewModel = mineViewModel;
                this.$phone = mutableState2;
                this.$userNameError = mutableState3;
                this.$code = mutableState4;
                this.$countDown = mutableState5;
                this.$navController = navHostController;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                invoke(boxScope, composer, num.intValue());
                return r2.f19517a;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0395  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x039b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x040d  */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0398  */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(@p4.l androidx.compose.foundation.layout.BoxScope r34, @p4.m androidx.compose.runtime.Composer r35, int r36) {
                /*
                    Method dump skipped, instructions count: 1041
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.j.c.a.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState<String> mutableState, MineViewModel mineViewModel, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Integer> mutableState5, NavHostController navHostController) {
            super(3);
            this.$userName = mutableState;
            this.$mineViewModel = mineViewModel;
            this.$phone = mutableState2;
            this.$userNameError = mutableState3;
            this.$code = mutableState4;
            this.$countDown = mutableState5;
            this.$navController = navHostController;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l PaddingValues it, @m Composer composer, int i5) {
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
                ComposerKt.traceEventStart(1193793587, i5, -1, "com.yuanqi.master.mine.account.RegisterScreen.<anonymous> (RegisterScreen.kt:98)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 748868986, true, new a(it, this.$userName, this.$mineViewModel, this.$phone, this.$userNameError, this.$code, this.$countDown, this.$navController)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NavHostController navHostController, MineViewModel mineViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            j.a(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m MineViewModel mineViewModel, @m Composer composer, int i5, int i6) {
        MineViewModel mineViewModel2;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-1378638172);
        if ((i6 & 2) != 0) {
            ViewModelProvider.Factory a5 = ViewModelFactoryKt.a();
            startRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(MineViewModel.class, current, null, a5, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                mineViewModel2 = (MineViewModel) viewModel;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            mineViewModel2 = mineViewModel;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1378638172, i5, -1, "com.yuanqi.master.mine.account.RegisterScreen (RegisterScreen.kt:51)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Boolean bool = Boolean.TRUE;
        x0 x0Var = new x0(com.yuanqi.master.config.c.X, bool);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            l0.m(value);
            String userPhone = value.getUserPhone();
            l0.m(userPhone);
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPhone, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(60, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(bool, new a(context, x0Var, null), startRestartGroup, 70);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 120062824, true, new b(navController));
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1193793587, true, new c(mutableState, mineViewModel2, mutableState3, mutableState2, mutableState4, (MutableState) rememberedValue5, navController));
        MineViewModel mineViewModel3 = mineViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, composableLambda, null, null, null, 0, 0L, 0L, null, composableLambda2, startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(navController, mineViewModel3, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(x0<Boolean> x0Var) {
        return x0Var.getValue(null, f14805a[0]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(x0<Boolean> x0Var, boolean z4) {
        x0Var.setValue(null, f14805a[0], Boolean.valueOf(z4));
    }
}
