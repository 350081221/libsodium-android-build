package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001e\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0012\u0010 \u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010$\u001a\u00020!8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", "left", "top", "right", "bottom", "Lkotlin/r2;", "intersect", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "", "contains-k-4lQ0M", "(J)Z", "contains", "set", "", "toString", "F", "getLeft", "()F", "setLeft", "(F)V", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "isEmpty", "()Z", "<init>", "(FFFF)V", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
/* loaded from: classes.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f5, float f6, float f7, float f8) {
        this.left = f5;
        this.top = f6;
        this.right = f7;
        this.bottom = f8;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3480containsk4lQ0M(long j5) {
        return Offset.m3493getXimpl(j5) >= this.left && Offset.m3493getXimpl(j5) < this.right && Offset.m3494getYimpl(j5) >= this.top && Offset.m3494getYimpl(j5) < this.bottom;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3481getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @Stable
    public final void intersect(float f5, float f6, float f7, float f8) {
        this.left = Math.max(f5, this.left);
        this.top = Math.max(f6, this.top);
        this.right = Math.min(f7, this.right);
        this.bottom = Math.min(f8, this.bottom);
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void set(float f5, float f6, float f7, float f8) {
        this.left = f5;
        this.top = f6;
        this.right = f7;
        this.bottom = f8;
    }

    public final void setBottom(float f5) {
        this.bottom = f5;
    }

    public final void setLeft(float f5) {
        this.left = f5;
    }

    public final void setRight(float f5) {
        this.right = f5;
    }

    public final void setTop(float f5) {
        this.top = f5;
    }

    @l
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
