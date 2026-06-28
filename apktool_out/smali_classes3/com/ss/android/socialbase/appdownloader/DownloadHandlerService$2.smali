.class final Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService;->a(Landroid/content/Context;Lcom/ss/android/socialbase/appdownloader/c/d;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic b:Lcom/ss/android/socialbase/appdownloader/c/d;

.field final synthetic c:Lcom/ss/android/socialbase/downloader/depend/z;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/c/d;Lcom/ss/android/socialbase/downloader/depend/z;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->b:Lcom/ss/android/socialbase/appdownloader/c/d;

    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->c:Lcom/ss/android/socialbase/downloader/depend/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    :try_start_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    const-string v2, ""

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    :try_start_2
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 33
    .line 34
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/io/File;)Landroid/content/pm/PackageInfo;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v0, v2

    .line 44
    :goto_0
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->b:Lcom/ss/android/socialbase/appdownloader/c/d;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/4 v5, 0x3

    .line 55
    const/4 v7, -0x3

    .line 56
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v8

    .line 62
    move-object v6, v0

    .line 63
    invoke-interface/range {v3 .. v9}, Lcom/ss/android/socialbase/appdownloader/c/d;->a(IILjava/lang/String;IJ)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->c:Lcom/ss/android/socialbase/downloader/depend/z;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    invoke-interface {v1, v4, v3, v0, v2}, Lcom/ss/android/socialbase/downloader/depend/z;->a(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_0
    move-exception v0

    .line 78
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catch_1
    move-exception v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_1
    return-void
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
