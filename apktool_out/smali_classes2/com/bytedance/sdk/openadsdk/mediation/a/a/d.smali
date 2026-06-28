.class public Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;
.super Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;
.source "SourceFile"


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

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
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const v0, 0x20406

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;

    .line 15
    .line 16
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 26
    .line 27
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    const v0, 0x20407

    .line 32
    .line 33
    .line 34
    if-ne p1, v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;

    .line 41
    .line 42
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 47
    .line 48
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/d;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 52
    .line 53
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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
