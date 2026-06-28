.class final Lkotlinx/coroutines/channels/e$b;
.super Lkotlinx/coroutines/channels/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/channels/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/coroutines/channels/z<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/e$b;",
        "Lkotlinx/coroutines/channels/z;",
        "",
        "cause",
        "",
        "L1",
        "<init>",
        "(Lkotlinx/coroutines/channels/e;)V",
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
.field final synthetic o:Lkotlinx/coroutines/channels/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/e$b;->o:Lkotlinx/coroutines/channels/e;

    const/4 v1, 0x1

    sget-object v2, Lkotlinx/coroutines/channels/i;->DROP_OLDEST:Lkotlinx/coroutines/channels/i;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/channels/z;-><init>(ILkotlinx/coroutines/channels/i;Lv3/l;ILkotlin/jvm/internal/w;)V

    return-void
.end method


# virtual methods
.method public L1(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/e$b;->o:Lkotlinx/coroutines/channels/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lkotlinx/coroutines/channels/e;->I1(Lkotlinx/coroutines/channels/e;Lkotlinx/coroutines/channels/g0;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lkotlinx/coroutines/channels/j;->P(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public bridge synthetic P(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/e$b;->L1(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
