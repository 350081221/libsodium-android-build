package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Shadow;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n60#2,2:455\n60#2,2:458\n91#2:461\n1#3:457\n1#3:460\n1#3:462\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n369#1:455,2\n370#1:458,2\n371#1:461\n369#1:457\n370#1:460\n371#1:462\n*E\n"})
/* loaded from: classes.dex */
final class SaversKt$ShadowSaver$2 extends n0 implements l<Object, Shadow> {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    SaversKt$ShadowSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final Shadow invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
        Boolean bool = Boolean.FALSE;
        Color restore = ((!l0.g(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        l0.m(restore);
        long m3744unboximpl = restore.m3744unboximpl();
        Object obj3 = list.get(1);
        Saver<Offset, Object> saver2 = SaversKt.getSaver(Offset.Companion);
        Offset restore2 = ((!l0.g(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        l0.m(restore2);
        long m3503unboximpl = restore2.m3503unboximpl();
        Object obj4 = list.get(2);
        Float f5 = obj4 != null ? (Float) obj4 : null;
        l0.m(f5);
        return new Shadow(m3744unboximpl, m3503unboximpl, f5.floatValue(), null);
    }
}
