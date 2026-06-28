.class Lcom/bytedance/tools/ui/a/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/a/e;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/c/d;

.field final synthetic b:Lcom/bytedance/tools/ui/a/e;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/a/e;Lcom/bytedance/tools/c/d;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/a/e$a;->b:Lcom/bytedance/tools/ui/a/e;

    iput-object p2, p0, Lcom/bytedance/tools/ui/a/e$a;->a:Lcom/bytedance/tools/c/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bytedance/tools/ui/a/e$a;->b:Lcom/bytedance/tools/ui/a/e;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/bytedance/tools/ui/a/e;->a(Lcom/bytedance/tools/ui/a/e;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;

    .line 10
    .line 11
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/tools/ui/a/e$a;->a:Lcom/bytedance/tools/c/d;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/tools/c/d;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "rit_info"

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bytedance/tools/ui/a/e$a;->b:Lcom/bytedance/tools/ui/a/e;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/tools/ui/a/e;->a(Lcom/bytedance/tools/ui/a/e;)Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    return-void
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
