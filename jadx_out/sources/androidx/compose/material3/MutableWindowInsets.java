package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R+\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "initialInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "<set-?>", "insets", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMutableWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material3/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,49:1\n81#2:50\n107#2,2:51\n*S KotlinDebug\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material3/MutableWindowInsets\n*L\n40#1:50\n40#1:51,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    @p4.l
    private final MutableState insets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MutableWindowInsets(@p4.l WindowInsets windowInsets) {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@p4.l Density density) {
        return getInsets().getBottom(density);
    }

    @p4.l
    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@p4.l Density density, @p4.l LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@p4.l Density density, @p4.l LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@p4.l Density density) {
        return getInsets().getTop(density);
    }

    public final void setInsets(@p4.l WindowInsets windowInsets) {
        this.insets$delegate.setValue(windowInsets);
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
