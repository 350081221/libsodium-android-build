.class public Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;
.super Lcom/bytedance/sdk/openadsdk/c/a/a/l;
.source "SourceFile"


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a/l;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public setFullScreenVideoAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v2, p1, Lcom/bytedance/sdk/openadsdk/mediation/IMediationInterstitialFullAdListener;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b/b;

    .line 12
    .line 13
    check-cast p1, Lcom/bytedance/sdk/openadsdk/mediation/IMediationInterstitialFullAdListener;

    .line 14
    .line 15
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b/b;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/IMediationInterstitialFullAdListener;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v0}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v2, Lcom/bytedance/sdk/openadsdk/j/a/a/a/a;

    .line 26
    .line 27
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/j/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v3}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-class v1, Ljava/lang/Void;

    .line 45
    .line 46
    const v2, 0x1fc35

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
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
