.class final Landroidx/compose/animation/AnimatedContentScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/AnimatedContentScope;
.implements Landroidx/compose/animation/AnimatedVisibilityScope;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J+\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011H\u0097\u0001R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068WX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/animation/AnimatedContentScopeImpl;",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
        "animatedVisibilityScope",
        "(Landroidx/compose/animation/AnimatedVisibilityScope;)V",
        "transition",
        "Landroidx/compose/animation/core/Transition;",
        "Landroidx/compose/animation/EnterExitState;",
        "getTransition",
        "()Landroidx/compose/animation/core/Transition;",
        "animateEnterExit",
        "Landroidx/compose/ui/Modifier;",
        "enter",
        "Landroidx/compose/animation/EnterTransition;",
        "exit",
        "Landroidx/compose/animation/ExitTransition;",
        "label",
        "",
        "animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/animation/AnimatedVisibilityScope;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/AnimatedVisibilityScope;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/AnimatedVisibilityScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentScopeImpl;->$$delegate_0:Landroidx/compose/animation/AnimatedVisibilityScope;

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
.method public animateEnterExit(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/EnterTransition;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/animation/ExitTransition;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/animation/ExperimentalAnimationApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentScopeImpl;->$$delegate_0:Landroidx/compose/animation/AnimatedVisibilityScope;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/animation/AnimatedVisibilityScope;->animateEnterExit(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public getTransition()Landroidx/compose/animation/core/Transition;
    .locals 1
    .annotation build Landroidx/compose/animation/ExperimentalAnimationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/Transition<",
            "Landroidx/compose/animation/EnterExitState;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentScopeImpl;->$$delegate_0:Landroidx/compose/animation/AnimatedVisibilityScope;

    invoke-interface {v0}, Landroidx/compose/animation/AnimatedVisibilityScope;->getTransition()Landroidx/compose/animation/core/Transition;

    move-result-object v0

    return-object v0
.end method
