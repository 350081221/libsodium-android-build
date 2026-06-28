package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/TextRange;", "invoke-FDrldGo", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$1 extends n0 implements p<SaverScope, TextRange, Object> {
    public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();

    SaversKt$TextRangeSaver$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
        return m5490invokeFDrldGo(saverScope, textRange.m5549unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: invoke-FDrldGo, reason: not valid java name */
    public final Object m5490invokeFDrldGo(@l SaverScope saverScope, long j5) {
        ArrayList r5;
        r5 = w.r(SaversKt.save(Integer.valueOf(TextRange.m5545getStartimpl(j5))), SaversKt.save(Integer.valueOf(TextRange.m5540getEndimpl(j5))));
        return r5;
    }
}
