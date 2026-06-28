package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SheetValue;", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/SheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SheetState$Companion$Saver$3 extends kotlin.jvm.internal.n0 implements v3.p<SaverScope, SheetState, SheetValue> {
    public static final SheetState$Companion$Saver$3 INSTANCE = new SheetState$Companion$Saver$3();

    SheetState$Companion$Saver$3() {
        super(2);
    }

    @Override // v3.p
    @p4.m
    public final SheetValue invoke(@p4.l SaverScope saverScope, @p4.l SheetState sheetState) {
        return sheetState.getCurrentValue();
    }
}
