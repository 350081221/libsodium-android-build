package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/constraintlayout/compose/VerticalAnchorable;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "Lkotlin/r2;", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "linkTo", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface VerticalAnchorable {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static /* synthetic */ void m6394linkToVpY3zN4$default(VerticalAnchorable verticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f5, float f6, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 2) != 0) {
                    f5 = Dp.m6044constructorimpl(0);
                }
                if ((i5 & 4) != 0) {
                    f6 = Dp.m6044constructorimpl(0);
                }
                verticalAnchorable.mo6300linkToVpY3zN4(verticalAnchor, f5, f6);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
    }

    /* renamed from: linkTo-VpY3zN4 */
    void mo6300linkToVpY3zN4(@l ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f5, float f6);
}
