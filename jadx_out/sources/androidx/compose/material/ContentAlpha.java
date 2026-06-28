package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "()V", "disabled", "", "getDisabled", "(Landroidx/compose/runtime/Composer;I)F", "high", "getHigh", "medium", "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,133:1\n74#2:134\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n78#1:134\n*E\n"})
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;

    @l
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, Composer composer, int i5) {
        composer.startReplaceableGroup(-1528360391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i5, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long m3744unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m3786luminance8_81llA(m3744unboximpl) >= 0.5d : ColorKt.m3786luminance8_81llA(m3744unboximpl) <= 0.5d) {
            f5 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f5;
    }

    @h(name = "getDisabled")
    @Composable
    public final float getDisabled(@m Composer composer, int i5) {
        composer.startReplaceableGroup(621183615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i5, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i5 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @h(name = "getHigh")
    @Composable
    public final float getHigh(@m Composer composer, int i5) {
        composer.startReplaceableGroup(629162431);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i5, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i5 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @h(name = "getMedium")
    @Composable
    public final float getMedium(@m Composer composer, int i5) {
        composer.startReplaceableGroup(1999054879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i5, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i5 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }
}
