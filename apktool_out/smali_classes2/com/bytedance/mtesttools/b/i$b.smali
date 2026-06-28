.class Lcom/bytedance/mtesttools/b/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/i;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/i;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClose()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->n(Lcom/bytedance/mtesttools/b/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/i;->o(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationFullScreenManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/i;->p(Lcom/bytedance/mtesttools/b/i;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onInterstitialFullClosed"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {v0, v3, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 49
    .line 50
    .line 51
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public onAdShow()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->n(Lcom/bytedance/mtesttools/b/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/i;->o(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationFullScreenManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/i;->p(Lcom/bytedance/mtesttools/b/i;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onIntersitialFullShow"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "onInterstitialFullShow"

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 51
    .line 52
    .line 53
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public onAdVideoBarClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->n(Lcom/bytedance/mtesttools/b/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/i;->o(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationFullScreenManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/i;->p(Lcom/bytedance/mtesttools/b/i;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onInterstitialFullClick"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {v0, v3, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 49
    .line 50
    .line 51
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public onSkippedVideo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->n(Lcom/bytedance/mtesttools/b/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/i;->o(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationFullScreenManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/i;->p(Lcom/bytedance/mtesttools/b/i;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onSkippedVideo"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {v0, v3, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 49
    .line 50
    .line 51
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public onVideoComplete()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->n(Lcom/bytedance/mtesttools/b/i;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/i;->o(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationFullScreenManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/i;->p(Lcom/bytedance/mtesttools/b/i;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onVideoComplete"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/i$b;->a:Lcom/bytedance/mtesttools/b/i;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/i;->k(Lcom/bytedance/mtesttools/b/i;)Lcom/bytedance/mtesttools/b/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {v0, v3, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 49
    .line 50
    .line 51
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
