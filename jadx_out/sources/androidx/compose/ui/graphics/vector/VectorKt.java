package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u001e\u0010\u0010\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000e\u0010\u0012\u001a\u00020\r*\u0004\u0018\u00010\u0011H\u0000\"\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017\"\u0014\u0010\u001d\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0014\"\u0014\u0010#\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0017\"\u0014\u0010$\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0017\"\u0014\u0010%\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0017\"\u0014\u0010&\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0017\"\u0014\u0010'\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0017\"\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,\"\u0017\u00103\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "", "pathStr", "addPathNodes", "Landroidx/compose/ui/graphics/Color;", "other", "", "rgbEqual--OWjLjI", "(JJ)Z", "rgbEqual", "Landroidx/compose/ui/graphics/ColorFilter;", "tintableWithAlphaMask", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "EmptyPath", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultStrokeLineCap", "I", "getDefaultStrokeLineCap", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultStrokeLineJoin", "getDefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "DefaultTintBlendMode", "getDefaultTintBlendMode", "DefaultTintColor", "J", "getDefaultTintColor", "()J", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "getDefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorKt {
    private static final int DefaultFillType;

    @l
    public static final String DefaultGroupName = "";

    @l
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    private static final int DefaultStrokeLineCap;
    private static final int DefaultStrokeLineJoin;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    private static final int DefaultTintBlendMode;
    private static final long DefaultTintColor;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    @l
    private static final List<PathNode> EmptyPath;

    static {
        List<PathNode> E;
        E = w.E();
        EmptyPath = E;
        DefaultStrokeLineCap = StrokeCap.Companion.m4085getButtKaPHkGw();
        DefaultStrokeLineJoin = StrokeJoin.Companion.m4096getMiterLxFBmk8();
        DefaultTintBlendMode = BlendMode.Companion.m3674getSrcIn0nO6VwU();
        DefaultTintColor = Color.Companion.m3769getTransparent0d7_KjU();
        DefaultFillType = PathFillType.Companion.m4016getNonZeroRgk1Os();
    }

    @l
    public static final List<PathNode> PathData(@l v3.l<? super PathBuilder, r2> lVar) {
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @l
    public static final List<PathNode> addPathNodes(@m String str) {
        if (str == null) {
            return EmptyPath;
        }
        return new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    @l
    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m4378rgbEqualOWjLjI(long j5, long j6) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (Color.m3740getRedimpl(j5) == Color.m3740getRedimpl(j6)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (Color.m3739getGreenimpl(j5) == Color.m3739getGreenimpl(j6)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (Color.m3737getBlueimpl(j5) == Color.m3737getBlueimpl(j6)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean tintableWithAlphaMask(@m ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
            int m3678getBlendMode0nO6VwU = blendModeColorFilter.m3678getBlendMode0nO6VwU();
            BlendMode.Companion companion = BlendMode.Companion;
            if (BlendMode.m3645equalsimpl0(m3678getBlendMode0nO6VwU, companion.m3674getSrcIn0nO6VwU()) || BlendMode.m3645equalsimpl0(blendModeColorFilter.m3678getBlendMode0nO6VwU(), companion.m3676getSrcOver0nO6VwU())) {
                return true;
            }
        } else if (colorFilter == null) {
            return true;
        }
        return false;
    }
}
