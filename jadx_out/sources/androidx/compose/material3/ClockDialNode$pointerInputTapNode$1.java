package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.uc.crashsdk.export.LogType;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", f = "TimePicker.kt", i = {}, l = {LogType.UNEXP_ANR}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.q<PressGestureScope, Offset, kotlin.coroutines.d<? super r2>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClockDialNode clockDialNode, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.this$0 = clockDialNode;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, kotlin.coroutines.d<? super r2> dVar) {
            return m1675invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
        }

        @p4.m
        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1675invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.J$0 = j5;
            return anonymousClass1.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                long j5 = this.J$0;
                this.this$0.offsetX = Offset.m3493getXimpl(j5);
                this.this$0.offsetY = Offset.m3494getYimpl(j5);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Offset, r2> {
        final /* synthetic */ ClockDialNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1286}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ long $it;
            int label;
            final /* synthetic */ ClockDialNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ClockDialNode clockDialNode, long j5, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = clockDialNode;
                this.$it = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$it, dVar);
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
                TimePickerState timePickerState;
                float maxDist;
                boolean z4;
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
                    timePickerState = this.this$0.state;
                    float m3493getXimpl = Offset.m3493getXimpl(this.$it);
                    float m3494getYimpl = Offset.m3494getYimpl(this.$it);
                    maxDist = this.this$0.getMaxDist();
                    z4 = this.this$0.autoSwitchToMinute;
                    this.label = 1;
                    if (timePickerState.onTap$material3_release(m3493getXimpl, m3494getYimpl, maxDist, z4, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClockDialNode clockDialNode) {
            super(1);
            this.this$0 = clockDialNode;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
            m1676invokek4lQ0M(offset.m3503unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1676invokek4lQ0M(long j5) {
            kotlinx.coroutines.k.f(this.this$0.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, j5, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, kotlin.coroutines.d<? super ClockDialNode$pointerInputTapNode$1> dVar) {
        super(2, dVar);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, dVar);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((ClockDialNode$pointerInputTapNode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, anonymousClass2, this, 3, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
