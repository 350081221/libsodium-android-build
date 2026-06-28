.class public Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# instance fields
.field public architecture:Ljava/lang/String;

.field public cpuCores:I

.field public cpuModel:Ljava/lang/String;

.field public deviceModel:Ljava/lang/String;

.field public diskSize:J

.field public manufacturer:Ljava/lang/String;

.field public ramMemory:J

.field public refreshRate:D

.field public resolution:Ljava/lang/String;

.field public screenSize:D

.field public screenType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->manufacturer:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->architecture:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->deviceModel:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->manufacturer:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->architecture:Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "null"

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :cond_0
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->deviceModel:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    move-object v1, v2

    .line 30
    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->screenSize:D

    .line 34
    .line 35
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Double;)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->resolution:Ljava/lang/String;

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    move-object v1, v2

    .line 51
    :cond_2
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->screenType:Ljava/lang/String;

    .line 55
    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_3
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 60
    .line 61
    .line 62
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->refreshRate:D

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Double;)Ljava/lang/Double;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->cpuModel:Ljava/lang/String;

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    move-object v2, v1

    .line 81
    :goto_0
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 82
    .line 83
    .line 84
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->cpuCores:I

    .line 85
    .line 86
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 87
    .line 88
    .line 89
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->ramMemory:J

    .line 90
    .line 91
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 92
    .line 93
    .line 94
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->diskSize:J

    .line 95
    .line 96
    invoke-static {v1, v2, v0}, Lcom/huawei/agconnect/apms/abc;->abc(JLorg/json/JSONArray;)V

    .line 97
    .line 98
    .line 99
    return-object v0
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public setCpuCores(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->cpuCores:I

    return-void
.end method

.method public setCpuModel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->cpuModel:Ljava/lang/String;

    return-void
.end method

.method public setDiskSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->diskSize:J

    return-void
.end method

.method public setRamMemory(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->ramMemory:J

    return-void
.end method

.method public setRefreshRate(D)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->refreshRate:D

    return-void
.end method

.method public setResolution(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->resolution:Ljava/lang/String;

    return-void
.end method

.method public setScreenSize(D)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->screenSize:D

    return-void
.end method

.method public setScreenType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;->screenType:Ljava/lang/String;

    return-void
.end method
