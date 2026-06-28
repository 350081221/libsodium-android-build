package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import com.tendcloud.tenddata.cq;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "getSegment", ClientCookie.PATH_ATTR, "forceClosed", "Lkotlin/r2;", "setPath", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "Landroid/graphics/PathMeasure;", "", "positionArray", "[F", "tangentArray", "getLength", "()F", cq.a.LENGTH, "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {

    @p4.l
    private final android.graphics.PathMeasure internalPathMeasure;

    @p4.m
    private float[] positionArray;

    @p4.m
    private float[] tangentArray;

    public AndroidPathMeasure(@p4.l android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo3632getPositiontuRUvjQ(float f5) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (this.internalPathMeasure.getPosTan(f5, this.positionArray, this.tangentArray)) {
            float[] fArr = this.positionArray;
            kotlin.jvm.internal.l0.m(fArr);
            float f6 = fArr[0];
            float[] fArr2 = this.positionArray;
            kotlin.jvm.internal.l0.m(fArr2);
            return OffsetKt.Offset(f6, fArr2[1]);
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f5, float f6, @p4.l Path path, boolean z4) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f5, f6, ((AndroidPath) path).getInternalPath(), z4);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo3633getTangenttuRUvjQ(float f5) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (this.internalPathMeasure.getPosTan(f5, this.positionArray, this.tangentArray)) {
            float[] fArr = this.tangentArray;
            kotlin.jvm.internal.l0.m(fArr);
            float f6 = fArr[0];
            float[] fArr2 = this.tangentArray;
            kotlin.jvm.internal.l0.m(fArr2);
            return OffsetKt.Offset(f6, fArr2[1]);
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(@p4.m Path path, boolean z4) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path != null) {
            if (path instanceof AndroidPath) {
                path2 = ((AndroidPath) path).getInternalPath();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path2 = null;
        }
        pathMeasure.setPath(path2, z4);
    }
}
