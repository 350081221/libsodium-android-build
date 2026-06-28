package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ MutableState<LayoutCoordinates> $anchorCoordinates$delegate;
    final /* synthetic */ MutableIntState $menuMaxHeight$delegate;
    final /* synthetic */ int $verticalMargin;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1(View view, int i5, MutableState<LayoutCoordinates> mutableState, MutableIntState mutableIntState) {
        super(0);
        this.$view = view;
        this.$verticalMargin = i5;
        this.$anchorCoordinates$delegate = mutableState;
        this.$menuMaxHeight$delegate = mutableIntState;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Rect windowBounds;
        LayoutCoordinates ExposedDropdownMenuBox$lambda$2;
        Rect anchorBounds;
        int calculateMaxHeight;
        MutableIntState mutableIntState = this.$menuMaxHeight$delegate;
        windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(this.$view.getRootView());
        ExposedDropdownMenuBox$lambda$2 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(this.$anchorCoordinates$delegate);
        anchorBounds = ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenuBox$lambda$2);
        calculateMaxHeight = ExposedDropdownMenu_androidKt.calculateMaxHeight(windowBounds, anchorBounds, this.$verticalMargin);
        mutableIntState.setIntValue(calculateMaxHeight);
    }
}
