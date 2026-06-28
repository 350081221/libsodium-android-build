.class public abstract Lorg/jdeferred/impl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/e;


# instance fields
.field protected final a:Lorg/slf4j/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lorg/jdeferred/impl/a;

    .line 5
    .line 6
    invoke-static {v0}, Lorg/slf4j/b;->f(Ljava/lang/Class;)Lorg/slf4j/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/jdeferred/impl/a;->a:Lorg/slf4j/a;

    .line 11
    .line 12
    return-void
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


# virtual methods
.method public varargs a([Ljava/lang/Runnable;)Lorg/jdeferred/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Runnable;",
            ")",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    instance-of v3, v2, Lorg/jdeferred/f;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lorg/jdeferred/f;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->k(Lorg/jdeferred/f;)Lorg/jdeferred/p;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->g(Ljava/lang/Runnable;)Lorg/jdeferred/p;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    aput-object v2, v0, v1

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method public b(Lorg/jdeferred/p;)Lorg/jdeferred/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    return-object p1
.end method

.method public varargs c([Lorg/jdeferred/p;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/p;",
            ")",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/jdeferred/multiple/a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/jdeferred/multiple/a;-><init>([Lorg/jdeferred/p;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public varargs d([Lorg/jdeferred/f;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/f<",
            "*>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->k(Lorg/jdeferred/f;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public e(Ljava/util/concurrent/Future;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/a$a;

    sget-object v1, Lorg/jdeferred/e$a;->AUTO:Lorg/jdeferred/e$a;

    invoke-direct {v0, p0, v1, p1}, Lorg/jdeferred/impl/a$a;-><init>(Lorg/jdeferred/impl/a;Lorg/jdeferred/e$a;Ljava/util/concurrent/Future;)V

    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->n(Lorg/jdeferred/c;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public varargs f([Lorg/jdeferred/c;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/c<",
            "**>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->n(Lorg/jdeferred/c;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public g(Ljava/lang/Runnable;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lorg/jdeferred/p<",
            "Ljava/lang/Void;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/d;

    invoke-direct {v0, p1}, Lorg/jdeferred/d;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/concurrent/Callable;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/d;

    invoke-direct {v0, p1}, Lorg/jdeferred/d;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public varargs i([Lorg/jdeferred/d;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/d<",
            "**>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public j(Lorg/jdeferred/d;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/d<",
            "TD;TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/jdeferred/d;->a()Lorg/jdeferred/e$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/jdeferred/e$a;->AUTO:Lorg/jdeferred/e$a;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/jdeferred/d;->a()Lorg/jdeferred/e$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/jdeferred/impl/a;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->q(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p1}, Lorg/jdeferred/d;->b()Lorg/jdeferred/p;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
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

.method public k(Lorg/jdeferred/f;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/f<",
            "TP;>;)",
            "Lorg/jdeferred/p<",
            "Ljava/lang/Void;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/d;

    invoke-direct {v0, p1}, Lorg/jdeferred/d;-><init>(Lorg/jdeferred/f;)V

    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public varargs l([Ljava/util/concurrent/Callable;)Lorg/jdeferred/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/concurrent/Callable<",
            "*>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    instance-of v3, v2, Lorg/jdeferred/c;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lorg/jdeferred/c;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->n(Lorg/jdeferred/c;)Lorg/jdeferred/p;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->h(Ljava/util/concurrent/Callable;)Lorg/jdeferred/p;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    aput-object v2, v0, v1

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method public varargs m([Ljava/util/concurrent/Future;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/concurrent/Future<",
            "*>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/impl/a;->e(Ljava/util/concurrent/Future;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public n(Lorg/jdeferred/c;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/c<",
            "TD;TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/d;

    invoke-direct {v0, p1}, Lorg/jdeferred/d;-><init>(Lorg/jdeferred/c;)V

    invoke-virtual {p0, v0}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method protected o([Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length p1, p1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v0, "Arguments is null or its length is empty"

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
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
.end method

.method public abstract p()Z
.end method

.method protected abstract q(Ljava/lang/Runnable;)V
.end method

.method protected abstract r(Ljava/util/concurrent/Callable;)V
.end method
