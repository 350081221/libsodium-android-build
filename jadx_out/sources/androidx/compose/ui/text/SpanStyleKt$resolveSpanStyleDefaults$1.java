package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanStyleKt$resolveSpanStyleDefaults$1 extends n0 implements a<TextForegroundStyle> {
    public static final SpanStyleKt$resolveSpanStyleDefaults$1 INSTANCE = new SpanStyleKt$resolveSpanStyleDefaults$1();

    SpanStyleKt$resolveSpanStyleDefaults$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final TextForegroundStyle invoke() {
        long j5;
        TextForegroundStyle.Companion companion = TextForegroundStyle.Companion;
        j5 = SpanStyleKt.DefaultColor;
        return companion.m5957from8_81llA(j5);
    }
}
