package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.i;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.f1;
import com.airbnb.lottie.y0;
import com.airbnb.lottie.z0;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a2\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\"\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002\u001a*\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\u008e\u0001\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012H\b\u0002\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160(\u0012\u0006\u0012\u0004\u0018\u00010)0!H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a!\u0010/\u001a\u0002H0\"\u0004\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H00\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101\u001a\f\u00102\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\u0010\u00103\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"DefaultCacheKey", "", "loadFontsFromAssets", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "fontAssetsFolder", "fontFileExtension", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImagesFromAssets", "imageAssetsFolder", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieComposition", "spec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "cacheKey", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieTask", "Lcom/airbnb/lottie/LottieTask;", "isWarmingCache", "", "maybeDecodeBase64Image", "asset", "Lcom/airbnb/lottie/LottieImageAsset;", "maybeLoadImageFromAsset", "maybeLoadTypefaceFromAssets", "font", "Lcom/airbnb/lottie/model/Font;", "rememberLottieComposition", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "onRetry", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "typefaceForStyle", "Landroid/graphics/Typeface;", "typeface", "style", "await", "T", "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureLeadingPeriod", "ensureTrailingSlash", "lottie-compose_release", "result", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;"}, k = 2, mv = {1, 9, 0}, xi = 48)
@Instrumented
@r1({"SMAP\nrememberLottieComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 rememberLottieComposition.kt\ncom/airbnb/lottie/compose/RememberLottieCompositionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,313:1\n76#2:314\n36#3:315\n50#3:322\n49#3:323\n1097#4,6:316\n1097#4,6:324\n314#5,11:330\n81#6:341\n*S KotlinDebug\n*F\n+ 1 rememberLottieComposition.kt\ncom/airbnb/lottie/compose/RememberLottieCompositionKt\n*L\n83#1:314\n84#1:315\n87#1:322\n87#1:323\n84#1:316,6\n87#1:324,6\n190#1:330,11\n84#1:341\n*E\n"})
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final String f1254a = "__LottieInternalDefaultCacheKey__";

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "c", "kotlin.jvm.PlatformType", "onResult", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a<T> implements z0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<T> f1255a;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super T> pVar) {
            this.f1255a = pVar;
        }

        @Override // com.airbnb.lottie.z0
        public final void onResult(T t5) {
            if (this.f1255a.d()) {
                return;
            }
            kotlinx.coroutines.p<T> pVar = this.f1255a;
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(t5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "e", "", "kotlin.jvm.PlatformType", "onResult"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b<T> implements z0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<T> f1256a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.p<? super T> pVar) {
            this.f1256a = pVar;
        }

        @Override // com.airbnb.lottie.z0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th) {
            if (this.f1256a.d()) {
                return;
            }
            kotlinx.coroutines.p<T> pVar = this.f1256a;
            d1.a aVar = d1.Companion;
            l0.m(th);
            pVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.airbnb.lottie.k kVar, Context context, String str, String str2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$composition = kVar;
            this.$context = context;
            this.$fontAssetsFolder = str;
            this.$fontFileExtension = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new c(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                for (com.airbnb.lottie.model.c cVar : this.$composition.g().values()) {
                    Context context = this.$context;
                    l0.m(cVar);
                    r.u(context, cVar, this.$fontAssetsFolder, this.$fontFileExtension);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageAssetsFolder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.airbnb.lottie.k kVar, Context context, String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$composition = kVar;
            this.$context = context;
            this.$imageAssetsFolder = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new d(this.$composition, this.$context, this.$imageAssetsFolder, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                for (y0 y0Var : this.$composition.j().values()) {
                    l0.m(y0Var);
                    r.s(y0Var);
                    r.t(this.$context, y0Var, this.$imageAssetsFolder);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {126, 127, 128}, m = "lottieComposition", n = {com.umeng.analytics.pro.d.X, "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", com.umeng.analytics.pro.d.X, "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return r.q(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.o implements v3.q<Integer, Throwable, kotlin.coroutines.d<? super Boolean>, Object> {
        int label;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
        }

        @p4.m
        public final Object invoke(int i5, @p4.l Throwable th, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return new f(dVar).invokeSuspend(r2.f19517a);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke(num.intValue(), th, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {91, 93}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        final /* synthetic */ String $imageAssetsFolder;
        final /* synthetic */ v3.q<Integer, Throwable, kotlin.coroutines.d<? super Boolean>, Object> $onRetry;
        final /* synthetic */ MutableState<LottieCompositionResultImpl> $result$delegate;
        final /* synthetic */ i $spec;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v3.q<? super Integer, ? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, Context context, i iVar, String str, String str2, String str3, String str4, MutableState<LottieCompositionResultImpl> mutableState, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.$onRetry = qVar;
            this.$context = context;
            this.$spec = iVar;
            this.$imageAssetsFolder = str;
            this.$fontAssetsFolder = str2;
            this.$fontFileExtension = str3;
            this.$cacheKey = str4;
            this.$result$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new g(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:5|(3:6|7|8)|9|10|11|12|(4:(2:15|(1:17)(3:19|20|(1:22)(1:23)))|24|25|(1:27)(6:28|9|10|11|12|(0)))|32|(1:35)|36|37) */
        /* JADX WARN: Can't wrap try/catch for region: R(4:(2:15|(1:17)(3:19|20|(1:22)(1:23)))|24|25|(1:27)(6:28|9|10|11|12|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
        
            r4 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
        
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        
            r13 = r4;
            r4 = r15;
            r15 = r0;
            r0 = r1;
            r1 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009f -> B:9:0x00a5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:12:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.r.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object l(f1<T> f1Var, kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        f1Var.d(new a(qVar)).c(new b(qVar));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(String str) {
        boolean S1;
        boolean s22;
        S1 = e0.S1(str);
        if (!S1) {
            s22 = e0.s2(str, ".", false, 2, null);
            if (!s22) {
                return "." + str;
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String n(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            boolean r1 = kotlin.text.v.S1(r4)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = r0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            r2 = 0
            if (r1 == 0) goto L12
            r4 = r2
            goto L2d
        L12:
            r1 = 47
            r3 = 2
            boolean r0 = kotlin.text.v.Y2(r4, r1, r0, r3, r2)
            if (r0 == 0) goto L1c
            goto L2d
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.r.n(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Context context, com.airbnb.lottie.k kVar, String str, String str2, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (kVar.g().isEmpty()) {
            return r2.f19517a;
        }
        Object h5 = kotlinx.coroutines.i.h(k1.c(), new c(kVar, context, str, str2, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (h5 == l5) {
            return h5;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(Context context, com.airbnb.lottie.k kVar, String str, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (!kVar.u()) {
            return r2.f19517a;
        }
        Object h5 = kotlinx.coroutines.i.h(k1.c(), new d(kVar, context, str, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (h5 == l5) {
            return h5;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(android.content.Context r6, com.airbnb.lottie.compose.i r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.d<? super com.airbnb.lottie.k> r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.r.q(android.content.Context, com.airbnb.lottie.compose.i, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1<com.airbnb.lottie.k> r(Context context, i iVar, String str, boolean z4) {
        boolean J1;
        if (iVar instanceof i.e) {
            if (l0.g(str, f1254a)) {
                return d0.K(context, ((i.e) iVar).h());
            }
            return d0.L(context, ((i.e) iVar).h(), str);
        }
        if (iVar instanceof i.f) {
            if (l0.g(str, f1254a)) {
                return d0.O(context, ((i.f) iVar).h());
            }
            return d0.P(context, ((i.f) iVar).h(), str);
        }
        if (iVar instanceof i.c) {
            if (z4) {
                return null;
            }
            i.c cVar = (i.c) iVar;
            FileInputStream fileInputStream = new FileInputStream(cVar.h());
            J1 = e0.J1(cVar.h(), "zip", false, 2, null);
            if (J1) {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                if (l0.g(str, f1254a)) {
                    str = cVar.h();
                }
                return d0.U(zipInputStream, str);
            }
            if (l0.g(str, f1254a)) {
                str = cVar.h();
            }
            return d0.z(fileInputStream, str);
        }
        if (iVar instanceof i.a) {
            if (l0.g(str, f1254a)) {
                return d0.u(context, ((i.a) iVar).h());
            }
            return d0.v(context, ((i.a) iVar).h(), str);
        }
        if (iVar instanceof i.d) {
            if (l0.g(str, f1254a)) {
                str = String.valueOf(((i.d) iVar).h().hashCode());
            }
            return d0.H(((i.d) iVar).h(), str);
        }
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            InputStream openInputStream = context.getContentResolver().openInputStream(bVar.h());
            if (l0.g(str, f1254a)) {
                str = bVar.h().toString();
            }
            return d0.z(openInputStream, str);
        }
        throw new j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(y0 y0Var) {
        boolean s22;
        int p32;
        int o32;
        if (y0Var.b() != null) {
            return;
        }
        String d5 = y0Var.d();
        l0.m(d5);
        s22 = e0.s2(d5, "data:", false, 2, null);
        if (s22) {
            p32 = f0.p3(d5, "base64,", 0, false, 6, null);
            if (p32 > 0) {
                try {
                    o32 = f0.o3(d5, ',', 0, false, 6, null);
                    String substring = d5.substring(o32 + 1);
                    l0.o(substring, "this as java.lang.String).substring(startIndex)");
                    byte[] decode = Base64.decode(substring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    y0Var.i(BitmapFactoryInstrumentation.decodeByteArray(decode, 0, decode.length, options));
                } catch (IllegalArgumentException e5) {
                    com.airbnb.lottie.utils.f.f("data URL did not have correct base64 format.", e5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Context context, y0 y0Var, String str) {
        if (y0Var.b() == null && str != null) {
            String d5 = y0Var.d();
            try {
                InputStream open = context.getAssets().open(str + d5);
                l0.m(open);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    y0Var.i(com.airbnb.lottie.utils.l.m(BitmapFactoryInstrumentation.decodeStream(open, null, options), y0Var.g(), y0Var.e()));
                } catch (IllegalArgumentException e5) {
                    com.airbnb.lottie.utils.f.f("Unable to decode image.", e5);
                }
            } catch (IOException e6) {
                com.airbnb.lottie.utils.f.f("Unable to open asset.", e6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Context context, com.airbnb.lottie.model.c cVar, String str, String str2) {
        String str3 = str + cVar.b() + str2;
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                l0.m(createFromAsset);
                String d5 = cVar.d();
                l0.o(d5, "getStyle(...)");
                cVar.f(x(createFromAsset, d5));
            } catch (Exception e5) {
                com.airbnb.lottie.utils.f.c("Failed to create " + cVar.b() + " typeface with style=" + cVar.d() + "!", e5);
            }
        } catch (Exception e6) {
            com.airbnb.lottie.utils.f.c("Failed to find typeface in assets with path " + str3 + ".", e6);
        }
    }

    @p4.l
    @Composable
    @u3.i
    public static final LottieCompositionResult v(@p4.l i spec, @p4.m String str, @p4.m String str2, @p4.m String str3, @p4.m String str4, @p4.m v3.q<? super Integer, ? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, @p4.m Composer composer, int i5, int i6) {
        String str5;
        String str6;
        String str7;
        String str8;
        v3.q<? super Integer, ? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar2;
        l0.p(spec, "spec");
        composer.startReplaceableGroup(-1248473602);
        if ((i6 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i6 & 4) != 0) {
            str6 = "fonts/";
        } else {
            str6 = str2;
        }
        if ((i6 & 8) != 0) {
            str7 = ".ttf";
        } else {
            str7 = str3;
        }
        if ((i6 & 16) != 0) {
            str8 = f1254a;
        } else {
            str8 = str4;
        }
        if ((i6 & 32) != 0) {
            qVar2 = new f(null);
        } else {
            qVar2 = qVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248473602, i5, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:81)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int i7 = i5 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(spec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LottieCompositionResultImpl(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i8 = (i5 >> 9) & 112;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(spec) | composer.changed(str8);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(r(context, spec, str8, true));
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new g(qVar2, context, spec, str5, str6, str7, str8, mutableState, null), composer, i7 | 512 | i8);
        LottieCompositionResultImpl w4 = w(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return w4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl w(MutableState<LottieCompositionResultImpl> mutableState) {
        return mutableState.getValue();
    }

    private static final Typeface x(Typeface typeface, String str) {
        boolean T2;
        boolean T22;
        int i5 = 0;
        T2 = f0.T2(str, "Italic", false, 2, null);
        T22 = f0.T2(str, "Bold", false, 2, null);
        if (T2 && T22) {
            i5 = 3;
        } else if (T2) {
            i5 = 2;
        } else if (T22) {
            i5 = 1;
        }
        if (typeface.getStyle() != i5) {
            return Typeface.create(typeface, i5);
        }
        return typeface;
    }
}
