.class public Lcom/bytedance/sdk/openadsdk/c/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/bytedance/sdk/openadsdk/c/a/a;


# direct methods
.method protected constructor <init>(Lcom/bytedance/sdk/openadsdk/c/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

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

.method private a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/c/a/c/b;->b(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->j(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x206e

    .line 10
    .line 11
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdClassLoader;->getInstance()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/e;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/e;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;)V

    .line 31
    .line 32
    .line 33
    const v2, 0x7e09bc

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 37
    .line 38
    .line 39
    const v1, 0x3f7bb

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
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


# virtual methods
.method public loadBannerExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->i(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadDrawFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadExpressDrawFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->h(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/c;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/c;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadFullScreenVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->f(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadInteractionExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 0

    return-void
.end method

.method public loadNativeAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/d;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/d;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->d(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadNativeExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/e;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->g(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadRewardVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/f;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/f;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->e(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method

.method public loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;I)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/c/a/b;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/c/a/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1, p3}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {p3, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p3, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;

    .line 26
    .line 27
    invoke-direct {p3, p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;-><init>(Lcom/bytedance/sdk/openadsdk/c/a/a$a;Landroid/util/Pair;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, p3}, Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;->onSplashLoadFail(Lcom/bytedance/sdk/openadsdk/CSJAdError;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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

.method public loadStream(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/c;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/c;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->b(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a;->a:Lcom/bytedance/sdk/openadsdk/c/a/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a(Ljava/lang/Exception;)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;->onError(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    return-void
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
.end method
