package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import kotlin.i0;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0000\u001a\f\u0010V\u001a\u00020W*\u00020SH\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0010\"(\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\".\u0010\u0015\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\"\u0004\b\u0019\u0010\u001f\"\u0015\u0010 \u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010\"\u0015\u0010\"\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b#\u0010\u0010\"\u001e\u0010$\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0010\"\u001e\u0010'\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0010\"\u001e\u0010*\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u001e\u0010,\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u001e\u0010.\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0004\u001a\u0004\b.\u0010\u0006\"\u0015\u00100\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u0010\"\u0015\u00102\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b3\u0010\u0010\"\u001e\u00104\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0010\"\u0015\u00107\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u0010\"\u0015\u00109\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b:\u0010\u0010\"\u0015\u0010;\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b<\u0010\u0010\"\u0015\u0010=\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b>\u0010\u0010\"\u001e\u0010?\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0010\"\u0015\u0010B\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u0010\"\u001e\u0010D\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0010\"\u0015\u0010G\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bH\u0010\u0010\"\u0015\u0010I\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0010\"\u001e\u0010K\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0010\"\u0015\u0010N\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bO\u0010\u0010¨\u0006X"}, d2 = {"areNavigationBarsVisible", "", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "getAreNavigationBarsVisible$annotations", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;)V", "getAreNavigationBarsVisible", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Z", "areStatusBarsVisible", "getAreStatusBarsVisible$annotations", "getAreStatusBarsVisible", "areSystemBarsVisible", "getAreSystemBarsVisible$annotations", "getAreSystemBarsVisible", "captionBar", "Landroidx/compose/foundation/layout/WindowInsets;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "captionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility$annotations", "getCaptionBarIgnoringVisibility", t0.b.f22420d, "consumeWindowInsets", "Landroidx/compose/ui/platform/AbstractComposeView;", "getConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;)Z", "setConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;Z)V", "Landroidx/compose/ui/platform/ComposeView;", "getConsumeWindowInsets$annotations", "(Landroidx/compose/ui/platform/ComposeView;)V", "(Landroidx/compose/ui/platform/ComposeView;)Z", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource$annotations", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget$annotations", "getImeAnimationTarget", "isCaptionBarVisible", "isCaptionBarVisible$annotations", "isImeVisible", "isImeVisible$annotations", "isTappableElementVisible", "isTappableElementVisible$annotations", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility$annotations", "getNavigationBarsIgnoringVisibility", "safeContent", "getSafeContent", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility$annotations", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility$annotations", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility$annotations", "getTappableElementIgnoringVisibility", "waterfall", "getWaterfall", "ValueInsets", "Landroidx/compose/foundation/layout/ValueInsets;", "insets", "Landroidx/core/graphics/Insets;", "name", "", "toInsetsValues", "Landroidx/compose/foundation/layout/InsetsValues;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    @l
    public static final ValueInsets ValueInsets(@l Insets insets, @l String str) {
        return new ValueInsets(toInsetsValues(insets), str);
    }

    @u3.h(name = "getAreNavigationBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreNavigationBarsVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(710310464);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(710310464, i5, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getNavigationBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @u3.h(name = "getAreStatusBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreStatusBarsVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1613283456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613283456, i5, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getStatusBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreStatusBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @u3.h(name = "getAreSystemBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreSystemBarsVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1985490720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985490720, i5, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getSystemBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreSystemBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getCaptionBar")
    @Composable
    public static final WindowInsets getCaptionBar(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1832025528);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832025528, i5, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        AndroidWindowInsets captionBar = WindowInsetsHolder.Companion.current(composer, 8).getCaptionBar();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBar;
    }

    @u3.h(name = "getCaptionBarIgnoringVisibility")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getCaptionBarIgnoringVisibility(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1731251574);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731251574, i5, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        ValueInsets captionBarIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 8).getCaptionBarIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBarIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static final boolean getConsumeWindowInsets(@l AbstractComposeView abstractComposeView) {
        Object tag = abstractComposeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @k(level = kotlin.m.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void getConsumeWindowInsets$annotations(ComposeView composeView) {
    }

    @l
    @u3.h(name = "getDisplayCutout")
    @Composable
    public static final WindowInsets getDisplayCutout(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1324817724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1324817724, i5, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        AndroidWindowInsets displayCutout = WindowInsetsHolder.Companion.current(composer, 8).getDisplayCutout();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return displayCutout;
    }

    @l
    @u3.h(name = "getIme")
    @Composable
    public static final WindowInsets getIme(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1466917860);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466917860, i5, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        AndroidWindowInsets ime = WindowInsetsHolder.Companion.current(composer, 8).getIme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return ime;
    }

    @u3.h(name = "getImeAnimationSource")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getImeAnimationSource(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1126064918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126064918, i5, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        ValueInsets imeAnimationSource = WindowInsetsHolder.Companion.current(composer, 8).getImeAnimationSource();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationSource;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationSource$annotations(WindowInsets.Companion companion) {
    }

    @u3.h(name = "getImeAnimationTarget")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getImeAnimationTarget(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-466319786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466319786, i5, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        ValueInsets imeAnimationTarget = WindowInsetsHolder.Companion.current(composer, 8).getImeAnimationTarget();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationTarget;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationTarget$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getMandatorySystemGestures")
    @Composable
    public static final WindowInsets getMandatorySystemGestures(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1369492988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1369492988, i5, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        AndroidWindowInsets mandatorySystemGestures = WindowInsetsHolder.Companion.current(composer, 8).getMandatorySystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mandatorySystemGestures;
    }

    @l
    @u3.h(name = "getNavigationBars")
    @Composable
    public static final WindowInsets getNavigationBars(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1596175702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596175702, i5, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        AndroidWindowInsets navigationBars = WindowInsetsHolder.Companion.current(composer, 8).getNavigationBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBars;
    }

    @u3.h(name = "getNavigationBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getNavigationBarsIgnoringVisibility(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1990981160);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990981160, i5, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        ValueInsets navigationBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 8).getNavigationBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getSafeContent")
    @Composable
    public static final WindowInsets getSafeContent(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-2026663876);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026663876, i5, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        WindowInsets safeContent = WindowInsetsHolder.Companion.current(composer, 8).getSafeContent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeContent;
    }

    @l
    @u3.h(name = "getSafeDrawing")
    @Composable
    public static final WindowInsets getSafeDrawing(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-49441252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-49441252, i5, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        WindowInsets safeDrawing = WindowInsetsHolder.Companion.current(composer, 8).getSafeDrawing();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeDrawing;
    }

    @l
    @u3.h(name = "getSafeGestures")
    @Composable
    public static final WindowInsets getSafeGestures(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1594247780);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1594247780, i5, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        WindowInsets safeGestures = WindowInsetsHolder.Companion.current(composer, 8).getSafeGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeGestures;
    }

    @l
    @u3.h(name = "getStatusBars")
    @Composable
    public static final WindowInsets getStatusBars(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-675090670);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675090670, i5, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        AndroidWindowInsets statusBars = WindowInsetsHolder.Companion.current(composer, 8).getStatusBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @u3.h(name = "getStatusBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getStatusBarsIgnoringVisibility(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(594020756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(594020756, i5, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        ValueInsets statusBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 8).getStatusBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getSystemBars")
    @Composable
    public static final WindowInsets getSystemBars(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-282936756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282936756, i5, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.Companion.current(composer, 8).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }

    @u3.h(name = "getSystemBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getSystemBarsIgnoringVisibility(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1564566798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564566798, i5, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        ValueInsets systemBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 8).getSystemBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getSystemGestures")
    @Composable
    public static final WindowInsets getSystemGestures(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(989216224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(989216224, i5, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        AndroidWindowInsets systemGestures = WindowInsetsHolder.Companion.current(composer, 8).getSystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemGestures;
    }

    @l
    @u3.h(name = "getTappableElement")
    @Composable
    public static final WindowInsets getTappableElement(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1994205284);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994205284, i5, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        AndroidWindowInsets tappableElement = WindowInsetsHolder.Companion.current(composer, 8).getTappableElement();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElement;
    }

    @u3.h(name = "getTappableElementIgnoringVisibility")
    @ExperimentalLayoutApi
    @l
    @Composable
    public static final WindowInsets getTappableElementIgnoringVisibility(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1488788292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488788292, i5, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        ValueInsets tappableElementIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 8).getTappableElementIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElementIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @l
    @u3.h(name = "getWaterfall")
    @Composable
    public static final WindowInsets getWaterfall(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1943241020);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943241020, i5, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        ValueInsets waterfall = WindowInsetsHolder.Companion.current(composer, 8).getWaterfall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return waterfall;
    }

    @u3.h(name = "isCaptionBarVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isCaptionBarVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-501076620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-501076620, i5, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getCaptionBar().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isCaptionBarVisible$annotations(WindowInsets.Companion companion) {
    }

    @u3.h(name = "isImeVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isImeVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1873571424);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1873571424, i5, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getIme().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isImeVisible$annotations(WindowInsets.Companion companion) {
    }

    @u3.h(name = "isTappableElementVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isTappableElementVisible(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1737201120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737201120, i5, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 8).getTappableElement().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isTappableElementVisible$annotations(WindowInsets.Companion companion) {
    }

    public static final void setConsumeWindowInsets(@l AbstractComposeView abstractComposeView, boolean z4) {
        abstractComposeView.setTag(androidx.compose.ui.R.id.consume_window_insets_tag, Boolean.valueOf(z4));
    }

    @l
    public static final InsetsValues toInsetsValues(@l Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final /* synthetic */ boolean getConsumeWindowInsets(ComposeView composeView) {
        Object tag = composeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
