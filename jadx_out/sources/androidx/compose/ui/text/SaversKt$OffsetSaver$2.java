package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n91#2:455\n1#3:456\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n426#1:455\n426#1:456\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$2 extends n0 implements l<Object, Offset> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    SaversKt$OffsetSaver$2() {
        super(1);
    }

    @Override // v3.l
    @m
    /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Offset invoke(@p4.l Object obj) {
        Float f5;
        if (l0.g(obj, Boolean.FALSE)) {
            return Offset.m3482boximpl(Offset.Companion.m3508getUnspecifiedF1C5BW0());
        }
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f6 = null;
        if (obj2 != null) {
            f5 = (Float) obj2;
        } else {
            f5 = null;
        }
        l0.m(f5);
        float floatValue = f5.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f6 = (Float) obj3;
        }
        l0.m(f6);
        return Offset.m3482boximpl(OffsetKt.Offset(floatValue, f6.floatValue()));
    }
}
