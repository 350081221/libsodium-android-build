.class public Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppInfoExtra()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->i:Ljava/util/Map;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthorName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getFunctionDescUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageSizeBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->c:J

    return-wide v0
.end method

.method public getPermissionsMap()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->e:Ljava/util/Map;

    return-object v0
.end method

.method public getPermissionsUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getPrivacyAgreement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public setAppInfoExtra(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->i:Ljava/util/Map;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->a:Ljava/lang/String;

    return-void
.end method

.method public setAuthorName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->b:Ljava/lang/String;

    return-void
.end method

.method public setFunctionDescUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->h:Ljava/lang/String;

    return-void
.end method

.method public setPackageSizeBytes(J)V
    .locals 0

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->c:J

    return-void
.end method

.method public setPermissionsMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->e:Ljava/util/Map;

    return-void
.end method

.method public setPermissionsUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->d:Ljava/lang/String;

    return-void
.end method

.method public setPrivacyAgreement(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->f:Ljava/lang/String;

    return-void
.end method

.method public setVersionName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->g:Ljava/lang/String;

    return-void
.end method
