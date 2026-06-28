.class public Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    .locals 7
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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;

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
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onClickRetry()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_1
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoAdComplete()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_2
    invoke-interface {p2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->longValue(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-interface {p2, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->longValue(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;

    .line 30
    .line 31
    invoke-interface {v0, v3, v4, v5, v6}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onProgressUpdate(JJ)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoAdContinuePlay()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_4
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoAdPaused()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoAdStartPlay()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_6
    invoke-interface {p2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-interface {p2, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;

    .line 56
    .line 57
    invoke-interface {v3, v0, v2}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoError(II)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_7
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;->onVideoLoad()V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x25225
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/l/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
