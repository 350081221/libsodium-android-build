.class Lcom/bytedance/mtesttools/b/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/k;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/k;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashLoadFail(Lcom/bytedance/sdk/openadsdk/CSJAdError;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    const-string p1, ""

    .line 14
    .line 15
    :goto_0
    new-instance v1, Lcom/bytedance/mtesttools/b/a;

    .line 16
    .line 17
    invoke-direct {v1, v0, p1}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "onSplashAdLoadFail"

    .line 21
    .line 22
    invoke-static {v2, v1}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v3, Lcom/bytedance/mtesttools/b/a;

    .line 40
    .line 41
    invoke-direct {v3, v0, p1}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2, v3}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
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

.method public onSplashLoadSuccess(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 0

    return-void
.end method

.method public onSplashRenderFail(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;Lcom/bytedance/sdk/openadsdk/CSJAdError;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, -0x1

    .line 13
    const-string p2, ""

    .line 14
    .line 15
    :goto_0
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "onSplashAdLoadFail"

    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Lcom/bytedance/mtesttools/b/a;

    .line 40
    .line 41
    invoke-direct {v2, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
    .line 48
    .line 49
    .line 50
.end method

.method public onSplashRenderSuccess(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/k;->m(Lcom/bytedance/mtesttools/b/k;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$a;->a:Lcom/bytedance/mtesttools/b/k;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->l(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/mtesttools/b/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "onSplashAdLoadSuccess"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
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
