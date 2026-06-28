.class public final Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;
.super Landroidx/compose/animation/core/TransitionState;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/animation/core/TransitionState<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0008\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0010\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;",
        "Landroidx/compose/animation/core/TransitionState;",
        "",
        "Landroidx/compose/animation/core/Transition;",
        "transition",
        "Lkotlin/r2;",
        "transitionConfigured$animation_core_release",
        "(Landroidx/compose/animation/core/Transition;)V",
        "transitionConfigured",
        "getCurrentState",
        "()Ljava/lang/Object;",
        "currentState",
        "getTargetState",
        "targetState",
        "<init>",
        "()V",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/animation/core/TransitionState;-><init>(Lkotlin/jvm/internal/w;)V

    return-void
.end method


# virtual methods
.method public getCurrentState()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTargetState()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public transitionConfigured$animation_core_release(Landroidx/compose/animation/core/Transition;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/Transition;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
