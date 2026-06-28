package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.umeng.analytics.pro.bi;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", bi.ay, "Landroidx/compose/foundation/text/selection/Selectable;", "b", "invoke", "(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionRegistrarImpl$sort$1 extends n0 implements p<Selectable, Selectable, Integer> {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // v3.p
    @l
    public final Integer invoke(@l Selectable selectable, @l Selectable selectable2) {
        long m3509getZeroF1C5BW0;
        long m3509getZeroF1C5BW02;
        int l5;
        LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m3509getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3509getZeroF1C5BW0());
        } else {
            m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m3509getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m3509getZeroF1C5BW0());
        } else {
            m3509getZeroF1C5BW02 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        if (Offset.m3494getYimpl(m3509getZeroF1C5BW0) == Offset.m3494getYimpl(m3509getZeroF1C5BW02)) {
            l5 = g.l(Float.valueOf(Offset.m3493getXimpl(m3509getZeroF1C5BW0)), Float.valueOf(Offset.m3493getXimpl(m3509getZeroF1C5BW02)));
        } else {
            l5 = g.l(Float.valueOf(Offset.m3494getYimpl(m3509getZeroF1C5BW0)), Float.valueOf(Offset.m3494getYimpl(m3509getZeroF1C5BW02)));
        }
        return Integer.valueOf(l5);
    }
}
