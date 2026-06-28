package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material/ModalBottomSheetValue;", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material/ModalBottomSheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$1 extends n0 implements p<SaverScope, ModalBottomSheetState, ModalBottomSheetValue> {
    public static final ModalBottomSheetState$Companion$Saver$1 INSTANCE = new ModalBottomSheetState$Companion$Saver$1();

    ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final ModalBottomSheetValue invoke(@l SaverScope saverScope, @l ModalBottomSheetState modalBottomSheetState) {
        return modalBottomSheetState.getCurrentValue();
    }
}
