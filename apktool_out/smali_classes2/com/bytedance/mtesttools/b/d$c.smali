.class Lcom/bytedance/mtesttools/b/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/d;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->v(Lcom/bytedance/mtesttools/b/d;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/d;->r(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationNativeManager;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "onAdClicked"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->v(Lcom/bytedance/mtesttools/b/d;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/d;->r(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationNativeManager;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "onAdShow"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/d$c;->a:Lcom/bytedance/mtesttools/b/d;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/d;->n(Lcom/bytedance/mtesttools/b/d;)Lcom/bytedance/mtesttools/b/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    return-void
.end method
