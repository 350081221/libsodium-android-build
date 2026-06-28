.class public interface abstract Lcom/airbnb/lottie/compose/LottieAnimationState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/compose/LottieAnimationState$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u000c\u0008g\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\rR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\rR\u0012\u0010\u001e\u001a\u00020\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001bR\u0012\u0010 \u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\r\u00a8\u0006\""
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieAnimationState;",
        "Landroidx/compose/runtime/State;",
        "",
        "clipSpec",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "getClipSpec",
        "()Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "composition",
        "Lcom/airbnb/lottie/LottieComposition;",
        "getComposition",
        "()Lcom/airbnb/lottie/LottieComposition;",
        "isAtEnd",
        "",
        "()Z",
        "isPlaying",
        "iteration",
        "",
        "getIteration",
        "()I",
        "iterations",
        "getIterations",
        "lastFrameNanos",
        "",
        "getLastFrameNanos",
        "()J",
        "progress",
        "getProgress",
        "()F",
        "reverseOnRepeat",
        "getReverseOnRepeat",
        "speed",
        "getSpeed",
        "useCompositionFrameRate",
        "getUseCompositionFrameRate",
        "lottie-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Z
.end method

.method public abstract f()Z
.end method

.method public abstract getComposition()Lcom/airbnb/lottie/k;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getProgress()F
.end method

.method public abstract i()J
.end method

.method public abstract k()Z
.end method

.method public abstract l()I
.end method

.method public abstract m()F
.end method

.method public abstract n()I
.end method

.method public abstract o()Z
.end method

.method public abstract q()Lcom/airbnb/lottie/compose/g;
    .annotation build Lp4/m;
    .end annotation
.end method
