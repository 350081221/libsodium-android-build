.class public final Lkotlinx/coroutines/internal/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\u0008\u0012\u0004\u0012\u00028\u0000`\u0004\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000*\u001e\u0008\u0000\u0010\u0006\u001a\u0004\u0008\u0000\u0010\u0000\"\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/internal/t0;",
        "name",
        "Ljava/lang/ThreadLocal;",
        "Lkotlinx/coroutines/internal/CommonThreadLocal;",
        "b",
        "CommonThreadLocal",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a()V
    .locals 0

    return-void
.end method

.method public static final b(Lkotlinx/coroutines/internal/t0;)Ljava/lang/ThreadLocal;
    .locals 0
    .param p0    # Lkotlinx/coroutines/internal/t0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/internal/t0;",
            ")",
            "Ljava/lang/ThreadLocal<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p0, Ljava/lang/ThreadLocal;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-object p0
.end method
