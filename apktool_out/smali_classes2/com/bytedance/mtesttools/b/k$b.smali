.class Lcom/bytedance/mtesttools/b/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/k;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashAdClick(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onAdClicked"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onSplashAdClose(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->o(Lcom/bytedance/mtesttools/b/k;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/k;->p(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationSplashManager;

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
    const-string v0, "onAdDismiss"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

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

.method public onSplashAdShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$b;->a:Lcom/bytedance/mtesttools/b/k;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onAdShow"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method
