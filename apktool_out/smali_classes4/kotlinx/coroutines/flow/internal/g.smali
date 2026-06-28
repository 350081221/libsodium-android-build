.class public final Lkotlinx/coroutines/flow/internal/g;
.super Lkotlinx/coroutines/flow/internal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/flow/internal/e<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/internal/g;",
        "T",
        "Lkotlinx/coroutines/flow/internal/e;",
        "Lkotlin/coroutines/g;",
        "context",
        "",
        "capacity",
        "Lkotlinx/coroutines/channels/i;",
        "onBufferOverflow",
        "i",
        "Lkotlinx/coroutines/s0;",
        "scope",
        "Lkotlinx/coroutines/channels/g0;",
        "m",
        "Lkotlinx/coroutines/channels/e0;",
        "Lkotlin/r2;",
        "h",
        "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "e",
        "Lkotlinx/coroutines/flow/i;",
        "d",
        "Lkotlinx/coroutines/flow/i;",
        "flow",
        "I",
        "concurrency",
        "<init>",
        "(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final d:Lkotlinx/coroutines/flow/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i<",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final e:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/flow/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lkotlinx/coroutines/channels/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/i<",
            "+",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;>;I",
            "Lkotlin/coroutines/g;",
            "I",
            "Lkotlinx/coroutines/channels/i;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p3, p4, p5}, Lkotlinx/coroutines/flow/internal/e;-><init>(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    .line 5
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/g;->d:Lkotlinx/coroutines/flow/i;

    .line 6
    iput p2, p0, Lkotlinx/coroutines/flow/internal/g;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;ILkotlin/jvm/internal/w;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x2

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, Lkotlinx/coroutines/channels/i;->SUSPEND:Lkotlinx/coroutines/channels/i;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 3
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/internal/g;-><init>(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "concurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lkotlinx/coroutines/flow/internal/g;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected h(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlinx/coroutines/channels/e0;
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
            "Lkotlinx/coroutines/channels/e0<",
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

    .line 1
    iget v0, p0, Lkotlinx/coroutines/flow/internal/g;->e:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v0, v3, v1, v2}, Lkotlinx/coroutines/sync/f;->b(IIILjava/lang/Object;)Lkotlinx/coroutines/sync/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lkotlinx/coroutines/flow/internal/y;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lkotlinx/coroutines/flow/internal/y;-><init>(Lkotlinx/coroutines/channels/h0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lkotlinx/coroutines/l2;->U:Lkotlinx/coroutines/l2$b;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lkotlinx/coroutines/l2;

    .line 26
    .line 27
    iget-object v3, p0, Lkotlinx/coroutines/flow/internal/g;->d:Lkotlinx/coroutines/flow/i;

    .line 28
    .line 29
    new-instance v4, Lkotlinx/coroutines/flow/internal/g$a;

    .line 30
    .line 31
    invoke-direct {v4, v2, v0, p1, v1}, Lkotlinx/coroutines/flow/internal/g$a;-><init>(Lkotlinx/coroutines/l2;Lkotlinx/coroutines/sync/d;Lkotlinx/coroutines/channels/e0;Lkotlinx/coroutines/flow/internal/y;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3, v4, p2}, Lkotlinx/coroutines/flow/i;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-ne p1, p2, :cond_0

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 46
    .line 47
    return-object p1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method protected i(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/e;
    .locals 7
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

    new-instance v6, Lkotlinx/coroutines/flow/internal/g;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/g;->d:Lkotlinx/coroutines/flow/i;

    iget v2, p0, Lkotlinx/coroutines/flow/internal/g;->e:I

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/internal/g;-><init>(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-object v6
.end method

.method public m(Lkotlinx/coroutines/s0;)Lkotlinx/coroutines/channels/g0;
    .locals 3
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            ")",
            "Lkotlinx/coroutines/channels/g0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/e;->a:Lkotlin/coroutines/g;

    iget v1, p0, Lkotlinx/coroutines/flow/internal/e;->b:I

    invoke-virtual {p0}, Lkotlinx/coroutines/flow/internal/e;->k()Lv3/p;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lkotlinx/coroutines/channels/c0;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILv3/p;)Lkotlinx/coroutines/channels/g0;

    move-result-object p1

    return-object p1
.end method
