.class public Lcom/ss/android/socialbase/downloader/downloader/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "f"


# instance fields
.field private final b:Z

.field private c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private final d:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private final e:Landroid/os/Handler;

.field private f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field private g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private volatile k:J

.field private final l:Ljava/util/concurrent/atomic/AtomicLong;

.field private m:Z

.field private n:I

.field private o:J

.field private p:Lcom/ss/android/socialbase/downloader/depend/n;

.field private q:Lcom/ss/android/socialbase/downloader/depend/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Landroid/os/Handler;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->j:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->k:J

    .line 10
    .line 11
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->m:Z

    .line 19
    .line 20
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->j()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->e:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string p2, "fix_start_with_file_exist_update_error"

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->b:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->b:Z

    .line 57
    .line 58
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/downloader/f;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return-object p0
.end method

.method private a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 1

    const/4 v0, 0x1

    .line 50
    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method private a(ILcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 4

    .line 51
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, -0x3

    if-ne v0, v2, :cond_0

    if-ne p1, v1, :cond_0

    return-void

    .line 52
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->j()V

    if-eq p1, v1, :cond_1

    .line 53
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/constants/DownloadStatus;->isRealTimeUploadStatus(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 54
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateRealDownloadTime(Z)V

    .line 55
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/constants/DownloadStatus;->isTimeUploadStatus(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateDownloadTime()V

    .line 57
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAddListenerToSameTask()Z

    move-result v1

    if-nez v1, :cond_2

    .line 58
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-static {v1, p2, p1}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_2
    const/4 v1, 0x6

    if-ne p1, v1, :cond_3

    .line 59
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    goto :goto_0

    :cond_3
    const/4 v1, -0x6

    if-ne p1, v1, :cond_4

    .line 60
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    goto :goto_0

    .line 61
    :cond_4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    :goto_0
    if-eq v0, v2, :cond_5

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 62
    :cond_5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryDelayStatus()Lcom/ss/android/socialbase/downloader/constants/g;

    move-result-object v0

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->c:Lcom/ss/android/socialbase/downloader/constants/g;

    if-ne v0, v1, :cond_6

    .line 63
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->d:Lcom/ss/android/socialbase/downloader/constants/g;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setRetryDelayStatus(Lcom/ss/android/socialbase/downloader/constants/g;)V

    .line 64
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getAsyncHandleStatus()Lcom/ss/android/socialbase/downloader/constants/a;

    move-result-object v0

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->d:Lcom/ss/android/socialbase/downloader/constants/a;

    if-ne v0, v1, :cond_7

    .line 65
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->e:Lcom/ss/android/socialbase/downloader/constants/a;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setAsyncHandleStatus(Lcom/ss/android/socialbase/downloader/constants/a;)V

    .line 66
    :cond_7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    move-result-object v0

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/b;->c:Lcom/ss/android/socialbase/downloader/constants/b;

    if-ne v0, v1, :cond_8

    .line 67
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/b;->d:Lcom/ss/android/socialbase/downloader/constants/b;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setByteInvalidRetryStatus(Lcom/ss/android/socialbase/downloader/constants/b;)V

    .line 68
    :cond_8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->h:Landroid/util/SparseArray;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1, v0, v1, v2, p2}, Lcom/ss/android/socialbase/downloader/i/c;->a(ILandroid/util/SparseArray;ZLcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    const/4 v0, -0x4

    if-ne p1, v0, :cond_9

    return-void

    :cond_9
    if-eqz p3, :cond_c

    .line 69
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->e:Landroid/os/Handler;

    if-eqz p3, :cond_c

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->g:Landroid/util/SparseArray;

    if-eqz p3, :cond_a

    .line 70
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-gtz p3, :cond_b

    :cond_a
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->i:Landroid/util/SparseArray;

    if-eqz p3, :cond_c

    .line 71
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-lez p3, :cond_c

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canShowNotification()Z

    move-result p3

    if-nez p3, :cond_b

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result p3

    if-eqz p3, :cond_c

    .line 72
    :cond_b
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->e:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getHashCodeForSameTask()I

    move-result v1

    invoke-virtual {p3, p1, v0, v1, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 73
    :cond_c
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    move-result-object p2

    if-eqz p2, :cond_d

    .line 74
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getHashCodeForSameTask()I

    move-result v0

    invoke-virtual {p2, p3, v0, p1}, Lcom/ss/android/socialbase/downloader/impls/a;->a(III)V

    :cond_d
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/downloader/f;ILcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method

.method private a(JZ)Z
    .locals 2

    .line 43
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide p1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-nez p1, :cond_0

    .line 44
    :try_start_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    invoke-interface {p1, p3, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return p2

    .line 46
    :cond_0
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->j:Z

    const/4 v0, 0x4

    if-eqz p1, :cond_1

    .line 47
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->j:Z

    .line 48
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 49
    :cond_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedPostProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p2, 0x1

    :cond_2
    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return p3
.end method

.method static synthetic b(Lcom/ss/android/socialbase/downloader/downloader/f;)Lcom/ss/android/socialbase/downloader/downloader/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    return-object p0
.end method

.method private b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 4

    .line 8
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleError::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " \r\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Landroid/database/sqlite/SQLiteFullException;

    if-eqz v0, :cond_0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->f(I)Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    .line 12
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->b(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 13
    :catch_1
    :try_start_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->f(I)Z
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    :goto_0
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->c(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Lcom/ss/android/socialbase/downloader/exception/BaseException;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFailedException(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 17
    instance-of v0, p1, Lcom/ss/android/socialbase/downloader/exception/e;

    if-eqz v0, :cond_1

    const/4 v0, -0x2

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    .line 18
    :goto_1
    invoke-direct {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 19
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "retry_schedule"

    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_2

    .line 21
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/r;->a()Lcom/ss/android/socialbase/downloader/impls/r;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-void
.end method

.method private b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->h(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p2, :cond_0

    const/4 p2, 0x7

    goto :goto_0

    :cond_0
    const/4 p2, 0x5

    .line 29
    :goto_0
    invoke-direct {p0, p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method

.method private b(J)Z
    .locals 8

    .line 22
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->m:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 23
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->m:Z

    return v1

    .line 24
    :cond_0
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->k:J

    sub-long v2, p1, v2

    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->o:J

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    iget v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->n:I

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 26
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->k:J

    .line 27
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    :cond_3
    return v1
.end method

.method private c(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Lcom/ss/android/socialbase/downloader/exception/BaseException;
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "download_failed_check_net"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x3f5

    goto :goto_0

    :cond_0
    const/16 v1, 0x419

    .line 9
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_1
    return-object p1
.end method

.method static synthetic c(Lcom/ss/android/socialbase/downloader/downloader/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->l()V

    return-void
.end method

.method static synthetic i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method private j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 12
    .line 13
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/f;->a:Lcom/ss/android/socialbase/downloader/constants/f;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadListeners(Lcom/ss/android/socialbase/downloader/constants/f;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->g:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 22
    .line 23
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/f;->c:Lcom/ss/android/socialbase/downloader/constants/f;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadListeners(Lcom/ss/android/socialbase/downloader/constants/f;)Landroid/util/SparseArray;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->i:Landroid/util/SparseArray;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 32
    .line 33
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/f;->b:Lcom/ss/android/socialbase/downloader/constants/f;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadListeners(Lcom/ss/android/socialbase/downloader/constants/f;)Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->h:Landroid/util/SparseArray;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDepend()Lcom/ss/android/socialbase/downloader/depend/n;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->p:Lcom/ss/android/socialbase/downloader/depend/n;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/x;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->q:Lcom/ss/android/socialbase/downloader/depend/x;

    .line 56
    .line 57
    :cond_0
    return-void
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

.method private k()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->l()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/f$1;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/downloader/downloader/f$1;-><init>(Lcom/ss/android/socialbase/downloader/downloader/f;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
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

.method private l()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "saveFileAsTargetName onSuccess"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->m()V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    .line 10
    .line 11
    :try_start_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSuccess(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSuccessByCache(Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, -0x3

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 74
    .line 75
    const-string v2, "onCompleted"

    .line 76
    .line 77
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/16 v2, 0x3f0

    .line 82
    .line 83
    invoke-direct {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-void
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

.method private m()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadCompleteHandlers()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {p0, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 22
    .line 23
    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/m;

    .line 41
    .line 42
    :try_start_0
    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/depend/m;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/depend/m;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 52
    .line 53
    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 59
    .line 60
    const/16 v2, 0x42f

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :catch_0
    move-exception v0

    .line 67
    throw v0

    .line 68
    :cond_1
    return-void
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


# virtual methods
.method public a()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->k()V

    return-void
.end method

.method public a(JLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->seteTag(Ljava/lang/String;)V

    .line 8
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setName(Ljava/lang/String;)V

    .line 10
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IJLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 11
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 p3, 0x3

    const/4 p4, 0x0

    .line 12
    invoke-direct {p0, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 13
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMinByteIntervalForPostToMainThread(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->o:J

    .line 14
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMinProgressTimeMsInterval()I

    move-result p1

    iput p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->n:I

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->j:Z

    .line 16
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/r;->a()Lcom/ss/android/socialbase/downloader/impls/r;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/impls/r;->e()V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 30
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 23
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 2

    .line 25
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 26
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 27
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/j;->h(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p3, :cond_0

    const/16 p1, 0xa

    goto :goto_0

    :cond_0
    const/16 p1, 0x9

    :goto_0
    const/4 p3, 0x1

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 31
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCompleteForFileExist existTargetFileName is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " but curName is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->b:Z

    const/4 v1, 0x0

    const/4 v2, -0x3

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->m()V

    .line 35
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSuccessByCache(Z)V

    .line 36
    invoke-direct {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 37
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v4}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 39
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    .line 40
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSuccessByCache(Z)V

    .line 41
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->m()V

    .line 42
    invoke-direct {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_0
    return-void
.end method

.method public a(J)Z
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseCurBytes(J)V

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->b(J)Z

    move-result v0

    .line 21
    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(JZ)Z

    move-result p1

    return p1
.end method

.method public b()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->changeSkipStatus()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->g(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x6

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :cond_1
    const/4 v0, 0x2

    .line 7
    invoke-direct {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method

.method public c()V
    .locals 2

    const/4 v0, -0x4

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method

.method public d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-interface {v0, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    const/4 v1, -0x7

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->j(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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

.method public f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "current bytes is not equals to total bytes, bytes changed with process : "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/16 v2, 0x403

    .line 68
    .line 69
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    const-wide/16 v2, 0x0

    .line 83
    .line 84
    cmp-long v0, v0, v2

    .line 85
    .line 86
    if-gtz v0, :cond_1

    .line 87
    .line 88
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v2, "curBytes is 0, bytes changed with process : "

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const/16 v2, 0x402

    .line 125
    .line 126
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    cmp-long v0, v0, v2

    .line 148
    .line 149
    if-gtz v0, :cond_2

    .line 150
    .line 151
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 154
    .line 155
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 163
    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v2, "TotalBytes is 0, bytes changed with process : "

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    const/16 v2, 0x414

    .line 188
    .line 189
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 197
    .line 198
    new-instance v1, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const-string v2, ""

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 209
    .line 210
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v2, " onCompleted start save file as target name"

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->q:Lcom/ss/android/socialbase/downloader/depend/x;

    .line 230
    .line 231
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 232
    .line 233
    if-eqz v1, :cond_3

    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/x;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :cond_3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 240
    .line 241
    new-instance v2, Lcom/ss/android/socialbase/downloader/downloader/f$2;

    .line 242
    .line 243
    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/downloader/downloader/f$2;-><init>(Lcom/ss/android/socialbase/downloader/downloader/f;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/depend/x;Lcom/ss/android/socialbase/downloader/depend/ai;)V

    .line 247
    .line 248
    .line 249
    return-void
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public g()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    const-string v4, "onCompleteForFileExist"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->m()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v4}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSuccessByCache(Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 57
    .line 58
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/f;->m()V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/f;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v4}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSuccessByCache(Z)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 107
    .line 108
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->d:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 126
    .line 127
    .line 128
    :goto_0
    return-void
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 9
    .line 10
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/a;->b:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setAsyncHandleStatus(Lcom/ss/android/socialbase/downloader/constants/a;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/f;->f:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getHashCodeForSameTask()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {v0, v2, v3, v1}, Lcom/ss/android/socialbase/downloader/impls/a;->a(III)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
