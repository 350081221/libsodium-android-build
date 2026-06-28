.class public Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 9
    .line 10
    return-void
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
.method protected a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V
    .locals 0

    return-void
.end method

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    const-class v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_0
    new-instance v3, Lcom/bytedance/sdk/openadsdk/c/a/a/b;

    .line 15
    .line 16
    invoke-interface {p2, v2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/b;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;

    .line 31
    .line 32
    invoke-interface {v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;->onSplashAdClose(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    new-instance v3, Lcom/bytedance/sdk/openadsdk/c/a/a/b;

    .line 37
    .line 38
    invoke-interface {p2, v2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 43
    .line 44
    invoke-direct {v3, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/b;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;

    .line 48
    .line 49
    invoke-interface {v0, v3}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;->onSplashAdClick(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    new-instance v3, Lcom/bytedance/sdk/openadsdk/c/a/a/b;

    .line 54
    .line 55
    invoke-interface {p2, v2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 60
    .line 61
    invoke-direct {v3, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/b;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;

    .line 65
    .line 66
    invoke-interface {v0, v3}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;->onSplashAdShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x1b1fd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/b/a/a/a/a;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
