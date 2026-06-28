package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {987}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<l<Boolean, r2>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<p<Boolean, Float, r2>> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {988}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ State<l<Boolean, r2>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<p<Boolean, Float, r2>> $onDrag;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {989, 999, PointerIconCompat.TYPE_ZOOM_IN}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00471 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            final /* synthetic */ State<l<Boolean, r2>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<p<Boolean, Float, r2>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1035}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
                final /* synthetic */ k1.a $draggingStart;
                final /* synthetic */ DragInteraction $finishInteraction;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RangeSliderLogic rangeSliderLogic, k1.a aVar, DragInteraction dragInteraction, d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$draggingStart = aVar;
                    this.$finishInteraction = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                    return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                    return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                        MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                        DragInteraction dragInteraction = this.$finishInteraction;
                        this.label = 1;
                        if (activeInteraction.emit(dragInteraction, this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00471(boolean z4, float f5, RangeSliderLogic rangeSliderLogic, State<Float> state, s0 s0Var, State<? extends l<? super Boolean, r2>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, r2>> state4, d<? super C00471> dVar) {
                super(2, dVar);
                this.$isRtl = z4;
                this.$maxPx = f5;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$$this$coroutineScope = s0Var;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                C00471 c00471 = new C00471(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, dVar);
                c00471.L$0 = obj;
                return c00471;
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
                return ((C00471) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0186 A[Catch: CancellationException -> 0x0192, TryCatch #0 {CancellationException -> 0x0192, blocks: (B:10:0x017e, B:12:0x0186, B:16:0x018c, B:43:0x015e), top: B:42:0x015e }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x018c A[Catch: CancellationException -> 0x0192, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0192, blocks: (B:10:0x017e, B:12:0x0186, B:16:0x018c, B:43:0x015e), top: B:42:0x015e }] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x017d A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 446
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00471.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, boolean z4, float f5, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends l<? super Boolean, r2>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, r2>> state4, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z4;
            this.$maxPx = f5;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$rawOffsetStart = state;
            this.$gestureEndAction = state2;
            this.$rawOffsetEnd = state3;
            this.$onDrag = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                s0 s0Var = (s0) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C00471 c00471 = new C00471(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, s0Var, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00471, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends p<? super Boolean, ? super Float, r2>> state3, boolean z4, float f5, State<? extends l<? super Boolean, r2>> state4, d<? super SliderKt$rangeSliderPressDragModifier$1> dVar) {
        super(2, dVar);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = state3;
        this.$isRtl = z4;
        this.$maxPx = f5;
        this.$gestureEndAction = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, dVar);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
