.class public Lcom/bytedance/android/alog/Alog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/android/alog/Alog$b;,
        Lcom/bytedance/android/alog/Alog$a;,
        Lcom/bytedance/android/alog/Alog$f;,
        Lcom/bytedance/android/alog/Alog$c;,
        Lcom/bytedance/android/alog/Alog$e;,
        Lcom/bytedance/android/alog/Alog$g;,
        Lcom/bytedance/android/alog/Alog$d;
    }
.end annotation


# static fields
.field private static final a:I

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static h:Z


# instance fields
.field private i:Landroid/content/Context;

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/android/alog/Alog$d;->b:Lcom/bytedance/android/alog/Alog$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$d;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcom/bytedance/android/alog/Alog;->a:I

    .line 8
    .line 9
    sget-object v0, Lcom/bytedance/android/alog/Alog$g;->a:Lcom/bytedance/android/alog/Alog$g;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$g;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lcom/bytedance/android/alog/Alog;->b:I

    .line 16
    .line 17
    sget-object v0, Lcom/bytedance/android/alog/Alog$e;->a:Lcom/bytedance/android/alog/Alog$e;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$e;->a()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/bytedance/android/alog/Alog;->c:I

    .line 24
    .line 25
    sget-object v0, Lcom/bytedance/android/alog/Alog$c;->c:Lcom/bytedance/android/alog/Alog$c;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$c;->a()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput v0, Lcom/bytedance/android/alog/Alog;->d:I

    .line 32
    .line 33
    sget-object v0, Lcom/bytedance/android/alog/Alog$f;->b:Lcom/bytedance/android/alog/Alog$f;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$f;->a()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sput v0, Lcom/bytedance/android/alog/Alog;->e:I

    .line 40
    .line 41
    sget-object v0, Lcom/bytedance/android/alog/Alog$a;->b:Lcom/bytedance/android/alog/Alog$a;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog$a;->a()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sput v0, Lcom/bytedance/android/alog/Alog;->f:I

    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/bytedance/android/alog/Alog;->g:Ljava/util/ArrayList;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    sput-boolean v0, Lcom/bytedance/android/alog/Alog;->h:Z

    .line 58
    .line 59
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;IZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IILjava/lang/String;IIIIIILjava/lang/String;)V
    .locals 6

    move-object v0, p0

    move/from16 v1, p10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p1

    .line 2
    iput-object v2, v0, Lcom/bytedance/android/alog/Alog;->i:Landroid/content/Context;

    move v2, p2

    .line 3
    iput v2, v0, Lcom/bytedance/android/alog/Alog;->j:I

    move-object v3, p5

    .line 4
    iput-object v3, v0, Lcom/bytedance/android/alog/Alog;->k:Ljava/lang/String;

    move-object v4, p9

    .line 5
    iput-object v4, v0, Lcom/bytedance/android/alog/Alog;->l:Ljava/lang/String;

    .line 6
    iput v1, v0, Lcom/bytedance/android/alog/Alog;->m:I

    .line 7
    div-int v5, p11, v1

    iput v5, v0, Lcom/bytedance/android/alog/Alog;->n:I

    const/4 v5, 0x0

    .line 8
    iput-object v5, v0, Lcom/bytedance/android/alog/Alog;->o:Ljava/lang/String;

    move-object v5, p4

    .line 9
    iput-object v5, v0, Lcom/bytedance/android/alog/Alog;->p:Ljava/lang/String;

    .line 10
    invoke-static/range {p2 .. p19}, Lcom/bytedance/android/alog/Alog;->nativeCreate(IZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IILjava/lang/String;IIIIIILjava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/bytedance/android/alog/Alog;->q:J

    return-void
.end method

.method public static declared-synchronized a(Lcom/bytedance/android/alog/a;)V
    .locals 2

    const-class v0, Lcom/bytedance/android/alog/Alog;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/bytedance/android/alog/Alog;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 2
    monitor-exit v0

    return-void

    :cond_0
    if-nez p0, :cond_1

    :try_start_1
    const-string p0, "alog"

    .line 3
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v1, "alog"

    .line 4
    invoke-interface {p0, v1}, Lcom/bytedance/android/alog/a;->a(Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x1

    .line 5
    sput-boolean p0, Lcom/bytedance/android/alog/Alog;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic e()I
    .locals 1

    .line 1
    sget v0, Lcom/bytedance/android/alog/Alog;->a:I

    return v0
.end method

.method static synthetic f()I
    .locals 1

    sget v0, Lcom/bytedance/android/alog/Alog;->b:I

    return v0
.end method

.method static synthetic g()I
    .locals 1

    sget v0, Lcom/bytedance/android/alog/Alog;->c:I

    return v0
.end method

.method static synthetic h()I
    .locals 1

    sget v0, Lcom/bytedance/android/alog/Alog;->d:I

    return v0
.end method

.method static synthetic i()I
    .locals 1

    sget v0, Lcom/bytedance/android/alog/Alog;->e:I

    return v0
.end method

.method static synthetic j()I
    .locals 1

    sget v0, Lcom/bytedance/android/alog/Alog;->f:I

    return v0
.end method

.method static synthetic k()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Lcom/bytedance/android/alog/Alog;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method private static native nativeAsyncFlush(J)V
.end method

.method private static native nativeCreate(IZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IILjava/lang/String;IIIIIILjava/lang/String;)J
.end method

.method private static native nativeDestroy(J)V
.end method

.method private static native nativeGetLegacyFlushFuncAddr()J
.end method

.method private static native nativeGetLegacyGetLogFileDirFuncAddr()J
.end method

.method private static native nativeGetLegacyWriteFuncAddr()J
.end method

.method private static native nativeGetNativeWriteFuncAddr()J
.end method

.method static native nativeSetDefaultInstance(J)V
.end method

.method private static native nativeSetLevel(JI)V
.end method

.method private static native nativeSetSyslog(JZ)V
.end method

.method private static native nativeSyncFlush(J)V
.end method

.method private static native nativeTimedSyncFlush(JI)V
.end method

.method private static native nativeWrite(JILjava/lang/String;Ljava/lang/String;)V
.end method

.method private static native nativeWriteAsyncMsg(JILjava/lang/String;Ljava/lang/String;JJ)V
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-wide v0, p0, Lcom/bytedance/android/alog/Alog;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 9
    iput-object v4, p0, Lcom/bytedance/android/alog/Alog;->i:Landroid/content/Context;

    const/4 v4, 0x6

    .line 10
    iput v4, p0, Lcom/bytedance/android/alog/Alog;->j:I

    .line 11
    invoke-static {v0, v1}, Lcom/bytedance/android/alog/Alog;->nativeDestroy(J)V

    .line 12
    iput-wide v2, p0, Lcom/bytedance/android/alog/Alog;->q:J

    .line 13
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 14
    iget-wide v0, p0, Lcom/bytedance/android/alog/Alog;->q:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/bytedance/android/alog/Alog;->j:I

    if-lt p1, v2, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 15
    invoke-static {v0, v1, p1, p2, p3}, Lcom/bytedance/android/alog/Alog;->nativeWrite(JILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;JJ)V
    .locals 10

    move-object v0, p0

    .line 16
    iget-wide v1, v0, Lcom/bytedance/android/alog/Alog;->q:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/bytedance/android/alog/Alog;->j:I

    move v4, p1

    if-lt v4, v3, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    move-wide/from16 v8, p6

    .line 17
    invoke-static/range {v1 .. v9}, Lcom/bytedance/android/alog/Alog;->nativeWriteAsyncMsg(JILjava/lang/String;Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/android/alog/Alog;->q:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 2
    invoke-static {v0, v1}, Lcom/bytedance/android/alog/Alog;->nativeAsyncFlush(J)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/android/alog/Alog;->q:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/bytedance/android/alog/Alog;->nativeGetLegacyWriteFuncAddr()J

    move-result-wide v2

    :cond_0
    return-wide v2
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/bytedance/android/alog/Alog;->q:J

    return-wide v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/android/alog/Alog;->a()V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/android/alog/Alog;->a()V

    .line 10
    .line 11
    .line 12
    throw v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
