.class public interface abstract Lcom/airbnb/lottie/compose/LottieAnimatable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/compose/LottieAnimationState;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/compose/LottieAnimatable$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008g\u0018\u00002\u00020\u0001J\u0081\u0001\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0018\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieAnimatable;",
        "Lcom/airbnb/lottie/compose/LottieAnimationState;",
        "animate",
        "",
        "composition",
        "Lcom/airbnb/lottie/LottieComposition;",
        "iteration",
        "",
        "iterations",
        "reverseOnRepeat",
        "",
        "speed",
        "",
        "clipSpec",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "initialProgress",
        "continueFromPreviousAnimate",
        "cancellationBehavior",
        "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;",
        "ignoreSystemAnimationsDisabled",
        "useCompositionFrameRate",
        "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "snapTo",
        "progress",
        "resetLastFrameNanos",
        "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract e(Lcom/airbnb/lottie/k;IIZFLcom/airbnb/lottie/compose/g;FZLcom/airbnb/lottie/compose/f;ZZLkotlin/coroutines/d;)Ljava/lang/Object;
    .param p1    # Lcom/airbnb/lottie/k;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Lcom/airbnb/lottie/compose/g;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lcom/airbnb/lottie/compose/f;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p12    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/k;",
            "IIZF",
            "Lcom/airbnb/lottie/compose/g;",
            "FZ",
            "Lcom/airbnb/lottie/compose/f;",
            "ZZ",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract p(Lcom/airbnb/lottie/k;FIZLkotlin/coroutines/d;)Ljava/lang/Object;
    .param p1    # Lcom/airbnb/lottie/k;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/k;",
            "FIZ",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method
