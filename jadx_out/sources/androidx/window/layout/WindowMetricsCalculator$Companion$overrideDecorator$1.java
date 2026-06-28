package androidx.window.layout;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import v3.l;

@i0(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends h0 implements l<WindowMetricsCalculator, WindowMetricsCalculator> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // v3.l
    @p4.l
    public final WindowMetricsCalculator invoke(@p4.l WindowMetricsCalculator p02) {
        l0.p(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
