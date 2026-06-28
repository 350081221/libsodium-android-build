package androidx.compose.ui.graphics.colorspace;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.ranges.u;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Rgb$eotf$1 extends n0 implements v3.l<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Double invoke(Double d5) {
        return invoke(d5.doubleValue());
    }

    @p4.l
    public final Double invoke(double d5) {
        float f5;
        float f6;
        double G;
        DoubleFunction eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f5 = this.this$0.min;
        double d6 = f5;
        f6 = this.this$0.max;
        G = u.G(d5, d6, f6);
        return Double.valueOf(eotfOrig$ui_graphics_release.invoke(G));
    }
}
