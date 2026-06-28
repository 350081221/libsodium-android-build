.class Lcom/bytedance/mtesttools/b/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/j;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/j;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClose()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

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
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onRewardedAdClosed"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

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
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onRewardedAdShow"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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

.method public onAdVideoBarClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

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
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "onRewardClick"

    .line 28
    .line 29
    invoke-static {v3, v0, v1, v2}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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

.method public onRewardArrived(ZILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {p2, p3}, Lcom/bytedance/mtesttools/b/j;->k(Lcom/bytedance/mtesttools/b/j;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-string p3, "rewardVeridy"

    .line 13
    .line 14
    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 24
    .line 25
    invoke-static {p2}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationBaseManager;->getShowEcpm()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p3, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 38
    .line 39
    invoke-static {p3}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    const-string v0, "onRewardVerify"

    .line 44
    .line 45
    invoke-static {v0, p1, p2, p3}, Lcom/bytedance/mtesttools/b/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 p2, 0x0

    .line 64
    invoke-interface {p1, v0, p2}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 65
    .line 66
    .line 67
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public onRewardVerify(ZILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onSkippedVideo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

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
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->o(Lcom/bytedance/mtesttools/b/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/j;->p(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationRewardManager;

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
    iget-object v2, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/bytedance/mtesttools/b/j;->q(Lcom/bytedance/mtesttools/b/j;)Landroid/os/Bundle;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

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

.method public onVideoError()V
    .locals 5

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string/jumbo v2, "video play error"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "onVideoError"

    .line 11
    .line 12
    invoke-static {v3, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$b;->a:Lcom/bytedance/mtesttools/b/j;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v4, Lcom/bytedance/mtesttools/b/a;

    .line 31
    .line 32
    invoke-direct {v4, v1, v2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3, v4}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
