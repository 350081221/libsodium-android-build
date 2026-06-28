package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<Offset> {
        final /* synthetic */ State<Offset> $targetValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<Offset> state) {
            super(0);
            this.$targetValue$delegate = state;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m3482boximpl(m1001invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m1001invokeF1C5BW0() {
            return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(this.$targetValue$delegate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, kotlin.coroutines.d<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> dVar) {
        super(2, dVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, dVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$targetValue$delegate));
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            j jVar = new j() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j5, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                        super(2, dVar);
                        this.$animatable = animatable;
                        this.$targetValue = j5;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, dVar);
                    }

                    @Override // v3.p
                    @m
                    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                        return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                            Offset m3482boximpl = Offset.m3482boximpl(this.$targetValue);
                            SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                            this.label = 1;
                            if (Animatable.animateTo$default(animatable, m3482boximpl, magnifierSpringSpec, null, null, this, 12, null) == l5) {
                                return l5;
                            }
                        }
                        return r2.f19517a;
                    }
                }

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return m1002emit3MmeM6k(((Offset) obj2).m3503unboximpl(), dVar);
                }

                @m
                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1002emit3MmeM6k(long j5, @l kotlin.coroutines.d<? super r2> dVar) {
                    Object l6;
                    boolean z4;
                    if (OffsetKt.m3512isSpecifiedk4lQ0M(animatable.getValue().m3503unboximpl()) && OffsetKt.m3512isSpecifiedk4lQ0M(j5)) {
                        if (Offset.m3494getYimpl(animatable.getValue().m3503unboximpl()) == Offset.m3494getYimpl(j5)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            k.f(s0Var, null, null, new AnonymousClass1(animatable, j5, null), 3, null);
                            return r2.f19517a;
                        }
                    }
                    Object snapTo = animatable.snapTo(Offset.m3482boximpl(j5), dVar);
                    l6 = kotlin.coroutines.intrinsics.d.l();
                    if (snapTo == l6) {
                        return snapTo;
                    }
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
