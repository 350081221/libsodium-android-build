package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/SpanStyle;II)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends n0 implements q<SpanStyle, Integer, Integer, r2> {
    final /* synthetic */ r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = rVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(SpanStyle spanStyle, Integer num, Integer num2) {
        invoke(spanStyle, num.intValue(), num2.intValue());
        return r2.f19517a;
    }

    public final void invoke(@l SpanStyle spanStyle, int i5, int i6) {
        Spannable spannable = this.$this_setFontAttributes;
        r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> rVar = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m5506getFontStyle4Lr2A7w = spanStyle.m5506getFontStyle4Lr2A7w();
        FontStyle m5651boximpl = FontStyle.m5651boximpl(m5506getFontStyle4Lr2A7w != null ? m5506getFontStyle4Lr2A7w.m5657unboximpl() : FontStyle.Companion.m5661getNormal_LCdwA());
        FontSynthesis m5507getFontSynthesisZQGJjVo = spanStyle.m5507getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan(rVar.invoke(fontFamily, fontWeight, m5651boximpl, FontSynthesis.m5662boximpl(m5507getFontSynthesisZQGJjVo != null ? m5507getFontSynthesisZQGJjVo.m5670unboximpl() : FontSynthesis.Companion.m5671getAllGVVA2EU()))), i5, i6, 33);
    }
}
