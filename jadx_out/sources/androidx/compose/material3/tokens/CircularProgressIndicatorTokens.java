package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0019\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;", "", "()V", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorWidth", "Landroidx/compose/ui/unit/Dp;", "getActiveIndicatorWidth-D9Ej5fM", "()F", "F", "ActiveShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "FourColorActiveIndicatorFourColor", "getFourColorActiveIndicatorFourColor", "FourColorActiveIndicatorOneColor", "getFourColorActiveIndicatorOneColor", "FourColorActiveIndicatorThreeColor", "getFourColorActiveIndicatorThreeColor", "FourColorActiveIndicatorTwoColor", "getFourColorActiveIndicatorTwoColor", "Size", "getSize-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCircularProgressIndicatorTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/CircularProgressIndicatorTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,33:1\n164#2:34\n164#2:35\n*S KotlinDebug\n*F\n+ 1 CircularProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/CircularProgressIndicatorTokens\n*L\n26#1:34\n31#1:35\n*E\n"})
/* loaded from: classes.dex */
public final class CircularProgressIndicatorTokens {
    public static final int $stable = 0;

    @l
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorWidth;

    @l
    private static final ShapeKeyTokens ActiveShape;

    @l
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;

    @l
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;

    @l
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;

    @l
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;

    @l
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ActiveShape = ShapeKeyTokens.CornerNone;
        ActiveIndicatorWidth = Dp.m6044constructorimpl((float) 4.0d);
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        Size = Dp.m6044constructorimpl((float) 48.0d);
    }

    private CircularProgressIndicatorTokens() {
    }

    @l
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m2662getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    @l
    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    @l
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorFourColor() {
        return FourColorActiveIndicatorFourColor;
    }

    @l
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorOneColor() {
        return FourColorActiveIndicatorOneColor;
    }

    @l
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorThreeColor() {
        return FourColorActiveIndicatorThreeColor;
    }

    @l
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorTwoColor() {
        return FourColorActiveIndicatorTwoColor;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2663getSizeD9Ej5fM() {
        return Size;
    }
}
