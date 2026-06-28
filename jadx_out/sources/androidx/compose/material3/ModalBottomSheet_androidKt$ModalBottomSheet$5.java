package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ ModalBottomSheetProperties $properties;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$5(v3.a<r2> aVar, Modifier modifier, SheetState sheetState, float f5, Shape shape, long j5, long j6, float f6, long j7, v3.p<? super Composer, ? super Integer, r2> pVar, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6, int i7) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$modifier = modifier;
        this.$sheetState = sheetState;
        this.$sheetMaxWidth = f5;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$tonalElevation = f6;
        this.$scrimColor = j7;
        this.$dragHandle = pVar;
        this.$windowInsets = windowInsets;
        this.$properties = modalBottomSheetProperties;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ModalBottomSheet_androidKt.m1999ModalBottomSheetdYc4hso(this.$onDismissRequest, this.$modifier, this.$sheetState, this.$sheetMaxWidth, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$scrimColor, this.$dragHandle, this.$windowInsets, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
