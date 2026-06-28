package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ ScrollAxisRange $accessibilityScrollState;
    final /* synthetic */ CollectionInfo $collectionInfo;
    final /* synthetic */ l<Object, Integer> $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ p<Float, Float, Boolean> $scrollByAction;
    final /* synthetic */ l<Integer, Boolean> $scrollToIndexAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(l<Object, Integer> lVar, boolean z4, ScrollAxisRange scrollAxisRange, p<? super Float, ? super Float, Boolean> pVar, l<? super Integer, Boolean> lVar2, CollectionInfo collectionInfo) {
        super(1);
        this.$indexForKeyMapping = lVar;
        this.$isVertical = z4;
        this.$accessibilityScrollState = scrollAxisRange;
        this.$scrollByAction = pVar;
        this.$scrollToIndexAction = lVar2;
        this.$collectionInfo = collectionInfo;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, this.$accessibilityScrollState);
        }
        p<Float, Float, Boolean> pVar = this.$scrollByAction;
        if (pVar != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, pVar, 1, null);
        }
        l<Integer, Boolean> lVar = this.$scrollToIndexAction;
        if (lVar != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, lVar, 1, null);
        }
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, this.$collectionInfo);
    }
}
