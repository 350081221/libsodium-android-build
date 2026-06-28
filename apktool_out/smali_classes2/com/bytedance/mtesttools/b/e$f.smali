.class Lcom/bytedance/mtesttools/b/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/e;->n(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/mtesttools/b/e$h;Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/TTAdDislike;

.field final synthetic b:Lcom/bytedance/mtesttools/b/e;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/e;Lcom/bytedance/sdk/openadsdk/TTAdDislike;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/e$f;->b:Lcom/bytedance/mtesttools/b/e;

    iput-object p2, p0, Lcom/bytedance/mtesttools/b/e$f;->a:Lcom/bytedance/sdk/openadsdk/TTAdDislike;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$f;->a:Lcom/bytedance/sdk/openadsdk/TTAdDislike;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTAdDislike;->showDislikeDialog()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$f;->a:Lcom/bytedance/sdk/openadsdk/TTAdDislike;

    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/mtesttools/b/e$f$a;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/b/e$f$a;-><init>(Lcom/bytedance/mtesttools/b/e$f;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTAdDislike;->setDislikeInteractionCallback(Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
