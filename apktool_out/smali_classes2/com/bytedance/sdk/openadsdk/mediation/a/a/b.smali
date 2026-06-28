.class public Lcom/bytedance/sdk/openadsdk/mediation/a/a/b;
.super Lcom/bytedance/sdk/openadsdk/g/a/a/a/a;
.source "SourceFile"


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;

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
    .locals 1
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
    const v0, 0x2a046

    .line 2
    .line 3
    .line 4
    if-ne p1, v0, :cond_3

    .line 5
    .line 6
    const-class p1, Ljava/util/List;

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-interface {p2, p3, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    check-cast p3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 42
    .line 43
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/k;

    .line 44
    .line 45
    invoke-direct {v0, p3}, Lcom/bytedance/sdk/openadsdk/mediation/a/a/k;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/b;->a:Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;->onDrawFeedAdLoad(Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    return-object p1

    .line 61
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/g/a/a/a/a;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
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
