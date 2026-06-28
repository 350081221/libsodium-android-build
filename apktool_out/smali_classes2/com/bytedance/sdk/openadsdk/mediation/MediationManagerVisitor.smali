.class public Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

.field private static volatile b:Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private c:Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->a:Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->a:Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->a:Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

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
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->a:Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;

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
.end method


# virtual methods
.method public declared-synchronized getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/IMediationManager;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v1, "mediation_manager"

    .line 8
    .line 9
    const-string v2, "mediation_manager"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 26
    .line 27
    sput-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->c:Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/b;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/g;

    .line 38
    .line 39
    sget-object v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/g;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->c:Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/b;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationManagerVisitor;->c:Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    monitor-exit p0

    .line 49
    return-object v0

    .line 50
    :cond_2
    monitor-exit p0

    .line 51
    return-object v2

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    monitor-exit p0

    .line 54
    throw v0
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
