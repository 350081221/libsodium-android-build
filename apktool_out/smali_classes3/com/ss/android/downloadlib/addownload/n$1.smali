.class final Lcom/ss/android/downloadlib/addownload/n$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/a/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/n;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/downloadlib/addownload/d/h;ZLcom/ss/android/downloadlib/addownload/a/c;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic d:Lcom/ss/android/downloadlib/addownload/d/h;


# direct methods
.method constructor <init>(IZLcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/addownload/d/h;)V
    .locals 0

    iput p1, p0, Lcom/ss/android/downloadlib/addownload/n$1;->a:I

    iput-boolean p2, p0, Lcom/ss/android/downloadlib/addownload/n$1;->b:Z

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/n$1;->d:Lcom/ss/android/downloadlib/addownload/d/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/n;->a(Lcom/ss/android/downloadlib/addownload/a/d;)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/ss/android/downloadlib/addownload/n$1;->a:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->startPauseReserveOnWifi()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/r;->a()Lcom/ss/android/socialbase/downloader/impls/r;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/n$1;->b:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "cancel_pause_reserve_wifi_confirm"

    .line 40
    .line 41
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "pause_reserve_wifi_confirm"

    .line 52
    .line 53
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/n$1;->d:Lcom/ss/android/downloadlib/addownload/d/h;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 61
    .line 62
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/addownload/d/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 63
    .line 64
    .line 65
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

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/n;->a(Lcom/ss/android/downloadlib/addownload/a/d;)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/ss/android/downloadlib/addownload/n$1;->a:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->stopPauseReserveOnWifi()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/n$1;->b:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "cancel_pause_reserve_wifi_cancel"

    .line 33
    .line 34
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "pause_reserve_wifi_cancel"

    .line 45
    .line 46
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/n$1;->d:Lcom/ss/android/downloadlib/addownload/d/h;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/n$1;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/addownload/d/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 56
    .line 57
    .line 58
    return-void
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
