.class final Lkotlinx/coroutines/channels/d0;
.super Lkotlinx/coroutines/channels/m;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/channels/e0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/channels/m<",
        "TE;>;",
        "Lkotlinx/coroutines/channels/e0<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/d0;",
        "E",
        "Lkotlinx/coroutines/channels/m;",
        "Lkotlinx/coroutines/channels/e0;",
        "Lkotlin/r2;",
        "value",
        "y1",
        "(Lkotlin/r2;)V",
        "",
        "cause",
        "",
        "handled",
        "u1",
        "isActive",
        "()Z",
        "Lkotlin/coroutines/g;",
        "parentContext",
        "Lkotlinx/coroutines/channels/l;",
        "channel",
        "<init>",
        "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;)V",
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
.method public constructor <init>(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/channels/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g;",
            "Lkotlinx/coroutines/channels/l<",
            "TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, v0}, Lkotlinx/coroutines/channels/m;-><init>(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;ZZ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getChannel()Lkotlinx/coroutines/channels/h0;
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/channels/m;->getChannel()Lkotlinx/coroutines/channels/l;

    move-result-object v0

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    invoke-super {p0}, Lkotlinx/coroutines/a;->isActive()Z

    move-result v0

    return v0
.end method

.method protected u1(Ljava/lang/Throwable;Z)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/m;->x1()Lkotlinx/coroutines/channels/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/h0;->E(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lkotlinx/coroutines/a;->getContext()Lkotlin/coroutines/g;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2, p1}, Lkotlinx/coroutines/p0;->b(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public bridge synthetic v1(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lkotlin/r2;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/d0;->y1(Lkotlin/r2;)V

    return-void
.end method

.method protected y1(Lkotlin/r2;)V
    .locals 2
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Lkotlinx/coroutines/channels/m;->x1()Lkotlinx/coroutines/channels/l;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/channels/h0$a;->a(Lkotlinx/coroutines/channels/h0;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method
