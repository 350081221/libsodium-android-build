.class public final Lkotlin/coroutines/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "getPolymorphicElement",
        "E",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "key",
        "Lkotlin/coroutines/CoroutineContext$Key;",
        "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;",
        "minusPolymorphicKey",
        "Lkotlin/coroutines/CoroutineContext;",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;
    .locals 2
    .param p0    # Lkotlin/coroutines/g$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/g$b;",
            ">(",
            "Lkotlin/coroutines/g$b;",
            "Lkotlin/coroutines/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lkotlin/r;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, Lkotlin/coroutines/b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Lkotlin/coroutines/b;

    .line 17
    .line 18
    invoke-interface {p0}, Lkotlin/coroutines/g$b;->getKey()Lkotlin/coroutines/g$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Lkotlin/coroutines/b;->a(Lkotlin/coroutines/g$c;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lkotlin/coroutines/b;->b(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    instance-of p1, p0, Lkotlin/coroutines/g$b;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    move-object v1, p0

    .line 37
    :cond_0
    return-object v1

    .line 38
    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/g$b;->getKey()Lkotlin/coroutines/g$c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne v0, p1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object p0, v1

    .line 46
    :goto_0
    return-object p0
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static final b(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;
    .locals 1
    .param p0    # Lkotlin/coroutines/g$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g$b;",
            "Lkotlin/coroutines/g$c<",
            "*>;)",
            "Lkotlin/coroutines/g;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lkotlin/r;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, Lkotlin/coroutines/b;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lkotlin/coroutines/b;

    .line 16
    .line 17
    invoke-interface {p0}, Lkotlin/coroutines/g$b;->getKey()Lkotlin/coroutines/g$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lkotlin/coroutines/b;->a(Lkotlin/coroutines/g$c;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lkotlin/coroutines/b;->b(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    sget-object p0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 34
    .line 35
    :cond_0
    return-object p0

    .line 36
    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/g$b;->getKey()Lkotlin/coroutines/g$c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-ne v0, p1, :cond_2

    .line 41
    .line 42
    sget-object p0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 43
    .line 44
    :cond_2
    return-object p0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
