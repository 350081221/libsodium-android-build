.class public Lcom/huawei/agconnect/apms/APMS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AGENT_CONFIGURATION:Lcom/huawei/agconnect/apms/efg;

.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static volatile apmsInstance:Lcom/huawei/agconnect/apms/APMS;

.field public static hasInit:Z


# instance fields
.field public isUserPrivacyAgreed:Z

.field public preferencesHolder:Lcom/huawei/agconnect/apms/ijk;


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
    sput-object v0, Lcom/huawei/agconnect/apms/APMS;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/efg;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/efg;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/APMS;->AGENT_CONFIGURATION:Lcom/huawei/agconnect/apms/efg;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    sput-boolean v0, Lcom/huawei/agconnect/apms/APMS;->hasInit:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/huawei/agconnect/apms/APMS;->preferencesHolder:Lcom/huawei/agconnect/apms/ijk;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/APMS;->isUserPrivacyAgreed:Z

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
.end method

.method public static getInstance()Lcom/huawei/agconnect/apms/APMS;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/APMS;->apmsInstance:Lcom/huawei/agconnect/apms/APMS;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/APMS;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/APMS;->apmsInstance:Lcom/huawei/agconnect/apms/APMS;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/APMS;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/APMS;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/APMS;->apmsInstance:Lcom/huawei/agconnect/apms/APMS;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/agconnect/apms/APMS;->apmsInstance:Lcom/huawei/agconnect/apms/APMS;

    .line 25
    .line 26
    return-object v0
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

.method private isDisableByUser()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/APMS;->AGENT_CONFIGURATION:Lcom/huawei/agconnect/apms/efg;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 4
    .line 5
    return v0
    .line 6
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
.end method

.method private isInstrumented()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public createApmsLog()Lcom/huawei/agconnect/apms/custom/ApmsLog;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/yxw;->bcd:Lcom/huawei/agconnect/apms/yxw;

    return-object v0
.end method

.method public createCustomTrace(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/CustomTrace;
    .locals 0

    invoke-static {p1}, Lcom/huawei/agconnect/apms/custom/CustomTrace;->getInstance(Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/CustomTrace;

    move-result-object p1

    return-object p1
.end method

.method public createNetworkMeasure(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/apms/custom/NetworkMeasure;
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;

    invoke-direct {v0, p1, p2}, Lcom/huawei/agconnect/apms/custom/NetworkMeasure;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public enableAnrMonitor(Z)V
    .locals 0

    invoke-static {p1}, Lcom/huawei/agconnect/apms/Agent;->enableAnrMonitor(Z)V

    return-void
.end method

.method public enableApmsLog(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/huawei/agconnect/apms/yxw;->bcd:Lcom/huawei/agconnect/apms/yxw;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/huawei/agconnect/apms/yxw;->abc:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/huawei/agconnect/apms/APMS;->preferencesHolder:Lcom/huawei/agconnect/apms/ijk;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/wvu;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-nez p1, :cond_2

    .line 20
    .line 21
    sget-object v0, Lcom/huawei/agconnect/apms/yxw;->bcd:Lcom/huawei/agconnect/apms/yxw;

    .line 22
    .line 23
    iget-boolean v0, v0, Lcom/huawei/agconnect/apms/yxw;->abc:Z

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Lcom/huawei/agconnect/apms/onm;->release()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    sput-object v0, Lcom/huawei/agconnect/apms/wvu;->bcd:Lcom/huawei/agconnect/apms/onm;

    .line 36
    .line 37
    :cond_2
    :goto_0
    sget-object v0, Lcom/huawei/agconnect/apms/yxw;->bcd:Lcom/huawei/agconnect/apms/yxw;

    .line 38
    .line 39
    iput-boolean p1, v0, Lcom/huawei/agconnect/apms/yxw;->abc:Z

    .line 40
    .line 41
    return-void
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
.end method

.method public enableCollection(Z)V
    .locals 0

    invoke-static {p1}, Lcom/huawei/agconnect/apms/Agent;->enableCollectionByUser(Z)V

    return-void
.end method

.method public isUserPrivacyAgreed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/APMS;->isUserPrivacyAgreed:Z

    return v0
.end method

.method public setAnalyticsEnabled(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->getInstance()Lcom/huawei/agconnect/common/network/AccessNetworkManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->setAccessNetwork(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->setAnalyticsEnable(Z)V

    .line 13
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/huawei/agconnect/apms/Agent;->setUserIdentifier(Ljava/lang/String;)V

    return-void
.end method

.method public setUserPrivacyAgreed(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/APMS;->isUserPrivacyAgreed:Z

    .line 2
    .line 3
    invoke-static {p1}, Lcom/huawei/agconnect/apms/Agent;->setUserPrivacyAgreed(Z)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->getInstance()Lcom/huawei/agconnect/common/network/AccessNetworkManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->setAccessNetwork(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->setAnalyticsEnable(Z)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public start(Landroid/content/Context;)V
    .locals 6

    .line 1
    sget-boolean v0, Lcom/huawei/agconnect/apms/APMS;->hasInit:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/huawei/agconnect/apms/APMS;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string v0, "APMS has already been initialized."

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/ghi;->abc(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    .line 25
    .line 26
    const-string v1, "apms_debug_log_enabled"

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sget-object v1, Lcom/huawei/agconnect/apms/APMS;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v3, 0x4

    .line 40
    :goto_0
    invoke-interface {v1, v3}, Lcom/huawei/agconnect/apms/log/AgentLog;->setLevel(I)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lcom/huawei/agconnect/apms/ijk;

    .line 44
    .line 45
    invoke-direct {v3, p1}, Lcom/huawei/agconnect/apms/ijk;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lcom/huawei/agconnect/apms/APMS;->preferencesHolder:Lcom/huawei/agconnect/apms/ijk;

    .line 49
    .line 50
    sget-object v4, Lcom/huawei/agconnect/apms/APMS;->AGENT_CONFIGURATION:Lcom/huawei/agconnect/apms/efg;

    .line 51
    .line 52
    const-string v5, "apms.disabled_by_user"

    .line 53
    .line 54
    invoke-virtual {v3, v5}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    iput-boolean v5, v4, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 59
    .line 60
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/APMS;->isDisableByUser()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    const-string p1, "APMS has been disabled by user, do not need init."

    .line 67
    .line 68
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lcom/huawei/agconnect/apms/hij;

    .line 72
    .line 73
    invoke-direct {p1, v4, v3}, Lcom/huawei/agconnect/apms/hij;-><init>(Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/huawei/agconnect/apms/Agent;->setImpl(Lcom/huawei/agconnect/apms/fgh;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    invoke-static {p1, v4, v3}, Lcom/huawei/agconnect/apms/def;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v1, v1, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    .line 88
    .line 89
    const-string v4, "apms_hilog_enabled"

    .line 90
    .line 91
    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-static {}, Lcom/huawei/agconnect/apms/wvu;->abc()V

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-static {p1, v3}, Lcom/huawei/agconnect/apms/wvu;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    sget-object p1, Lcom/huawei/agconnect/apms/yxw;->bcd:Lcom/huawei/agconnect/apms/yxw;

    .line 106
    .line 107
    iput-boolean v1, p1, Lcom/huawei/agconnect/apms/yxw;->abc:Z

    .line 108
    .line 109
    const/4 p1, 0x1

    .line 110
    sput-boolean p1, Lcom/huawei/agconnect/apms/APMS;->hasInit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    sget-object v0, Lcom/huawei/agconnect/apms/APMS;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 115
    .line 116
    const-string v1, "error occurred while init APMS: "

    .line 117
    .line 118
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-void
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
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
.end method
