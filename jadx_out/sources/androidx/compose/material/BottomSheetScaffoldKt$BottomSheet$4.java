package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheet$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l<IntSize, DraggableAnchors<BottomSheetValue>> $calculateAnchors;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheet$4(BottomSheetState bottomSheetState, boolean z4, l<? super IntSize, ? extends DraggableAnchors<BottomSheetValue>> lVar, Shape shape, float f5, long j5, long j6, Modifier modifier, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$state = bottomSheetState;
        this.$sheetGesturesEnabled = z4;
        this.$calculateAnchors = lVar;
        this.$sheetShape = shape;
        this.$sheetElevation = f5;
        this.$sheetBackgroundColor = j5;
        this.$sheetContentColor = j6;
        this.$modifier = modifier;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1231BottomSheet0cLKjW4(this.$state, this.$sheetGesturesEnabled, this.$calculateAnchors, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
