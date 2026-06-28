package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$selectionHandleGestures$2 extends o implements p<s0, d<? super l2>, Object> {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, dVar);
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
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
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
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00352 extends n0 implements a<r2> {
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00352(TextFieldSelectionState textFieldSelectionState) {
                super(0);
                this.this$0 = textFieldSelectionState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.clearHandleDragging();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z4, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
            this.$isStartHandle = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, dVar);
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
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                final TextFieldSelectionState textFieldSelectionState = this.this$0;
                final boolean z4 = this.$isStartHandle;
                TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
                    /* renamed from: onEvent-k-4lQ0M */
                    public final void mo1152onEventk4lQ0M(long j5) {
                        Handle handle;
                        long m1170getHandlePositiontuRUvjQ;
                        TextFieldSelectionState.this.markStartContentVisibleOffset();
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        boolean z5 = z4;
                        if (z5) {
                            handle = Handle.SelectionStart;
                        } else {
                            handle = Handle.SelectionEnd;
                        }
                        m1170getHandlePositiontuRUvjQ = textFieldSelectionState2.m1170getHandlePositiontuRUvjQ(z5);
                        textFieldSelectionState2.m1176updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(m1170getHandlePositiontuRUvjQ));
                    }
                };
                C00352 c00352 = new C00352(this.this$0);
                this.label = 1;
                if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, c00352, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {382}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z4, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, dVar);
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
            Object detectSelectionHandleDragGestures;
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
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                boolean z4 = this.$isStartHandle;
                this.label = 1;
                detectSelectionHandleDragGestures = textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z4, this);
                if (detectSelectionHandleDragGestures == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$selectionHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z4, d<? super TextFieldSelectionState$selectionHandleGestures$2> dVar) {
        super(2, dVar);
        this.this$0 = textFieldSelectionState;
        this.$this_selectionHandleGestures = pointerInputScope;
        this.$isStartHandle = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, dVar);
        textFieldSelectionState$selectionHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super l2> dVar) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            k.f(s0Var, null, u0Var, new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, null), 1, null);
            k.f(s0Var, null, u0Var, new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, null), 1, null);
            f5 = k.f(s0Var, null, u0Var, new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
            return f5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
