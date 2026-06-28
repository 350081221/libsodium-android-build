.class public Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addNuwaTraceIdToHeaderAndEvent(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/q1;->abc()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "net-msg-id"

    .line 6
    .line 7
    invoke-static {v1, p0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->getInfoFromRequestHeaders(Ljava/lang/String;Lorg/apache/http/HttpRequest;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v1, v0}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v1, "x-microservice-name"

    .line 21
    .line 22
    invoke-static {v1, p0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->getInfoFromRequestHeaders(Ljava/lang/String;Lorg/apache/http/HttpRequest;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const-string v2, "APMS"

    .line 33
    .line 34
    invoke-interface {p0, v1, v2}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iput-object v0, p1, Lcom/huawei/agconnect/apms/fed;->jih:Ljava/lang/String;

    .line 38
    .line 39
    return-void
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

.method public static buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;
    .locals 1

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/fed;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->addNuwaTraceIdToHeaderAndEvent(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->prepareDnsInfo(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 9
    :cond_0
    invoke-static {p2}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 10
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-static {p3, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 11
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 12
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-interface {p0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 21
    :cond_0
    invoke-static {p2}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 22
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-static {p3, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 23
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 24
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 4
    :try_start_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-static {p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 5
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 6
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 15
    :cond_0
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 16
    :try_start_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-static {p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 17
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 18
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0

    .line 33
    :cond_0
    invoke-static {p2}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 34
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 35
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 36
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0

    .line 45
    :cond_0
    invoke-static {p2}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 46
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 47
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 48
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0

    .line 27
    :cond_0
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 28
    :try_start_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 29
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 30
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0

    .line 39
    :cond_0
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->buildEventState(Lorg/apache/http/HttpRequest;)Lcom/huawei/agconnect/apms/fed;

    move-result-object v0

    .line 40
    :try_start_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->warp(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 41
    invoke-static {v0, p0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 42
    throw p0
.end method

.method public static getInfoFromRequestHeaders(Ljava/lang/String;Lorg/apache/http/HttpRequest;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1, p0}, Lorg/apache/http/HttpRequest;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    array-length p1, p0

    .line 10
    if-lez p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    aget-object v1, p0, p1

    .line 14
    .line 15
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    aget-object p0, p0, p1

    .line 23
    .line 24
    invoke-interface {p0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
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

.method public static prepareDnsInfo(Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)V
    .locals 4

    .line 1
    const-string v0, " dns resolve failed, detail: "

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p0}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Lorg/apache/http/RequestLine;->getUri()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    new-instance v1, Ljava/net/URL;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_2
    sget-object v2, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {v2, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    const-string p0, ""

    .line 59
    .line 60
    :goto_0
    :try_start_3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    invoke-static {p0, p1}, Lcom/huawei/agconnect/apms/edc;->abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_1
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public static warp(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpRequest;

    move-result-object p0

    return-object p0
.end method

.method public static warp(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0
.end method

.method public static warp(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;
    .locals 0
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

    .line 4
    invoke-static {p0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/client/ResponseHandler;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p0

    return-object p0
.end method

.method public static warp(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/huawei/agconnect/apms/fed;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p0

    return-object p0
.end method
