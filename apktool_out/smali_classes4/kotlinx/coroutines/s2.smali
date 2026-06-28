.class public abstract Lkotlinx/coroutines/s2;
.super Lkotlinx/coroutines/f0;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/n1;
.implements Lkotlinx/coroutines/e2;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008 \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\u00088\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lkotlinx/coroutines/s2;",
        "Lkotlinx/coroutines/f0;",
        "Lkotlinx/coroutines/n1;",
        "Lkotlinx/coroutines/e2;",
        "Lkotlin/r2;",
        "dispose",
        "",
        "toString",
        "Lkotlinx/coroutines/t2;",
        "d",
        "Lkotlinx/coroutines/t2;",
        "y",
        "()Lkotlinx/coroutines/t2;",
        "z",
        "(Lkotlinx/coroutines/t2;)V",
        "job",
        "",
        "isActive",
        "()Z",
        "Lkotlinx/coroutines/y2;",
        "a",
        "()Lkotlinx/coroutines/y2;",
        "list",
        "<init>",
        "()V",
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
.field public d:Lkotlinx/coroutines/t2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lkotlinx/coroutines/y2;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public dispose()V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/s2;->y()Lkotlinx/coroutines/t2;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/t2;->g1(Lkotlinx/coroutines/s2;)V

    return-void
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lkotlinx/coroutines/x0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlinx/coroutines/x0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlinx/coroutines/s2;->y()Lkotlinx/coroutines/t2;

    move-result-object v1

    invoke-static {v1}, Lkotlinx/coroutines/x0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()Lkotlinx/coroutines/t2;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/s2;->d:Lkotlinx/coroutines/t2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final z(Lkotlinx/coroutines/t2;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/t2;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Lkotlinx/coroutines/s2;->d:Lkotlinx/coroutines/t2;

    return-void
.end method
