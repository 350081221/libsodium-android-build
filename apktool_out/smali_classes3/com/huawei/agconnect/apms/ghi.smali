.class public Lcom/huawei/agconnect/apms/ghi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static volatile cde:Lcom/huawei/agconnect/apms/ghi;


# instance fields
.field public abc:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/ghi;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

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
.end method

.method public static declared-synchronized def()Lcom/huawei/agconnect/apms/ghi;
    .locals 2

    .line 1
    const-class v0, Lcom/huawei/agconnect/apms/ghi;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/ghi;->cde:Lcom/huawei/agconnect/apms/ghi;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/huawei/agconnect/apms/ghi;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/ghi;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/huawei/agconnect/apms/ghi;->cde:Lcom/huawei/agconnect/apms/ghi;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/ghi;->cde:Lcom/huawei/agconnect/apms/ghi;
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


# virtual methods
.method public abc()J
    .locals 2

    const-wide/16 v0, 0x3e8

    return-wide v0
.end method

.method public abc(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v2, 0x80

    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    sget-object v1, Lcom/huawei/agconnect/apms/ghi;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 28
    .line 29
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    new-array v3, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v4, 0x0

    .line 39
    aput-object p1, v3, v4

    .line 40
    .line 41
    const-string p1, "failed to load meta data: %s"

    .line 42
    .line 43
    invoke-static {v2, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iput-object v0, p0, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    .line 51
    .line 52
    return-void
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

.method public final abc(I)Z
    .locals 0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bcd()J
    .locals 2

    const-wide/16 v0, 0x3e8

    return-wide v0
.end method

.method public cde()J
    .locals 2

    const-wide/16 v0, 0xbb8

    return-wide v0
.end method
