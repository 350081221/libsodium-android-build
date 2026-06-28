.class Lcom/bytedance/mtesttools/b/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/f;->u(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/TTFeedAd;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/bytedance/mtesttools/b/f;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/f;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/f$f;->b:Lcom/bytedance/mtesttools/b/f;

    iput-object p2, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadActive(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onDownloadFailed(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    const-string/jumbo p2, "\u4e0b\u8f7d\u5931\u8d25\u56de\u8c03"

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public onDownloadFinished(JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    const-string/jumbo p2, "\u5b89\u88c5\u5b8c\u6210\u56de\u8c03"

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public onDownloadPaused(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    const-string/jumbo p2, "\u4e0b\u8f7d\u6682\u505c\u56de\u8c03"

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public onIdle()V
    .locals 3

    iget-object v0, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    const-string/jumbo v1, "\u672a\u5f00\u59cb\u4e0b\u8f7d"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public onInstalled(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/f$f;->a:Landroid/content/Context;

    const-string/jumbo p2, "\u4e0b\u8f7d\u5b8c\u6210\u56de\u8c03"

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
