package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation$elevation$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$2(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, d<? super DefaultFloatingActionButtonElevation$elevation$2> dVar) {
        super(2, dVar);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        DefaultFloatingActionButtonElevation$elevation$2 defaultFloatingActionButtonElevation$elevation$2 = new DefaultFloatingActionButtonElevation$elevation$2(this.$interactionSource, this.$animatable, dVar);
        defaultFloatingActionButtonElevation$elevation$2.L$0 = obj;
        return defaultFloatingActionButtonElevation$elevation$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            final ArrayList arrayList = new ArrayList();
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2.1

                /* JADX INFO: Access modifiers changed from: package-private */
                @f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1", f = "FloatingActionButton.kt", i = {}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00411 extends o implements p<s0, d<? super r2>, Object> {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00411(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, d<? super C00411> dVar) {
                        super(2, dVar);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d<r2> create(@m Object obj, @l d<?> dVar) {
                        return new C00411(this.$animatable, this.$targetInteraction, dVar);
                    }

                    @Override // v3.p
                    @m
                    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                        return ((C00411) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Interaction) obj2, (d<? super r2>) dVar);
                }

                @m
                public final Object emit(@l Interaction interaction, @l d<? super r2> dVar) {
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
                    s32 = e0.s3(arrayList);
                    k.f(s0Var, null, null, new C00411(floatingActionButtonElevationAnimatable, (Interaction) s32, null), 3, null);
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
