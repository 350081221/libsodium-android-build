.class public Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/core/transport/ITransportHandler;


# static fields
.field private static final RECONNECTION_TIMES:I = 0x3

.field private static final TAG:Ljava/lang/String; = "HttpTransportCommander"


# instance fields
.field private collectURLs:[Ljava/lang/String;

.field private connection:Ljava/net/HttpURLConnection;

.field private context:Landroid/content/Context;

.field private headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private reportData:[B

.field private requestMethod:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private closeConnection()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-void
.end method

.method private createConnection(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-direct {p0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->setHttpsConn()V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->requestMethod:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    const/16 v0, 0x3a98

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string p1, "POST"

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->requestMethod:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    :cond_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=UTF-8"

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->reportData:[B

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    array-length p1, p1

    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    const-string v1, "Content-Length"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    const-string v0, "Connection"

    const-string v1, "close"

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->headers:Ljava/util/Map;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->headers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v0, ""

    goto :goto_2

    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_2
    const-string v3, "UTF-8"

    invoke-static {v0, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method private handlerException(Ljava/lang/Exception;)Lcom/huawei/hms/analytics/core/transport/net/Response;
    .locals 5

    instance-of v0, p1, Ljava/lang/SecurityException;

    const-string v1, ""

    const-string v2, "HttpTransportCommander"

    if-eqz v0, :cond_0

    const-string p1, "NE-003"

    const-string v0, "No Permission\uff1aINTERNET."

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x65

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    const-string v3, "NE-002"

    if-eqz v0, :cond_1

    const-string p1, "Certificate has not been verified,Request is restricted!"

    invoke-static {v2, v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x6a

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "SSL Handshake Exception : "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x6d

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_3

    const-string p1, "NE-005"

    const-string v0, "Network is unreachable or Connection refused"

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x67

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_4

    const-string p1, "NE-006"

    const-string v0, "Invalid URL.No address associated with hostname"

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x68

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_5

    const-string p1, "NE-004"

    const-string v0, "post request IO Exception."

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x66

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_5
    instance-of v0, p1, Lcom/huawei/hms/analytics/core/transport/a/a;

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "SSLConfigException:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NE-001"

    invoke-static {v2, v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x69

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1

    :cond_6
    instance-of v0, p1, Ljava/lang/IllegalAccessException;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "other exception: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v0, -0x6c

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object p1
.end method

.method private post(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/transport/net/Response;
    .locals 5

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->createConnection(Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->reportData:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->reportData:[B

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_3
    const-string v0, "HttpTransportCommander"

    const-string v1, "report data is empty"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v0, p1

    :goto_0
    :try_start_4
    iget-object v1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-direct {p0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->readResponse()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/hms/analytics/core/transport/net/Response;

    invoke-direct {v3, v1, v2}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-static {p1}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->closeConnection()V

    return-object v3

    :catchall_1
    move-exception v1

    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    move-object v0, v1

    :goto_1
    invoke-static {v1}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->closeConnection()V

    throw p1
.end method

.method private readResponse()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v0, 0x400

    :try_start_2
    new-array v0, v0, [B

    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    const-string v0, "UTF-8"

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v2}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-static {v1}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-object v0, v2

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    :catch_1
    move-object v1, v0

    :catch_2
    :goto_1
    :try_start_3
    const-string v2, "HttpTransportCommander"

    const-string v3, "stream read IOException!"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {v0}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-static {v1}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    const-string v0, ""

    return-object v0

    :catchall_2
    move-exception v2

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    :goto_2
    invoke-static {v2}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    invoke-static {v1}, Lcom/huawei/hms/analytics/core/transport/net/a;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method private reconnection(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/transport/net/Response;
    .locals 4

    new-instance v0, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v1, -0x6c

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->post(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->handlerException(Ljava/lang/Exception;)Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v2

    const/16 v3, -0x68

    if-eq v2, v3, :cond_0

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private setHttpsConn()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->connection:Ljava/net/HttpURLConnection;

    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/secure/android/common/ssl/i;->e(Landroid/content/Context;)Lcom/huawei/secure/android/common/ssl/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    new-instance v1, Li2/b;

    invoke-direct {v1}, Li2/b;-><init>()V

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance v0, Lcom/huawei/hms/analytics/core/transport/a/a;

    const-string v1, "No ssl socket factory set"

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/core/transport/a/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public execute()Lcom/huawei/hms/analytics/core/transport/net/Response;
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->collectURLs:[Ljava/lang/String;

    const-string v1, "HttpTransportCommander"

    if-eqz v0, :cond_3

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v3

    const/16 v4, -0x68

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->collectURLs:[Ljava/lang/String;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    goto :goto_1

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->collectURLs:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-direct {p0, v2}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->reconnection(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    const-string v3, "request times: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_2
    const-string v0, "collectUrls is empty"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/hms/analytics/core/transport/net/Response;

    const/16 v1, -0x64

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/analytics/core/transport/net/Response;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public execute(Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;-><init>(Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public setContext(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->context:Landroid/content/Context;

    return-void
.end method

.method public setHttpHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->headers:Ljava/util/Map;

    return-void
.end method

.method public setReportData(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setReportData([B)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    :goto_0
    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->reportData:[B

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->requestMethod:Ljava/lang/String;

    return-void
.end method

.method public setUrls([Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->collectURLs:[Ljava/lang/String;

    return-void
.end method
