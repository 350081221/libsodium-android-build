package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "charSequence", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "emojiCompatProcessed", "", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "hasStaleResolvedFonts", "getHasStaleResolvedFonts", "()Z", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "getPlaceholders", "()Ljava/util/List;", "resolvedTypefaces", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "getSpanStyles", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Ljava/lang/String;", "textDirectionHeuristic", "", "getTextDirectionHeuristic$ui_text_release", "()I", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;

    @l
    private final CharSequence charSequence;

    @l
    private final Density density;
    private final boolean emojiCompatProcessed;

    @l
    private final FontFamily.Resolver fontFamilyResolver;

    @l
    private final LayoutIntrinsics layoutIntrinsics;

    @l
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    @m
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;

    @l
    private final List<AnnotatedString.Range<SpanStyle>> spanStyles;

    @l
    private final TextStyle style;

    @l
    private final String text;
    private final int textDirectionHeuristic;

    @l
    private final AndroidTextPaint textPaint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.SpanStyle>>, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(@l String str, @l TextStyle textStyle, @l List<AnnotatedString.Range<SpanStyle>> list, @l List<AnnotatedString.Range<Placeholder>> list2, @l FontFamily.Resolver resolver, @l Density density) {
        boolean hasEmojiCompat;
        boolean booleanValue;
        AnnotatedString.Range<SpanStyle> range;
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle);
        if (!hasEmojiCompat) {
            booleanValue = false;
        } else {
            booleanValue = EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        }
        this.emojiCompatProcessed = booleanValue;
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m5792resolveTextDirectionHeuristicsHklW4sA(textStyle.m5588getTextDirections_7Xco(), textStyle.getLocaleList());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), androidParagraphIntrinsics$resolveTypeface$1, density, !((Collection) list).isEmpty());
        if (applySpanStyle != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 == 0) {
                    range = new AnnotatedString.Range<>(applySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i5 - 1);
                }
                list.add(range);
            }
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, androidParagraphIntrinsics$resolveTypeface$1, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    @l
    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean z4;
        boolean hasEmojiCompat;
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null) {
            z4 = typefaceDirtyTrackerLinkedList.isStaleResolvedFont();
        } else {
            z4 = false;
        }
        if (!z4) {
            if (this.emojiCompatProcessed) {
                return false;
            }
            hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style);
            if (!hasEmojiCompat || !EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @l
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @l
    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    @l
    public final TextStyle getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    @l
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }
}
