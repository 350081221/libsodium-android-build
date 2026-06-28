package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
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
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends o implements p<s0, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<Offset> {
        final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
            super(0);
            this.this$0 = textFieldMagnifierNodeImpl28;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m3482boximpl(m1164invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m1164invokeF1C5BW0() {
            TransformedTextFieldState transformedTextFieldState;
            TextFieldSelectionState textFieldSelectionState;
            TextLayoutState textLayoutState;
            long m1160getMagnifierSizeYbymL2g;
            transformedTextFieldState = this.this$0.textFieldState;
            textFieldSelectionState = this.this$0.textFieldSelectionState;
            textLayoutState = this.this$0.textLayoutState;
            m1160getMagnifierSizeYbymL2g = this.this$0.m1160getMagnifierSizeYbymL2g();
            return TextFieldMagnifierKt.m1157calculateSelectionMagnifierCenterAndroidhUlJWOE(transformedTextFieldState, textFieldSelectionState, textLayoutState, m1160getMagnifierSizeYbymL2g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, d<? super TextFieldMagnifierNodeImpl28$restartAnimationJob$1> dVar) {
        super(2, dVar);
        this.this$0 = textFieldMagnifierNodeImpl28;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.this$0, dVar);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.L$0 = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0));
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            j jVar = new j() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2

                /* JADX INFO: Access modifiers changed from: package-private */
                @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
                    final /* synthetic */ long $targetValue;
                    int label;
                    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j5, d<? super AnonymousClass1> dVar) {
                        super(2, dVar);
                        this.this$0 = textFieldMagnifierNodeImpl28;
                        this.$targetValue = j5;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d<r2> create(@m Object obj, @l d<?> dVar) {
                        return new AnonymousClass1(this.this$0, this.$targetValue, dVar);
                    }

                    @Override // v3.p
                    @m
                    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                        return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object obj) {
                        Object l5;
                        Animatable animatable;
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
                            animatable = this.this$0.animatable;
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
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return m1165emit3MmeM6k(((Offset) obj2).m3503unboximpl(), dVar);
                }

                @m
                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1165emit3MmeM6k(long j5, @l d<? super r2> dVar) {
                    Animatable animatable;
                    Animatable animatable2;
                    Object l6;
                    Animatable animatable3;
                    boolean z4;
                    animatable = TextFieldMagnifierNodeImpl28.this.animatable;
                    if (OffsetKt.m3512isSpecifiedk4lQ0M(((Offset) animatable.getValue()).m3503unboximpl()) && OffsetKt.m3512isSpecifiedk4lQ0M(j5)) {
                        animatable3 = TextFieldMagnifierNodeImpl28.this.animatable;
                        if (Offset.m3494getYimpl(((Offset) animatable3.getValue()).m3503unboximpl()) == Offset.m3494getYimpl(j5)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            k.f(s0Var, null, null, new AnonymousClass1(TextFieldMagnifierNodeImpl28.this, j5, null), 3, null);
                            return r2.f19517a;
                        }
                    }
                    animatable2 = TextFieldMagnifierNodeImpl28.this.animatable;
                    Object snapTo = animatable2.snapTo(Offset.m3482boximpl(j5), dVar);
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
