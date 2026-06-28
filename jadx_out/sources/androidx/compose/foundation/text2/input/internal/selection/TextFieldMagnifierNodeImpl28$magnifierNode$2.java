package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "size", "Lkotlin/r2;", "invoke-EaSLcWc", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28$magnifierNode$2 extends n0 implements l<DpSize, r2> {
    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$magnifierNode$2(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        super(1);
        this.this$0 = textFieldMagnifierNodeImpl28;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DpSize dpSize) {
        m1163invokeEaSLcWc(dpSize.m6150unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-EaSLcWc, reason: not valid java name */
    public final void m1163invokeEaSLcWc(long j5) {
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
        Density density = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity());
        textFieldMagnifierNodeImpl28.m1161setMagnifierSizeozmzZPI(IntSizeKt.IntSize(density.mo298roundToPx0680j_4(DpSize.m6142getWidthD9Ej5fM(j5)), density.mo298roundToPx0680j_4(DpSize.m6140getHeightD9Ej5fM(j5))));
    }
}
