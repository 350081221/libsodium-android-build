package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $body;
    final /* synthetic */ v3.q<Integer, Composer, Integer, r2> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.q<? super Integer, ? super Composer, ? super Integer, r2> qVar2, v3.p<? super Composer, ? super Integer, r2> pVar2, float f5, v3.a<Float> aVar, SheetState sheetState, long j5, long j6, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = pVar;
        this.$body = qVar;
        this.$bottomSheet = qVar2;
        this.$snackbarHost = pVar2;
        this.$sheetPeekHeight = f5;
        this.$sheetOffset = aVar;
        this.$sheetState = sheetState;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1579BottomSheetScaffoldLayoutPxNyym8(this.$modifier, this.$topBar, this.$body, this.$bottomSheet, this.$snackbarHost, this.$sheetPeekHeight, this.$sheetOffset, this.$sheetState, this.$containerColor, this.$contentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
