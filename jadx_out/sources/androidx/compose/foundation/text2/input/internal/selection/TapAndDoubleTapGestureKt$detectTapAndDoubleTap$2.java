package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ TapOnPosition $onDoubleTap;
    final /* synthetic */ TapOnPosition $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapAndDoubleTap;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1", f = "TapAndDoubleTapGesture.kt", i = {0, 1, 1, 2, 2, 3, 3, 4}, l = {44, 50, 54, 64, 69, 77}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
        final /* synthetic */ TapOnPosition $onDoubleTap;
        final /* synthetic */ TapOnPosition $onTap;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1", f = "TapAndDoubleTapGesture.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00341 extends k implements p<AwaitPointerEventScope, d<? super PointerInputChange>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C00341(d<? super C00341> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                C00341 c00341 = new C00341(dVar);
                c00341.L$0 = obj;
                return c00341;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super PointerInputChange> dVar) {
                return ((C00341) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
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
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                    if (obj == l5) {
                        return l5;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
            final /* synthetic */ TapOnPosition $onDoubleTap;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TapOnPosition tapOnPosition, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$onDoubleTap = tapOnPosition;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onDoubleTap, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
                return ((AnonymousClass2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
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
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                    if (obj == l5) {
                        return l5;
                    }
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    pointerInputChange.consume();
                    this.$onDoubleTap.mo1152onEventk4lQ0M(pointerInputChange.m4872getPositionF1C5BW0());
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TapOnPosition tapOnPosition, TapOnPosition tapOnPosition2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onTap = tapOnPosition;
            this.$onDoubleTap = tapOnPosition2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTap, this.$onDoubleTap, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: PointerEventTimeoutCancellationException -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #1 {PointerEventTimeoutCancellationException -> 0x00ce, blocks: (B:11:0x001b, B:17:0x00bb), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, TapOnPosition tapOnPosition2, d<? super TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2> dVar) {
        super(2, dVar);
        this.$this_detectTapAndDoubleTap = pointerInputScope;
        this.$onTap = tapOnPosition;
        this.$onDoubleTap = tapOnPosition2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2(this.$this_detectTapAndDoubleTap, this.$onTap, this.$onDoubleTap, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            PointerInputScope pointerInputScope = this.$this_detectTapAndDoubleTap;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTap, this.$onDoubleTap, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
