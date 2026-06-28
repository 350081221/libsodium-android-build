package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
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
import kotlinx.coroutines.flow.j;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {803}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/runtime/ProduceStateScope;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends o implements p<ProduceStateScope<Boolean>, d<? super r2>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<p<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<Boolean> {
        final /* synthetic */ Transition<EnterExitState> $childTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition<EnterExitState> transition) {
            super(0);
            this.$childTransition = transition;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final Boolean invoke() {
            boolean exitFinished;
            exitFinished = AnimatedVisibilityKt.getExitFinished(this.$childTransition);
            return Boolean.valueOf(exitFinished);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, State<? extends p<? super EnterExitState, ? super EnterExitState, Boolean>> state, d<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> dVar) {
        super(2, dVar);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, dVar);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ProduceStateScope<Boolean> produceStateScope, @m d<? super r2> dVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(produceStateScope, dVar)).invokeSuspend(r2.f19517a);
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
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$childTransition));
            final Transition<EnterExitState> transition = this.$childTransition;
            final State<p<EnterExitState, EnterExitState, Boolean>> state = this.$shouldDisposeBlockUpdated$delegate;
            j jVar = new j() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), (d<? super r2>) dVar);
                }

                @m
                public final Object emit(boolean z4, @l d<? super r2> dVar) {
                    boolean z5;
                    p AnimatedEnterExitImpl$lambda$4;
                    ProduceStateScope<Boolean> produceStateScope2 = produceStateScope;
                    if (z4) {
                        AnimatedEnterExitImpl$lambda$4 = AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$4(state);
                        z5 = ((Boolean) AnimatedEnterExitImpl$lambda$4.invoke(transition.getCurrentState(), transition.getTargetState())).booleanValue();
                    } else {
                        z5 = false;
                    }
                    produceStateScope2.setValue(b.a(z5));
                    return r2.f19517a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(jVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
