.class public final Landroidx/compose/ui/node/IntrinsicsPolicy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/ui/node/IntrinsicsPolicy;",
        "",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "measurePolicyFromState",
        "measurePolicy",
        "Lkotlin/r2;",
        "updateFrom",
        "",
        "height",
        "minIntrinsicWidth",
        "width",
        "minIntrinsicHeight",
        "maxIntrinsicWidth",
        "maxIntrinsicHeight",
        "minLookaheadIntrinsicWidth",
        "minLookaheadIntrinsicHeight",
        "maxLookaheadIntrinsicWidth",
        "maxLookaheadIntrinsicHeight",
        "Landroidx/compose/ui/node/LayoutNode;",
        "layoutNode",
        "Landroidx/compose/ui/node/LayoutNode;",
        "getLayoutNode",
        "()Landroidx/compose/ui/node/LayoutNode;",
        "<set-?>",
        "measurePolicyState$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getMeasurePolicyState",
        "()Landroidx/compose/ui/layout/MeasurePolicy;",
        "setMeasurePolicyState",
        "(Landroidx/compose/ui/layout/MeasurePolicy;)V",
        "measurePolicyState",
        "<init>",
        "(Landroidx/compose/ui/node/LayoutNode;)V",
        "Companion",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final NoPolicyError:Ljava/lang/String; = "Intrinsic size is queried but there is no measure policy in place."
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final layoutNode:Landroidx/compose/ui/node/LayoutNode;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final measurePolicyState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/ui/node/IntrinsicsPolicy;->Companion:Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/node/IntrinsicsPolicy;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {p1, p1, v0, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyState$delegate:Landroidx/compose/runtime/MutableState;

    .line 13
    .line 14
    return-void
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
.end method

.method private final getMeasurePolicyState()Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 2

    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->getMeasurePolicyState()Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Intrinsic size is queried but there is no measure policy in place."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final setMeasurePolicyState(Landroidx/compose/ui/layout/MeasurePolicy;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final getLayoutNode()Landroidx/compose/ui/node/LayoutNode;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    return-object v0
.end method

.method public final maxIntrinsicHeight(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final maxIntrinsicWidth(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final maxLookaheadIntrinsicHeight(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildLookaheadMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final maxLookaheadIntrinsicWidth(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildLookaheadMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final minIntrinsicHeight(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final minIntrinsicWidth(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final minLookaheadIntrinsicHeight(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildLookaheadMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final minLookaheadIntrinsicWidth(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/IntrinsicsPolicy;->measurePolicyFromState()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/compose/ui/node/IntrinsicsPolicy;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getChildLookaheadMeasurables$ui_release()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2, p1}, Landroidx/compose/ui/layout/MeasurePolicy;->minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final updateFrom(Landroidx/compose/ui/layout/MeasurePolicy;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/MeasurePolicy;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/ui/node/IntrinsicsPolicy;->setMeasurePolicyState(Landroidx/compose/ui/layout/MeasurePolicy;)V

    return-void
.end method
