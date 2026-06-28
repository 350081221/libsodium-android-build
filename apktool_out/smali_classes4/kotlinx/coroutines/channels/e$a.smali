.class final Lkotlinx/coroutines/channels/e$a;
.super Lkotlinx/coroutines/channels/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/channels/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/coroutines/channels/j<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/e$a;",
        "Lkotlinx/coroutines/channels/j;",
        "",
        "cause",
        "",
        "G1",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,414:1\n15#2:415\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n362#1:415\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic m:Lkotlinx/coroutines/channels/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/e$a;->m:Lkotlinx/coroutines/channels/e;

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/e;->J1()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lkotlinx/coroutines/channels/j;-><init>(ILv3/l;ILkotlin/jvm/internal/w;)V

    return-void
.end method


# virtual methods
.method public G1(Ljava/lang/Throwable;)Z
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/e$a;->m:Lkotlinx/coroutines/channels/e;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlinx/coroutines/channels/e;->G1(Lkotlinx/coroutines/channels/e;)Ljava/util/concurrent/locks/ReentrantLock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lkotlinx/coroutines/channels/e$a;->m:Lkotlinx/coroutines/channels/e;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static {v1, p0}, Lkotlinx/coroutines/channels/e;->I1(Lkotlinx/coroutines/channels/e;Lkotlinx/coroutines/channels/g0;)V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lkotlinx/coroutines/channels/j;->P(Ljava/lang/Throwable;)Z

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 20
    .line 21
    .line 22
    return p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw p1
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

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/e$a;->G1(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
