.class Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/downloader/DownloadService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/ss/android/socialbase/downloader/downloader/DownloadService;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/DownloadService;Landroid/content/Intent;II)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->d:Lcom/ss/android/socialbase/downloader/downloader/DownloadService;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->a:Landroid/content/Intent;

    iput p3, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->b:I

    iput p4, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->d:Lcom/ss/android/socialbase/downloader/downloader/DownloadService;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService;->a:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->a:Landroid/content/Intent;

    .line 8
    .line 9
    iget v2, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->b:I

    .line 10
    .line 11
    iget v3, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService$1;->c:I

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/o;->a(Landroid/content/Intent;II)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
