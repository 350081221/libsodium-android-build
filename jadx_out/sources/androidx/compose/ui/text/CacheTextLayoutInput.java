package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;

    @l
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(@l TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (l0.g(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && l0.g(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m5978equalsimpl0(textLayoutInput.m5514getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m5514getOverflowgIe3tQ8()) && l0.g(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m6000getMaxWidthimpl(textLayoutInput.m5513getConstraintsmsEJaDk()) == Constraints.m6000getMaxWidthimpl(cacheTextLayoutInput.textLayoutInput.m5513getConstraintsmsEJaDk()) && Constraints.m5999getMaxHeightimpl(textLayoutInput.m5513getConstraintsmsEJaDk()) == Constraints.m5999getMaxHeightimpl(cacheTextLayoutInput.textLayoutInput.m5513getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    @l
    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m5979hashCodeimpl(textLayoutInput.m5514getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Integer.hashCode(Constraints.m6000getMaxWidthimpl(textLayoutInput.m5513getConstraintsmsEJaDk()))) * 31) + Integer.hashCode(Constraints.m5999getMaxHeightimpl(textLayoutInput.m5513getConstraintsmsEJaDk()));
    }
}
