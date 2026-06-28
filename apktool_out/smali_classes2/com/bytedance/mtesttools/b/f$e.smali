.class Lcom/bytedance/mtesttools/b/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTFeedAd$VideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/f;->u(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/TTFeedAd;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/f;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/f;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressUpdate(JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "onProgressUpdate"

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    invoke-interface {p1, p2, p3}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method

.method public onVideoAdComplete(Lcom/bytedance/sdk/openadsdk/TTFeedAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onVideoCompleted"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onVideoAdContinuePlay(Lcom/bytedance/sdk/openadsdk/TTFeedAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onVideoResume"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onVideoAdPaused(Lcom/bytedance/sdk/openadsdk/TTFeedAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onVideoPause"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onVideoAdStartPlay(Lcom/bytedance/sdk/openadsdk/TTFeedAd;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "onVideoStart"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onVideoError(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$e;->a:Lcom/bytedance/mtesttools/b/f;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/bytedance/mtesttools/b/a;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, ""

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {v1, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string p1, "onVideoError"

    .line 39
    .line 40
    invoke-interface {v0, p1, v1}, Lcom/bytedance/mtesttools/b/b;->b(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onVideoLoad(Lcom/bytedance/sdk/openadsdk/TTFeedAd;)V
    .locals 0

    return-void
.end method
