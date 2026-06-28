package androidx.compose.ui.text;

import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DefaultIncludeFontPadding", "", "createPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    @l
    public static final PlatformTextStyle createPlatformTextStyle(@m PlatformSpanStyle platformSpanStyle, @m PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @l
    public static final PlatformParagraphStyle lerp(@l PlatformParagraphStyle platformParagraphStyle, @l PlatformParagraphStyle platformParagraphStyle2, float f5) {
        if (platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding()) {
            return platformParagraphStyle;
        }
        return new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m5409boximpl(platformParagraphStyle.m5483getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m5409boximpl(platformParagraphStyle2.m5483getEmojiSupportMatch_3YsG6Y()), f5)).m5415unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f5)).booleanValue(), (w) null);
    }

    @l
    public static final PlatformSpanStyle lerp(@l PlatformSpanStyle platformSpanStyle, @l PlatformSpanStyle platformSpanStyle2, float f5) {
        return platformSpanStyle;
    }
}
