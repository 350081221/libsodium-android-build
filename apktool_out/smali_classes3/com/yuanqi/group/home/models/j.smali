.class public Lcom/yuanqi/group/home/models/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/lody/virtual/remote/InstalledAppInfo;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p2, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/yuanqi/group/home/models/j;->a:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/yuanqi/group/home/models/j;->b:I

    if-eqz p2, :cond_1

    .line 5
    invoke-virtual {p2}, Lcom/lody/virtual/remote/InstalledAppInfo;->getInstalledUsers()[I

    move-result-object p3

    const/4 v0, 0x0

    aget p3, p3, v0

    invoke-virtual {p2, p3}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApplicationInfo(I)Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/home/models/j;->a(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)V

    :cond_1
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :try_start_0
    invoke-virtual {p2, p1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/yuanqi/group/home/models/j;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/yuanqi/group/home/models/j;->d:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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
