.class public Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;

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
    const-class v2, Lorg/json/JSONObject;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;->onClose()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lorg/json/JSONObject;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;

    .line 25
    .line 26
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;->onCanRenderFail(Lorg/json/JSONObject;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_2
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lorg/json/JSONObject;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;

    .line 37
    .line 38
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;->onCanRenderSuccess(Lorg/json/JSONObject;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;->getEstimatedInteractionArea()Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_4
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lorg/json/JSONObject;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->b:Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;

    .line 54
    .line 55
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;->onInfo(Lorg/json/JSONObject;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x232e5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
