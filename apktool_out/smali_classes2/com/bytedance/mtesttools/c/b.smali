.class public Lcom/bytedance/mtesttools/c/b;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/mtesttools/c/b$d;
    }
.end annotation


# instance fields
.field a:Landroid/widget/RadioGroup;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/RadioButton;

.field e:Landroid/widget/RadioButton;

.field f:I

.field g:Lcom/bytedance/mtesttools/c/b$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/bytedance/mtesttools/c/b$d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    iput p1, p0, Lcom/bytedance/mtesttools/c/b;->f:I

    .line 6
    .line 7
    sget p1, Lcom/bytedance/tools/R$layout;->J0:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    iput-object p3, p0, Lcom/bytedance/mtesttools/c/b;->g:Lcom/bytedance/mtesttools/c/b$d;

    .line 13
    .line 14
    sget p1, Lcom/bytedance/tools/R$id;->x2:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/widget/RadioGroup;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b;->a:Landroid/widget/RadioGroup;

    .line 23
    .line 24
    sget p1, Lcom/bytedance/tools/R$id;->r0:I

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/widget/TextView;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b;->b:Landroid/widget/TextView;

    .line 33
    .line 34
    sget p1, Lcom/bytedance/tools/R$id;->y0:I

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/widget/TextView;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b;->c:Landroid/widget/TextView;

    .line 43
    .line 44
    sget p1, Lcom/bytedance/tools/R$id;->v2:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/widget/RadioButton;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b;->d:Landroid/widget/RadioButton;

    .line 53
    .line 54
    sget p1, Lcom/bytedance/tools/R$id;->w2:I

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Landroid/widget/RadioButton;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/b;->e:Landroid/widget/RadioButton;

    .line 63
    .line 64
    const/4 p1, 0x7

    .line 65
    if-ne p2, p1, :cond_0

    .line 66
    .line 67
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b;->d:Landroid/widget/RadioButton;

    .line 68
    .line 69
    const-string/jumbo p2, "\u6a21\u7248\uff08\u6a21\u72482.0\uff09"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b;->e:Landroid/widget/RadioButton;

    .line 76
    .line 77
    const/16 p2, 0x8

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b;->d:Landroid/widget/RadioButton;

    .line 84
    .line 85
    const-string/jumbo p2, "\u6a21\u677f\uff08\u542b\u5e7f\u70b9\u901a1.0\uff09"

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lcom/bytedance/mtesttools/c/b;->e:Landroid/widget/RadioButton;

    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-direct {p0}, Lcom/bytedance/mtesttools/c/b;->a()V

    .line 98
    .line 99
    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const v1, 0x106000d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/b;->a:Landroid/widget/RadioGroup;

    .line 18
    .line 19
    new-instance v1, Lcom/bytedance/mtesttools/c/b$a;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/b$a;-><init>(Lcom/bytedance/mtesttools/c/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/b;->b:Landroid/widget/TextView;

    .line 28
    .line 29
    new-instance v1, Lcom/bytedance/mtesttools/c/b$b;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/b$b;-><init>(Lcom/bytedance/mtesttools/c/b;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/b;->c:Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance v1, Lcom/bytedance/mtesttools/c/b$c;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/b$c;-><init>(Lcom/bytedance/mtesttools/c/b;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
