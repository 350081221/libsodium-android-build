package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "fromSp", "", "toDp", "([F[F)V", "mFromSpValues", "getMFromSpValues$annotations", "()V", "getMFromSpValues", "()[F", "mToDpValues", "getMToDpValues$annotations", "getMToDpValues", "convertDpToSp", "", "dp", "convertSpToDp", "sp", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {

    @l
    private final float[] mFromSpValues;

    @l
    private final float[] mToDpValues;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "()V", "lookupAndInterpolate", "", "sourceValue", "sourceValues", "", "targetValues", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f5, float[] fArr, float[] fArr2) {
            float f6;
            float f7;
            float f8;
            float f9;
            float constrainedMap;
            float abs = Math.abs(f5);
            float signum = Math.signum(f5);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                constrainedMap = fArr2[binarySearch];
            } else {
                boolean z4 = true;
                int i5 = (-(binarySearch + 1)) - 1;
                if (i5 >= fArr.length - 1) {
                    float f10 = fArr[fArr.length - 1];
                    float f11 = fArr2[fArr.length - 1];
                    if (f10 != 0.0f) {
                        z4 = false;
                    }
                    if (z4) {
                        return 0.0f;
                    }
                    return f5 * (f11 / f10);
                }
                if (i5 == -1) {
                    float f12 = fArr[0];
                    f8 = fArr2[0];
                    f9 = 0.0f;
                    f6 = 0.0f;
                    f7 = f12;
                } else {
                    float f13 = fArr[i5];
                    int i6 = i5 + 1;
                    float f14 = fArr[i6];
                    float f15 = fArr2[i5];
                    f6 = f13;
                    f7 = f14;
                    f8 = fArr2[i6];
                    f9 = f15;
                }
                constrainedMap = MathUtils.INSTANCE.constrainedMap(f9, f8, f6, f7, abs);
            }
            return signum * constrainedMap;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FontScaleConverterTable(@l float[] fArr, @l float[] fArr2) {
        boolean z4;
        boolean z5 = false;
        if (fArr.length == fArr2.length) {
            if (fArr.length == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = true;
            }
        }
        if (z5) {
            this.mFromSpValues = fArr;
            this.mToDpValues = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
    }

    @VisibleForTesting
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f5) {
        return Companion.lookupAndInterpolate(f5, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f5) {
        return Companion.lookupAndInterpolate(f5, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        if (Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues)) {
            return true;
        }
        return false;
    }

    @l
    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    @l
    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        l0.o(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        l0.o(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
