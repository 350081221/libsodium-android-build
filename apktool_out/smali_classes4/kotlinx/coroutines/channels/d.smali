.class public interface abstract Lkotlinx/coroutines/channels/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/channels/h0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/channels/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/h0<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008g\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\u00082\u0010\u0008\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/d;",
        "E",
        "Lkotlinx/coroutines/channels/h0;",
        "Lkotlinx/coroutines/channels/g0;",
        "n",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "cause",
        "Lkotlin/r2;",
        "cancel",
        "",
        "",
        "a",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/k;
    level = .enum Lkotlin/m;->WARNING:Lkotlin/m;
    message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported"
.end annotation

.annotation build Lkotlinx/coroutines/c3;
.end annotation


# virtual methods
.method public abstract synthetic a(Ljava/lang/Throwable;)Z
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Binary compatibility only"
    .end annotation
.end method

.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract n()Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/g0<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method
