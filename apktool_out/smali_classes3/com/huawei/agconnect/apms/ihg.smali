.class public Lcom/huawei/agconnect/apms/ihg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/kji;


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public final abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    .line 5
    .line 6
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static synthetic a(Lcom/huawei/agconnect/apms/ihg;Ljava/text/SimpleDateFormat;Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/agconnect/apms/ihg;->abc(Ljava/text/SimpleDateFormat;Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic abc(Ljava/io/File;Ljava/io/File;)I
    .locals 4

    .line 13
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide p0

    sub-long/2addr v0, p0

    const-wide/16 p0, 0x0

    cmp-long p0, v0, p0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 27
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 28
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "task_id"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getUserIdentifier()Ljava/lang/String;

    move-result-object v1

    const-string v2, "user_identifier"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getVersion()Ljava/lang/String;

    move-result-object v1

    const-string v2, "agent_version"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getPlatformInformation()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;->asJsonArray()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "platform"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "file_name"

    .line 32
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "log"

    .line 33
    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    sget-object p2, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "UploadTask upload content task_id "

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", len "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-object v0
.end method

.method private synthetic abc(Ljava/text/SimpleDateFormat;Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    const-string p2, ".log"

    .line 8
    invoke-virtual {p3, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p1, p3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    .line 11
    iget-object p3, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-virtual {p3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getStartTime()J

    move-result-wide v1

    cmp-long p3, p1, v1

    if-ltz p3, :cond_1

    iget-object p3, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-virtual {p3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getEndTime()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p1, p1, v1

    if-gtz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    .line 12
    :catch_0
    sget-object p1, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "UploadTask getUploadFiles ParseException"

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :cond_2
    return v0
.end method


# virtual methods
.method public final abc()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyyMMdd-HHmmss-SSS"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    new-instance v1, Ljava/io/File;

    .line 3
    sget-object v2, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->ghi:Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;

    .line 4
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->cde()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ls1/a;

    invoke-direct {v2, p0, v0}, Ls1/a;-><init>(Lcom/huawei/agconnect/apms/ihg;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Ls1/b;

    invoke-direct {v1}, Ls1/b;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 6
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 7
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public final abc(JLjava/lang/String;)Lorg/json/JSONArray;
    .locals 5

    const-string v0, "\\|"

    const/4 v1, 0x5

    .line 16
    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p3

    .line 17
    array-length v0, p3

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    const/4 v0, 0x0

    .line 18
    :try_start_0
    aget-object v0, p3, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    iget-object v3, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->isValidateTime()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 20
    iget-object v3, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getStartTime()J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-ltz v3, :cond_1

    iget-object v3, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getEndTime()J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-lez v3, :cond_2

    :cond_1
    return-object v2

    .line 21
    :cond_2
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 22
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 23
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    const/4 p1, 0x1

    .line 24
    :goto_0
    array-length p2, p3

    if-ge p1, p2, :cond_3

    .line 25
    aget-object p2, p3, p1

    invoke-virtual {v2, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :catch_0
    :cond_3
    return-object v2
.end method

.method public final abc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/apms/ihg;->abc:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-static {v1, p1, p2}, Lcom/huawei/agconnect/apms/ihg;->abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const-string p2, "APMS_LOG"

    invoke-virtual {v0, p2, p1}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final bcd()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x7d0

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/ihg;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 8
    .line 9
    const-string v1, "UploadTask sleep InterruptedException"

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :goto_0
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
