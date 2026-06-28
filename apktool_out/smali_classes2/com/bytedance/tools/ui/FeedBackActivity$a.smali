.class Lcom/bytedance/tools/ui/FeedBackActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/FeedBackActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/FeedBackActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/FeedBackActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$a;->a:Lcom/bytedance/tools/ui/FeedBackActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$a;->a:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/tools/ui/FeedBackActivity;->F(Lcom/bytedance/tools/ui/FeedBackActivity;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$a;->a:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p1, v0}, Lcom/bytedance/tools/ui/FeedBackActivity;->G(Lcom/bytedance/tools/ui/FeedBackActivity;Z)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$a;->a:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/bytedance/tools/ui/FeedBackActivity;->C()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$a;->a:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 22
    .line 23
    const-string/jumbo v0, "\u95ee\u9898\u53cd\u9988\u4e2d\uff0c\u8bf7\u7a0d\u7b49\uff0c\u9700\u8981\u4e0a\u4f20\u7a7f\u5c71\u7532\u65e5\u5fd7\u4fe1\u606f..."

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ljava/lang/Thread;

    .line 35
    .line 36
    new-instance v0, Lcom/bytedance/tools/ui/FeedBackActivity$a$a;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/bytedance/tools/ui/FeedBackActivity$a$a;-><init>(Lcom/bytedance/tools/ui/FeedBackActivity$a;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 45
    .line 46
    .line 47
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
