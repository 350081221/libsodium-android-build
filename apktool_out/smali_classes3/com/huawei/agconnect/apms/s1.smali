.class public Lcom/huawei/agconnect/apms/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/s1$abc;
    }
.end annotation


# static fields
.field public static final mno:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static volatile nop:Lcom/huawei/agconnect/apms/s1;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/n1;

.field public bcd:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/app/Activity;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public cde:I

.field public def:I

.field public efg:I

.field public fgh:J

.field public ghi:J

.field public hij:J

.field public ijk:J

.field public jkl:J

.field public klm:J

.field public lmn:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
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
    iput v0, p0, Lcom/huawei/agconnect/apms/s1;->cde:I

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/agconnect/apms/s1;->def:I

    .line 8
    .line 9
    iput v0, p0, Lcom/huawei/agconnect/apms/s1;->efg:I

    .line 10
    .line 11
    new-instance v0, Lcom/huawei/agconnect/apms/n1;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/n1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/huawei/agconnect/apms/s1;->abc:Lcom/huawei/agconnect/apms/n1;

    .line 17
    .line 18
    new-instance v0, Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/huawei/agconnect/apms/s1;->bcd:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->addApplicationStateListener(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public static efg()Lcom/huawei/agconnect/apms/s1;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/s1;->nop:Lcom/huawei/agconnect/apms/s1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/s1;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/s1;->nop:Lcom/huawei/agconnect/apms/s1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/s1;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/s1;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/s1;->nop:Lcom/huawei/agconnect/apms/s1;

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
    sget-object v0, Lcom/huawei/agconnect/apms/s1;->nop:Lcom/huawei/agconnect/apms/s1;

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


# virtual methods
.method public final abc(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p1, :cond_0

    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public abc()V
    .locals 2

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->jkl:J

    return-void
.end method

.method public final abc(JLjava/lang/String;Ljava/lang/String;JJJ)V
    .locals 13

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v12, Lcom/huawei/agconnect/apms/s1$abc;

    move-object v1, v12

    move-wide v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/huawei/agconnect/apms/s1$abc;-><init>(JLjava/lang/String;Ljava/lang/String;JJJ)V

    invoke-interface {v0, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final abc(Ljava/lang/String;JJ)V
    .locals 9

    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    cmp-long v2, p4, v0

    if-lez v2, :cond_2

    sub-long v7, p4, p2

    cmp-long p4, v7, v0

    if-gtz p4, :cond_1

    goto :goto_0

    .line 14
    :cond_1
    new-instance p4, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ForeAndBackgroundEvent;

    move-object v3, p4

    move-wide v4, p2

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ForeAndBackgroundEvent;-><init>(JLjava/lang/String;J)V

    .line 15
    invoke-static {p4}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public abc(Ljava/lang/ref/WeakReference;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->ghi:J

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_2

    .line 5
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->jkl:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/s1;->abc(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v4

    .line 8
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->ghi:J

    iget-wide v2, p0, Lcom/huawei/agconnect/apms/s1;->jkl:J

    sub-long v6, v0, v2

    const-string v5, "cold_load"

    const-wide/16 v8, -0x1

    const-wide/16 v10, -0x1

    move-object v1, p0

    .line 9
    invoke-virtual/range {v1 .. v11}, Lcom/huawei/agconnect/apms/s1;->abc(JLjava/lang/String;Ljava/lang/String;JJJ)V

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/s1;->def()V

    :cond_2
    :goto_0
    return-void
.end method

.method public applicationBackgrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->klm:J

    .line 6
    .line 7
    sget-object p1, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 8
    .line 9
    const-string v0, "backgroundStartTime: "

    .line 10
    .line 11
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/s1;->klm:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/s1;->lmn:J

    .line 28
    .line 29
    iget-wide v5, p0, Lcom/huawei/agconnect/apms/s1;->klm:J

    .line 30
    .line 31
    const-string v2, "foreground"

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    invoke-virtual/range {v1 .. v6}, Lcom/huawei/agconnect/apms/s1;->abc(Ljava/lang/String;JJ)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public applicationForegrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->lmn:J

    .line 6
    .line 7
    sget-object p1, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 8
    .line 9
    const-string v0, "foregroundStartTime: "

    .line 10
    .line 11
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/s1;->lmn:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/s1;->klm:J

    .line 28
    .line 29
    iget-wide v5, p0, Lcom/huawei/agconnect/apms/s1;->lmn:J

    .line 30
    .line 31
    const-string v2, "background"

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    invoke-virtual/range {v1 .. v6}, Lcom/huawei/agconnect/apms/s1;->abc(Ljava/lang/String;JJ)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public bcd()V
    .locals 2

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->ijk:J

    return-void
.end method

.method public bcd(Ljava/lang/ref/WeakReference;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->hij:J

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    .line 5
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->ijk:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/s1;->abc(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v4

    .line 7
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->hij:J

    iget-wide v2, p0, Lcom/huawei/agconnect/apms/s1;->ijk:J

    sub-long v6, v0, v2

    .line 8
    iget-wide v8, p0, Lcom/huawei/agconnect/apms/s1;->fgh:J

    sub-long v10, v8, v2

    sub-long v12, v0, v8

    const-string v5, "cold_load"

    move-object v1, p0

    move-wide v8, v10

    move-wide v10, v12

    .line 9
    invoke-virtual/range {v1 .. v11}, Lcom/huawei/agconnect/apms/s1;->abc(JLjava/lang/String;Ljava/lang/String;JJJ)V

    .line 10
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/s1;->def()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final bcd(Landroid/app/Activity;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v1, 0x1000000

    and-int/2addr p1, v1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public cde()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->fgh:J

    return-void
.end method

.method public final def()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->ijk:J

    .line 4
    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/s1;->jkl:J

    .line 6
    .line 7
    return-void
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
