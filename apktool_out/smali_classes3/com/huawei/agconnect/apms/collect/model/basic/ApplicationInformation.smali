.class public Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"


# instance fields
.field public appName:Ljava/lang/String;

.field public appVersion:Ljava/lang/String;

.field public packageId:Ljava/lang/String;

.field public versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->versionCode:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appName:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appVersion:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->packageId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appName:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appVersion:Ljava/lang/String;

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
    iget v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->versionCode:I

    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(ILorg/json/JSONArray;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->packageId:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v2, v1

    .line 36
    :goto_0
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    return-object v0
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

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appName:Ljava/lang/String;

    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->appVersion:Ljava/lang/String;

    return-void
.end method

.method public setPackageId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->packageId:Ljava/lang/String;

    return-void
.end method

.method public setVersionCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;->versionCode:I

    return-void
.end method
