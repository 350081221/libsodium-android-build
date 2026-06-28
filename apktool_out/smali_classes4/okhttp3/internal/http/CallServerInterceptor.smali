.class public final Lokhttp3/internal/http/CallServerInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lokhttp3/internal/http/CallServerInterceptor;",
        "Lokhttp3/Interceptor;",
        "forWebSocket",
        "",
        "(Z)V",
        "intercept",
        "Lokhttp3/Response;",
        "chain",
        "Lokhttp3/Interceptor$Chain;",
        "shouldIgnoreAndWaitForRealResponse",
        "code",
        "",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final forWebSocket:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lokhttp3/internal/http/CallServerInterceptor;->forWebSocket:Z

    return-void
.end method

.method private final shouldIgnoreAndWaitForRealResponse(I)Z
    .locals 3

    const/16 v0, 0x64

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x66

    const/4 v2, 0x0

    if-gt v0, p1, :cond_1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 13
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-string v0, "Connection"

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p1, Lokhttp3/internal/http/RealInterceptorChain;

    .line 2
    invoke-virtual {p1}, Lokhttp3/internal/http/RealInterceptorChain;->getExchange$okhttp()Lokhttp3/internal/connection/Exchange;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Lokhttp3/internal/http/RealInterceptorChain;->getRequest$okhttp()Lokhttp3/Request;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v3

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v2, p1}, Lokhttp3/internal/connection/Exchange;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 7
    invoke-virtual {p1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lokhttp3/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    if-eqz v3, :cond_3

    const-string v9, "100-continue"

    const-string v10, "Expect"

    .line 8
    invoke-virtual {p1, v10}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v7}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 9
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->flushRequest()V

    .line 10
    invoke-virtual {v2, v7}, Lokhttp3/internal/connection/Exchange;->readResponseHeaders(Z)Lokhttp3/Response$Builder;

    move-result-object v9
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 11
    :try_start_1
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->responseHeadersStart()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v10, v6

    goto :goto_0

    :catch_0
    move-exception v3

    move v10, v7

    goto :goto_2

    :cond_0
    move v10, v7

    move-object v9, v8

    :goto_0
    if-nez v9, :cond_2

    .line 12
    :try_start_2
    invoke-virtual {v3}, Lokhttp3/RequestBody;->isDuplex()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 13
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->flushRequest()V

    .line 14
    invoke-virtual {v2, p1, v7}, Lokhttp3/internal/connection/Exchange;->createRequestBody(Lokhttp3/Request;Z)Lokio/l1;

    move-result-object v11

    invoke-static {v11}, Lokio/y0;->d(Lokio/l1;)Lokio/m;

    move-result-object v11

    .line 15
    invoke-virtual {v3, v11}, Lokhttp3/RequestBody;->writeTo(Lokio/m;)V

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v2, p1, v6}, Lokhttp3/internal/connection/Exchange;->createRequestBody(Lokhttp3/Request;Z)Lokio/l1;

    move-result-object v11

    invoke-static {v11}, Lokio/y0;->d(Lokio/l1;)Lokio/m;

    move-result-object v11

    .line 17
    invoke-virtual {v3, v11}, Lokhttp3/RequestBody;->writeTo(Lokio/m;)V

    .line 18
    invoke-interface {v11}, Lokio/l1;->close()V

    goto :goto_1

    .line 19
    :cond_2
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->noRequestBody()V

    .line 20
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->getConnection$okhttp()Lokhttp3/internal/connection/RealConnection;

    move-result-object v11

    invoke-virtual {v11}, Lokhttp3/internal/connection/RealConnection;->isMultiplexed$okhttp()Z

    move-result v11

    if-nez v11, :cond_4

    .line 21
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->noNewExchangesOnConnection()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 22
    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->noRequestBody()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    move v10, v7

    move-object v9, v8

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    .line 23
    :try_start_4
    invoke-virtual {v3}, Lokhttp3/RequestBody;->isDuplex()Z

    move-result v3

    if-nez v3, :cond_6

    .line 24
    :cond_5
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->finishRequest()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_6
    move-object v3, v8

    goto :goto_3

    :catch_1
    move-exception v3

    goto :goto_2

    :catch_2
    move-exception v3

    move v10, v7

    move-object v9, v8

    .line 25
    :goto_2
    instance-of v11, v3, Lokhttp3/internal/http2/ConnectionShutdownException;

    if-nez v11, :cond_17

    .line 26
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->getHasFailure$okhttp()Z

    move-result v11

    if-eqz v11, :cond_16

    :goto_3
    if-nez v9, :cond_7

    .line 27
    :try_start_5
    invoke-virtual {v2, v6}, Lokhttp3/internal/connection/Exchange;->readResponseHeaders(Z)Lokhttp3/Response$Builder;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    if-eqz v10, :cond_7

    .line 28
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->responseHeadersStart()V

    move v10, v6

    .line 29
    :cond_7
    invoke-virtual {v9, p1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v9

    .line 30
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->getConnection$okhttp()Lokhttp3/internal/connection/RealConnection;

    move-result-object v11

    invoke-virtual {v11}, Lokhttp3/internal/connection/RealConnection;->handshake()Lokhttp3/Handshake;

    move-result-object v11

    invoke-virtual {v9, v11}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object v9

    .line 31
    invoke-virtual {v9, v4, v5}, Lokhttp3/Response$Builder;->sentRequestAtMillis(J)Lokhttp3/Response$Builder;

    move-result-object v9

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lokhttp3/Response$Builder;->receivedResponseAtMillis(J)Lokhttp3/Response$Builder;

    move-result-object v9

    .line 33
    invoke-virtual {v9}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v9

    .line 34
    invoke-virtual {v9}, Lokhttp3/Response;->code()I

    move-result v11

    .line 35
    invoke-direct {p0, v11}, Lokhttp3/internal/http/CallServerInterceptor;->shouldIgnoreAndWaitForRealResponse(I)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 36
    invoke-virtual {v2, v6}, Lokhttp3/internal/connection/Exchange;->readResponseHeaders(Z)Lokhttp3/Response$Builder;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    if-eqz v10, :cond_8

    .line 37
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->responseHeadersStart()V

    .line 38
    :cond_8
    invoke-virtual {v6, p1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 39
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->getConnection$okhttp()Lokhttp3/internal/connection/RealConnection;

    move-result-object v6

    invoke-virtual {v6}, Lokhttp3/internal/connection/RealConnection;->handshake()Lokhttp3/Handshake;

    move-result-object v6

    invoke-virtual {p1, v6}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 40
    invoke-virtual {p1, v4, v5}, Lokhttp3/Response$Builder;->sentRequestAtMillis(J)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lokhttp3/Response$Builder;->receivedResponseAtMillis(J)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v9

    .line 43
    invoke-virtual {v9}, Lokhttp3/Response;->code()I

    move-result v11

    .line 44
    :cond_9
    invoke-virtual {v2, v9}, Lokhttp3/internal/connection/Exchange;->responseHeadersEnd(Lokhttp3/Response;)V

    .line 45
    iget-boolean p1, p0, Lokhttp3/internal/http/CallServerInterceptor;->forWebSocket:Z

    if-eqz p1, :cond_c

    const/16 p1, 0x65

    if-ne v11, p1, :cond_c

    .line 46
    instance-of p1, v9, Lokhttp3/Response$Builder;

    if-nez p1, :cond_a

    invoke-virtual {v9}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object p1

    goto :goto_4

    :cond_a
    check-cast v9, Lokhttp3/Response$Builder;

    invoke-static {v9}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->newBuilder(Lokhttp3/Response$Builder;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 47
    :goto_4
    sget-object v4, Lokhttp3/internal/Util;->EMPTY_RESPONSE:Lokhttp3/ResponseBody;

    instance-of v5, p1, Lokhttp3/Response$Builder;

    if-nez v5, :cond_b

    invoke-virtual {p1, v4}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    goto :goto_5

    :cond_b
    invoke-static {p1, v4}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->body(Lokhttp3/Response$Builder;Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 48
    :goto_5
    invoke-virtual {p1}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object p1

    goto :goto_8

    .line 49
    :cond_c
    instance-of p1, v9, Lokhttp3/Response$Builder;

    if-nez p1, :cond_d

    invoke-virtual {v9}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object p1

    goto :goto_6

    :cond_d
    move-object p1, v9

    check-cast p1, Lokhttp3/Response$Builder;

    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->newBuilder(Lokhttp3/Response$Builder;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 50
    :goto_6
    invoke-virtual {v2, v9}, Lokhttp3/internal/connection/Exchange;->openResponseBody(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v4

    instance-of v5, p1, Lokhttp3/Response$Builder;

    if-nez v5, :cond_e

    invoke-virtual {p1, v4}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    goto :goto_7

    :cond_e
    invoke-static {p1, v4}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->body(Lokhttp3/Response$Builder;Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 51
    :goto_7
    invoke-virtual {p1}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object p1

    .line 52
    :goto_8
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v4

    invoke-virtual {v4, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v7}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_f

    const/4 v4, 0x2

    .line 53
    invoke-static {p1, v0, v8, v4, v8}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lkotlin/text/v;->K1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 54
    :cond_f
    invoke-virtual {v2}, Lokhttp3/internal/connection/Exchange;->noNewExchangesOnConnection()V

    :cond_10
    const/16 v0, 0xcc

    if-eq v11, v0, :cond_11

    const/16 v0, 0xcd

    if-ne v11, v0, :cond_14

    .line 55
    :cond_11
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    goto :goto_9

    :cond_12
    const-wide/16 v0, -0x1

    :goto_9
    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_14

    .line 56
    new-instance v0, Ljava/net/ProtocolException;

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :cond_13
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_14
    return-object p1

    :catch_3
    move-exception p1

    if-eqz v3, :cond_15

    .line 59
    invoke-static {v3, p1}, Lkotlin/o;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 60
    throw v3

    .line 61
    :cond_15
    throw p1

    .line 62
    :cond_16
    throw v3

    .line 63
    :cond_17
    throw v3
.end method
