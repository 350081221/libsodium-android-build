package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$1 extends kotlin.jvm.internal.n0 implements v3.l<LayoutCoordinates, r2> {
    final /* synthetic */ MutableState<LayoutCoordinates> $anchorCoordinates$delegate;
    final /* synthetic */ MutableIntState $anchorWidth$delegate;
    final /* synthetic */ MutableIntState $menuMaxHeight$delegate;
    final /* synthetic */ int $verticalMargin;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$1(View view, int i5, MutableState<LayoutCoordinates> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(1);
        this.$view = view;
        this.$verticalMargin = i5;
        this.$anchorCoordinates$delegate = mutableState;
        this.$anchorWidth$delegate = mutableIntState;
        this.$menuMaxHeight$delegate = mutableIntState2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LayoutCoordinates layoutCoordinates) {
        Rect windowBounds;
        LayoutCoordinates ExposedDropdownMenuBox$lambda$2;
        Rect anchorBounds;
        int calculateMaxHeight;
        this.$anchorCoordinates$delegate.setValue(layoutCoordinates);
        this.$anchorWidth$delegate.setIntValue(IntSize.m6214getWidthimpl(layoutCoordinates.mo5005getSizeYbymL2g()));
        MutableIntState mutableIntState = this.$menuMaxHeight$delegate;
        windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(this.$view.getRootView());
        ExposedDropdownMenuBox$lambda$2 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(this.$anchorCoordinates$delegate);
        anchorBounds = ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenuBox$lambda$2);
        calculateMaxHeight = ExposedDropdownMenu_androidKt.calculateMaxHeight(windowBounds, anchorBounds, this.$verticalMargin);
        mutableIntState.setIntValue(calculateMaxHeight);
    }
}
