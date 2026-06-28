package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0013\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "isCurve", "", "isQuad", "(ZZ)V", "()Z", "ArcTo", HTTP.CONN_CLOSE, "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "arcStartX", "arcStartY", "(FFFZZFF)V", "getArcStartX", "()F", "getArcStartY", "getHorizontalEllipseRadius", "()Z", "getTheta", "getVerticalEllipseRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartX = r9
                r3.arcStartY = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.ArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f5, float f6, float f7, boolean z4, boolean z5, float f8, float f9, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = arcTo.horizontalEllipseRadius;
            }
            if ((i5 & 2) != 0) {
                f6 = arcTo.verticalEllipseRadius;
            }
            float f10 = f6;
            if ((i5 & 4) != 0) {
                f7 = arcTo.theta;
            }
            float f11 = f7;
            if ((i5 & 8) != 0) {
                z4 = arcTo.isMoreThanHalf;
            }
            boolean z6 = z4;
            if ((i5 & 16) != 0) {
                z5 = arcTo.isPositiveArc;
            }
            boolean z7 = z5;
            if ((i5 & 32) != 0) {
                f8 = arcTo.arcStartX;
            }
            float f12 = f8;
            if ((i5 & 64) != 0) {
                f9 = arcTo.arcStartY;
            }
            return arcTo.copy(f5, f10, f11, z6, z7, f12, f9);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        @l
        public final ArcTo copy(float f5, float f6, float f7, boolean z4, boolean z5, float f8, float f9) {
            return new ArcTo(f5, f6, f7, z4, z5, f8, f9);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @l
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Close extends PathNode {

        @l
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Close() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.Close.<init>():void");
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "x3", "y3", "(FFFFFF)V", "getX1", "()F", "getX2", "getX3", "getY1", "getY2", "getY3", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f290x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f291x2;

        /* renamed from: x3, reason: collision with root package name */
        private final float f292x3;

        /* renamed from: y1, reason: collision with root package name */
        private final float f293y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f294y2;

        /* renamed from: y3, reason: collision with root package name */
        private final float f295y3;

        public CurveTo(float f5, float f6, float f7, float f8, float f9, float f10) {
            super(true, false, 2, null);
            this.f290x1 = f5;
            this.f293y1 = f6;
            this.f291x2 = f7;
            this.f294y2 = f8;
            this.f292x3 = f9;
            this.f295y3 = f10;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f5, float f6, float f7, float f8, float f9, float f10, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = curveTo.f290x1;
            }
            if ((i5 & 2) != 0) {
                f6 = curveTo.f293y1;
            }
            float f11 = f6;
            if ((i5 & 4) != 0) {
                f7 = curveTo.f291x2;
            }
            float f12 = f7;
            if ((i5 & 8) != 0) {
                f8 = curveTo.f294y2;
            }
            float f13 = f8;
            if ((i5 & 16) != 0) {
                f9 = curveTo.f292x3;
            }
            float f14 = f9;
            if ((i5 & 32) != 0) {
                f10 = curveTo.f295y3;
            }
            return curveTo.copy(f5, f11, f12, f13, f14, f10);
        }

        public final float component1() {
            return this.f290x1;
        }

        public final float component2() {
            return this.f293y1;
        }

        public final float component3() {
            return this.f291x2;
        }

        public final float component4() {
            return this.f294y2;
        }

        public final float component5() {
            return this.f292x3;
        }

        public final float component6() {
            return this.f295y3;
        }

        @l
        public final CurveTo copy(float f5, float f6, float f7, float f8, float f9, float f10) {
            return new CurveTo(f5, f6, f7, f8, f9, f10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f290x1, curveTo.f290x1) == 0 && Float.compare(this.f293y1, curveTo.f293y1) == 0 && Float.compare(this.f291x2, curveTo.f291x2) == 0 && Float.compare(this.f294y2, curveTo.f294y2) == 0 && Float.compare(this.f292x3, curveTo.f292x3) == 0 && Float.compare(this.f295y3, curveTo.f295y3) == 0;
        }

        public final float getX1() {
            return this.f290x1;
        }

        public final float getX2() {
            return this.f291x2;
        }

        public final float getX3() {
            return this.f292x3;
        }

        public final float getY1() {
            return this.f293y1;
        }

        public final float getY2() {
            return this.f294y2;
        }

        public final float getY3() {
            return this.f295y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f290x1) * 31) + Float.hashCode(this.f293y1)) * 31) + Float.hashCode(this.f291x2)) * 31) + Float.hashCode(this.f294y2)) * 31) + Float.hashCode(this.f292x3)) * 31) + Float.hashCode(this.f295y3);
        }

        @l
        public String toString() {
            return "CurveTo(x1=" + this.f290x1 + ", y1=" + this.f293y1 + ", x2=" + this.f291x2 + ", y2=" + this.f294y2 + ", x3=" + this.f292x3 + ", y3=" + this.f295y3 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "(F)V", "getX", "()F", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f296x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f296x = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.HorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = horizontalTo.f296x;
            }
            return horizontalTo.copy(f5);
        }

        public final float component1() {
            return this.f296x;
        }

        @l
        public final HorizontalTo copy(float f5) {
            return new HorizontalTo(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f296x, ((HorizontalTo) obj).f296x) == 0;
        }

        public final float getX() {
            return this.f296x;
        }

        public int hashCode() {
            return Float.hashCode(this.f296x);
        }

        @l
        public String toString() {
            return "HorizontalTo(x=" + this.f296x + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f297x;

        /* renamed from: y, reason: collision with root package name */
        private final float f298y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f297x = r4
                r3.f298y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.LineTo.<init>(float, float):void");
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = lineTo.f297x;
            }
            if ((i5 & 2) != 0) {
                f6 = lineTo.f298y;
            }
            return lineTo.copy(f5, f6);
        }

        public final float component1() {
            return this.f297x;
        }

        public final float component2() {
            return this.f298y;
        }

        @l
        public final LineTo copy(float f5, float f6) {
            return new LineTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f297x, lineTo.f297x) == 0 && Float.compare(this.f298y, lineTo.f298y) == 0;
        }

        public final float getX() {
            return this.f297x;
        }

        public final float getY() {
            return this.f298y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f297x) * 31) + Float.hashCode(this.f298y);
        }

        @l
        public String toString() {
            return "LineTo(x=" + this.f297x + ", y=" + this.f298y + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f299x;

        /* renamed from: y, reason: collision with root package name */
        private final float f300y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f299x = r4
                r3.f300y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.MoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = moveTo.f299x;
            }
            if ((i5 & 2) != 0) {
                f6 = moveTo.f300y;
            }
            return moveTo.copy(f5, f6);
        }

        public final float component1() {
            return this.f299x;
        }

        public final float component2() {
            return this.f300y;
        }

        @l
        public final MoveTo copy(float f5, float f6) {
            return new MoveTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f299x, moveTo.f299x) == 0 && Float.compare(this.f300y, moveTo.f300y) == 0;
        }

        public final float getX() {
            return this.f299x;
        }

        public final float getY() {
            return this.f300y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f299x) * 31) + Float.hashCode(this.f300y);
        }

        @l
        public String toString() {
            return "MoveTo(x=" + this.f299x + ", y=" + this.f300y + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "(FFFF)V", "getX1", "()F", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f301x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f302x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f303y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f304y2;

        public QuadTo(float f5, float f6, float f7, float f8) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f301x1 = f5;
            this.f303y1 = f6;
            this.f302x2 = f7;
            this.f304y2 = f8;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f5, float f6, float f7, float f8, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = quadTo.f301x1;
            }
            if ((i5 & 2) != 0) {
                f6 = quadTo.f303y1;
            }
            if ((i5 & 4) != 0) {
                f7 = quadTo.f302x2;
            }
            if ((i5 & 8) != 0) {
                f8 = quadTo.f304y2;
            }
            return quadTo.copy(f5, f6, f7, f8);
        }

        public final float component1() {
            return this.f301x1;
        }

        public final float component2() {
            return this.f303y1;
        }

        public final float component3() {
            return this.f302x2;
        }

        public final float component4() {
            return this.f304y2;
        }

        @l
        public final QuadTo copy(float f5, float f6, float f7, float f8) {
            return new QuadTo(f5, f6, f7, f8);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f301x1, quadTo.f301x1) == 0 && Float.compare(this.f303y1, quadTo.f303y1) == 0 && Float.compare(this.f302x2, quadTo.f302x2) == 0 && Float.compare(this.f304y2, quadTo.f304y2) == 0;
        }

        public final float getX1() {
            return this.f301x1;
        }

        public final float getX2() {
            return this.f302x2;
        }

        public final float getY1() {
            return this.f303y1;
        }

        public final float getY2() {
            return this.f304y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f301x1) * 31) + Float.hashCode(this.f303y1)) * 31) + Float.hashCode(this.f302x2)) * 31) + Float.hashCode(this.f304y2);
        }

        @l
        public String toString() {
            return "QuadTo(x1=" + this.f301x1 + ", y1=" + this.f303y1 + ", x2=" + this.f302x2 + ", y2=" + this.f304y2 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "(FFFF)V", "getX1", "()F", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f305x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f306x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f307y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f308y2;

        public ReflectiveCurveTo(float f5, float f6, float f7, float f8) {
            super(true, false, 2, null);
            this.f305x1 = f5;
            this.f307y1 = f6;
            this.f306x2 = f7;
            this.f308y2 = f8;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f5, float f6, float f7, float f8, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = reflectiveCurveTo.f305x1;
            }
            if ((i5 & 2) != 0) {
                f6 = reflectiveCurveTo.f307y1;
            }
            if ((i5 & 4) != 0) {
                f7 = reflectiveCurveTo.f306x2;
            }
            if ((i5 & 8) != 0) {
                f8 = reflectiveCurveTo.f308y2;
            }
            return reflectiveCurveTo.copy(f5, f6, f7, f8);
        }

        public final float component1() {
            return this.f305x1;
        }

        public final float component2() {
            return this.f307y1;
        }

        public final float component3() {
            return this.f306x2;
        }

        public final float component4() {
            return this.f308y2;
        }

        @l
        public final ReflectiveCurveTo copy(float f5, float f6, float f7, float f8) {
            return new ReflectiveCurveTo(f5, f6, f7, f8);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f305x1, reflectiveCurveTo.f305x1) == 0 && Float.compare(this.f307y1, reflectiveCurveTo.f307y1) == 0 && Float.compare(this.f306x2, reflectiveCurveTo.f306x2) == 0 && Float.compare(this.f308y2, reflectiveCurveTo.f308y2) == 0;
        }

        public final float getX1() {
            return this.f305x1;
        }

        public final float getX2() {
            return this.f306x2;
        }

        public final float getY1() {
            return this.f307y1;
        }

        public final float getY2() {
            return this.f308y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f305x1) * 31) + Float.hashCode(this.f307y1)) * 31) + Float.hashCode(this.f306x2)) * 31) + Float.hashCode(this.f308y2);
        }

        @l
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f305x1 + ", y1=" + this.f307y1 + ", x2=" + this.f306x2 + ", y2=" + this.f308y2 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f309x;

        /* renamed from: y, reason: collision with root package name */
        private final float f310y;

        public ReflectiveQuadTo(float f5, float f6) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f309x = f5;
            this.f310y = f6;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = reflectiveQuadTo.f309x;
            }
            if ((i5 & 2) != 0) {
                f6 = reflectiveQuadTo.f310y;
            }
            return reflectiveQuadTo.copy(f5, f6);
        }

        public final float component1() {
            return this.f309x;
        }

        public final float component2() {
            return this.f310y;
        }

        @l
        public final ReflectiveQuadTo copy(float f5, float f6) {
            return new ReflectiveQuadTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f309x, reflectiveQuadTo.f309x) == 0 && Float.compare(this.f310y, reflectiveQuadTo.f310y) == 0;
        }

        public final float getX() {
            return this.f309x;
        }

        public final float getY() {
            return this.f310y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f309x) * 31) + Float.hashCode(this.f310y);
        }

        @l
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f309x + ", y=" + this.f310y + ')';
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "arcStartDx", "arcStartDy", "(FFFZZFF)V", "getArcStartDx", "()F", "getArcStartDy", "getHorizontalEllipseRadius", "()Z", "getTheta", "getVerticalEllipseRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartDx = r9
                r3.arcStartDy = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f5, float f6, float f7, boolean z4, boolean z5, float f8, float f9, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeArcTo.verticalEllipseRadius;
            }
            float f10 = f6;
            if ((i5 & 4) != 0) {
                f7 = relativeArcTo.theta;
            }
            float f11 = f7;
            if ((i5 & 8) != 0) {
                z4 = relativeArcTo.isMoreThanHalf;
            }
            boolean z6 = z4;
            if ((i5 & 16) != 0) {
                z5 = relativeArcTo.isPositiveArc;
            }
            boolean z7 = z5;
            if ((i5 & 32) != 0) {
                f8 = relativeArcTo.arcStartDx;
            }
            float f12 = f8;
            if ((i5 & 64) != 0) {
                f9 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f5, f10, f11, z6, z7, f12, f9);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        @l
        public final RelativeArcTo copy(float f5, float f6, float f7, boolean z4, boolean z5, float f8, float f9) {
            return new RelativeArcTo(f5, f6, f7, z4, z5, f8, f9);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @l
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "dx3", "dy3", "(FFFFFF)V", "getDx1", "()F", "getDx2", "getDx3", "getDy1", "getDy2", "getDy3", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f5, float f6, float f7, float f8, float f9, float f10) {
            super(true, false, 2, null);
            this.dx1 = f5;
            this.dy1 = f6;
            this.dx2 = f7;
            this.dy2 = f8;
            this.dx3 = f9;
            this.dy3 = f10;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f5, float f6, float f7, float f8, float f9, float f10, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeCurveTo.dx1;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeCurveTo.dy1;
            }
            float f11 = f6;
            if ((i5 & 4) != 0) {
                f7 = relativeCurveTo.dx2;
            }
            float f12 = f7;
            if ((i5 & 8) != 0) {
                f8 = relativeCurveTo.dy2;
            }
            float f13 = f8;
            if ((i5 & 16) != 0) {
                f9 = relativeCurveTo.dx3;
            }
            float f14 = f9;
            if ((i5 & 32) != 0) {
                f10 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f5, f11, f12, f13, f14, f10);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        @l
        public final RelativeCurveTo copy(float f5, float f6, float f7, float f8, float f9, float f10) {
            return new RelativeCurveTo(f5, f6, f7, f8, f9, f10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        @l
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "(F)V", "getDx", "()F", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeHorizontalTo extends PathNode {
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeHorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f5);
        }

        public final float component1() {
            return this.dx;
        }

        @l
        public final RelativeHorizontalTo copy(float f5) {
            return new RelativeHorizontalTo(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) obj).dx) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return Float.hashCode(this.dx);
        }

        @l
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeLineTo extends PathNode {
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeLineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeLineTo.dx;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f5, f6);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        @l
        public final RelativeLineTo copy(float f5, float f6) {
            return new RelativeLineTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        @l
        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeMoveTo extends PathNode {
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeMoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeMoveTo.dx;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f5, f6);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        @l
        public final RelativeMoveTo copy(float f5, float f6) {
            return new RelativeMoveTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        @l
        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "(FFFF)V", "getDx1", "()F", "getDx2", "getDy1", "getDy2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f5, float f6, float f7, float f8) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f5;
            this.dy1 = f6;
            this.dx2 = f7;
            this.dy2 = f8;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f5, float f6, float f7, float f8, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeQuadTo.dx1;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeQuadTo.dy1;
            }
            if ((i5 & 4) != 0) {
                f7 = relativeQuadTo.dx2;
            }
            if ((i5 & 8) != 0) {
                f8 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f5, f6, f7, f8);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @l
        public final RelativeQuadTo copy(float f5, float f6, float f7, float f8) {
            return new RelativeQuadTo(f5, f6, f7, f8);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @l
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "(FFFF)V", "getDx1", "()F", "getDx2", "getDy1", "getDy2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f5, float f6, float f7, float f8) {
            super(true, false, 2, null);
            this.dx1 = f5;
            this.dy1 = f6;
            this.dx2 = f7;
            this.dy2 = f8;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f5, float f6, float f7, float f8, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeReflectiveCurveTo.dx1;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeReflectiveCurveTo.dy1;
            }
            if ((i5 & 4) != 0) {
                f7 = relativeReflectiveCurveTo.dx2;
            }
            if ((i5 & 8) != 0) {
                f8 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f5, f6, f7, f8);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @l
        public final RelativeReflectiveCurveTo copy(float f5, float f6, float f7, float f8) {
            return new RelativeReflectiveCurveTo(f5, f6, f7, f8);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @l
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {
        private final float dx;
        private final float dy;

        public RelativeReflectiveQuadTo(float f5, float f6) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f5;
            this.dy = f6;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f5, float f6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeReflectiveQuadTo.dx;
            }
            if ((i5 & 2) != 0) {
                f6 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f5, f6);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        @l
        public final RelativeReflectiveQuadTo copy(float f5, float f6) {
            return new RelativeReflectiveQuadTo(f5, f6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        @l
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dy", "", "(F)V", "getDy", "()F", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeVerticalTo extends PathNode {
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeVerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dy = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f5);
        }

        public final float component1() {
            return this.dy;
        }

        @l
        public final RelativeVerticalTo copy(float f5) {
            return new RelativeVerticalTo(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) obj).dy) == 0;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.hashCode(this.dy);
        }

        @l
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "y", "", "(F)V", "getY", "()F", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: y, reason: collision with root package name */
        private final float f311y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public VerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f311y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.VerticalTo.<init>(float):void");
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = verticalTo.f311y;
            }
            return verticalTo.copy(f5);
        }

        public final float component1() {
            return this.f311y;
        }

        @l
        public final VerticalTo copy(float f5) {
            return new VerticalTo(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f311y, ((VerticalTo) obj).f311y) == 0;
        }

        public final float getY() {
            return this.f311y;
        }

        public int hashCode() {
            return Float.hashCode(this.f311y);
        }

        @l
        public String toString() {
            return "VerticalTo(y=" + this.f311y + ')';
        }
    }

    private PathNode(boolean z4, boolean z5) {
        this.isCurve = z4;
        this.isQuad = z5;
    }

    public /* synthetic */ PathNode(boolean z4, boolean z5, w wVar) {
        this(z4, z5);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    public /* synthetic */ PathNode(boolean z4, boolean z5, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? false : z5, null);
    }
}
