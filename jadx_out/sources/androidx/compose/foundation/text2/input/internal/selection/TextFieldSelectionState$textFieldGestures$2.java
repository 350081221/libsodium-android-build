package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$textFieldGestures$2 extends o implements p<s0, d<? super l2>, Object> {
    final /* synthetic */ a<r2> $requestFocus;
    final /* synthetic */ a<r2> $showKeyboard;
    final /* synthetic */ PointerInputScope $this_textFieldGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $this_textFieldGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_textFieldGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$this_textFieldGestures, dVar);
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
            Object detectTouchMode;
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
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                this.label = 1;
                detectTouchMode = textFieldSelectionState.detectTouchMode(pointerInputScope, this);
                if (detectTouchMode == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ a<r2> $requestFocus;
        final /* synthetic */ a<r2> $showKeyboard;
        final /* synthetic */ PointerInputScope $this_textFieldGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, a<r2> aVar, a<r2> aVar2, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_textFieldGestures = pointerInputScope;
            this.$requestFocus = aVar;
            this.$showKeyboard = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            Object detectTextFieldTapGestures;
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
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                a<r2> aVar = this.$requestFocus;
                a<r2> aVar2 = this.$showKeyboard;
                this.label = 1;
                detectTextFieldTapGestures = textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, aVar, aVar2, this);
                if (detectTextFieldTapGestures == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ a<r2> $requestFocus;
        final /* synthetic */ PointerInputScope $this_textFieldGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, a<r2> aVar, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_textFieldGestures = pointerInputScope;
            this.$requestFocus = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass3(this.this$0, this.$this_textFieldGestures, this.$requestFocus, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            Object detectTextFieldLongPressAndAfterDrag;
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
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                a<r2> aVar = this.$requestFocus;
                this.label = 1;
                detectTextFieldLongPressAndAfterDrag = textFieldSelectionState.detectTextFieldLongPressAndAfterDrag(pointerInputScope, aVar, this);
                if (detectTextFieldLongPressAndAfterDrag == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$textFieldGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, a<r2> aVar, a<r2> aVar2, d<? super TextFieldSelectionState$textFieldGestures$2> dVar) {
        super(2, dVar);
        this.this$0 = textFieldSelectionState;
        this.$this_textFieldGestures = pointerInputScope;
        this.$requestFocus = aVar;
        this.$showKeyboard = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldSelectionState$textFieldGestures$2 textFieldSelectionState$textFieldGestures$2 = new TextFieldSelectionState$textFieldGestures$2(this.this$0, this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, dVar);
        textFieldSelectionState$textFieldGestures$2.L$0 = obj;
        return textFieldSelectionState$textFieldGestures$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super l2> dVar) {
        return ((TextFieldSelectionState$textFieldGestures$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        l2 f5;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            s0 s0Var = (s0) this.L$0;
            u0 u0Var = u0.UNDISPATCHED;
            k.f(s0Var, null, u0Var, new AnonymousClass1(this.this$0, this.$this_textFieldGestures, null), 1, null);
            k.f(s0Var, null, u0Var, new AnonymousClass2(this.this$0, this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, null), 1, null);
            f5 = k.f(s0Var, null, u0Var, new AnonymousClass3(this.this$0, this.$this_textFieldGestures, this.$requestFocus, null), 1, null);
            return f5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
