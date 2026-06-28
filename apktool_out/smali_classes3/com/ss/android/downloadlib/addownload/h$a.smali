.class Lcom/ss/android/downloadlib/addownload/h$a;
.super Lcom/ss/android/socialbase/downloader/depend/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/ss/android/downloadlib/g/n;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/g/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h$a;->a:Lcom/ss/android/downloadlib/g/n;

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x3

    .line 3
    iput v1, v0, Landroid/os/Message;->what:I

    .line 4
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 5
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 6
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h$a;->a:Lcom/ss/android/downloadlib/g/n;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method


# virtual methods
.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/16 v0, 0xb

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onCanceled(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, -0x4

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onFailed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 0

    const/4 p2, -0x1

    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onPause(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, -0x2

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onPrepare(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onProgress(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onStart(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method

.method public onSuccessed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, -0x3

    invoke-direct {p0, p1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    return-void
.end method
