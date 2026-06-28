package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/geometry/Rect;", "it", "Lkotlin/r2;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BasicTextKt$BasicText$3$1 extends n0 implements l<List<? extends Rect>, r2> {
    final /* synthetic */ MutableState<List<Rect>> $measuredPlaceholderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$3$1(MutableState<List<Rect>> mutableState) {
        super(1);
        this.$measuredPlaceholderPositions = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(List<? extends Rect> list) {
        invoke2((List<Rect>) list);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l List<Rect> list) {
        this.$measuredPlaceholderPositions.setValue(list);
    }
}
