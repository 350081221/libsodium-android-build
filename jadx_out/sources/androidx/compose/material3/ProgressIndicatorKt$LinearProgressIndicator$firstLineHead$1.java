package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 extends kotlin.jvm.internal.n0 implements v3.l<KeyframesSpec.KeyframesSpecConfig<Float>, r2> {
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1();

    ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        invoke2(keyframesSpecConfig);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        CubicBezierEasing cubicBezierEasing;
        keyframesSpecConfig.setDurationMillis(1800);
        KeyframeBaseEntity at = keyframesSpecConfig.at((Object) Float.valueOf(0.0f), 0);
        cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
        keyframesSpecConfig.using(at, cubicBezierEasing);
        keyframesSpecConfig.at((Object) Float.valueOf(1.0f), 750);
    }
}
