.class public final Lcom/ss/android/socialbase/downloader/f/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field volatile a:Lcom/ss/android/socialbase/downloader/f/m;

.field b:I

.field private final c:J

.field private final d:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile e:J

.field private f:J

.field private g:I

.field private h:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->e:J

    cmp-long p1, p3, p1

    if-ltz p1, :cond_0

    .line 7
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    goto :goto_0

    :cond_0
    const-wide/16 p1, -0x1

    .line 8
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    .line 12
    iget-wide v1, p1, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    .line 13
    iget-wide v1, p1, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    .line 14
    iget-object v1, p1, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->e:J

    .line 16
    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/i;->g:I

    iput p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->g:I

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    const-string v0, "st"

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    const-string v0, "en"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    const-string v0, "cu"

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/f/i;->a(J)V

    .line 23
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/f/i;->d(J)V

    return-void
.end method

.method public static a(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_2

    .line 6
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/i$1;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/f/i$1;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/i;

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method a(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->g:I

    return-void
.end method

.method public a(J)V
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide p1, v0

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    move-wide p1, v0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public b()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method b(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    return-void
.end method

.method b(J)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    return-wide v0
.end method

.method c(J)V
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 3
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setEndOffset: endOffset = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", segment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Segment"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    .line 5
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    :cond_1
    :goto_0
    return-void
.end method

.method public d()J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method

.method public d(J)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/i;->e:J

    :cond_0
    return-void
.end method

.method public e()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/m;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/i;->e:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->e:J

    .line 17
    .line 18
    return-wide v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->g:I

    return v0
.end method

.method h()V
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    return-void
.end method

.method i()V
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    return-void
.end method

.method j()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->b:I

    return v0
.end method

.method public k()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->h:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/i;->h:Lorg/json/JSONObject;

    .line 11
    .line 12
    :cond_0
    const-string v1, "st"

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string v1, "cu"

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->d()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    const-string v1, "en"

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Segment{startOffset="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->c:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ",\t currentOffset="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ",\t currentOffsetRead="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ",\t endOffset="

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/i;->f:J

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x7d

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
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
