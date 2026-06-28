.class public Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:I

.field protected j:I

.field protected k:I

.field protected l:I

.field protected m:I

.field protected n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->n:Ljava/util/Map;

    .line 9
    .line 10
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->a:I

    .line 11
    .line 12
    new-instance p1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->n:Ljava/util/Map;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public addExtra(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->n:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public addExtras(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->n:Ljava/util/Map;

    return-object p0
.end method

.method public build()Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;)V

    return-object v0
.end method

.method public callToActionId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->d:I

    return-object p0
.end method

.method public descriptionTextId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->c:I

    return-object p0
.end method

.method public groupImage1Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->j:I

    return-object p0
.end method

.method public groupImage2Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->k:I

    return-object p0
.end method

.method public groupImage3Id(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->l:I

    return-object p0
.end method

.method public iconImageId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->e:I

    return-object p0
.end method

.method public logoLayoutId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->i:I

    return-object p0
.end method

.method public mainImageId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->f:I

    return-object p0
.end method

.method public mediaViewIdId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->g:I

    return-object p0
.end method

.method public shakeViewContainerId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->m:I

    return-object p0
.end method

.method public sourceId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->h:I

    return-object p0
.end method

.method public titleId(I)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    .locals 0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->b:I

    return-object p0
.end method
