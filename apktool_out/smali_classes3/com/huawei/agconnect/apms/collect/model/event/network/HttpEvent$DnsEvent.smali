.class public Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DnsEvent"
.end annotation


# instance fields
.field public addressList:Ljava/lang/String;

.field public dnsStart:I

.field public dnsStop:I

.field public domainName:Ljava/lang/String;

.field public isSuccess:Z


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/huawei/agconnect/apms/o;->abc:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->domainName:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/huawei/agconnect/apms/o;->def:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->addressList:Ljava/lang/String;

    .line 11
    .line 12
    iget v0, p1, Lcom/huawei/agconnect/apms/o;->bcd:I

    .line 13
    .line 14
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->dnsStart:I

    .line 15
    .line 16
    iget v0, p1, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 17
    .line 18
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->dnsStop:I

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/o;->abc()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->isSuccess:Z

    .line 25
    .line 26
    return-void
    .line 27
.end method


# virtual methods
.method public asJsonArray()Lorg/json/JSONArray;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->domainName:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->addressList:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "null"

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 22
    .line 23
    .line 24
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->dnsStart:I

    .line 25
    .line 26
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->dnsStop:I

    .line 30
    .line 31
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent$DnsEvent;->isSuccess:Z

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 45
    .line 46
    .line 47
    return-object v0
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
.end method
