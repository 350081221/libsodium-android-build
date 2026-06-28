package com.airbnb.lottie.compose;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.e1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z2;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jm\u0010P\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010X\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010[\u001a\u00020/H\u0002J3\u0010\\\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010]\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020Q2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0016\u0010`\u001a\u00020\u0014*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R+\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010;R+\u0010A\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\"R+\u0010E\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010;R+\u0010I\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010\"R\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "()V", "<set-?>", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "clipSpec$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "endProgress", "", "getEndProgress", "()F", "endProgress$delegate", "Landroidx/compose/runtime/State;", "frameSpeed", "getFrameSpeed", "frameSpeed$delegate", "isAtEnd", "", "()Z", "isAtEnd$delegate", "isPlaying", "setPlaying", "(Z)V", "isPlaying$delegate", "", "iteration", "getIteration", "()I", "setIteration", "(I)V", "iteration$delegate", "iterations", "getIterations", "setIterations", "iterations$delegate", "", "lastFrameNanos", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "progress", "getProgress", "setProgress", "(F)V", "progress$delegate", "progressRaw", "getProgressRaw", "setProgressRaw", "progressRaw$delegate", "reverseOnRepeat", "getReverseOnRepeat", "setReverseOnRepeat", "reverseOnRepeat$delegate", "speed", "getSpeed", "setSpeed", "speed$delegate", "useCompositionFrameRate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "useCompositionFrameRate$delegate", t0.b.f22420d, "getValue", "()Ljava/lang/Float;", "animate", "", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFrame", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrame", "frameNanos", "snapTo", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "roundToCompositionFrameRate", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,359:1\n81#2:360\n107#2,2:361\n81#2:363\n107#2,2:364\n81#2:366\n107#2,2:367\n81#2:369\n107#2,2:370\n81#2:372\n107#2,2:373\n81#2:375\n107#2,2:376\n81#2:378\n107#2,2:379\n81#2:381\n81#2:382\n107#2,2:383\n81#2:385\n107#2,2:386\n81#2:388\n107#2,2:389\n81#2:391\n107#2,2:392\n81#2:394\n81#2:395\n*S KotlinDebug\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableImpl\n*L\n157#1:360\n157#1:361,2\n163#1:363\n163#1:364,2\n166#1:366\n166#1:367,2\n169#1:369\n169#1:370,2\n172#1:372\n172#1:373,2\n175#1:375\n175#1:376,2\n178#1:378\n178#1:379,2\n184#1:381\n188#1:382\n188#1:383,2\n191#1:385\n191#1:386,2\n193#1:388\n193#1:389,2\n196#1:391\n196#1:392,2\n199#1:394\n208#1:395\n*E\n"})
/* loaded from: classes2.dex */
public final class b implements LottieAnimatable {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final MutableState f1194a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableState f1195b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final MutableState f1196c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final MutableState f1197d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final MutableState f1198e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final MutableState f1199f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final MutableState f1200g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final State f1201h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final MutableState f1202i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final MutableState f1203j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final MutableState f1204k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final MutableState f1205l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final State f1206m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final State f1207n;

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    private final MutatorMutex f1208o;

    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.airbnb.lottie.compose.f $cancellationBehavior;
        final /* synthetic */ com.airbnb.lottie.compose.g $clipSpec;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ boolean $continueFromPreviousAnimate;
        final /* synthetic */ float $initialProgress;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ float $speed;
        final /* synthetic */ boolean $useCompositionFrameRate;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0087a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ com.airbnb.lottie.compose.f $cancellationBehavior;
            final /* synthetic */ int $iteration;
            final /* synthetic */ int $iterations;
            final /* synthetic */ l2 $parentJob;
            int label;
            final /* synthetic */ b this$0;

            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.airbnb.lottie.compose.b$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0088a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f1209a;

                static {
                    int[] iArr = new int[com.airbnb.lottie.compose.f.values().length];
                    try {
                        iArr[com.airbnb.lottie.compose.f.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f1209a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0087a(com.airbnb.lottie.compose.f fVar, l2 l2Var, int i5, int i6, b bVar, kotlin.coroutines.d<? super C0087a> dVar) {
                super(2, dVar);
                this.$cancellationBehavior = fVar;
                this.$parentJob = l2Var;
                this.$iterations = i5;
                this.$iteration = i6;
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C0087a(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0087a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0044 -> B:5:0x0048). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    kotlin.e1.n(r6)
                    r1 = r0
                    r0 = r5
                    goto L48
                L11:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L19:
                    kotlin.e1.n(r6)
                    r6 = r5
                L1d:
                    com.airbnb.lottie.compose.f r1 = r6.$cancellationBehavior
                    int[] r3 = com.airbnb.lottie.compose.b.a.C0087a.C0088a.f1209a
                    int r1 = r1.ordinal()
                    r1 = r3[r1]
                    if (r1 != r2) goto L37
                    kotlinx.coroutines.l2 r1 = r6.$parentJob
                    boolean r1 = r1.isActive()
                    if (r1 == 0) goto L34
                    int r1 = r6.$iterations
                    goto L39
                L34:
                    int r1 = r6.$iteration
                    goto L39
                L37:
                    int r1 = r6.$iterations
                L39:
                    com.airbnb.lottie.compose.b r3 = r6.this$0
                    r6.label = r2
                    java.lang.Object r1 = com.airbnb.lottie.compose.b.c(r3, r1, r6)
                    if (r1 != r0) goto L44
                    return r0
                L44:
                    r4 = r0
                    r0 = r6
                    r6 = r1
                    r1 = r4
                L48:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 != 0) goto L53
                    kotlin.r2 r6 = kotlin.r2.f19517a
                    return r6
                L53:
                    r6 = r0
                    r0 = r1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.b.a.C0087a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0089b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1210a;

            static {
                int[] iArr = new int[com.airbnb.lottie.compose.f.values().length];
                try {
                    iArr[com.airbnb.lottie.compose.f.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.airbnb.lottie.compose.f.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1210a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i5, int i6, boolean z4, float f5, com.airbnb.lottie.compose.g gVar, com.airbnb.lottie.k kVar, float f6, boolean z5, boolean z6, com.airbnb.lottie.compose.f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.$iteration = i5;
            this.$iterations = i6;
            this.$reverseOnRepeat = z4;
            this.$speed = f5;
            this.$clipSpec = gVar;
            this.$composition = kVar;
            this.$initialProgress = f6;
            this.$useCompositionFrameRate = z5;
            this.$continueFromPreviousAnimate = z6;
            this.$cancellationBehavior = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, dVar);
        }

        @Override // v3.l
        @p4.m
        public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlin.coroutines.g gVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    b.this.K(this.$iteration);
                    b.this.L(this.$iterations);
                    b.this.Q(this.$reverseOnRepeat);
                    b.this.R(this.$speed);
                    b.this.I(this.$clipSpec);
                    b.this.J(this.$composition);
                    b.this.T(this.$initialProgress);
                    b.this.S(this.$useCompositionFrameRate);
                    if (!this.$continueFromPreviousAnimate) {
                        b.this.M(Long.MIN_VALUE);
                    }
                    if (this.$composition == null) {
                        b.this.N(false);
                        return r2.f19517a;
                    }
                    if (Float.isInfinite(this.$speed)) {
                        b bVar = b.this;
                        bVar.T(bVar.D());
                        b.this.N(false);
                        b.this.K(this.$iterations);
                        return r2.f19517a;
                    }
                    b.this.N(true);
                    int i6 = C0089b.f1210a[this.$cancellationBehavior.ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            gVar = kotlin.coroutines.i.INSTANCE;
                        } else {
                            throw new j0();
                        }
                    } else {
                        gVar = z2.f20698a;
                    }
                    C0087a c0087a = new C0087a(this.$cancellationBehavior, p2.B(getContext()), this.$iterations, this.$iteration, b.this, null);
                    this.label = 1;
                    if (kotlinx.coroutines.i.h(gVar, c0087a, this) == l5) {
                        return l5;
                    }
                }
                p2.z(getContext());
                b.this.N(false);
                return r2.f19517a;
            } catch (Throwable th) {
                b.this.N(false);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0090b extends n0 implements v3.l<Long, Boolean> {
        final /* synthetic */ int $iterations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0090b(int i5) {
            super(1);
            this.$iterations = i5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l5) {
            return invoke(l5.longValue());
        }

        @p4.l
        public final Boolean invoke(long j5) {
            return Boolean.valueOf(b.this.G(this.$iterations, j5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends n0 implements v3.l<Long, Boolean> {
        final /* synthetic */ int $iterations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i5) {
            super(1);
            this.$iterations = i5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l5) {
            return invoke(l5.longValue());
        }

        @p4.l
        public final Boolean invoke(long j5) {
            return Boolean.valueOf(b.this.G(this.$iterations, j5));
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class d extends n0 implements v3.a<Float> {
        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Float invoke() {
            com.airbnb.lottie.k composition = b.this.getComposition();
            float f5 = 0.0f;
            if (composition != null) {
                if (b.this.m() < 0.0f) {
                    com.airbnb.lottie.compose.g q5 = b.this.q();
                    if (q5 != null) {
                        f5 = q5.b(composition);
                    }
                } else {
                    com.airbnb.lottie.compose.g q6 = b.this.q();
                    f5 = q6 != null ? q6.a(composition) : 1.0f;
                }
            }
            return Float.valueOf(f5);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class e extends n0 implements v3.a<Float> {
        e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Float invoke() {
            return Float.valueOf((b.this.k() && b.this.n() % 2 == 0) ? -b.this.m() : b.this.m());
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class f extends n0 implements v3.a<Boolean> {
        f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            boolean z4 = false;
            if (b.this.n() == b.this.l()) {
                if (b.this.getProgress() == b.this.D()) {
                    z4 = true;
                }
            }
            return Boolean.valueOf(z4);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class g extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ int $iteration;
        final /* synthetic */ float $progress;
        final /* synthetic */ boolean $resetLastFrameNanos;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.airbnb.lottie.k kVar, float f5, int i5, boolean z4, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.$composition = kVar;
            this.$progress = f5;
            this.$iteration = i5;
            this.$resetLastFrameNanos = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
            return new g(this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, dVar);
        }

        @Override // v3.l
        @p4.m
        public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g) create(dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                b.this.J(this.$composition);
                b.this.T(this.$progress);
                b.this.K(this.$iteration);
                b.this.N(false);
                if (this.$resetLastFrameNanos) {
                    b.this.M(Long.MIN_VALUE);
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        MutableState mutableStateOf$default11;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f1194a = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.f1195b = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.f1196c = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f1197d = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f1198e = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.f1199f = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f1200g = mutableStateOf$default7;
        this.f1201h = SnapshotStateKt.derivedStateOf(new e());
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f1202i = mutableStateOf$default8;
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.f1203j = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.f1204k = mutableStateOf$default10;
        mutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.f1205l = mutableStateOf$default11;
        this.f1206m = SnapshotStateKt.derivedStateOf(new d());
        this.f1207n = SnapshotStateKt.derivedStateOf(new f());
        this.f1208o = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(int i5, kotlin.coroutines.d<? super Boolean> dVar) {
        if (i5 == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new C0090b(i5), dVar);
        }
        return MonotonicFrameClockKt.withFrameNanos(new c(i5), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float D() {
        return ((Number) this.f1206m.getValue()).floatValue();
    }

    private final float E() {
        return ((Number) this.f1201h.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float F() {
        return ((Number) this.f1203j.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(int i5, long j5) {
        long i6;
        float f5;
        float f6;
        float F;
        float f7;
        float H;
        com.airbnb.lottie.k composition = getComposition();
        if (composition == null) {
            return true;
        }
        if (i() == Long.MIN_VALUE) {
            i6 = 0;
        } else {
            i6 = j5 - i();
        }
        M(j5);
        com.airbnb.lottie.compose.g q5 = q();
        if (q5 != null) {
            f5 = q5.b(composition);
        } else {
            f5 = 0.0f;
        }
        com.airbnb.lottie.compose.g q6 = q();
        if (q6 != null) {
            f6 = q6.a(composition);
        } else {
            f6 = 1.0f;
        }
        float d5 = (((float) (i6 / 1000000)) / composition.d()) * E();
        if (E() < 0.0f) {
            F = f5 - (F() + d5);
        } else {
            F = (F() + d5) - f6;
        }
        if (F < 0.0f) {
            H = u.H(F(), f5, f6);
            T(H + d5);
        } else {
            float f8 = f6 - f5;
            int i7 = ((int) (F / f8)) + 1;
            if (n() + i7 > i5) {
                T(D());
                K(i5);
                return false;
            }
            K(n() + i7);
            float f9 = F - ((i7 - 1) * f8);
            if (E() < 0.0f) {
                f7 = f6 - f9;
            } else {
                f7 = f5 + f9;
            }
            T(f7);
        }
        return true;
    }

    private final float H(float f5, com.airbnb.lottie.k kVar) {
        if (kVar == null) {
            return f5;
        }
        return f5 - (f5 % (1 / kVar.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(com.airbnb.lottie.compose.g gVar) {
        this.f1198e.setValue(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(com.airbnb.lottie.k kVar) {
        this.f1202i.setValue(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i5) {
        this.f1195b.setValue(Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i5) {
        this.f1196c.setValue(Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j5) {
        this.f1205l.setValue(Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z4) {
        this.f1194a.setValue(Boolean.valueOf(z4));
    }

    private void O(float f5) {
        this.f1204k.setValue(Float.valueOf(f5));
    }

    private final void P(float f5) {
        this.f1203j.setValue(Float.valueOf(f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(boolean z4) {
        this.f1197d.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(float f5) {
        this.f1199f.setValue(Float.valueOf(f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean z4) {
        this.f1200g.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(float f5) {
        P(f5);
        if (a()) {
            f5 = H(f5, getComposition());
        }
        O(f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean a() {
        return ((Boolean) this.f1200g.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @p4.m
    public Object e(@p4.m com.airbnb.lottie.k kVar, int i5, int i6, boolean z4, float f5, @p4.m com.airbnb.lottie.compose.g gVar, float f6, boolean z5, @p4.l com.airbnb.lottie.compose.f fVar, boolean z6, boolean z7, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate$default = MutatorMutex.mutate$default(this.f1208o, null, new a(i5, i6, z4, f5, gVar, kVar, f6, z7, z5, fVar, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return mutate$default == l5 ? mutate$default : r2.f19517a;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean f() {
        return ((Boolean) this.f1207n.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @p4.m
    public com.airbnb.lottie.k getComposition() {
        return (com.airbnb.lottie.k) this.f1202i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.f1204k.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long i() {
        return ((Number) this.f1205l.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean k() {
        return ((Boolean) this.f1197d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int l() {
        return ((Number) this.f1196c.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float m() {
        return ((Number) this.f1199f.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int n() {
        return ((Number) this.f1195b.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean o() {
        return ((Boolean) this.f1194a.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @p4.m
    public Object p(@p4.m com.airbnb.lottie.k kVar, float f5, int i5, boolean z4, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate$default = MutatorMutex.mutate$default(this.f1208o, null, new g(kVar, f5, i5, z4, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (mutate$default == l5) {
            return mutate$default;
        }
        return r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @p4.m
    public com.airbnb.lottie.compose.g q() {
        return (com.airbnb.lottie.compose.g) this.f1198e.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @p4.l
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}
