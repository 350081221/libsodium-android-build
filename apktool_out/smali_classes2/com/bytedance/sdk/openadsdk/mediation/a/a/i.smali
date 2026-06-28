.class public Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;
.super Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/d;
.source "SourceFile"


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/d;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

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
    const-string v0, ""

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/d;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAppkey()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 23
    .line 24
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAppkey()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAppId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 45
    .line 46
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAppId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_3
    :goto_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAdnSlotId()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 67
    .line 68
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAdnSlotId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_5
    :goto_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :pswitch_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 78
    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAdnName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/a/a/i;->a:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 89
    .line 90
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;->getAdnName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_7
    :goto_3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x412f9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
