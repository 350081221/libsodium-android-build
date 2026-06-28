package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 <2\u00020\u0001:\u0001<B!\b\u0000\u0012\u0006\u0010'\u001a\u00020!\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u00100\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020!\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b9\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0012\u0010 \u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'J\b\u0010\"\u001a\u00020!H\u0016J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020\u0002H\u0016R\u0017\u0010'\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010,\u001a\u00020+8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b4\u00103R\u0014\u00106\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00107\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", "component", "", "getMinValue", "getMaxValue", "r", socket.g.f22386a, "b", "", "toXyz", "v", "v0", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", bi.aG, bi.ay, "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "toString", "other", "", "equals", TTDownloadField.TT_HASHCODE, "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "model", "J", "getModel-xdoWZVw", "()J", "id", "I", "getId$ui_graphics_release", "()I", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,799:1\n25#2,3:800\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:800,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class ColorSpace {

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @p4.l
    private final String name;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "()V", "MaxId", "", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    private ColorSpace(String str, long j5, int i5) {
        this.name = str;
        this.model = j5;
        this.id = i5;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i5 < -1 || i5 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ ColorSpace(String str, long j5, int i5, w wVar) {
        this(str, j5, i5);
    }

    public /* synthetic */ ColorSpace(String str, long j5, w wVar) {
        this(str, j5);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id != colorSpace.id || !l0.g(this.name, colorSpace.name)) {
            return false;
        }
        return ColorModel.m4139equalsimpl0(this.model, colorSpace.model);
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] fromXyz(float f5, float f6, float f7) {
        float[] fArr = new float[ColorModel.m4140getComponentCountimpl(this.model)];
        fArr[0] = f5;
        fArr[1] = f6;
        fArr[2] = f7;
        return fromXyz(fArr);
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public abstract float[] fromXyz(@p4.l @Size(min = 3) float[] fArr);

    @IntRange(from = 1, to = 4)
    public final int getComponentCount() {
        return ColorModel.m4140getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    public abstract float getMaxValue(@IntRange(from = 0, to = 3) int i5);

    public abstract float getMinValue(@IntRange(from = 0, to = 3) int i5);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m4148getModelxdoWZVw() {
        return this.model;
    }

    @p4.l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m4141hashCodeimpl(this.model)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @p4.l
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m4142toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float f5, float f6, float f7) {
        float[] xyz = toXyz(f5, f6, f7);
        float f8 = xyz[0];
        float f9 = xyz[1];
        return (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
    }

    @p4.l
    @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public final float[] toXyz(float f5, float f6, float f7) {
        return toXyz(new float[]{f5, f6, f7});
    }

    @p4.l
    @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    public abstract float[] toXyz(@p4.l @Size(min = 3) float[] fArr);

    public float toZ$ui_graphics_release(float f5, float f6, float f7) {
        return toXyz(f5, f6, f7)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo4149xyzaToColorJlNiLsg$ui_graphics_release(float f5, float f6, float f7, float f8, @p4.l ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(f5, f6, f7);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f8, colorSpace);
    }

    private ColorSpace(String str, long j5) {
        this(str, j5, -1, null);
    }
}
