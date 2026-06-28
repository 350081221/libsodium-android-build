package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LottieAnimatable", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "defaultProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "rememberLottieAnimatable", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "resetToBeginning", "", "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,359:1\n25#2:360\n1097#3,6:361\n*S KotlinDebug\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableKt\n*L\n29#1:360\n29#1:361,6\n*E\n"})
/* loaded from: classes2.dex */
public final class c {
    @p4.l
    public static final LottieAnimatable a() {
        return new b();
    }

    public static final float c(com.airbnb.lottie.k kVar, g gVar, float f5) {
        if (f5 >= 0.0f || kVar != null) {
            if (kVar == null) {
                return 0.0f;
            }
            if (f5 < 0.0f) {
                if (gVar != null) {
                    return gVar.a(kVar);
                }
            } else {
                if (gVar == null) {
                    return 0.0f;
                }
                return gVar.b(kVar);
            }
        }
        return 1.0f;
    }

    @p4.l
    @Composable
    public static final LottieAnimatable d(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2024497114);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2024497114, i5, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = a();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LottieAnimatable lottieAnimatable = (LottieAnimatable) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieAnimatable;
    }

    @p4.m
    public static final Object e(@p4.l LottieAnimatable lottieAnimatable, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object c5 = LottieAnimatable.a.c(lottieAnimatable, null, c(lottieAnimatable.getComposition(), lottieAnimatable.q(), lottieAnimatable.m()), 1, false, dVar, 9, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (c5 == l5) {
            return c5;
        }
        return r2.f19517a;
    }
}
