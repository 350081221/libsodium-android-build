.class public Lcom/bytedance/mtesttools/c/a;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/mtesttools/c/a$d;
    }
.end annotation


# instance fields
.field a:Landroid/widget/RadioGroup;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:I

.field e:Lcom/bytedance/mtesttools/c/a$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/mtesttools/c/a$d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/bytedance/mtesttools/c/a;->d:I

    .line 6
    .line 7
    sget p1, Lcom/bytedance/tools/R$layout;->I0:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lcom/bytedance/mtesttools/c/a;->e:Lcom/bytedance/mtesttools/c/a$d;

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
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/a;->a:Landroid/widget/RadioGroup;

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
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/a;->b:Landroid/widget/TextView;

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
    iput-object p1, p0, Lcom/bytedance/mtesttools/c/a;->c:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/bytedance/mtesttools/c/a;->a()V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
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
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/a;->a:Landroid/widget/RadioGroup;

    .line 18
    .line 19
    new-instance v1, Lcom/bytedance/mtesttools/c/a$a;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/a$a;-><init>(Lcom/bytedance/mtesttools/c/a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/a;->b:Landroid/widget/TextView;

    .line 28
    .line 29
    new-instance v1, Lcom/bytedance/mtesttools/c/a$b;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/a$b;-><init>(Lcom/bytedance/mtesttools/c/a;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/mtesttools/c/a;->c:Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance v1, Lcom/bytedance/mtesttools/c/a$c;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/c/a$c;-><init>(Lcom/bytedance/mtesttools/c/a;)V

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
