package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.b;
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
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1195:1\n487#2,4:1196\n491#2,2:1204\n495#2:1210\n25#3:1200\n1116#4,3:1201\n1119#4,3:1207\n487#5:1206\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n*L\n912#1:1196,4\n912#1:1204,2\n912#1:1210\n912#1:1200\n912#1:1201,3\n912#1:1207,3\n912#1:1206\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<l<Float, r2>> $gestureEndAction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {914}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
        final /* synthetic */ DraggableState $draggableState;
        final /* synthetic */ State<l<Float, r2>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        final /* synthetic */ s0 $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {919}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pos", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00481 extends o implements q<PressGestureScope, Offset, d<? super r2>, Object> {
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ MutableState<Float> $pressOffset;
            final /* synthetic */ State<Float> $rawOffset;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00481(boolean z4, float f5, MutableState<Float> mutableState, State<Float> state, d<? super C00481> dVar) {
                super(3, dVar);
                this.$isRtl = z4;
                this.$maxPx = f5;
                this.$pressOffset = mutableState;
                this.$rawOffset = state;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, d<? super r2> dVar) {
                return m1434invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
            }

            @m
            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m1434invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @m d<? super r2> dVar) {
                C00481 c00481 = new C00481(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, dVar);
                c00481.L$0 = pressGestureScope;
                c00481.J$0 = j5;
                return c00481.invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                float m3493getXimpl;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            e1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        e1.n(obj);
                        PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                        long j5 = this.J$0;
                        if (this.$isRtl) {
                            m3493getXimpl = this.$maxPx - Offset.m3493getXimpl(j5);
                        } else {
                            m3493getXimpl = Offset.m3493getXimpl(j5);
                        }
                        this.$pressOffset.setValue(b.e(m3493getXimpl - this.$rawOffset.getValue().floatValue()));
                        this.label = 1;
                        if (pressGestureScope.awaitRelease(this) == l5) {
                            return l5;
                        }
                    }
                } catch (GestureCancellationException unused) {
                    this.$pressOffset.setValue(b.e(0.0f));
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements l<Offset, r2> {
            final /* synthetic */ DraggableState $draggableState;
            final /* synthetic */ State<l<Float, r2>> $gestureEndAction;
            final /* synthetic */ s0 $scope;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {926}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00491 extends o implements p<s0, d<? super r2>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<l<Float, r2>> $gestureEndAction;
                int label;

                /* JADX INFO: Access modifiers changed from: package-private */
                @f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00501 extends o implements p<DragScope, d<? super r2>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C00501(d<? super C00501> dVar) {
                        super(2, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                        C00501 c00501 = new C00501(dVar);
                        c00501.L$0 = obj;
                        return c00501;
                    }

                    @Override // v3.p
                    @m
                    public final Object invoke(@p4.l DragScope dragScope, @m d<? super r2> dVar) {
                        return ((C00501) create(dragScope, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        kotlin.coroutines.intrinsics.d.l();
                        if (this.label == 0) {
                            e1.n(obj);
                            ((DragScope) this.L$0).dragBy(0.0f);
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00491(DraggableState draggableState, State<? extends l<? super Float, r2>> state, d<? super C00491> dVar) {
                    super(2, dVar);
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                    return new C00491(this.$draggableState, this.$gestureEndAction, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                    return ((C00491) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                        DraggableState draggableState = this.$draggableState;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        C00501 c00501 = new C00501(null);
                        this.label = 1;
                        if (draggableState.drag(mutatePriority, c00501, this) == l5) {
                            return l5;
                        }
                    }
                    this.$gestureEndAction.getValue().invoke(b.e(0.0f));
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(s0 s0Var, DraggableState draggableState, State<? extends l<? super Float, r2>> state) {
                super(1);
                this.$scope = s0Var;
                this.$draggableState = draggableState;
                this.$gestureEndAction = state;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                m1435invokek4lQ0M(offset.m3503unboximpl());
                return r2.f19517a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1435invokek4lQ0M(long j5) {
                k.f(this.$scope, null, null, new C00491(this.$draggableState, this.$gestureEndAction, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z4, float f5, MutableState<Float> mutableState, State<Float> state, s0 s0Var, DraggableState draggableState, State<? extends l<? super Float, r2>> state2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$isRtl = z4;
            this.$maxPx = f5;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
            this.$scope = s0Var;
            this.$draggableState = draggableState;
            this.$gestureEndAction = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                C00481 c00481 = new C00481(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$draggableState, this.$gestureEndAction);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00481, anonymousClass2, this, 3, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderTapModifier$2(boolean z4, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f5, boolean z5, MutableState<Float> mutableState, State<Float> state, State<? extends l<? super Float, r2>> state2) {
        super(3);
        this.$enabled = z4;
        this.$draggableState = draggableState;
        this.$interactionSource = mutableInteractionSource;
        this.$maxPx = f5;
        this.$isRtl = z5;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$gestureEndAction = state2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1945228890);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1945228890, i5, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:910)");
        }
        if (this.$enabled) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            modifier = SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{this.$draggableState, this.$interactionSource, Float.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)}, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, coroutineScope, this.$draggableState, this.$gestureEndAction, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
