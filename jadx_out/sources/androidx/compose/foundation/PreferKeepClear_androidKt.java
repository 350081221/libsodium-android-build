package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\u0016\b\b\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0083\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\b"}, d2 = {"preferKeepClearT", "Landroidx/compose/ui/Modifier;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "preferKeepClear", "rectProvider", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n1#1,112:1\n67#1:113\n67#1:114\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n41#1:113\n60#1:114\n*E\n"})
/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    @p4.l
    public static final Modifier preferKeepClear(@p4.l Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    @RequiresApi(33)
    private static final Modifier preferKeepClearT(v3.l<? super LayoutCoordinates, Rect> lVar) {
        return new PreferKeepClearElement(lVar);
    }

    @p4.l
    public static final Modifier preferKeepClear(@p4.l Modifier modifier, @p4.l v3.l<? super LayoutCoordinates, Rect> lVar) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(lVar));
    }
}
