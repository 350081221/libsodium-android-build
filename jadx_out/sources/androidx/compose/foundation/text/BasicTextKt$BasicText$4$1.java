package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BasicTextKt$BasicText$4$1 extends n0 implements a<List<? extends Rect>> {
    final /* synthetic */ MutableState<List<Rect>> $measuredPlaceholderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$4$1(MutableState<List<Rect>> mutableState) {
        super(0);
        this.$measuredPlaceholderPositions = mutableState;
    }

    @Override // v3.a
    @m
    public final List<? extends Rect> invoke() {
        return this.$measuredPlaceholderPositions.getValue();
    }
}
