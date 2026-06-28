package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BJ\u0012A\u0010\u0018\u001a=\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016RO\u0010\u0018\u001a=\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\u0002\b\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/v0;", "name", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Lv3/q;", "<init>", "(Lv3/q;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;

    @l
    private final q<Path, Size, LayoutDirection, r2> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(@l q<? super Path, ? super Size, ? super LayoutDirection, r2> qVar) {
        this.builder = qVar;
    }

    @Override // androidx.compose.ui.graphics.Shape
    @l
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo251createOutlinePq9zytI(long j5, @l LayoutDirection layoutDirection, @l Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m3550boximpl(j5), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return l0.g(genericShape != null ? genericShape.builder : null, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
