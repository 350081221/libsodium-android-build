package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LabelKt$HandleInteractions$1$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ BasicTooltipState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<Interaction, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ BasicTooltipState $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$state = basicTooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l Interaction interaction, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(interaction, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            boolean z4;
            boolean z5;
            boolean z6;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            boolean z7 = true;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                Interaction interaction = (Interaction) this.L$0;
                if (interaction instanceof PressInteraction.Press) {
                    z4 = true;
                } else {
                    z4 = interaction instanceof DragInteraction.Start;
                }
                if (z4) {
                    z5 = true;
                } else {
                    z5 = interaction instanceof HoverInteraction.Enter;
                }
                if (z5) {
                    BasicTooltipState basicTooltipState = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    if (basicTooltipState.show(mutatePriority, this) == l5) {
                        return l5;
                    }
                } else {
                    if (interaction instanceof PressInteraction.Release) {
                        z6 = true;
                    } else {
                        z6 = interaction instanceof DragInteraction.Stop;
                    }
                    if (!z6) {
                        z7 = interaction instanceof HoverInteraction.Exit;
                    }
                    if (z7) {
                        this.$state.dismiss();
                    }
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super LabelKt$HandleInteractions$1$1> dVar) {
        super(2, dVar);
        this.$interactionSource = mutableInteractionSource;
        this.$state = basicTooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, this.$state, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((LabelKt$HandleInteractions$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            kotlinx.coroutines.flow.i<Interaction> interactions = this.$interactionSource.getInteractions();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.A(interactions, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
