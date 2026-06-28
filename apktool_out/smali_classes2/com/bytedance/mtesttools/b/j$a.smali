.class Lcom/bytedance/mtesttools/b/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/j;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/j;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/j;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "onRewardVideoLoadFail"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v2}, Lcom/bytedance/mtesttools/b/j;->n(Lcom/bytedance/mtesttools/b/j;Z)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v2, Lcom/bytedance/mtesttools/b/a;

    .line 33
    .line 34
    invoke-direct {v2, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 38
    .line 39
    .line 40
    return-void
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
.end method

.method public onRewardVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/j;->m(Lcom/bytedance/mtesttools/b/j;Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, v0}, Lcom/bytedance/mtesttools/b/j;->n(Lcom/bytedance/mtesttools/b/j;Z)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "onRewardVideoAdLoad"

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public onRewardVideoCached()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/bytedance/mtesttools/b/j;->n(Lcom/bytedance/mtesttools/b/j;Z)Z

    .line 2
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-static {v0}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    move-result-object v0

    const-string v1, "onRewardVideoCached"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    return-void
.end method

.method public onRewardVideoCached(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 2

    .line 4
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/bytedance/mtesttools/b/j;->n(Lcom/bytedance/mtesttools/b/j;Z)Z

    .line 5
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/j$a;->a:Lcom/bytedance/mtesttools/b/j;

    invoke-static {p1}, Lcom/bytedance/mtesttools/b/j;->l(Lcom/bytedance/mtesttools/b/j;)Lcom/bytedance/mtesttools/b/b;

    move-result-object p1

    const-string v0, "onRewardVideoCached"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    return-void
.end method
