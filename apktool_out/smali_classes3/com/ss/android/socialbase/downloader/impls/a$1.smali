.class Lcom/ss/android/socialbase/downloader/impls/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/a;->a(IZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/util/SparseArray;

.field final synthetic b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic c:Landroid/util/SparseArray;

.field final synthetic d:Lcom/ss/android/socialbase/downloader/impls/a;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/a;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Landroid/util/SparseArray;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->d:Lcom/ss/android/socialbase/downloader/impls/a;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->a:Landroid/util/SparseArray;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->c:Landroid/util/SparseArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->a:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->a:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->a:Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 33
    .line 34
    invoke-interface {v3, v4}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onCanceled(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    monitor-exit v0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw v1

    .line 45
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canShowNotification()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->c:Landroid/util/SparseArray;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    monitor-enter v0

    .line 60
    :goto_2
    :try_start_1
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->c:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ge v1, v2, :cond_4

    .line 67
    .line 68
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->c:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->c:Landroid/util/SparseArray;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/a$1;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 85
    .line 86
    invoke-interface {v2, v3}, Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;->onCanceled(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    monitor-exit v0

    .line 93
    goto :goto_3

    .line 94
    :catchall_1
    move-exception v1

    .line 95
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    throw v1

    .line 97
    :cond_5
    :goto_3
    return-void
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
