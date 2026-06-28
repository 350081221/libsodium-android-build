package androidx.compose.ui.layout;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiContentMeasurePolicyKt {
    @l
    @a1
    public static final MeasurePolicy createMeasurePolicy(@l final MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new MeasurePolicy() { // from class: androidx.compose.ui.layout.MultiContentMeasurePolicyKt$createMeasurePolicy$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
                return MultiContentMeasurePolicy.this.maxIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i5);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
                return MultiContentMeasurePolicy.this.maxIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i5);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @l
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                return MultiContentMeasurePolicy.this.mo1973measure3p2s80s(measureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope), j5);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
                return MultiContentMeasurePolicy.this.minIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i5);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
                return MultiContentMeasurePolicy.this.minIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i5);
            }
        };
    }
}
