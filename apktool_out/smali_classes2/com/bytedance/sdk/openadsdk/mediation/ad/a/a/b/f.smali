.class public Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->b:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    .locals 6
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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->b:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

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
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const-class v4, Landroid/view/View;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;->onAdShow()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;->onAdClick()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_2
    invoke-interface {p2, v5, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    const-class v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p2, v3, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p2, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->b:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

    .line 43
    .line 44
    invoke-interface {v4, v0, v3, v2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;->onRenderFail(Landroid/view/View;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_3
    invoke-interface {p2, v5, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/view/View;

    .line 53
    .line 54
    invoke-interface {p2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->floatValue(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-interface {p2, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->floatValue(I)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v4, 0x3

    .line 63
    invoke-interface {p2, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->booleanValue(I)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->b:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

    .line 68
    .line 69
    invoke-interface {v5, v0, v3, v2, v4}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;->onRenderSuccess(Landroid/view/View;FFZ)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x22b15
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/f;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
