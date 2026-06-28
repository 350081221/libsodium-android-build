package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R+\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "initialInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "<set-?>", "insets", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n83#1:749\n83#1:750,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    @l
    private final MutableState insets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MutableWindowInsets(@l WindowInsets windowInsets) {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        return getInsets().getBottom(density);
    }

    @l
    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        return getInsets().getTop(density);
    }

    public final void setInsets(@l WindowInsets windowInsets) {
        this.insets$delegate.setValue(windowInsets);
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i5, w wVar) {
        this((i5 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
