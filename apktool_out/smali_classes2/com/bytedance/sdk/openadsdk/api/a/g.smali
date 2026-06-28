.class public Lcom/bytedance/sdk/openadsdk/api/a/g;
.super Lcom/bytedance/sdk/openadsdk/api/b;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/config/OnItemClickListener;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/b;->a:Lcom/bykv/vk/openvk/api/proto/EventListener;

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
.method public onItemClick(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/a/c;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/api/a/c;-><init>(Lcom/ss/android/download/api/download/DownloadModel;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x367e1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1, v2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/a/b;

    .line 30
    .line 31
    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/api/a/b;-><init>(Lcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 32
    .line 33
    .line 34
    const p2, 0x367e2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance p2, Lcom/bytedance/sdk/openadsdk/api/a/a;

    .line 42
    .line 43
    invoke-direct {p2, p3}, Lcom/bytedance/sdk/openadsdk/api/a/a;-><init>(Lcom/ss/android/download/api/download/DownloadController;)V

    .line 44
    .line 45
    .line 46
    const p3, 0x367e3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p3, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    const p2, 0x367e0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 69
    .line 70
    .line 71
    return-void
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
