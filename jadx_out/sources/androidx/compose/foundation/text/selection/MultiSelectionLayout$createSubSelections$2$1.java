package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "info", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/selection/SelectableInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MultiSelectionLayout$createSubSelections$2$1 extends n0 implements l<SelectableInfo, r2> {
    final /* synthetic */ Selection $selection;
    final /* synthetic */ Map<Long, Selection> $this_buildMap;
    final /* synthetic */ MultiSelectionLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectionLayout$createSubSelections$2$1(MultiSelectionLayout multiSelectionLayout, Map<Long, Selection> map, Selection selection) {
        super(1);
        this.this$0 = multiSelectionLayout;
        this.$this_buildMap = map;
        this.$selection = selection;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SelectableInfo selectableInfo) {
        invoke2(selectableInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SelectableInfo selectableInfo) {
        this.this$0.createAndPutSubSelection(this.$this_buildMap, this.$selection, selectableInfo, 0, selectableInfo.getTextLength());
    }
}
