.class public Lcom/huawei/agconnect/apms/t;
.super Lcom/huawei/agconnect/apms/edc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/t$bcd;
    }
.end annotation


# static fields
.field public static final cde:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/t;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;
    .locals 12

    const-string v0, ""

    if-nez p1, :cond_1

    const/16 v1, 0x1f4

    :cond_0
    :goto_0
    move-object v9, v0

    move v7, v1

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v1

    .line 11
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getAgentConfiguration()Lcom/huawei/agconnect/apms/efg;

    move-result-object v2

    .line 12
    iget-object v2, v2, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v0

    .line 14
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 15
    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    move v7, v1

    move-object v9, v2

    :goto_1
    const-wide/16 v1, 0x0

    if-nez p1, :cond_4

    goto :goto_4

    .line 17
    :cond_4
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v3

    const-wide/16 v4, -0x1

    if-eqz v3, :cond_5

    .line 18
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v3

    invoke-virtual {v3}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v3

    .line 19
    sget-object v6, Lcom/huawei/agconnect/apms/t;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v8, "failed to get request content length: "

    invoke-static {v8}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v3, v8, v6}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_5
    move-wide v10, v4

    :goto_2
    cmp-long v3, v10, v1

    if-gez v3, :cond_6

    const-string v3, "Content-length"

    .line 20
    invoke-virtual {p1, v3}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 21
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 22
    :try_start_1
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v3

    .line 23
    sget-object v6, Lcom/huawei/agconnect/apms/t;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v8, "failed to parse content length: "

    invoke-static {v8}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v3, v8, v6}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_6
    :goto_3
    cmp-long v3, v10, v4

    if-nez v3, :cond_7

    :goto_4
    move-wide v5, v1

    goto :goto_5

    :cond_7
    move-wide v5, v10

    :goto_5
    if-eqz p1, :cond_b

    .line 24
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_6

    .line 25
    :cond_8
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseBody;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_6

    .line 26
    :cond_9
    invoke-virtual {v1}, Lcom/squareup/okhttp/MediaType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    move-object v8, v1

    goto :goto_7

    :cond_b
    :goto_6
    move-object v8, v0

    :goto_7
    move-object v4, p0

    .line 28
    invoke-static/range {v4 .. v9}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;JILjava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->opq()V

    .line 30
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->jkl()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 31
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 33
    :cond_c
    invoke-static {p0}, Lcom/huawei/agconnect/apms/dcb;->abc(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Lcom/squareup/okhttp/Request;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->urlString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v2

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_1

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/RequestBody;->contentLength()J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 4
    sget-object v5, Lcom/huawei/agconnect/apms/t;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

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

    .line 5
    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 7
    :try_start_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 8
    sget-object v2, Lcom/huawei/agconnect/apms/t;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

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

    .line 9
    :goto_2
    invoke-static {p0, v0, v1, v7, v8}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static abc(Lcom/squareup/okhttp/Request;Lcom/huawei/agconnect/apms/fed;)V
    .locals 2

    if-eqz p0, :cond_1

    .line 34
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/t$bcd;->abc:Ljava/util/concurrent/ExecutorService;

    .line 36
    new-instance v1, Lcom/huawei/agconnect/apms/t$abc;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/apms/t$abc;-><init>(Lcom/squareup/okhttp/Request;Lcom/huawei/agconnect/apms/fed;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
