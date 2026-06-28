.class public Lcom/bytedance/sdk/openadsdk/api/a/f;
.super Lcom/bytedance/sdk/openadsdk/api/b;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/config/IDownloadButtonClickListener;


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
.method public handleComplianceDialog(Z)V
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
    const v2, 0x3677d

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    const v0, 0x3677c

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/b;->a(ILcom/bykv/vk/openvk/api/proto/Result;)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public handleMarketFailedComplianceDialog()V
    .locals 1

    const v0, 0x36786

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/b;->a(I)V

    return-void
.end method
