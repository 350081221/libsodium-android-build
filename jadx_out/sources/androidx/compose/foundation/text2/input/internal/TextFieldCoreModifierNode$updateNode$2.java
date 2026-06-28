package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.runtime.SnapshotStateKt;
import com.android.dx.io.Opcodes;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2", f = "TextFieldCoreModifier.kt", i = {}, l = {Opcodes.USHR_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateNode$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ TransformedTextFieldState $textFieldState;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1", f = "TextFieldCoreModifier.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ TransformedTextFieldState $textFieldState;
        int label;
        final /* synthetic */ TextFieldCoreModifierNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00321 extends n0 implements v3.a<TextFieldCharSequence> {
            final /* synthetic */ TransformedTextFieldState $textFieldState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00321(TransformedTextFieldState transformedTextFieldState) {
                super(0);
                this.$textFieldState = transformedTextFieldState;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @l
            public final TextFieldCharSequence invoke() {
                return this.$textFieldState.getText();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {230, 232}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends o implements p<TextFieldCharSequence, d<? super r2>, Object> {
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new AnonymousClass2(this.this$0, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l TextFieldCharSequence textFieldCharSequence, @m d<? super r2> dVar) {
                return ((AnonymousClass2) create(textFieldCharSequence, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                Object l5;
                Animatable animatable;
                Animatable animatable2;
                AnimationSpec animationSpec;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            e1.n(obj);
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    animatable = this.this$0.cursorAlpha;
                    Float e5 = kotlin.coroutines.jvm.internal.b.e(1.0f);
                    this.label = 1;
                    if (animatable.snapTo(e5, this) == l5) {
                        return l5;
                    }
                }
                animatable2 = this.this$0.cursorAlpha;
                Float e6 = kotlin.coroutines.jvm.internal.b.e(0.0f);
                animationSpec = TextFieldCoreModifierKt.cursorAnimationSpec;
                this.label = 2;
                if (Animatable.animateTo$default(animatable2, e6, animationSpec, null, null, this, 12, null) == l5) {
                    return l5;
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TransformedTextFieldState transformedTextFieldState, TextFieldCoreModifierNode textFieldCoreModifierNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$textFieldState = transformedTextFieldState;
            this.this$0 = textFieldCoreModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.$textFieldState, this.this$0, dVar);
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
                i snapshotFlow = SnapshotStateKt.snapshotFlow(new C00321(this.$textFieldState));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (k.A(snapshotFlow, anonymousClass2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateNode$2(TransformedTextFieldState transformedTextFieldState, TextFieldCoreModifierNode textFieldCoreModifierNode, d<? super TextFieldCoreModifierNode$updateNode$2> dVar) {
        super(2, dVar);
        this.$textFieldState = transformedTextFieldState;
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new TextFieldCoreModifierNode$updateNode$2(this.$textFieldState, this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((TextFieldCoreModifierNode$updateNode$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$textFieldState, this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.i.h(fixedMotionDurationScale, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
