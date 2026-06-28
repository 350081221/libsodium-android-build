.class public abstract Lorg/jdeferred/impl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/p;


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
        "Ljava/lang/Object;",
        "Lorg/jdeferred/p<",
        "TD;TF;TP;>;"
    }
.end annotation


# instance fields
.field protected final a:Lorg/slf4j/a;

.field protected volatile b:Lorg/jdeferred/p$a;

.field protected final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdeferred/g<",
            "TD;>;>;"
        }
    .end annotation
.end field

.field protected final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdeferred/j<",
            "TF;>;>;"
        }
    .end annotation
.end field

.field protected final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdeferred/m<",
            "TP;>;>;"
        }
    .end annotation
.end field

.field protected final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdeferred/a<",
            "TD;TF;>;>;"
        }
    .end annotation
.end field

.field protected g:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TD;"
        }
    .end annotation
.end field

.field protected h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TF;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lorg/jdeferred/impl/b;

    .line 5
    .line 6
    invoke-static {v0}, Lorg/slf4j/b;->f(Ljava/lang/Class;)Lorg/slf4j/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/jdeferred/impl/b;->a:Lorg/slf4j/a;

    .line 11
    .line 12
    sget-object v0, Lorg/jdeferred/p$a;->PENDING:Lorg/jdeferred/p$a;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lorg/jdeferred/impl/b;->c:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lorg/jdeferred/impl/b;->d:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lorg/jdeferred/impl/b;->e:Ljava/util/List;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lorg/jdeferred/impl/b;->f:Ljava/util/List;

    .line 43
    .line 44
    return-void
    .line 45
.end method


# virtual methods
.method protected A(Lorg/jdeferred/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;TD;)V"
        }
    .end annotation

    invoke-interface {p1, p2}, Lorg/jdeferred/g;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected B(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/jdeferred/impl/b;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/jdeferred/j;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lorg/jdeferred/impl/b;->C(Lorg/jdeferred/j;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lorg/jdeferred/impl/b;->a:Lorg/slf4j/a;

    .line 25
    .line 26
    const-string v3, "an uncaught exception occured in a FailCallback"

    .line 27
    .line 28
    invoke-interface {v2, v3, v1}, Lorg/slf4j/a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lorg/jdeferred/impl/b;->d:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 35
    .line 36
    .line 37
    return-void
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

.method protected C(Lorg/jdeferred/j;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/j<",
            "TF;>;TF;)V"
        }
    .end annotation

    invoke-interface {p1, p2}, Lorg/jdeferred/j;->onFail(Ljava/lang/Object;)V

    return-void
.end method

.method protected D(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/jdeferred/impl/b;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/jdeferred/m;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lorg/jdeferred/impl/b;->E(Lorg/jdeferred/m;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lorg/jdeferred/impl/b;->a:Lorg/slf4j/a;

    .line 25
    .line 26
    const-string v3, "an uncaught exception occured in a ProgressCallback"

    .line 27
    .line 28
    invoke-interface {v2, v3, v1}, Lorg/slf4j/a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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

.method protected E(Lorg/jdeferred/m;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/m<",
            "TP;>;TP;)V"
        }
    .end annotation

    invoke-interface {p1, p2}, Lorg/jdeferred/m;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lorg/jdeferred/g;)Lorg/jdeferred/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->d(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/jdeferred/h;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Lorg/jdeferred/impl/f;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)V

    return-object v0
.end method

.method public d(Lorg/jdeferred/g;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->t()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lorg/jdeferred/impl/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lorg/jdeferred/impl/b;->A(Lorg/jdeferred/g;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/jdeferred/impl/b;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    return-object p0

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

.method public e(Lorg/jdeferred/g;Lorg/jdeferred/j;)Lorg/jdeferred/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;",
            "Lorg/jdeferred/j<",
            "TF;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->d(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lorg/jdeferred/impl/b;->p(Lorg/jdeferred/j;)Lorg/jdeferred/p;

    .line 5
    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public f(Lorg/jdeferred/h;Lorg/jdeferred/k;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;",
            "Lorg/jdeferred/k<",
            "TF;TF_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/jdeferred/impl/f;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)V

    return-object v0
.end method

.method public i(Lorg/jdeferred/m;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/m<",
            "TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/b;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public j(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    monitor-enter p0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v2, p1, v2

    .line 15
    .line 16
    if-gtz v2, :cond_1

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    sub-long/2addr v3, v0

    .line 27
    sub-long v3, p1, v3

    .line 28
    .line 29
    invoke-virtual {p0, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    :goto_0
    if-lez v2, :cond_0

    .line 33
    .line 34
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    sub-long/2addr v2, v0

    .line 39
    cmp-long v2, v2, p1

    .line 40
    .line 41
    if-ltz v2, :cond_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p1

    .line 46
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw p1
.end method

.method public k(Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/l<",
            "TF;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/o<",
            "TP;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/h;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/jdeferred/impl/h;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)V

    return-object v0
.end method

.method public l(Lorg/jdeferred/i;Lorg/jdeferred/l;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;",
            "Lorg/jdeferred/l<",
            "TF;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/jdeferred/impl/h;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)V

    return-object v0
.end method

.method public m(Lorg/jdeferred/i;)Lorg/jdeferred/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/i<",
            "TD;TD_OUT;TF_OUT;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Lorg/jdeferred/impl/h;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/i;Lorg/jdeferred/l;Lorg/jdeferred/o;)V

    return-object v0
.end method

.method public n()Lorg/jdeferred/p$a;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    return-object v0
.end method

.method public o(Lorg/jdeferred/a;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/a<",
            "TD;TF;>;)",
            "Lorg/jdeferred/p<",
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
    iget-object v0, p0, Lorg/jdeferred/impl/b;->f:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    .line 15
    .line 16
    iget-object v1, p0, Lorg/jdeferred/impl/b;->g:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, p0, Lorg/jdeferred/impl/b;->h:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0, v1, v2}, Lorg/jdeferred/impl/b;->x(Lorg/jdeferred/a;Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    monitor-exit p0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public p(Lorg/jdeferred/j;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/j<",
            "TF;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/b;->r()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lorg/jdeferred/impl/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lorg/jdeferred/impl/b;->C(Lorg/jdeferred/j;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/jdeferred/impl/b;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    return-object p0

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

.method public r()Z
    .locals 2

    iget-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    sget-object v1, Lorg/jdeferred/p$a;->REJECTED:Lorg/jdeferred/p$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lorg/jdeferred/impl/b;->j(J)V

    return-void
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    sget-object v1, Lorg/jdeferred/p$a;->RESOLVED:Lorg/jdeferred/p$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D_OUT:",
            "Ljava/lang/Object;",
            "F_OUT:",
            "Ljava/lang/Object;",
            "P_OUT:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/h<",
            "TD;TD_OUT;>;",
            "Lorg/jdeferred/k<",
            "TF;TF_OUT;>;",
            "Lorg/jdeferred/n<",
            "TP;TP_OUT;>;)",
            "Lorg/jdeferred/p<",
            "TD_OUT;TF_OUT;TP_OUT;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/impl/f;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/jdeferred/impl/f;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)V

    return-object v0
.end method

.method public v(Lorg/jdeferred/g;Lorg/jdeferred/j;Lorg/jdeferred/m;)Lorg/jdeferred/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/g<",
            "TD;>;",
            "Lorg/jdeferred/j<",
            "TF;>;",
            "Lorg/jdeferred/m<",
            "TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/b;->d(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lorg/jdeferred/impl/b;->p(Lorg/jdeferred/j;)Lorg/jdeferred/p;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lorg/jdeferred/impl/b;->i(Lorg/jdeferred/m;)Lorg/jdeferred/p;

    .line 8
    .line 9
    .line 10
    return-object p0
    .line 11
    .line 12
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Lorg/jdeferred/impl/b;->b:Lorg/jdeferred/p$a;

    sget-object v1, Lorg/jdeferred/p$a;->PENDING:Lorg/jdeferred/p$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected x(Lorg/jdeferred/a;Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/a<",
            "TD;TF;>;",
            "Lorg/jdeferred/p$a;",
            "TD;TF;)V"
        }
    .end annotation

    invoke-interface {p1, p2, p3, p4}, Lorg/jdeferred/a;->a(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method protected y(Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/p$a;",
            "TD;TF;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/jdeferred/impl/b;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/jdeferred/a;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0, v1, p1, p2, p3}, Lorg/jdeferred/impl/b;->x(Lorg/jdeferred/a;Lorg/jdeferred/p$a;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lorg/jdeferred/impl/b;->a:Lorg/slf4j/a;

    .line 25
    .line 26
    const-string v3, "an uncaught exception occured in a AlwaysCallback"

    .line 27
    .line 28
    invoke-interface {v2, v3, v1}, Lorg/slf4j/a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lorg/jdeferred/impl/b;->f:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 35
    .line 36
    .line 37
    monitor-enter p0

    .line 38
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 39
    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method protected z(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/jdeferred/impl/b;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/jdeferred/g;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lorg/jdeferred/impl/b;->A(Lorg/jdeferred/g;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lorg/jdeferred/impl/b;->a:Lorg/slf4j/a;

    .line 25
    .line 26
    const-string v3, "an uncaught exception occured in a DoneCallback"

    .line 27
    .line 28
    invoke-interface {v2, v3, v1}, Lorg/slf4j/a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lorg/jdeferred/impl/b;->c:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 35
    .line 36
    .line 37
    return-void
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
