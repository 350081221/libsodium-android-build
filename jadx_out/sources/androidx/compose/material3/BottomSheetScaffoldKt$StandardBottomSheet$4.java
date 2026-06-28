package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ v3.l<IntSize, DraggableAnchors<SheetValue>> $calculateAnchors;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dragHandle;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$StandardBottomSheet$4(SheetState sheetState, v3.l<? super IntSize, ? extends DraggableAnchors<SheetValue>> lVar, float f5, float f6, boolean z4, Shape shape, long j5, long j6, float f7, float f8, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$state = sheetState;
        this.$calculateAnchors = lVar;
        this.$peekHeight = f5;
        this.$sheetMaxWidth = f6;
        this.$sheetSwipeEnabled = z4;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$tonalElevation = f7;
        this.$shadowElevation = f8;
        this.$dragHandle = pVar;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$changed1 = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1580StandardBottomSheetXcniZvE(this.$state, this.$calculateAnchors, this.$peekHeight, this.$sheetMaxWidth, this.$sheetSwipeEnabled, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$shadowElevation, this.$dragHandle, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
