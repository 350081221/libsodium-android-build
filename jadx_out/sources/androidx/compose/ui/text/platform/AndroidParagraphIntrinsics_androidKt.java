package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    @l
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@l String str, @l TextStyle textStyle, @l List<AnnotatedString.Range<SpanStyle>> list, @l List<AnnotatedString.Range<Placeholder>> list2, @l Density density, @l FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m5409boximpl(paragraphStyle.m5483getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m5412equalsimpl0(r1.m5415unboximpl(), EmojiSupportMatch.Companion.m5417getNone_3YsG6Y()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == null) goto L22;
     */
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m5792resolveTextDirectionHeuristicsHklW4sA(int r6, @p4.m androidx.compose.ui.text.intl.LocaleList r7) {
        /*
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r1 = r0.m5951getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto Le
            goto L6e
        Le:
            int r1 = r0.m5952getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L1b
        L19:
            r2 = r3
            goto L6e
        L1b:
            int r1 = r0.m5953getLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L28
            r2 = r4
            goto L6e
        L28:
            int r1 = r0.m5954getRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L35
            r2 = r5
            goto L6e
        L35:
            int r1 = r0.m5950getContents_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r1)
            if (r1 == 0) goto L41
            r6 = r5
            goto L49
        L41:
            int r0 = r0.m5955getUnspecifieds_7Xco()
            boolean r6 = androidx.compose.ui.text.style.TextDirection.m5946equalsimpl0(r6, r0)
        L49:
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L62
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale$ui_text_release()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.l0.n(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L66
        L62:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L66:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L6e
            if (r6 == r5) goto L19
        L6e:
            return r2
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m5792resolveTextDirectionHeuristicsHklW4sA(int, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m5793resolveTextDirectionHeuristicsHklW4sA$default(int i5, LocaleList localeList, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            localeList = null;
        }
        return m5792resolveTextDirectionHeuristicsHklW4sA(i5, localeList);
    }
}
