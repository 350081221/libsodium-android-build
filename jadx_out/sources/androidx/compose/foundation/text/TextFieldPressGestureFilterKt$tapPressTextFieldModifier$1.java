package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,85:1\n487#2,4:86\n491#2,2:94\n495#2:100\n25#3:90\n25#3:101\n1116#4,3:91\n1119#4,3:97\n1116#4,6:102\n1116#4,6:108\n487#5:96\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n41#1:86,4\n41#1:94,2\n41#1:100\n41#1:90\n42#1:101\n41#1:91,3\n41#1:97,3\n42#1:102,6\n44#1:108,6\n41#1:96\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ l<Offset, r2> $onTap;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<PointerInputScope, d<? super r2>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ State<l<Offset, r2>> $onTapState;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        final /* synthetic */ s0 $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends o implements q<PressGestureScope, Offset, d<? super r2>, Object> {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            final /* synthetic */ s0 $scope;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00261 extends o implements p<s0, d<? super r2>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ long $it;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00261(MutableState<PressInteraction.Press> mutableState, long j5, MutableInteractionSource mutableInteractionSource, d<? super C00261> dVar) {
                    super(2, dVar);
                    this.$pressedInteraction = mutableState;
                    this.$it = j5;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                    return new C00261(this.$pressedInteraction, this.$it, this.$interactionSource, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                    return ((C00261) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r7.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r0 = r7.L$0
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                        kotlin.e1.n(r8)
                        goto L66
                    L17:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1f:
                        java.lang.Object r1 = r7.L$0
                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                        kotlin.e1.n(r8)
                        goto L4b
                    L27:
                        kotlin.e1.n(r8)
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                        java.lang.Object r8 = r8.getValue()
                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                        if (r8 == 0) goto L4f
                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r8)
                        if (r1 == 0) goto L4c
                        r7.L$0 = r5
                        r7.label = r4
                        java.lang.Object r8 = r1.emit(r6, r7)
                        if (r8 != r0) goto L4a
                        return r0
                    L4a:
                        r1 = r5
                    L4b:
                        r5 = r1
                    L4c:
                        r5.setValue(r2)
                    L4f:
                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                        long r4 = r7.$it
                        r8.<init>(r4, r2)
                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                        if (r1 == 0) goto L67
                        r7.L$0 = r8
                        r7.label = r3
                        java.lang.Object r1 = r1.emit(r8, r7)
                        if (r1 != r0) goto L65
                        return r0
                    L65:
                        r0 = r8
                    L66:
                        r8 = r0
                    L67:
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                        r0.setValue(r8)
                        kotlin.r2 r8 = kotlin.r2.f19517a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.AnonymousClass2.AnonymousClass1.C00261.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00272 extends o implements p<s0, d<? super r2>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ boolean $success;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00272(MutableState<PressInteraction.Press> mutableState, boolean z4, MutableInteractionSource mutableInteractionSource, d<? super C00272> dVar) {
                    super(2, dVar);
                    this.$pressedInteraction = mutableState;
                    this.$success = z4;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                    return new C00272(this.$pressedInteraction, this.$success, this.$interactionSource, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                    return ((C00272) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    MutableState<PressInteraction.Press> mutableState;
                    Interaction cancel;
                    MutableState<PressInteraction.Press> mutableState2;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            mutableState2 = (MutableState) this.L$0;
                            e1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        e1.n(obj);
                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                        if (value != null) {
                            boolean z4 = this.$success;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            mutableState = this.$pressedInteraction;
                            if (z4) {
                                cancel = new PressInteraction.Release(value);
                            } else {
                                cancel = new PressInteraction.Cancel(value);
                            }
                            if (mutableInteractionSource != null) {
                                this.L$0 = mutableState;
                                this.label = 1;
                                if (mutableInteractionSource.emit(cancel, this) == l5) {
                                    return l5;
                                }
                                mutableState2 = mutableState;
                            }
                            mutableState.setValue(null);
                        }
                        return r2.f19517a;
                    }
                    mutableState = mutableState2;
                    mutableState.setValue(null);
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(s0 s0Var, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.$scope = s0Var;
                this.$pressedInteraction = mutableState;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, d<? super r2> dVar) {
                return m914invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
            }

            @m
            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m914invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @m d<? super r2> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, dVar);
                anonymousClass1.L$0 = pressGestureScope;
                anonymousClass1.J$0 = j5;
                return anonymousClass1.invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
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
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    k.f(this.$scope, null, null, new C00261(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                    this.label = 1;
                    obj = pressGestureScope.tryAwaitRelease(this);
                    if (obj == l5) {
                        return l5;
                    }
                }
                k.f(this.$scope, null, null, new C00272(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00282 extends n0 implements l<Offset, r2> {
            final /* synthetic */ State<l<Offset, r2>> $onTapState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00282(State<? extends l<? super Offset, r2>> state) {
                super(1);
                this.$onTapState = state;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                m915invokek4lQ0M(offset.m3503unboximpl());
                return r2.f19517a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m915invokek4lQ0M(long j5) {
                this.$onTapState.getValue().invoke(Offset.m3482boximpl(j5));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(s0 s0Var, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends l<? super Offset, r2>> state, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$scope = s0Var;
            this.$pressedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
            this.$onTapState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                C00282 c00282 = new C00282(this.$onTapState);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, c00282, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(l<? super Offset, r2> lVar, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$onTap = lVar;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-102778667);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-102778667, i5, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onTap, composer, 0);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        composer.startReplaceableGroup(-585649902);
        boolean changed = composer.changed(mutableState) | composer.changed(this.$interactionSource);
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(mutableState, mutableInteractionSource2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(mutableInteractionSource, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource3, rememberUpdatedState, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
