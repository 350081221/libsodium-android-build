.class Lcom/ss/android/socialbase/downloader/impls/r$1$1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/r$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/impls/r$1;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/r$1;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/r$1$1;->a:Lcom/ss/android/socialbase/downloader/impls/r$1;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 1
    const-string p1, "RetryScheduler"

    .line 2
    .line 3
    const-string v0, "network onAvailable: "

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/r$1$1;->a:Lcom/ss/android/socialbase/downloader/impls/r$1;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/impls/r$1;->a:Lcom/ss/android/socialbase/downloader/impls/r;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p1, v0, v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/impls/r;IZ)V

    .line 14
    .line 15
    .line 16
    return-void
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
