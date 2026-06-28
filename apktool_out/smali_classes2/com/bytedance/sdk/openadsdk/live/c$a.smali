.class final Lcom/bytedance/sdk/openadsdk/live/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/live/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

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
    .locals 3
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
    const/4 p3, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eq p1, v1, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

    .line 19
    .line 20
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const-class v1, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-interface {p2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-interface {p1, p3, p2}, Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;->onEventV3(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

    .line 37
    .line 38
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    const-class v1, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-interface {p2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-interface {p1, p3, p2}, Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;->invoke(ILandroid/os/Bundle;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

    .line 56
    .line 57
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->booleanValue(I)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-interface {p1, p3, p2}, Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;->convertToEnterMethod(IZ)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

    .line 71
    .line 72
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;->convertToEnterFromMerge(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$a;->a:Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;

    .line 82
    .line 83
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;->openLR(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
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
    .locals 3

    .line 1
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x2710

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
