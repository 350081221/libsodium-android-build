package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlin.y;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends o implements p<s0, d<? super r2>, Object> {
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {485}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<PlatformTextInputSessionScope, d<?>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {482}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00331 extends o implements p<s0, d<? super r2>, Object> {
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00331(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, d<? super C00331> dVar) {
                super(2, dVar);
                this.this$0 = textFieldDecoratorModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new C00331(this.this$0, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00331) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    this.label = 1;
                    if (textFieldSelectionState.observeChanges(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = textFieldDecoratorModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l PlatformTextInputSessionScope platformTextInputSessionScope, @m d<?> dVar) {
            return ((AnonymousClass1) create(platformTextInputSessionScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            v3.l lVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                k.f(platformTextInputSessionScope, null, u0.UNDISPATCHED, new C00331(this.this$0, null), 1, null);
                TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                lVar = this.this$0.onImeActionPerformed;
                this.label = 1;
                if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, imeOptions$foundation_release, lVar, this) == l5) {
                    return l5;
                }
            }
            throw new y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, d<? super TextFieldDecoratorModifierNode$startInputSession$1> dVar) {
        super(2, dVar);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, null);
            this.label = 1;
            if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        throw new y();
    }
}
