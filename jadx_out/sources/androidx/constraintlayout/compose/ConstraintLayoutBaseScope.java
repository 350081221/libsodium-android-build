package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0013\b'\u0018\u00002\u00020\u0001:\u0003PQRB\u0007¢\u0006\u0004\bO\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000fJ'\u0010\u0011\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00122\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000fJ\u001b\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cJ\u001b\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001b\u0010!\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0018J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cJ\u001b\u0010%\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cJ\u001b\u0010'\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010$J\u000e\u0010'\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cJ1\u0010.\u001a\u00020\u00162\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J1\u00100\u001a\u00020\u00162\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010-J1\u00103\u001a\u00020\"2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J1\u00105\u001a\u00020\u00162\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010-J1\u00107\u001a\u00020\u00162\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u0010-J1\u00109\u001a\u00020\"2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00102J+\u0010<\u001a\u00020\u000b2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J+\u0010>\u001a\u00020\u00122\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(\"\u00020)2\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b>\u0010?R,\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\r0@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR(\u0010E\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010L\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010F\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006S"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "", b.f22420d, "Lkotlin/r2;", "updateHelpersHashCode", "createHelperId", "Landroidx/constraintlayout/compose/State;", "state", "applyTo", "reset", "Landroidx/constraintlayout/compose/HorizontalChainReference;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/HorizontalChainScope;", "Lkotlin/u;", "constrainBlock", "constrain", "Landroidx/constraintlayout/compose/VerticalChainReference;", "Landroidx/constraintlayout/compose/VerticalChainScope;", "Landroidx/compose/ui/unit/Dp;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createGuidelineFromStart-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createGuidelineFromStart", "createGuidelineFromAbsoluteLeft-0680j_4", "createGuidelineFromAbsoluteLeft", "", "fraction", "createGuidelineFromEnd-0680j_4", "createGuidelineFromEnd", "createGuidelineFromAbsoluteRight-0680j_4", "createGuidelineFromAbsoluteRight", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop", "createGuidelineFromBottom-0680j_4", "createGuidelineFromBottom", "", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "elements", "margin", "createStartBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createStartBarrier", "createAbsoluteLeftBarrier-3ABfNKs", "createAbsoluteLeftBarrier", "createTopBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createTopBarrier", "createEndBarrier-3ABfNKs", "createEndBarrier", "createAbsoluteRightBarrier-3ABfNKs", "createAbsoluteRightBarrier", "createBottomBarrier-3ABfNKs", "createBottomBarrier", "Landroidx/constraintlayout/compose/ChainStyle;", "chainStyle", "createHorizontalChain", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;", "createVerticalChain", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;", "", "tasks", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "helpersHashCode", "I", "getHelpersHashCode", "()I", "setHelpersHashCode", "(I)V", "getHelpersHashCode$annotations", "()V", "HelpersStartId", "helperId", "<init>", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private int helpersHashCode;

    @l
    private final List<v3.l<State, r2>> tasks = new ArrayList();
    private final int HelpersStartId = 1000;
    private int helperId = 1000;

    @Stable
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u0007J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "id", "(Ljava/lang/Object;)V", "getId$compose_release", "()Ljava/lang/Object;", "component1", "component1$compose_release", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BaselineAnchor {

        @l
        private final Object id;

        public BaselineAnchor(@l Object id) {
            l0.p(id, "id");
            this.id = id;
        }

        public static /* synthetic */ BaselineAnchor copy$default(BaselineAnchor baselineAnchor, Object obj, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                obj = baselineAnchor.id;
            }
            return baselineAnchor.copy(obj);
        }

        @l
        public final Object component1$compose_release() {
            return this.id;
        }

        @l
        public final BaselineAnchor copy(@l Object id) {
            l0.p(id, "id");
            return new BaselineAnchor(id);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaselineAnchor) && l0.g(this.id, ((BaselineAnchor) obj).id);
        }

        @l
        public final Object getId$compose_release() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @l
        public String toString() {
            return "BaselineAnchor(id=" + this.id + ')';
        }
    }

    @Stable
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "id", "index", "", "(Ljava/lang/Object;I)V", "getId$compose_release", "()Ljava/lang/Object;", "getIndex$compose_release", "()I", "component1", "component1$compose_release", "component2", "component2$compose_release", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class HorizontalAnchor {

        @l
        private final Object id;
        private final int index;

        public HorizontalAnchor(@l Object id, int i5) {
            l0.p(id, "id");
            this.id = id;
            this.index = i5;
        }

        public static /* synthetic */ HorizontalAnchor copy$default(HorizontalAnchor horizontalAnchor, Object obj, int i5, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                obj = horizontalAnchor.id;
            }
            if ((i6 & 2) != 0) {
                i5 = horizontalAnchor.index;
            }
            return horizontalAnchor.copy(obj, i5);
        }

        @l
        public final Object component1$compose_release() {
            return this.id;
        }

        public final int component2$compose_release() {
            return this.index;
        }

        @l
        public final HorizontalAnchor copy(@l Object id, int i5) {
            l0.p(id, "id");
            return new HorizontalAnchor(id, i5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return l0.g(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index;
        }

        @l
        public final Object getId$compose_release() {
            return this.id;
        }

        public final int getIndex$compose_release() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        @l
        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    @Stable
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "id", "index", "", "(Ljava/lang/Object;I)V", "getId$compose_release", "()Ljava/lang/Object;", "getIndex$compose_release", "()I", "component1", "component1$compose_release", "component2", "component2$compose_release", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class VerticalAnchor {

        @l
        private final Object id;
        private final int index;

        public VerticalAnchor(@l Object id, int i5) {
            l0.p(id, "id");
            this.id = id;
            this.index = i5;
        }

        public static /* synthetic */ VerticalAnchor copy$default(VerticalAnchor verticalAnchor, Object obj, int i5, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                obj = verticalAnchor.id;
            }
            if ((i6 & 2) != 0) {
                i5 = verticalAnchor.index;
            }
            return verticalAnchor.copy(obj, i5);
        }

        @l
        public final Object component1$compose_release() {
            return this.id;
        }

        public final int component2$compose_release() {
            return this.index;
        }

        @l
        public final VerticalAnchor copy(@l Object id, int i5) {
            l0.p(id, "id");
            return new VerticalAnchor(id, i5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return l0.g(this.id, verticalAnchor.id) && this.index == verticalAnchor.index;
        }

        @l
        public final Object getId$compose_release() {
            return this.id;
        }

        public final int getIndex$compose_release() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        @l
        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m6317createAbsoluteLeftBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6323createAbsoluteLeftBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m6318createAbsoluteRightBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6324createAbsoluteRightBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
    }

    /* renamed from: createBottomBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m6319createBottomBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6325createBottomBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
    }

    /* renamed from: createEndBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m6320createEndBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6326createEndBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
    }

    private final int createHelperId() {
        int i5 = this.helperId;
        this.helperId = i5 + 1;
        return i5;
    }

    public static /* synthetic */ HorizontalChainReference createHorizontalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, ChainStyle chainStyle, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                chainStyle = ChainStyle.Companion.getSpread();
            }
            return constraintLayoutBaseScope.createHorizontalChain(constrainedLayoutReferenceArr, chainStyle);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
    }

    /* renamed from: createStartBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m6321createStartBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6333createStartBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
    }

    /* renamed from: createTopBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m6322createTopBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, float f5, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                f5 = Dp.m6044constructorimpl(0);
            }
            return constraintLayoutBaseScope.m6334createTopBarrier3ABfNKs(constrainedLayoutReferenceArr, f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
    }

    public static /* synthetic */ VerticalChainReference createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstrainedLayoutReference[] constrainedLayoutReferenceArr, ChainStyle chainStyle, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                chainStyle = ChainStyle.Companion.getSpread();
            }
            return constraintLayoutBaseScope.createVerticalChain(constrainedLayoutReferenceArr, chainStyle);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
    }

    @a1
    public static /* synthetic */ void getHelpersHashCode$annotations() {
    }

    private final void updateHelpersHashCode(int i5) {
        this.helpersHashCode = ((this.helpersHashCode * PointerIconCompat.TYPE_VERTICAL_TEXT) + i5) % 1000000007;
    }

    public final void applyTo(@l State state) {
        l0.p(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((v3.l) it.next()).invoke(state);
        }
    }

    @l
    public final HorizontalChainScope constrain(@l HorizontalChainReference ref, @l v3.l<? super HorizontalChainScope, r2> constrainBlock) {
        l0.p(ref, "ref");
        l0.p(constrainBlock, "constrainBlock");
        HorizontalChainScope horizontalChainScope = new HorizontalChainScope(ref.getId$compose_release());
        constrainBlock.invoke(horizontalChainScope);
        getTasks().addAll(horizontalChainScope.getTasks$compose_release());
        return horizontalChainScope;
    }

    @l
    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m6323createAbsoluteLeftBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createAbsoluteLeftBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(11);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createAbsoluteRightBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m6324createAbsoluteRightBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createAbsoluteRightBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(14);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createBottomBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m6325createBottomBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createBottomBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(15);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new HorizontalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createEndBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m6326createEndBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createEndBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(13);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final VerticalAnchor createGuidelineFromAbsoluteLeft(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteLeft$2(createHelperId, f5));
        updateHelpersHashCode(4);
        updateHelpersHashCode(Float.hashCode(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createGuidelineFromAbsoluteLeft-0680j_4, reason: not valid java name */
    public final VerticalAnchor m6327createGuidelineFromAbsoluteLeft0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteLeft$1(createHelperId, f5));
        updateHelpersHashCode(2);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final VerticalAnchor createGuidelineFromAbsoluteRight(float f5) {
        return createGuidelineFromAbsoluteLeft(1.0f - f5);
    }

    @l
    /* renamed from: createGuidelineFromAbsoluteRight-0680j_4, reason: not valid java name */
    public final VerticalAnchor m6328createGuidelineFromAbsoluteRight0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteRight$1(createHelperId, f5));
        updateHelpersHashCode(6);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final HorizontalAnchor createGuidelineFromBottom(float f5) {
        return createGuidelineFromTop(1.0f - f5);
    }

    @l
    /* renamed from: createGuidelineFromBottom-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m6329createGuidelineFromBottom0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromBottom$1(createHelperId, f5));
        updateHelpersHashCode(9);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new HorizontalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final VerticalAnchor createGuidelineFromEnd(float f5) {
        return createGuidelineFromStart(1.0f - f5);
    }

    @l
    /* renamed from: createGuidelineFromEnd-0680j_4, reason: not valid java name */
    public final VerticalAnchor m6330createGuidelineFromEnd0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromEnd$1(createHelperId, f5));
        updateHelpersHashCode(5);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final VerticalAnchor createGuidelineFromStart(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromStart$2(createHelperId, f5));
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createGuidelineFromStart-0680j_4, reason: not valid java name */
    public final VerticalAnchor m6331createGuidelineFromStart0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromStart$1(createHelperId, f5));
        updateHelpersHashCode(1);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final HorizontalAnchor createGuidelineFromTop(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromTop$2(createHelperId, f5));
        updateHelpersHashCode(8);
        updateHelpersHashCode(Float.hashCode(f5));
        return new HorizontalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createGuidelineFromTop-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m6332createGuidelineFromTop0680j_4(float f5) {
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createGuidelineFromTop$1(createHelperId, f5));
        updateHelpersHashCode(7);
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new HorizontalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final HorizontalChainReference createHorizontalChain(@l ConstrainedLayoutReference[] elements, @l ChainStyle chainStyle) {
        l0.p(elements, "elements");
        l0.p(chainStyle, "chainStyle");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createHorizontalChain$1(createHelperId, elements, chainStyle));
        updateHelpersHashCode(16);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return new HorizontalChainReference(Integer.valueOf(createHelperId));
    }

    @l
    /* renamed from: createStartBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m6333createStartBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createStartBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(10);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new VerticalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    /* renamed from: createTopBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m6334createTopBarrier3ABfNKs(@l ConstrainedLayoutReference[] elements, float f5) {
        l0.p(elements, "elements");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createTopBarrier$1(createHelperId, f5, elements));
        updateHelpersHashCode(12);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(Dp.m6050hashCodeimpl(f5));
        return new HorizontalAnchor(Integer.valueOf(createHelperId), 0);
    }

    @l
    public final VerticalChainReference createVerticalChain(@l ConstrainedLayoutReference[] elements, @l ChainStyle chainStyle) {
        l0.p(elements, "elements");
        l0.p(chainStyle, "chainStyle");
        int createHelperId = createHelperId();
        this.tasks.add(new ConstraintLayoutBaseScope$createVerticalChain$1(createHelperId, elements, chainStyle));
        updateHelpersHashCode(17);
        for (ConstrainedLayoutReference constrainedLayoutReference : elements) {
            updateHelpersHashCode(constrainedLayoutReference.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return new VerticalChainReference(Integer.valueOf(createHelperId));
    }

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final List<v3.l<State, r2>> getTasks() {
        return this.tasks;
    }

    public void reset() {
        this.tasks.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final void setHelpersHashCode(int i5) {
        this.helpersHashCode = i5;
    }

    @l
    public final VerticalChainScope constrain(@l VerticalChainReference ref, @l v3.l<? super VerticalChainScope, r2> constrainBlock) {
        l0.p(ref, "ref");
        l0.p(constrainBlock, "constrainBlock");
        VerticalChainScope verticalChainScope = new VerticalChainScope(ref.getId$compose_release());
        constrainBlock.invoke(verticalChainScope);
        getTasks().addAll(verticalChainScope.getTasks$compose_release());
        return verticalChainScope;
    }
}
