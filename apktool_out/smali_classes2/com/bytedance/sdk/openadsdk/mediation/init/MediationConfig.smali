.class public Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$Builder;
    }
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;)Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->c:Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->d:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->f:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->b:Z

    return p1
.end method

.method static synthetic b(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->e:Z

    return p1
.end method

.method static synthetic c(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->g:Z

    return p1
.end method

.method static synthetic d(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->i:Z

    return p1
.end method

.method static synthetic e(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->j:Z

    return p1
.end method


# virtual methods
.method public getCustomLocalConfig()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->f:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getHttps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->e:Z

    return v0
.end method

.method public getLocalExtra()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->d:Ljava/util/Map;

    return-object v0
.end method

.method public getMediationConfigUserInfoForSegment()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->c:Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    return-object v0
.end method

.method public getOpensdkVer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getPublisherDid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->a:Ljava/lang/String;

    return-object v0
.end method

.method public isOpenAdnTest()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->b:Z

    return v0
.end method

.method public isSupportH265()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->i:Z

    return v0
.end method

.method public isSupportSplashZoomout()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->j:Z

    return v0
.end method

.method public isWxInstalled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->g:Z

    return v0
.end method

.method public wxAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfig;->k:Ljava/lang/String;

    return-object v0
.end method
