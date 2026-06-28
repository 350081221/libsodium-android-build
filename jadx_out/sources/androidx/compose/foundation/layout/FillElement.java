package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/FillNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/layout/Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/layout/Direction;", "", "fraction", "F", "", "inspectorName", "Ljava/lang/String;", "<init>", "(Landroidx/compose/foundation/layout/Direction;FLjava/lang/String;)V", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement<FillNode> {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Direction direction;
    private final float fraction;

    @l
    private final String inspectorName;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$Companion;", "", "()V", "height", "Landroidx/compose/foundation/layout/FillElement;", "fraction", "", "size", "width", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        @l
        public final FillElement height(float f5) {
            return new FillElement(Direction.Vertical, f5, "fillMaxHeight");
        }

        @Stable
        @l
        public final FillElement size(float f5) {
            return new FillElement(Direction.Both, f5, "fillMaxSize");
        }

        @Stable
        @l
        public final FillElement width(float f5) {
            return new FillElement(Direction.Horizontal, f5, "fillMaxWidth");
        }
    }

    public FillElement(@l Direction direction, float f5, @l String str) {
        this.direction = direction;
        this.fraction = f5;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.direction != fillElement.direction) {
            return false;
        }
        if (this.fraction == fillElement.fraction) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l FillNode fillNode) {
        fillNode.setDirection(this.direction);
        fillNode.setFraction(this.fraction);
    }
}
