.class public final Lkotlinx/coroutines/debug/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkotlinx/coroutines/debug/internal/m;",
        "Lkotlin/coroutines/jvm/internal/e;",
        "Ljava/lang/StackTraceElement;",
        "getStackTraceElement",
        "a",
        "Lkotlin/coroutines/jvm/internal/e;",
        "getCallerFrame",
        "()Lkotlin/coroutines/jvm/internal/e;",
        "callerFrame",
        "b",
        "Ljava/lang/StackTraceElement;",
        "stackTraceElement",
        "<init>",
        "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V",
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
.field private final a:Lkotlin/coroutines/jvm/internal/e;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final b:Ljava/lang/StackTraceElement;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V
    .locals 0
    .param p1    # Lkotlin/coroutines/jvm/internal/e;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/StackTraceElement;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/debug/internal/m;->a:Lkotlin/coroutines/jvm/internal/e;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/debug/internal/m;->b:Ljava/lang/StackTraceElement;

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
.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/debug/internal/m;->a:Lkotlin/coroutines/jvm/internal/e;

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/debug/internal/m;->b:Ljava/lang/StackTraceElement;

    return-object v0
.end method
