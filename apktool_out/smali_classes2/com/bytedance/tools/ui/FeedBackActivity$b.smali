.class Lcom/bytedance/tools/ui/FeedBackActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/FeedBackActivity;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/bytedance/tools/ui/FeedBackActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->b:Lcom/bytedance/tools/ui/FeedBackActivity;

    iput-object p2, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->b:Lcom/bytedance/tools/ui/FeedBackActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "\u95ee\u9898\u53cd\u9988\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, p2}, Lcom/bytedance/tools/ui/FeedBackActivity;->D(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;ZLjava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->b:Lcom/bytedance/tools/ui/FeedBackActivity;

    invoke-static {p1, v1}, Lcom/bytedance/tools/ui/FeedBackActivity;->G(Lcom/bytedance/tools/ui/FeedBackActivity;Z)Z

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->b:Lcom/bytedance/tools/ui/FeedBackActivity;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "\u95ee\u9898\u53cd\u9988\u6210\u529f\uff01id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lcom/bytedance/tools/ui/FeedBackActivity;->D(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;ZLjava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$b;->b:Lcom/bytedance/tools/ui/FeedBackActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/bytedance/tools/ui/FeedBackActivity;->G(Lcom/bytedance/tools/ui/FeedBackActivity;Z)Z

    return-void
.end method
