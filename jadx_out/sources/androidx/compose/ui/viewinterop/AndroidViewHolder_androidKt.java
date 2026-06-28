package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.math.d;
import p4.l;

@i0(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u000f\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/r2;", "layoutAccordingTo", "", "", "toComposeOffset", "toComposeVelocity", "type", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toNestedScrollSource", "(I)I", "Unmeasured", "I", "androidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1", "NoOpScrollConnection", "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {

    @l
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
    };
    private static final int Unmeasured = Integer.MIN_VALUE;

    public static final /* synthetic */ void access$layoutAccordingTo(View view, LayoutNode layoutNode) {
        layoutAccordingTo(view, layoutNode);
    }

    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        int L0;
        int L02;
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        L0 = d.L0(Offset.m3493getXimpl(positionInRoot));
        L02 = d.L0(Offset.m3494getYimpl(positionInRoot));
        view.layout(L0, L02, view.getMeasuredWidth() + L0, view.getMeasuredHeight() + L02);
    }

    public static final float toComposeOffset(int i5) {
        return i5 * (-1);
    }

    public static final float toComposeVelocity(float f5) {
        return f5 * (-1.0f);
    }

    public static final int toNestedScrollSource(int i5) {
        if (i5 == 0) {
            return NestedScrollSource.Companion.m4766getDragWNlRxjI();
        }
        return NestedScrollSource.Companion.m4767getFlingWNlRxjI();
    }
}
