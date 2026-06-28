package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/graphics/painter/Painter;", "component1", "", "component2", "Landroidx/compose/ui/Alignment;", "component3", "Landroidx/compose/ui/layout/ContentScale;", "component4", "", "component5", "Landroidx/compose/ui/graphics/ColorFilter;", "component6", "painter", "sizeToIntrinsics", "alignment", "contentScale", "alpha", "colorFilter", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "Z", "getSizeToIntrinsics", "()Z", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PainterElement extends ModifierNodeElement<PainterNode> {

    @l
    private final Alignment alignment;
    private final float alpha;

    @m
    private final ColorFilter colorFilter;

    @l
    private final ContentScale contentScale;

    @l
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterElement(@l Painter painter, boolean z4, @l Alignment alignment, @l ContentScale contentScale, float f5, @m ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z4;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f5;
        this.colorFilter = colorFilter;
    }

    public static /* synthetic */ PainterElement copy$default(PainterElement painterElement, Painter painter, boolean z4, Alignment alignment, ContentScale contentScale, float f5, ColorFilter colorFilter, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            painter = painterElement.painter;
        }
        if ((i5 & 2) != 0) {
            z4 = painterElement.sizeToIntrinsics;
        }
        boolean z5 = z4;
        if ((i5 & 4) != 0) {
            alignment = painterElement.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i5 & 8) != 0) {
            contentScale = painterElement.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i5 & 16) != 0) {
            f5 = painterElement.alpha;
        }
        float f6 = f5;
        if ((i5 & 32) != 0) {
            colorFilter = painterElement.colorFilter;
        }
        return painterElement.copy(painter, z5, alignment2, contentScale2, f6, colorFilter);
    }

    @l
    public final Painter component1() {
        return this.painter;
    }

    public final boolean component2() {
        return this.sizeToIntrinsics;
    }

    @l
    public final Alignment component3() {
        return this.alignment;
    }

    @l
    public final ContentScale component4() {
        return this.contentScale;
    }

    public final float component5() {
        return this.alpha;
    }

    @m
    public final ColorFilter component6() {
        return this.colorFilter;
    }

    @l
    public final PainterElement copy(@l Painter painter, boolean z4, @l Alignment alignment, @l ContentScale contentScale, float f5, @m ColorFilter colorFilter) {
        return new PainterElement(painter, z4, alignment, contentScale, f5, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return l0.g(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && l0.g(this.alignment, painterElement.alignment) && l0.g(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && l0.g(this.colorFilter, painterElement.colorFilter);
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @m
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @l
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @l
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    @l
    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public PainterNode create() {
        return new PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l PainterNode painterNode) {
        boolean sizeToIntrinsics = painterNode.getSizeToIntrinsics();
        boolean z4 = this.sizeToIntrinsics;
        boolean z5 = sizeToIntrinsics != z4 || (z4 && !Size.m3558equalsimpl0(painterNode.getPainter().mo4347getIntrinsicSizeNHjbRc(), this.painter.mo4347getIntrinsicSizeNHjbRc()));
        painterNode.setPainter(this.painter);
        painterNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterNode.setAlignment(this.alignment);
        painterNode.setContentScale(this.contentScale);
        painterNode.setAlpha(this.alpha);
        painterNode.setColorFilter(this.colorFilter);
        if (z5) {
            LayoutModifierNodeKt.invalidateMeasurement(painterNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterNode);
    }
}
