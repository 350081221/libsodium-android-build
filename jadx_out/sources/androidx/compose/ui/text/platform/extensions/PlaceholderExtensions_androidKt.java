package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"\u001e\u0010\u0013\u001a\u00020\n*\u00020\u000e8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0019\u001a\u00020\n*\u00020\u00148BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/r2;", "setPlaceholders", "placeholder", "", "start", "end", "setPlaceholder", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m5803getSpanUnitR2X_6o(long j5) {
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(j5);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m5804getSpanUnitR2X_6o$annotations(long j5) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m5805getSpanVerticalAligndo9XGg(int i5) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5476getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5482getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5477getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5478getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5481getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5479getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m5472equalsimpl0(i5, companion.m5480getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m5806getSpanVerticalAligndo9XGg$annotations(int i5) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i5, int i6, Density density) {
        for (Object obj : spannable.getSpans(i5, i6, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m6235getValueimpl(placeholder.m5468getWidthXSAIIZE()), m5803getSpanUnitR2X_6o(placeholder.m5468getWidthXSAIIZE()), TextUnit.m6235getValueimpl(placeholder.m5466getHeightXSAIIZE()), m5803getSpanUnitR2X_6o(placeholder.m5466getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m5805getSpanVerticalAligndo9XGg(placeholder.m5467getPlaceholderVerticalAlignJ6kI3mc())), i5, i6);
    }

    public static final void setPlaceholders(@l Spannable spannable, @l List<AnnotatedString.Range<Placeholder>> list, @l Density density) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<Placeholder> range = list.get(i5);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
