package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/tokens/DividerTokens;", "", "()V", "Color", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Thickness", "Landroidx/compose/ui/unit/Dp;", "getThickness-D9Ej5fM", "()F", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDividerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DividerTokens.kt\nandroidx/compose/material3/tokens/DividerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,27:1\n164#2:28\n*S KotlinDebug\n*F\n+ 1 DividerTokens.kt\nandroidx/compose/material3/tokens/DividerTokens\n*L\n25#1:28\n*E\n"})
/* loaded from: classes.dex */
public final class DividerTokens {
    public static final int $stable = 0;

    @l
    public static final DividerTokens INSTANCE = new DividerTokens();

    @l
    private static final ColorSchemeKeyTokens Color = ColorSchemeKeyTokens.OutlineVariant;
    private static final float Thickness = Dp.m6044constructorimpl((float) 1.0d);

    private DividerTokens() {
    }

    @l
    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m2784getThicknessD9Ej5fM() {
        return Thickness;
    }
}
