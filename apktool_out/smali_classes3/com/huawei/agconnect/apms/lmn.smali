.class public abstract Lcom/huawei/agconnect/apms/lmn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final cde:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static def:Z


# instance fields
.field public final abc:Ljava/lang/Object;

.field public bcd:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/huawei/agconnect/apms/mno;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->abc:Ljava/lang/Object;

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


# virtual methods
.method public abc()V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lmn;->bcd:Ljava/util/Set;

    if-nez v1, :cond_0

    .line 8
    monitor-exit v0

    return-void

    .line 9
    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/apms/mno;

    if-eqz v2, :cond_1

    .line 10
    invoke-interface {v2}, Lcom/huawei/agconnect/apms/mno;->abc()V

    goto :goto_0

    .line 11
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abc(Lcom/huawei/agconnect/apms/mno;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lmn;->bcd:Ljava/util/Set;

    if-nez v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abc(Ljava/lang/String;)Z
    .locals 30

    move-object/from16 v1, p1

    .line 12
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const-string v0, "activity"

    .line 13
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    if-nez v0, :cond_1

    return v3

    :cond_1
    const/4 v4, 0x1

    .line 14
    sput-boolean v4, Lcom/huawei/agconnect/apms/lmn;->def:Z

    move v5, v3

    :goto_0
    int-to-long v6, v5

    const-wide/16 v8, 0x1e

    cmp-long v6, v6, v8

    const/4 v7, 0x2

    if-gez v6, :cond_6

    .line 15
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getProcessesInErrorState()Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_2

    .line 16
    sget-object v6, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "waiting for anr state info, check times: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    const-wide/16 v6, 0x1f4

    .line 17
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 18
    :catchall_0
    sget-object v6, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v7, "waiting to search process error info."

    invoke-interface {v6, v7}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    move v8, v3

    .line 19
    :goto_1
    :try_start_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_5

    .line 20
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;

    .line 21
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v10

    iget v11, v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;->pid:I

    if-eq v10, v11, :cond_3

    .line 22
    sget-object v9, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v10, "not this application process."

    invoke-interface {v9, v10}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :cond_3
    sget-object v10, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "processErrorStateInfo condition: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v12, v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 24
    iget v10, v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v10, v7, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 25
    :catchall_1
    sget-object v6, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v7, "the ANR process detection is interrupted."

    invoke-interface {v6, v7}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    :cond_5
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    const/4 v9, 0x0

    :goto_4
    if-nez v9, :cond_8

    .line 26
    sget-object v0, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "maybe it is not an anr, continue."

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 27
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_7

    .line 28
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "delete anrPath file failed."

    .line 29
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 30
    :cond_7
    sput-boolean v3, Lcom/huawei/agconnect/apms/lmn;->def:Z

    return v3

    .line 31
    :cond_8
    sput-boolean v3, Lcom/huawei/agconnect/apms/lmn;->def:Z

    .line 32
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/agconnect/apms/lmn;->abc()V

    .line 33
    new-instance v5, Lcom/huawei/agconnect/apms/rst;

    invoke-direct {v5}, Lcom/huawei/agconnect/apms/rst;-><init>()V

    .line 34
    iget-object v6, v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;->longMsg:Ljava/lang/String;

    .line 35
    iput-object v6, v5, Lcom/huawei/agconnect/apms/rst;->def:Ljava/lang/String;

    .line 36
    iget-object v6, v9, Landroid/app/ActivityManager$ProcessErrorStateInfo;->tag:Ljava/lang/String;

    .line 37
    iput-object v6, v5, Lcom/huawei/agconnect/apms/rst;->bcd:Ljava/lang/String;

    .line 38
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const-string v8, ""

    if-eqz v6, :cond_9

    .line 39
    iput-object v8, v5, Lcom/huawei/agconnect/apms/rst;->bcd:Ljava/lang/String;

    .line 40
    :cond_9
    new-instance v6, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v6}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 41
    invoke-virtual {v0, v6}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 42
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    .line 43
    new-instance v9, Lcom/huawei/agconnect/apms/stu;

    invoke-direct {v9, v0, v6}, Lcom/huawei/agconnect/apms/stu;-><init>(Ljava/lang/Runtime;Landroid/app/ActivityManager$MemoryInfo;)V

    .line 44
    iput-object v9, v5, Lcom/huawei/agconnect/apms/rst;->efg:Lcom/huawei/agconnect/apms/stu;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v6

    .line 47
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v9

    .line 48
    invoke-interface {v6, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    .line 49
    invoke-virtual {v9}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v10

    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    :cond_a
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 51
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/StackTraceElement;

    array-length v10, v10

    if-lez v10, :cond_b

    .line 52
    new-instance v10, Lcom/huawei/agconnect/apms/tuv$bcd;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Thread;

    invoke-direct {v10, v9}, Lcom/huawei/agconnect/apms/tuv$bcd;-><init>(Ljava/lang/Thread;)V

    .line 53
    new-instance v9, Lcom/huawei/agconnect/apms/tuv;

    iget-object v12, v10, Lcom/huawei/agconnect/apms/tuv$bcd;->abc:Ljava/lang/String;

    iget-object v13, v10, Lcom/huawei/agconnect/apms/tuv$bcd;->bcd:Ljava/lang/String;

    iget v14, v10, Lcom/huawei/agconnect/apms/tuv$bcd;->cde:I

    iget-object v15, v10, Lcom/huawei/agconnect/apms/tuv$bcd;->def:Ljava/lang/String;

    const/16 v16, 0x0

    move-object v11, v9

    invoke-direct/range {v11 .. v16}, Lcom/huawei/agconnect/apms/tuv;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/huawei/agconnect/apms/tuv$abc;)V

    .line 54
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 55
    :cond_c
    iput-object v0, v5, Lcom/huawei/agconnect/apms/rst;->cde:Ljava/util/List;

    .line 56
    invoke-static {}, Lcom/huawei/secure/android/common/detect/c;->h()Z

    move-result v0

    .line 57
    iput-boolean v0, v5, Lcom/huawei/agconnect/apms/rst;->abc:Z

    .line 58
    new-instance v0, Lcom/huawei/agconnect/apms/qrs;

    invoke-direct {v0, v5}, Lcom/huawei/agconnect/apms/qrs;-><init>(Lcom/huawei/agconnect/apms/rst;)V

    .line 59
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/qrs;->abc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const v6, 0x25800

    sub-int/2addr v6, v0

    .line 60
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 61
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    invoke-static {}, Lcom/huawei/agconnect/apms/w1;->abc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1d

    const-string v15, "\n"

    if-lt v0, v9, :cond_d

    const-string v0, "network status:\nnot supported collect network statues on Android Q (API level 29) and later.\n\n"

    goto :goto_6

    :cond_d
    const-string v0, "network status:\n IPv4-based TCP (From: /proc/PID/net/tcp)\n"

    .line 64
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v16, "/proc/self/net/tcp"

    const/16 v17, 0x400

    const-string v19, "-"

    const-string v20, "\n"

    const-string v21, " IPv6-based TCP (From: /proc/PID/net/tcp6)"

    const-string v22, "\n"

    .line 65
    invoke-static/range {v16 .. v22}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v23, "/proc/self/net/tcp6"

    const/16 v24, 0x400

    const-string v26, "-"

    const-string v27, "\n"

    const-string v28, " IPv4-based UDP (From: /proc/PID/net/udp)"

    const-string v29, "\n"

    .line 66
    invoke-static/range {v23 .. v29}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v16, "/proc/self/net/udp"

    const-string v19, "-"

    const-string v20, "\n"

    const-string v21, " IPv6-based UDP (From: /proc/PID/net/udp6)"

    const-string v22, "\n"

    .line 67
    invoke-static/range {v16 .. v22}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v23, "/proc/self/net/udp6"

    const-string v26, "-"

    const-string v27, "\n"

    const-string v28, " IPv4-based ICMP (From: /proc/PID/net/icmp)"

    const-string v29, "\n"

    .line 68
    invoke-static/range {v23 .. v29}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v16, "/proc/self/net/icmp"

    const/16 v17, 0x100

    const-string v19, "-"

    const-string v20, "\n"

    const-string v21, " IPv6-based ICMP (From: /proc/PID/net/icmp6)"

    const-string v22, "\n"

    .line 69
    invoke-static/range {v16 .. v22}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v23, "/proc/self/net/icmp6"

    const/16 v24, 0x100

    const-string v26, "-"

    const-string v27, "\n"

    const-string v28, " UNIX domain (From: /proc/PID/net/unix)"

    const-string v29, "\n"

    .line 70
    invoke-static/range {v23 .. v29}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;ILjava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, "/proc/self/net/unix"

    const/16 v10, 0x100

    .line 71
    invoke-static {v9, v10}, Lcom/huawei/agconnect/apms/w1;->abc(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    :goto_6
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "memory status:\n System Status (From: /proc/meminfo)\n"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/proc/meminfo"

    .line 74
    invoke-static {v0}, Lcom/huawei/agconnect/apms/w1;->abc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " Process Status (From: /proc/PID/status)"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "/proc/self/status"

    .line 75
    invoke-static {v10}, Lcom/huawei/agconnect/apms/w1;->abc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " Process Limits (From: /proc/PID/limits)"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "/proc/self/limits"

    .line 76
    invoke-static {v10}, Lcom/huawei/agconnect/apms/w1;->abc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, " Process Status (From: android.os.Debug.MemoryInfo)\n"

    .line 78
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v11, v7, [Ljava/lang/Object;

    aput-object v8, v11, v3

    const-string v12, "Pss(KB)"

    aput-object v12, v11, v4

    const-string v12, "%21s %8s%n"

    invoke-static {v0, v12, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v11, v7, [Ljava/lang/Object;

    aput-object v8, v11, v3

    const-string v13, "------"

    aput-object v13, v11, v4

    .line 80
    invoke-static {v0, v12, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    :try_start_2
    new-instance v11, Landroid/os/Debug$MemoryInfo;

    invoke-direct {v11}, Landroid/os/Debug$MemoryInfo;-><init>()V

    .line 82
    invoke-static {v11}, Landroid/os/Debug;->getMemoryInfo(Landroid/os/Debug$MemoryInfo;)V

    new-array v13, v7, [Ljava/lang/Object;

    const-string v16, "Java Heap:"

    aput-object v16, v13, v3

    const-string v3, "summary.java-heap"

    .line 83
    invoke-virtual {v11, v3}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v13, v4

    invoke-static {v0, v12, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "Native Heap:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.native-heap"

    .line 84
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "Code:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.code"

    .line 85
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "Stack:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.stack"

    .line 86
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "Graphics:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.graphics"

    .line 87
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "Private Other:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.private-other"

    .line 88
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v7, [Ljava/lang/Object;

    const-string v13, "System:"

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "summary.system"

    .line 89
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v3, v4

    invoke-static {v0, v12, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v3, "%21s %8s %21s %8s%n"

    const/4 v12, 0x4

    :try_start_3
    new-array v12, v12, [Ljava/lang/Object;

    const-string v13, "TOTAL:"

    const/16 v16, 0x0

    aput-object v13, v12, v16

    const-string v13, "summary.total-pss"

    .line 90
    invoke-virtual {v11, v13}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v4

    const-string v13, "TOTAL SWAP:"

    aput-object v13, v12, v7

    const-string v7, "summary.total-swap"

    invoke-virtual {v11, v7}, Landroid/os/Debug$MemoryInfo;->getMemoryStat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x3

    aput-object v7, v12, v11

    invoke-static {v0, v3, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    .line 91
    sget-object v3, Lcom/huawei/agconnect/apms/w1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "get memory status of process failed. "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 92
    :goto_7
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 96
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    if-gtz v14, :cond_e

    goto :goto_8

    :cond_e
    const-string v7, "logcat:\n"

    .line 97
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "system"

    const/16 v12, 0x32

    const/16 v13, 0x57

    move v9, v0

    move-object v10, v3

    .line 98
    invoke-static/range {v9 .. v14}, Lcom/huawei/agconnect/apms/w1;->abc(ILjava/lang/StringBuilder;Ljava/lang/String;ICI)I

    move-result v22

    const-string v19, "events"

    const/16 v20, 0x32

    const/16 v21, 0x49

    move/from16 v17, v0

    move-object/from16 v18, v3

    .line 99
    invoke-static/range {v17 .. v22}, Lcom/huawei/agconnect/apms/w1;->abc(ILjava/lang/StringBuilder;Ljava/lang/String;ICI)I

    move-result v22

    const-string v19, "main"

    const/16 v20, 0x7d0

    const/16 v21, 0x57

    .line 100
    invoke-static/range {v17 .. v22}, Lcom/huawei/agconnect/apms/w1;->abc(ILjava/lang/StringBuilder;Ljava/lang/String;ICI)I

    .line 101
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 103
    :goto_8
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 105
    iput-object v0, v5, Lcom/huawei/agconnect/apms/rst;->ghi:Ljava/lang/String;

    .line 106
    new-instance v0, Lcom/huawei/agconnect/apms/qrs;

    invoke-direct {v0, v5}, Lcom/huawei/agconnect/apms/qrs;-><init>(Lcom/huawei/agconnect/apms/rst;)V

    .line 107
    sget-object v3, Lcom/huawei/agconnect/apms/klm;->efg:Lcom/huawei/agconnect/apms/pqr;

    .line 108
    invoke-virtual {v3, v2, v0}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/qrs;)V

    .line 109
    new-instance v0, Ljava/lang/Thread;

    new-instance v3, Lcom/huawei/agconnect/apms/klm$abc;

    const/4 v5, 0x0

    invoke-direct {v3, v2, v1, v5}, Lcom/huawei/agconnect/apms/klm$abc;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 110
    new-instance v1, Lcom/huawei/agconnect/apms/jkl;

    invoke-direct {v1}, Lcom/huawei/agconnect/apms/jkl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    const-string v1, "send-anr-thread"

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const-wide/16 v1, 0xbb8

    .line 113
    :try_start_4
    invoke-virtual {v0, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_9

    .line 114
    :catchall_3
    sget-object v0, Lcom/huawei/agconnect/apms/klm;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "the ANR information upload failed. will upload the information again upon next startup."

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_9
    return v4
.end method

.method public bcd(Lcom/huawei/agconnect/apms/mno;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lmn;->bcd:Ljava/util/Set;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
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
