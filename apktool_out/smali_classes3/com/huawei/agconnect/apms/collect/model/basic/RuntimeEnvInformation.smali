.class public Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# instance fields
.field public appBackgrounded:Z

.field public batteryPercentage:I

.field public deviceCharging:Z

.field public diskAvailable:J

.field public memoryUsage:J

.field public networkWanType:Ljava/lang/String;

.field public orientation:I

.field public sessionArray:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 2
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->sessionArray:Lorg/json/JSONArray;

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;J)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 4
    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->memoryUsage:J

    .line 5
    iput p3, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->orientation:I

    .line 6
    iput-object p4, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->networkWanType:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->diskAvailable:J

    .line 8
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->sessionArray:Lorg/json/JSONArray;

    return-void
.end method


# virtual methods
.method public addSession(Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->sessionArray:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/util/Session;->asJsonArray()Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-void
.end method

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
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->deviceCharging:Z

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->batteryPercentage:I

    .line 20
    .line 21
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->networkWanType:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-string v1, "null"

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->orientation:I

    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->appBackgrounded:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->sessionArray:Lorg/json/JSONArray;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->diskAvailable:J

    .line 57
    .line 58
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 59
    .line 60
    .line 61
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->memoryUsage:J

    .line 62
    .line 63
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 64
    .line 65
    .line 66
    return-object v0
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

.method public setAppBackgrounded(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->appBackgrounded:Z

    return-void
.end method

.method public setBatteryPercentage(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->batteryPercentage:I

    return-void
.end method

.method public setDeviceCharging(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->deviceCharging:Z

    return-void
.end method

.method public setDiskAvailable(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->diskAvailable:J

    return-void
.end method

.method public setMemoryUsage(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->memoryUsage:J

    return-void
.end method

.method public setNetworkWanType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->networkWanType:Ljava/lang/String;

    return-void
.end method

.method public setOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->orientation:I

    return-void
.end method

.method public setSessionArray(Lorg/json/JSONArray;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;->sessionArray:Lorg/json/JSONArray;

    return-void
.end method
