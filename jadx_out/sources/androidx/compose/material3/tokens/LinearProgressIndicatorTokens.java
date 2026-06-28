package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001b\u0010\nR\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/tokens/LinearProgressIndicatorTokens;", "", "()V", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorHeight", "Landroidx/compose/ui/unit/Dp;", "getActiveIndicatorHeight-D9Ej5fM", "()F", "F", "ActiveShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "FourColorActiveIndicatorFourColor", "getFourColorActiveIndicatorFourColor", "FourColorActiveIndicatorOneColor", "getFourColorActiveIndicatorOneColor", "FourColorActiveIndicatorThreeColor", "getFourColorActiveIndicatorThreeColor", "FourColorActiveIndicatorTwoColor", "getFourColorActiveIndicatorTwoColor", "TrackColor", "getTrackColor", "TrackHeight", "getTrackHeight-D9Ej5fM", "TrackShape", "getTrackShape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLinearProgressIndicatorTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/LinearProgressIndicatorTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n164#2:36\n164#2:37\n*S KotlinDebug\n*F\n+ 1 LinearProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/LinearProgressIndicatorTokens\n*L\n25#1:36\n32#1:37\n*E\n"})
/* loaded from: classes.dex */
public final class LinearProgressIndicatorTokens {
    public static final int $stable = 0;

    @l
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;

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
    public static final LinearProgressIndicatorTokens INSTANCE = new LinearProgressIndicatorTokens();

    @l
    private static final ColorSchemeKeyTokens TrackColor;
    private static final float TrackHeight;

    @l
    private static final ShapeKeyTokens TrackShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f5 = (float) 4.0d;
        ActiveIndicatorHeight = Dp.m6044constructorimpl(f5);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ActiveShape = shapeKeyTokens;
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        TrackColor = ColorSchemeKeyTokens.SurfaceVariant;
        TrackHeight = Dp.m6044constructorimpl(f5);
        TrackShape = shapeKeyTokens;
    }

    private LinearProgressIndicatorTokens() {
    }

    @l
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2928getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
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

    @l
    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    /* renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2929getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    @l
    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }
}
