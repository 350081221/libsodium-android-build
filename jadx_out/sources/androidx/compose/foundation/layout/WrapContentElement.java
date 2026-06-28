package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/WrapContentNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/layout/Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/layout/Direction;", "unbounded", "Z", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "Lv3/p;", "align", "Ljava/lang/Object;", "", "inspectorName", "Ljava/lang/String;", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLv3/p;Ljava/lang/Object;Ljava/lang/String;)V", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Object align;

    @l
    private final p<IntSize, LayoutDirection, IntOffset> alignmentCallback;

    @l
    private final Direction direction;

    @l
    private final String inspectorName;
    private final boolean unbounded;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$Companion;", "", "()V", "height", "Landroidx/compose/foundation/layout/WrapContentElement;", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "size", "Landroidx/compose/ui/Alignment;", "width", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        @l
        public final WrapContentElement height(@l Alignment.Vertical vertical, boolean z4) {
            return new WrapContentElement(Direction.Vertical, z4, new WrapContentElement$Companion$height$1(vertical), vertical, "wrapContentHeight");
        }

        @Stable
        @l
        public final WrapContentElement size(@l Alignment alignment, boolean z4) {
            return new WrapContentElement(Direction.Both, z4, new WrapContentElement$Companion$size$1(alignment), alignment, "wrapContentSize");
        }

        @Stable
        @l
        public final WrapContentElement width(@l Alignment.Horizontal horizontal, boolean z4) {
            return new WrapContentElement(Direction.Horizontal, z4, new WrapContentElement$Companion$width$1(horizontal), horizontal, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@l Direction direction, boolean z4, @l p<? super IntSize, ? super LayoutDirection, IntOffset> pVar, @l Object obj, @l String str) {
        this.direction = direction;
        this.unbounded = z4;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && l0.g(this.align, wrapContentElement.align)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }
}
