.class public Lcom/huawei/agconnect/apms/b0;
.super Lcom/huawei/agconnect/apms/edc;
.source "SourceFile"


# static fields
.field public static final cde:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/b0;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Lokhttp3/Response;)Lokhttp3/Response;
    .locals 13

    const-wide/16 v0, 0x0

    const-string v2, ""

    if-nez p1, :cond_0

    const/16 v3, 0x1f4

    move-object v8, v2

    move v6, v3

    goto/16 :goto_3

    .line 11
    :cond_0
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v3

    .line 12
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getAgentConfiguration()Lcom/huawei/agconnect/apms/efg;

    move-result-object v4

    .line 13
    iget-object v4, v4, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 14
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v4, v2

    .line 15
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 16
    invoke-virtual {p1, v4}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    move-object v4, v2

    .line 18
    :cond_3
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    const-wide/16 v6, -0x1

    if-eqz v5, :cond_4

    .line 19
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v8

    goto :goto_0

    :cond_4
    move-wide v8, v6

    :goto_0
    cmp-long v5, v8, v0

    if-gez v5, :cond_5

    const-string v5, "Content-length"

    .line 20
    invoke-virtual {p1, v5}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 21
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-lez v10, :cond_5

    .line 22
    :try_start_1
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    .line 23
    :try_start_2
    sget-object v10, Lcom/huawei/agconnect/apms/b0;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "failed to parse content length: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v10, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    :goto_1
    cmp-long v5, v8, v6

    move v6, v3

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    move-wide v0, v8

    goto :goto_2

    :catchall_1
    move-exception v5

    .line 24
    sget-object v6, Lcom/huawei/agconnect/apms/b0;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v7, "failed to get response content length: "

    invoke-static {v7}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v5, v7, v6}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    move v6, v3

    :goto_2
    move-object v8, v4

    :goto_3
    long-to-int v0, v0

    int-to-long v4, v0

    if-eqz p1, :cond_9

    .line 25
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_4

    .line 26
    :cond_7
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_4

    .line 27
    :cond_8
    invoke-virtual {v0}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    move-object v7, v0

    goto :goto_5

    :cond_9
    :goto_4
    move-object v7, v2

    :goto_5
    move-object v3, p0

    .line 29
    invoke-static/range {v3 .. v8}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;JILjava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->opq()V

    .line 31
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->jkl()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 32
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 34
    :cond_a
    new-instance v0, Lcom/huawei/agconnect/apms/t0;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/t0;-><init>(Lcom/huawei/agconnect/apms/fed;)V

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->notifyToAddNetworkInfoToTrace(Lcom/huawei/agconnect/apms/t0;)V

    .line 35
    invoke-static {p0}, Lcom/huawei/agconnect/apms/dcb;->abc(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Lokhttp3/Request;)V
    .locals 10

    if-eqz p1, :cond_4

    .line 1
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 2
    :cond_0
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v2

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_1

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 5
    sget-object v5, Lcom/huawei/agconnect/apms/b0;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v6, "failed to get request content length: "

    invoke-static {v6}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v2, v6, v5}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_1
    move-wide v5, v3

    :goto_0
    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-gez v2, :cond_2

    const-string v2, "Content-length"

    .line 6
    invoke-virtual {p1, v2}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 8
    :try_start_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 9
    sget-object v2, Lcom/huawei/agconnect/apms/b0;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v9, "failed to parse content length: "

    invoke-static {v9}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {p1, v9, v2}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_2
    :goto_1
    cmp-long p1, v5, v3

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move-wide v7, v5

    .line 10
    :goto_2
    invoke-static {p0, v0, v1, v7, v8}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/String;Ljava/lang/String;J)V

    :cond_4
    :goto_3
    return-void
.end method
