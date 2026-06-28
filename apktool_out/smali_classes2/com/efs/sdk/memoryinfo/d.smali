.class final Lcom/efs/sdk/memoryinfo/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;


# instance fields
.field private A:Z

.field private u:Z

.field private v:Z

.field private w:Lcom/efs/sdk/memoryinfo/b;

.field private x:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

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
.end method


# virtual methods
.method public final getCurrentActivity()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/d;->x:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
    .line 26
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
.end method

.method public final isEnable()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/d;->w:Lcom/efs/sdk/memoryinfo/b;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, v0, Lcom/efs/sdk/memoryinfo/b;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final isForeground()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->y:Z

    return v0
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/efs/sdk/memoryinfo/d;->x:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    return-void
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
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    iget-boolean p1, p0, Lcom/efs/sdk/memoryinfo/d;->A:Z

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lcom/efs/sdk/memoryinfo/d;->A:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_2
    iget p1, p0, Lcom/efs/sdk/memoryinfo/d;->z:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lcom/efs/sdk/memoryinfo/d;->z:I

    .line 22
    .line 23
    if-ne p1, v0, :cond_3

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->y:Z

    .line 26
    .line 27
    :cond_3
    return-void
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
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->A:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_2
    iget p1, p0, Lcom/efs/sdk/memoryinfo/d;->z:I

    .line 20
    .line 21
    sub-int/2addr p1, v0

    .line 22
    iput p1, p0, Lcom/efs/sdk/memoryinfo/d;->z:I

    .line 23
    .line 24
    if-nez p1, :cond_3

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-boolean p1, p0, Lcom/efs/sdk/memoryinfo/d;->y:Z

    .line 28
    .line 29
    :cond_3
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
.end method

.method public final setEnable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    return-void
.end method

.method public final start(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->u:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/efs/sdk/memoryinfo/d;->u:Z

    .line 19
    .line 20
    new-instance v0, Lcom/efs/sdk/memoryinfo/b;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, Lcom/efs/sdk/memoryinfo/b;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/efs/sdk/memoryinfo/d;->w:Lcom/efs/sdk/memoryinfo/b;

    .line 26
    .line 27
    const-string p1, "apm_memperf_collect_interval"

    .line 28
    .line 29
    const-string p2, "apm_memperf_collect_max_period_sec"

    .line 30
    .line 31
    const-string v1, "apm_memperf_sampling_rate"

    .line 32
    .line 33
    filled-new-array {v1, p1, p2}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p2, v0, Lcom/efs/sdk/memoryinfo/b;->a:Lcom/efs/sdk/base/EfsReporter;

    .line 38
    .line 39
    new-instance v1, Lcom/efs/sdk/memoryinfo/b$1;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lcom/efs/sdk/memoryinfo/b$1;-><init>(Lcom/efs/sdk/memoryinfo/b;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1, v1}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
.end method
