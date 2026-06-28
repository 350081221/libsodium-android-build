.class public Lcom/ss/android/socialbase/downloader/impls/n;
.super Lcom/ss/android/socialbase/downloader/downloader/a;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field private static final e:Ljava/lang/String; = "n"


# instance fields
.field private f:Lcom/ss/android/socialbase/downloader/downloader/i;

.field private g:Lcom/ss/android/socialbase/downloader/downloader/n;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->h:I

    .line 6
    .line 7
    return-void
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
.end method

.method private h()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    :try_start_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->a:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->a:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_2
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v0, v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/util/List;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lcom/ss/android/socialbase/downloader/model/DownloadTask;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    :try_start_3
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 66
    .line 67
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/i/g;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/model/a;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v4, v3}, Lcom/ss/android/socialbase/downloader/downloader/i;->a(Lcom/ss/android/socialbase/downloader/model/a;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception v3

    .line 76
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v1

    .line 84
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 85
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    sget-object v1, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    .line 88
    .line 89
    const-string v2, "resumePendingTaskForIndependent failed"

    .line 90
    .line 91
    invoke-static {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
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
.method public a(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "fix_downloader_db_sigbus"

    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 9
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    const-string v0, "downloader process sync database on main process!"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "fix_sigbus_downloader_db"

    const/4 v0, 0x1

    .line 10
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;Z)V

    .line 11
    :cond_0
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    const-string v0, "onBind IndependentDownloadBinder"

    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance p1, Lcom/ss/android/socialbase/downloader/impls/m;

    invoke-direct {p1}, Lcom/ss/android/socialbase/downloader/impls/m;-><init>()V

    return-object p1
.end method

.method public a(I)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    if-nez v0, :cond_0

    .line 15
    iput p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->h:I

    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->l(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    const-string v1, "bindService"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ss/android/socialbase/downloader/downloader/IndependentProcessDownloadService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "fix_downloader_db_sigbus"

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v2

    const-string v3, "fix_sigbus_downloader_db"

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    if-eqz p2, :cond_1

    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, p2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 6
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/downloader/n;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->g:Lcom/ss/android/socialbase/downloader/downloader/n;

    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "tryDownload aidlService == null:"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v2, 0x0

    .line 23
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1, p0}, Lcom/ss/android/socialbase/downloader/impls/n;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/n;->h()V

    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/g;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/model/a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->a(Lcom/ss/android/socialbase/downloader/model/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void
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
.end method

.method public c(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/d;->a()Lcom/ss/android/socialbase/downloader/downloader/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/d;->a(IZ)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0, p0}, Lcom/ss/android/socialbase/downloader/impls/n;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 10
    .line 11
    .line 12
    :cond_0
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
.end method

.method public onBindingDied(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->g:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/downloader/n;->i()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "onServiceConnected "

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/downloader/i$a;->a(Landroid/os/IBinder;)Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->g:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0, p2}, Lcom/ss/android/socialbase/downloader/downloader/n;->a(Landroid/os/IBinder;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v0, "onServiceConnected aidlService!=null"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move v0, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v0, v2

    .line 40
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " pendingTasks.size:"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->a:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/d;->a()Lcom/ss/android/socialbase/downloader/downloader/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/d;->b()V

    .line 73
    .line 74
    .line 75
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->b:Z

    .line 76
    .line 77
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->d:Z

    .line 78
    .line 79
    iget p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->h:I

    .line 80
    .line 81
    const/4 p2, -0x1

    .line 82
    if-eq p1, p2, :cond_2

    .line 83
    .line 84
    :try_start_0
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 85
    .line 86
    invoke-interface {p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->l(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/n;->h()V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-void
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
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/n;->e:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "onServiceDisconnected "

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->f:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->b:Z

    .line 13
    .line 14
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/n;->g:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/downloader/n;->i()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
