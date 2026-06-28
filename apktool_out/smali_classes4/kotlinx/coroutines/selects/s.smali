.class public final Lkotlinx/coroutines/selects/s;
.super Lkotlinx/coroutines/selects/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/selects/t<",
        "TR;>;"
    }
.end annotation

.annotation build Lkotlin/a1;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlinx/coroutines/selects/s;",
        "R",
        "Lkotlinx/coroutines/selects/t;",
        "",
        "Q",
        "",
        "e",
        "Lkotlin/r2;",
        "P",
        "Lkotlinx/coroutines/q;",
        "h",
        "Lkotlinx/coroutines/q;",
        "cont",
        "Lkotlin/coroutines/d;",
        "uCont",
        "<init>",
        "(Lkotlin/coroutines/d;)V",
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
.field private final h:Lkotlinx/coroutines/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/q<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;)V
    .locals 2
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lkotlinx/coroutines/selects/t;-><init>(Lkotlin/coroutines/g;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lkotlinx/coroutines/q;

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p1, v1}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    .line 19
    .line 20
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
.end method

.method public static final synthetic O(Lkotlinx/coroutines/selects/s;)Lkotlinx/coroutines/q;
    .locals 0

    iget-object p0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    return-object p0
.end method


# virtual methods
.method public final P(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    sget-object v1, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    invoke-static {p1}, Lkotlin/e1;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final Q()Ljava/lang/Object;
    .locals 7
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/l;->getContext()Lkotlin/coroutines/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    sget-object v3, Lkotlinx/coroutines/u0;->UNDISPATCHED:Lkotlinx/coroutines/u0;

    .line 26
    .line 27
    new-instance v4, Lkotlinx/coroutines/selects/s$a;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {v4, p0, v0}, Lkotlinx/coroutines/selects/s$a;-><init>(Lkotlinx/coroutines/selects/s;Lkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lkotlinx/coroutines/selects/s;->h:Lkotlinx/coroutines/q;

    .line 39
    .line 40
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
    .line 45
.end method
