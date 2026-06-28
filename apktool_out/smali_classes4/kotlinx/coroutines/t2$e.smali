.class final Lkotlinx/coroutines/t2$e;
.super Lkotlinx/coroutines/s2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlinx/coroutines/t2$e;",
        "Lkotlinx/coroutines/s2;",
        "",
        "cause",
        "Lkotlin/r2;",
        "x",
        "Lkotlinx/coroutines/selects/m;",
        "e",
        "Lkotlinx/coroutines/selects/m;",
        "select",
        "<init>",
        "(Lkotlinx/coroutines/t2;Lkotlinx/coroutines/selects/m;)V",
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
.field private final e:Lkotlinx/coroutines/selects/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/selects/m<",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field final synthetic f:Lkotlinx/coroutines/t2;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/t2;Lkotlinx/coroutines/selects/m;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/t2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/m<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/t2$e;->f:Lkotlinx/coroutines/t2;

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlinx/coroutines/s2;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/t2$e;->e:Lkotlinx/coroutines/selects/m;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/t2$e;->x(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lkotlinx/coroutines/t2$e;->e:Lkotlinx/coroutines/selects/m;

    iget-object v0, p0, Lkotlinx/coroutines/t2$e;->f:Lkotlinx/coroutines/t2;

    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/selects/m;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
