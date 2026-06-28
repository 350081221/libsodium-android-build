.class Lcom/ss/android/socialbase/downloader/impls/r$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/r;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/impls/r;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/r;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/r$1;->a:Lcom/ss/android/socialbase/downloader/impls/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/r$1;->a:Lcom/ss/android/socialbase/downloader/impls/r;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/impls/r;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/r$1;->a:Lcom/ss/android/socialbase/downloader/impls/r;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/impls/r;)Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "connectivity"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/impls/r;Landroid/net/ConnectivityManager;)Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/r$1;->a:Lcom/ss/android/socialbase/downloader/impls/r;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/r;->b(Lcom/ss/android/socialbase/downloader/impls/r;)Landroid/net/ConnectivityManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Lcom/ss/android/socialbase/downloader/impls/r$1$1;

    .line 46
    .line 47
    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/downloader/impls/r$1$1;-><init>(Lcom/ss/android/socialbase/downloader/impls/r$1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    :cond_0
    :goto_0
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
