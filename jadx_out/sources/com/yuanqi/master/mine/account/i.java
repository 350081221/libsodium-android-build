package com.yuanqi.master.mine.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.group.home.HomeViewModel;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.mine.MineViewModel;
import com.yuanqi.master.start.TextActivity;
import com.yuanqi.master.tools.o0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"LoginScreen", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLoginScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n81#2,11:251\n74#3:262\n74#3:326\n25#4:263\n25#4:270\n25#4:277\n25#4:284\n25#4:291\n25#4:298\n25#4:305\n25#4:312\n25#4:319\n36#4:327\n36#4:334\n1116#5,6:264\n1116#5,6:271\n1116#5,6:278\n1116#5,6:285\n1116#5,6:292\n1116#5,6:299\n1116#5,6:306\n1116#5,6:313\n1116#5,6:320\n1116#5,6:328\n1116#5,6:335\n*S KotlinDebug\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt\n*L\n68#1:251,11\n71#1:262\n105#1:326\n73#1:263\n77#1:270\n81#1:277\n85#1:284\n89#1:291\n93#1:298\n97#1:305\n102#1:312\n103#1:319\n244#1:327\n246#1:334\n73#1:264,6\n77#1:271,6\n81#1:278,6\n85#1:285,6\n89#1:292,6\n93#1:299,6\n97#1:306,6\n102#1:313,6\n103#1:320,6\n244#1:328,6\n246#1:335,6\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ MutableState<String> $account;
        final /* synthetic */ MutableState<String> $accountError;
        final /* synthetic */ MutableState<Boolean> $agreeRule;
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ MutableState<Boolean> $showAgreeDialog;
        final /* synthetic */ SoftwareKeyboardController $softKeyboard;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nLoginScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt$LoginScreen$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1#1,250:1\n68#2,6:251\n74#2:285\n69#2,5:329\n74#2:362\n78#2:369\n78#2:484\n79#3,11:257\n79#3,11:299\n79#3,11:334\n92#3:368\n79#3,11:390\n79#3,11:434\n92#3:466\n92#3:471\n92#3:478\n92#3:483\n456#4,8:268\n464#4,3:282\n36#4:286\n456#4,8:310\n464#4,3:324\n456#4,8:345\n464#4,3:359\n467#4,3:365\n36#4:377\n456#4,8:401\n464#4,3:415\n456#4,8:445\n464#4,3:459\n467#4,3:463\n467#4,3:468\n467#4,3:475\n467#4,3:480\n3737#5,6:276\n3737#5,6:318\n3737#5,6:353\n3737#5,6:409\n3737#5,6:453\n1116#6,6:287\n1116#6,6:378\n74#7,6:293\n80#7:327\n84#7:479\n154#8:328\n154#8:363\n154#8:364\n154#8:370\n154#8:371\n154#8:372\n154#8:373\n154#8:374\n154#8:375\n154#8:376\n154#8:419\n154#8:420\n154#8:421\n154#8:473\n154#8:474\n87#9,6:384\n93#9:418\n97#9:472\n61#10,12:422\n73#10:462\n77#10:467\n*S KotlinDebug\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt$LoginScreen$1$1\n*L\n114#1:251,6\n114#1:285\n129#1:329,5\n129#1:362\n129#1:369\n114#1:484\n114#1:257,11\n119#1:299,11\n129#1:334,11\n129#1:368\n173#1:390,11\n193#1:434,11\n193#1:466\n173#1:471\n119#1:478\n114#1:483\n114#1:268,8\n114#1:282,3\n123#1:286\n119#1:310,8\n119#1:324,3\n129#1:345,8\n129#1:359,3\n129#1:365,3\n177#1:377\n173#1:401,8\n173#1:415,3\n193#1:445,8\n193#1:459,3\n193#1:463,3\n173#1:468,3\n119#1:475,3\n114#1:480,3\n114#1:276,6\n119#1:318,6\n129#1:353,6\n173#1:409,6\n193#1:453,6\n123#1:287,6\n177#1:378,6\n119#1:293,6\n119#1:327\n119#1:479\n131#1:328\n135#1:363\n136#1:364\n141#1:370\n143#1:371\n150#1:372\n152#1:373\n171#1:374\n175#1:375\n176#1:376\n184#1:419\n185#1:420\n192#1:421\n221#1:473\n222#1:474\n173#1:384,6\n173#1:418\n173#1:472\n193#1:422,12\n193#1:462\n193#1:467\n*E\n"})
        /* renamed from: com.yuanqi.master.mine.account.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0398a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ MutableState<String> $account;
            final /* synthetic */ MutableState<String> $accountError;
            final /* synthetic */ MutableState<Boolean> $agreeRule;
            final /* synthetic */ MutableState<String> $code;
            final /* synthetic */ Context $context;
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ MutableState<Boolean> $showAgreeDialog;
            final /* synthetic */ SoftwareKeyboardController $softKeyboard;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.LoginScreenKt$LoginScreen$1$1$1$1$1", f = "LoginScreen.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0399a extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ SoftwareKeyboardController $softKeyboard;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.LoginScreenKt$LoginScreen$1$1$1$1$1$1", f = "LoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.i$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0400a extends o implements q<PressGestureScope, Offset, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ SoftwareKeyboardController $softKeyboard;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0400a(SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super C0400a> dVar) {
                        super(3, dVar);
                        this.$softKeyboard = softwareKeyboardController;
                    }

                    @Override // v3.q
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, kotlin.coroutines.d<? super r2> dVar) {
                        return m6440invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
                    }

                    @m
                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m6440invoked4ec7I(@l PressGestureScope pressGestureScope, long j5, @m kotlin.coroutines.d<? super r2> dVar) {
                        return new C0400a(this.$softKeyboard, dVar).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object obj) {
                        kotlin.coroutines.intrinsics.d.l();
                        if (this.label == 0) {
                            e1.n(obj);
                            SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                            if (softwareKeyboardController != null) {
                                softwareKeyboardController.hide();
                            }
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0399a(SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super C0399a> dVar) {
                    super(2, dVar);
                    this.$softKeyboard = softwareKeyboardController;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    C0399a c0399a = new C0399a(this.$softKeyboard, dVar);
                    c0399a.L$0 = obj;
                    return c0399a;
                }

                @Override // v3.p
                @m
                public final Object invoke(@l PointerInputScope pointerInputScope, @m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0399a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
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
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C0400a c0400a = new C0400a(this.$softKeyboard, null);
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c0400a, null, this, 11, null) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$b */
            /* loaded from: classes3.dex */
            public /* synthetic */ class b extends h0 implements v3.l<String, String> {
                b(Object obj) {
                    super(1, obj, MineViewModel.class, "verifyAccount", "verifyAccount(Ljava/lang/String;)Ljava/lang/String;", 0);
                }

                @Override // v3.l
                @l
                public final String invoke(@l String p02) {
                    l0.p(p02, "p0");
                    return ((MineViewModel) this.receiver).Z(p02);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$c */
            /* loaded from: classes3.dex */
            public /* synthetic */ class c extends h0 implements v3.l<String, String> {
                c(Object obj) {
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
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$d */
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<String> $account;
                final /* synthetic */ MutableState<Integer> $countDown;
                final /* synthetic */ MineViewModel $mineViewModel;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.i$a$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0401a extends n0 implements v3.l<Integer, r2> {
                    final /* synthetic */ MutableState<Integer> $countDown;
                    final /* synthetic */ MineViewModel $mineViewModel;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.LoginScreenKt$LoginScreen$1$1$1$2$4$1$1", f = "LoginScreen.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.mine.account.i$a$a$d$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0402a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ MutableState<Integer> $countDown;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0402a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0402a> dVar) {
                            super(2, dVar);
                            this.$countDown = mutableState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @l
                        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                            return new C0402a(this.$countDown, dVar);
                        }

                        @Override // v3.p
                        @m
                        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0402a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    C0401a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
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
                        k.f(this.$mineViewModel.t(), k1.c(), null, new C0402a(this.$countDown, null), 2, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
                    super(0);
                    this.$mineViewModel = mineViewModel;
                    this.$account = mutableState;
                    this.$countDown = mutableState2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mineViewModel.N(this.$account.getValue(), new C0401a(this.$mineViewModel, this.$countDown));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$e */
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $agreeRule;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(MutableState<Boolean> mutableState) {
                    super(0);
                    this.$agreeRule = mutableState;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$agreeRule.setValue(Boolean.valueOf(!this.$agreeRule.getValue().booleanValue()));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$f */
            /* loaded from: classes3.dex */
            public static final class f extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(Context context) {
                    super(0);
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Context context = this.$context;
                    Intent intent = new Intent(this.$context, (Class<?>) TextActivity.class);
                    intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.$context.getString(R.string.term));
                    intent.putExtra("content", com.yuanqi.master.config.d.f14559c);
                    context.startActivity(intent);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$g */
            /* loaded from: classes3.dex */
            public static final class g extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(Context context) {
                    super(0);
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Context context = this.$context;
                    Intent intent = new Intent(this.$context, (Class<?>) TextActivity.class);
                    intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.$context.getString(R.string.privacy));
                    intent.putExtra("content", com.yuanqi.master.config.d.f14560d);
                    context.startActivity(intent);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.i$a$a$h */
            /* loaded from: classes3.dex */
            public static final class h extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<String> $account;
                final /* synthetic */ MutableState<Boolean> $agreeRule;
                final /* synthetic */ MutableState<String> $code;
                final /* synthetic */ Context $context;
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ MutableState<Boolean> $showAgreeDialog;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.i$a$a$h$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0403a extends n0 implements v3.a<r2> {
                    final /* synthetic */ MineViewModel $mineViewModel;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.mine.account.i$a$a$h$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0404a extends n0 implements v3.a<r2> {
                        public static final C0404a INSTANCE = new C0404a();

                        C0404a() {
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

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.LoginScreenKt$LoginScreen$1$1$1$2$7$1$2", f = "LoginScreen.kt", i = {0}, l = {230}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.mine.account.i$a$a$h$a$b */
                    /* loaded from: classes3.dex */
                    public static final class b extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.LoginScreenKt$LoginScreen$1$1$1$2$7$1$2$1", f = "LoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.yuanqi.master.mine.account.i$a$a$h$a$b$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0405a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                            int label;

                            C0405a(kotlin.coroutines.d<? super C0405a> dVar) {
                                super(2, dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                                return new C0405a(dVar);
                            }

                            @Override // v3.p
                            @m
                            public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                                return ((C0405a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object obj) {
                                kotlin.coroutines.intrinsics.d.l();
                                if (this.label == 0) {
                                    e1.n(obj);
                                    MineActivity a5 = MineActivity.f14760b.a();
                                    l0.m(a5);
                                    a5.finish();
                                    o0 o0Var = o0.f15213a;
                                    Activity C = HomeViewModel.A.c().C();
                                    l0.m(C);
                                    o0Var.R0(C);
                                    return r2.f19517a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        b(kotlin.coroutines.d<? super b> dVar) {
                            super(2, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @l
                        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                            b bVar = new b(dVar);
                            bVar.L$0 = obj;
                            return bVar;
                        }

                        @Override // v3.p
                        @m
                        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object obj) {
                            Object l5;
                            s0 s0Var;
                            l5 = kotlin.coroutines.intrinsics.d.l();
                            int i5 = this.label;
                            if (i5 != 0) {
                                if (i5 == 1) {
                                    s0 s0Var2 = (s0) this.L$0;
                                    e1.n(obj);
                                    s0Var = s0Var2;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                e1.n(obj);
                                s0 s0Var3 = (s0) this.L$0;
                                this.L$0 = s0Var3;
                                this.label = 1;
                                if (d1.b(500L, this) == l5) {
                                    return l5;
                                }
                                s0Var = s0Var3;
                            }
                            k.f(s0Var, k1.e(), null, new C0405a(null), 2, null);
                            return r2.f19517a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0403a(MineViewModel mineViewModel) {
                        super(0);
                        this.$mineViewModel = mineViewModel;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.yuanqi.master.mine.account.a.f14786a.n(this.$mineViewModel.t(), C0404a.INSTANCE);
                        k.f(this.$mineViewModel.t(), k1.c(), null, new b(null), 2, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MineViewModel mineViewModel, Context context, MutableState<String> mutableState3, MutableState<String> mutableState4) {
                    super(0);
                    this.$agreeRule = mutableState;
                    this.$showAgreeDialog = mutableState2;
                    this.$mineViewModel = mineViewModel;
                    this.$context = context;
                    this.$account = mutableState3;
                    this.$code = mutableState4;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!this.$agreeRule.getValue().booleanValue()) {
                        this.$showAgreeDialog.setValue(Boolean.TRUE);
                    } else {
                        this.$mineViewModel.D(this.$context, this.$account.getValue(), this.$code.getValue(), new C0403a(this.$mineViewModel));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0398a(PaddingValues paddingValues, SoftwareKeyboardController softwareKeyboardController, MutableState<String> mutableState, MineViewModel mineViewModel, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Integer> mutableState4, MutableState<Boolean> mutableState5, Context context, MutableState<Boolean> mutableState6) {
                super(3);
                this.$it = paddingValues;
                this.$softKeyboard = softwareKeyboardController;
                this.$account = mutableState;
                this.$mineViewModel = mineViewModel;
                this.$accountError = mutableState2;
                this.$code = mutableState3;
                this.$countDown = mutableState4;
                this.$agreeRule = mutableState5;
                this.$context = context;
                this.$showAgreeDialog = mutableState6;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                invoke(boxScope, composer, num.intValue());
                return r2.f19517a;
            }

            /* JADX WARN: Removed duplicated region for block: B:83:0x05cd  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x05d2  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x064a  */
            /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x05cf  */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(@p4.l androidx.compose.foundation.layout.BoxScope r43, @p4.m androidx.compose.runtime.Composer r44, int r45) {
                /*
                    Method dump skipped, instructions count: 1614
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.i.a.C0398a.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SoftwareKeyboardController softwareKeyboardController, MutableState<String> mutableState, MineViewModel mineViewModel, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Integer> mutableState4, MutableState<Boolean> mutableState5, Context context, MutableState<Boolean> mutableState6) {
            super(3);
            this.$softKeyboard = softwareKeyboardController;
            this.$account = mutableState;
            this.$mineViewModel = mineViewModel;
            this.$accountError = mutableState2;
            this.$code = mutableState3;
            this.$countDown = mutableState4;
            this.$agreeRule = mutableState5;
            this.$context = context;
            this.$showAgreeDialog = mutableState6;
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
                ComposerKt.traceEventStart(293242591, i5, -1, "com.yuanqi.master.mine.account.LoginScreen.<anonymous> (LoginScreen.kt:112)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -114113178, true, new C0398a(it, this.$softKeyboard, this.$account, this.$mineViewModel, this.$accountError, this.$code, this.$countDown, this.$agreeRule, this.$context, this.$showAgreeDialog)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $showAgreeDialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState<Boolean> mutableState) {
            super(0);
            this.$showAgreeDialog = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$showAgreeDialog.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $agreeRule;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState<Boolean> mutableState) {
            super(0);
            this.$agreeRule = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$agreeRule.setValue(Boolean.TRUE);
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
            i.a(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r55, @p4.m com.yuanqi.master.mine.MineViewModel r56, @p4.m androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.i.a(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
