package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, d<? super Ripple$rememberUpdatedInstance$1> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, dVar);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            final s0 s0Var = (s0) this.L$0;
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Interaction) obj2, (d<? super r2>) dVar);
                }

                @m
                public final Object emit(@l Interaction interaction, @l d<? super r2> dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction, s0Var);
                    } else if (interaction instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        RippleIndicationInstance.this.updateStateLayer$material_ripple_release(interaction, s0Var);
                    }
                    return r2.f19517a;
                }
            };
            this.label = 1;
            if (interactions.collect(jVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
