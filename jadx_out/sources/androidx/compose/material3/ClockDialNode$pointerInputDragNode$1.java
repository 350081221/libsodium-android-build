package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.material3.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", i = {}, l = {1292}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ ClockDialNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", i = {}, l = {1296, 1298}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00611 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;
            final /* synthetic */ ClockDialNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00611(ClockDialNode clockDialNode, kotlin.coroutines.d<? super C00611> dVar) {
                super(2, dVar);
                this.this$0 = clockDialNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C00611(this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00611) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                TimePickerState timePickerState;
                TimePickerState timePickerState2;
                TimePickerState timePickerState3;
                boolean z4;
                TimePickerState timePickerState4;
                TimePickerState timePickerState5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    timePickerState = this.this$0.state;
                    int m2500getSelectionJiIwxys$material3_release = timePickerState.m2500getSelectionJiIwxys$material3_release();
                    Selection.Companion companion = Selection.Companion;
                    if (Selection.m2172equalsimpl0(m2500getSelectionJiIwxys$material3_release, companion.m2176getHourJiIwxys())) {
                        z4 = this.this$0.autoSwitchToMinute;
                        if (z4) {
                            timePickerState4 = this.this$0.state;
                            timePickerState4.m2503setSelectioniHAOin8$material3_release(companion.m2177getMinuteJiIwxys());
                            timePickerState5 = this.this$0.state;
                            this.label = 1;
                            if (timePickerState5.animateToCurrent$material3_release(this) == l5) {
                                return l5;
                            }
                        }
                    }
                    timePickerState2 = this.this$0.state;
                    if (Selection.m2172equalsimpl0(timePickerState2.m2500getSelectionJiIwxys$material3_release(), companion.m2177getMinuteJiIwxys())) {
                        timePickerState3 = this.this$0.state;
                        this.label = 2;
                        if (timePickerState3.settle(this) == l5) {
                            return l5;
                        }
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClockDialNode clockDialNode) {
            super(0);
            this.this$0 = clockDialNode;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.k.f(this.this$0.getCoroutineScope(), null, null, new C00611(this.this$0, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous parameter 0>", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.p<PointerInputChange, Offset, r2> {
        final /* synthetic */ ClockDialNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1305}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ long $dragAmount;
            int label;
            final /* synthetic */ ClockDialNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ClockDialNode clockDialNode, long j5, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = clockDialNode;
                this.$dragAmount = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$dragAmount, dVar);
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
                float f5;
                float f6;
                TimePickerState timePickerState;
                float f7;
                TimePickerState timePickerState2;
                float f8;
                TimePickerState timePickerState3;
                float atan;
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
                    ClockDialNode clockDialNode = this.this$0;
                    f5 = clockDialNode.offsetX;
                    clockDialNode.offsetX = f5 + Offset.m3493getXimpl(this.$dragAmount);
                    ClockDialNode clockDialNode2 = this.this$0;
                    f6 = clockDialNode2.offsetY;
                    clockDialNode2.offsetY = f6 + Offset.m3494getYimpl(this.$dragAmount);
                    timePickerState = this.this$0.state;
                    f7 = this.this$0.offsetY;
                    timePickerState2 = this.this$0.state;
                    float m6173getYimpl = f7 - IntOffset.m6173getYimpl(timePickerState2.m2499getCenternOccac$material3_release());
                    f8 = this.this$0.offsetX;
                    timePickerState3 = this.this$0.state;
                    atan = TimePickerKt.atan(m6173getYimpl, f8 - IntOffset.m6172getXimpl(timePickerState3.m2499getCenternOccac$material3_release()));
                    this.label = 1;
                    if (TimePickerState.update$material3_release$default(timePickerState, atan, false, this, 2, null) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClockDialNode clockDialNode) {
            super(2);
            this.this$0 = clockDialNode;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
            m1674invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m1674invokeUv8p0NA(@p4.l PointerInputChange pointerInputChange, long j5) {
            TimePickerState timePickerState;
            float f5;
            float f6;
            float maxDist;
            kotlinx.coroutines.k.f(this.this$0.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, j5, null), 3, null);
            timePickerState = this.this$0.state;
            f5 = this.this$0.offsetX;
            f6 = this.this$0.offsetY;
            maxDist = this.this$0.getMaxDist();
            timePickerState.moveSelector$material3_release(f5, f6, maxDist);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, kotlin.coroutines.d<? super ClockDialNode$pointerInputDragNode$1> dVar) {
        super(2, dVar);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, dVar);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, anonymousClass1, null, anonymousClass2, this, 5, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
