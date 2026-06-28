.class public Lcom/yuanqi/group/home/models/h;
.super Lcom/yuanqi/group/home/models/b;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public appInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

.field public icon:Landroid/graphics/drawable/Drawable;

.field public name:Ljava/lang/String;

.field public packageName:Ljava/lang/String;

.field public userId:I


# direct methods
.method public constructor <init>(Lcom/yuanqi/group/home/models/i;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/home/models/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/yuanqi/group/home/models/h;->userId:I

    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p1, Lcom/yuanqi/group/home/models/i;->a:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/core/VirtualCore;->getInstalledAppInfo(Ljava/lang/String;I)Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/yuanqi/group/home/models/h;->appInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lcom/lody/virtual/remote/InstalledAppInfo;->isLaunched(I)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    xor-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    iput-boolean p2, p0, Lcom/yuanqi/group/home/models/b;->isFirstOpen:Z

    .line 26
    .line 27
    iget-object p2, p1, Lcom/yuanqi/group/home/models/i;->c:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lcom/yuanqi/group/home/models/h;->icon:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    :cond_0
    iget-object p2, p1, Lcom/yuanqi/group/home/models/i;->b:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p2, p0, Lcom/yuanqi/group/home/models/h;->name:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/yuanqi/group/home/models/i;->a:Ljava/lang/String;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/yuanqi/group/home/models/h;->packageName:Ljava/lang/String;

    .line 50
    .line 51
    return-void
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
    .line 91
    .line 92
    .line 93
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


# virtual methods
.method public canCreateShortcut()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canDelete()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canLaunch()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canReorder()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/models/h;->icon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/models/h;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/models/h;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/home/models/h;->userId:I

    return v0
.end method

.method public is64bit()Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/models/h;->appInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

    iget-boolean v0, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->is64bit:Z

    return v0
.end method

.method public isFirstOpen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/home/models/b;->isFirstOpen:Z

    return v0
.end method

.method public isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/home/models/b;->isLoading:Z

    return v0
.end method
