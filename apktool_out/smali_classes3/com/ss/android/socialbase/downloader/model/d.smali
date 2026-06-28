.class public Lcom/ss/android/socialbase/downloader/model/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/ss/android/socialbase/downloader/network/g;

.field public final c:I

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-interface {p2}, Lcom/ss/android/socialbase/downloader/network/g;->b()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    .line 11
    .line 12
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->c(I)Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 3

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    const-string v2, "Accept-Ranges"

    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/downloader/network/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->a(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    const-string v1, "Etag"

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/network/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/network/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    const-string v1, "Content-Range"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    .line 2
    .line 3
    const-string v1, "last-modified"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    .line 16
    .line 17
    const-string v1, "Last-Modified"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    const-string v1, "Cache-Control"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/network/g;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->d:J

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->d:J

    .line 18
    .line 19
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public i()Z
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->c(Lcom/ss/android/socialbase/downloader/network/g;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/d;->h()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(J)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
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

.method public j()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->e:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/d;->i()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/d;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/String;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->e:J

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-wide/16 v0, -0x1

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->e:J

    .line 35
    .line 36
    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/d;->e:J

    .line 37
    .line 38
    return-wide v0
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

.method public k()J
    .locals 2

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/d;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method
