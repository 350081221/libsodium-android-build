package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetLayout$3(q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z4, Shape shape, float f5, long j5, long j6, long j7, p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = modifier;
        this.$sheetState = modalBottomSheetState;
        this.$sheetGesturesEnabled = z4;
        this.$sheetShape = shape;
        this.$sheetElevation = f5;
        this.$sheetBackgroundColor = j5;
        this.$sheetContentColor = j6;
        this.$scrimColor = j7;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ModalBottomSheetKt.m1376ModalBottomSheetLayoutGs3lGvM(this.$sheetContent, this.$modifier, this.$sheetState, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$scrimColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
