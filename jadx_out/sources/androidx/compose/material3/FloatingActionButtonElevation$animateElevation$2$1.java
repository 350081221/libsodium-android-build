package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import java.util.ArrayList;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FloatingActionButtonElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.d<? super FloatingActionButtonElevation$animateElevation$2$1> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.$interactionSource, this.$animatable, dVar);
        floatingActionButtonElevation$animateElevation$2$1.L$0 = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            final s0 s0Var = (s0) this.L$0;
            final ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.i<Interaction> interactions = this.$interactionSource.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            kotlinx.coroutines.flow.j<? super Interaction> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
                @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00661 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00661(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, kotlin.coroutines.d<? super C00661> dVar) {
                        super(2, dVar);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        return new C00661(this.$animatable, this.$targetInteraction, dVar);
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((C00661) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            Interaction interaction = this.$targetInteraction;
                            this.label = 1;
                            if (floatingActionButtonElevationAnimatable.animateElevation(interaction, this) == l5) {
                                return l5;
                            }
                        }
                        return r2.f19517a;
                    }
                }

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit((Interaction) obj2, (kotlin.coroutines.d<? super r2>) dVar);
                }

                @p4.m
                public final Object emit(@p4.l Interaction interaction, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                    Object s32;
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    s32 = kotlin.collections.e0.s3(arrayList);
                    kotlinx.coroutines.k.f(s0Var, null, null, new C00661(floatingActionButtonElevationAnimatable, (Interaction) s32, null), 3, null);
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
