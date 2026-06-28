package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.i0;

@Stable
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing;", "", "calculateSpacing", "", "Landroidx/compose/ui/unit/Density;", "contentWidth", "containerWidth", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface MarqueeSpacing {

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing$Companion;", "", "()V", "fractionOfContainer", "Landroidx/compose/foundation/MarqueeSpacing;", "fraction", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f5, Density density, int i5, int i6) {
            int L0;
            L0 = kotlin.math.d.L0(f5 * i6);
            return L0;
        }

        @p4.l
        @ExperimentalFoundationApi
        public final MarqueeSpacing fractionOfContainer(final float f5) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.f
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int calculateSpacing(Density density, int i5, int i6) {
                    int fractionOfContainer$lambda$0;
                    fractionOfContainer$lambda$0 = MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f5, density, i5, i6);
                    return fractionOfContainer$lambda$0;
                }
            };
        }
    }

    @ExperimentalFoundationApi
    int calculateSpacing(@p4.l Density density, int i5, int i6);
}
