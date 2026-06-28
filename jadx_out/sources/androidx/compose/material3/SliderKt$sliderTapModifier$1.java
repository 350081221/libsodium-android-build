package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.e1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", i = {}, l = {1469}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ SliderState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.q<PressGestureScope, Offset, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ SliderState $state;
        /* synthetic */ long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderState sliderState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$state = sliderState;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, kotlin.coroutines.d<? super r2> dVar) {
            return m2204invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
        }

        @p4.m
        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m2204invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, dVar);
            anonymousClass1.J$0 = j5;
            return anonymousClass1.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$state.m2217onPressk4lQ0M$material3_release(this.J$0);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Offset, r2> {
        final /* synthetic */ SliderState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SliderState sliderState) {
            super(1);
            this.$state = sliderState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
            m2205invokek4lQ0M(offset.m3503unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m2205invokek4lQ0M(long j5) {
            this.$state.dispatchRawDelta(0.0f);
            this.$state.getGestureEndAction$material3_release().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$1(SliderState sliderState, kotlin.coroutines.d<? super SliderKt$sliderTapModifier$1> dVar) {
        super(2, dVar);
        this.$state = sliderState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        SliderKt$sliderTapModifier$1 sliderKt$sliderTapModifier$1 = new SliderKt$sliderTapModifier$1(this.$state, dVar);
        sliderKt$sliderTapModifier$1.L$0 = obj;
        return sliderKt$sliderTapModifier$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((SliderKt$sliderTapModifier$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, anonymousClass2, this, 3, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
