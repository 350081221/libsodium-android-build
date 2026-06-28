.class public final Landroidx/compose/ui/layout/SubcomposeLayoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000?\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0004*\u0001\u0012\u001a8\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0002\u0008\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a@\u0010\t\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0002\u0008\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\r\u001a\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/u;",
        "measurePolicy",
        "Lkotlin/r2;",
        "SubcomposeLayout",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/layout/SubcomposeLayoutState;",
        "state",
        "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "",
        "maxSlotsToRetainForReuse",
        "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;",
        "SubcomposeSlotReusePolicy",
        "androidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1",
        "ReusedSlotId",
        "Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;",
        "ui_release"
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
        "SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,987:1\n25#2:988\n286#2,8:995\n294#2,2:1009\n1116#3,6:989\n3737#4,6:1003\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n77#1:988\n114#1:995,8\n114#1:1009,2\n77#1:989,6\n123#1:1003,6\n*E\n"
    }
.end annotation


# static fields
.field private static final ReusedSlotId:Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;

    invoke-direct {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;-><init>()V

    sput-object v0, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->ReusedSlotId:Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;

    return-void
.end method

.method public static final SubcomposeLayout(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
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
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "-",
            "Landroidx/compose/ui/unit/Constraints;",
            "+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const v0, -0x4d634bd0    # -1.824273E-8f

    .line 1
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    .line 2
    :cond_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    .line 3
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :cond_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v3, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)"

    .line 4
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_9
    const v0, -0x1d58f75c

    .line 5
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 7
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    .line 8
    new-instance v0, Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-direct {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;-><init>()V

    .line 9
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 10
    :cond_a
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/layout/SubcomposeLayoutState;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit8 v2, v0, 0x70

    or-int/lit8 v2, v2, 0x8

    and-int/lit16 v0, v0, 0x380

    or-int v5, v2, v0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    .line 11
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->SubcomposeLayout(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 12
    :cond_b
    :goto_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$2;

    invoke-direct {v0, p0, p1, p3, p4}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$2;-><init>(Landroidx/compose/ui/Modifier;Lv3/p;II)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_c
    return-void
.end method

.method public static final SubcomposeLayout(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .param p0    # Landroidx/compose/ui/layout/SubcomposeLayoutState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/ui/UiComposable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/SubcomposeLayoutState;",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "-",
            "Landroidx/compose/ui/unit/Constraints;",
            "+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const v0, -0x1e845847

    .line 13
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_0

    .line 14
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :cond_0
    move-object v3, p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string v1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)"

    .line 15
    invoke-static {v0, p4, p1, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    .line 16
    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 17
    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposablesKt;->rememberCompositionContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;

    move-result-object v1

    .line 18
    invoke-static {p3, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 19
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 20
    sget-object v5, Landroidx/compose/ui/node/LayoutNode;->Companion:Landroidx/compose/ui/node/LayoutNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode$Companion;->getConstructor$ui_release()Lv3/a;

    move-result-object v5

    const v6, 0x53ca7ea5

    .line 21
    invoke-interface {p3, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 22
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v6

    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    if-nez v6, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 23
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 24
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 25
    new-instance v6, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$$inlined$ReusableComposeNode$1;

    invoke-direct {v6, v5}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$$inlined$ReusableComposeNode$1;-><init>(Lv3/a;)V

    invoke-interface {p3, v6}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    goto :goto_0

    .line 26
    :cond_3
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 27
    :goto_0
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .line 28
    invoke-virtual {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->getSetRoot$ui_release()Lv3/p;

    move-result-object v6

    invoke-static {v5, p0, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 29
    invoke-virtual {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->getSetCompositionContext$ui_release()Lv3/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->getSetMeasurePolicy$ui_release()Lv3/p;

    move-result-object v1

    invoke-static {v5, p2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 31
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    move-result-object v6

    invoke-static {v5, v4, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 32
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lv3/p;

    move-result-object v4

    invoke-static {v5, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 33
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    move-result-object v1

    .line 34
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 35
    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 37
    :cond_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 38
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_6

    .line 39
    new-instance v0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$4;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$4;-><init>(Landroidx/compose/ui/layout/SubcomposeLayoutState;)V

    invoke-static {v0, p3, p1}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    :cond_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p3, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;

    move-object v1, p3

    move-object v2, p0

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;-><init>(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lv3/p;II)V

    invoke-interface {p1, p3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_8
    return-void
.end method

.method public static final SubcomposeSlotReusePolicy(I)Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;-><init>(I)V

    return-object v0
.end method

.method public static final synthetic access$getReusedSlotId$p()Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;
    .locals 1

    sget-object v0, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->ReusedSlotId:Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;

    return-object v0
.end method
