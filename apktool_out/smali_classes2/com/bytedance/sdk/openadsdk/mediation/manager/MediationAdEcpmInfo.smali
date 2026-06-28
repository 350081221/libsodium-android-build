.class public Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->p:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p16

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->p:Ljava/util/Map;

    move-object v3, p1

    .line 5
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->a:Ljava/lang/String;

    move-object v3, p2

    .line 6
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->b:Ljava/lang/String;

    move-object v3, p3

    .line 7
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->c:Ljava/lang/String;

    move-object v3, p4

    .line 8
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->d:Ljava/lang/String;

    move-object v3, p5

    .line 9
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->e:Ljava/lang/String;

    move v3, p6

    .line 10
    iput v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->f:I

    move-object v3, p7

    .line 11
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->g:Ljava/lang/String;

    move-object v3, p8

    .line 12
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->h:Ljava/lang/String;

    move-object v3, p9

    .line 13
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->i:Ljava/lang/String;

    move-object v3, p10

    .line 14
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->j:Ljava/lang/String;

    move-object v3, p11

    .line 15
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->k:Ljava/lang/String;

    move-object/from16 v3, p12

    .line 16
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->l:Ljava/lang/String;

    move-object/from16 v3, p13

    .line 17
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->m:Ljava/lang/String;

    move-object/from16 v3, p14

    .line 18
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->n:Ljava/lang/String;

    move-object/from16 v3, p15

    .line 19
    iput-object v3, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->o:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 20
    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->p:Ljava/util/Map;

    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    :goto_0
    return-void
.end method


# virtual methods
.method public getAbTestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomData()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->p:Ljava/util/Map;

    return-object v0
.end method

.method public getCustomSdkName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getEcpm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getLevelTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getReqBiddingType()I
    .locals 1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->f:I

    return v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getRitType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getScenarioId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getSdkName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getSegmentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getSlotId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getSubChannel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getSubRitType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->j:Ljava/lang/String;

    return-object v0
.end method
