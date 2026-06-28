.class public Lcom/yuanqi/master/tools/dialog/b;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/tools/dialog/b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yuanqi/master/tools/dialog/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/yuanqi/master/tools/dialog/a;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-direct {p1, p0, p2}, Lcom/yuanqi/master/tools/dialog/a;-><init>(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/Window;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/yuanqi/master/tools/dialog/b;->a:Lcom/yuanqi/master/tools/dialog/a;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
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

.method static synthetic a(Lcom/yuanqi/master/tools/dialog/b;)Lcom/yuanqi/master/tools/dialog/a;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/tools/dialog/b;->a:Lcom/yuanqi/master/tools/dialog/a;

    return-object p0
.end method


# virtual methods
.method public b(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b;->a:Lcom/yuanqi/master/tools/dialog/a;

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/tools/dialog/a;->b(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public c(ILandroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b;->a:Lcom/yuanqi/master/tools/dialog/a;

    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/tools/dialog/a;->f(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public d(ILjava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b;->a:Lcom/yuanqi/master/tools/dialog/a;

    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/tools/dialog/a;->g(ILjava/lang/CharSequence;)V

    return-void
.end method
