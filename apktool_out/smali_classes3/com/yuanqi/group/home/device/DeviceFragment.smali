.class public Lcom/yuanqi/group/home/device/DeviceFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lcom/yuanqi/group/home/adapters/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/yuanqi/group/home/device/DeviceFragment;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/yuanqi/group/home/device/DeviceFragment;->c(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method private synthetic c(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    invoke-virtual {p1, p3}, Lcom/yuanqi/group/abs/ui/a;->j(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/home/models/e;

    invoke-static {p0, p1, p3}, Lcom/yuanqi/group/home/device/DeviceDetailActiivty;->P(Landroidx/fragment/app/Fragment;Lcom/yuanqi/group/home/models/e;I)V

    return-void
.end method

.method public static d()Lcom/yuanqi/group/home/device/DeviceFragment;
    .locals 1

    new-instance v0, Lcom/yuanqi/group/home/device/DeviceFragment;

    invoke-direct {v0}, Lcom/yuanqi/group/home/device/DeviceFragment;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    const-string p2, "pos"

    .line 10
    .line 11
    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const p2, 0x7f0c005c

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDetach()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const p2, 0x7f0901e0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/widget/ListView;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->a:Landroid/widget/ListView;

    .line 11
    .line 12
    new-instance p1, Lcom/yuanqi/group/home/adapters/a;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p1, p2}, Lcom/yuanqi/group/home/adapters/a;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    .line 22
    .line 23
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/lody/virtual/os/VUserManager;->getUserCount()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :goto_0
    if-ge v0, p1, :cond_1

    .line 38
    .line 39
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Lcom/lody/virtual/os/VUserManager;->getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    new-instance v2, Lcom/yuanqi/group/home/models/e;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v4, 0x0

    .line 56
    iget v5, v1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 57
    .line 58
    invoke-direct {v2, v3, v4, v5}, Lcom/yuanqi/group/home/models/e;-><init>(Landroid/content/Context;Lcom/lody/virtual/remote/InstalledAppInfo;I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v1, v2, Lcom/yuanqi/group/home/models/j;->c:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lcom/yuanqi/group/abs/ui/a;->p(Ljava/util/Collection;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->a:Landroid/widget/ListView;

    .line 77
    .line 78
    iget-object p2, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->b:Lcom/yuanqi/group/home/adapters/a;

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/yuanqi/group/home/device/DeviceFragment;->a:Landroid/widget/ListView;

    .line 84
    .line 85
    new-instance p2, Lcom/yuanqi/group/home/device/c;

    .line 86
    .line 87
    invoke-direct {p2, p0}, Lcom/yuanqi/group/home/device/c;-><init>(Lcom/yuanqi/group/home/device/DeviceFragment;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
