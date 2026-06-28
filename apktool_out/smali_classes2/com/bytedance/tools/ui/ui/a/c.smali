.class public Lcom/bytedance/tools/ui/ui/a/c;
.super Lcom/bytedance/tools/ui/ui/a/a;
.source "SourceFile"


# instance fields
.field private l:Landroid/widget/RadioGroup;

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget v0, Lcom/bytedance/tools/R$layout;->H:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/bytedance/tools/ui/ui/a/a;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/tools/ui/ui/a/c;->m:Z

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private e()V
    .locals 1

    sget v0, Lcom/bytedance/tools/R$id;->x2:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/c;->l:Landroid/widget/RadioGroup;

    return-void
.end method


# virtual methods
.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/tools/ui/ui/a/c;->m:Z

    return-void
.end method

.method public h()Z
    .locals 3

    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/c;->l:Landroid/widget/RadioGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    sget v2, Lcom/bytedance/tools/R$id;->Y1:I

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/bytedance/tools/ui/ui/a/a;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/a/c;->e()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public show()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/bytedance/tools/ui/ui/a/a;->show()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/c;->l:Landroid/widget/RadioGroup;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/bytedance/tools/ui/ui/a/c;->m:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget v1, Lcom/bytedance/tools/R$id;->Y1:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget v1, Lcom/bytedance/tools/R$id;->v0:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
