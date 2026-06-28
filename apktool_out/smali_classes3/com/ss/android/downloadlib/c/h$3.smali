.class Lcom/ss/android/downloadlib/c/h$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/c/h;->a(Lcom/ss/android/downloadad/api/a/b;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic c:Lcom/ss/android/downloadlib/c/h;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/c/h;ILcom/ss/android/downloadad/api/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/c/h$3;->c:Lcom/ss/android/downloadlib/c/h;

    iput p2, p0, Lcom/ss/android/downloadlib/c/h$3;->a:I

    iput-object p3, p0, Lcom/ss/android/downloadlib/c/h$3;->b:Lcom/ss/android/downloadad/api/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, Lcom/ss/android/downloadlib/c/h$3;->a:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "ttdownloader_type"

    .line 26
    .line 27
    invoke-static {v1, v3, v2}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/g/f;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lorg/json/JSONObject;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/ss/android/downloadlib/c/h$3;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->e()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->c(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    const/16 v0, 0x3eb

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "error_code"

    .line 52
    .line 53
    invoke-static {v1, v2, v0}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/c/h$3;->c:Lcom/ss/android/downloadlib/c/h;

    .line 58
    .line 59
    iget v2, p0, Lcom/ss/android/downloadlib/c/h$3;->a:I

    .line 60
    .line 61
    iget-object v3, p0, Lcom/ss/android/downloadlib/c/h$3;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 62
    .line 63
    invoke-static {v0, v2, v3, v1}, Lcom/ss/android/downloadlib/c/h;->a(Lcom/ss/android/downloadlib/c/h;ILcom/ss/android/downloadad/api/a/b;Lorg/json/JSONObject;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v2, "download_notification_try_show"

    .line 71
    .line 72
    iget-object v3, p0, Lcom/ss/android/downloadlib/c/h$3;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1, v3}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 75
    .line 76
    .line 77
    return-void
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
