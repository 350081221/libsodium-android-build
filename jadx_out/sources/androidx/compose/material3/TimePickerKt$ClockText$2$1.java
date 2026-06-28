package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TimePickerKt$ClockText$2$1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ MutableState<Offset> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<Boolean> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ MutableState<Offset> $center$delegate;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ s0 $scope;
        final /* synthetic */ TimePickerState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00711 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ MutableState<Offset> $center$delegate;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ TimePickerState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00711(TimePickerState timePickerState, float f5, boolean z4, MutableState<Offset> mutableState, kotlin.coroutines.d<? super C00711> dVar) {
                super(2, dVar);
                this.$state = timePickerState;
                this.$maxDist = f5;
                this.$autoSwitchToMinute = z4;
                this.$center$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C00711(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00711) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                long ClockText$lambda$28;
                long ClockText$lambda$282;
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
                    TimePickerState timePickerState = this.$state;
                    ClockText$lambda$28 = TimePickerKt.ClockText$lambda$28(this.$center$delegate);
                    float m3493getXimpl = Offset.m3493getXimpl(ClockText$lambda$28);
                    ClockText$lambda$282 = TimePickerKt.ClockText$lambda$28(this.$center$delegate);
                    float m3494getYimpl = Offset.m3494getYimpl(ClockText$lambda$282);
                    float f5 = this.$maxDist;
                    boolean z4 = this.$autoSwitchToMinute;
                    this.label = 1;
                    if (timePickerState.onTap$material3_release(m3493getXimpl, m3494getYimpl, f5, z4, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s0 s0Var, TimePickerState timePickerState, float f5, boolean z4, MutableState<Offset> mutableState) {
            super(0);
            this.$scope = s0Var;
            this.$state = timePickerState;
            this.$maxDist = f5;
            this.$autoSwitchToMinute = z4;
            this.$center$delegate = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            kotlinx.coroutines.k.f(this.$scope, null, null, new C00711(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, null), 3, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1(boolean z4, s0 s0Var, TimePickerState timePickerState, float f5, boolean z5, MutableState<Offset> mutableState) {
        super(1);
        this.$selected = z4;
        this.$scope = s0Var;
        this.$state = timePickerState;
        this.$maxDist = f5;
        this.$autoSwitchToMinute = z5;
        this.$center$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate), 1, null);
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.$selected);
    }
}
