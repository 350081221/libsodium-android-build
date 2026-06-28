.class public Lcom/huawei/agconnect/apms/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final bcd:[I

.field public static final cde:Ljava/io/FileFilter;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [I

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    aput v1, v0, v2

    .line 16
    .line 17
    sput-object v0, Lcom/huawei/agconnect/apms/j1;->bcd:[I

    .line 18
    .line 19
    new-instance v0, Lcom/huawei/agconnect/apms/j1$abc;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/j1$abc;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/huawei/agconnect/apms/j1;->cde:Ljava/io/FileFilter;

    .line 25
    .line 26
    return-void
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

.method public static abc(Ljava/lang/String;Ljava/io/BufferedReader;)I
    .locals 7

    const-string v0, "failed to close /proc/meminfo file"

    const/4 v1, -0x1

    if-nez p1, :cond_0

    return v1

    .line 8
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 10
    invoke-virtual {v3, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    .line 11
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 12
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_2

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x39

    if-gt v5, v6, :cond_2

    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_4

    .line 15
    :try_start_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 16
    :catch_0
    sget-object p0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {p0, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_1
    return v1

    .line 17
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    :try_start_3
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    .line 19
    :catch_1
    sget-object p1, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_2
    return p0

    :catchall_0
    move-exception p0

    .line 20
    :try_start_4
    sget-object v2, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "failed to read /proc/meminfo file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 21
    :try_start_5
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_2
    move-exception p0

    .line 22
    :try_start_6
    sget-object v2, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "failed to parse mem info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 23
    :try_start_7
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    .line 24
    :catch_3
    sget-object p0, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {p0, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_3
    return v1

    :catchall_1
    move-exception p0

    .line 25
    :try_start_8
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_4

    .line 26
    :catch_4
    sget-object p1, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 27
    :goto_4
    throw p0
.end method

.method public static abc()J
    .locals 11

    const/4 v0, 0x2

    new-array v0, v0, [J

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    .line 28
    :try_start_0
    new-instance v5, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 29
    new-instance v6, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v7

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v9

    mul-long/2addr v7, v9

    aput-wide v7, v0, v2

    .line 31
    invoke-virtual {v6}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v8

    mul-long/2addr v6, v8

    aput-wide v6, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aget-wide v8, v0, v2

    cmp-long v5, v8, v3

    if-gez v5, :cond_0

    aput-wide v3, v0, v2

    :cond_0
    cmp-long v5, v6, v3

    if-gez v5, :cond_2

    aput-wide v3, v0, v1

    goto :goto_0

    :catchall_0
    move-exception v5

    .line 32
    :try_start_1
    sget-object v6, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "can not get available disk size: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    aget-wide v5, v0, v2

    cmp-long v5, v5, v3

    if-gez v5, :cond_1

    aput-wide v3, v0, v2

    :cond_1
    aget-wide v5, v0, v1

    cmp-long v5, v5, v3

    if-gez v5, :cond_2

    aput-wide v3, v0, v1

    :cond_2
    :goto_0
    aget-wide v2, v0, v2

    aget-wide v4, v0, v1

    add-long/2addr v2, v4

    return-wide v2

    :catchall_1
    move-exception v5

    aget-wide v6, v0, v2

    cmp-long v6, v6, v3

    if-gez v6, :cond_3

    aput-wide v3, v0, v2

    :cond_3
    aget-wide v6, v0, v1

    cmp-long v2, v6, v3

    if-gez v2, :cond_4

    aput-wide v3, v0, v1

    .line 33
    :cond_4
    throw v5
.end method

.method public static abc(Landroid/content/Context;)J
    .locals 6

    const-wide/16 v0, 0x0

    :try_start_0
    const-string v2, "activity"

    .line 1
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    if-nez p0, :cond_0

    return-wide v0

    .line 2
    :cond_0
    sget-object v2, Lcom/huawei/agconnect/apms/j1;->bcd:[I

    invoke-virtual {p0, v2}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 3
    array-length v2, p0

    if-lez v2, :cond_2

    const/4 v2, 0x0

    .line 4
    aget-object p0, p0, v2

    if-nez p0, :cond_1

    return-wide v0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I

    move-result p0

    int-to-long v2, p0

    cmp-long p0, v2, v0

    if-ltz p0, :cond_2

    const-wide/16 v4, 0x400

    .line 6
    div-long/2addr v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v2

    :catchall_0
    move-exception p0

    .line 7
    sget-object v2, Lcom/huawei/agconnect/apms/j1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v3, "failed to get memory usage: "

    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p0, v3, v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_2
    return-wide v0
.end method

.method public static bcd()I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 3
    .line 4
    const-string v2, "/sys/devices/system/cpu/"

    .line 5
    .line 6
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lcom/huawei/agconnect/apms/j1;->cde:Ljava/io/FileFilter;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    array-length v0, v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :catch_0
    :catchall_0
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method
