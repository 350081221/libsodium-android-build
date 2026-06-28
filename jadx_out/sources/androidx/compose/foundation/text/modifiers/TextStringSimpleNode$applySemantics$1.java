package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "textLayoutResult", "", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextStringSimpleNode$applySemantics$1 extends n0 implements l<List<TextLayoutResult>, Boolean> {
    final /* synthetic */ TextStringSimpleNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$1(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.this$0 = textStringSimpleNode;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l List<TextLayoutResult> list) {
        ParagraphLayoutCache layoutCache;
        TextStyle textStyle;
        ColorProducer colorProducer;
        TextStyle m5590mergedA7vx0o;
        layoutCache = this.this$0.getLayoutCache();
        textStyle = this.this$0.style;
        colorProducer = this.this$0.overrideColor;
        m5590mergedA7vx0o = textStyle.m5590mergedA7vx0o((r58 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo1517invoke0d7_KjU() : Color.Companion.m3770getUnspecified0d7_KjU(), (r58 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : 0L, (r58 & 4) != 0 ? null : null, (r58 & 8) != 0 ? null : null, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : null, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : 0L, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : null, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.Companion.m5942getUnspecifiede0LSkKk() : 0, (r58 & 65536) != 0 ? TextDirection.Companion.m5955getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : 0L, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.Companion.m5869getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.Companion.m5848getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
        TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(m5590mergedA7vx0o);
        if (slowCreateTextLayoutResultOrNull != null) {
            list.add(slowCreateTextLayoutResultOrNull);
        } else {
            slowCreateTextLayoutResultOrNull = null;
        }
        return Boolean.valueOf(slowCreateTextLayoutResultOrNull != null);
    }
}
