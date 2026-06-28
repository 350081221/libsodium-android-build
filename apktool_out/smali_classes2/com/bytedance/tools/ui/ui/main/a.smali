.class public Lcom/bytedance/tools/ui/ui/main/a;
.super Landroidx/fragment/app/FragmentPagerAdapter;
.source "SourceFile"


# static fields
.field private static final b:[I
    .annotation build Landroidx/annotation/StringRes;
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget v2, Lcom/bytedance/tools/R$string;->G:I

    .line 6
    .line 7
    aput v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sget v2, Lcom/bytedance/tools/R$string;->H:I

    .line 11
    .line 12
    aput v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    sget v2, Lcom/bytedance/tools/R$string;->I:I

    .line 16
    .line 17
    aput v2, v0, v1

    .line 18
    .line 19
    sput-object v0, Lcom/bytedance/tools/ui/ui/main/a;->b:[I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/main/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
    .line 7
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


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getItem(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    new-instance p1, Lcom/bytedance/tools/ui/ui/c;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/bytedance/tools/ui/ui/c;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    new-instance p1, Lcom/bytedance/tools/ui/ui/b;

    .line 18
    .line 19
    invoke-direct {p1}, Lcom/bytedance/tools/ui/ui/b;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_2
    new-instance p1, Lcom/bytedance/tools/ui/ui/a;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/bytedance/tools/ui/ui/a;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p1
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
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/main/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lcom/bytedance/tools/ui/ui/main/a;->b:[I

    aget p1, v1, p1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
