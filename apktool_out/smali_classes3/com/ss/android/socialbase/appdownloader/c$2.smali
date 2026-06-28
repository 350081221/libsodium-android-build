.class final Lcom/ss/android/socialbase/appdownloader/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/c;->b(Landroid/content/Context;IZ)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic e:Ljava/io/File;


# direct methods
.method constructor <init>(Landroid/content/Context;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->a:Landroid/content/Context;

    iput p2, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->b:I

    iput-boolean p3, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->c:Z

    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->d:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->e:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/d;->k()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget v1, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->b:I

    .line 11
    .line 12
    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->c:Z

    .line 13
    .line 14
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->d:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->e:Ljava/io/File;

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/io/File;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/d;->q()Lcom/ss/android/socialbase/downloader/depend/ag;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/d;->q()Lcom/ss/android/socialbase/downloader/depend/ag;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->d:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-interface {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/depend/ag;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->d:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 50
    .line 51
    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/c$2;->c:Z

    .line 52
    .line 53
    invoke-static {v1, v2, v0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V

    .line 54
    .line 55
    .line 56
    return-void
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
