package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $body;
    final /* synthetic */ q<Integer, Composer, Integer, r2> $bottomSheet;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, q<? super Integer, ? super Composer, ? super Integer, r2> qVar2, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, float f5, int i5, a<Float> aVar, BottomSheetState bottomSheetState, int i6) {
        super(2);
        this.$topBar = pVar;
        this.$body = qVar;
        this.$bottomSheet = qVar2;
        this.$floatingActionButton = pVar2;
        this.$snackbarHost = pVar3;
        this.$sheetPeekHeight = f5;
        this.$floatingActionButtonPosition = i5;
        this.$sheetOffset = aVar;
        this.$sheetState = bottomSheetState;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1234BottomSheetScaffoldLayoutKCBPh4w(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
