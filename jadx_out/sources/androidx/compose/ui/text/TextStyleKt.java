package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.j0;
import p4.l;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f\u001a\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"createPlatformTextStyleInternal", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformSpanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformParagraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-IhaHGbI", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyleKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @l
    public static final TextStyle lerp(@l TextStyle textStyle, @l TextStyle textStyle2, float f5) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f5), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f5));
    }

    @l
    public static final TextStyle resolveDefaults(@l TextStyle textStyle, @l LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI */
    public static final int m5591resolveTextDirectionIhaHGbI(@l LayoutDirection layoutDirection, int i5) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m5946equalsimpl0(i5, companion.m5950getContents_7Xco())) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    return companion.m5952getContentOrRtls_7Xco();
                }
                throw new j0();
            }
            return companion.m5951getContentOrLtrs_7Xco();
        }
        if (TextDirection.m5946equalsimpl0(i5, companion.m5955getUnspecifieds_7Xco())) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return companion.m5954getRtls_7Xco();
                }
                throw new j0();
            }
            return companion.m5953getLtrs_7Xco();
        }
        return i5;
    }
}
