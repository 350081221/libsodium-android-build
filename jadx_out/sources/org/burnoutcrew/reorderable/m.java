package org.burnoutcrew.reorderable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lorg/burnoutcrew/reorderable/m;", "Lorg/burnoutcrew/reorderable/b;", "Lorg/burnoutcrew/reorderable/d;", "position", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", bi.ay, "(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "F", "stiffness", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "b", "Landroidx/compose/animation/core/Animatable;", "animatable", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getPosition", "()Lorg/burnoutcrew/reorderable/d;", "(Lorg/burnoutcrew/reorderable/d;)V", "()J", "<init>", "(F)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class m implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21128d = Animatable.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final float f21129a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Animatable<Offset, AnimationVector2D> f21130b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final MutableState f21131c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.SpringDragCancelledAnimation", f = "DragCancelledAnimation.kt", i = {0, 1}, l = {50, 51}, m = "dragCancelled-d-4ec7I", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return m.this.a(null, 0L, this);
        }
    }

    public m() {
        this(0.0f, 1, null);
    }

    public m(float f5) {
        MutableState mutableStateOf$default;
        this.f21129a = f5;
        Offset.Companion companion = Offset.Companion;
        this.f21130b = new Animatable<>(Offset.m3482boximpl(companion.m3509getZeroF1C5BW0()), VectorConvertersKt.getVectorConverter(companion), null, 4, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f21131c = mutableStateOf$default;
    }

    private void c(d dVar) {
        this.f21131c.setValue(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // org.burnoutcrew.reorderable.b
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@p4.l org.burnoutcrew.reorderable.d r11, long r12, @p4.l kotlin.coroutines.d<? super kotlin.r2> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof org.burnoutcrew.reorderable.m.a
            if (r0 == 0) goto L13
            r0 = r14
            org.burnoutcrew.reorderable.m$a r0 = (org.burnoutcrew.reorderable.m.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.burnoutcrew.reorderable.m$a r0 = new org.burnoutcrew.reorderable.m$a
            r0.<init>(r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r9 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r11 = r6.L$0
            org.burnoutcrew.reorderable.m r11 = (org.burnoutcrew.reorderable.m) r11
            kotlin.e1.n(r14)
            goto L86
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r6.L$0
            org.burnoutcrew.reorderable.m r11 = (org.burnoutcrew.reorderable.m) r11
            kotlin.e1.n(r14)
            goto L5a
        L42:
            kotlin.e1.n(r14)
            r10.c(r11)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> r11 = r10.f21130b
            androidx.compose.ui.geometry.Offset r12 = androidx.compose.ui.geometry.Offset.m3482boximpl(r12)
            r6.L$0 = r10
            r6.label = r3
            java.lang.Object r11 = r11.snapTo(r12, r6)
            if (r11 != r0) goto L59
            return r0
        L59:
            r11 = r10
        L5a:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> r1 = r11.f21130b
            androidx.compose.ui.geometry.Offset$Companion r12 = androidx.compose.ui.geometry.Offset.Companion
            long r13 = r12.m3509getZeroF1C5BW0()
            androidx.compose.ui.geometry.Offset r13 = androidx.compose.ui.geometry.Offset.m3482boximpl(r13)
            float r14 = r11.f21129a
            long r4 = androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(r12)
            androidx.compose.ui.geometry.Offset r12 = androidx.compose.ui.geometry.Offset.m3482boximpl(r4)
            r4 = 0
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r4, r14, r12, r3, r9)
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r6.L$0 = r11
            r6.label = r2
            r2 = r13
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L86
            return r0
        L86:
            r11.c(r9)
            kotlin.r2 r11 = kotlin.r2.f19517a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.m.a(org.burnoutcrew.reorderable.d, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // org.burnoutcrew.reorderable.b
    public long b() {
        return this.f21130b.getValue().m3503unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.burnoutcrew.reorderable.b
    @p4.m
    public d getPosition() {
        return (d) this.f21131c.getValue();
    }

    public /* synthetic */ m(float f5, int i5, w wVar) {
        this((i5 & 1) != 0 ? 400.0f : f5);
    }
}
