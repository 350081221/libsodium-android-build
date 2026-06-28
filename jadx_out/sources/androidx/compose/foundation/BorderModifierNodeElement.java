package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u001d\u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "Landroidx/compose/ui/graphics/Brush;", "component2", "Landroidx/compose/ui/graphics/Shape;", "component3", "width", "brush", "shape", "copy-8Feqmps", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/foundation/BorderModifierNodeElement;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "F", "getWidth-D9Ej5fM", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public static final int $stable = 0;

    @p4.l
    private final Brush brush;

    @p4.l
    private final Shape shape;
    private final float width;

    private BorderModifierNodeElement(float f5, Brush brush, Shape shape) {
        this.width = f5;
        this.brush = brush;
        this.shape = shape;
    }

    public /* synthetic */ BorderModifierNodeElement(float f5, Brush brush, Shape shape, w wVar) {
        this(f5, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m221copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f5, Brush brush, Shape shape, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = borderModifierNodeElement.width;
        }
        if ((i5 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i5 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m223copy8Feqmps(f5, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m222component1D9Ej5fM() {
        return this.width;
    }

    @p4.l
    public final Brush component2() {
        return this.brush;
    }

    @p4.l
    public final Shape component3() {
        return this.shape;
    }

    @p4.l
    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m223copy8Feqmps(float f5, @p4.l Brush brush, @p4.l Shape shape) {
        return new BorderModifierNodeElement(f5, brush, shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.m6049equalsimpl0(this.width, borderModifierNodeElement.width) && l0.g(this.brush, borderModifierNodeElement.brush) && l0.g(this.shape, borderModifierNodeElement.shape);
    }

    @p4.l
    public final Brush getBrush() {
        return this.brush;
    }

    @p4.l
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m224getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m6050hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", Dp.m6042boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m3724boximpl(((SolidColor) this.brush).m4067getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m3724boximpl(((SolidColor) this.brush).m4067getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    @p4.l
    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.m6055toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l BorderModifierNode borderModifierNode) {
        borderModifierNode.m220setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }
}
