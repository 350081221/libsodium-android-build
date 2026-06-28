.class Lcom/bytedance/mtesttools/b/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashCardListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/b/k;
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

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/k$c;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashCardClick()V
    .locals 0

    return-void
.end method

.method public onSplashCardClose()V
    .locals 0

    return-void
.end method

.method public onSplashCardReadyToShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/k$c;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-static {p1}, Lcom/bytedance/mtesttools/b/k;->p(Lcom/bytedance/mtesttools/b/k;)Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/k$c;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-static {v0}, Lcom/bytedance/mtesttools/b/k;->q(Lcom/bytedance/mtesttools/b/k;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/mtesttools/b/k$c;->a:Lcom/bytedance/mtesttools/b/k;

    invoke-static {v1}, Lcom/bytedance/mtesttools/b/k;->r(Lcom/bytedance/mtesttools/b/k;)Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->showSplashCardView(Landroid/view/ViewGroup;Landroid/app/Activity;)V

    return-void
.end method
