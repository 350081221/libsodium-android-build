.class Lcom/ss/android/socialbase/downloader/f/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/f/c;
.implements Lcom/ss/android/socialbase/downloader/f/d;
.implements Lcom/ss/android/socialbase/downloader/f/e;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/lang/Object;

.field private e:Lcom/ss/android/socialbase/downloader/f/a;

.field private f:Lcom/ss/android/socialbase/downloader/f/a;

.field private g:Lcom/ss/android/socialbase/downloader/f/a;

.field private h:Lcom/ss/android/socialbase/downloader/f/a;

.field private i:Lcom/ss/android/socialbase/downloader/f/a;

.field private volatile j:Z

.field private k:I


# direct methods
.method constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    const/16 v0, 0x40

    .line 19
    .line 20
    if-ge p1, v0, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    :cond_0
    const/16 v0, 0x2000

    .line 24
    .line 25
    if-ge p2, v0, :cond_1

    .line 26
    .line 27
    move p2, v0

    .line 28
    :cond_1
    iput p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->a:I

    .line 29
    .line 30
    iput p2, p0, Lcom/ss/android/socialbase/downloader/f/b;->b:I

    .line 31
    .line 32
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
.end method


# virtual methods
.method public a()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/f/p;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->i:Lcom/ss/android/socialbase/downloader/f/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 3
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    return-object v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->g:Lcom/ss/android/socialbase/downloader/f/a;

    :goto_0
    if-nez v2, :cond_2

    .line 6
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->j:Z

    if-nez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 8
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->g:Lcom/ss/android/socialbase/downloader/f/a;

    goto :goto_0

    .line 9
    :cond_1
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/p;

    const-string v2, "read"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_2
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/f/b;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 11
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->h:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->g:Lcom/ss/android/socialbase/downloader/f/a;

    .line 12
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 13
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 2
    .param p1    # Lcom/ss/android/socialbase/downloader/f/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->f:Lcom/ss/android/socialbase/downloader/f/a;

    if-nez v1, :cond_0

    .line 17
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->f:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->e:Lcom/ss/android/socialbase/downloader/f/a;

    goto :goto_0

    .line 18
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 19
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 20
    :goto_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 21
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/f/p;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->j:Z

    if-nez v1, :cond_4

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->e:Lcom/ss/android/socialbase/downloader/f/a;

    if-nez v1, :cond_2

    .line 4
    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->k:I

    iget v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->a:I

    if-ge v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 5
    iput v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->k:I

    .line 6
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/a;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->b:I

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/a;-><init>(I)V

    .line 7
    monitor-exit v0

    return-object v1

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 9
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->j:Z

    if-nez v1, :cond_1

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->e:Lcom/ss/android/socialbase/downloader/f/a;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 11
    :cond_1
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/p;

    const-string v2, "obtain"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v1

    .line 12
    :cond_2
    :goto_0
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->e:Lcom/ss/android/socialbase/downloader/f/a;

    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/b;->f:Lcom/ss/android/socialbase/downloader/f/a;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_3

    .line 14
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/f/b;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 15
    :cond_3
    iput-object v3, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 16
    monitor-exit v0

    return-object v1

    .line 17
    :cond_4
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/p;

    const-string v2, "obtain"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 2
    .param p1    # Lcom/ss/android/socialbase/downloader/f/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 20
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->h:Lcom/ss/android/socialbase/downloader/f/a;

    if-nez v1, :cond_0

    .line 21
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->h:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->g:Lcom/ss/android/socialbase/downloader/f/a;

    .line 22
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 23
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 24
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/b;->h:Lcom/ss/android/socialbase/downloader/f/a;

    .line 25
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->j:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 19
    .line 20
    .line 21
    monitor-exit v1

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0

    .line 26
    :catchall_1
    move-exception v1

    .line 27
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    throw v1
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
.end method
