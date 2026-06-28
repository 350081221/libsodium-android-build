.class public Lcom/huawei/agconnect/apms/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static cde:Lcom/huawei/agconnect/apms/k1;


# instance fields
.field public final abc:Ljava/util/Properties;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/k1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "failed to close build prop file: "

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/Properties;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    .line 12
    .line 13
    new-instance v2, Ljava/io/FileInputStream;

    .line 14
    .line 15
    new-instance v3, Ljava/io/File;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "build.prop"

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v1

    .line 37
    sget-object v2, Lcom/huawei/agconnect/apms/k1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v2, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    :catchall_0
    move-exception v1

    .line 59
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_1
    move-exception v2

    .line 64
    sget-object v3, Lcom/huawei/agconnect/apms/k1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v3, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    throw v1
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

.method public static declared-synchronized abc()Lcom/huawei/agconnect/apms/k1;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-class v0, Lcom/huawei/agconnect/apms/k1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/k1;->cde:Lcom/huawei/agconnect/apms/k1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/huawei/agconnect/apms/k1;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/k1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/huawei/agconnect/apms/k1;->cde:Lcom/huawei/agconnect/apms/k1;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/k1;->cde:Lcom/huawei/agconnect/apms/k1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
    .line 22
    .line 23
.end method
