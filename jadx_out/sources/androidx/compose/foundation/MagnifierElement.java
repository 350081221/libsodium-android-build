package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012\u0012\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u0012\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R%\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R'\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/u;", "sourceCenter", "Lv3/l;", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "onSizeChanged", "", "zoom", "F", "useTextDefault", "Z", "size", "J", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "<init>", "(Lv3/l;Lv3/l;Lv3/l;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;

    @p4.m
    private final v3.l<Density, Offset> magnifierCenter;

    @p4.m
    private final v3.l<DpSize, r2> onSizeChanged;

    @p4.l
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;

    @p4.l
    private final v3.l<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory, int i5, w wVar) {
        this(lVar, (i5 & 2) != 0 ? null : lVar2, (i5 & 4) != 0 ? null : lVar3, (i5 & 8) != 0 ? Float.NaN : f5, (i5 & 16) != 0 ? false : z4, (i5 & 32) != 0 ? DpSize.Companion.m6151getUnspecifiedMYxV2XQ() : j5, (i5 & 64) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, (i5 & 128) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f7, (i5 & 256) != 0 ? true : z5, platformMagnifierFactory, null);
    }

    public /* synthetic */ MagnifierElement(v3.l lVar, v3.l lVar2, v3.l lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory, w wVar) {
        this(lVar, lVar2, lVar3, f5, z4, j5, f6, f7, z5, platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (!l0.g(this.sourceCenter, magnifierElement.sourceCenter) || !l0.g(this.magnifierCenter, magnifierElement.magnifierCenter)) {
            return false;
        }
        if (this.zoom == magnifierElement.zoom) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m6139equalsimpl0(this.size, magnifierElement.size) && Dp.m6049equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m6049equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && l0.g(this.onSizeChanged, magnifierElement.onSizeChanged) && l0.g(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int hashCode = this.sourceCenter.hashCode() * 31;
        v3.l<Density, Offset> lVar = this.magnifierCenter;
        int i6 = 0;
        if (lVar != null) {
            i5 = lVar.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((((((((((((hashCode + i5) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + DpSize.m6144hashCodeimpl(this.size)) * 31) + Dp.m6050hashCodeimpl(this.cornerRadius)) * 31) + Dp.m6050hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        v3.l<DpSize, r2> lVar2 = this.onSizeChanged;
        if (lVar2 != null) {
            i6 = lVar2.hashCode();
        }
        return ((hashCode2 + i6) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set("size", DpSize.m6130boximpl(this.size));
        inspectorInfo.getProperties().set("cornerRadius", Dp.m6042boximpl(this.cornerRadius));
        inspectorInfo.getProperties().set("elevation", Dp.m6042boximpl(this.elevation));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l MagnifierNode magnifierNode) {
        magnifierNode.m266update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(v3.l<? super Density, Offset> lVar, v3.l<? super Density, Offset> lVar2, v3.l<? super DpSize, r2> lVar3, float f5, boolean z4, long j5, float f6, float f7, boolean z5, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f5;
        this.useTextDefault = z4;
        this.size = j5;
        this.cornerRadius = f6;
        this.elevation = f7;
        this.clippingEnabled = z5;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }
}
