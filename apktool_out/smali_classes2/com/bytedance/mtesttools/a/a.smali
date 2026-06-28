.class public Lcom/bytedance/mtesttools/a/a;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()I
    .locals 1

    sget v0, Lcom/bytedance/tools/R$layout;->A0:I

    return v0
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/bytedance/mtesttools/a/a;->a:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/bytedance/mtesttools/a/a;->a:Landroid/widget/ImageView;

    .line 10
    .line 11
    new-instance v0, Lcom/bytedance/mtesttools/a/a$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/a/a$a;-><init>(Lcom/bytedance/mtesttools/a/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p2, p0, Lcom/bytedance/mtesttools/a/a;->a:Landroid/widget/ImageView;

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, p0, Lcom/bytedance/mtesttools/a/a;->b:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
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
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/bytedance/mtesttools/a/a;->c()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/tools/R$id;->X:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/widget/ImageView;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/bytedance/mtesttools/a/a;->a:Landroid/widget/ImageView;

    .line 24
    .line 25
    sget p1, Lcom/bytedance/tools/R$id;->Z3:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/widget/TextView;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/bytedance/mtesttools/a/a;->b:Landroid/widget/TextView;

    .line 34
    .line 35
    return-void
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
