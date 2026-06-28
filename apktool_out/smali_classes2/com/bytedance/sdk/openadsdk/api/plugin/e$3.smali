.class Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/pangle/ZeusPluginInstallListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPluginInstall(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    const/4 p3, 0x7

    .line 2
    if-ne p2, p3, :cond_0

    .line 3
    .line 4
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 5
    .line 6
    invoke-static {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p3, 0x6

    .line 11
    if-ne p2, p3, :cond_2

    .line 12
    .line 13
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 14
    .line 15
    invoke-static {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 19
    .line 20
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const-string p2, "com.byted.pangle"

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const/4 p3, 0x1

    .line 45
    invoke-virtual {p2, p3}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/4 p3, 0x0

    .line 54
    invoke-interface {p1, p3, p2}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string p1, "TTPluginManager"

    .line 59
    .line 60
    const-string p2, "no main pl"

    .line 61
    .line 62
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
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
