package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorHandleGestures$2 extends o implements p<s0, d<? super l2>, Object> {
    final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, dVar);
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
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
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
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, dVar);
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
            Object detectCursorHandleDragGestures;
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
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                this.label = 1;
                detectCursorHandleDragGestures = textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this);
                if (detectCursorHandleDragGestures == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends n0 implements v3.l<Offset, r2> {
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState) {
                super(1);
                this.this$0 = textFieldSelectionState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                m1180invokek4lQ0M(offset.m3503unboximpl());
                return r2.f19517a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1180invokek4lQ0M(long j5) {
                TextToolbarState textToolbarState;
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                textToolbarState = textFieldSelectionState.getTextToolbarState();
                TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                if (textToolbarState == textToolbarState2) {
                    textToolbarState2 = TextToolbarState.None;
                }
                textFieldSelectionState.setTextToolbarState(textToolbarState2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$this_cursorHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, dVar);
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
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass1, this, 7, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$cursorHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, d<? super TextFieldSelectionState$cursorHandleGestures$2> dVar) {
        super(2, dVar);
        this.this$0 = textFieldSelectionState;
        this.$this_cursorHandleGestures = pointerInputScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldSelectionState$cursorHandleGestures$2 textFieldSelectionState$cursorHandleGestures$2 = new TextFieldSelectionState$cursorHandleGestures$2(this.this$0, this.$this_cursorHandleGestures, dVar);
        textFieldSelectionState$cursorHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$cursorHandleGestures$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super l2> dVar) {
        return ((TextFieldSelectionState$cursorHandleGestures$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            k.f(s0Var, null, u0Var, new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
            k.f(s0Var, null, u0Var, new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
            f5 = k.f(s0Var, null, u0Var, new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, null), 1, null);
            return f5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
