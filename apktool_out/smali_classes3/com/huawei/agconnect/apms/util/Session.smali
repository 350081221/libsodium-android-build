.class public Lcom/huawei/agconnect/apms/util/Session;
.super Lcom/huawei/agconnect/apms/collect/type/CollectableArray;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/huawei/agconnect/apms/util/Session;",
            ">;"
        }
    .end annotation
.end field

.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public sampled:Z

.field public sessionId:Ljava/lang/String;

.field public sessionTime:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/util/Session;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/util/Session$abc;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/util/Session$abc;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/util/Session;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionId:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionTime:J

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/agconnect/apms/util/Session$abc;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/util/Session;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    .line 2
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/type/CollectableArray;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionId:Ljava/lang/String;

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionTime:J

    .line 5
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    move-result-object p1

    .line 6
    iget-object p1, p1, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    const-string v2, "sessions_sampling_percentage"

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr p1, v2

    const/4 v2, 0x0

    cmpg-float v4, v2, p1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-gtz v4, :cond_0

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    float-to-double v2, p1

    cmpg-double p1, v0, v2

    if-gez p1, :cond_2

    goto :goto_2

    :cond_2
    move v5, v6

    .line 7
    :goto_2
    iput-boolean v5, p0, Lcom/huawei/agconnect/apms/util/Session;->sampled:Z

    return-void
.end method

.method public static getInstance()Lcom/huawei/agconnect/apms/util/Session;
    .locals 7

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "-"

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/huawei/agconnect/apms/util/Session;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/huawei/agconnect/apms/util/Session;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lcom/huawei/agconnect/apms/util/Session;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 23
    .line 24
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    new-array v4, v4, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-boolean v5, v1, Lcom/huawei/agconnect/apms/util/Session;->sampled:Z

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    const-string v5, "sampled"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v5, "Non sampled"

    .line 37
    .line 38
    :goto_0
    const/4 v6, 0x0

    .line 39
    aput-object v5, v4, v6

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    aput-object v0, v4, v5

    .line 43
    .line 44
    const-string v0, "Creating a new %s Session: %s"

    .line 45
    .line 46
    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v2, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1
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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionId:Ljava/lang/String;

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
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/util/Session;->sampled:Z

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lcom/huawei/agconnect/apms/t1;->abc(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    return-object v0
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

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isExpired()Z
    .locals 5

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionTime:J

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    sub-long/2addr v1, v3

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->bcd()Lcom/huawei/agconnect/apms/wxy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-wide v2, v2, Lcom/huawei/agconnect/apms/wxy;->efg:J

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    return v0
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

.method public isSampled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/util/Session;->sampled:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/util/Session;->sessionTime:J

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method
