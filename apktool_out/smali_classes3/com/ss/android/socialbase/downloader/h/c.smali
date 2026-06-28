.class public Lcom/ss/android/socialbase/downloader/h/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/h/f;
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "c"


# instance fields
.field private A:Lcom/ss/android/socialbase/downloader/depend/r;

.field private volatile B:I

.field private C:Z

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Z

.field private G:J

.field private H:J

.field private final I:Lcom/ss/android/socialbase/downloader/g/a;

.field private J:I

.field private volatile K:Lcom/ss/android/socialbase/downloader/f/k;

.field private b:Ljava/util/concurrent/Future;

.field private final c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field private volatile d:Z

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ss/android/socialbase/downloader/h/b;",
            ">;"
        }
    .end annotation
.end field

.field private volatile g:Lcom/ss/android/socialbase/downloader/downloader/e;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile n:Lcom/ss/android/socialbase/downloader/constants/h;

.field private final o:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private q:Lcom/ss/android/socialbase/downloader/downloader/h;

.field private final r:Lcom/ss/android/socialbase/downloader/downloader/h;

.field private s:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private final t:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private u:Lcom/ss/android/socialbase/downloader/downloader/s;

.field private final v:Lcom/ss/android/socialbase/downloader/downloader/f;

.field private volatile w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private x:Lcom/ss/android/socialbase/downloader/network/i;

.field private y:Lcom/ss/android/socialbase/downloader/network/g;

.field private z:Lcom/ss/android/socialbase/downloader/depend/w;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->d:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    .line 13
    .line 14
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->a:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    iput v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->B:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->C:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->D:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    .line 26
    .line 27
    iput v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->J:I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getChunkStrategy()Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->q:Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->s:Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getForbiddenHandler()Lcom/ss/android/socialbase/downloader/depend/w;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->z:Lcom/ss/android/socialbase/downloader/depend/w;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDiskSpaceHandler()Lcom/ss/android/socialbase/downloader/depend/r;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->A:Lcom/ss/android/socialbase/downloader/depend/r;

    .line 65
    .line 66
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/s;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->u:Lcom/ss/android/socialbase/downloader/downloader/s;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    .line 90
    .line 91
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->h()V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 99
    .line 100
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->J()Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->r:Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 105
    .line 106
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->L()Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->t:Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 111
    .line 112
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 113
    .line 114
    invoke-direct {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Landroid/os/Handler;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 118
    .line 119
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 120
    .line 121
    const/4 p2, 0x1

    .line 122
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 126
    .line 127
    return-void
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

.method private A()J
    .locals 3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->u:Lcom/ss/android/socialbase/downloader/downloader/s;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTimeInTotal()I

    move-result v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalRetryCount()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method private B()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/i;,
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloaded()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 35
    .line 36
    const/16 v1, 0x3f1

    .line 37
    .line 38
    const-string v2, "file has downloaded"

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 45
    .line 46
    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->b(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eq v4, v0, :cond_4

    .line 63
    .line 64
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->equalsTask(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v3, v4}, Lcom/ss/android/socialbase/downloader/impls/a;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 83
    .line 84
    invoke-interface {v3, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(I)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 89
    .line 90
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 91
    .line 92
    .line 93
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 94
    .line 95
    invoke-interface {v4, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->f(I)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isBreakpointAvailable()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-virtual {v1, v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->copyFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 111
    .line 112
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 113
    .line 114
    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 115
    .line 116
    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lcom/ss/android/socialbase/downloader/model/b;

    .line 134
    .line 135
    invoke-virtual {v2, v0}, Lcom/ss/android/socialbase/downloader/model/b;->b(I)V

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 139
    .line 140
    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/b;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/i;

    .line 145
    .line 146
    const-string v1, "retry task because id generator changed"

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/exception/i;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 153
    .line 154
    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/j;->f(I)Z

    .line 155
    .line 156
    .line 157
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 158
    .line 159
    const/16 v1, 0x401

    .line 160
    .line 161
    const-string v2, "another same task is downloading"

    .line 162
    .line 163
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_4
    return-void
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

.method private C()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-le v0, v2, :cond_2

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkDowngradeRetryUsed()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->j:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->l:Z

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move v1, v2

    .line 43
    :cond_2
    :goto_0
    return v1
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

.method private D()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    iget-object v3, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 6
    .line 7
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/i/f;->d(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-wide v3, v1

    .line 17
    :goto_0
    sget-object v5, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v6, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v7, "checkSpaceOverflowInProgress: available = "

    .line 25
    .line 26
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v7, "MB"

    .line 37
    .line 38
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v5, v6}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    cmp-long v6, v3, v1

    .line 49
    .line 50
    if-lez v6, :cond_1

    .line 51
    .line 52
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 59
    .line 60
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 61
    .line 62
    .line 63
    move-result-wide v10

    .line 64
    sub-long/2addr v8, v10

    .line 65
    cmp-long v6, v3, v8

    .line 66
    .line 67
    if-gez v6, :cond_1

    .line 68
    .line 69
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 70
    .line 71
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-static {v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const-string v10, "space_fill_min_keep_mb"

    .line 80
    .line 81
    const/16 v11, 0x64

    .line 82
    .line 83
    invoke-virtual {v6, v10, v11}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-lez v6, :cond_1

    .line 88
    .line 89
    int-to-long v10, v6

    .line 90
    const-wide/32 v12, 0x100000

    .line 91
    .line 92
    .line 93
    mul-long/2addr v10, v12

    .line 94
    sub-long v10, v3, v10

    .line 95
    .line 96
    new-instance v14, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v15, "checkSpaceOverflowInProgress: minKeep  = "

    .line 102
    .line 103
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v6, "MB, canDownload = "

    .line 110
    .line 111
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-static {v10, v11}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v5, v6}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    cmp-long v5, v10, v1

    .line 132
    .line 133
    if-lez v5, :cond_0

    .line 134
    .line 135
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    const-wide/32 v3, 0x100000

    .line 142
    .line 143
    .line 144
    add-long/2addr v10, v3

    .line 145
    add-long/2addr v1, v10

    .line 146
    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    .line 147
    .line 148
    return-void

    .line 149
    :cond_0
    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    .line 150
    .line 151
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/d;

    .line 152
    .line 153
    invoke-direct {v1, v3, v4, v8, v9}, Lcom/ss/android/socialbase/downloader/exception/d;-><init>(JJ)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_1
    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    .line 158
    .line 159
    return-void
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

.method private E()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    aput-object v1, v2, v3

    .line 29
    .line 30
    const-string v1, "download task need permission:%s"

    .line 31
    .line 32
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/16 v2, 0x3fb

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadWithWifiValid()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveWithWifiValid()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/e;

    .line 60
    .line 61
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/e;-><init>()V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_3
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/c;

    .line 66
    .line 67
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/c;-><init>()V

    .line 68
    .line 69
    .line 70
    throw v0
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

.method private F()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_8

    .line 12
    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_7

    .line 24
    .line 25
    new-instance v0, Ljava/io/File;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_6

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_6

    .line 53
    .line 54
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "opt_mkdir_failed"

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/16 v3, 0x406

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    const-string v6, "download savePath directory can not created:"

    .line 75
    .line 76
    if-ne v2, v5, :cond_2

    .line 77
    .line 78
    :goto_0
    if-nez v1, :cond_0

    .line 79
    .line 80
    add-int/lit8 v2, v4, 0x1

    .line 81
    .line 82
    const/4 v5, 0x3

    .line 83
    if-ge v4, v5, :cond_0

    .line 84
    .line 85
    const-wide/16 v4, 0xa

    .line 86
    .line 87
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    move v4, v2

    .line 95
    goto :goto_0

    .line 96
    :catch_0
    :cond_0
    if-nez v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->d(Ljava/lang/String;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    const-wide/16 v4, 0x4000

    .line 115
    .line 116
    cmp-long v0, v0, v4

    .line 117
    .line 118
    if-gez v0, :cond_1

    .line 119
    .line 120
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 121
    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const/16 v2, 0x3ee

    .line 144
    .line 145
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 150
    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 160
    .line 161
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-direct {v0, v3, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0

    .line 176
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 177
    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 187
    .line 188
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v0, v3, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_6

    .line 208
    .line 209
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 210
    .line 211
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/d;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const/16 v2, 0x407

    .line 216
    .line 217
    if-eqz v1, :cond_5

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_6

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_4

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_4
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 236
    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v3, "download savePath is not directory:path="

    .line 243
    .line 244
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 248
    .line 249
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 265
    .line 266
    new-instance v1, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v3, "download savePath is not a directory:"

    .line 272
    .line 273
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 277
    .line 278
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_6
    :goto_1
    return-void

    .line 294
    :cond_7
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 295
    .line 296
    const/16 v1, 0x405

    .line 297
    .line 298
    const-string v2, "download name can not be empty"

    .line 299
    .line 300
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :cond_8
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 305
    .line 306
    const/16 v1, 0x404

    .line 307
    .line 308
    const-string v2, "download savePath can not be empty"

    .line 309
    .line 310
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0
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

.method private G()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sget-object v4, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v5, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v6, "checkTaskCanResume: offset = "

    .line 25
    .line 26
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v6, ", curBytes = "

    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v4, v2}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v2, 0x0

    .line 53
    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-lez v0, :cond_1

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x0

    .line 61
    :goto_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 70
    .line 71
    const-string v1, "checkTaskCanResume: deleteAllDownloadFiles"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 88
    .line 89
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 99
    .line 100
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-void
    .line 104
    .line 105
    .line 106
.end method

.method private H()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "clearCurrentDownloadData::"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/lang/Throwable;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 61
    .line 62
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 63
    .line 64
    const-string v1, ""

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetDataForEtagEndure(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 72
    .line 73
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 79
    .line 80
    .line 81
    :goto_0
    return-void
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

.method private I()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/ss/android/socialbase/downloader/h/b;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/h/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    sget-object v1, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "cancelAllChunkRunnable: "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
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

.method private J()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/a;->l(I)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method private K()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private a(JLjava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/b;",
            ">;)I"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->C()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 17
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    .line 18
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    goto :goto_1

    .line 19
    :cond_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result p3

    goto :goto_1

    .line 20
    :cond_1
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->q:Lcom/ss/android/socialbase/downloader/downloader/h;

    if-eqz p3, :cond_2

    .line 21
    invoke-interface {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/h;->a(J)I

    move-result p3

    goto :goto_0

    .line 22
    :cond_2
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->r:Lcom/ss/android/socialbase/downloader/downloader/h;

    invoke-interface {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/h;->a(J)I

    move-result p3

    .line 23
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/k;->a()Lcom/ss/android/socialbase/downloader/network/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/k;->b()Lcom/ss/android/socialbase/downloader/network/l;

    move-result-object v0

    .line 24
    sget-object v3, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "NetworkQuality is : %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setNetworkQuality(Ljava/lang/String;)V

    .line 26
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->s:Lcom/ss/android/socialbase/downloader/downloader/g;

    if-eqz v3, :cond_3

    .line 27
    invoke-interface {v3, p3, v0}, Lcom/ss/android/socialbase/downloader/downloader/g;->a(ILcom/ss/android/socialbase/downloader/network/l;)I

    move-result p3

    goto :goto_1

    .line 28
    :cond_3
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->t:Lcom/ss/android/socialbase/downloader/downloader/g;

    invoke-interface {v3, p3, v0}, Lcom/ss/android/socialbase/downloader/downloader/g;->a(ILcom/ss/android/socialbase/downloader/network/l;)I

    move-result p3

    :goto_1
    if-gtz p3, :cond_5

    :cond_4
    move p3, v2

    .line 29
    :cond_5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 30
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v1

    const-string p1, "chunk count : %s for %s contentLen:%s"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    return p3
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/s;
    .locals 1

    .line 383
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getRetryDelayTimeCalculator()Lcom/ss/android/socialbase/downloader/downloader/s;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 384
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 385
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryDelayTimeArray()Ljava/lang/String;

    move-result-object p1

    .line 386
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 387
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/q;

    invoke-direct {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/q;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 388
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->M()Lcom/ss/android/socialbase/downloader/downloader/s;

    move-result-object p1

    return-object p1
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;J)Lcom/ss/android/socialbase/downloader/model/b;
    .locals 3

    .line 67
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/b$a;

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/model/b$a;-><init>(I)V

    const/4 v1, -0x1

    .line 68
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/b$a;->a(I)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 69
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/b$a;->a(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v0

    .line 70
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/b$a;->e(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/b$a;->b(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v0

    .line 72
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/b$a;->c(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v0

    .line 73
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v1

    sub-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/b$a;->d(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/b$a;->a()Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/b;I)Lcom/ss/android/socialbase/downloader/model/b;
    .locals 8

    .line 365
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    .line 366
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/b;->c(Z)J

    move-result-wide v2

    .line 367
    sget-object v4, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "reuseChunk retainLen:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " chunkIndex:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->f()Z

    move-result v4

    if-nez v4, :cond_1

    sget-wide v4, Lcom/ss/android/socialbase/downloader/constants/e;->f:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseChunkRunnable()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 369
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v2

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/model/b;->a(IJ)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 370
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/b;

    .line 371
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-interface {v4, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->b(Lcom/ss/android/socialbase/downloader/model/b;)V

    goto :goto_0

    .line 372
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    move v2, v0

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_7

    .line 373
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->f()Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v0

    .line 374
    :goto_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 375
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/b;

    if-eqz v3, :cond_5

    .line 376
    sget-object v4, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "check can checkUnCompletedChunk -- chunkIndex:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " currentOffset:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "  startOffset:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->l()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " contentLen:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->q()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v4

    if-ltz v4, :cond_4

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->i()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->c()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    move-object v1, v3

    goto :goto_3

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    if-eqz v1, :cond_7

    .line 378
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v2

    .line 379
    sget-object v4, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "unComplete chunk "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " curOffset:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " reuseChunk chunkIndex:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for subChunk:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v2

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v3

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v4

    invoke-interface {p1, v2, v3, v4, p2}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIII)V

    .line 381
    invoke-virtual {v1, p2}, Lcom/ss/android/socialbase/downloader/model/b;->c(I)V

    .line 382
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Z)V

    :cond_7
    return-object v1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/b;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ss/android/socialbase/downloader/model/b;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtraHeaders()Ljava/util/List;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/model/b;)Ljava/util/List;

    move-result-object p1

    .line 77
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/c;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v1

    const-string v2, "if-modified-since"

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/c;

    const-string v1, "download-tc21-1-15"

    invoke-direct {v0, v1, v1}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dcache::add head IF_MODIFIED_SINCE="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private a(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/b;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 81
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 82
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    invoke-direct {p0, p2, v0, v1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/util/List;J)V

    return-void

    .line 83
    :cond_0
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0x409

    invoke-direct {p1, v0, p2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p1
.end method

.method private a(JI)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    int-to-long v4, v3

    .line 84
    div-long v4, v1, v4

    .line 85
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v6

    .line 86
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-wide v11, v8

    :goto_0
    if-ge v10, v3, :cond_1

    add-int/lit8 v13, v3, -0x1

    if-ne v10, v13, :cond_0

    move-wide v13, v8

    goto :goto_1

    :cond_0
    add-long v13, v11, v4

    const-wide/16 v15, 0x1

    sub-long/2addr v13, v15

    .line 87
    :goto_1
    new-instance v15, Lcom/ss/android/socialbase/downloader/model/b$a;

    invoke-direct {v15, v6}, Lcom/ss/android/socialbase/downloader/model/b$a;-><init>(I)V

    .line 88
    invoke-virtual {v15, v10}, Lcom/ss/android/socialbase/downloader/model/b$a;->a(I)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v15

    .line 89
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/b$a;->a(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v15

    .line 90
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/b$a;->e(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v15

    .line 91
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/b$a;->b(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v15

    .line 92
    invoke-virtual {v15, v13, v14}, Lcom/ss/android/socialbase/downloader/model/b$a;->c(J)Lcom/ss/android/socialbase/downloader/model/b$a;

    move-result-object v13

    .line 93
    invoke-virtual {v13}, Lcom/ss/android/socialbase/downloader/model/b$a;->a()Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object v13

    .line 94
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v14, v0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-interface {v14, v13}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/b;)V

    add-long/2addr v11, v4

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 96
    :cond_1
    iget-object v4, v0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 97
    iget-object v4, v0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-interface {v4, v6, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 98
    invoke-direct {v0, v7, v1, v2}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/util/List;J)V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/h/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->J()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/h/c;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/b;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/model/b;->a(J)V

    .line 142
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 143
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 144
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/e;

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-object v3, v0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/downloader/e;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/h/f;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 145
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->t()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 182
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 183
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v0, 0x0

    .line 184
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 185
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetDataForEtagEndure(Ljava/lang/String;)V

    .line 186
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 187
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/i;

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/exception/i;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Ljava/lang/String;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_0

    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/a/a;->a()Lcom/ss/android/socialbase/downloader/network/a/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/network/a/a;->b(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/a/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 41
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/network/g;)V

    .line 42
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 43
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    goto/16 :goto_4

    .line 44
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedDefaultHttpServiceBackUp()Z

    move-result v2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 45
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMaxBytes()I

    move-result v3

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v4, "net_lib_strategy"

    .line 46
    invoke-virtual {v0, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v7

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v4, "monitor_download_connect"

    const/4 v6, 0x0

    .line 47
    invoke-virtual {v0, v4, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_3

    move v8, v1

    goto :goto_1

    :cond_3
    move v8, v6

    :goto_1
    iget-object v9, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-object v4, p1

    move-object v6, p2

    .line 48
    invoke-static/range {v2 .. v9}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    .line 49
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->g(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/i/f;->c(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 50
    sget-object p1, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "dcache=execepiton responseCode=304 lastModified not changed, use local file.. old cacheControl="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 51
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCacheControl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 52
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCacheControl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_4

    .line 54
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string p2, "default_304_max_age"

    const/16 v0, 0x12c

    invoke-virtual {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p1

    int-to-long p1, p1

    .line 55
    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr p1, v3

    add-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheExpiredTime(J)V

    .line 56
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/a;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/exception/a;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_5
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->f(Ljava/lang/Throwable;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, ""

    if-eqz p2, :cond_6

    :try_start_2
    const-string p1, "http code 416"

    .line 58
    invoke-direct {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 59
    :cond_6
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->e(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p1, "http code 412"

    .line 60
    invoke-direct {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string p2, "CreateFirstConnection"

    .line 61
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :goto_2
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    :goto_3
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/network/g;)V

    .line 63
    :goto_4
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz p1, :cond_8

    return-void

    .line 64
    :cond_8
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "download can\'t continue, firstConnection is null"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3fe

    invoke-direct {p1, v0, p2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p1

    :catch_0
    move-exception p1

    .line 65
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 66
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-virtual {p0, p2}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/network/g;)V

    throw p1
.end method

.method private a(Ljava/lang/String;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/h/c;->b(Ljava/lang/String;Ljava/util/List;J)V

    .line 32
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    if-eqz v0, :cond_0

    .line 33
    :try_start_0
    invoke-virtual {p0, p1, v0, p3, p4}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->D:Z

    .line 35
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->D:Z

    if-eqz v0, :cond_2

    .line 36
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;J)V

    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 278
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/h;->g:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setForbiddenBackupUrls(Ljava/util/List;Z)V

    .line 280
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 281
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/impls/a;->l(I)Z

    :cond_2
    :goto_1
    return-void
.end method

.method private a(Ljava/util/List;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/b;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 99
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/model/b;

    if-nez v0, :cond_1

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    .line 101
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v1

    sub-long v1, p2, v1

    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v5

    sub-long/2addr v1, v5

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    :goto_1
    cmp-long v3, v1, v3

    if-gtz v3, :cond_3

    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/b;->a(J)V

    .line 104
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseFirstConnection()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isHeadConnectionAvailable()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->D:Z

    if-eqz v1, :cond_6

    .line 105
    :cond_4
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v1

    if-nez v1, :cond_5

    .line 106
    new-instance v1, Lcom/ss/android/socialbase/downloader/h/b;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-direct {v1, v0, v2, v3, p0}, Lcom/ss/android/socialbase/downloader/h/b;-><init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/h/f;)V

    .line 107
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 108
    :cond_5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v1

    if-lez v1, :cond_0

    .line 109
    new-instance v1, Lcom/ss/android/socialbase/downloader/h/b;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-direct {v1, v0, v2, p0}, Lcom/ss/android/socialbase/downloader/h/b;-><init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/h/f;)V

    .line 110
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 111
    :cond_6
    new-instance v1, Lcom/ss/android/socialbase/downloader/h/b;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-direct {v1, v0, v2, p0}, Lcom/ss/android/socialbase/downloader/h/b;-><init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/h/f;)V

    .line 112
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    const/16 p1, 0x40

    .line 113
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 114
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ss/android/socialbase/downloader/h/b;

    .line 116
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v0, v1, :cond_8

    .line 117
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/h/b;->b()V

    goto :goto_2

    .line 118
    :cond_8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v0, v1, :cond_9

    .line 119
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/h/b;->a()V

    goto :goto_2

    .line 120
    :cond_9
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    const/4 p2, 0x0

    .line 121
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    .line 122
    :try_start_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/e;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_3
    if-eqz p2, :cond_c

    .line 123
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p3, :cond_b

    return-void

    .line 124
    :cond_b
    :try_start_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    .line 125
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 126
    :goto_4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/e;->e(Ljava/util/List;)Ljava/lang/Runnable;

    move-result-object p2

    goto :goto_3

    :cond_c
    if-eqz p1, :cond_13

    .line 127
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_13

    .line 128
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catchall_1
    :cond_d
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Future;

    if-eqz p2, :cond_d

    .line 129
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez p3, :cond_d

    .line 130
    :try_start_3
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    .line 131
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_11

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ss/android/socialbase/downloader/h/b;

    .line 133
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v0, v1, :cond_f

    .line 134
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/h/b;->b()V

    goto :goto_6

    .line 135
    :cond_f
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v0, v1, :cond_10

    .line 136
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/h/b;->a()V

    goto :goto_6

    .line 137
    :cond_10
    invoke-static {p3}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;)Ljava/util/concurrent/Callable;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 138
    :cond_11
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    move-result p2

    if-eqz p2, :cond_12

    return-void

    .line 139
    :cond_12
    :try_start_4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/e;->c(Ljava/util/List;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    :catchall_2
    :cond_13
    return-void

    :catch_0
    move-exception p1

    .line 140
    new-instance p2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 p3, 0x3fc

    invoke-direct {p2, p3, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/16 v0, 0x19c

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    .line 179
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->k:Z

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->j:Z

    if-eqz p2, :cond_2

    :cond_1
    return v1

    :cond_2
    const/16 p2, 0xc9

    if-eq p1, p2, :cond_3

    const/16 p2, 0x1a0

    if-ne p1, p2, :cond_4

    .line 180
    :cond_3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide p1

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-lez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private b(Ljava/lang/String;Ljava/util/List;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 11
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result p3

    const/4 p4, 0x1

    if-ne p3, p4, :cond_0

    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/a/a;->a()Lcom/ss/android/socialbase/downloader/network/a/a;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/network/a/a;->a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/a/c;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 13
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    .line 14
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3, p4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 15
    :cond_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    if-nez p3, :cond_2

    iget-boolean p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->D:Z

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isHeadConnectionAvailable()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 16
    :try_start_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v0, "net_lib_strategy"

    .line 17
    invoke-virtual {p3, v0}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result p3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v1, "monitor_download_connect"

    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    move p4, v2

    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 19
    invoke-static {p1, p2, p3, p4, v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/g;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 20
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->j(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHeadConnectionException(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v2, 0x0

    if-lez v0, :cond_0

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x42e

    if-eq v0, v3, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->trySwitchToNextBackupUrl()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlRetryCount()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 7
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_5

    .line 8
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x3f3

    if-eq v0, v3, :cond_2

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_5

    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canReplaceHttpForRetry()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 11
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    .line 12
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpsToHttpRetryUsed(Z)V

    :goto_0
    move v1, v2

    .line 13
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->f:Lcom/ss/android/socialbase/downloader/constants/h;

    if-eq p1, v0, :cond_4

    if-eqz v1, :cond_4

    .line 14
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    :cond_4
    return v2

    .line 15
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    const/4 v2, 0x2

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    const-string p1, "retry for exception, but current retry time : %s , retry Time %s all used, last error is %s"

    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return v1

    .line 16
    :cond_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retry for exception, but retain retry time is null, last error is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x413

    invoke-direct {v0, v2, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return v1
.end method

.method private h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTime()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
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

.method private i()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    const/4 v1, -0x2

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v1, -0x4

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v3, "The download Task can\'t start, because its status is not prepare:"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/16 v2, 0x3e8

    .line 44
    .line 45
    invoke-direct {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    return v0

    .line 53
    :cond_1
    return v1
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

.method private j()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/a;
        }
    .end annotation

    .line 1
    const-string v0, "fix_file_exist_update_download_info"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    .line 6
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 11
    .line 12
    if-eqz v3, :cond_7

    .line 13
    .line 14
    const/16 v3, 0x800

    .line 15
    .line 16
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 23
    .line 24
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->e()Z

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 28
    .line 29
    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->b(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_6

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNewTask()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 45
    .line 46
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 51
    .line 52
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMd5()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iget-object v7, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 57
    .line 58
    invoke-virtual {v7, v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->copyFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 59
    .line 60
    .line 61
    const/16 v7, 0x1000

    .line 62
    .line 63
    invoke-static {v7}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    iget-object v7, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 70
    .line 71
    if-eq v3, v7, :cond_2

    .line 72
    .line 73
    move v7, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move v7, v1

    .line 76
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    invoke-static {v3, v1, v6}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZLjava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v5
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    if-nez v5, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :try_start_2
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/a;

    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/exception/a;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    :catchall_0
    move-exception v2

    .line 104
    goto :goto_2

    .line 105
    :catch_0
    move-exception v2

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    :goto_1
    :try_start_3
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    .line 108
    .line 109
    .line 110
    move-result v3
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 111
    if-eq v3, v2, :cond_5

    .line 112
    .line 113
    :try_start_4
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 114
    .line 115
    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->f(I)Z
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :catch_1
    move-exception v2

    .line 120
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_5
    move v4, v7

    .line 125
    goto :goto_5

    .line 126
    :catchall_1
    move-exception v2

    .line 127
    move v4, v1

    .line 128
    :goto_2
    move v1, v7

    .line 129
    goto :goto_6

    .line 130
    :catch_2
    move-exception v2

    .line 131
    move v4, v1

    .line 132
    :goto_3
    move v1, v7

    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_6
    :goto_4
    :try_start_6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->reset()V
    :try_end_6
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    move v4, v1

    .line 142
    :goto_5
    :try_start_7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->h()V
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 143
    .line 144
    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    :try_start_8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 148
    .line 149
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 150
    .line 151
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_4

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :catchall_2
    move-exception v2

    .line 156
    move v9, v4

    .line 157
    move v4, v1

    .line 158
    move v1, v9

    .line 159
    goto :goto_6

    .line 160
    :catch_3
    move-exception v2

    .line 161
    move v9, v4

    .line 162
    move v4, v1

    .line 163
    move v1, v9

    .line 164
    goto :goto_8

    .line 165
    :catchall_3
    move-exception v2

    .line 166
    move v4, v1

    .line 167
    :goto_6
    :try_start_9
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 168
    .line 169
    if-eqz v3, :cond_8

    .line 170
    .line 171
    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 172
    .line 173
    if-eqz v5, :cond_8

    .line 174
    .line 175
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/x;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 180
    .line 181
    new-instance v6, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 182
    .line 183
    const-string v7, "checkTaskCache"

    .line 184
    .line 185
    invoke-static {v2, v7}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const/16 v7, 0x3eb

    .line 190
    .line 191
    invoke-direct {v6, v7, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 195
    .line 196
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-static {v3, v5, v6, v2}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/depend/x;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 201
    .line 202
    .line 203
    :cond_8
    if-eqz v1, :cond_a

    .line 204
    .line 205
    if-eqz v4, :cond_9

    .line 206
    .line 207
    :try_start_a
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    .line 208
    .line 209
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    :cond_9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 216
    .line 217
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 218
    .line 219
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_4

    .line 220
    .line 221
    .line 222
    goto :goto_7

    .line 223
    :catch_4
    move-exception v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 225
    .line 226
    .line 227
    :cond_a
    :goto_7
    return-void

    .line 228
    :catch_5
    move-exception v2

    .line 229
    move v4, v1

    .line 230
    :goto_8
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 231
    :catchall_4
    move-exception v2

    .line 232
    if-eqz v1, :cond_c

    .line 233
    .line 234
    if-eqz v4, :cond_b

    .line 235
    .line 236
    :try_start_c
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_c

    .line 243
    .line 244
    :cond_b
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 245
    .line 246
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 247
    .line 248
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_6

    .line 249
    .line 250
    .line 251
    goto :goto_9

    .line 252
    :catch_6
    move-exception v0

    .line 253
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 254
    .line 255
    .line 256
    :cond_c
    :goto_9
    throw v2
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

.method private k()V
    .locals 7

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->H:J

    .line 13
    .line 14
    cmp-long v3, v3, v0

    .line 15
    .line 16
    if-lez v3, :cond_0

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-wide v5, p0, Lcom/ss/android/socialbase/downloader/h/c;->H:J

    .line 23
    .line 24
    sub-long/2addr v3, v5

    .line 25
    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseDownloadPrepareTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getInterceptor()Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;->intercepte()Z

    .line 37
    .line 38
    .line 39
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->e()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_1
    move-exception v2

    .line 49
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->i()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/x;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 65
    .line 66
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 67
    .line 68
    const/16 v3, 0x3eb

    .line 69
    .line 70
    const-string v4, "task status is invalid"

    .line 71
    .line 72
    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v3, 0x0

    .line 85
    :goto_0
    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/depend/x;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->l()V

    .line 90
    .line 91
    .line 92
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->C:Z

    .line 93
    .line 94
    if-nez v2, :cond_4

    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_4
    iget v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->B:I

    .line 99
    .line 100
    if-lez v2, :cond_5

    .line 101
    .line 102
    iget v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->B:I

    .line 103
    .line 104
    add-int/lit8 v2, v2, -0x1

    .line 105
    .line 106
    iput v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->B:I

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 116
    .line 117
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    cmp-long v2, v2, v4

    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 137
    .line 138
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 139
    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v3, "current bytes is not equals to total bytes, bytes invalid retry status is : "

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/16 v3, 0x403

    .line 164
    .line 165
    invoke-direct {v1, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 175
    .line 176
    .line 177
    move-result-wide v2

    .line 178
    cmp-long v2, v2, v0

    .line 179
    .line 180
    if-gtz v2, :cond_7

    .line 181
    .line 182
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 183
    .line 184
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 185
    .line 186
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 194
    .line 195
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 196
    .line 197
    new-instance v2, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v3, "curBytes is 0, bytes invalid retry status is : "

    .line 203
    .line 204
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 208
    .line 209
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const/16 v3, 0x402

    .line 221
    .line 222
    invoke-direct {v1, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    cmp-long v2, v2, v0

    .line 236
    .line 237
    if-gtz v2, :cond_3

    .line 238
    .line 239
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 240
    .line 241
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 242
    .line 243
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 251
    .line 252
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 253
    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const-string v3, "TotalBytes is 0, bytes invalid retry status is : "

    .line 260
    .line 261
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 265
    .line 266
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v3, 0x414

    .line 278
    .line 279
    invoke-direct {v1, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 283
    .line 284
    .line 285
    :goto_2
    return-void

    .line 286
    :catchall_2
    move-exception v0

    .line 287
    throw v0
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

.method private l()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->a:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 4
    .line 5
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 6
    .line 7
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateStartDownloadTime()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetRealStartDownloadTime()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    .line 23
    const-wide/16 v4, -0x1

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x0

    .line 30
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->j()V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 31
    .line 32
    .line 33
    move v0, v5

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object v6, v0

    .line 37
    :try_start_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v7, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v8, "file exist "

    .line 45
    .line 46
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/exception/a;->a()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v0, v7}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/exception/a;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    .line 68
    .line 69
    move v0, v4

    .line 70
    :goto_0
    iget-boolean v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->C:Z

    .line 71
    .line 72
    if-nez v6, :cond_0

    .line 73
    .line 74
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 75
    .line 76
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/downloader/f;->b()V

    .line 77
    .line 78
    .line 79
    :cond_0
    iput-boolean v5, v1, Lcom/ss/android/socialbase/downloader/h/c;->C:Z

    .line 80
    .line 81
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 82
    .line 83
    .line 84
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 85
    if-eqz v6, :cond_1

    .line 86
    .line 87
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    :try_start_3
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_3

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput-boolean v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    .line 116
    .line 117
    :cond_2
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    .line 118
    .line 119
    if-nez v0, :cond_3

    .line 120
    .line 121
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->m()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 122
    .line 123
    .line 124
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    :goto_1
    :try_start_4
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 129
    .line 130
    .line 131
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    :try_start_5
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->F()V

    .line 139
    .line 140
    .line 141
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->B()V

    .line 142
    .line 143
    .line 144
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->E()V

    .line 145
    .line 146
    .line 147
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 148
    .line 149
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 150
    .line 151
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    invoke-interface {v0, v8}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(I)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->G()V

    .line 160
    .line 161
    .line 162
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->n()Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_5

    .line 167
    .line 168
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 169
    .line 170
    const-string v8, "downloadSegments return"

    .line 171
    .line 172
    invoke-static {v0, v8}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 173
    .line 174
    .line 175
    :try_start_6
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 176
    .line 177
    .line 178
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_5
    :try_start_7
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 183
    .line 184
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getConnectionUrl()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 189
    .line 190
    .line 191
    move-result v9
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_7 .. :try_end_7} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 192
    if-eqz v9, :cond_6

    .line 193
    .line 194
    :try_start_8
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 195
    .line 196
    .line 197
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_6
    :try_start_9
    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 202
    .line 203
    if-eqz v9, :cond_7

    .line 204
    .line 205
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 206
    .line 207
    invoke-static {v9}, Lcom/ss/android/socialbase/downloader/i/f;->e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v9

    .line 211
    goto :goto_2

    .line 212
    :cond_7
    const-wide/16 v9, 0x0

    .line 213
    .line 214
    :goto_2
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 215
    .line 216
    invoke-static {v11, v9, v10}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;J)Lcom/ss/android/socialbase/downloader/model/b;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-direct {v1, v11}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/model/b;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 225
    .line 226
    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 227
    .line 228
    .line 229
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 230
    .line 231
    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 232
    .line 233
    .line 234
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 235
    .line 236
    invoke-virtual {v13, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 240
    .line 241
    .line 242
    move-result-wide v13
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_9 .. :try_end_9} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 243
    :try_start_a
    invoke-direct {v1, v8, v12, v9, v10}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/util/List;J)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 244
    .line 245
    .line 246
    :try_start_b
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 247
    .line 248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 249
    .line 250
    .line 251
    move-result-wide v15

    .line 252
    sub-long v6, v15, v13

    .line 253
    .line 254
    invoke-virtual {v9, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 255
    .line 256
    .line 257
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 258
    .line 259
    .line 260
    move-result v6
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_b .. :try_end_b} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 261
    if-eqz v6, :cond_8

    .line 262
    .line 263
    :try_start_c
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 264
    .line 265
    .line 266
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_8
    :try_start_d
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 271
    .line 272
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    invoke-virtual {v1, v6, v7}, Lcom/ss/android/socialbase/downloader/h/c;->a(J)V

    .line 277
    .line 278
    .line 279
    invoke-direct {v1, v6, v7, v0}, Lcom/ss/android/socialbase/downloader/h/c;->a(JLjava/util/List;)I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 284
    .line 285
    .line 286
    move-result v10
    :try_end_d
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_d .. :try_end_d} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_d .. :try_end_d} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 287
    if-eqz v10, :cond_9

    .line 288
    .line 289
    :try_start_e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 290
    .line 291
    .line 292
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_9
    if-lez v9, :cond_12

    .line 297
    .line 298
    if-ne v9, v4, :cond_a

    .line 299
    .line 300
    move v10, v4

    .line 301
    goto :goto_3

    .line 302
    :cond_a
    move v10, v5

    .line 303
    :goto_3
    :try_start_f
    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->h:Z

    .line 304
    .line 305
    if-eqz v10, :cond_d

    .line 306
    .line 307
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;
    :try_end_f
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_f .. :try_end_f} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_f .. :try_end_f} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 308
    .line 309
    if-nez v0, :cond_b

    .line 310
    .line 311
    :try_start_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 312
    .line 313
    .line 314
    move-result-wide v13

    .line 315
    invoke-direct {v1, v8, v12}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 316
    .line 317
    .line 318
    :try_start_11
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 319
    .line 320
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 321
    .line 322
    .line 323
    move-result-wide v6

    .line 324
    sub-long/2addr v6, v13

    .line 325
    invoke-virtual {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :catchall_0
    move-exception v0

    .line 330
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 331
    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 333
    .line 334
    .line 335
    move-result-wide v7

    .line 336
    sub-long/2addr v7, v13

    .line 337
    invoke-virtual {v6, v7, v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 338
    .line 339
    .line 340
    throw v0

    .line 341
    :cond_b
    :goto_4
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 342
    .line 343
    .line 344
    move-result v0
    :try_end_11
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_11 .. :try_end_11} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_11 .. :try_end_11} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 345
    if-eqz v0, :cond_c

    .line 346
    .line 347
    :try_start_12
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 348
    .line 349
    .line 350
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :cond_c
    :try_start_13
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 355
    .line 356
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 357
    .line 358
    .line 359
    move-result-wide v6

    .line 360
    sub-long/2addr v6, v2

    .line 361
    invoke-virtual {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    .line 362
    .line 363
    .line 364
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->o()V

    .line 365
    .line 366
    .line 367
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    .line 368
    .line 369
    invoke-direct {v1, v11, v8, v0}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/model/b;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;)V

    .line 370
    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_d
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 374
    .line 375
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseFirstConnection()Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-nez v8, :cond_e

    .line 380
    .line 381
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->r()V

    .line 382
    .line 383
    .line 384
    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 385
    .line 386
    .line 387
    move-result v8
    :try_end_13
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_13 .. :try_end_13} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 388
    if-eqz v8, :cond_f

    .line 389
    .line 390
    :try_start_14
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 391
    .line 392
    .line 393
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :cond_f
    :try_start_15
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->o()V

    .line 398
    .line 399
    .line 400
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 401
    .line 402
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 403
    .line 404
    .line 405
    move-result-wide v10

    .line 406
    sub-long/2addr v10, v2

    .line 407
    invoke-virtual {v8, v10, v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    .line 408
    .line 409
    .line 410
    iget-boolean v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->i:Z

    .line 411
    .line 412
    if-eqz v8, :cond_10

    .line 413
    .line 414
    invoke-direct {v1, v9, v0}, Lcom/ss/android/socialbase/downloader/h/c;->a(ILjava/util/List;)V

    .line 415
    .line 416
    .line 417
    goto :goto_5

    .line 418
    :cond_10
    invoke-direct {v1, v6, v7, v9}, Lcom/ss/android/socialbase/downloader/h/c;->a(JI)V
    :try_end_15
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_15 .. :try_end_15} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_15 .. :try_end_15} :catch_1
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 419
    .line 420
    .line 421
    :cond_11
    :goto_5
    :try_start_16
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 422
    .line 423
    .line 424
    goto/16 :goto_8

    .line 425
    .line 426
    :cond_12
    :try_start_17
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 427
    .line 428
    const-string v6, "chunkCount is 0"

    .line 429
    .line 430
    const/16 v7, 0x408

    .line 431
    .line 432
    invoke-direct {v0, v7, v6}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 433
    .line 434
    .line 435
    throw v0

    .line 436
    :catchall_1
    move-exception v0

    .line 437
    move-object v6, v0

    .line 438
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 439
    .line 440
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 441
    .line 442
    .line 443
    move-result-wide v7

    .line 444
    sub-long/2addr v7, v13

    .line 445
    invoke-virtual {v0, v7, v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 446
    .line 447
    .line 448
    throw v6
    :try_end_17
    .catch Lcom/ss/android/socialbase/downloader/exception/a; {:try_start_17 .. :try_end_17} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_17 .. :try_end_17} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 449
    :catchall_2
    move-exception v0

    .line 450
    :try_start_18
    sget-object v2, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 451
    .line 452
    new-instance v3, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    const-string v4, "downloadInner: throwable =  "

    .line 458
    .line 459
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 473
    .line 474
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 475
    .line 476
    if-eq v2, v3, :cond_11

    .line 477
    .line 478
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 479
    .line 480
    const/16 v3, 0x415

    .line 481
    .line 482
    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 486
    .line 487
    .line 488
    goto :goto_5

    .line 489
    :catch_1
    move-exception v0

    .line 490
    sget-object v6, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 491
    .line 492
    new-instance v7, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    const-string v8, "downloadInner: retry throwable for "

    .line 498
    .line 499
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/i;->a()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    invoke-static {v6, v7}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 517
    .line 518
    sget-object v7, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 519
    .line 520
    if-eq v6, v7, :cond_11

    .line 521
    .line 522
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 523
    .line 524
    const/4 v7, 0x5

    .line 525
    if-eqz v6, :cond_14

    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 528
    .line 529
    .line 530
    move-result v6

    .line 531
    if-lez v6, :cond_14

    .line 532
    .line 533
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 534
    .line 535
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 536
    .line 537
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    invoke-virtual {v0, v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    .line 542
    .line 543
    .line 544
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 545
    .line 546
    invoke-virtual {v0, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 547
    .line 548
    .line 549
    :cond_13
    :goto_6
    :try_start_19
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    .line 550
    .line 551
    .line 552
    goto/16 :goto_1

    .line 553
    .line 554
    :cond_14
    :try_start_1a
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 555
    .line 556
    if-eqz v6, :cond_16

    .line 557
    .line 558
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 559
    .line 560
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->trySwitchToNextBackupUrl()Z

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    if-eqz v6, :cond_15

    .line 565
    .line 566
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 567
    .line 568
    invoke-virtual {v0, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 569
    .line 570
    .line 571
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 572
    .line 573
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 574
    .line 575
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 580
    .line 581
    .line 582
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 583
    .line 584
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 585
    .line 586
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 587
    .line 588
    .line 589
    move-result v6

    .line 590
    invoke-virtual {v0, v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    .line 591
    .line 592
    .line 593
    goto :goto_6

    .line 594
    :cond_15
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 595
    .line 596
    const-string v3, "retry for Throwable, but retry Time %s all used, last error is %s"

    .line 597
    .line 598
    const/4 v6, 0x2

    .line 599
    new-array v6, v6, [Ljava/lang/Object;

    .line 600
    .line 601
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 602
    .line 603
    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    aput-object v7, v6, v5

    .line 612
    .line 613
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/i;->a()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    aput-object v0, v6, v4

    .line 618
    .line 619
    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    const/16 v3, 0x3fa

    .line 624
    .line 625
    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_5

    .line 632
    .line 633
    :cond_16
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 634
    .line 635
    new-instance v3, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 638
    .line 639
    .line 640
    const-string v4, "retry for Throwable, but retain retry time is NULL, last error is"

    .line 641
    .line 642
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/i;->a()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    const/16 v3, 0x413

    .line 657
    .line 658
    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_5

    .line 665
    .line 666
    :catch_2
    move-exception v0

    .line 667
    sget-object v6, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 668
    .line 669
    new-instance v7, Ljava/lang/StringBuilder;

    .line 670
    .line 671
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 672
    .line 673
    .line 674
    const-string v8, "downloadInner: baseException = "

    .line 675
    .line 676
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    invoke-static {v6, v7}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 690
    .line 691
    sget-object v7, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 692
    .line 693
    if-eq v6, v7, :cond_11

    .line 694
    .line 695
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    const/16 v7, 0x401

    .line 700
    .line 701
    if-eq v6, v7, :cond_1a

    .line 702
    .line 703
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    .line 704
    .line 705
    .line 706
    move-result v6

    .line 707
    const/16 v7, 0x3f1

    .line 708
    .line 709
    if-ne v6, v7, :cond_17

    .line 710
    .line 711
    goto :goto_7

    .line 712
    :cond_17
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    if-eqz v6, :cond_19

    .line 717
    .line 718
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    if-eqz v6, :cond_18

    .line 723
    .line 724
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->H()V

    .line 725
    .line 726
    .line 727
    :cond_18
    const-wide/16 v6, 0x0

    .line 728
    .line 729
    invoke-virtual {v1, v0, v6, v7}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    sget-object v6, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    .line 734
    .line 735
    if-ne v0, v6, :cond_13

    .line 736
    .line 737
    :try_start_1b
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    .line 738
    .line 739
    .line 740
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 741
    .line 742
    .line 743
    return-void

    .line 744
    :cond_19
    :try_start_1c
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_5

    .line 748
    .line 749
    :cond_1a
    :goto_7
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->e:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 750
    .line 751
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    .line 752
    .line 753
    :try_start_1d
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    .line 754
    .line 755
    .line 756
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :catch_3
    :try_start_1e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->m()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_3

    .line 761
    .line 762
    .line 763
    goto/16 :goto_5

    .line 764
    .line 765
    :goto_8
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :catchall_3
    move-exception v0

    .line 770
    :try_start_1f
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V

    .line 771
    .line 772
    .line 773
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    .line 774
    :catchall_4
    move-exception v0

    .line 775
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 776
    .line 777
    .line 778
    throw v0
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
.end method

.method private m()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "finishWithFileExist"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "fix_end_for_file_exist_error"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->e:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->h:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->e:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 60
    .line 61
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->h:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 67
    .line 68
    :goto_0
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

.method private n()Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v0, v2, :cond_8

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getThrottleNetSpeed()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v0, v3, v5

    .line 29
    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v3, "segment_config"

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/g/a;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 50
    .line 51
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-interface {v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/j;->n(I)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    cmp-long v4, v7, v5

    .line 68
    .line 69
    if-lez v4, :cond_4

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    if-nez v0, :cond_4

    .line 81
    .line 82
    new-instance v0, Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    :goto_0
    return v1

    .line 89
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 90
    .line 91
    return v1

    .line 92
    :cond_5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/f/n;->a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/f/n;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/k;

    .line 97
    .line 98
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 99
    .line 100
    invoke-direct {v1, v4, v0, p0}, Lcom/ss/android/socialbase/downloader/f/k;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/n;Lcom/ss/android/socialbase/downloader/h/f;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    .line 104
    .line 105
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 112
    .line 113
    const-string v1, "downloadSegments: is stopped by user"

    .line 114
    .line 115
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 119
    .line 120
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 121
    .line 122
    if-ne v0, v1, :cond_6

    .line 123
    .line 124
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/k;->a()V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/k;->b()V

    .line 133
    .line 134
    .line 135
    :goto_2
    return v2

    .line 136
    :cond_7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    .line 137
    .line 138
    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    return v0

    .line 143
    :cond_8
    :goto_3
    return v1
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

.method private o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "reset_retain_retry_times"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->J:I

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-ge v0, v2, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isBackUpUrlUsed()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlRetryCount()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->J:I

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    iput v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->J:I

    .line 56
    .line 57
    :cond_1
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

.method private p()V
    .locals 7

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "endDownloadRunnable::runStatus="

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 26
    .line 27
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 34
    .line 35
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 36
    .line 37
    if-eq v0, v1, :cond_0

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v0, v3

    .line 42
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->w()Z

    .line 43
    .line 44
    .line 45
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    move v4, v3

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception v1

    .line 49
    instance-of v4, v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 54
    .line 55
    check-cast v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 62
    .line 63
    new-instance v5, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 64
    .line 65
    const/16 v6, 0x416

    .line 66
    .line 67
    invoke-direct {v5, v6, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    move v1, v2

    .line 74
    move v4, v1

    .line 75
    :goto_2
    if-nez v1, :cond_3

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->C:Z

    .line 81
    .line 82
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v1, "jump to restart"

    .line 85
    .line 86
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 93
    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    :try_start_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->D()Lcom/ss/android/socialbase/downloader/impls/a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/impls/a;->a(Lcom/ss/android/socialbase/downloader/h/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/x;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 118
    .line 119
    new-instance v4, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 120
    .line 121
    const-string v5, "removeDownloadRunnable"

    .line 122
    .line 123
    invoke-static {v0, v5}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/16 v5, 0x3f6

    .line 128
    .line 129
    invoke-direct {v4, v5, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    :cond_4
    invoke-static {v1, v2, v4, v3}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/depend/x;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_4
    return-void
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

.method private q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->c()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->y:Lcom/ss/android/socialbase/downloader/network/g;

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private s()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->q()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->r()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private t()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 6
    .line 7
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    const/4 v1, -0x4

    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->c()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 24
    .line 25
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 30
    .line 31
    const/4 v1, -0x2

    .line 32
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->b()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->d()V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
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

.method private u()Z
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private v()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x2

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, -0x4

    .line 45
    if-ne v0, v1, :cond_3

    .line 46
    .line 47
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 50
    .line 51
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 52
    return v0
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

.method private w()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 2
    .line 3
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->d:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 18
    .line 19
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->c()V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 31
    .line 32
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 33
    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->d()V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 44
    .line 45
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->e:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 46
    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->g()V
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :catch_0
    move-exception v0

    .line 57
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 65
    .line 66
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->h:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 67
    .line 68
    if-ne v0, v1, :cond_4

    .line 69
    .line 70
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_1
    move-exception v0

    .line 79
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 86
    .line 87
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->i:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    if-ne v0, v1, :cond_5

    .line 91
    .line 92
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 95
    .line 96
    invoke-virtual {v0, v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 97
    .line 98
    .line 99
    return v3

    .line 100
    :cond_5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 101
    .line 102
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->g:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 103
    .line 104
    if-ne v0, v1, :cond_6

    .line 105
    .line 106
    return v2

    .line 107
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 108
    .line 109
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/h;->f:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 110
    .line 111
    if-ne v0, v1, :cond_8

    .line 112
    .line 113
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->x()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 120
    .line 121
    const-string v4, "doTaskStatusHandle retryDelay"

    .line 122
    .line 123
    invoke-static {v0, v4}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->z()V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 130
    .line 131
    if-ne v0, v1, :cond_7

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    move v2, v3

    .line 135
    :goto_0
    return v2

    .line 136
    :cond_8
    :try_start_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->y()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_9

    .line 141
    .line 142
    return v3

    .line 143
    :cond_9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->f()V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/r;->a()Lcom/ss/android/socialbase/downloader/impls/r;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/r;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 158
    .line 159
    const-string v3, "doTaskStatusHandle onComplete"

    .line 160
    .line 161
    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/16 v3, 0x3f0

    .line 166
    .line 167
    invoke-direct {v1, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 171
    .line 172
    .line 173
    :goto_1
    return v2
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

.method private x()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-gt v0, v2, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    cmp-long v0, v3, v5

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    cmp-long v0, v3, v5

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    return v1

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-interface {v0, v3}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(I)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-gt v3, v2, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lcom/ss/android/socialbase/downloader/model/b;

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->i()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    :cond_4
    return v1

    .line 87
    :cond_5
    return v2

    .line 88
    :cond_6
    :goto_0
    return v1
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

.method private y()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunked()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "checkCompletedByteValid: downloadInfo.getCurBytes() = "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ",  downloadInfo.getTotalBytes() = "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    const-wide/16 v2, 0x0

    .line 67
    .line 68
    cmp-long v0, v0, v2

    .line 69
    .line 70
    if-lez v0, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    cmp-long v0, v0, v2

    .line 87
    .line 88
    if-lez v0, :cond_2

    .line 89
    .line 90
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    cmp-long v0, v0, v2

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    const/4 v0, 0x1

    .line 108
    return v0

    .line 109
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 110
    .line 111
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/b;->b:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setByteInvalidRetryStatus(Lcom/ss/android/socialbase/downloader/constants/b;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->reset()V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 124
    .line 125
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 129
    .line 130
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->d(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 140
    .line 141
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->m(I)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 151
    .line 152
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 153
    .line 154
    .line 155
    const/4 v0, 0x0

    .line 156
    return v0
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

.method private z()V
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->a:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    return-void
.end method


# virtual methods
.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;
    .locals 9

    .line 298
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 299
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    neg-long p2, p2

    invoke-virtual {v0, p2, p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseCurBytes(J)V

    .line 300
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 301
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->u()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 302
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    :cond_0
    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_3

    .line 303
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v1, 0x417

    if-ne v0, v1, :cond_3

    .line 304
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->z:Lcom/ss/android/socialbase/downloader/depend/w;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 305
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/h/c$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/h/c$1;-><init>(Lcom/ss/android/socialbase/downloader/h/c;)V

    .line 306
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->z:Lcom/ss/android/socialbase/downloader/depend/w;

    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/downloader/depend/w;->a(Lcom/ss/android/socialbase/downloader/depend/v;)Z

    move-result v1

    .line 307
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setForbiddenRetryed()V

    if-eqz v1, :cond_d

    .line 308
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/depend/b;->a()Z

    move-result v0

    if-nez v0, :cond_9

    .line 309
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    .line 310
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->h()V

    .line 311
    sget-object p1, Lcom/ss/android/socialbase/downloader/constants/h;->g:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 312
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    .line 313
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 314
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    .line 315
    :cond_3
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 316
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->A:Lcom/ss/android/socialbase/downloader/depend/r;

    if-nez v0, :cond_4

    .line 317
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 318
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    .line 319
    :cond_4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 320
    new-instance v6, Lcom/ss/android/socialbase/downloader/h/c$2;

    invoke-direct {v6, p0, v0}, Lcom/ss/android/socialbase/downloader/h/c$2;-><init>(Lcom/ss/android/socialbase/downloader/h/c;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 321
    instance-of v1, p1, Lcom/ss/android/socialbase/downloader/exception/d;

    if-eqz v1, :cond_5

    .line 322
    move-object v1, p1

    check-cast v1, Lcom/ss/android/socialbase/downloader/exception/d;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/exception/d;->a()J

    move-result-wide v2

    .line 323
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/exception/d;->b()J

    move-result-wide v4

    goto :goto_1

    .line 324
    :cond_5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    move-wide v7, v1

    move-wide v2, v3

    move-wide v4, v7

    .line 325
    :goto_1
    monitor-enter p0

    .line 326
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->A:Lcom/ss/android/socialbase/downloader/depend/r;

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/depend/r;->a(JJLcom/ss/android/socialbase/downloader/depend/q;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 327
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v1

    const-string v2, "not_delete_when_clean_space"

    invoke-virtual {v1, v2, p3}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_6

    .line 328
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->y()Z

    .line 329
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_8

    .line 330
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object p2, Lcom/ss/android/socialbase/downloader/constants/h;->g:Lcom/ss/android/socialbase/downloader/constants/h;

    if-eq p1, p2, :cond_7

    .line 331
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 332
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    .line 333
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/f;->h()V

    .line 334
    :cond_7
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    monitor-exit p0

    return-object p1

    .line 335
    :cond_8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 337
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    :cond_9
    move v0, p2

    goto :goto_2

    .line 338
    :cond_a
    :try_start_1
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object p3, Lcom/ss/android/socialbase/downloader/constants/h;->g:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne p2, p3, :cond_b

    .line 339
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    monitor-exit p0

    return-object p1

    .line 340
    :cond_b
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 341
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 342
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 343
    :cond_c
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 344
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    :cond_d
    move v0, p3

    :goto_2
    if-nez v0, :cond_e

    .line 345
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->K()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 346
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    .line 347
    :cond_e
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/h;->f:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne v1, v2, :cond_f

    goto :goto_3

    :cond_f
    move p2, p3

    :goto_3
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 348
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne p1, v2, :cond_10

    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    goto :goto_4

    :cond_10
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->b:Lcom/ss/android/socialbase/downloader/exception/h;

    :goto_4
    return-object p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;
    .locals 2

    .line 282
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    :cond_0
    if-eqz p2, :cond_2

    .line 284
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v1, 0x417

    if-eq v0, v1, :cond_1

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 285
    :cond_1
    invoke-virtual {p0, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;

    move-result-object p1

    return-object p1

    .line 286
    :cond_2
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 287
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    neg-long p3, p3

    invoke-virtual {v0, p3, p4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseCurBytes(J)V

    .line 288
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object p4, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 289
    invoke-direct {p0, p2}, Lcom/ss/android/socialbase/downloader/h/c;->d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 290
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1

    .line 291
    :cond_3
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    iget-object p4, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->f:Lcom/ss/android/socialbase/downloader/constants/h;

    if-ne p4, v0, :cond_4

    const/4 p4, 0x1

    goto :goto_0

    :cond_4
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p3, p1, p2, p4}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 292
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    if-eq p1, v0, :cond_5

    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedRetryDelay()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 293
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->A()J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-lez p3, :cond_5

    .line 294
    sget-object p3, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onSingleChunkRetry with delay time "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 296
    sget-object p2, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "onSingleChunkRetry:"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    :cond_5
    :goto_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/h;->b:Lcom/ss/android/socialbase/downloader/exception/h;

    return-object p1
.end method

.method public declared-synchronized a(I)Lcom/ss/android/socialbase/downloader/model/b;
    .locals 4

    monitor-enter p0

    .line 349
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 350
    monitor-exit p0

    return-object v2

    .line 351
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->o:Lcom/ss/android/socialbase/downloader/downloader/j;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 352
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    .line 353
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 354
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/b;

    if-nez v3, :cond_2

    goto :goto_1

    .line 355
    :cond_2
    invoke-direct {p0, v3, p1}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/model/b;I)Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_3

    .line 356
    monitor-exit p0

    return-object v3

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 357
    :cond_4
    monitor-exit p0

    return-object v2

    .line 358
    :cond_5
    :goto_2
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a()V
    .locals 2

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->b:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/k;->b()V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/downloader/e;->b()V

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-nez v1, :cond_2

    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V

    .line 10
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 11
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 12
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/h/b;

    if-eqz v1, :cond_3

    .line 14
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/h/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    return-void
.end method

.method public a(J)V
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    const-string v0, "MB"

    const-string v4, ", mustSetLength = "

    .line 146
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v5

    .line 147
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    move-result-object v6

    .line 148
    invoke-static/range {p1 .. p2}, Lcom/ss/android/socialbase/downloader/i/f;->b(J)Z

    move-result v7

    if-eqz v7, :cond_0

    return-void

    .line 149
    :cond_0
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v8, -0x1

    invoke-static {v7, v5, v6, v8}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/e;

    move-result-object v7

    const/4 v8, 0x0

    .line 150
    :try_start_0
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->length()J

    move-result-wide v10

    sub-long v12, v2, v10

    .line 151
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/i/f;->d(Ljava/lang/String;)J

    move-result-wide v5

    .line 152
    iget-object v14, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v14}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v14

    invoke-static {v14}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v14

    const-string v15, "space_fill_part_download"

    .line 153
    invoke-virtual {v14, v15, v8}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-string v8, " 0"

    const-string v16, "="

    const-string v17, "<"

    const-string v9, "availableSpace "

    move-object/from16 v18, v4

    move-wide/from16 v19, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    if-ne v15, v6, :cond_7

    .line 154
    :try_start_1
    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    cmp-long v6, v12, v4

    if-gtz v6, :cond_1

    .line 155
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v12

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v21

    sub-long v12, v12, v21

    :cond_1
    cmp-long v6, v19, v12

    if-gez v6, :cond_a

    .line 156
    sget-object v6, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "checkSpaceOverflow: contentLength = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p2}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, downloaded = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    invoke-static {v10, v11}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, required = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, available = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    invoke-static/range {v19 .. v20}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 160
    invoke-static {v6, v4}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v15, v19, v4

    if-lez v15, :cond_4

    const-string v4, "space_fill_min_keep_mb"

    const/16 v5, 0x64

    .line 161
    invoke-virtual {v14, v4, v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v4

    if-lez v4, :cond_3

    int-to-long v8, v4

    const-wide/32 v14, 0x100000

    mul-long/2addr v8, v14

    sub-long v8, v19, v8

    .line 162
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "checkSpaceOverflow: minKeep = "

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "MB, canDownload = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-static {v8, v9}, Lcom/ss/android/socialbase/downloader/i/f;->a(J)D

    move-result-wide v14

    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-static {v6, v0}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v0, v8, v4

    if-lez v0, :cond_2

    .line 165
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v4

    add-long/2addr v4, v8

    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    move-wide v5, v8

    goto :goto_0

    .line 166
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/d;

    move-wide/from16 v4, v19

    invoke-direct {v0, v4, v5, v12, v13}, Lcom/ss/android/socialbase/downloader/exception/d;-><init>(JJ)V

    throw v0

    :cond_3
    move-wide/from16 v4, v19

    move-wide v5, v4

    :goto_0
    cmp-long v0, v10, v2

    if-gez v0, :cond_a

    add-long/2addr v5, v10

    cmp-long v0, v5, v2

    if-lez v0, :cond_b

    goto :goto_3

    :cond_4
    const-string v0, "download_when_space_negative"

    const/4 v4, 0x0

    .line 167
    invoke-virtual {v14, v0, v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_5

    move-wide v5, v2

    const/4 v4, 0x0

    goto :goto_4

    .line 168
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v15, :cond_6

    move-object/from16 v3, v16

    goto :goto_1

    :cond_6
    move-object/from16 v3, v17

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x41c

    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_7
    move-wide v14, v4

    move-wide/from16 v4, v19

    cmp-long v0, v4, v14

    if-gtz v0, :cond_9

    .line 169
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_8

    move-object/from16 v0, v16

    goto :goto_2

    :cond_8
    move-object/from16 v0, v17

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x41c

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :cond_9
    cmp-long v0, v4, v12

    if-ltz v0, :cond_f

    :cond_a
    :goto_3
    move-wide v5, v2

    :cond_b
    const/4 v4, 0x1

    .line 170
    :goto_4
    :try_start_2
    invoke-virtual {v7, v2, v3}, Lcom/ss/android/socialbase/downloader/model/e;->b(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    const/4 v2, 0x1

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v8, v0

    .line 171
    :try_start_3
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "checkSpaceOverflow: setLength1 e = "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v12, v18

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    cmp-long v0, v5, v2

    const/16 v2, 0x410

    if-gez v0, :cond_d

    const-wide/16 v13, 0x0

    cmp-long v0, v5, v13

    if-lez v0, :cond_d

    cmp-long v0, v5, v10

    if-lez v0, :cond_d

    .line 172
    :try_start_4
    invoke-virtual {v7, v5, v6}, Lcom/ss/android/socialbase/downloader/model/e;->b(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, v0

    .line 173
    :try_start_5
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkSpaceOverflow: setLength2 ex = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_c

    goto :goto_5

    .line 174
    :cond_c
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_d
    if-nez v4, :cond_e

    goto :goto_5

    :goto_6
    new-array v0, v2, [Ljava/io/Closeable;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 175
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    return-void

    .line 176
    :cond_e
    :try_start_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v0, v2, v8}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0

    .line 177
    :cond_f
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/d;

    invoke-direct {v0, v4, v5, v12, v13}, Lcom/ss/android/socialbase/downloader/exception/d;-><init>(JJ)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    .line 178
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    throw v0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 2

    .line 272
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    const-string v1, "onAllChunkRetryWithReset"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->i:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 274
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 275
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    if-eqz p2, :cond_0

    .line 276
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/h/c;->d(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 277
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->H()V

    :cond_1
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/h/b;)V
    .locals 1

    .line 261
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->h:Z

    if-nez v0, :cond_0

    .line 262
    monitor-enter p0

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 264
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/network/g;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 359
    :try_start_0
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    move-result p1

    .line 360
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusCode(I)V

    .line 361
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/b;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusMessage(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 362
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 363
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusCode(I)V

    .line 364
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusMessage(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;J)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    const-string v5, " before="

    const-string v6, " cur="

    const-string v7, "dcache=responseCode="

    if-nez v2, :cond_0

    return-void

    .line 188
    :cond_0
    :try_start_0
    new-instance v8, Lcom/ss/android/socialbase/downloader/model/d;

    move-object/from16 v9, p1

    invoke-direct {v8, v9, v2}, Lcom/ss/android/socialbase/downloader/model/d;-><init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;)V

    .line 189
    iget v9, v8, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    .line 190
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->d()Ljava/lang/String;

    move-result-object v10

    .line 191
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 192
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11, v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setMimeType(Ljava/lang/String;)V

    .line 193
    :cond_1
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->b()Z

    move-result v10

    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->j:Z

    .line 194
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11, v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSupportPartial(Z)V

    .line 195
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->a()Z

    move-result v10

    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->k:Z

    .line 196
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v10

    .line 197
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->c()Ljava/lang/String;

    move-result-object v11

    .line 198
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->f()Ljava/lang/String;

    move-result-object v12

    .line 199
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->g()Ljava/lang/String;

    move-result-object v13

    .line 200
    sget-object v14, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " last_modified="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " CACHE_CONTROL="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " max-age="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p1, v10

    move-object v2, v11

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->k()J

    move-result-wide v10

    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, " isDeleteCacheIfCheckFailed="

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDeleteCacheIfCheckFailed()Z

    move-result v10

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v14, v10}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dcache=firstOffset="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v2

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-wide/16 v5, 0x0

    if-nez v2, :cond_2

    .line 203
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v13}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheControl(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->k()J

    move-result-wide v2

    cmp-long v2, v2, v5

    if-lez v2, :cond_2

    .line 205
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->k()J

    move-result-wide v15

    const-wide/16 v17, 0x3e8

    mul-long v15, v15, v17

    add-long/2addr v10, v15

    invoke-virtual {v2, v10, v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheExpiredTime(J)V

    .line 206
    :cond_2
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->F:Z

    if-eqz v2, :cond_7

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const/16 v2, 0x130

    if-ne v9, v2, :cond_3

    :goto_0
    const/4 v10, 0x1

    goto :goto_1

    .line 207
    :cond_3
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDeleteCacheIfCheckFailed()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 208
    :cond_4
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    if-nez v10, :cond_6

    .line 209
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_2

    .line 210
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " lastModified not changed, use local file  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/a;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/h/c;->E:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/ss/android/socialbase/downloader/exception/a;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_7
    :goto_2
    cmp-long v2, p3, v5

    const-string v7, ""

    if-lez v2, :cond_8

    .line 212
    :try_start_1
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v10

    if-eqz v10, :cond_8

    .line 213
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v10

    invoke-static {v12, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "dcache cdn file change, so retry"

    .line 214
    invoke-static {v14, v10}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "cdn file changed"

    .line 215
    invoke-direct {v1, v7, v10}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :cond_8
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    .line 217
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setLastModified(Ljava/lang/String;)V

    :cond_9
    move-object/from16 v10, p1

    .line 218
    invoke-direct {v1, v9, v10, v4}, Lcom/ss/android/socialbase/downloader/h/c;->a(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v11

    const/16 v12, 0x3ea

    if-eqz v11, :cond_c

    move-object/from16 v11, p2

    .line 219
    instance-of v13, v11, Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v13, :cond_b

    .line 220
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    move-object v4, v7

    :cond_a
    const-string v10, "eTag of server file changed"

    .line 221
    invoke-direct {v1, v4, v10}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 222
    :cond_b
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/b;

    invoke-direct {v2, v12, v9, v7}, Lcom/ss/android/socialbase/downloader/exception/b;-><init>(IILjava/lang/String;)V

    throw v2

    :cond_c
    move-object/from16 v11, p2

    .line 223
    :goto_3
    iget-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->j:Z

    const/16 v13, 0x3ec

    if-nez v10, :cond_f

    iget-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->k:Z

    if-eqz v10, :cond_d

    goto :goto_4

    :cond_d
    const/16 v2, 0x193

    if-ne v9, v2, :cond_e

    .line 224
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "response code error : 403"

    const/16 v4, 0x417

    invoke-direct {v2, v4, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 225
    :cond_e
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response code error : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v13, v9, v3}, Lcom/ss/android/socialbase/downloader/exception/b;-><init>(IILjava/lang/String;)V

    throw v2

    .line 226
    :cond_f
    :goto_4
    iget-boolean v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->k:Z

    if-eqz v10, :cond_11

    if-lez v2, :cond_11

    .line 227
    instance-of v2, v11, Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v2, :cond_10

    const-string v2, "http head request not support"

    .line 228
    invoke-direct {v1, v7, v2}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 229
    :cond_10
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "isResponseFromBegin but firstOffset > 0"

    invoke-direct {v2, v13, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    :cond_11
    :goto_5
    move-object v2, v4

    .line 230
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->h()J

    move-result-wide v3

    .line 231
    instance-of v10, v11, Lcom/ss/android/socialbase/downloader/network/i;

    if-nez v10, :cond_13

    cmp-long v10, v3, v5

    if-gez v10, :cond_13

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 232
    invoke-static {v10}, Lcom/ss/android/socialbase/downloader/i/d;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_6

    .line 233
    :cond_12
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v2, v13, v7}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 234
    :cond_13
    :goto_6
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_14

    .line 235
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_14
    move-object v10, v7

    .line 236
    :goto_7
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/d;->i()Z

    move-result v8

    iput-boolean v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->l:Z

    if-nez v8, :cond_16

    cmp-long v15, v3, v5

    if-nez v15, :cond_16

    .line 237
    instance-of v15, v11, Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v15, :cond_15

    goto :goto_8

    .line 238
    :cond_15
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v2, v13, v7}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    :cond_16
    :goto_8
    if-nez v8, :cond_18

    const-string v8, "Content-Range"

    .line 239
    invoke-static {v11, v8}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 240
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "firstConnection: contentRange = "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v14, v13}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_17

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/h/c;->I:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v15, "fix_get_total_bytes"

    const/4 v12, 0x1

    invoke-virtual {v13, v15, v12}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_17

    .line 242
    invoke-static {v8}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/String;)J

    move-result-wide v3

    .line 243
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "firstConnection: 1 totalLength = "

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v14, v8}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_17
    add-long v12, p3, v3

    .line 244
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "firstConnection: 2 totalLength = "

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, ", contentLength = "

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v14, v3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v3, v12

    goto :goto_9

    :cond_18
    const-wide/16 v3, -0x1

    .line 245
    :goto_9
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskKey()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1a

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 246
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v12

    cmp-long v8, v12, v5

    if-lez v8, :cond_1a

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 247
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v12

    cmp-long v8, v3, v12

    if-eqz v8, :cond_1a

    .line 248
    instance-of v8, v11, Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v8, :cond_19

    const-string v8, "file totalLength changed"

    .line 249
    invoke-direct {v1, v7, v8}, Lcom/ss/android/socialbase/downloader/h/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    .line 250
    :cond_19
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/b;

    const/16 v3, 0x3ea

    invoke-direct {v2, v3, v9, v7}, Lcom/ss/android/socialbase/downloader/exception/b;-><init>(IILjava/lang/String;)V

    throw v2

    .line 251
    :cond_1a
    :goto_a
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/c;->v()Z

    move-result v7

    if-eqz v7, :cond_1b

    return-void

    .line 252
    :cond_1b
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v7

    cmp-long v5, v7, v5

    if-lez v5, :cond_1d

    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 253
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v5

    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v5

    const-string v6, "force_check_file_length"

    invoke-virtual {v5, v6}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1d

    .line 254
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-nez v5, :cond_1c

    goto :goto_b

    .line 255
    :cond_1c
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "expectFileLength = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 256
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " , totalLength = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x42e

    invoke-direct {v2, v4, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 257
    :cond_1d
    :goto_b
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    invoke-virtual {v5, v3, v4, v2, v10}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/i; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception v0

    move-object v2, v0

    const-string v3, "HandleFirstConnection"

    .line 258
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_c
    return-void

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 259
    throw v2

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 260
    throw v2
.end method

.method public a(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 389
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->b:Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 4

    .line 265
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    return v1

    .line 266
    :cond_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 267
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->h:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->d:Z

    if-nez p1, :cond_1

    .line 268
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 269
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->d:Z

    :cond_1
    return v2

    .line 270
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->hasNextBackupUrl()Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_6

    .line 271
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x3f3

    if-eq v0, v3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_6

    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canReplaceHttpForRetry()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    instance-of p1, p1, Lcom/ss/android/socialbase/downloader/exception/f;

    if-nez p1, :cond_6

    move v1, v2

    :cond_6
    return v1
.end method

.method public b()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->c:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/k;->a()V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/downloader/e;->c()V

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->K:Lcom/ss/android/socialbase/downloader/f/k;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/c;->g:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-nez v1, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->s()V

    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->p()V

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 3

    .line 25
    sget-object v0, Lcom/ss/android/socialbase/downloader/h/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/h;->d:Lcom/ss/android/socialbase/downloader/constants/h;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->n:Lcom/ss/android/socialbase/downloader/constants/h;

    .line 27
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/c;->w:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 28
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->I()V

    return-void
.end method

.method public b(J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 21
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/h/c;->G:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 23
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->D()V

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/f;->a(J)Z

    move-result p1

    return p1
.end method

.method public c()Lcom/ss/android/socialbase/downloader/model/DownloadTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    return-object v0
.end method

.method public c(J)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->x:Lcom/ss/android/socialbase/downloader/network/i;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/network/a;

    if-eqz v1, :cond_1

    .line 7
    :try_start_0
    check-cast v0, Lcom/ss/android/socialbase/downloader/network/a;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/network/a;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkDowngradeRetryUsed(Z)V

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/h/c;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->H:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->v:Lcom/ss/android/socialbase/downloader/downloader/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/f;->a()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public g()Ljava/util/concurrent/Future;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->b:Ljava/util/concurrent/Future;

    return-object v0
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/b;->a()Lcom/ss/android/socialbase/downloader/network/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/b;->b()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/c;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/b;->a()Lcom/ss/android/socialbase/downloader/network/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/b;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/c;->c:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/b;->a()Lcom/ss/android/socialbase/downloader/network/b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/b;->c()V

    .line 36
    .line 37
    .line 38
    throw v0
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
