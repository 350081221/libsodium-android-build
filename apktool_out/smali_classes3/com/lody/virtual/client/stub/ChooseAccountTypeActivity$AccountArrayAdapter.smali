.class Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AccountArrayAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private mInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mLayoutInflater:Landroid/view/LayoutInflater;


# direct methods
.method constructor <init>(Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;->mInfos:Ljava/util/ArrayList;

    .line 5
    .line 6
    const-string p2, "layout_inflater"

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/view/LayoutInflater;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 15
    .line 16
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 4
    .line 5
    sget p3, Lcom/lody/virtual/R$layout;->choose_account_row:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;

    .line 13
    .line 14
    invoke-direct {p3, v0}, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;-><init>(Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$1;)V

    .line 15
    .line 16
    .line 17
    sget v0, Lcom/lody/virtual/R$id;->account_row_text:I

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v0, p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;->text:Landroid/widget/TextView;

    .line 26
    .line 27
    sget v0, Lcom/lody/virtual/R$id;->account_row_icon:I

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/ImageView;

    .line 34
    .line 35
    iput-object v0, p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;->icon:Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    check-cast p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;

    .line 46
    .line 47
    :goto_0
    iget-object v0, p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;->text:Landroid/widget/TextView;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;->mInfos:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;

    .line 56
    .line 57
    iget-object v1, v1, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;->name:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object p3, p3, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$ViewHolder;->icon:Landroid/widget/ImageView;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AccountArrayAdapter;->mInfos:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/lody/virtual/client/stub/ChooseAccountTypeActivity$AuthInfo;->drawable:Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    return-object p2
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
