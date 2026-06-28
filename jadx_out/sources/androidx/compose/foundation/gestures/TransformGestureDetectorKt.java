package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0080\u0001\u0010\u000e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\n\u0010\u0011\u001a\u00020\t*\u00020\u0010\u001a\u0016\u0010\u0014\u001a\u00020\t*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\n\u0010\u0015\u001a\u00020\t*\u00020\u0010\u001a\u0011\u0010\u0016\u001a\u00020\u0004*\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0019\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0001\u001a\u001b\u0010\u001a\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "centroid", "pan", "", "zoom", Key.ROTATION, "Lkotlin/r2;", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLv3/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m409anglek4lQ0M(long j5) {
        if (Offset.m3493getXimpl(j5) == 0.0f) {
            if (Offset.m3494getYimpl(j5) == 0.0f) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@l PointerEvent pointerEvent, boolean z4) {
        long m4873getPreviousPositionF1C5BW0;
        long m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            PointerInputChange pointerInputChange = changes.get(i6);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z4) {
                    m4873getPreviousPositionF1C5BW0 = pointerInputChange.m4872getPositionF1C5BW0();
                } else {
                    m4873getPreviousPositionF1C5BW0 = pointerInputChange.m4873getPreviousPositionF1C5BW0();
                }
                m3509getZeroF1C5BW0 = Offset.m3498plusMKHz9U(m3509getZeroF1C5BW0, m4873getPreviousPositionF1C5BW0);
                i5++;
            }
        }
        if (i5 == 0) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        return Offset.m3488divtuRUvjQ(m3509getZeroF1C5BW0, i5);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return calculateCentroid(pointerEvent, z4);
    }

    public static final float calculateCentroidSize(@l PointerEvent pointerEvent, boolean z4) {
        long m4873getPreviousPositionF1C5BW0;
        long calculateCentroid = calculateCentroid(pointerEvent, z4);
        float f5 = 0.0f;
        if (Offset.m3490equalsimpl0(calculateCentroid, Offset.Companion.m3508getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            PointerInputChange pointerInputChange = changes.get(i6);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z4) {
                    m4873getPreviousPositionF1C5BW0 = pointerInputChange.m4872getPositionF1C5BW0();
                } else {
                    m4873getPreviousPositionF1C5BW0 = pointerInputChange.m4873getPreviousPositionF1C5BW0();
                }
                f5 += Offset.m3491getDistanceimpl(Offset.m3497minusMKHz9U(m4873getPreviousPositionF1C5BW0, calculateCentroid));
                i5++;
            }
        }
        return f5 / i5;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return calculateCentroidSize(pointerEvent, z4);
    }

    public static final long calculatePan(@l PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        if (Offset.m3490equalsimpl0(calculateCentroid, companion.m3508getUnspecifiedF1C5BW0())) {
            return companion.m3509getZeroF1C5BW0();
        }
        return Offset.m3497minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@l PointerEvent pointerEvent) {
        boolean z4;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i5 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i5);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i7 = 0;
            }
            i6 += i7;
            i5++;
        }
        float f5 = 0.0f;
        if (i6 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i8 = 0;
        while (i8 < size2) {
            PointerInputChange pointerInputChange2 = changes2.get(i8);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long m4872getPositionF1C5BW0 = pointerInputChange2.m4872getPositionF1C5BW0();
                long m3497minusMKHz9U = Offset.m3497minusMKHz9U(pointerInputChange2.m4873getPreviousPositionF1C5BW0(), calculateCentroid2);
                long m3497minusMKHz9U2 = Offset.m3497minusMKHz9U(m4872getPositionF1C5BW0, calculateCentroid);
                float m409anglek4lQ0M = m409anglek4lQ0M(m3497minusMKHz9U2) - m409anglek4lQ0M(m3497minusMKHz9U);
                float m3491getDistanceimpl = Offset.m3491getDistanceimpl(Offset.m3498plusMKHz9U(m3497minusMKHz9U2, m3497minusMKHz9U)) / 2.0f;
                if (m409anglek4lQ0M > 180.0f) {
                    m409anglek4lQ0M -= 360.0f;
                } else if (m409anglek4lQ0M < -180.0f) {
                    m409anglek4lQ0M += 360.0f;
                }
                f7 += m409anglek4lQ0M * m3491getDistanceimpl;
                f6 += m3491getDistanceimpl;
            }
            i8++;
            f5 = 0.0f;
        }
        if (f6 == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return f7 / f6;
        }
        return f5;
    }

    public static final float calculateZoom(@l PointerEvent pointerEvent) {
        boolean z4;
        boolean z5 = true;
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (calculateCentroidSize2 != 0.0f) {
                z5 = false;
            }
            if (!z5) {
                return calculateCentroidSize / calculateCentroidSize2;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @m
    public static final Object detectTransformGestures(@l PointerInputScope pointerInputScope, boolean z4, @l r<? super Offset, ? super Offset, ? super Float, ? super Float, r2> rVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z4, rVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z4, r rVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return detectTransformGestures(pointerInputScope, z4, rVar, dVar);
    }
}
