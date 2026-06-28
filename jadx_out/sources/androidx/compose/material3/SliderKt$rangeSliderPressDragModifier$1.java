package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ RangeSliderState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1497}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ RangeSliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1498, 1509, 1528}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00691 extends kotlin.coroutines.jvm.internal.k implements v3.p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ RangeSliderState $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ k1.a $draggingStart;
                final /* synthetic */ DragInteraction $finishInteraction;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RangeSliderLogic rangeSliderLogic, k1.a aVar, DragInteraction dragInteraction, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$draggingStart = aVar;
                    this.$finishInteraction = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
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
            C00691(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, s0 s0Var, kotlin.coroutines.d<? super C00691> dVar) {
                super(2, dVar);
                this.$state = rangeSliderState;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$$this$coroutineScope = s0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C00691 c00691 = new C00691(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, dVar);
                c00691.L$0 = obj;
                return c00691;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00691) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x016c A[Catch: CancellationException -> 0x017a, TryCatch #1 {CancellationException -> 0x017a, blocks: (B:8:0x001b, B:9:0x0164, B:11:0x016c, B:15:0x0172), top: B:7:0x001b }] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0172 A[Catch: CancellationException -> 0x017a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x017a, blocks: (B:8:0x001b, B:9:0x0164, B:11:0x016c, B:15:0x0172), top: B:7:0x001b }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0161 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0162  */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 417
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00691.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = rangeSliderState;
            this.$rangeSliderLogic = rangeSliderLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
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
                C00691 c00691 = new C00691(this.$state, this.$rangeSliderLogic, s0Var, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00691, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, kotlin.coroutines.d<? super SliderKt$rangeSliderPressDragModifier$1> dVar) {
        super(2, dVar);
        this.$state = rangeSliderState;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$state, this.$startInteractionSource, this.$endInteractionSource, dVar);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource), null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
