.class Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;->a(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;I)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService$1;->b:Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/d;->a()Lcom/ss/android/socialbase/downloader/downloader/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService$1;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/d;->o(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :goto_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
