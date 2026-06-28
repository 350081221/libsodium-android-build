.class public Lcom/yuanqi/group/home/adapters/a;
.super Lcom/yuanqi/group/abs/ui/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/home/adapters/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yuanqi/group/abs/ui/a<",
        "Lcom/yuanqi/group/home/models/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/abs/ui/a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic d(Landroid/view/View;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/yuanqi/group/home/models/e;

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/group/home/adapters/a;->q(Landroid/view/View;Lcom/yuanqi/group/home/models/e;I)V

    return-void
.end method

.method protected f(ILandroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    const p1, 0x7f0c0066

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lcom/yuanqi/group/abs/ui/a;->n(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p2, Lcom/yuanqi/group/home/adapters/a$a;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Lcom/yuanqi/group/home/adapters/a$a;-><init>(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method protected q(Landroid/view/View;Lcom/yuanqi/group/home/models/e;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/yuanqi/group/home/adapters/a$a;

    .line 6
    .line 7
    iget-object p3, p2, Lcom/yuanqi/group/home/models/j;->d:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iget-object p3, p1, Lcom/yuanqi/group/home/adapters/a$a;->c:Landroid/widget/ImageView;

    .line 12
    .line 13
    const v0, 0x7f0f001e

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p3, p1, Lcom/yuanqi/group/home/adapters/a$a;->c:Landroid/widget/ImageView;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object p3, p1, Lcom/yuanqi/group/home/adapters/a$a;->c:Landroid/widget/ImageView;

    .line 27
    .line 28
    iget-object v0, p2, Lcom/yuanqi/group/home/models/j;->d:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object p3, p1, Lcom/yuanqi/group/home/adapters/a$a;->d:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v0, p2, Lcom/yuanqi/group/home/models/j;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/yuanqi/group/home/models/e;->b()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, Lcom/yuanqi/group/home/adapters/a$a;->e:Landroid/widget/TextView;

    .line 47
    .line 48
    const p2, 0x7f1201b5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object p1, p1, Lcom/yuanqi/group/home/adapters/a$a;->e:Landroid/widget/TextView;

    .line 56
    .line 57
    const p2, 0x7f1201b7

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 61
    .line 62
    .line 63
    :goto_1
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
