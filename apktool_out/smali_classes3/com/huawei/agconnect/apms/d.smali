.class public Lcom/huawei/agconnect/apms/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/d;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 15
    :try_start_0
    invoke-interface {p1, p0}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 16
    array-length p1, p0

    if-lez p1, :cond_1

    const/4 p1, 0x0

    .line 17
    aget-object v1, p0, p1

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, p1

    invoke-interface {p0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static abc(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;
    .locals 2

    .line 7
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {v0}, Lorg/apache/http/RequestLine;->getUri()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 9
    invoke-interface {v0}, Lorg/apache/http/RequestLine;->getMethod()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/huawei/agconnect/apms/fed;->bcd(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 10
    invoke-virtual {p0}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 11
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/agconnect/apms/fed;->cde(J)V

    const/4 p0, 0x4

    .line 12
    iput p0, p2, Lcom/huawei/agconnect/apms/fed;->ghi:I

    .line 13
    invoke-static {p1, p2}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 14
    sget-object p2, Lcom/huawei/agconnect/apms/d;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "failed to get http host info: "

    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :goto_1
    return-object p1
.end method

.method public static abc(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;
    .locals 5

    .line 18
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getAgentConfiguration()Lcom/huawei/agconnect/apms/efg;

    move-result-object v0

    .line 19
    iget-object v0, v0, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 20
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    const-string v0, ""

    .line 21
    :cond_0
    :try_start_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 22
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    .line 23
    iput-object v0, p1, Lcom/huawei/agconnect/apms/fed;->cde:Ljava/lang/String;

    .line 24
    :cond_1
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 25
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/fed;->cde(I)V

    :cond_2
    const-string v0, "Content-Type"

    .line 26
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    .line 27
    iput-object v0, p1, Lcom/huawei/agconnect/apms/fed;->efg:Ljava/lang/String;

    const-string v0, "Content-Length"

    .line 28
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-wide/16 v1, 0x0

    .line 29
    :try_start_2
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-wide v3, v1

    .line 30
    :goto_0
    :try_start_3
    invoke-virtual {p1, v3, v4}, Lcom/huawei/agconnect/apms/fed;->def(J)V

    .line 31
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 32
    instance-of v0, v0, Lorg/apache/http/entity/HttpEntityWrapper;

    if-eqz v0, :cond_3

    .line 33
    new-instance v0, Lcom/huawei/agconnect/apms/g;

    invoke-direct {v0, p0, p1}, Lcom/huawei/agconnect/apms/g;-><init>(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)V

    invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V

    goto :goto_1

    .line 34
    :cond_3
    new-instance v0, Lcom/huawei/agconnect/apms/f;

    invoke-direct {v0, p0, p1}, Lcom/huawei/agconnect/apms/f;-><init>(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)V

    invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 35
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->opq()V

    .line 36
    invoke-static {p1}, Lcom/huawei/agconnect/apms/dcb;->abc(Ljava/lang/Object;)V

    goto :goto_2

    .line 37
    :cond_4
    invoke-virtual {p1, v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 38
    invoke-static {p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 39
    sget-object v0, Lcom/huawei/agconnect/apms/d;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "failed to get cdn info: "

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :goto_2
    return-object p0
.end method

.method public static abc(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lcom/huawei/agconnect/apms/fed;",
            ")",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/huawei/agconnect/apms/h;

    invoke-direct {v0, p0, p1}, Lcom/huawei/agconnect/apms/h;-><init>(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)V

    return-object v0
.end method

.method public static abc(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 2
    invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/fed;->bcd(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/apms/fed;->cde(J)V

    const/4 v0, 0x4

    .line 4
    iput v0, p1, Lcom/huawei/agconnect/apms/fed;->ghi:I

    .line 5
    invoke-static {p0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    sget-object v0, Lcom/huawei/agconnect/apms/d;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "failed to get request info: "

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :goto_0
    return-object p0
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->jkl()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 51
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    move-result v0

    if-nez v0, :cond_2

    .line 52
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 53
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    const-string v2, ""

    invoke-direct {v1, v0, v2}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 55
    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/fed;->cde(I)V

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 47
    :cond_0
    invoke-static {p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;)V

    return-void
.end method

.method public static abc(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V
    .locals 2

    .line 41
    instance-of v0, p0, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz v0, :cond_0

    .line 42
    check-cast p0, Lorg/apache/http/HttpEntityEnclosingRequest;

    .line 43
    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    new-instance v0, Lcom/huawei/agconnect/apms/e;

    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/huawei/agconnect/apms/e;-><init>(Lorg/apache/http/HttpEntity;Lcom/huawei/agconnect/apms/fed;)V

    invoke-interface {p0, v0}, Lorg/apache/http/HttpEntityEnclosingRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    :cond_0
    return-void
.end method
