.class public final Lkotlinx/coroutines/flow/internal/k;
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
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0019"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/internal/k;",
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
        "Lkotlinx/coroutines/flow/i;",
        "d",
        "Ljava/lang/Iterable;",
        "flows",
        "<init>",
        "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V
    .locals 0
    .param p1    # Ljava/lang/Iterable;
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
            "Ljava/lang/Iterable<",
            "+",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;>;",
            "Lkotlin/coroutines/g;",
            "I",
            "Lkotlinx/coroutines/channels/i;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p2, p3, p4}, Lkotlinx/coroutines/flow/internal/e;-><init>(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    .line 5
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/k;->d:Ljava/lang/Iterable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, Lkotlinx/coroutines/channels/i;->SUSPEND:Lkotlinx/coroutines/channels/i;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/flow/internal/k;-><init>(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-void
.end method


# virtual methods
.method protected h(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 8
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
    new-instance p2, Lkotlinx/coroutines/flow/internal/y;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lkotlinx/coroutines/flow/internal/y;-><init>(Lkotlinx/coroutines/channels/h0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/k;->d:Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lkotlinx/coroutines/flow/i;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    new-instance v5, Lkotlinx/coroutines/flow/internal/k$a;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v5, v1, p2, v2}, Lkotlinx/coroutines/flow/internal/k$a;-><init>(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/internal/y;Lkotlin/coroutines/d;)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x0

    .line 34
    move-object v2, p1

    .line 35
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 40
    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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

    new-instance v0, Lkotlinx/coroutines/flow/internal/k;

    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/k;->d:Ljava/lang/Iterable;

    invoke-direct {v0, v1, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/k;-><init>(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V

    return-object v0
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
