package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/Shapes;", "", "extraSmall", "Landroidx/compose/foundation/shape/CornerBasedShape;", "small", "medium", "large", "extraLarge", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "getExtraLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "getLarge", "getMedium", "getSmall", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;

    @p4.l
    private final CornerBasedShape extraLarge;

    @p4.l
    private final CornerBasedShape extraSmall;

    @p4.l
    private final CornerBasedShape large;

    @p4.l
    private final CornerBasedShape medium;

    @p4.l
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public Shapes(@p4.l CornerBasedShape cornerBasedShape, @p4.l CornerBasedShape cornerBasedShape2, @p4.l CornerBasedShape cornerBasedShape3, @p4.l CornerBasedShape cornerBasedShape4, @p4.l CornerBasedShape cornerBasedShape5) {
        this.extraSmall = cornerBasedShape;
        this.small = cornerBasedShape2;
        this.medium = cornerBasedShape3;
        this.large = cornerBasedShape4;
        this.extraLarge = cornerBasedShape5;
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i5 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape2;
        if ((i5 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        if ((i5 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        CornerBasedShape cornerBasedShape8 = cornerBasedShape4;
        if ((i5 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8, cornerBasedShape5);
    }

    @p4.l
    public final Shapes copy(@p4.l CornerBasedShape cornerBasedShape, @p4.l CornerBasedShape cornerBasedShape2, @p4.l CornerBasedShape cornerBasedShape3, @p4.l CornerBasedShape cornerBasedShape4, @p4.l CornerBasedShape cornerBasedShape5) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        if (kotlin.jvm.internal.l0.g(this.extraSmall, shapes.extraSmall) && kotlin.jvm.internal.l0.g(this.small, shapes.small) && kotlin.jvm.internal.l0.g(this.medium, shapes.medium) && kotlin.jvm.internal.l0.g(this.large, shapes.large) && kotlin.jvm.internal.l0.g(this.extraLarge, shapes.extraLarge)) {
            return true;
        }
        return false;
    }

    @p4.l
    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    @p4.l
    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
    }

    @p4.l
    public final CornerBasedShape getLarge() {
        return this.large;
    }

    @p4.l
    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    @p4.l
    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    @p4.l
    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i5 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i5 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i5 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i5 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
