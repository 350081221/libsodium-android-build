.class public Lorg/jdeferred/impl/d;
.super Lorg/jdeferred/impl/b;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "F:",
        "Ljava/lang/Object;",
        "P:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/jdeferred/impl/b<",
        "TD;TF;TP;>;",
        "Lorg/jdeferred/b<",
        "TD;TF;TP;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/jdeferred/impl/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lorg/jdeferred/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    return-object p0
.end method

.method public g(Ljava/lang/Object;)Lorg/jdeferred/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lorg/jdeferred/b<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->w()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lorg/jdeferred/p$a;->RESOLVED:Lorg/jdeferred/p$a;

    .line 9
    .line 10
    iput-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 11
    .line 12
    iput-object p1, p0, Lorg/jdeferred/impl/b;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->z(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :try_start_2
    iget-object v1, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 19
    .line 20
    invoke-virtual {p0, v1, p1, v0}, Lorg/jdeferred/impl/b;->y(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    iget-object v2, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 27
    .line 28
    invoke-virtual {p0, v2, p1, v0}, Lorg/jdeferred/impl/b;->y(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "Deferred object already finished, cannot resolve again"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :catchall_1
    move-exception p1

    .line 41
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    throw p1
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

.method public h(Ljava/lang/Object;)Lorg/jdeferred/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Lorg/jdeferred/b<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->w()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lorg/jdeferred/p$a;->REJECTED:Lorg/jdeferred/p$a;

    .line 9
    .line 10
    iput-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 11
    .line 12
    iput-object p1, p0, Lorg/jdeferred/impl/b;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->B(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :try_start_2
    iget-object v1, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0, p1}, Lorg/jdeferred/impl/b;->y(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    iget-object v2, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 27
    .line 28
    invoke-virtual {p0, v2, v0, p1}, Lorg/jdeferred/impl/b;->y(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "Deferred object already finished, cannot reject again"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :catchall_1
    move-exception p1

    .line 41
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    throw p1
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

.method public q(Ljava/lang/Object;)Lorg/jdeferred/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)",
            "Lorg/jdeferred/b<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->w()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->D(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "Deferred object already finished, cannot notify progress"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
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
