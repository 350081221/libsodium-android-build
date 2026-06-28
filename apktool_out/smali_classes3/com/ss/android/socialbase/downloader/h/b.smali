.class public Lcom/ss/android/socialbase/downloader/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "b"


# instance fields
.field private b:Lcom/ss/android/socialbase/downloader/model/b;

.field private c:Lcom/ss/android/socialbase/downloader/model/b;

.field private d:Lcom/ss/android/socialbase/downloader/downloader/e;

.field private final e:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field private f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private final g:Lcom/ss/android/socialbase/downloader/h/f;

.field private h:Lcom/ss/android/socialbase/downloader/network/i;

.field private i:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private volatile j:Z

.field private volatile k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/h/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->l:Z

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/b;->c:Lcom/ss/android/socialbase/downloader/model/b;

    .line 4
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/h/b;->e:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 6
    :cond_0
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/h/b;->i:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 8
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/b;->c:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Lcom/ss/android/socialbase/downloader/h/b;)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/h/f;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p4}, Lcom/ss/android/socialbase/downloader/h/b;-><init>(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/h/f;)V

    .line 10
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/b;J)V
    .locals 9

    .line 90
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->e()Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_2

    .line 92
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 93
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/h/b;->i:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v2

    invoke-interface {p1, v1, v2, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIJ)V

    .line 94
    :cond_1
    invoke-virtual {v0, p2, p3}, Lcom/ss/android/socialbase/downloader/model/b;->b(J)V

    .line 95
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/h/b;->i:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v4

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v5

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v6

    move-wide v7, p2

    invoke-interface/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIIJ)V

    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->i:Lcom/ss/android/socialbase/downloader/downloader/j;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result p1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIJ)V

    :cond_3
    :goto_1
    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/b;)Z
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    .line 3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->e()Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    move-object v9, v0

    const/4 v10, 0x1

    if-eqz v9, :cond_1

    .line 6
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    return v10

    .line 7
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v2

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    move-result-wide v4

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v6

    if-eqz v9, :cond_2

    .line 10
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v6

    .line 11
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v2

    .line 12
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    move-result-wide v4

    :cond_2
    move-wide/from16 v17, v2

    move-wide/from16 v19, v4

    const-wide/16 v21, 0x0

    const/4 v5, 0x0

    .line 13
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    move-result v0
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    if-eqz v0, :cond_3

    .line 14
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v5

    .line 15
    :cond_3
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->c()Ljava/lang/String;

    move-result-object v4

    .line 16
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_4

    move v0, v10

    goto :goto_2

    :cond_4
    move v0, v5

    :goto_2
    iput-boolean v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->l:Z

    .line 17
    invoke-virtual {v8, v0}, Lcom/ss/android/socialbase/downloader/model/b;->b(Z)V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const/16 v2, 0x12c

    const/16 v3, 0xc8

    .line 18
    :try_start_2
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->l:Z

    if-nez v0, :cond_5

    .line 19
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtraHeaders()Ljava/util/List;

    move-result-object v11

    .line 20
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v13, v17

    move-wide/from16 v15, v19

    invoke-static/range {v11 .. v16}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Ljava/lang/String;JJ)Ljava/util/List;

    move-result-object v0

    .line 21
    new-instance v11, Lcom/ss/android/socialbase/downloader/model/c;

    const-string v12, "Chunk-Index"

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 23
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 24
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedDefaultHttpServiceBackUp()Z

    move-result v11

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMaxBytes()I

    move-result v12

    invoke-static {v11, v12, v4, v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object v0

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    :cond_5
    :try_start_3
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_8

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    if-eqz v11, :cond_8

    .line 26
    :try_start_4
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    move-result v0

    if-lt v0, v3, :cond_6

    if-lt v0, v2, :cond_8

    .line 27
    :cond_6
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/network/g;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    .line 28
    :goto_3
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_6
    const-string v11, "ChunkRunnableConnection"

    .line 29
    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 30
    :try_start_7
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_8

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    if-eqz v11, :cond_8

    .line 31
    :try_start_8
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    move-result v0

    if-lt v0, v3, :cond_7

    if-lt v0, v2, :cond_8

    .line 32
    :cond_7
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/network/g;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_3

    .line 33
    :cond_8
    :goto_4
    :try_start_9
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    move-result v0
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    if-eqz v0, :cond_9

    .line 34
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v5

    .line 35
    :cond_9
    :try_start_a
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_e

    .line 36
    iget-boolean v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->l:Z
    :try_end_a
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    if-nez v2, :cond_b

    .line 37
    :try_start_b
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    move-result v0

    .line 38
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->d(I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    .line 39
    :cond_a
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "Http response error , code is : %s "

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v11, v5

    invoke-static {v3, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x3ea

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_c
    const-string v2, "ChunkRunnableGetResponseCode"

    .line 40
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_5

    :catch_0
    move-exception v0

    .line 41
    throw v0

    .line 42
    :cond_b
    :goto_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/e;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;
    :try_end_c
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-object v2, v0

    move v13, v5

    move-object v5, v11

    move-wide v14, v6

    move-object/from16 v6, p1

    move-object v7, v12

    :try_start_d
    invoke-direct/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/e;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/h/f;)V

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-eqz v9, :cond_d

    .line 43
    invoke-virtual {v9, v13}, Lcom/ss/android/socialbase/downloader/model/b;->c(Z)J

    move-result-wide v2

    cmp-long v0, v19, v21

    if-eqz v0, :cond_c

    cmp-long v0, v19, v17

    if-ltz v0, :cond_c

    sub-long v19, v19, v17

    const-wide/16 v2, 0x1

    add-long v2, v19, v2

    :cond_c
    move-wide/from16 v28, v2

    .line 44
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    move-result-wide v24

    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    move-result-wide v26

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v29}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(JJJ)V
    :try_end_d
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 45
    :cond_d
    :try_start_e
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->d()V
    :try_end_e
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 46
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v10

    :catch_1
    move-exception v0

    move v5, v10

    goto/16 :goto_a

    :cond_e
    move v13, v5

    move-wide v14, v6

    .line 47
    :try_start_f
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "download can\'t continue, chunk connection is null"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x3fe

    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
    :try_end_f
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    :catchall_4
    move-exception v0

    move v13, v5

    move-wide v14, v6

    goto :goto_6

    :catch_2
    move-exception v0

    move v13, v5

    move-wide v14, v6

    .line 48
    :try_start_10
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :catchall_5
    move-exception v0

    :goto_6
    move-object v4, v0

    .line 49
    :try_start_11
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    if-eqz v0, :cond_10

    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;
    :try_end_11
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_11 .. :try_end_11} :catch_3
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    if-eqz v5, :cond_10

    .line 50
    :try_start_12
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    move-result v0

    if-lt v0, v3, :cond_f

    if-lt v0, v2, :cond_10

    .line 51
    :cond_f
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/network/g;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v0

    .line 52
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    :cond_10
    :goto_7
    throw v4
    :try_end_13
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_3
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v0

    move v5, v13

    goto :goto_a

    :catchall_8
    move-exception v0

    move v13, v5

    .line 54
    :goto_8
    :try_start_14
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    move-result v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    if-eqz v2, :cond_11

    .line 55
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v10

    :cond_11
    :try_start_15
    const-string v2, "downloadChunkInner"

    .line 56
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_15
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_15 .. :try_end_15} :catch_4
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    goto :goto_9

    :catch_4
    move-exception v0

    .line 57
    :try_start_16
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/h/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 58
    :goto_9
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    :catch_5
    move-exception v0

    move v13, v5

    move-wide v14, v6

    .line 59
    :goto_a
    :try_start_17
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    move-result v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    if-eqz v2, :cond_12

    .line 60
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v10

    .line 61
    :cond_12
    :try_start_18
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 62
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0, v13}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 63
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    .line 64
    :cond_13
    :try_start_19
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 65
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 66
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0, v10}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 67
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    :cond_14
    if-eqz v5, :cond_18

    .line 68
    :try_start_1a
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-eqz v2, :cond_17

    const/16 v2, 0x20

    .line 69
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 70
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/downloader/e;->a()J

    move-result-wide v2

    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/downloader/e;->e()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v2, v21

    if-lez v4, :cond_15

    .line 71
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/downloader/e;->e()J

    move-result-wide v4

    invoke-direct {v1, v8, v4, v5}, Lcom/ss/android/socialbase/downloader/h/b;->a(Lcom/ss/android/socialbase/downloader/model/b;J)V

    goto :goto_c

    :cond_15
    if-gez v4, :cond_19

    goto :goto_b

    .line 72
    :cond_16
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/downloader/e;->a()J

    move-result-wide v2

    sub-long v21, v2, v14

    .line 73
    invoke-direct {v1, v8, v14, v15}, Lcom/ss/android/socialbase/downloader/h/b;->a(Lcom/ss/android/socialbase/downloader/model/b;J)V

    goto :goto_b

    .line 74
    :cond_17
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/h/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    .line 75
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    :cond_18
    :goto_b
    move-wide/from16 v2, v21

    :cond_19
    :goto_c
    const/16 v4, 0x10

    .line 76
    :try_start_1b
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 77
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v4, v8, v0, v2, v3}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;

    move-result-object v0

    goto :goto_d

    .line 78
    :cond_1a
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v4, v0, v2, v3}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/h;

    move-result-object v0

    .line 79
    :goto_d
    sget-object v2, Lcom/ss/android/socialbase/downloader/exception/h;->a:Lcom/ss/android/socialbase/downloader/exception/h;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    if-ne v0, v2, :cond_1b

    .line 80
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    .line 81
    :cond_1b
    :try_start_1c
    invoke-virtual {v8, v13}, Lcom/ss/android/socialbase/downloader/model/b;->b(Z)V

    .line 82
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_9

    .line 83
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    goto/16 :goto_0

    .line 84
    :cond_1c
    :try_start_1d
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedChunkDowngradeRetry()Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkDowngradeRetryUsed()Z

    move-result v2

    if-nez v2, :cond_1d

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v2

    if-le v2, v10, :cond_1d

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 85
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 86
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/h/f;->c(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_9

    .line 87
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    .line 88
    :cond_1d
    :try_start_1e
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/h/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_9

    .line 89
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    return v13

    :catchall_9
    move-exception v0

    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    throw v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->f:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getConnectionUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

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
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->h:Lcom/ss/android/socialbase/downloader/network/i;

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

.method private e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->k:Z

    if-eqz v0, :cond_0

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


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->j:Z

    .line 99
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->b()V

    :cond_0
    return-void
.end method

.method public a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(JJ)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->k:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->d:Lcom/ss/android/socialbase/downloader/downloader/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->c()V

    .line 9
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

.method public run()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->c:Lcom/ss/android/socialbase/downloader/model/b;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 9
    .line 10
    :goto_0
    const/4 v0, 0x0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Lcom/ss/android/socialbase/downloader/h/b;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/downloader/h/b;->a(Lcom/ss/android/socialbase/downloader/model/b;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Z)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Z)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/downloader/h/f;->a(I)Lcom/ss/android/socialbase/downloader/model/b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 55
    .line 56
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/b;->e()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const-wide/16 v1, 0x32

    .line 68
    .line 69
    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Z)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    .line 89
    .line 90
    invoke-interface {v0, p0}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/h/b;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catchall_1
    move-exception v1

    .line 95
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/h/b;->b:Lcom/ss/android/socialbase/downloader/model/b;

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lcom/ss/android/socialbase/downloader/model/b;->a(Z)V

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/h/b;->d()V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/h/b;->g:Lcom/ss/android/socialbase/downloader/h/f;

    .line 106
    .line 107
    invoke-interface {v0, p0}, Lcom/ss/android/socialbase/downloader/h/f;->a(Lcom/ss/android/socialbase/downloader/h/b;)V

    .line 108
    .line 109
    .line 110
    throw v1
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
