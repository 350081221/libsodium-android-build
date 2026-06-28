.class public Lcom/bytedance/tools/d/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/appcompat/app/AppCompatActivity;Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 3
    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget v1, Lcom/bytedance/tools/R$layout;->E:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    invoke-direct {v1, v2, v2}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x11

    .line 28
    .line 29
    iput v2, v1, Landroidx/appcompat/app/ActionBar$LayoutParams;->gravity:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 38
    .line 39
    .line 40
    sget p1, Lcom/bytedance/tools/R$id;->R1:I

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    sget p1, Lcom/bytedance/tools/R$id;->Q1:I

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Lcom/bytedance/tools/d/i$a;

    .line 58
    .line 59
    invoke-direct {p2, p0}, Lcom/bytedance/tools/d/i$a;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    instance-of p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;

    .line 66
    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    sget p1, Lcom/bytedance/tools/R$id;->V0:I

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p2, Lcom/bytedance/tools/d/i$b;

    .line 76
    .line 77
    invoke-direct {p2, p0}, Lcom/bytedance/tools/d/i$b;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget p0, Lcom/bytedance/tools/R$id;->V0:I

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const/16 p1, 0x8

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
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
