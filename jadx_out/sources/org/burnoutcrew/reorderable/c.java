package org.burnoutcrew.reorderable;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.p;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ag\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0080@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0017\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e\"\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/v0;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "Lkotlin/r2;", "onPointerSlopReached", "c", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "initialDown", "b", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "d", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "Landroidx/compose/ui/platform/ViewConfiguration;", "", "e", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "Landroidx/compose/ui/unit/Dp;", bi.ay, "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f21094a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f21095b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f21096c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DragGestureKt", f = "DragGesture.kt", i = {0, 0}, l = {99}, m = "awaitLongPressOrCancellation", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.b(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DragGestureKt$awaitLongPressOrCancellation$2", f = "DragGesture.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class b extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ k1.h<PointerInputChange> $currentDown;
        final /* synthetic */ k1.h<PointerInputChange> $longPress;
        final /* synthetic */ PointerInputScope $this_awaitLongPressOrCancellation;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DragGestureKt$awaitLongPressOrCancellation$2$1", f = "DragGesture.kt", i = {0, 0, 1, 1, 1}, l = {103, 120}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "finished", "$this$awaitPointerEventScope", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ k1.h<PointerInputChange> $currentDown;
            final /* synthetic */ k1.h<PointerInputChange> $longPress;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<PointerInputChange> hVar, k1.h<PointerInputChange> hVar2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$currentDown = hVar;
                this.$longPress = hVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.$currentDown, this.$longPress, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00c2 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0079 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x00d2  */
            /* JADX WARN: Type inference failed for: r12v6 */
            /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.ui.input.pointer.PointerInputChange, T] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c3 -> B:6:0x00c5). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 353
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PointerInputScope pointerInputScope, k1.h<PointerInputChange> hVar, k1.h<PointerInputChange> hVar2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$this_awaitLongPressOrCancellation = pointerInputScope;
            this.$currentDown = hVar;
            this.$longPress = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new b(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
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
                PointerInputScope pointerInputScope = this.$this_awaitLongPressOrCancellation;
                a aVar = new a(this.$currentDown, this.$longPress, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DragGestureKt", f = "DragGesture.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {53, 82}, m = "awaitPointerSlopOrCancellation-gDDlDlE", n = {"$this$awaitPointerSlopOrCancellation_u2dgDDlDlE", "onPointerSlopReached", "pointer", TypedValues.CycleType.S_WAVE_OFFSET, "touchSlop", "$this$awaitPointerSlopOrCancellation_u2dgDDlDlE", "onPointerSlopReached", "pointer", "dragEvent", TypedValues.CycleType.S_WAVE_OFFSET, "touchSlop"}, s = {"L$0", "L$1", "L$2", "J$0", "F$0", "L$0", "L$1", "L$2", "L$3", "J$0", "F$0"})
    /* renamed from: org.burnoutcrew.reorderable.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0634c extends kotlin.coroutines.jvm.internal.d {
        float F$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C0634c(kotlin.coroutines.d<? super C0634c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.c(null, 0L, 0, null, this);
        }
    }

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl((float) 0.125d);
        f21094a = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(18);
        f21095b = m6044constructorimpl2;
        f21096c = m6044constructorimpl / m6044constructorimpl2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.input.pointer.PointerInputChange, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@p4.l androidx.compose.ui.input.pointer.PointerInputScope r8, @p4.l androidx.compose.ui.input.pointer.PointerInputChange r9, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof org.burnoutcrew.reorderable.c.a
            if (r0 == 0) goto L13
            r0 = r10
            org.burnoutcrew.reorderable.c$a r0 = (org.burnoutcrew.reorderable.c.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.burnoutcrew.reorderable.c$a r0 = new org.burnoutcrew.reorderable.c$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            kotlin.e1.n(r10)     // Catch: kotlinx.coroutines.t3 -> L64
            goto L6d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.e1.n(r10)
            kotlin.jvm.internal.k1$h r10 = new kotlin.jvm.internal.k1$h
            r10.<init>()
            kotlin.jvm.internal.k1$h r2 = new kotlin.jvm.internal.k1$h
            r2.<init>()
            r2.element = r9
            androidx.compose.ui.platform.ViewConfiguration r5 = r8.getViewConfiguration()
            long r5 = r5.getLongPressTimeoutMillis()
            org.burnoutcrew.reorderable.c$b r7 = new org.burnoutcrew.reorderable.c$b     // Catch: kotlinx.coroutines.t3 -> L63
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.t3 -> L63
            r0.L$0 = r9     // Catch: kotlinx.coroutines.t3 -> L63
            r0.L$1 = r10     // Catch: kotlinx.coroutines.t3 -> L63
            r0.label = r4     // Catch: kotlinx.coroutines.t3 -> L63
            java.lang.Object r8 = kotlinx.coroutines.v3.c(r5, r7, r0)     // Catch: kotlinx.coroutines.t3 -> L63
            if (r8 != r1) goto L6d
            return r1
        L63:
            r8 = r10
        L64:
            T r8 = r8.element
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L6c
            r3 = r9
            goto L6d
        L6c:
            r3 = r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.c.b(androidx.compose.ui.input.pointer.PointerInputScope, androidx.compose.ui.input.pointer.PointerInputChange, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0115 -> B:16:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x016f -> B:11:0x0176). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.r2> r23, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.c.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(PointerEvent pointerEvent, long j5) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                pointerInputChange = changes.get(i5);
                if (PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), j5)) {
                    break;
                }
                i5++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z4 = true;
        }
        return true ^ z4;
    }

    private static final float e(ViewConfiguration viewConfiguration, int i5) {
        if (PointerType.m4944equalsimpl0(i5, PointerType.Companion.m4949getMouseT8wyACA())) {
            return viewConfiguration.getTouchSlop() * f21096c;
        }
        return viewConfiguration.getTouchSlop();
    }
}
