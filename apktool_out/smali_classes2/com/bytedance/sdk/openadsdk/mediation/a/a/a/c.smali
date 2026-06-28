.class public Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/IMediationNativeTokenInfo;


# instance fields
.field private final a:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lcom/bykv/a/a/a/a/b;->d:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 10
    .line 11
    return-void
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
.method public loadNativeAdByAdm(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/bytedance/sdk/openadsdk/g/a/a/a/b;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-class v0, Ljava/lang/Void;

    .line 26
    .line 27
    const v1, 0x41ecc

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
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
.end method
