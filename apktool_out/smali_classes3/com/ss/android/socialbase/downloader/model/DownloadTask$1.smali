.class Lcom/ss/android/socialbase/downloader/model/DownloadTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/model/DownloadTask;->asyncDownload(Lcom/ss/android/socialbase/downloader/downloader/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/downloader/p;

.field final synthetic b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/downloader/p;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadTask$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadTask$1;->a:Lcom/ss/android/socialbase/downloader/downloader/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadTask$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->download()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadTask$1;->a:Lcom/ss/android/socialbase/downloader/downloader/p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->a(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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
