.class public Lcom/huawei/agconnect/apms/a;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "SourceFile"


# static fields
.field public static final def:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Ljavax/net/ssl/HttpsURLConnection;

.field public bcd:Lcom/huawei/agconnect/apms/fed;

.field public cde:Lcom/huawei/agconnect/apms/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/a;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/a;->cde:Lcom/huawei/agconnect/apms/i;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/edc;->abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/fed;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/q1;->abc()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "net-msg-id"

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    const-string v1, "x-microservice-name"

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    const-string v2, "APMS"

    .line 67
    .line 68
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    iget-object p1, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 72
    .line 73
    iput-object v0, p1, Lcom/huawei/agconnect/apms/fed;->jih:Ljava/lang/String;

    .line 74
    .line 75
    return-void
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
.end method

.method public static synthetic abc(Lcom/huawei/agconnect/apms/a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    return-void
.end method


# virtual methods
.method public final abc()V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/edc;->bcd(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V

    return-void
.end method

.method public final abc(Lcom/huawei/agconnect/apms/fed;)V
    .locals 2

    .line 10
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->jkl()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    new-instance p1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    return-void

    .line 13
    :cond_1
    new-instance p1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    invoke-direct {p1, v0}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;)V

    invoke-static {p1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    return-void
.end method

.method public final abc(Ljava/lang/Exception;)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 6
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/edc;->bcd(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V

    .line 8
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    invoke-direct {v0, p1}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final bcd()Lcom/huawei/agconnect/apms/fed;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/huawei/agconnect/apms/fed;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/fed;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public connect()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x3

    .line 6
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->ghi:I

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public disconnect()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v1

    if-ltz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    move-result-object v2

    .line 5
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    move-result v3

    if-nez v3, :cond_0

    int-to-long v3, v1

    .line 6
    invoke-virtual {v2, v3, v4}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 7
    invoke-virtual {p0, v2}, Lcom/huawei/agconnect/apms/a;->abc(Lcom/huawei/agconnect/apms/fed;)V

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 9
    throw v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    return-object p1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 14
    throw p1
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-object v0
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

.method public getContentLength()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return v0
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

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-object v0
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

.method public getDate()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDate()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-wide v0
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

.method public getDefaultUseCaches()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->cde:Lcom/huawei/agconnect/apms/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/i;->available()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/huawei/agconnect/apms/a;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 23
    .line 24
    const-string v1, "error stream is null."

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_1
    new-instance v0, Lcom/huawei/agconnect/apms/i;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/apms/i;-><init>(Ljava/io/InputStream;Z)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/huawei/agconnect/apms/a;->cde:Lcom/huawei/agconnect/apms/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->cde:Lcom/huawei/agconnect/apms/i;

    .line 51
    .line 52
    return-object v0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    sget-object v1, Lcom/huawei/agconnect/apms/a;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 55
    .line 56
    const-string v2, "failed to get error stream: "

    .line 57
    .line 58
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
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

.method public getExpiration()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getExpiration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-wide v0
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

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    return-object p1
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    return-object p1
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Ljava/net/URLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-wide p1
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

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return p1
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

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-object p1
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
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-object v0
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

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getIfModifiedSince()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-wide v0
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

.method public getInputStream()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    new-instance v1, Lcom/huawei/agconnect/apms/i;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lcom/huawei/agconnect/apms/i;-><init>(Ljava/io/InputStream;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lcom/huawei/agconnect/apms/edc;->bcd(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/huawei/agconnect/apms/a$abc;

    .line 22
    .line 23
    invoke-direct {v2, p0, v0}, Lcom/huawei/agconnect/apms/a$abc;-><init>(Lcom/huawei/agconnect/apms/a;Lcom/huawei/agconnect/apms/fed;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lcom/huawei/agconnect/apms/i;->bcd:Lcom/huawei/agconnect/apms/m;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lcom/huawei/agconnect/apms/m;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method public getInstanceFollowRedirects()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getLastModified()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-wide v0
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

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public getLocalPrincipal()Ljava/security/Principal;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    new-instance v1, Lcom/huawei/agconnect/apms/j;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lcom/huawei/agconnect/apms/j;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    const-string v3, "Content-Type"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    :cond_0
    iput-object v2, v0, Lcom/huawei/agconnect/apms/fed;->efg:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Lcom/huawei/agconnect/apms/a$bcd;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0}, Lcom/huawei/agconnect/apms/a$bcd;-><init>(Lcom/huawei/agconnect/apms/a;Lcom/huawei/agconnect/apms/fed;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lcom/huawei/agconnect/apms/m;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 43
    .line 44
    .line 45
    throw v0
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

.method public getPeerPrincipal()Ljava/security/Principal;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getPeerPrincipal()Ljava/security/Principal;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    throw v0
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

.method public getPermission()Ljava/security/Permission;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->bcd()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/a;->abc()V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

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
    .line 22
    .line 23
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    return-void
.end method

.method public setDoInput(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setIfModifiedSince(J)V

    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/a;->abc(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    throw p1
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
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    move-result v0

    return v0
.end method
