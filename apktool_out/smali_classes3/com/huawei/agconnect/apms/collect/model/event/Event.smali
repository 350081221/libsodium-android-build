.class public abstract Lcom/huawei/agconnect/apms/collect/model/event/Event;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# instance fields
.field public eventName:Ljava/lang/String;

.field public runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

.field public timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    return-void
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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->eventName:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    return-object v0
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

.method public getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public getRuntimeEnvInformation()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    return-wide v0
.end method

.method public setEventName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->eventName:Ljava/lang/String;

    return-void
.end method

.method public setRuntimeEnvInformation(Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->runtimeEnvInformation:Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    return-void
.end method

.method public setTimestamp(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/event/Event;->timestamp:J

    return-void
.end method
