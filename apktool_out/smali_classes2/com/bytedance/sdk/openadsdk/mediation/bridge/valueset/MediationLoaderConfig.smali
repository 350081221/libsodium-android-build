.class public Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method private constructor <init>(Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x20e8

    .line 7
    .line 8
    const-class v1, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 9
    .line 10
    invoke-interface {p1, v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
.end method

.method private a()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static create(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;-><init>(Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    return-object v0
.end method


# virtual methods
.method public getADNName()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x1f43

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getAdSlotValueSet()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x2164

    const-class v2, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getAdType()I
    .locals 2

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x1f48

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x1f4a

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 3

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x1f49

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getGMCustomAdLoader()Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 3

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x1f4b

    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMediationCustomServiceConfigValue()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationLoaderConfig;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/16 v1, 0x2162

    const-class v2, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
