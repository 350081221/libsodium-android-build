.class public Lcom/efs/sdk/base/core/config/GlobalEnvStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field public configRefreshDelayMills:J

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/Boolean;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:J

.field private k:J

.field private l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

.field public mAppContext:Landroid/content/Context;

.field private n:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Landroid/webkit/ValueCallback<",
            "Landroid/util/Pair<",
            "Landroid/os/Message;",
            "Landroid/os/Message;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/efs/sdk/base/observer/IEfsReporterObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->d:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->e:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->f:Ljava/lang/Boolean;

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->g:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->i:Z

    .line 18
    .line 19
    const-wide/16 v0, 0x1388

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->configRefreshDelayMills:J

    .line 22
    .line 23
    const-wide/16 v0, 0x2710

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->j:J

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->k:J

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->l:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->o:Ljava/util/List;

    .line 50
    .line 51
    return-void
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
.end method


# virtual methods
.method public addConfigObserver(Lcom/efs/sdk/base/observer/IEfsReporterObserver;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->o:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
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
    .line 24
.end method

.method public addPublicParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->l:Ljava/util/Map;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->l:Ljava/util/Map;

    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
    .line 23
    .line 24
.end method

.method public getAppid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getCallback(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/webkit/ValueCallback<",
            "Landroid/util/Pair<",
            "Landroid/os/Message;",
            "Landroid/os/Message;",
            ">;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/util/List;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
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
.end method

.method public getEfsReporterObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/efs/sdk/base/observer/IEfsReporterObserver;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->o:Ljava/util/List;

    return-object v0
.end method

.method public getLogEncryptAction()Lcom/efs/sdk/base/processor/action/ILogEncryptAction;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->m:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    return-object v0
.end method

.method public getLogSendDelayMills()J
    .locals 2

    iget-wide v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->j:J

    return-wide v0
.end method

.method public getLogSendIntervalMills()J
    .locals 2

    iget-wide v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->k:J

    return-wide v0
.end method

.method public getPublicParamMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->l:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
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
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->h:Ljava/lang/String;

    return-object v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->e:Z

    return v0
.end method

.method public isEnableSendLog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->d:Z

    return v0
.end method

.method public isEnableWaStat()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->c:Z

    return v0
.end method

.method public isIntl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->i:Z

    return v0
.end method

.method public isPrintLogDetail()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->g:Z

    return v0
.end method

.method public registerCallback(ILandroid/webkit/ValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/webkit/ValueCallback<",
            "Landroid/util/Pair<",
            "Landroid/os/Message;",
            "Landroid/os/Message;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void
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

.method public setAppid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->a:Ljava/lang/String;

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->e:Z

    return-void
.end method

.method public setEnableSendLog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->d:Z

    return-void
.end method

.method public setEnableWaStat(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->c:Z

    return-void
.end method

.method public setIsIntl(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->i:Z

    return-void
.end method

.method public setLogEncryptAction(Lcom/efs/sdk/base/processor/action/ILogEncryptAction;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->m:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    return-void
.end method

.method public setPrintLogDetail(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->g:Z

    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->b:Ljava/lang/String;

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->h:Ljava/lang/String;

    return-void
.end method
