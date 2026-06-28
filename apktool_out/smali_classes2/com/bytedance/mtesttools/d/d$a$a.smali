.class Lcom/bytedance/mtesttools/d/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/mtesttools/d/d$a;->b(ILj1/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj1/b;

.field final synthetic b:Lcom/bytedance/mtesttools/d/d$a;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/d$a;Lj1/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    iput-object p2, p0, Lcom/bytedance/mtesttools/d/d$a$a;->a:Lj1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/bytedance/mtesttools/d/d$a;->c:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/bytedance/mtesttools/d/d$a;->c:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    .line 25
    .line 26
    iget-object v0, p1, Lcom/bytedance/mtesttools/d/d$a;->d:Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/bytedance/mtesttools/d/d$a;->c:Landroid/widget/ImageView;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 p1, 0x8

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    .line 44
    .line 45
    iget-object p1, p1, Lcom/bytedance/mtesttools/d/d$a;->a:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/d$a$a;->b:Lcom/bytedance/mtesttools/d/d$a;

    .line 54
    .line 55
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/d$a$a;->a:Lj1/b;

    .line 56
    .line 57
    invoke-static {p1, v0}, Lcom/bytedance/mtesttools/d/d$a;->c(Lcom/bytedance/mtesttools/d/d$a;Lj1/b;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
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
