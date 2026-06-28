package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "availableHeight", "mainAxisSpacing", "invoke", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks$VerticalMaxWidth$1 extends n0 implements q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {
    public static final IntrinsicMeasureBlocks$VerticalMaxWidth$1 INSTANCE = new IntrinsicMeasureBlocks$VerticalMaxWidth$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", bi.aJ, "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        @l
        public final Integer invoke(@l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        @l
        public final Integer invoke(@l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i5));
        }
    }

    IntrinsicMeasureBlocks$VerticalMaxWidth$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
        return invoke(list, num.intValue(), num2.intValue());
    }

    @l
    public final Integer invoke(@l List<? extends IntrinsicMeasurable> list, int i5, int i6) {
        int intrinsicSize;
        intrinsicSize = RowColumnImplKt.intrinsicSize(list, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, i5, i6, LayoutOrientation.Vertical, LayoutOrientation.Horizontal);
        return Integer.valueOf(intrinsicSize);
    }
}
