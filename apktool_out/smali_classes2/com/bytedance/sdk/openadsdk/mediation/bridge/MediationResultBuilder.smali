.class public Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder$ResultImpl;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->a:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->b:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public build()Lcom/bykv/vk/openvk/api/proto/Result;
    .locals 7

    new-instance v6, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder$ResultImpl;

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->a:Z

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->b:I

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    :cond_0
    move-object v4, v0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder$ResultImpl;-><init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder$1;)V

    return-object v6
.end method

.method public setCode(I)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->b:I

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->c:Ljava/lang/String;

    return-object p0
.end method

.method public setSuccess(Z)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->a:Z

    return-object p0
.end method

.method public setValues(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationResultBuilder;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object p0
.end method
