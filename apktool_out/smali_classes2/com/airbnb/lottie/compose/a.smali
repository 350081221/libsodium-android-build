.class public final Lcom/airbnb/lottie/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001as\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"
    }
    d2 = {
        "animateLottieCompositionAsState",
        "Lcom/airbnb/lottie/compose/LottieAnimationState;",
        "composition",
        "Lcom/airbnb/lottie/LottieComposition;",
        "isPlaying",
        "",
        "restartOnPlay",
        "reverseOnRepeat",
        "clipSpec",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "speed",
        "",
        "iterations",
        "",
        "cancellationBehavior",
        "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;",
        "ignoreSystemAnimatorScale",
        "useCompositionFrameRate",
        "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;",
        "lottie-compose_release",
        "wasPlaying"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nanimateLottieCompositionAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,93:1\n1#2:94\n25#3:95\n1097#4,6:96\n76#5:102\n81#6:103\n107#6,2:104\n*S KotlinDebug\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n*L\n60#1:95\n60#1:96,6\n63#1:102\n60#1:103\n60#1:104,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    invoke-static {p0}, Lcom/airbnb/lottie/compose/a;->d(Landroidx/compose/runtime/MutableState;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/airbnb/lottie/compose/a;->e(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method

.method public static final c(Lcom/airbnb/lottie/k;ZZZLcom/airbnb/lottie/compose/g;FILcom/airbnb/lottie/compose/f;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;
    .locals 18
    .param p0    # Lcom/airbnb/lottie/k;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lcom/airbnb/lottie/compose/g;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Lcom/airbnb/lottie/compose/f;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    move-object/from16 v0, p10

    move/from16 v1, p12

    const v2, 0x28bfd0f4

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    move/from16 v6, p1

    :goto_0
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    move/from16 v7, p2

    :goto_1
    and-int/lit8 v3, v1, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    move v11, v5

    goto :goto_2

    :cond_2
    move/from16 v11, p3

    :goto_2
    and-int/lit8 v3, v1, 0x10

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    move-object v13, v8

    goto :goto_3

    :cond_3
    move-object/from16 v13, p4

    :goto_3
    and-int/lit8 v3, v1, 0x20

    if-eqz v3, :cond_4

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_4
    move/from16 v3, p5

    :goto_4
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_5

    const/4 v10, 0x1

    goto :goto_5

    :cond_5
    move/from16 v10, p6

    :goto_5
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_6

    .line 1
    sget-object v9, Lcom/airbnb/lottie/compose/f;->Immediately:Lcom/airbnb/lottie/compose/f;

    move-object v14, v9

    goto :goto_6

    :cond_6
    move-object/from16 v14, p7

    :goto_6
    and-int/lit16 v9, v1, 0x100

    if-eqz v9, :cond_7

    move v9, v5

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_8

    move v15, v5

    goto :goto_8

    :cond_8
    move/from16 v15, p9

    .line 2
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v12, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)"

    move/from16 v4, p11

    .line 3
    invoke-static {v2, v4, v1, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_9
    if-lez v10, :cond_a

    const/4 v1, 0x1

    goto :goto_9

    :cond_a
    move v1, v5

    :goto_9
    if-eqz v1, :cond_10

    .line 4
    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x1

    goto :goto_a

    :cond_b
    move v1, v5

    :goto_a
    if-eqz v1, :cond_f

    .line 5
    invoke-static {v0, v5}, Lcom/airbnb/lottie/compose/c;->d(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;

    move-result-object v1

    const v2, -0x1d58f75c

    .line 6
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    invoke-interface/range {p10 .. p10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 8
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    const/4 v12, 0x2

    if-ne v2, v4, :cond_c

    .line 9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v8, v12, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    .line 10
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 11
    :cond_c
    invoke-interface/range {p10 .. p10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 12
    check-cast v2, Landroidx/compose/runtime/MutableState;

    const v4, -0xac3d772

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v9, :cond_d

    goto :goto_b

    .line 13
    :cond_d
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v4

    .line 14
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    .line 15
    invoke-static {v4}, Lcom/airbnb/lottie/utils/l;->f(Landroid/content/Context;)F

    move-result v4

    div-float/2addr v3, v4

    :goto_b
    invoke-interface/range {p10 .. p10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p0, v4, v5

    .line 16
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v8, 0x1

    aput-object v5, v4, v8

    aput-object v13, v4, v12

    const/4 v5, 0x3

    .line 17
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v4, v5

    .line 18
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v8, 0x4

    aput-object v5, v4, v8

    .line 19
    new-instance v12, Lcom/airbnb/lottie/compose/a$a;

    const/16 v17, 0x0

    move-object v5, v12

    move-object v8, v1

    move-object/from16 v9, p0

    move-object/from16 p1, v1

    move-object v1, v12

    move v12, v3

    move-object/from16 v16, v2

    invoke-direct/range {v5 .. v17}, Lcom/airbnb/lottie/compose/a$a;-><init>(ZZLcom/airbnb/lottie/compose/LottieAnimatable;Lcom/airbnb/lottie/k;IZFLcom/airbnb/lottie/compose/g;Lcom/airbnb/lottie/compose/f;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    const/16 v2, 0x48

    invoke-static {v4, v1, v0, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect([Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_e
    invoke-interface/range {p10 .. p10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p1

    .line 20
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Speed must be a finite number. It is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 21
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Iterations must be a positive number ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final d(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final e(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
