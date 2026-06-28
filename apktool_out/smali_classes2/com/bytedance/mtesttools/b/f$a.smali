.class Lcom/bytedance/mtesttools/b/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/f;->c(Landroid/app/Activity;Lj1/f;IILcom/bytedance/mtesttools/b/b;)V
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

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/b/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "onAdLoadedFail"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/mtesttools/b/c;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lcom/bytedance/mtesttools/b/a;

    .line 27
    .line 28
    invoke-direct {v1, p1, p2}, Lcom/bytedance/mtesttools/b/a;-><init>(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "onAdLoadedFial"

    .line 32
    .line 33
    invoke-interface {v0, p1, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public onFeedAdLoad(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTFeedAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/b/f;->m(Lcom/bytedance/mtesttools/b/f;Lcom/bytedance/sdk/openadsdk/TTFeedAd;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$a;->a:Lcom/bytedance/mtesttools/b/f;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/bytedance/mtesttools/b/f;->l(Lcom/bytedance/mtesttools/b/f;)Lcom/bytedance/mtesttools/b/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "onAdLoaded"

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-interface {p1, v0, v1}, Lcom/bytedance/mtesttools/b/b;->a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V

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
