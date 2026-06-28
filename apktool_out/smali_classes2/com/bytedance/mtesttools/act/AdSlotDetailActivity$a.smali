.class Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/mtesttools/c/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->f(Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;I)I

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->e(Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x1

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->v:Lj1/f;

    .line 18
    .line 19
    invoke-virtual {p1}, Lj1/f;->k()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x7

    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->j:Landroid/widget/TextView;

    .line 29
    .line 30
    const-string/jumbo v0, "\u6a21\u7248\uff08\u6a21\u72482.0\uff09"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->j:Landroid/widget/TextView;

    .line 40
    .line 41
    const-string/jumbo v0, "\u6a21\u677f\uff08\u542b\u5e7f\u70b9\u901a1.0\uff09"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->e(Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v0, 0x2

    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->j:Landroid/widget/TextView;

    .line 60
    .line 61
    const-string/jumbo v0, "\u81ea\u6e32\u67d3"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object p1, p0, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity$a;->a:Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/bytedance/mtesttools/act/AdSlotDetailActivity;->j:Landroid/widget/TextView;

    .line 71
    .line 72
    const-string/jumbo v0, "\u6a21\u677f\uff08\u542b\u5e7f\u70b9\u901a2.0\uff09"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-void
.end method
