package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR+\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0010R+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/BottomAppBarStateImpl;", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "(FFF)V", "_heightOffset", "Landroidx/compose/runtime/MutableFloatState;", "collapsedFraction", "getCollapsedFraction", "()F", "<set-?>", "contentOffset", "getContentOffset", "setContentOffset", "(F)V", "contentOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "newOffset", "heightOffset", "getHeightOffset", "setHeightOffset", "heightOffsetLimit", "getHeightOffsetLimit", "setHeightOffsetLimit", "heightOffsetLimit$delegate", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2283:1\n76#2:2284\n109#2,2:2285\n76#2:2287\n109#2,2:2288\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n*L\n1471#1:2284\n1471#1:2285,2\n1482#1:2287\n1482#1:2288,2\n*E\n"})
/* loaded from: classes.dex */
public final class BottomAppBarStateImpl implements BottomAppBarState {

    @p4.l
    private MutableFloatState _heightOffset;

    @p4.l
    private final MutableFloatState contentOffset$delegate;

    @p4.l
    private final MutableFloatState heightOffsetLimit$delegate;

    public BottomAppBarStateImpl(float f5, float f6, float f7) {
        this.heightOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f7);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getCollapsedFraction() {
        boolean z4;
        if (getHeightOffsetLimit() == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffsetLimit() {
        return this.heightOffsetLimit$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setContentOffset(float f5) {
        this.contentOffset$delegate.setFloatValue(f5);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffset(float f5) {
        float H;
        MutableFloatState mutableFloatState = this._heightOffset;
        H = kotlin.ranges.u.H(f5, getHeightOffsetLimit(), 0.0f);
        mutableFloatState.setFloatValue(H);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffsetLimit(float f5) {
        this.heightOffsetLimit$delegate.setFloatValue(f5);
    }
}
