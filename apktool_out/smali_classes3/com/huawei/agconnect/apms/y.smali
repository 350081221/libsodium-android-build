.class public Lcom/huawei/agconnect/apms/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Call;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/fed;

.field public bcd:Lokhttp3/Request;

.field public cde:Lokhttp3/Call;


# direct methods
.method public constructor <init>(Lokhttp3/Request;Lokhttp3/Call;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/y;->bcd:Lokhttp3/Request;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final abc()Lcom/huawei/agconnect/apms/fed;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iput-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/huawei/agconnect/apms/y;->bcd:Lokhttp3/Request;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/b0;->abc(Lcom/huawei/agconnect/apms/fed;Lokhttp3/Request;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->clone()Lokhttp3/Call;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lokhttp3/Call;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->clone()Lokhttp3/Call;

    move-result-object v0

    return-object v0
.end method

.method public enqueue(Lokhttp3/Callback;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->abc()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->cde(J)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    .line 14
    .line 15
    new-instance v1, Lcom/huawei/agconnect/apms/z;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 18
    .line 19
    invoke-direct {v1, p1, v2}, Lcom/huawei/agconnect/apms/z;-><init>(Lokhttp3/Callback;Lcom/huawei/agconnect/apms/fed;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method

.method public execute()Lokhttp3/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->abc()Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->cde(J)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    .line 14
    .line 15
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->abc()Lcom/huawei/agconnect/apms/fed;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->abc()Lcom/huawei/agconnect/apms/fed;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/b0;->abc(Lcom/huawei/agconnect/apms/fed;Lokhttp3/Response;)Lokhttp3/Response;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lcom/huawei/agconnect/apms/e0;

    .line 41
    .line 42
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v3, p0, Lcom/huawei/agconnect/apms/y;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 47
    .line 48
    invoke-direct {v2, v0, v3}, Lcom/huawei/agconnect/apms/e0;-><init>(Lokhttp3/ResponseBody;Lcom/huawei/agconnect/apms/fed;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/y;->abc()Lcom/huawei/agconnect/apms/fed;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-virtual {v1, v3}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    .line 95
    .line 96
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v1, v2, v3}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    throw v0
.end method

.method public isCanceled()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public isExecuted()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->isExecuted()Z

    move-result v0

    return v0
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method

.method public timeout()Lokio/p1;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/y;->cde:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->timeout()Lokio/p1;

    move-result-object v0

    return-object v0
.end method
