.class public Lkotlinx/coroutines/internal/x;
.super Lkotlinx/coroutines/internal/z;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u000cJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\u0008\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0008J\u0006\u0010\t\u001a\u00020\u0008J\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/x;",
        "Lkotlinx/coroutines/internal/z;",
        "Lkotlinx/coroutines/internal/Node;",
        "T",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "block",
        "x",
        "",
        "z",
        "r",
        "A",
        "()V",
        "",
        "y",
        "()Z",
        "isEmpty",
        "o",
        "isRemoved",
        "<init>",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/z;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lkotlinx/coroutines/internal/z;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/z;->m()Lkotlinx/coroutines/internal/z;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0, v2, v3}, Lkotlinx/coroutines/internal/z;->w(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V

    .line 24
    .line 25
    .line 26
    move-object v2, v0

    .line 27
    move-object v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/z;->l()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v0, Lkotlinx/coroutines/internal/z;

    .line 37
    .line 38
    invoke-virtual {p0, v2, v0}, Lkotlinx/coroutines/internal/z;->w(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected r()Lkotlinx/coroutines/internal/z;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic s()Z
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/x;->z()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final synthetic x(Lv3/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lkotlinx/coroutines/internal/z;",
            ">(",
            "Lv3/l<",
            "-TT;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/z;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lkotlinx/coroutines/internal/z;

    .line 11
    .line 12
    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    const-string v2, "T"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->y(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    instance-of v1, v0, Lkotlinx/coroutines/internal/z;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/z;->m()Lkotlinx/coroutines/internal/z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
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

.method public final y()Z
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/z;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z()Ljava/lang/Void;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "head cannot be removed"

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
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
.end method
