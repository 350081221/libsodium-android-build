.class public Lcom/huawei/agconnect/apms/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/okhttp/Callback;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/fed;

.field public bcd:Lcom/squareup/okhttp/Callback;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/Callback;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/r;->bcd:Lcom/squareup/okhttp/Callback;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

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
.method public final abc()V
    .locals 3

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/u;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/u;-><init>()V

    .line 2
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/u;->abc()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/u;->bcd()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 4
    iget-object v0, v0, Lcom/huawei/agconnect/apms/fed;->lkj:Ljava/lang/Object;

    if-nez v0, :cond_2

    return-void

    .line 5
    :cond_2
    instance-of v1, v0, Lcom/squareup/okhttp/Call;

    if-nez v1, :cond_3

    return-void

    .line 6
    :cond_3
    sget-object v1, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    check-cast v0, Lcom/squareup/okhttp/Call;

    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/internal/Internal;->callEngineGetStreamAllocation(Lcom/squareup/okhttp/Call;)Lcom/squareup/okhttp/internal/http/StreamAllocation;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 8
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v1

    iget-object v1, v1, Lcom/squareup/okhttp/internal/io/RealConnection;->socket:Ljava/net/Socket;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v1

    iget-object v1, v1, Lcom/squareup/okhttp/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    .line 9
    :cond_4
    iget-object v1, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v0

    iget-object v0, v0, Lcom/squareup/okhttp/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/fed;->cde(Ljava/lang/String;)V

    nop

    :cond_5
    :goto_1
    return-void
.end method

.method public abc(Ljava/lang/Exception;)V
    .locals 3

    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 11
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 12
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    move-result p1

    if-nez p1, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 15
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 16
    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onFailure(Lcom/squareup/okhttp/Request;Ljava/io/IOException;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/huawei/agconnect/apms/r;->abc(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-object v2, v1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/Exception;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/huawei/agconnect/apms/r;->abc(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->bcd:Lcom/squareup/okhttp/Callback;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Lcom/squareup/okhttp/Callback;->onFailure(Lcom/squareup/okhttp/Request;Ljava/io/IOException;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public onResponse(Lcom/squareup/okhttp/Response;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/r;->abc()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/t;->abc(Lcom/huawei/agconnect/apms/fed;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    iget-object v1, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 21
    .line 22
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/Exception;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/huawei/agconnect/apms/r;->abc(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r;->bcd:Lcom/squareup/okhttp/Callback;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Lcom/huawei/agconnect/apms/w;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v3, p0, Lcom/huawei/agconnect/apms/r;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 49
    .line 50
    invoke-direct {v2, p1, v3}, Lcom/huawei/agconnect/apms/w;-><init>(Lcom/squareup/okhttp/ResponseBody;Lcom/huawei/agconnect/apms/fed;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {v0, p1}, Lcom/squareup/okhttp/Callback;->onResponse(Lcom/squareup/okhttp/Response;)V

    .line 62
    .line 63
    .line 64
    return-void
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
.end method
