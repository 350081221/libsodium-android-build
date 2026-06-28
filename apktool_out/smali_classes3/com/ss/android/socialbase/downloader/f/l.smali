.class Lcom/ss/android/socialbase/downloader/f/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/f/e;


# instance fields
.field private final a:Lcom/ss/android/socialbase/downloader/f/i;

.field private final b:Lcom/ss/android/socialbase/downloader/model/e;

.field private final c:Lcom/ss/android/socialbase/downloader/f/e;


# direct methods
.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/b;Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/f/l;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 5
    .line 6
    invoke-direct {p0, p1, p3}, Lcom/ss/android/socialbase/downloader/f/l;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/i;)Lcom/ss/android/socialbase/downloader/model/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/l;->b:Lcom/ss/android/socialbase/downloader/model/e;

    .line 11
    .line 12
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/h;

    .line 13
    .line 14
    invoke-direct {p1, p2, p0}, Lcom/ss/android/socialbase/downloader/f/h;-><init>(Lcom/ss/android/socialbase/downloader/f/e;Lcom/ss/android/socialbase/downloader/f/e;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/l;->c:Lcom/ss/android/socialbase/downloader/f/e;

    .line 18
    .line 19
    return-void
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
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/i;)Lcom/ss/android/socialbase/downloader/model/e;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v2

    const-string v3, "flush_buffer_size_byte"

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v2

    .line 4
    invoke-static {p1, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/e;

    move-result-object p1

    .line 5
    :try_start_0
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/model/e;->a(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance p2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v0, 0x41e

    invoke-direct {p2, v0, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public a()Lcom/ss/android/socialbase/downloader/f/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->c:Lcom/ss/android/socialbase/downloader/f/e;

    return-object v0
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->b:Lcom/ss/android/socialbase/downloader/model/e;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/e;->b()V

    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 4
    .param p1    # Lcom/ss/android/socialbase/downloader/f/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->b:Lcom/ss/android/socialbase/downloader/model/e;

    iget-object v1, p1, Lcom/ss/android/socialbase/downloader/f/a;->a:[B

    const/4 v2, 0x0

    iget v3, p1, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/model/e;->a([BII)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->a:Lcom/ss/android/socialbase/downloader/f/i;

    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/f/i;->b(J)V

    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->b:Lcom/ss/android/socialbase/downloader/model/e;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/e;->c()V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/io/Closeable;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/l;->b:Lcom/ss/android/socialbase/downloader/model/e;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

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

.method public e()Lcom/ss/android/socialbase/downloader/f/i;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/l;->a:Lcom/ss/android/socialbase/downloader/f/i;

    return-object v0
.end method
