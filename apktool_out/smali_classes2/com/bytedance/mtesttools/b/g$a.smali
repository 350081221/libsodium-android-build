.class Lcom/bytedance/mtesttools/b/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/g;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/g;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

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
    const-string v1, "onFullVideoLoadFail"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v2}, Lcom/bytedance/mtesttools/b/g;->m(Lcom/bytedance/mtesttools/b/g;Z)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

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

.method public onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/bytedance/mtesttools/b/g;->m(Lcom/bytedance/mtesttools/b/g;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/g;->l(Lcom/bytedance/mtesttools/b/g;Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

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
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "onFullVideoAdLoad"

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

.method public onFullScreenVideoCached()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/bytedance/mtesttools/b/g;->m(Lcom/bytedance/mtesttools/b/g;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/g$a;->a:Lcom/bytedance/mtesttools/b/g;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/g;->k(Lcom/bytedance/mtesttools/b/g;)Lcom/bytedance/mtesttools/b/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "onFullVideoCached"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {v0, v1, v2}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 26
    .line 27
    .line 28
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 0

    return-void
.end method
