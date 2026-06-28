package androidx.compose.ui.graphics;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m3879maxAoSsdG0(short s5, short s6) {
        if (!Float16.m3852isNaNimpl(s5) && !Float16.m3852isNaNimpl(s6)) {
            if (Float16.m3839compareTo41bOqos(s5, s6) < 0) {
                return s6;
            }
            return s5;
        }
        return Float16.Companion.m3874getNaNslo4al4();
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m3880minAoSsdG0(short s5, short s6) {
        if (!Float16.m3852isNaNimpl(s5) && !Float16.m3852isNaNimpl(s6)) {
            if (Float16.m3839compareTo41bOqos(s5, s6) > 0) {
                return s6;
            }
            return s5;
        }
        return Float16.Companion.m3874getNaNslo4al4();
    }
}
