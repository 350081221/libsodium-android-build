.class public Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    .locals 5
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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;

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
    const/4 v0, 0x1

    .line 8
    const-class v2, Landroid/view/View;

    .line 9
    .line 10
    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/n;

    .line 18
    .line 19
    invoke-interface {p2, v4, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 24
    .line 25
    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/c/a/a/n;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;

    .line 29
    .line 30
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;->onAdShow(Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    invoke-interface {p2, v4, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroid/view/View;

    .line 39
    .line 40
    new-instance v4, Lcom/bytedance/sdk/openadsdk/c/a/a/n;

    .line 41
    .line 42
    invoke-interface {p2, v0, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 47
    .line 48
    invoke-direct {v4, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/n;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;

    .line 52
    .line 53
    invoke-interface {v0, v2, v4}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;->onAdCreativeClick(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_2
    invoke-interface {p2, v4, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Landroid/view/View;

    .line 62
    .line 63
    new-instance v4, Lcom/bytedance/sdk/openadsdk/c/a/a/n;

    .line 64
    .line 65
    invoke-interface {p2, v0, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 70
    .line 71
    invoke-direct {v4, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/n;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;

    .line 75
    .line 76
    invoke-interface {v0, v2, v4}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;->onAdClicked(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_data_0
    .packed-switch 0x2272d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
