package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0019*\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/unit/DensityWithConverter;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "converter", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "(FFLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "getDensity", "()F", "getFontScale", "component1", "component2", "component3", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class DensityWithConverter implements Density {

    @l
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public DensityWithConverter(float f5, float f6, @l FontScaleConverter fontScaleConverter) {
        this.density = f5;
        this.fontScale = f6;
        this.converter = fontScaleConverter;
    }

    private final FontScaleConverter component3() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f5, float f6, FontScaleConverter fontScaleConverter, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = densityWithConverter.density;
        }
        if ((i5 & 2) != 0) {
            f6 = densityWithConverter.fontScale;
        }
        if ((i5 & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f5, f6, fontScaleConverter);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @l
    public final DensityWithConverter copy(float f5, float f6, @l FontScaleConverter fontScaleConverter) {
        return new DensityWithConverter(f5, f6, fontScaleConverter);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && l0.g(this.converter, densityWithConverter.converter);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo299toDpGaN1DYA(long j5) {
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnitType.Companion.m6268getSpUIouoOA())) {
            return Dp.m6044constructorimpl(this.converter.convertSpToDp(TextUnit.m6235getValueimpl(j5)));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo306toSp0xMU5do(float f5) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f5));
    }

    @l
    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
