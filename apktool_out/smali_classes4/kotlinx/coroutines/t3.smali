.class public final Lkotlinx/coroutines/t3;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/l0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/l0<",
        "Lkotlinx/coroutines/t3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\u0008\u0000\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0011\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000cJ\u0008\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlinx/coroutines/t3;",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "Lkotlinx/coroutines/l0;",
        "createCopy",
        "Lkotlinx/coroutines/l2;",
        "coroutine",
        "Lkotlinx/coroutines/l2;",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;Lkotlinx/coroutines/l2;)V",
        "(Ljava/lang/String;)V",
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
        "SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"
    }
.end annotation


# instance fields
.field public final transient coroutine:Lkotlinx/coroutines/l2;
    .annotation build Lp4/m;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lkotlinx/coroutines/t3;-><init>(Ljava/lang/String;Lkotlinx/coroutines/l2;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlinx/coroutines/l2;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/l2;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lkotlinx/coroutines/t3;->coroutine:Lkotlinx/coroutines/l2;

    return-void
.end method


# virtual methods
.method public bridge synthetic createCopy()Ljava/lang/Throwable;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/t3;->createCopy()Lkotlinx/coroutines/t3;

    move-result-object v0

    return-object v0
.end method

.method public createCopy()Lkotlinx/coroutines/t3;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Lkotlinx/coroutines/t3;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    iget-object v2, p0, Lkotlinx/coroutines/t3;->coroutine:Lkotlinx/coroutines/l2;

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/t3;-><init>(Ljava/lang/String;Lkotlinx/coroutines/l2;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
