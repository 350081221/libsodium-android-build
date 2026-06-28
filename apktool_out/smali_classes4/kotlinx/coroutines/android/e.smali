.class public abstract Lkotlinx/coroutines/android/e;
.super Lkotlinx/coroutines/x2;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/c1;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0001\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkotlinx/coroutines/android/e;",
        "Lkotlinx/coroutines/x2;",
        "Lkotlinx/coroutines/c1;",
        "E0",
        "()Lkotlinx/coroutines/android/e;",
        "immediate",
        "<init>",
        "()V",
        "Lkotlinx/coroutines/android/d;",
        "kotlinx-coroutines-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/x2;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/android/e;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract E0()Lkotlinx/coroutines/android/e;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public I(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/n1;
    .locals 0
    .param p3    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/c1$a;->b(Lkotlinx/coroutines/c1;JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/n1;

    move-result-object p1

    return-object p1
.end method

.method public p0(JLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Deprecated without replacement as an internal method never intended for public use"
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/c1$a;->a(Lkotlinx/coroutines/c1;JLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
