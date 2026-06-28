package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.u0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J4\u0010\u000f\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J*\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0017HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/r2;", "addCutoutShape", "", "cutoutStartPosition", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "addRoundedEdges", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "component1", "Landroidx/compose/material/FabPlacement;", "component2", "cutoutShape", "fabPlacement", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/graphics/Shape;", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material/FabPlacement;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,758:1\n1#2:759\n632#3:760\n606#3:761\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n556#1:760\n556#1:761\n*E\n"})
/* loaded from: classes.dex */
public final class BottomAppBarCutoutShape implements Shape {

    @l
    private final Shape cutoutShape;

    @l
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(@l Shape shape, @l FabPlacement fabPlacement) {
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float f5;
        float f6;
        f5 = AppBarKt.BottomAppBarCutoutOffset;
        float mo304toPx0680j_4 = density.mo304toPx0680j_4(f5);
        float f7 = 2 * mo304toPx0680j_4;
        long Size = SizeKt.Size(this.fabPlacement.getWidth() + f7, this.fabPlacement.getHeight() + f7);
        float left = this.fabPlacement.getLeft() - mo304toPx0680j_4;
        float m3562getWidthimpl = left + Size.m3562getWidthimpl(Size);
        float m3559getHeightimpl = Size.m3559getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo251createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo3629translatek4lQ0M(OffsetKt.Offset(left, -m3559getHeightimpl));
        if (l0.g(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            f6 = AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, m3562getWidthimpl, m3559getHeightimpl, density.mo304toPx0680j_4(f6), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f5, float f6, float f7, float f8, float f9) {
        float f10 = -((float) Math.sqrt((f7 * f7) - (f9 * f9)));
        float f11 = f7 + f10;
        float f12 = f5 + f11;
        float f13 = f6 - f11;
        u0<Float, Float> calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f10 - 1.0f, f9, f7);
        float floatValue = calculateRoundedEdgeIntercept.component1().floatValue() + f7;
        float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue() - f9;
        path.moveTo(f12 - f8, 0.0f);
        path.quadraticBezierTo(f12 - 1.0f, 0.0f, f5 + floatValue, floatValue2);
        path.lineTo(f6 - floatValue, floatValue2);
        path.quadraticBezierTo(f13 + 1.0f, 0.0f, f8 + f13, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i5 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    @l
    public final Shape component1() {
        return this.cutoutShape;
    }

    @l
    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    @l
    public final BottomAppBarCutoutShape copy(@l Shape shape, @l FabPlacement fabPlacement) {
        return new BottomAppBarCutoutShape(shape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    @l
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo251createOutlinePq9zytI(long j5, @l LayoutDirection layoutDirection, @l Density density) {
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m3562getWidthimpl(j5), Size.m3559getHeightimpl(j5)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo3626opN5in7k0(Path, Path2, PathOperation.Companion.m4024getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        return l0.g(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && l0.g(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    @l
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @l
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    @l
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
