.class Lcom/bytedance/tools/ui/FeedBackActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/FeedBackActivity;->E(Ljava/lang/String;ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/bytedance/tools/ui/FeedBackActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->d:Lcom/bytedance/tools/ui/FeedBackActivity;

    iput-object p2, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->b:Z

    iput-object p4, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->d:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->d:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/FeedBackActivity;->H()V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->b:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->d:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/bytedance/tools/ui/FeedBackActivity;->J(Lcom/bytedance/tools/ui/FeedBackActivity;)Landroid/widget/EditText;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->d:Lcom/bytedance/tools/ui/FeedBackActivity;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/bytedance/tools/ui/FeedBackActivity;->J(Lcom/bytedance/tools/ui/FeedBackActivity;)Landroid/widget/EditText;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/bytedance/tools/ui/FeedBackActivity$c;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
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
