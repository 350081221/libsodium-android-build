.class Lcom/bytedance/mtesttools/b/e$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/b/e$f;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/b/e$f;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/b/e$f;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/b/e$f$a;->a:Lcom/bytedance/mtesttools/b/e$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    return-void
.end method

.method public onSelected(ILjava/lang/String;Z)V
    .locals 0

    iget-object p1, p0, Lcom/bytedance/mtesttools/b/e$f$a;->a:Lcom/bytedance/mtesttools/b/e$f;

    iget-object p1, p1, Lcom/bytedance/mtesttools/b/e$f;->b:Lcom/bytedance/mtesttools/b/e;

    invoke-static {p1}, Lcom/bytedance/mtesttools/b/e;->p(Lcom/bytedance/mtesttools/b/e;)V

    return-void
.end method

.method public onShow()V
    .locals 0

    return-void
.end method
