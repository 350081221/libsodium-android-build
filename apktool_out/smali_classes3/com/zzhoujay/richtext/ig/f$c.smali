.class Lcom/zzhoujay/richtext/ig/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/ig/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/net/HttpURLConnection;

.field private c:Ljava/io/InputStream;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zzhoujay/richtext/ig/f$c;->a:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/zzhoujay/richtext/ig/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zzhoujay/richtext/ig/f$c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zzhoujay/richtext/ig/f$c;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    const/16 v1, 0x2710

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 28
    .line 29
    const-string v1, "Connection"

    .line 30
    .line 31
    const-string v2, "Keep-Alive"

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 37
    .line 38
    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 43
    .line 44
    invoke-static {}, Lcom/zzhoujay/richtext/ig/f;->b()Ljavax/net/ssl/HostnameVerifier;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/zzhoujay/richtext/ig/f;->c()Ljavax/net/ssl/SSLContext;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/16 v1, 0xc8

    .line 74
    .line 75
    if-ne v0, v1, :cond_1

    .line 76
    .line 77
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->c:Ljava/io/InputStream;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_1
    new-instance v1, Lf3/e;

    .line 87
    .line 88
    invoke-direct {v1, v0}, Lf3/e;-><init>(I)V

    .line 89
    .line 90
    .line 91
    throw v1
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

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->c:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/f$c;->b:Ljava/net/HttpURLConnection;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 13
    .line 14
    .line 15
    :cond_1
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
