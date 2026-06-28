.class public final Lkotlinx/coroutines/channels/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "E",
        "",
        "capacity",
        "Lkotlinx/coroutines/channels/d;",
        "a",
        "Lkotlinx/coroutines/internal/t0;",
        "Lkotlinx/coroutines/internal/t0;",
        "NO_ELEMENT",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final a:Lkotlinx/coroutines/internal/t0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/t0;

    const-string v1, "NO_ELEMENT"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/channels/f;->a:Lkotlinx/coroutines/internal/t0;

    return-void
.end method

.method public static final a(I)Lkotlinx/coroutines/channels/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lkotlinx/coroutines/channels/d<",
            "TE;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->WARNING:Lkotlin/m;
        message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported"
    .end annotation

    .annotation build Lkotlinx/coroutines/c3;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, -0x2

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lkotlinx/coroutines/channels/e;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lkotlinx/coroutines/channels/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Unsupported UNLIMITED capacity for BroadcastChannel"

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string v0, "Unsupported 0 capacity for BroadcastChannel"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_2
    new-instance v0, Lkotlinx/coroutines/channels/y;

    .line 37
    .line 38
    invoke-direct {v0}, Lkotlinx/coroutines/channels/y;-><init>()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    new-instance v0, Lkotlinx/coroutines/channels/e;

    .line 43
    .line 44
    sget-object p0, Lkotlinx/coroutines/channels/l;->V:Lkotlinx/coroutines/channels/l$b;

    .line 45
    .line 46
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/l$b;->a()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-direct {v0, p0}, Lkotlinx/coroutines/channels/e;-><init>(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-object v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/t0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/channels/f;->a:Lkotlinx/coroutines/internal/t0;

    return-object v0
.end method
