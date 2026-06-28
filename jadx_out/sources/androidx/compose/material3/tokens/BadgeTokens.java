package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u001a\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "()V", "Color", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "LargeColor", "getLargeColor", "LargeLabelTextColor", "getLargeLabelTextColor", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLargeLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getLargeShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeSize", "Landroidx/compose/ui/unit/Dp;", "getLargeSize-D9Ej5fM", "()F", "F", "Shape", "getShape", "Size", "getSize-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBadgeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,33:1\n164#2:34\n164#2:35\n*S KotlinDebug\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n*L\n29#1:34\n31#1:35\n*E\n"})
/* loaded from: classes.dex */
public final class BadgeTokens {
    public static final int $stable = 0;

    @l
    private static final ColorSchemeKeyTokens Color;

    @l
    public static final BadgeTokens INSTANCE = new BadgeTokens();

    @l
    private static final ColorSchemeKeyTokens LargeColor;

    @l
    private static final ColorSchemeKeyTokens LargeLabelTextColor;

    @l
    private static final TypographyKeyTokens LargeLabelTextFont;

    @l
    private static final ShapeKeyTokens LargeShape;
    private static final float LargeSize;

    @l
    private static final ShapeKeyTokens Shape;
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
        LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        LargeSize = Dp.m6044constructorimpl((float) 16.0d);
        Shape = shapeKeyTokens;
        Size = Dp.m6044constructorimpl((float) 6.0d);
    }

    private BadgeTokens() {
    }

    @l
    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    @l
    public final ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    @l
    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    @l
    public final TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    @l
    public final ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* renamed from: getLargeSize-D9Ej5fM, reason: not valid java name */
    public final float m2638getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    @l
    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2639getSizeD9Ej5fM() {
        return Size;
    }
}
