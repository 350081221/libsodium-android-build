.class public final Lcom/tendcloud/tenddata/an;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/an$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/tendcloud/tenddata/an$a;

.field private final b:[B


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/an$a;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/an;->a:Lcom/tendcloud/tenddata/an$a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/an;->b:[B

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
.method a(Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/an;->b:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/an;->a:Lcom/tendcloud/tenddata/an$a;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/an$a;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Content-Type"

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/an;->b:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    const/4 p1, 0x0

    :catchall_1
    if-eqz p1, :cond_0

    goto :goto_0

    :catchall_2
    :cond_0
    :goto_1
    return-void
.end method

.method public a()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/an;->b:[B

    return-object v0
.end method

.method public b()Lcom/tendcloud/tenddata/an$a;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/an;->a:Lcom/tendcloud/tenddata/an$a;

    return-object v0
.end method
