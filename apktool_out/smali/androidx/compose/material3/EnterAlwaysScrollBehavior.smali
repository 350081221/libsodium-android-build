.class final Landroidx/compose/material3/EnterAlwaysScrollBehavior;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/material3/TopAppBarScrollBehavior;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/material3/EnterAlwaysScrollBehavior;",
        "Landroidx/compose/material3/TopAppBarScrollBehavior;",
        "Landroidx/compose/material3/TopAppBarState;",
        "state",
        "Landroidx/compose/material3/TopAppBarState;",
        "getState",
        "()Landroidx/compose/material3/TopAppBarState;",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "snapAnimationSpec",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "getSnapAnimationSpec",
        "()Landroidx/compose/animation/core/AnimationSpec;",
        "Landroidx/compose/animation/core/DecayAnimationSpec;",
        "flingAnimationSpec",
        "Landroidx/compose/animation/core/DecayAnimationSpec;",
        "getFlingAnimationSpec",
        "()Landroidx/compose/animation/core/DecayAnimationSpec;",
        "Lkotlin/Function0;",
        "",
        "canScroll",
        "Lv3/a;",
        "getCanScroll",
        "()Lv3/a;",
        "isPinned",
        "Z",
        "()Z",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "nestedScrollConnection",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "getNestedScrollConnection",
        "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "setNestedScrollConnection",
        "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V",
        "<init>",
        "(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/a;)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final canScroll:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final flingAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final isPinned:Z

.field private nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final state:Landroidx/compose/material3/TopAppBarState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/a;)V
    .locals 0
    .param p1    # Landroidx/compose/material3/TopAppBarState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/animation/core/DecayAnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TopAppBarState;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->state:Landroidx/compose/material3/TopAppBarState;

    .line 3
    iput-object p2, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 4
    iput-object p3, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->flingAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 5
    iput-object p4, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->canScroll:Lv3/a;

    .line 6
    new-instance p1, Landroidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1;

    invoke-direct {p1, p0}, Landroidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1;-><init>(Landroidx/compose/material3/EnterAlwaysScrollBehavior;)V

    iput-object p1, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/a;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    sget-object p4, Landroidx/compose/material3/EnterAlwaysScrollBehavior$1;->INSTANCE:Landroidx/compose/material3/EnterAlwaysScrollBehavior$1;

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/EnterAlwaysScrollBehavior;-><init>(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/a;)V

    return-void
.end method


# virtual methods
.method public final getCanScroll()Lv3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->canScroll:Lv3/a;

    return-object v0
.end method

.method public getFlingAnimationSpec()Landroidx/compose/animation/core/DecayAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->flingAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    return-object v0
.end method

.method public getNestedScrollConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-object v0
.end method

.method public getSnapAnimationSpec()Landroidx/compose/animation/core/AnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    return-object v0
.end method

.method public getState()Landroidx/compose/material3/TopAppBarState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->state:Landroidx/compose/material3/TopAppBarState;

    return-object v0
.end method

.method public isPinned()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->isPinned:Z

    return v0
.end method

.method public setNestedScrollConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/material3/EnterAlwaysScrollBehavior;->nestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-void
.end method
