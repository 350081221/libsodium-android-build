package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0018\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001b\u0010\nR\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001f\u0010\nR\u0019\u0010 \u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b!\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/tokens/FilledCardTokens;", "", "()V", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerElevation", "Landroidx/compose/ui/unit/Dp;", "getContainerElevation-D9Ej5fM", "()F", "F", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledContainerColor", "getDisabledContainerColor", "DisabledContainerElevation", "getDisabledContainerElevation-D9Ej5fM", "DisabledContainerOpacity", "", "DraggedContainerElevation", "getDraggedContainerElevation-D9Ej5fM", "FocusContainerElevation", "getFocusContainerElevation-D9Ej5fM", "HoverContainerElevation", "getHoverContainerElevation-D9Ej5fM", "IconColor", "getIconColor", "IconSize", "getIconSize-D9Ej5fM", "PressedContainerElevation", "getPressedContainerElevation-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFilledCardTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledCardTokens.kt\nandroidx/compose/material3/tokens/FilledCardTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,37:1\n164#2:38\n*S KotlinDebug\n*F\n+ 1 FilledCardTokens.kt\nandroidx/compose/material3/tokens/FilledCardTokens\n*L\n34#1:38\n*E\n"})
/* loaded from: classes.dex */
public final class FilledCardTokens {
    public static final int $stable = 0;

    @l
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;

    @l
    private static final ShapeKeyTokens ContainerShape;

    @l
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    public static final float DisabledContainerOpacity = 0.38f;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final float HoverContainerElevation;

    @l
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();

    @l
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float PressedContainerElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2799getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m2799getLevel0D9Ej5fM();
        DraggedContainerElevation = elevationTokens.m2802getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m2799getLevel0D9Ej5fM();
        HoverContainerElevation = elevationTokens.m2800getLevel1D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m6044constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m2799getLevel0D9Ej5fM();
    }

    private FilledCardTokens() {
    }

    @l
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2876getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @l
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @l
    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2877getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2878getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2879getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2880getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    @l
    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2881getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2882getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
