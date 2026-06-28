package androidx.compose.material3;

import java.util.List;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/TopAppBarState;", "it", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TopAppBarState$Companion$Saver$2 extends kotlin.jvm.internal.n0 implements v3.l<List<? extends Float>, TopAppBarState> {
    public static final TopAppBarState$Companion$Saver$2 INSTANCE = new TopAppBarState$Companion$Saver$2();

    TopAppBarState$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ TopAppBarState invoke(List<? extends Float> list) {
        return invoke2((List<Float>) list);
    }

    @p4.m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final TopAppBarState invoke2(@p4.l List<Float> list) {
        return new TopAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
    }
}
