package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwitchKt$Switch$2$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<l<Boolean, r2>> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SwitchKt$Switch$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<Boolean> {
        final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<Boolean> anchoredDraggableState) {
            super(0);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return this.$anchoredDraggableState.getCurrentValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SwitchKt$Switch$2$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "newValue", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SwitchKt$Switch$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<Boolean, d<? super r2>, Object> {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<l<Boolean, r2>> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(State<Boolean> state, State<? extends l<? super Boolean, r2>> state2, MutableState<Boolean> mutableState, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$currentChecked$delegate = state;
            this.$currentOnCheckedChange$delegate = state2;
            this.$forceAnimationCheck$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, dVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super r2> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @m
        public final Object invoke(boolean z4, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z4), dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            boolean Switch$lambda$8;
            l Switch$lambda$7;
            boolean Switch$lambda$3;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                boolean z4 = this.Z$0;
                Switch$lambda$8 = SwitchKt.Switch$lambda$8(this.$currentChecked$delegate);
                if (Switch$lambda$8 != z4) {
                    Switch$lambda$7 = SwitchKt.Switch$lambda$7(this.$currentOnCheckedChange$delegate);
                    if (Switch$lambda$7 != null) {
                        Switch$lambda$7.invoke(b.a(z4));
                    }
                    MutableState<Boolean> mutableState = this.$forceAnimationCheck$delegate;
                    Switch$lambda$3 = SwitchKt.Switch$lambda$3(mutableState);
                    SwitchKt.Switch$lambda$4(mutableState, !Switch$lambda$3);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$2$1(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends l<? super Boolean, r2>> state2, MutableState<Boolean> mutableState, d<? super SwitchKt$Switch$2$1> dVar) {
        super(2, dVar);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = state;
        this.$currentOnCheckedChange$delegate = state2;
        this.$forceAnimationCheck$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new SwitchKt$Switch$2$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((SwitchKt$Switch$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$anchoredDraggableState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null);
            this.label = 1;
            if (k.A(snapshotFlow, anonymousClass2, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
