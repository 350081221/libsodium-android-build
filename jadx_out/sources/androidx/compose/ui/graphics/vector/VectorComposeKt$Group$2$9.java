package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/vector/GroupComponent;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$9 extends n0 implements p<GroupComponent, List<? extends PathNode>, r2> {
    public static final VectorComposeKt$Group$2$9 INSTANCE = new VectorComposeKt$Group$2$9();

    VectorComposeKt$Group$2$9() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(GroupComponent groupComponent, List<? extends PathNode> list) {
        invoke2(groupComponent, list);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l GroupComponent groupComponent, @l List<? extends PathNode> list) {
        groupComponent.setClipPathData(list);
    }
}
