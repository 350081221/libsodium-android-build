.class public Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public getRules()I
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    iget-boolean v3, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v3, v2

    .line 18
    :goto_1
    iget-boolean v4, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    .line 19
    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    const/16 v4, 0x8

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move v4, v2

    .line 26
    :goto_2
    iget-boolean v5, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    .line 27
    .line 28
    if-eqz v5, :cond_3

    .line 29
    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    :cond_3
    or-int/2addr v2, v4

    .line 33
    or-int/2addr v2, v3

    .line 34
    or-int/2addr v1, v2

    .line 35
    or-int/2addr v0, v1

    .line 36
    return v0
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

.method public isAppListEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    return v0
.end method

.method public isIMEIAndMEIDEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    return v0
.end method

.method public isLocationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    return v0
.end method

.method public isMACEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    return v0
.end method

.method public isWiFiEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    return v0
.end method

.method public setAppListEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    return-object p0
.end method

.method public setIMEIAndMEIDEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    return-object p0
.end method

.method public setLocationEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    return-object p0
.end method

.method public setMACEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    return-object p0
.end method

.method public setWifiEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    return-object p0
.end method
