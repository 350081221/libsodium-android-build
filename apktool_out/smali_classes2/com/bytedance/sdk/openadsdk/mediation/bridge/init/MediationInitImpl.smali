.class public abstract Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/IMediationInit;


# instance fields
.field public mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getInitCallback()Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x1f55

    .line 14
    .line 15
    invoke-virtual {v1, v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-class v2, Ljava/lang/Void;

    .line 23
    .line 24
    const/16 v3, 0x204a

    .line 25
    .line 26
    invoke-interface {v0, v3, v1, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x2030

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x1f49

    .line 6
    .line 7
    const-class v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    const/16 v1, 0x20e8

    .line 16
    .line 17
    const-class v2, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    invoke-interface {p2, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->initAdn(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->callFunction(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public callFunction(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final initAdn(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->create(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->a()V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->realInitAdn(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public notifyFail(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getInitCallback()Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->setSuccess(Z)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;

    .line 4
    invoke-virtual {v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->setCode(I)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;

    .line 5
    invoke-virtual {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->setMessage(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    move-result-object p1

    const/16 p2, 0x1f56

    .line 7
    invoke-virtual {p1, p2, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const-class p2, Ljava/lang/Void;

    const/16 v1, 0x1fbb

    invoke-interface {v0, v1, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public notifyFail(Ljava/lang/String;)V
    .locals 1

    const v0, 0x13880

    .line 9
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifyFail(ILjava/lang/String;)V

    return-void
.end method

.method public notifySuccess()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getInitCallback()Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x1f55

    .line 14
    .line 15
    invoke-virtual {v1, v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-class v2, Ljava/lang/Void;

    .line 23
    .line 24
    const/16 v3, 0x1fba

    .line 25
    .line 26
    invoke-interface {v0, v3, v1, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public abstract realInitAdn(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
