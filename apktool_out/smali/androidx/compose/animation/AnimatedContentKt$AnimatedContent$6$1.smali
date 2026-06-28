.class final Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/AnimatedContentKt;->AnimatedContent(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/ui/Alignment;Lv3/l;Lv3/r;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "S",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/runtime/Composer;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n25#2:832\n36#2:839\n25#2:846\n1116#3,6:833\n1116#3,6:840\n1116#3,6:847\n1116#3,6:854\n1#4:853\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n*L\n710#1:832\n714#1:839\n721#1:846\n710#1:833,6\n714#1:840,6\n721#1:847,6\n739#1:854,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $content:Lv3/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/r<",
            "Landroidx/compose/animation/AnimatedContentScope;",
            "TS;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentlyVisible:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TS;>;"
        }
    .end annotation
.end field

.field final synthetic $rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl<",
            "TS;>;"
        }
    .end annotation
.end field

.field final synthetic $stateForContent:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field final synthetic $this_AnimatedContent:Landroidx/compose/animation/core/Transition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;"
        }
    .end annotation
.end field

.field final synthetic $transitionSpec:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "TS;>;",
            "Landroidx/compose/animation/ContentTransform;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Lv3/l;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lv3/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;TS;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "TS;>;",
            "Landroidx/compose/animation/ContentTransform;",
            ">;",
            "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl<",
            "TS;>;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TS;>;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/animation/AnimatedContentScope;",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    iput-object p2, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$transitionSpec:Lv3/l;

    iput-object p4, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    iput-object p5, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$currentlyVisible:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p6, p0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$content:Lv3/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object v0, p0

    move-object v9, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_2

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)"

    const v4, 0x34c9ce26

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$transitionSpec:Lv3/l;

    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    const v3, -0x1d58f75c

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 6
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_3

    .line 7
    invoke-interface {v1, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/compose/animation/ContentTransform;

    .line 8
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 9
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 10
    check-cast v4, Landroidx/compose/animation/ContentTransform;

    .line 11
    iget-object v1, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/animation/core/Transition$Segment;->getTargetState()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    iget-object v6, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    iget-object v7, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$transitionSpec:Lv3/l;

    iget-object v8, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    const v10, 0x44faf204

    invoke-interface {p1, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 12
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 13
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v1, :cond_4

    .line 14
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v10, v1, :cond_6

    .line 15
    :cond_4
    invoke-virtual {v2}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/animation/core/Transition$Segment;->getTargetState()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 16
    sget-object v1, Landroidx/compose/animation/ExitTransition;->Companion:Landroidx/compose/animation/ExitTransition$Companion;

    invoke-virtual {v1}, Landroidx/compose/animation/ExitTransition$Companion;->getNone()Landroidx/compose/animation/ExitTransition;

    move-result-object v1

    goto :goto_1

    .line 17
    :cond_5
    invoke-interface {v7, v8}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/animation/ContentTransform;

    invoke-virtual {v1}, Landroidx/compose/animation/ContentTransform;->getInitialContentExit()Landroidx/compose/animation/ExitTransition;

    move-result-object v1

    :goto_1
    move-object v10, v1

    .line 18
    invoke-interface {p1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 19
    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 20
    move-object v6, v10

    check-cast v6, Landroidx/compose/animation/ExitTransition;

    .line 21
    iget-object v1, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 22
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 23
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v3, v7, :cond_7

    .line 24
    new-instance v3, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;

    invoke-virtual {v2}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v3, v1}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;-><init>(Z)V

    .line 25
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 26
    :cond_7
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 27
    check-cast v3, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;

    .line 28
    invoke-virtual {v4}, Landroidx/compose/animation/ContentTransform;->getTargetContentEnter()Landroidx/compose/animation/EnterTransition;

    move-result-object v7

    .line 29
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 30
    new-instance v2, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$1;

    invoke-direct {v2, v4}, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$1;-><init>(Landroidx/compose/animation/ContentTransform;)V

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lv3/q;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 31
    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    iget-object v4, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    invoke-virtual {v4}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v3, v2}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;->setTarget(Z)V

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 32
    iget-object v1, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$this_AnimatedContent:Landroidx/compose/animation/core/Transition;

    .line 33
    new-instance v2, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$3;

    iget-object v4, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    invoke-direct {v2, v4}, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$3;-><init>(Ljava/lang/Object;)V

    const v4, 0x3221fd83

    .line 34
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    .line 35
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_8

    .line 36
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v8, v4, :cond_9

    .line 37
    :cond_8
    new-instance v8, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4$1;

    invoke-direct {v8, v6}, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4$1;-><init>(Landroidx/compose/animation/ExitTransition;)V

    .line 38
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 39
    :cond_9
    check-cast v8, Lv3/p;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v10, 0x0

    .line 40
    new-instance v4, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5;

    iget-object v5, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    iget-object v11, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$stateForContent:Ljava/lang/Object;

    iget-object v12, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$currentlyVisible:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v13, v0, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;->$content:Lv3/r;

    invoke-direct {v4, v5, v11, v12, v13}, Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5;-><init>(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Ljava/lang/Object;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lv3/r;)V

    const v5, -0x24ba65ea

    const/4 v11, 0x1

    invoke-static {p1, v5, v11, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v11

    const/high16 v12, 0xc00000

    const/16 v13, 0x40

    move-object v4, v7

    move-object v5, v6

    move-object v6, v8

    move-object v7, v10

    move-object v8, v11

    move-object v9, p1

    move v10, v12

    move v11, v13

    .line 41
    invoke-static/range {v1 .. v11}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedEnterExitImpl(Landroidx/compose/animation/core/Transition;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lv3/p;Landroidx/compose/animation/OnLookaheadMeasured;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    :goto_2
    return-void
.end method
