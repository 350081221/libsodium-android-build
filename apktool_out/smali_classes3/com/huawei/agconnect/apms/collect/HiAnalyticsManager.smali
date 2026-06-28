.class public Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APM_EVENT_ID:Ljava/lang/String; = "APMS"

.field public static final HTTP_HEADER:Ljava/lang/String; = "com.huawei.agconnect.apms"

.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final SERVICE_TAG:Ljava/lang/String; = "APMS"

.field public static volatile instance:Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;


# instance fields
.field public analyticsInternalInstance:Lv1/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->instance:Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->instance:Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->instance:Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

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
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->instance:Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

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

.method private initDebugLog()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->getLevel()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lcom/huawei/hms/analytics/HiAnalyticsTools;->enableLog(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x4

    .line 15
    invoke-static {v0}, Lcom/huawei/hms/analytics/HiAnalyticsTools;->enableLog(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    sget-object v1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 21
    .line 22
    const-string v2, "exception occurred when init HiAnalytics log: "

    .line 23
    .line 24
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
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


# virtual methods
.method public init(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->initDebugLog()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v0, "APMS"

    .line 9
    .line 10
    const-string v1, "com.huawei.agconnect.apms"

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/huawei/agconnect/apms/z1;->abc(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lv1/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 21
    .line 22
    const-string v1, "exception occurred when init HiAnalytics: "

    .line 23
    .line 24
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    sget-object p1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 36
    .line 37
    const-string v0, "failed to init HiAnalytics instance."

    .line 38
    .line 39
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    :try_start_1
    invoke-interface {p1, v0}, Lv1/a;->setEnableAndroidID(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 50
    .line 51
    const-string v1, "exception occurred when disable Android ID: "

    .line 52
    .line 53
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    return-void
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

.method public onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string p2, "can not operate with HiAnalytics null instance."

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {v0, p1, p2}, Lv1/a;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    sget-object p2, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 19
    .line 20
    const-string v0, "exception occurred when operate HiAnalytics: "

    .line 21
    .line 22
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p1, v0, p2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public onReport()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string v1, "can not operate with HiAnalytics null instance."

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lv1/a;->onReport()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    sget-object v1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 19
    .line 20
    const-string v2, "exception occurred when operate HiAnalytics: "

    .line 21
    .line 22
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public setAnalyticsEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->analyticsInternalInstance:Lv1/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const-string v0, "can not operate with HiAnalytics null instance."

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lv1/a;->setAnalyticsEnabled(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    sget-object v0, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 19
    .line 20
    const-string v1, "exception occurred when set Analytics Enable : "

    .line 21
    .line 22
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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
.end method
