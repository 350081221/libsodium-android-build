package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1 extends n0 implements l<LayoutCoordinates, r2> {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableIntState $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableIntState $width$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newHeight", "Lkotlin/r2;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Integer, r2> {
        final /* synthetic */ MutableIntState $menuHeight$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableIntState mutableIntState) {
            super(1);
            this.$menuHeight$delegate = mutableIntState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
            invoke(num.intValue());
            return r2.f19517a;
        }

        public final void invoke(int i5) {
            this.$menuHeight$delegate.setIntValue(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1(Ref<LayoutCoordinates> ref, View view, int i5, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(1);
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i5;
        this.$width$delegate = mutableIntState;
        this.$menuHeight$delegate = mutableIntState2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LayoutCoordinates layoutCoordinates) {
        this.$width$delegate.setIntValue(IntSize.m6214getWidthimpl(layoutCoordinates.mo5005getSizeYbymL2g()));
        this.$coordinates.setValue(layoutCoordinates);
        ExposedDropdownMenu_androidKt.updateHeight(this.$view.getRootView(), this.$coordinates.getValue(), this.$verticalMarginInPx, new AnonymousClass1(this.$menuHeight$delegate));
    }
}
