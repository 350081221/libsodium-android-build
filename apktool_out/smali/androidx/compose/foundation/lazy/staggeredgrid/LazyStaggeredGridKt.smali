.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0089\u0001\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u00a2\u0006\u0002\u0008\u0015H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "state",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "slots",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "",
        "reverseLayout",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "flingBehavior",
        "userScrollEnabled",
        "Landroidx/compose/ui/unit/Dp;",
        "mainAxisSpacing",
        "crossAxisSpacing",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "content",
        "LazyStaggeredGrid-LJWHXA8",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;Landroidx/compose/runtime/Composer;III)V",
        "LazyStaggeredGrid",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,125:1\n154#2:126\n154#2:127\n154#2:128\n487#3,4:129\n491#3,2:137\n495#3:143\n25#4:133\n1116#5,3:134\n1119#5,3:140\n487#6:139\n74#7:144\n74#7:145\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n49#1:126\n57#1:127\n59#1:128\n66#1:129,4\n66#1:137,2\n66#1:143\n66#1:133\n66#1:134,3\n66#1:140,3\n66#1:139\n96#1:144\n104#1:145\n*E\n"
    }
.end annotation


# direct methods
.method public static final LazyStaggeredGrid-LJWHXA8(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;Landroidx/compose/runtime/Composer;III)V
    .locals 35
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "ZFF",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move/from16 v13, p13

    move/from16 v14, p14

    const v0, 0x112f08d6

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, v14, 0x8

    if-eqz v1, :cond_0

    .line 2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p3

    :goto_0
    and-int/lit8 v1, v14, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    int-to-float v1, v2

    .line 3
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 4
    invoke-static {v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, p4

    :goto_1
    and-int/lit8 v1, v14, 0x20

    if-eqz v1, :cond_2

    move v9, v2

    goto :goto_2

    :cond_2
    move/from16 v9, p5

    :goto_2
    and-int/lit8 v1, v14, 0x40

    const/4 v8, 0x6

    if-eqz v1, :cond_3

    .line 5
    sget-object v1, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    invoke-virtual {v1, v15, v8}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v1

    const v3, -0x380001

    and-int v3, p12, v3

    move-object/from16 v17, v1

    move v7, v3

    goto :goto_3

    :cond_3
    move-object/from16 v17, p6

    move/from16 v7, p12

    :goto_3
    and-int/lit16 v1, v14, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    move/from16 v18, v1

    goto :goto_4

    :cond_4
    move/from16 v18, p7

    :goto_4
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_5

    int-to-float v1, v2

    .line 6
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move/from16 v19, v1

    goto :goto_5

    :cond_5
    move/from16 v19, p8

    :goto_5
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_6

    int-to-float v1, v2

    .line 7
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move/from16 v20, v1

    goto :goto_6

    :cond_6
    move/from16 v20, p9

    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:61)"

    .line 8
    invoke-static {v0, v7, v13, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 9
    :cond_7
    sget-object v6, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    invoke-virtual {v6, v15, v8}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->overscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v5

    shl-int/lit8 v0, v13, 0x3

    and-int/lit8 v0, v0, 0x70

    const/16 v4, 0x8

    or-int/2addr v0, v4

    move-object/from16 v3, p10

    .line 10
    invoke-static {v11, v3, v15, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt;->rememberStaggeredGridItemProviderLambda(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lv3/l;Landroidx/compose/runtime/Composer;I)Lv3/a;

    move-result-object v21

    const v0, 0x2e20b340

    .line 11
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, -0x1d58f75c

    .line 12
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 13
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 14
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_8

    .line 15
    sget-object v0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 16
    invoke-static {v0, v15}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    move-result-object v0

    .line 17
    new-instance v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v1, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 18
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v0, v1

    .line 19
    :cond_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 20
    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 21
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    move-result-object v22

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    shr-int/lit8 v0, v7, 0x6

    and-int/lit16 v1, v0, 0x380

    const v2, 0x1000008

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x1c00

    or-int v0, v1, v2

    shl-int/lit8 v1, v7, 0x9

    const v23, 0xe000

    and-int v1, v1, v23

    or-int/2addr v0, v1

    shr-int/lit8 v24, v7, 0x9

    const/high16 v25, 0x70000

    and-int v1, v24, v25

    or-int/2addr v0, v1

    const/high16 v26, 0x380000

    and-int v1, v24, v26

    or-int/2addr v0, v1

    shl-int/lit8 v1, v7, 0x12

    const/high16 v27, 0xe000000

    and-int v1, v1, v27

    or-int v27, v0, v1

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move/from16 v28, v2

    move-object/from16 v2, v16

    move v3, v9

    move v13, v4

    move-object/from16 v4, p1

    move-object/from16 v29, v5

    move/from16 v5, v19

    move-object/from16 v30, v6

    move/from16 v6, v20

    move/from16 v31, v7

    move-object/from16 v7, v22

    move/from16 v22, v8

    move-object/from16 v8, p2

    move/from16 v32, v9

    move-object v9, v15

    move-object/from16 v33, v10

    move/from16 v10, v27

    .line 22
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->rememberStaggeredGridMeasurePolicy-1tP8Re8(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lv3/a;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/runtime/Composer;I)Lv3/p;

    move-result-object v27

    shr-int/lit8 v0, v31, 0xc

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v13

    move/from16 v10, v32

    .line 23
    invoke-static {v11, v10, v15, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt;->rememberLazyStaggeredGridSemanticState(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    move-result-object v2

    .line 24
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    move-result-object v0

    move-object/from16 v9, v33

    invoke-interface {v9, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 25
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shl-int/lit8 v1, v31, 0x6

    and-int/lit16 v1, v1, 0x1c00

    and-int v3, v24, v23

    or-int/2addr v1, v3

    and-int v3, v31, v25

    or-int v7, v1, v3

    move-object/from16 v1, v21

    move-object/from16 v3, p1

    move/from16 v4, v18

    move v5, v10

    move-object v6, v15

    .line 26
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lv3/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 27
    invoke-static {v0, v12}, Landroidx/compose/foundation/ClipScrollableContainerKt;->clipScrollableContainer(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 28
    invoke-static {v11, v15, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt;->rememberLazyStaggeredGridBeyondBoundsState(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    move-result-object v1

    .line 29
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v2

    .line 30
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    .line 31
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroidx/compose/ui/unit/LayoutDirection;

    .line 32
    sget v3, Landroidx/compose/runtime/collection/MutableVector;->$stable:I

    shl-int/lit8 v3, v3, 0x6

    or-int v3, v3, v28

    shl-int/lit8 v5, v31, 0xc

    and-int v5, v5, v25

    or-int/2addr v3, v5

    shr-int/lit8 v5, v31, 0x3

    and-int v5, v5, v26

    or-int v8, v3, v5

    move v3, v10

    move-object/from16 v5, p1

    move/from16 v6, v18

    move-object v7, v15

    .line 33
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v3, v29

    .line 34
    invoke-static {v0, v3}, Landroidx/compose/foundation/OverscrollKt;->overscroll(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 35
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    .line 36
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/unit/LayoutDirection;

    move-object/from16 v2, v30

    .line 37
    invoke-virtual {v2, v1, v12, v10}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->reverseDirection(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z

    move-result v5

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getMutableInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v13, 0x80

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, v18

    move-object/from16 v6, v17

    move-object/from16 v23, v9

    move v9, v13

    move v13, v10

    move-object/from16 v10, v22

    .line 39
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 40
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 p3, v21

    move-object/from16 p4, v0

    move-object/from16 p5, v1

    move-object/from16 p6, v27

    move-object/from16 p7, v15

    move/from16 p8, v2

    move/from16 p9, v3

    .line 41
    invoke-static/range {p3 .. p9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_a

    new-instance v10, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt$LazyStaggeredGrid$1;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, v23

    move-object/from16 v5, v16

    move v6, v13

    move-object/from16 v7, v17

    move/from16 v8, v18

    move/from16 v9, v19

    move-object v13, v10

    move/from16 v10, v20

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object/from16 v34, v13

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt$LazyStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;III)V

    move-object/from16 v0, v34

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_a
    return-void
.end method
