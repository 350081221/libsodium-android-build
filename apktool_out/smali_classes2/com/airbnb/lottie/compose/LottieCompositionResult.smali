.class public interface abstract Lcom/airbnb/lottie/compose/LottieCompositionResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "Lcom/airbnb/lottie/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008g\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0010\u001a\u00020\u0002H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0012\u0010\u000c\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\tR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieCompositionResult;",
        "Landroidx/compose/runtime/State;",
        "Lcom/airbnb/lottie/LottieComposition;",
        "error",
        "",
        "getError",
        "()Ljava/lang/Throwable;",
        "isComplete",
        "",
        "()Z",
        "isFailure",
        "isLoading",
        "isSuccess",
        "value",
        "getValue",
        "()Lcom/airbnb/lottie/LottieComposition;",
        "await",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract b(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/airbnb/lottie/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract d()Z
.end method

.method public abstract g()Z
.end method

.method public abstract getError()Ljava/lang/Throwable;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getValue()Lcom/airbnb/lottie/k;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract isSuccess()Z
.end method

.method public abstract j()Z
.end method
