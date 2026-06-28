package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/unit/TextUnit;", "invoke-mpE4wyQ", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$1 extends n0 implements p<SaverScope, TextUnit, Object> {
    public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();

    SaversKt$TextUnitSaver$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
        return m5492invokempE4wyQ(saverScope, textUnit.m6244unboximpl());
    }

    @m
    /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
    public final Object m5492invokempE4wyQ(@l SaverScope saverScope, long j5) {
        ArrayList r5;
        if (TextUnit.m6232equalsimpl0(j5, TextUnit.Companion.m6246getUnspecifiedXSAIIZE())) {
            return Boolean.FALSE;
        }
        r5 = w.r(SaversKt.save(Float.valueOf(TextUnit.m6235getValueimpl(j5))), SaversKt.save(TextUnitType.m6260boximpl(TextUnit.m6234getTypeUIouoOA(j5))));
        return r5;
    }
}
