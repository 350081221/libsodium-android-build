.class Lcom/bytedance/tools/ui/view/d$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/d$b;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/a/b;

.field final synthetic b:Lcom/bytedance/tools/ui/view/d$b;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/d$b;Lcom/bytedance/tools/ui/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/d$b$b;->b:Lcom/bytedance/tools/ui/view/d$b;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/d$b$b;->a:Lcom/bytedance/tools/ui/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$b$b;->a:Lcom/bytedance/tools/ui/a/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bytedance/tools/ui/a/b;->a()Lcom/bytedance/tools/c/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$b$b;->b:Lcom/bytedance/tools/ui/view/d$b;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/bytedance/tools/ui/view/d$b;->b:Lcom/bytedance/tools/ui/view/d;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/d$b$b;->a:Lcom/bytedance/tools/ui/a/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/a/b;->a()Lcom/bytedance/tools/c/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Lcom/bytedance/tools/ui/view/d;->g(Lcom/bytedance/tools/ui/view/d;Lcom/bytedance/tools/c/c;)Lcom/bytedance/tools/c/c;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/bytedance/tools/ui/view/d$b$b;->b:Lcom/bytedance/tools/ui/view/d$b;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/bytedance/tools/ui/view/d$b;->b:Lcom/bytedance/tools/ui/view/d;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/bytedance/tools/ui/view/d;->k(Lcom/bytedance/tools/ui/view/d;)Landroid/widget/TextView;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/d$b$b;->b:Lcom/bytedance/tools/ui/view/d$b;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/d$b;->b:Lcom/bytedance/tools/ui/view/d;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/tools/ui/view/d;->n(Lcom/bytedance/tools/ui/view/d;)Lcom/bytedance/tools/c/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/bytedance/tools/c/c;->d()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
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
