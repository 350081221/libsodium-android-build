package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010$\u001a\u00020\u001d\u0012\b\b\u0002\u0010&\u001a\u00020\u001d\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010.\u001a\u00020\u001d\u0012\b\b\u0002\u00100\u001a\u00020\u001d\u0012\b\b\u0002\u00102\u001a\u00020\u001d\u0012\b\b\u0002\u00104\u001a\u00020\u001d¢\u0006\u0004\b6\u00107J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010$\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010&\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010)\u001a\u00020(8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017R\u001d\u0010,\u001a\u00020+8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u0017\u0010.\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u0017\u00100\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R\u0017\u00102\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010!R\u0017\u00104\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "I", "getPathFillType-Rg-k1Os", "()I", "Landroidx/compose/ui/graphics/Brush;", "fill", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "", "fillAlpha", "F", "getFillAlpha", "()F", "stroke", "getStroke", "strokeAlpha", "getStrokeAlpha", "strokeLineWidth", "getStrokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "getStrokeLineCap-KaPHkGw", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "getStrokeLineJoin-LxFBmk8", "strokeLineMiter", "getStrokeLineMiter", "trimPathStart", "getTrimPathStart", "trimPathEnd", "getTrimPathEnd", "trimPathOffset", "getTrimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;

    @m
    private final Brush fill;
    private final float fillAlpha;

    @l
    private final String name;

    @l
    private final List<PathNode> pathData;
    private final int pathFillType;

    @m
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i5, Brush brush, float f5, Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11, int i8, w wVar) {
        this((i8 & 1) != 0 ? "" : str, list, i5, (i8 & 8) != 0 ? null : brush, (i8 & 16) != 0 ? 1.0f : f5, (i8 & 32) != 0 ? null : brush2, (i8 & 64) != 0 ? 1.0f : f6, (i8 & 128) != 0 ? 0.0f : f7, (i8 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i6, (i8 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i7, (i8 & 1024) != 0 ? 4.0f : f8, (i8 & 2048) != 0 ? 0.0f : f9, (i8 & 4096) != 0 ? 1.0f : f10, (i8 & 8192) != 0 ? 0.0f : f11, null);
    }

    public /* synthetic */ VectorPath(String str, List list, int i5, Brush brush, float f5, Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11, w wVar) {
        this(str, list, i5, brush, f5, brush2, f6, f7, i6, i7, f8, f9, f10, f11);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || VectorPath.class != obj.getClass()) {
            return false;
        }
        VectorPath vectorPath = (VectorPath) obj;
        if (!l0.g(this.name, vectorPath.name) || !l0.g(this.fill, vectorPath.fill)) {
            return false;
        }
        if (this.fillAlpha == vectorPath.fillAlpha) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || !l0.g(this.stroke, vectorPath.stroke)) {
            return false;
        }
        if (this.strokeAlpha == vectorPath.strokeAlpha) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.strokeLineWidth == vectorPath.strokeLineWidth) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 || !StrokeCap.m4081equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) || !StrokeJoin.m4091equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin)) {
            return false;
        }
        if (this.strokeLineMiter == vectorPath.strokeLineMiter) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        if (this.trimPathStart == vectorPath.trimPathStart) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        if (this.trimPathEnd == vectorPath.trimPathEnd) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        if (this.trimPathOffset == vectorPath.trimPathOffset) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && PathFillType.m4011equalsimpl0(this.pathFillType, vectorPath.pathFillType) && l0.g(this.pathData, vectorPath.pathData)) {
            return true;
        }
        return false;
    }

    @m
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m4392getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    @m
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m4393getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m4394getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int i5;
        int hashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int i6 = 0;
        if (brush != null) {
            i5 = brush.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((hashCode + i5) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            i6 = brush2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i6) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.m4082hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m4092hashCodeimpl(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m4012hashCodeimpl(this.pathFillType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i5, Brush brush, float f5, Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i5;
        this.fill = brush;
        this.fillAlpha = f5;
        this.stroke = brush2;
        this.strokeAlpha = f6;
        this.strokeLineWidth = f7;
        this.strokeLineCap = i6;
        this.strokeLineJoin = i7;
        this.strokeLineMiter = f8;
        this.trimPathStart = f9;
        this.trimPathEnd = f10;
        this.trimPathOffset = f11;
    }
}
