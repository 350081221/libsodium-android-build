.class Lcom/bytedance/mtesttools/b/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/d;->p(Landroid/view/View;Lcom/bytedance/mtesttools/b/d$e;Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeAdInfo;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdDislike;

.field final synthetic b:Lcom/bytedance/mtesttools/b/d;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/d;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdDislike;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/d$d;->b:Lcom/bytedance/mtesttools/b/d;

    iput-object p2, p0, Lcom/bytedance/mtesttools/b/d$d;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdDislike;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$d;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdDislike;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdDislike;->showDislikeDialog()V

    return-void
.end method
