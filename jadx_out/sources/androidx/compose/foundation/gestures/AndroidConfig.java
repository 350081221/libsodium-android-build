package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "()V", "calculateMouseWheelScroll", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEvent;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,36:1\n256#2,3:37\n33#2,4:40\n259#2,2:44\n38#2:46\n261#2:47\n154#3:48\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:37,3\n33#1:40,4\n33#1:44,2\n33#1:46\n33#1:47\n33#1:48\n*E\n"})
/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {

    @l
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo310calculateMouseWheelScroll8xgXZGE(@l Density density, @l PointerEvent pointerEvent, long j5) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m3482boximpl = Offset.m3482boximpl(Offset.Companion.m3509getZeroF1C5BW0());
        int size = changes.size();
        for (int i5 = 0; i5 < size; i5++) {
            m3482boximpl = Offset.m3482boximpl(Offset.m3498plusMKHz9U(m3482boximpl.m3503unboximpl(), changes.get(i5).m4874getScrollDeltaF1C5BW0()));
        }
        return Offset.m3500timestuRUvjQ(m3482boximpl.m3503unboximpl(), -density.mo304toPx0680j_4(Dp.m6044constructorimpl(64)));
    }
}
