.class public abstract Lcom/bytedance/sdk/openadsdk/TTWidgetManager;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/view/View;)Lcom/bytedance/sdk/openadsdk/TTWidgetManager;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v1, v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object p0, v0

    .line 21
    :goto_0
    if-nez p0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/q;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/c/a/a/q;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 27
    .line 28
    .line 29
    return-object v0
    .line 30
    .line 31
    .line 32
    .line 33
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
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
.end method


# virtual methods
.method public abstract updateWidgetWithType(ILorg/json/JSONObject;)Z
.end method
