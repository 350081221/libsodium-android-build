.class public Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final METHOD_NAME_APPLICATION_CREATE:Ljava/lang/String; = "#onCreate"

.field public static final METHOD_NAME_ATTACH_BASE_CONTEXT:Ljava/lang/String; = "#attachBaseContext"

.field public static final METHOD_NAME_ON_CREATE:Ljava/lang/String; = "#onCreate"

.field public static final METHOD_NAME_ON_RESTART:Ljava/lang/String; = "#onRestart"

.field public static final METHOD_NAME_ON_RESUME:Ljava/lang/String; = "#onResume"

.field public static final METHOD_NAME_ON_START:Ljava/lang/String; = "#onStart"

.field public static activityTrace:Lcom/huawei/agconnect/apms/k0;

.field public static volatile isBackground:Z

.field public static volatile selfApplication:Z


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
    sput-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    sput-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sput-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 12
    .line 13
    new-instance v0, Lcom/huawei/agconnect/apms/u0;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/u0;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applicationCreateBegin(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "#onCreate"

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Lcom/huawei/agconnect/apms/v0;->abc(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 20
    .line 21
    const-string v1, "AppInstrumentation.applicationCreateBegin() has an error: "

    .line 22
    .line 23
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
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

.method public static applicationCreateEnd()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/v0;->def()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    const-string v2, "AppInstrumentation.applicationCreateEnd() has an error: "

    .line 20
    .line 21
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
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

.method public static attachBaseContextBegin(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "#attachBaseContext"

    .line 6
    .line 7
    invoke-virtual {v0, p0, v1}, Lcom/huawei/agconnect/apms/v0;->bcd(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 13
    .line 14
    const-string v1, "AppInstrumentation.attachBaseContextBegin() has an error: "

    .line 15
    .line 16
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 p0, 0x1

    .line 24
    sput-boolean p0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 25
    .line 26
    return-void
    .line 27
.end method

.method public static attachBaseContextEnd()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/v0;->efg()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 11
    .line 12
    const-string v2, "AppInstrumentation.attachBaseContextEnd() has an error: "

    .line 13
    .line 14
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
.end method

.method public static onActivityCreateBegin(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "#onCreate"

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/k0;->bcd(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/v0;->abc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 30
    .line 31
    const-string v1, "AppInstrumentation.onActivityCreateBegin() has an error: "

    .line 32
    .line 33
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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

.method public static onActivityCreateEnd()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/k0;->abc()V

    .line 11
    .line 12
    .line 13
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/v0;->abc()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 28
    .line 29
    const-string v2, "AppInstrumentation.onActivityCreateEnd() has an error: "

    .line 30
    .line 31
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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

.method public static onActivityRestartBegin(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "#onRestart"

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/k0;->bcd(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/v0;->bcd(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 30
    .line 31
    const-string v1, "AppInstrumentation.onActivityRestartBegin() has an error: "

    .line 32
    .line 33
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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

.method public static onActivityRestartEnd()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/k0;->abc()V

    .line 11
    .line 12
    .line 13
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-wide v1, v0, Lcom/huawei/agconnect/apms/v0;->klm:J

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    cmp-long v1, v3, v1

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    iput-wide v1, v0, Lcom/huawei/agconnect/apms/v0;->klm:J

    .line 35
    .line 36
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 48
    .line 49
    const-string v2, "AppInstrumentation.onActivityRestartEnd() has an error: "

    .line 50
    .line 51
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
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

.method public static onActivityResumeBegin(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "#onResume"

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/k0;->cde(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/v0;->cde(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 30
    .line 31
    const-string v1, "AppInstrumentation.onActivityResumeBegin() has an error: "

    .line 32
    .line 33
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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

.method public static onActivityResumeEnd()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/k0;->bcd()Lcom/huawei/agconnect/apms/l0;

    .line 11
    .line 12
    .line 13
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/v0;->bcd()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 28
    .line 29
    const-string v2, "AppInstrumentation.onActivityResumeEnd() has an error: "

    .line 30
    .line 31
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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

.method public static onActivityStartBegin(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "#onStart"

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/k0;->abc(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0, v0}, Lcom/huawei/agconnect/apms/v0;->def(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 30
    .line 31
    const-string v1, "AppInstrumentation.onActivityStartBegin() has an error: "

    .line 32
    .line 33
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p0, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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

.method public static onActivityStartEnd()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->activityTrace:Lcom/huawei/agconnect/apms/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/k0;->cde()V

    .line 11
    .line 12
    .line 13
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/v0;->ijk()Lcom/huawei/agconnect/apms/v0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/v0;->cde()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 28
    .line 29
    const-string v2, "AppInstrumentation.onActivityStartEnd() has an error: "

    .line 30
    .line 31
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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
