.class public Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SocketEvent"
.end annotation


# instance fields
.field public cipherSuite:Ljava/lang/String;

.field public connectEnd:I

.field public connectStart:I

.field public errorDesc:Ljava/lang/String;

.field public httpVersion:Ljava/lang/String;

.field public inetaddress:Ljava/lang/String;

.field public isHttps:Z

.field public isSuccess:Z

.field public secConnectEnd:I

.field public secConnectStart:I

.field public tlsVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/huawei/agconnect/apms/p;->abc:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->inetaddress:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p1, Lcom/huawei/agconnect/apms/p;->cde:I

    .line 9
    .line 10
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->connectEnd:I

    .line 11
    .line 12
    iget v0, p1, Lcom/huawei/agconnect/apms/p;->bcd:I

    .line 13
    .line 14
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->connectStart:I

    .line 15
    .line 16
    iget v0, p1, Lcom/huawei/agconnect/apms/p;->efg:I

    .line 17
    .line 18
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->secConnectEnd:I

    .line 19
    .line 20
    iget v0, p1, Lcom/huawei/agconnect/apms/p;->def:I

    .line 21
    .line 22
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->secConnectStart:I

    .line 23
    .line 24
    iget-boolean v0, p1, Lcom/huawei/agconnect/apms/p;->fgh:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->isHttps:Z

    .line 27
    .line 28
    iget-object v0, p1, Lcom/huawei/agconnect/apms/p;->ghi:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->httpVersion:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p1, Lcom/huawei/agconnect/apms/p;->hij:Ljava/lang/String;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->tlsVersion:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, p1, Lcom/huawei/agconnect/apms/p;->ijk:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->cipherSuite:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v0, p1, Lcom/huawei/agconnect/apms/p;->jkl:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->isSuccess:Z

    .line 43
    .line 44
    iget-object p1, p1, Lcom/huawei/agconnect/apms/p;->klm:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->errorDesc:Ljava/lang/String;

    .line 47
    .line 48
    return-void
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
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->inetaddress:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->connectStart:I

    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->connectEnd:I

    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->secConnectStart:I

    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->secConnectEnd:I

    .line 31
    .line 32
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 33
    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->isHttps:Z

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->httpVersion:Ljava/lang/String;

    .line 49
    .line 50
    const-string v2, "null"

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    move-object v1, v2

    .line 55
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->tlsVersion:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    move-object v1, v2

    .line 63
    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->cipherSuite:Ljava/lang/String;

    .line 67
    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    move-object v1, v2

    .line 71
    :cond_2
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 72
    .line 73
    .line 74
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->isSuccess:Z

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$SocketEvent;->errorDesc:Ljava/lang/String;

    .line 88
    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move-object v2, v1

    .line 93
    :goto_0
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 94
    .line 95
    .line 96
    return-object v0
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
.end method
