.class public Lcom/ss/android/socialbase/downloader/e/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/e/b;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Lcom/ss/android/socialbase/downloader/f/a;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/c;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/a;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/f/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/e/c;->b:Lcom/ss/android/socialbase/downloader/f/a;

    .line 12
    .line 13
    return-void
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
.method public a()Lcom/ss/android/socialbase/downloader/f/a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/c;->b:Lcom/ss/android/socialbase/downloader/f/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/e/c;->a:Ljava/io/InputStream;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->a:[B

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iput v1, v0, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/e/c;->b:Lcom/ss/android/socialbase/downloader/f/a;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/a;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/io/Closeable;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/e/c;->a:Ljava/io/InputStream;

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
