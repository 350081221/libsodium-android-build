.class final Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/compose/ConstraintSet;
.implements Landroidx/compose/runtime/RememberObserver;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\'\u0010(J\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0008\u0010\u000c\u001a\u00020\u0008H\u0016J\u0008\u0010\r\u001a\u00020\u0008H\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;",
        "Landroidx/constraintlayout/compose/ConstraintSet;",
        "Landroidx/compose/runtime/RememberObserver;",
        "Landroidx/constraintlayout/compose/State;",
        "state",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurables",
        "Lkotlin/r2;",
        "applyTo",
        "",
        "isDirty",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "Landroidx/constraintlayout/compose/ConstraintLayoutScope;",
        "scope",
        "Landroidx/constraintlayout/compose/ConstraintLayoutScope;",
        "getScope",
        "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "observer",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "knownDirty",
        "Z",
        "getKnownDirty",
        "()Z",
        "setKnownDirty",
        "(Z)V",
        "Lkotlin/Function1;",
        "onCommitAffectingConstrainLambdas",
        "Lv3/l;",
        "",
        "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;",
        "previousDatas",
        "Ljava/util/List;",
        "<init>",
        "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private handler:Landroid/os/Handler;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private knownDirty:Z

.field private final observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onCommitAffectingConstrainLambdas:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lkotlin/r2;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final previousDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final scope:Landroidx/constraintlayout/compose/ConstraintLayoutScope;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/compose/ConstraintLayoutScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->scope:Landroidx/constraintlayout/compose/ConstraintLayoutScope;

    .line 10
    .line 11
    new-instance p1, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 12
    .line 13
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$observer$1;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$observer$1;-><init>(Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;-><init>(Lv3/l;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->knownDirty:Z

    .line 25
    .line 26
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1;-><init>(Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->onCommitAffectingConstrainLambdas:Lv3/l;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->previousDatas:Ljava/util/List;

    .line 39
    .line 40
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic access$getHandler$p(Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getPreviousDatas$p(Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->previousDatas:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$setHandler$p(Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V
    .locals 4
    .param p1    # Landroidx/constraintlayout/compose/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/State;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->scope:Landroidx/constraintlayout/compose/ConstraintLayoutScope;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->applyTo(Landroidx/constraintlayout/compose/State;)V

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->previousDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    iget-object v2, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->onCommitAffectingConstrainLambdas:Lv3/l;

    new-instance v3, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$applyTo$1;

    invoke-direct {v3, p2, p1, p0}, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl$applyTo$1;-><init>(Ljava/util/List;Landroidx/constraintlayout/compose/State;Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;)V

    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->observeReads(Ljava/lang/Object;Lv3/l;Lv3/a;)V

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->knownDirty:Z

    return-void
.end method

.method public applyTo(Landroidx/constraintlayout/core/state/Transition;I)V
    .locals 0
    .param p1    # Landroidx/constraintlayout/core/state/Transition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintSet$DefaultImpls;->applyTo(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/core/state/Transition;I)V

    return-void
.end method

.method public final getKnownDirty()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->knownDirty:Z

    return v0
.end method

.method public final getScope()Landroidx/constraintlayout/compose/ConstraintLayoutScope;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->scope:Landroidx/constraintlayout/compose/ConstraintLayoutScope;

    return-object v0
.end method

.method public isDirty(Ljava/util/List;)Z
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "measurables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->knownDirty:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->previousDatas:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-ltz v0, :cond_4

    .line 32
    .line 33
    move v3, v2

    .line 34
    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 35
    .line 36
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .line 41
    .line 42
    invoke-interface {v5}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    instance-of v6, v5, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;

    .line 47
    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    check-cast v5, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v5, 0x0

    .line 54
    :goto_1
    iget-object v6, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->previousDatas:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v5, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    return v1

    .line 67
    :cond_2
    if-le v4, v0, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v3, v4

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    :goto_2
    return v2

    .line 73
    :cond_5
    :goto_3
    return v1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onAbandoned()V
    .locals 0

    return-void
.end method

.method public onForgotten()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public onRemembered()V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->observer:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->start()V

    return-void
.end method

.method public override(Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintSet$DefaultImpls;->override(Landroidx/constraintlayout/compose/ConstraintSet;Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;

    move-result-object p1

    return-object p1
.end method

.method public final setKnownDirty(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;->knownDirty:Z

    return-void
.end method
