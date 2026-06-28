.class Lcom/ss/android/downloadlib/g$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/g;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/ss/android/downloadlib/g;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/g$2;->d:Lcom/ss/android/downloadlib/g;

    iput-object p2, p0, Lcom/ss/android/downloadlib/g$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p3, p0, Lcom/ss/android/downloadlib/g$2;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    iput-object p4, p0, Lcom/ss/android/downloadlib/g$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/g$2;->d:Lcom/ss/android/downloadlib/g;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/downloadlib/g;->a(Lcom/ss/android/downloadlib/g;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v2, v1, Lcom/ss/android/download/api/download/a/a;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast v1, Lcom/ss/android/download/api/download/a/a;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/ss/android/downloadlib/g$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/ss/android/downloadlib/g$2;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/ss/android/downloadlib/g$2;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v1, v2, v3, v4}, Lcom/ss/android/download/api/download/a/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    instance-of v2, v1, Ljava/lang/ref/SoftReference;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    instance-of v2, v2, Lcom/ss/android/download/api/download/a/a;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lcom/ss/android/download/api/download/a/a;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/ss/android/downloadlib/g$2;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/ss/android/downloadlib/g$2;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 60
    .line 61
    iget-object v4, p0, Lcom/ss/android/downloadlib/g$2;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v1, v2, v3, v4}, Lcom/ss/android/download/api/download/a/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
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
