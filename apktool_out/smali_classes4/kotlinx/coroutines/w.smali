.class public final Lkotlinx/coroutines/w;
.super Lkotlinx/coroutines/n2;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/v;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlinx/coroutines/w;",
        "Lkotlinx/coroutines/n2;",
        "Lkotlinx/coroutines/v;",
        "",
        "cause",
        "Lkotlin/r2;",
        "x",
        "",
        "e",
        "Lkotlinx/coroutines/x;",
        "Lkotlinx/coroutines/x;",
        "childJob",
        "Lkotlinx/coroutines/l2;",
        "getParent",
        "()Lkotlinx/coroutines/l2;",
        "parent",
        "<init>",
        "(Lkotlinx/coroutines/x;)V",
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
.field public final e:Lkotlinx/coroutines/x;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/x;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/x;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/n2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/w;->e:Lkotlinx/coroutines/x;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public e(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Lkotlinx/coroutines/s2;->y()Lkotlinx/coroutines/t2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/t2;->h0(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()Lkotlinx/coroutines/l2;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lkotlinx/coroutines/s2;->y()Lkotlinx/coroutines/t2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/w;->x(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lkotlinx/coroutines/w;->e:Lkotlinx/coroutines/x;

    invoke-virtual {p0}, Lkotlinx/coroutines/s2;->y()Lkotlinx/coroutines/t2;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/x;->A(Lkotlinx/coroutines/d3;)V

    return-void
.end method
