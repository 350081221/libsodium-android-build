package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"animateLottieCompositionAsState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isPlaying", "", "restartOnPlay", "reverseOnRepeat", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "", "iterations", "", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release", "wasPlaying"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nanimateLottieCompositionAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,93:1\n1#2:94\n25#3:95\n1097#4,6:96\n76#5:102\n81#6:103\n107#6,2:104\n*S KotlinDebug\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n*L\n60#1:95\n60#1:96,6\n63#1:102\n60#1:103\n60#1:104,2\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0086a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ float $actualSpeed;
        final /* synthetic */ LottieAnimatable $animatable;
        final /* synthetic */ f $cancellationBehavior;
        final /* synthetic */ g $clipSpec;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ boolean $useCompositionFrameRate;
        final /* synthetic */ MutableState<Boolean> $wasPlaying$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0086a(boolean z4, boolean z5, LottieAnimatable lottieAnimatable, com.airbnb.lottie.k kVar, int i5, boolean z6, float f5, g gVar, f fVar, boolean z7, MutableState<Boolean> mutableState, kotlin.coroutines.d<? super C0086a> dVar) {
            super(2, dVar);
            this.$isPlaying = z4;
            this.$restartOnPlay = z5;
            this.$animatable = lottieAnimatable;
            this.$composition = kVar;
            this.$iterations = i5;
            this.$reverseOnRepeat = z6;
            this.$actualSpeed = f5;
            this.$clipSpec = gVar;
            this.$cancellationBehavior = fVar;
            this.$useCompositionFrameRate = z7;
            this.$wasPlaying$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new C0086a(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((C0086a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                if (this.$isPlaying && !a.d(this.$wasPlaying$delegate) && this.$restartOnPlay) {
                    LottieAnimatable lottieAnimatable = this.$animatable;
                    this.label = 1;
                    if (c.e(lottieAnimatable, this) == l5) {
                        return l5;
                    }
                }
            }
            a.e(this.$wasPlaying$delegate, this.$isPlaying);
            if (!this.$isPlaying) {
                return r2.f19517a;
            }
            LottieAnimatable lottieAnimatable2 = this.$animatable;
            com.airbnb.lottie.k kVar = this.$composition;
            int i6 = this.$iterations;
            boolean z4 = this.$reverseOnRepeat;
            float f5 = this.$actualSpeed;
            g gVar = this.$clipSpec;
            float progress = lottieAnimatable2.getProgress();
            f fVar = this.$cancellationBehavior;
            boolean z5 = this.$useCompositionFrameRate;
            this.label = 2;
            if (LottieAnimatable.a.a(lottieAnimatable2, kVar, 0, i6, z4, f5, gVar, progress, false, fVar, false, z5, this, 514, null) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    @p4.l
    @Composable
    public static final LottieAnimationState c(@p4.m com.airbnb.lottie.k kVar, boolean z4, boolean z5, boolean z6, @p4.m g gVar, float f5, int i5, @p4.m f fVar, boolean z7, boolean z8, @p4.m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(683659508);
        boolean z9 = (i7 & 2) != 0 ? true : z4;
        boolean z10 = (i7 & 4) != 0 ? true : z5;
        boolean z11 = (i7 & 8) != 0 ? false : z6;
        g gVar2 = (i7 & 16) != 0 ? null : gVar;
        float f6 = (i7 & 32) != 0 ? 1.0f : f5;
        int i8 = (i7 & 64) != 0 ? 1 : i5;
        f fVar2 = (i7 & 128) != 0 ? f.Immediately : fVar;
        boolean z12 = (i7 & 256) != 0 ? false : z7;
        boolean z13 = (i7 & 512) != 0 ? false : z8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(683659508, i6, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i8 > 0) {
            if ((Float.isInfinite(f6) || Float.isNaN(f6)) ? false : true) {
                LottieAnimatable d5 = c.d(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z9), null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                composer.startReplaceableGroup(-180606834);
                if (!z12) {
                    f6 /= com.airbnb.lottie.utils.l.f((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(new Object[]{kVar, Boolean.valueOf(z9), gVar2, Float.valueOf(f6), Integer.valueOf(i8)}, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) new C0086a(z9, z10, d5, kVar, i8, z11, f6, gVar2, fVar2, z13, mutableState, null), composer, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return d5;
            }
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f6 + ".").toString());
        }
        throw new IllegalArgumentException(("Iterations must be a positive number (" + i8 + ").").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }
}
