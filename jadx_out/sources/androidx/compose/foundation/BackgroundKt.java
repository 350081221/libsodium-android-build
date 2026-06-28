package androidx.compose.foundation;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {ForeAndBackgroundEvent.BACKGROUND, "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", "alpha", "", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "background-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,182:1\n135#2:183\n135#2:184\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n55#1:183\n86#1:184\n*E\n"})
/* loaded from: classes.dex */
public final class BackgroundKt {
    @Stable
    @p4.l
    public static final Modifier background(@p4.l Modifier modifier, @p4.l Brush brush, @p4.l Shape shape, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BackgroundKt$background$$inlined$debugInspectorInfo$1(f5, brush, shape);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BackgroundElement(0L, brush, f5, shape, noInspectorInfo, 1, null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i5 & 4) != 0) {
            f5 = 1.0f;
        }
        return background(modifier, brush, shape, f5);
    }

    @Stable
    @p4.l
    /* renamed from: background-bw27NRU */
    public static final Modifier m200backgroundbw27NRU(@p4.l Modifier modifier, long j5, @p4.l Shape shape) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j5, shape);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BackgroundElement(j5, null, 1.0f, shape, noInspectorInfo, 2, null));
    }

    /* renamed from: background-bw27NRU$default */
    public static /* synthetic */ Modifier m201backgroundbw27NRU$default(Modifier modifier, long j5, Shape shape, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m200backgroundbw27NRU(modifier, j5, shape);
    }
}
