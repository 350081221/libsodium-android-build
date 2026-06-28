package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "equals", "", "other", "equals-impl", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Landroidx/compose/ui/graphics/Shape;)I", "toString", "", "toString-impl", "(Landroidx/compose/ui/graphics/Shape;)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@f
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Shape Rectangle = m3391constructorimpl(RectangleShapeKt.getRectangleShape());

    @l
    private static final Shape Unbounded = m3391constructorimpl(null);

    @m
    private final Shape shape;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment$Companion;", "", "()V", "Rectangle", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "getRectangle---Goahg", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Shape;", "Unbounded", "getUnbounded---Goahg", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m3397getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        @l
        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m3398getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m3390boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m3391constructorimpl(@m Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3392equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && l0.g(shape, ((BlurredEdgeTreatment) obj).m3396unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3393equalsimpl0(Shape shape, Shape shape2) {
        return l0.g(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3394hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3395toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m3392equalsimpl(this.shape, obj);
    }

    @m
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m3394hashCodeimpl(this.shape);
    }

    public String toString() {
        return m3395toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m3396unboximpl() {
        return this.shape;
    }
}
