.class public Lcom/ss/android/socialbase/downloader/i/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/i/e$a;
    }
.end annotation


# instance fields
.field private a:Lcom/ss/android/socialbase/downloader/i/e$a;

.field private b:Lcom/ss/android/socialbase/downloader/i/e$a;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->d:I

    .line 7
    .line 8
    return-void
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

.method private a()Lcom/ss/android/socialbase/downloader/i/e$a;
    .locals 3

    .line 18
    iget v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->c:I

    iget v1, p0, Lcom/ss/android/socialbase/downloader/i/e;->d:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 19
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/i/e;->b:Lcom/ss/android/socialbase/downloader/i/e$a;

    if-eqz v1, :cond_1

    .line 20
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/i/e$a;->d:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 21
    iput-object v2, v1, Lcom/ss/android/socialbase/downloader/i/e$a;->d:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 22
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->b:Lcom/ss/android/socialbase/downloader/i/e$a;

    if-eqz v0, :cond_0

    .line 23
    iput-object v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->c:Lcom/ss/android/socialbase/downloader/i/e$a;

    :cond_0
    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 24
    iput v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->c:I

    .line 25
    new-instance v0, Lcom/ss/android/socialbase/downloader/i/e$a;

    invoke-direct {v0, v2}, Lcom/ss/android/socialbase/downloader/i/e$a;-><init>(Lcom/ss/android/socialbase/downloader/i/e$1;)V

    return-object v0
.end method

.method private a(J)Lcom/ss/android/socialbase/downloader/i/e$a;
    .locals 7

    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->a:Lcom/ss/android/socialbase/downloader/i/e$a;

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 27
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    cmp-long v2, v2, p1

    if-lez v2, :cond_0

    .line 28
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->c:Lcom/ss/android/socialbase/downloader/i/e$a;

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eq v0, v1, :cond_1

    .line 29
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    sub-long v2, p1, v2

    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    sub-long/2addr v4, p1

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    return-object v0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public a(JJ)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->a:Lcom/ss/android/socialbase/downloader/i/e$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 3
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->a:J

    cmp-long v2, p1, v2

    if-ltz v2, :cond_1

    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    cmp-long v2, p3, v2

    if-gez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->c:Lcom/ss/android/socialbase/downloader/i/e$a;

    if-eqz v2, :cond_2

    .line 5
    iget-wide v2, v2, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    sub-long v2, p3, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    .line 6
    iput-wide p1, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->a:J

    .line 7
    iput-wide p3, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    .line 8
    monitor-exit p0

    return v1

    .line 9
    :cond_1
    :goto_0
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/i/e;->a()Lcom/ss/android/socialbase/downloader/i/e$a;

    move-result-object v2

    .line 11
    iput-wide p1, v2, Lcom/ss/android/socialbase/downloader/i/e$a;->a:J

    .line 12
    iput-wide p3, v2, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    if-eqz v0, :cond_3

    .line 13
    iput-object v0, v2, Lcom/ss/android/socialbase/downloader/i/e$a;->c:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 14
    iput-object v2, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->d:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 15
    :cond_3
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/i/e;->a:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 16
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(JJ)J
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/i/e;->a:Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 3
    .line 4
    const-wide/16 v1, -0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-wide v1

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/i/e;->a(J)Lcom/ss/android/socialbase/downloader/i/e$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-wide v1

    .line 18
    :cond_1
    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/i/e$a;->a:J

    .line 19
    .line 20
    iget-wide v5, p1, Lcom/ss/android/socialbase/downloader/i/e$a;->a:J

    .line 21
    .line 22
    sub-long/2addr v3, v5

    .line 23
    iget-wide p1, p1, Lcom/ss/android/socialbase/downloader/i/e$a;->b:J

    .line 24
    .line 25
    sub-long/2addr p3, p1

    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    cmp-long v0, v3, p1

    .line 29
    .line 30
    if-ltz v0, :cond_2

    .line 31
    .line 32
    cmp-long p1, p3, p1

    .line 33
    .line 34
    if-lez p1, :cond_2

    .line 35
    .line 36
    div-long/2addr v3, p3

    .line 37
    monitor-exit p0

    .line 38
    return-wide v3

    .line 39
    :cond_2
    monitor-exit p0

    .line 40
    return-wide v1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
