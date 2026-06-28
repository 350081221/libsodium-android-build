package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u001c¢\u0006\u0002\b\u001d¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0016R\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u001c¢\u0006\u0002\b\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/unit/Dp;", "x", "F", "getX-D9Ej5fM", "()F", "y", "getY-D9Ej5fM", "rtlAware", "Z", "getRtlAware", "()Z", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(FFZLv3/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private final float f244x;

    /* renamed from: y, reason: collision with root package name */
    private final float f245y;

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f5, float f6, boolean z4, v3.l<? super InspectorInfo, r2> lVar) {
        this.f244x = f5;
        this.f245y = f6;
        this.rtlAware = z4;
        this.inspectorInfo = lVar;
    }

    public /* synthetic */ OffsetElement(float f5, float f6, boolean z4, v3.l lVar, w wVar) {
        this(f5, f6, z4, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement == null) {
            return false;
        }
        if (Dp.m6049equalsimpl0(this.f244x, offsetElement.f244x) && Dp.m6049equalsimpl0(this.f245y, offsetElement.f245y) && this.rtlAware == offsetElement.rtlAware) {
            return true;
        }
        return false;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m509getXD9Ej5fM() {
        return this.f244x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m510getYD9Ej5fM() {
        return this.f245y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m6050hashCodeimpl(this.f244x) * 31) + Dp.m6050hashCodeimpl(this.f245y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @l
    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m6055toStringimpl(this.f244x)) + ", y=" + ((Object) Dp.m6055toStringimpl(this.f245y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public OffsetNode create() {
        return new OffsetNode(this.f244x, this.f245y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l OffsetNode offsetNode) {
        offsetNode.m517setX0680j_4(this.f244x);
        offsetNode.m518setY0680j_4(this.f245y);
        offsetNode.setRtlAware(this.rtlAware);
    }
}
