package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text2/SecureTextFieldController;", "", "Lkotlin/r2;", "scheduleHide", "Landroidx/compose/foundation/text2/PasswordRevealFilter;", "passwordRevealFilter", "Landroidx/compose/foundation/text2/PasswordRevealFilter;", "getPasswordRevealFilter", "()Landroidx/compose/foundation/text2/PasswordRevealFilter;", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "getCodepointTransformation", "()Landroidx/compose/foundation/text2/input/CodepointTransformation;", "Landroidx/compose/ui/Modifier;", "focusChangeModifier", "Landroidx/compose/ui/Modifier;", "getFocusChangeModifier", "()Landroidx/compose/ui/Modifier;", "Lkotlinx/coroutines/channels/l;", "resetTimerSignal", "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/s0;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/s0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;

    @l
    private final PasswordRevealFilter passwordRevealFilter = new PasswordRevealFilter(new SecureTextFieldController$passwordRevealFilter$1(this));

    @l
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text2.a
        @Override // androidx.compose.foundation.text2.input.CodepointTransformation
        public final int transform(int i5, int i6) {
            int codepointTransformation$lambda$0;
            codepointTransformation$lambda$0 = SecureTextFieldController.codepointTransformation$lambda$0(SecureTextFieldController.this, i5, i6);
            return codepointTransformation$lambda$0;
        }
    };

    @l
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new SecureTextFieldController$focusChangeModifier$1(this));

    @l
    private final kotlinx.coroutines.channels.l<r2> resetTimerSignal = o.d(Integer.MAX_VALUE, null, null, 6, null);

    @f(c = "androidx.compose.foundation.text2.SecureTextFieldController$1", f = "BasicSecureTextField.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.SecureTextFieldController$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements p<s0, d<? super r2>, Object> {
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text2.SecureTextFieldController$1$1", f = "BasicSecureTextField.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/r2;", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.SecureTextFieldController$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00311 extends kotlin.coroutines.jvm.internal.o implements p<r2, d<? super r2>, Object> {
            int label;
            final /* synthetic */ SecureTextFieldController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00311(SecureTextFieldController secureTextFieldController, d<? super C00311> dVar) {
                super(2, dVar);
                this.this$0 = secureTextFieldController;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new C00311(this.this$0, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l r2 r2Var, @m d<? super r2> dVar) {
                return ((C00311) create(r2Var, dVar)).invokeSuspend(r2.f19517a);
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
                    this.label = 1;
                    if (d1.b(1500L, this) == l5) {
                        return l5;
                    }
                }
                this.this$0.getPasswordRevealFilter().hide();
                return r2.f19517a;
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(dVar);
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
                i X = k.X(SecureTextFieldController.this.resetTimerSignal);
                C00311 c00311 = new C00311(SecureTextFieldController.this, null);
                this.label = 1;
                if (k.A(X, c00311, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public SecureTextFieldController(@l s0 s0Var) {
        kotlinx.coroutines.k.f(s0Var, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i5, int i6) {
        if (i5 == secureTextFieldController.passwordRevealFilter.getRevealCodepointIndex$foundation_release()) {
            return i6;
        }
        return 8226;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (!kotlinx.coroutines.channels.p.m(this.resetTimerSignal.p(r2.f19517a))) {
            this.passwordRevealFilter.hide();
        }
    }

    @l
    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    @l
    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    @l
    public final PasswordRevealFilter getPasswordRevealFilter() {
        return this.passwordRevealFilter;
    }
}
