.class final Lkotlinx/coroutines/o1;
.super Lkotlinx/coroutines/n;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkotlinx/coroutines/o1;",
        "Lkotlinx/coroutines/n;",
        "",
        "cause",
        "Lkotlin/r2;",
        "j",
        "",
        "toString",
        "Lkotlinx/coroutines/n1;",
        "a",
        "Lkotlinx/coroutines/n1;",
        "handle",
        "<init>",
        "(Lkotlinx/coroutines/n1;)V",
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
.field private final a:Lkotlinx/coroutines/n1;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/n1;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/n1;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0}, Lkotlinx/coroutines/n;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/o1;->a:Lkotlinx/coroutines/n1;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/o1;->j(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public j(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lkotlinx/coroutines/o1;->a:Lkotlinx/coroutines/n1;

    invoke-interface {p1}, Lkotlinx/coroutines/n1;->dispose()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisposeOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlinx/coroutines/o1;->a:Lkotlinx/coroutines/n1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
