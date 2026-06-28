.class public Lcom/ss/android/socialbase/downloader/e/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/e/b;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;

.field private f:Lcom/ss/android/socialbase/downloader/f/a;

.field private g:Lcom/ss/android/socialbase/downloader/f/a;

.field private h:Lcom/ss/android/socialbase/downloader/f/a;

.field private i:Lcom/ss/android/socialbase/downloader/f/a;

.field private j:Lcom/ss/android/socialbase/downloader/f/a;

.field private k:Lcom/ss/android/socialbase/downloader/f/a;

.field private volatile l:Z

.field private volatile m:Z

.field private volatile n:Ljava/lang/Throwable;

.field private volatile o:Ljava/util/concurrent/Future;

.field private p:I

.field private final q:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

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
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Lcom/ss/android/socialbase/downloader/e/a$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/e/a$1;-><init>(Lcom/ss/android/socialbase/downloader/e/a;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->q:Ljava/lang/Runnable;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->a:Ljava/io/InputStream;

    .line 26
    .line 27
    iput p2, p0, Lcom/ss/android/socialbase/downloader/e/a;->b:I

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    if-ge p3, p1, :cond_0

    .line 31
    .line 32
    :goto_0
    move p3, p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/16 p1, 0x40

    .line 35
    .line 36
    if-le p3, p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    iput p3, p0, Lcom/ss/android/socialbase/downloader/e/a;->c:I

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/e/a;->c()V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/e/a;)Lcom/ss/android/socialbase/downloader/f/a;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/f/p;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/e/a;->d()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/e/a;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->n:Ljava/lang/Throwable;

    return-object p1
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/e/a;Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/e/a;->c(Lcom/ss/android/socialbase/downloader/f/a;)V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/e/a;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->m:Z

    return p1
.end method

.method static synthetic b(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/e/a;->a:Ljava/io/InputStream;

    return-object p0
.end method

.method private b(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->g:Lcom/ss/android/socialbase/downloader/f/a;

    if-nez v1, :cond_0

    .line 12
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->g:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 13
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 15
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->g:Lcom/ss/android/socialbase/downloader/f/a;

    .line 16
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

.method static synthetic c(Lcom/ss/android/socialbase/downloader/e/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    return-object p0
.end method

.method private c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->q()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->q:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->o:Ljava/util/concurrent/Future;

    return-void
.end method

.method private c(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->j:Lcom/ss/android/socialbase/downloader/f/a;

    if-nez v1, :cond_0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->j:Lcom/ss/android/socialbase/downloader/f/a;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 7
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 8
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/a;->j:Lcom/ss/android/socialbase/downloader/f/a;

    .line 10
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

.method private d()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/f/p;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->h:Lcom/ss/android/socialbase/downloader/f/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->l:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 11
    .line 12
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->h:Lcom/ss/android/socialbase/downloader/f/a;

    .line 13
    .line 14
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/p;

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->l:Z

    .line 29
    .line 30
    if-nez v2, :cond_5

    .line 31
    .line 32
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget v3, p0, Lcom/ss/android/socialbase/downloader/e/a;->p:I

    .line 37
    .line 38
    iget v4, p0, Lcom/ss/android/socialbase/downloader/e/a;->c:I

    .line 39
    .line 40
    if-ge v3, v4, :cond_2

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    iput v3, p0, Lcom/ss/android/socialbase/downloader/e/a;->p:I

    .line 45
    .line 46
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/a;

    .line 47
    .line 48
    iget v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->b:I

    .line 49
    .line 50
    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/a;-><init>(I)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-object v1

    .line 55
    :cond_2
    :goto_0
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 60
    .line 61
    .line 62
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->l:Z

    .line 63
    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/p;

    .line 70
    .line 71
    const-string v2, ""

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_4
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 78
    .line 79
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a;->h:Lcom/ss/android/socialbase/downloader/f/a;

    .line 80
    .line 81
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->g:Lcom/ss/android/socialbase/downloader/f/a;

    .line 82
    .line 83
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->f:Lcom/ss/android/socialbase/downloader/f/a;

    .line 84
    .line 85
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 86
    .line 87
    monitor-exit v0

    .line 88
    return-object v2

    .line 89
    :cond_5
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/p;

    .line 90
    .line 91
    const-string v2, ""

    .line 92
    .line 93
    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :catchall_0
    move-exception v1

    .line 98
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw v1
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private e()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->k:Lcom/ss/android/socialbase/downloader/f/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 7
    .line 8
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->k:Lcom/ss/android/socialbase/downloader/f/a;

    .line 9
    .line 10
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 17
    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    :cond_1
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->m:Z

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/e/a;->f()V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    :cond_3
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 37
    .line 38
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/e/a;->k:Lcom/ss/android/socialbase/downloader/f/a;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->j:Lcom/ss/android/socialbase/downloader/f/a;

    .line 41
    .line 42
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->i:Lcom/ss/android/socialbase/downloader/f/a;

    .line 43
    .line 44
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/f/a;->d:Lcom/ss/android/socialbase/downloader/f/a;

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-object v2

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw v1
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

.method private f()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->n:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/f/p;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 10
    .line 11
    const/16 v1, 0x42c

    .line 12
    .line 13
    const-string v2, "async reader closed!"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_0
    const-string v1, "async_read"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 25
    .line 26
    const/16 v1, 0x42d

    .line 27
    .line 28
    const-string v2, "async reader terminated!"

    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
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


# virtual methods
.method public a()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/e/a;->e()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/e/a;->b(Lcom/ss/android/socialbase/downloader/f/a;)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 3
    :try_start_0
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/e/a;->l:Z

    .line 4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/a;->d:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 7
    :try_start_1
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/e/a;->o:Ljava/util/concurrent/Future;

    :cond_0
    return-void

    :catchall_1
    move-exception v1

    .line 9
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
