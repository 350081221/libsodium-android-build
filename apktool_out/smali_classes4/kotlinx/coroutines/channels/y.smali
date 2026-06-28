.class public final Lkotlinx/coroutines/channels/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/channels/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/d<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0008\u0002\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a\u00a2\u0006\u0004\u0008*\u0010+B\t\u0008\u0016\u00a2\u0006\u0004\u0008*\u0010,B\u0011\u0008\u0016\u0012\u0006\u0010\'\u001a\u00028\u0000\u00a2\u0006\u0004\u0008*\u0010-J\u0015\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0097\u0001J\u001b\u0010\n\u001a\u00020\t2\u0010\u0008\u0002\u0010\u0004\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\u0008H\u0096\u0001J\u0013\u0010\u0001\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J.\u0010\u000f\u001a\u00020\t2#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u0004\u0012\u0004\u0012\u00020\t0\u000bH\u0096\u0001J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00058\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR&\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000!0 8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0011\u0010\'\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00018\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010&\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006."
    }
    d2 = {
        "Lkotlinx/coroutines/channels/y;",
        "E",
        "Lkotlinx/coroutines/channels/d;",
        "",
        "cause",
        "",
        "a",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "Lkotlin/r2;",
        "cancel",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "handler",
        "I",
        "element",
        "offer",
        "(Ljava/lang/Object;)Z",
        "Lkotlinx/coroutines/channels/g0;",
        "n",
        "F",
        "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/p;",
        "p",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/e;",
        "Lkotlinx/coroutines/channels/e;",
        "broadcast",
        "G",
        "()Z",
        "isClosedForSend",
        "Lkotlinx/coroutines/selects/i;",
        "Lkotlinx/coroutines/channels/h0;",
        "l",
        "()Lkotlinx/coroutines/selects/i;",
        "onSend",
        "b",
        "()Ljava/lang/Object;",
        "value",
        "c",
        "valueOrNull",
        "<init>",
        "(Lkotlinx/coroutines/channels/e;)V",
        "()V",
        "(Ljava/lang/Object;)V",
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
    message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported"
.end annotation

.annotation build Lkotlinx/coroutines/c3;
.end annotation


# instance fields
.field private final a:Lkotlinx/coroutines/channels/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    new-instance v0, Lkotlinx/coroutines/channels/e;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lkotlinx/coroutines/channels/e;-><init>(I)V

    invoke-direct {p0, v0}, Lkotlinx/coroutines/channels/y;-><init>(Lkotlinx/coroutines/channels/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lkotlinx/coroutines/channels/y;-><init>()V

    .line 5
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/y;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lkotlinx/coroutines/channels/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/e<",
            "TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    return-void
.end method


# virtual methods
.method public E(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/e;->E(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/channels/e;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public G()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/e;->G()Z

    move-result v0

    return v0
.end method

.method public I(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/j;->I(Lv3/l;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Throwable;)Z
    .locals 1
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Binary compatibility only"
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/j;->a(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/e;->K1()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/e;->M1()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/j;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public l()Lkotlinx/coroutines/selects/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/selects/i<",
            "TE;",
            "Lkotlinx/coroutines/channels/h0<",
            "TE;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/j;->l()Lkotlinx/coroutines/selects/i;

    move-result-object v0

    return-object v0
.end method

.method public n()Lkotlinx/coroutines/channels/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/g0<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/e;->n()Lkotlinx/coroutines/channels/g0;

    move-result-object v0

    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/channels/y;->a:Lkotlinx/coroutines/channels/e;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/e;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
