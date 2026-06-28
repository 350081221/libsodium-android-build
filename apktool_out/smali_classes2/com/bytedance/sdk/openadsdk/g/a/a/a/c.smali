.class public Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private final b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 5
    .line 6
    sget-object p1, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

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
    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

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
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoCached()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/l;

    .line 19
    .line 20
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 25
    .line 26
    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/c/a/a/l;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 30
    .line 31
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/l;

    .line 36
    .line 37
    invoke-interface {p2, v3, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/c/a/a/l;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 47
    .line 48
    invoke-interface {v2, v0}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_3
    invoke-interface {p2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v2, 0x1

    .line 57
    const-class v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p2, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->b:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    .line 66
    .line 67
    invoke-interface {v3, v0, v2}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onError(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->a(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x20405
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/g/a/a/a/c;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
