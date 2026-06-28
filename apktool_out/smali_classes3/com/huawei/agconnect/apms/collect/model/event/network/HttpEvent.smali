.class public Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;
.super Lcom/huawei/agconnect/apms/collect/model/event/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;,
        Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;
    }
.end annotation


# instance fields
.field public bytesReceived:J

.field public bytesSent:J

.field public cdnProvider:Ljava/lang/String;

.field public connectFailedTimes:I

.field public connectTotalTimes:I

.field public contentLength:J

.field public contentType:Ljava/lang/String;

.field public dnsFailedTimes:I

.field public dnsInfos:Lorg/json/JSONArray;

.field public dnsTotalTimes:I

.field public domain:Ljava/lang/String;

.field public errorMessage:Ljava/lang/String;

.field public followUpTimes:I

.field public httpMethod:Ljava/lang/String;

.field public libType:I

.field public requestBodyEnd:I

.field public requestBodyStart:I

.field public requestHeadersEnd:I

.field public requestHeadersStart:I

.field public responseBodyEnd:I

.field public responseBodyStart:I

.field public responseHeaderEnd:I

.field public responseHeaderStart:I

.field public serverIp:Ljava/lang/String;

.field public socketInfos:Lorg/json/JSONArray;

.field public stackTrace:Ljava/lang/String;

.field public statusCode:I

.field public totalTime:J

.field public traceId:Ljava/lang/String;

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/gfe;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/model/event/Event;-><init>()V

    .line 2
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/gfe;->bcd:J

    .line 3
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    const-string v0, "native_http"

    .line 4
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->eventName:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->cde:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->url:Ljava/lang/String;

    .line 7
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->efg:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->httpMethod:Ljava/lang/String;

    .line 9
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/gfe;->klm:J

    .line 10
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->totalTime:J

    .line 11
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->jkl:I

    .line 12
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->statusCode:I

    .line 13
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/gfe;->vwx:J

    .line 14
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->bytesReceived:J

    .line 15
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/gfe;->qrs:J

    .line 16
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->bytesSent:J

    .line 17
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->fgh:Ljava/lang/String;

    .line 18
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->contentType:Ljava/lang/String;

    .line 19
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/gfe;->ghi:J

    .line 20
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->contentLength:J

    .line 21
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/gfe;->cde()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->errorMessage:Ljava/lang/String;

    .line 22
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getRuntimeEnvInformation()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 23
    iget-object v1, p1, Lcom/huawei/agconnect/apms/gfe;->uts:Lorg/json/JSONArray;

    .line 24
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->setSessionArray(Lorg/json/JSONArray;)V

    .line 25
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->hij:Ljava/lang/String;

    .line 26
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->domain:Ljava/lang/String;

    .line 27
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->lmn:I

    .line 28
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->followUpTimes:I

    .line 29
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->ijk:Ljava/lang/String;

    .line 30
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->serverIp:Ljava/lang/String;

    .line 31
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->yza:Ljava/util/List;

    .line 32
    invoke-direct {p0, v0}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->copyDnsInfoToEventList(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsInfos:Lorg/json/JSONArray;

    .line 33
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->wxy:I

    .line 34
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsFailedTimes:I

    .line 35
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->xyz:I

    .line 36
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsTotalTimes:I

    .line 37
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->yxw:Ljava/util/List;

    .line 38
    invoke-direct {p0, v0}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->copySocketInfoToEventList(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->socketInfos:Lorg/json/JSONArray;

    .line 39
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->zab:I

    .line 40
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->connectFailedTimes:I

    .line 41
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->zyx:I

    .line 42
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->connectTotalTimes:I

    .line 43
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->mno:I

    .line 44
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestHeadersStart:I

    .line 45
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->nop:I

    .line 46
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestHeadersEnd:I

    .line 47
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->opq:I

    .line 48
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestBodyStart:I

    .line 49
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->pqr:I

    .line 50
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestBodyEnd:I

    .line 51
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->rst:I

    .line 52
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseHeaderStart:I

    .line 53
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->stu:I

    .line 54
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseHeaderEnd:I

    .line 55
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->tuv:I

    .line 56
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseBodyStart:I

    .line 57
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->uvw:I

    .line 58
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseBodyEnd:I

    .line 59
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->wvu:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->stackTrace:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/gfe;->cde()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->errorMessage:Ljava/lang/String;

    .line 62
    iget v0, p1, Lcom/huawei/agconnect/apms/gfe;->vut:I

    .line 63
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->libType:I

    .line 64
    iget-object v0, p1, Lcom/huawei/agconnect/apms/gfe;->def:Ljava/lang/String;

    .line 65
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->cdnProvider:Ljava/lang/String;

    .line 66
    iget-object p1, p1, Lcom/huawei/agconnect/apms/gfe;->tsr:Ljava/lang/String;

    .line 67
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->traceId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;)V

    .line 69
    iget-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->stackTrace:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 70
    iput-object p2, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->stackTrace:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private copyDnsInfoToEventList(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/o;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    new-instance v3, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;

    .line 22
    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lcom/huawei/agconnect/apms/o;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;-><init>(Lcom/huawei/agconnect/apms/o;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->asJsonArray()Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v1
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
.end method

.method private copySocketInfoToEventList(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/p;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    new-instance v3, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;

    .line 22
    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lcom/huawei/agconnect/apms/p;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;-><init>(Lcom/huawei/agconnect/apms/p;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->asJsonArray()Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v1
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
.end method


# virtual methods
.method public asJsonArray()Lorg/json/JSONArray;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->asJsonArray()Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->url:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "null"

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    move-object v1, v2

    .line 27
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->libType:I

    .line 31
    .line 32
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->domain:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    move-object v1, v2

    .line 40
    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->cdnProvider:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    move-object v1, v2

    .line 48
    :cond_2
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->serverIp:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    move-object v1, v2

    .line 56
    :cond_3
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->httpMethod:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    move-object v1, v2

    .line 64
    :cond_4
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->contentType:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    move-object v1, v2

    .line 72
    :cond_5
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 73
    .line 74
    .line 75
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->contentLength:J

    .line 76
    .line 77
    invoke-static {v3, v4, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 78
    .line 79
    .line 80
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->statusCode:I

    .line 81
    .line 82
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 83
    .line 84
    .line 85
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->totalTime:J

    .line 86
    .line 87
    invoke-static {v3, v4, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 88
    .line 89
    .line 90
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestHeadersStart:I

    .line 91
    .line 92
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 93
    .line 94
    .line 95
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestHeadersEnd:I

    .line 96
    .line 97
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 98
    .line 99
    .line 100
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestBodyStart:I

    .line 101
    .line 102
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 103
    .line 104
    .line 105
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->requestBodyEnd:I

    .line 106
    .line 107
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 108
    .line 109
    .line 110
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->bytesSent:J

    .line 111
    .line 112
    invoke-static {v3, v4, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseHeaderStart:I

    .line 116
    .line 117
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseHeaderEnd:I

    .line 121
    .line 122
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 123
    .line 124
    .line 125
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseBodyStart:I

    .line 126
    .line 127
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 128
    .line 129
    .line 130
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->responseBodyEnd:I

    .line 131
    .line 132
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 133
    .line 134
    .line 135
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->bytesReceived:J

    .line 136
    .line 137
    invoke-static {v3, v4, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 138
    .line 139
    .line 140
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->followUpTimes:I

    .line 141
    .line 142
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsFailedTimes:I

    .line 146
    .line 147
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 148
    .line 149
    .line 150
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsTotalTimes:I

    .line 151
    .line 152
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->dnsInfos:Lorg/json/JSONArray;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 158
    .line 159
    .line 160
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->connectFailedTimes:I

    .line 161
    .line 162
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 163
    .line 164
    .line 165
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->connectTotalTimes:I

    .line 166
    .line 167
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->socketInfos:Lorg/json/JSONArray;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->errorMessage:Ljava/lang/String;

    .line 176
    .line 177
    if-nez v1, :cond_6

    .line 178
    .line 179
    move-object v1, v2

    .line 180
    :cond_6
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->stackTrace:Ljava/lang/String;

    .line 184
    .line 185
    if-nez v1, :cond_7

    .line 186
    .line 187
    move-object v1, v2

    .line 188
    :cond_7
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 189
    .line 190
    .line 191
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->traceId:Ljava/lang/String;

    .line 192
    .line 193
    if-nez v1, :cond_8

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_8
    move-object v2, v1

    .line 197
    :goto_0
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 198
    .line 199
    .line 200
    return-object v0
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;->url:Ljava/lang/String;

    return-void
.end method
