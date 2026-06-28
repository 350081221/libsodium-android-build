package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.i0;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "offsetX", "", "offsetY", "transform", "", "fraction", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class PathEasing implements Easing {
    public static final int $stable = 0;

    @l
    private final float[] offsetX;

    @l
    private final float[] offsetY;

    public PathEasing(@l Path path) {
        boolean z4;
        PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure.setPath(path, false);
        float length = PathMeasure.getLength();
        if (length > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i5 = ((int) (length / 0.002f)) + 1;
            float[] fArr = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                fArr[i6] = 0.0f;
            }
            this.offsetX = fArr;
            float[] fArr2 = new float[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                fArr2[i7] = 0.0f;
            }
            this.offsetY = fArr2;
            for (int i8 = 0; i8 < i5; i8++) {
                long mo3632getPositiontuRUvjQ = PathMeasure.mo3632getPositiontuRUvjQ((i8 * length) / (i5 - 1));
                this.offsetX[i8] = Offset.m3493getXimpl(mo3632getPositiontuRUvjQ);
                this.offsetY[i8] = Offset.m3494getYimpl(mo3632getPositiontuRUvjQ);
                if (i8 > 0) {
                    float[] fArr3 = this.offsetX;
                    if (fArr3[i8] < fArr3[i8 - 1]) {
                        throw new IllegalArgumentException("Path needs to be continuously increasing");
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Path cannot be zero in length. Ensure that supplied Path starts at [0,0] and ends at [1,1]".toString());
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f5) {
        int I;
        float uh;
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        I = o.I(this.offsetX, f5, 0, 0, 6, null);
        if (I > 0) {
            return this.offsetY[I];
        }
        int abs = Math.abs(I);
        float[] fArr = this.offsetX;
        if (abs >= fArr.length - 1) {
            uh = p.uh(this.offsetY);
            return uh;
        }
        int i5 = abs + 1;
        float f6 = fArr[i5];
        float f7 = fArr[abs];
        float f8 = (f5 - f7) / (f6 - f7);
        float[] fArr2 = this.offsetY;
        float f9 = fArr2[abs];
        return f9 + (f8 * (fArr2[i5] - f9));
    }
}
