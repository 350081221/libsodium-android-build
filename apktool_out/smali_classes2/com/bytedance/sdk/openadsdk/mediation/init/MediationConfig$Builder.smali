.class public Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Lorg/json/JSONObject;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:Z

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$1;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->b:Z

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->c:Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->d:Ljava/util/Map;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/util/Map;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->e:Z

    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->b(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->f:Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->g:Z

    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->c(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->h:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->b(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->i:Z

    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->d(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z

    .line 50
    .line 51
    .line 52
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->j:Z

    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->e(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->k:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->c(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    return-object v0
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

.method public setCustomLocalConfig(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->f:Lorg/json/JSONObject;

    return-object p0
.end method

.method public setHttps(Z)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->e:Z

    return-object p0
.end method

.method public setLocalExtra(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->d:Ljava/util/Map;

    return-object p0
.end method

.method public setMediationConfigUserInfoForSegment(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->c:Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    return-object p0
.end method

.method public setOpenAdnTest(Z)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->b:Z

    return-object p0
.end method

.method public setOpensdkVer(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->h:Ljava/lang/String;

    return-object p0
.end method

.method public setPublisherDid(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->a:Ljava/lang/String;

    return-object p0
.end method

.method public setSupportH265(Z)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->i:Z

    return-object p0
.end method

.method public setSupportSplashZoomout(Z)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->j:Z

    return-object p0
.end method

.method public setWxAppId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->k:Ljava/lang/String;

    return-object p0
.end method

.method public setWxInstalled(Z)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;->g:Z

    return-object p0
.end method
