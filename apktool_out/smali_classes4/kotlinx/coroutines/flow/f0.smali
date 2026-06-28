.class final Lkotlinx/coroutines/flow/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/i0;
.implements Lkotlinx/coroutines/flow/c;
.implements Lkotlinx/coroutines/flow/internal/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/i0<",
        "TT;>;",
        "Lkotlinx/coroutines/flow/c<",
        "TT;>;",
        "Lkotlinx/coroutines/flow/internal/r<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/f0;",
        "T",
        "Lkotlinx/coroutines/flow/i0;",
        "Lkotlinx/coroutines/flow/c;",
        "Lkotlinx/coroutines/flow/internal/r;",
        "Lkotlinx/coroutines/flow/j;",
        "collector",
        "",
        "collect",
        "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlin/coroutines/g;",
        "context",
        "",
        "capacity",
        "Lkotlinx/coroutines/channels/i;",
        "onBufferOverflow",
        "Lkotlinx/coroutines/flow/i;",
        "a",
        "Lkotlinx/coroutines/l2;",
        "Lkotlinx/coroutines/l2;",
        "job",
        "",
        "d",
        "()Ljava/util/List;",
        "replayCache",
        "flow",
        "<init>",
        "(Lkotlinx/coroutines/flow/i0;Lkotlinx/coroutines/l2;)V",
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
.field private final a:Lkotlinx/coroutines/l2;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final synthetic b:Lkotlinx/coroutines/flow/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/i0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/i0;Lkotlinx/coroutines/l2;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/flow/i0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/l2;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/i0<",
            "+TT;>;",
            "Lkotlinx/coroutines/l2;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/coroutines/flow/f0;->a:Lkotlinx/coroutines/l2;

    .line 5
    .line 6
    iput-object p1, p0, Lkotlinx/coroutines/flow/f0;->b:Lkotlinx/coroutines/flow/i0;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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


# virtual methods
.method public a(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;
    .locals 0
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
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/k0;->e(Lkotlinx/coroutines/flow/i0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;

    move-result-object p1

    return-object p1
.end method

.method public collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/flow/f0;->b:Lkotlinx/coroutines/flow/i0;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/i0;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/flow/f0;->b:Lkotlinx/coroutines/flow/i0;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/i0;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
