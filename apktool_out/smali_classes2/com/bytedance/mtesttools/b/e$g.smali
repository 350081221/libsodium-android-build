.class Lcom/bytedance/mtesttools/b/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/e;->n(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/mtesttools/b/e$h;Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/e;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/e;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->r(Lcom/bytedance/mtesttools/b/e;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/e;->t(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/TTNativeAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationNativeManager;

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
    const-string v0, "onAdClick"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->l(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->l(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/mtesttools/b/b;

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

.method public onAdCreativeClick(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V
    .locals 0

    return-void
.end method

.method public onAdShow(Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->r(Lcom/bytedance/mtesttools/b/e;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/e;->t(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationNativeManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "onAdShow"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {v1, p1, v0, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->l(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$g;->a:Lcom/bytedance/mtesttools/b/e;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->l(Lcom/bytedance/mtesttools/b/e;)Lcom/bytedance/mtesttools/b/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1, v1, v2}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
.end method
