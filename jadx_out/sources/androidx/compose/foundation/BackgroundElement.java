package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BF\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u001a\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR%\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BackgroundNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "J", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Brush;", "", "alpha", "F", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "<init>", "(JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lv3/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;

    @p4.m
    private final Brush brush;
    private final long color;

    @p4.l
    private final v3.l<InspectorInfo, r2> inspectorInfo;

    @p4.l
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j5, Brush brush, float f5, Shape shape, v3.l lVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? null : brush, f5, shape, lVar, null);
    }

    public /* synthetic */ BackgroundElement(long j5, Brush brush, float f5, Shape shape, v3.l lVar, w wVar) {
        this(j5, brush, f5, shape, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        BackgroundElement backgroundElement;
        boolean z4;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !Color.m3735equalsimpl0(this.color, backgroundElement.color) || !l0.g(this.brush, backgroundElement.brush)) {
            return false;
        }
        if (this.alpha == backgroundElement.alpha) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || !l0.g(this.shape, backgroundElement.shape)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int m3741hashCodeimpl = Color.m3741hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        if (brush != null) {
            i5 = brush.hashCode();
        } else {
            i5 = 0;
        }
        return ((((m3741hashCodeimpl + i5) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l BackgroundNode backgroundNode) {
        backgroundNode.m203setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        backgroundNode.setShape(this.shape);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j5, Brush brush, float f5, Shape shape, v3.l<? super InspectorInfo, r2> lVar) {
        this.color = j5;
        this.brush = brush;
        this.alpha = f5;
        this.shape = shape;
        this.inspectorInfo = lVar;
    }
}
