.class public final Lkotlinx/coroutines/flow/internal/i;
.super Lkotlinx/coroutines/flow/internal/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/flow/internal/h<",
        "TT;TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0014J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/internal/i;",
        "T",
        "Lkotlinx/coroutines/flow/internal/h;",
        "Lkotlin/coroutines/g;",
        "context",
        "",
        "capacity",
        "Lkotlinx/coroutines/channels/i;",
        "onBufferOverflow",
        "Lkotlinx/coroutines/flow/internal/e;",
        "i",
        "Lkotlinx/coroutines/flow/i;",
        "j",
        "Lkotlinx/coroutines/flow/j;",
        "collector",
        "Lkotlin/r2;",
        "r",
        "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "flow",
        "<init>",
        "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/flow/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/channels/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;",
            "Lkotlin/coroutines/g;",
            "I",
            "Lkotlinx/coroutines/channels/i;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/flow/internal/h;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, Lkotlinx/coroutines/channels/i;->SUSPEND:Lkotlinx/coroutines/channels/i;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/flow/internal/i;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-void
.end method


# virtual methods
.method protected i(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/e;
    .locals 2
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlinx/coroutines/channels/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g;",
            "I",
            "Lkotlinx/coroutines/channels/i;",
            ")",
            "Lkotlinx/coroutines/flow/internal/e<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/flow/internal/i;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/h;->d:Lkotlinx/coroutines/flow/i;

    invoke-direct {v0, v1, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/i;-><init>(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-object v0
.end method

.method public j()Lkotlinx/coroutines/flow/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/h;->d:Lkotlinx/coroutines/flow/i;

    return-object v0
.end method

.method protected r(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlinx/coroutines/flow/j;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/j<",
            "-TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/h;->d:Lkotlinx/coroutines/flow/i;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/i;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method
