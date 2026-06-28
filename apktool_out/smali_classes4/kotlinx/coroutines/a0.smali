.class public final Lkotlinx/coroutines/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u00002\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/y;",
        "Lkotlin/d1;",
        "result",
        "",
        "d",
        "(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z",
        "Lkotlinx/coroutines/l2;",
        "parent",
        "b",
        "value",
        "a",
        "(Ljava/lang/Object;)Lkotlinx/coroutines/y;",
        "kotlinx-coroutines-core"
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
        "SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/Object;)Lkotlinx/coroutines/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lkotlinx/coroutines/y<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/z;-><init>(Lkotlinx/coroutines/l2;)V

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/z;->M(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static final b(Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/y;
    .locals 1
    .param p0    # Lkotlinx/coroutines/l2;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/l2;",
            ")",
            "Lkotlinx/coroutines/y<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/z;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/z;-><init>(Lkotlinx/coroutines/l2;)V

    return-object v0
.end method

.method public static synthetic c(Lkotlinx/coroutines/l2;ILjava/lang/Object;)Lkotlinx/coroutines/y;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lkotlinx/coroutines/a0;->b(Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/y;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z
    .locals 1
    .param p0    # Lkotlinx/coroutines/y;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/y<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    invoke-static {p1}, Lkotlin/d1;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lkotlinx/coroutines/y;->M(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lkotlinx/coroutines/y;->c(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method
