package androidx.compose.material;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.android.dx.io.Opcodes;
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

@f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", i = {}, l = {Opcodes.SHL_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, d<? super SwitchKt$SwitchImpl$1$1> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SwitchKt$SwitchImpl$1$1(this.$interactionSource, this.$interactions, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SwitchKt$SwitchImpl$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$1$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Interaction) obj2, (d<? super r2>) dVar);
                }

                @m
                public final Object emit(@l Interaction interaction, @l d<? super r2> dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList.remove(((DragInteraction.Cancel) interaction).getStart());
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
