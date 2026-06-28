package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Vertices$outOfBounds$1 extends kotlin.jvm.internal.n0 implements v3.l<Integer, Boolean> {
    final /* synthetic */ List<Offset> $positions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vertices$outOfBounds$1(List<Offset> list) {
        super(1);
        this.$positions = list;
    }

    @p4.l
    public final Boolean invoke(int i5) {
        return Boolean.valueOf(i5 < 0 || i5 >= this.$positions.size());
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
