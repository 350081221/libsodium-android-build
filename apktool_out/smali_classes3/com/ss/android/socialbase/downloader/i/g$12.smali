.class final Lcom/ss/android/socialbase/downloader/i/g$12;
.super Lcom/ss/android/socialbase/downloader/depend/i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/i/g;->a(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)Lcom/ss/android/socialbase/downloader/depend/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$1;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$1;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onPrepare(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 5
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$9;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/socialbase/downloader/i/g$12$9;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onFailed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_0
    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$5;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$5;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onStart(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :goto_0
    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/socialbase/downloader/i/g$12$2;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onRetry(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_0
    return-void
.end method

.method public c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$6;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$6;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onProgress(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :goto_0
    return-void
.end method

.method public c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/socialbase/downloader/i/g$12$3;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onRetryDelay(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_0
    return-void
.end method

.method public d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$7;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$7;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onPause(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$8;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$8;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onSuccessed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$10;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$10;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onCanceled(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public g(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$11;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$11;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onFirstStart(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public h(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$12;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$12;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onFirstSuccess(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->a:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/depend/s;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/i/g$12;->b:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/g;->a()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/ss/android/socialbase/downloader/i/g$12$4;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lcom/ss/android/socialbase/downloader/i/g$12$4;-><init>(Lcom/ss/android/socialbase/downloader/i/g$12;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    check-cast v0, Lcom/ss/android/socialbase/downloader/depend/s;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/s;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
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
.end method
