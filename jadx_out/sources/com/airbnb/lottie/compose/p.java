package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberLottieRetrySignal", "Lcom/airbnb/lottie/compose/LottieRetrySignal;", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieRetrySignal;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieRetrySignal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignalKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,50:1\n25#2:51\n1097#3,6:52\n*S KotlinDebug\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignalKt\n*L\n19#1:51\n19#1:52,6\n*E\n"})
/* loaded from: classes2.dex */
public final class p {
    @p4.l
    @Composable
    public static final o a(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1266611990);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1266611990, i5, -1, "com.airbnb.lottie.compose.rememberLottieRetrySignal (LottieRetrySignal.kt:17)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new o();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        o oVar = (o) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return oVar;
    }
}
