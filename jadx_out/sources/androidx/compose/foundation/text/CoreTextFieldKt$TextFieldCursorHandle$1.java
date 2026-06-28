package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", i = {}, l = {1134}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$TextFieldCursorHandle$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1", f = "CoreTextField.kt", i = {}, l = {1138}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00231 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TextDragObserver $observer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00231(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d<? super C00231> dVar) {
                super(2, dVar);
                this.$$this$pointerInput = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new C00231(this.$$this$pointerInput, this.$observer, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00231) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2", f = "CoreTextField.kt", i = {}, l = {1141}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TextFieldSelectionManager $manager;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00241 extends n0 implements v3.l<Offset, r2> {
                final /* synthetic */ TextFieldSelectionManager $manager;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00241(TextFieldSelectionManager textFieldSelectionManager) {
                    super(1);
                    this.$manager = textFieldSelectionManager;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                    m847invokek4lQ0M(offset.m3503unboximpl());
                    return r2.f19517a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m847invokek4lQ0M(long j5) {
                    this.$manager.showSelectionToolbar$foundation_release();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$$this$pointerInput = pointerInputScope;
                this.$manager = textFieldSelectionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new AnonymousClass2(this.$$this$pointerInput, this.$manager, dVar);
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
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00241 c00241 = new C00241(this.$manager);
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, c00241, this, 7, null) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$observer = textDragObserver;
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$observer, this.$manager, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                s0 s0Var = (s0) this.L$0;
                u0 u0Var = u0.UNDISPATCHED;
                k.f(s0Var, null, u0Var, new C00231(this.$$this$pointerInput, this.$observer, null), 1, null);
                k.f(s0Var, null, u0Var, new AnonymousClass2(this.$$this$pointerInput, this.$manager, null), 1, null);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$1(TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, d<? super CoreTextFieldKt$TextFieldCursorHandle$1> dVar) {
        super(2, dVar);
        this.$observer = textDragObserver;
        this.$manager = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.$observer, this.$manager, dVar);
        coreTextFieldKt$TextFieldCursorHandle$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$observer, this.$manager, null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
