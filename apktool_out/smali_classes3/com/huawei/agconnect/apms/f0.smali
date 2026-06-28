.class public Lcom/huawei/agconnect/apms/f0;
.super Lokhttp3/Response$Builder;
.source "SourceFile"


# instance fields
.field public abc:Lokhttp3/Response$Builder;


# direct methods
.method public constructor <init>(Lokhttp3/Response$Builder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/Response$Builder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Response$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method public cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public code(I)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Response$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public message(Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public networkResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->networkResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public removeHeader(Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method

.method public request(Lokhttp3/Request;)Lokhttp3/Response$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object p1

    return-object p1
.end method
