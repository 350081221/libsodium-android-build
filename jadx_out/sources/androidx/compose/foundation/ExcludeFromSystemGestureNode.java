package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroid/graphics/Rect;", "currentRects", "rects", "Lkotlin/r2;", "updateRects", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
@r1({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,111:1\n1208#2:112\n1187#2,2:113\n138#3:115\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n103#1:112\n103#1:113,2\n104#1:115\n*E\n"})
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureNode extends RectListNode {
    public ExcludeFromSystemGestureNode(@p4.m v3.l<? super LayoutCoordinates, Rect> lVar) {
        super(lVar);
    }

    @Override // androidx.compose.foundation.RectListNode
    @p4.l
    public MutableVector<android.graphics.Rect> currentRects() {
        List<? extends android.graphics.Rect> systemGestureExclusionRects;
        MutableVector<android.graphics.Rect> mutableVector = new MutableVector<>(new android.graphics.Rect[16], 0);
        systemGestureExclusionRects = getView().getSystemGestureExclusionRects();
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(@p4.l MutableVector<android.graphics.Rect> mutableVector) {
        getView().setSystemGestureExclusionRects(mutableVector.asMutableList());
    }
}
