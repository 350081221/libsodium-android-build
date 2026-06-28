package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
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

@f(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DragInteractionKt$collectIsDraggedAsState$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ MutableState<Boolean> $isDragged;
    final /* synthetic */ InteractionSource $this_collectIsDraggedAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, d<? super DragInteractionKt$collectIsDraggedAsState$1$1> dVar) {
        super(2, dVar);
        this.$this_collectIsDraggedAsState = interactionSource;
        this.$isDragged = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new DragInteractionKt$collectIsDraggedAsState$1$1(this.$this_collectIsDraggedAsState, this.$isDragged, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((DragInteractionKt$collectIsDraggedAsState$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            final ArrayList arrayList = new ArrayList();
            i<Interaction> interactions = this.$this_collectIsDraggedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isDragged;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Interaction) obj2, (d<? super r2>) dVar);
                }

                @m
                public final Object emit(@l Interaction interaction, @l d<? super r2> dVar) {
                    if (interaction instanceof DragInteraction.Start) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        arrayList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        arrayList.remove(((DragInteraction.Cancel) interaction).getStart());
                    }
                    mutableState.setValue(b.a(!arrayList.isEmpty()));
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
