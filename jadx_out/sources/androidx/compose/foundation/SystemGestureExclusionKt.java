package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0016\b\b\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0083\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0007"}, d2 = {"excludeFromSystemGestureQ", "Landroidx/compose/ui/Modifier;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "systemGestureExclusion", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@u3.h(name = "SystemGestureExclusionKt")
@r1({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,111:1\n66#1:112\n66#1:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:112\n59#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    private static final Modifier excludeFromSystemGestureQ(v3.l<? super LayoutCoordinates, Rect> lVar) {
        return new ExcludeFromSystemGestureElement(lVar);
    }

    @p4.l
    public static final Modifier systemGestureExclusion(@p4.l Modifier modifier) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    @p4.l
    public static final Modifier systemGestureExclusion(@p4.l Modifier modifier, @p4.l v3.l<? super LayoutCoordinates, Rect> lVar) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(lVar));
    }
}
