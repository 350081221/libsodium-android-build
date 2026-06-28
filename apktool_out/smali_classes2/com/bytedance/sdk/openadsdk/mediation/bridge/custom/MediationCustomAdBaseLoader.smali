.class public abstract Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/bridge/IMediationAdLoader;


# instance fields
.field public mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x20d5

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v2, Ljava/lang/String;

    .line 21
    .line 22
    const/16 v3, 0x201d

    .line 23
    .line 24
    invoke-interface {v1, v3, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7
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
    const/16 v0, 0x2031

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
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->load(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v0, 0x2021

    .line 30
    .line 31
    const-string v1, "TTMediationSDK"

    .line 32
    .line 33
    if-ne p1, v0, :cond_1

    .line 34
    .line 35
    const-string v0, "MediationCustomBaseLoader receiveBidResult"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 v0, 0x20d6

    .line 41
    .line 42
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->booleanValue(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v0, 0x20d7

    .line 47
    .line 48
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->doubleValue(I)D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const/16 v0, 0x20d8

    .line 53
    .line 54
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v0, 0x1f8b

    .line 59
    .line 60
    const-class v1, Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {p2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v6, v0

    .line 67
    check-cast v6, Ljava/util/Map;

    .line 68
    .line 69
    move-object v1, p0

    .line 70
    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->receiveBidResult(ZDILjava/util/Map;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/16 v0, 0x1fd5

    .line 75
    .line 76
    const-string v2, "MediationCustomBaseLoader onPause"

    .line 77
    .line 78
    if-ne p1, v0, :cond_2

    .line 79
    .line 80
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->onPause()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    const/16 v0, 0x1fd4

    .line 88
    .line 89
    if-ne p1, v0, :cond_3

    .line 90
    .line 91
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->onResume()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    const/16 v0, 0x1fad

    .line 99
    .line 100
    if-ne p1, v0, :cond_4

    .line 101
    .line 102
    const-string v0, "MediationCustomBaseLoader onDestroy"

    .line 103
    .line 104
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->onDestroy()V

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callMethod(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method public final callLoadFail(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x1f4e

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(II)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x1f4f

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-class v0, Ljava/lang/String;

    .line 26
    .line 27
    const/16 v1, 0x1fbb

    .line 28
    .line 29
    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
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
.end method

.method public abstract callMethod(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
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
.end method

.method public final getAdm()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-class v2, Ljava/lang/String;

    .line 7
    .line 8
    const/16 v3, 0x1fc9

    .line 9
    .line 10
    invoke-interface {v0, v3, v1, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public final getBiddingType()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const-class v3, Ljava/lang/Integer;

    .line 8
    .line 9
    const/16 v4, 0x2022

    .line 10
    .line 11
    invoke-interface {v0, v4, v2, v3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_1
    return v1
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

.method public final getExtraDataNoParse()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v2, 0x2020

    .line 7
    .line 8
    const-class v3, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-interface {v0, v2, v1, v3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    return-object v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getGMBridge()Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v2, 0x1fbf

    .line 7
    .line 8
    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 9
    .line 10
    invoke-interface {v0, v2, v1, v3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    return-object v1
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final load(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->create(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->getAdSlotValueSet()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/a;->a(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->getMediationCustomServiceConfigValue()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;-><init>(Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->getGMCustomAdLoader()Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->loadInner(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 27
    .line 28
    .line 29
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
.end method

.method public abstract load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
.end method

.method public final loadInner(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->a()V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    :try_start_0
    new-instance p2, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 9
    .line 10
    invoke-direct {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 0

    return-void
.end method

.method public receiveBidResult(ZDILjava/util/Map;)V
    .locals 0
    .param p5    # Ljava/util/Map;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZDI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final setMediaExtraInfo(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0x1f8b

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(ILjava/lang/Object;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->mGmAdLoader:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, Ljava/lang/Void;

    .line 23
    .line 24
    const/16 v2, 0x2023

    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

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
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
