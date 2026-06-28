.class public Lcom/lody/virtual/client/stub/ResolverActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/stub/ResolverActivity$LoadIconTask;,
        Lcom/lody/virtual/client/stub/ResolverActivity$ItemLongClickListener;,
        Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;,
        Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;,
        Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "ResolverActivity"


# instance fields
.field private dialog:Landroid/app/AlertDialog;

.field private mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

.field private mAlwaysButton:Landroid/widget/Button;

.field private mAlwaysUseOption:Z

.field private mIconDpi:I

.field private mIconSize:I

.field private mLastSelected:I

.field private mLaunchedFromUid:I

.field private mListView:Landroid/widget/ListView;

.field private mMaxColumns:I

.field private mOnceButton:Landroid/widget/Button;

.field protected mOptions:Landroid/os/Bundle;

.field private mPm:Landroid/content/pm/PackageManager;

.field private mRegistered:Z

.field protected mRequestCode:I

.field protected mResultTo:Landroid/os/IBinder;

.field protected mResultWho:Ljava/lang/String;

.field private mShowExtended:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLastSelected:I

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
.end method

.method static synthetic access$000(Lcom/lody/virtual/client/stub/ResolverActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysUseOption:Z

    return p0
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mPm:Landroid/content/pm/PackageManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/lody/virtual/client/stub/ResolverActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mShowExtended:Z

    return p0
.end method

.method static synthetic access$202(Lcom/lody/virtual/client/stub/ResolverActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mShowExtended:Z

    return p1
.end method

.method static synthetic access$300(Lcom/lody/virtual/client/stub/ResolverActivity;)I
    .locals 0

    iget p0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mIconSize:I

    return p0
.end method

.method static synthetic access$400(Lcom/lody/virtual/client/stub/ResolverActivity;)Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    return-object p0
.end method

.method private makeMyIntent()Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const v2, -0x800001

    .line 19
    .line 20
    .line 21
    and-int/2addr v1, v2

    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    return-object v0
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
.end method


# virtual methods
.method getIcon(Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xf
    .end annotation

    :try_start_0
    iget v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mIconDpi:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/Resources;->getDrawableForDensity(II)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method loadIconForResolveInfo(Landroid/content/pm/ResolveInfo;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p1, Landroid/content/pm/ResolveInfo;->resolvePackageName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p1, Landroid/content/pm/ResolveInfo;->icon:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mPm:Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p1, Landroid/content/pm/ResolveInfo;->icon:I

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/client/stub/ResolverActivity;->getIcon(Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/content/pm/ResolveInfo;->getIconResource()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mPm:Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    iget-object v2, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 33
    .line 34
    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0, v1, v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->getIcon(Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return-object v0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "Couldn\'t find resources for package\n"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/VLog;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "ResolverActivity"

    .line 70
    .line 71
    invoke-static {v1, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mPm:Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/stub/ResolverActivity;->makeMyIntent()Landroid/content/Intent;

    move-result-object v3

    .line 2
    invoke-virtual {v3}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v0

    const-string v1, "android.intent.action.MAIN"

    .line 3
    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "android.intent.category.HOME"

    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget v0, Lcom/lody/virtual/R$string;->choose:I

    goto :goto_0

    .line 7
    :cond_0
    sget v0, Lcom/lody/virtual/R$string;->choose:I

    :goto_0
    const-string v1, "android.intent.extra.user_handle"

    .line 8
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    move-result v2

    invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lcom/lody/virtual/client/stub/ResolverActivity;->onCreate(Landroid/os/Bundle;Landroid/content/Intent;Ljava/lang/CharSequence;[Landroid/content/Intent;Ljava/util/List;ZI)V

    .line 10
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;Landroid/content/Intent;Ljava/lang/CharSequence;[Landroid/content/Intent;Ljava/util/List;ZI)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Landroid/content/Intent;",
            "Ljava/lang/CharSequence;",
            "[",
            "Landroid/content/Intent;",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;ZI)V"
        }
    .end annotation

    .line 11
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    iput p7, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mPm:Landroid/content/pm/PackageManager;

    .line 14
    iput-boolean p6, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysUseOption:Z

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p7, Lcom/lody/virtual/R$integer;->config_maxResolverActivityColumns:I

    invoke-virtual {p1, p7}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mMaxColumns:I

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    const-string p7, "activity"

    .line 17
    invoke-virtual {p0, p7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Landroid/app/ActivityManager;

    .line 18
    invoke-virtual {p7}, Landroid/app/ActivityManager;->getLauncherLargeIconDensity()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mIconDpi:I

    .line 19
    invoke-virtual {p7}, Landroid/app/ActivityManager;->getLauncherLargeIconSize()I

    move-result p7

    iput p7, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mIconSize:I

    .line 20
    new-instance p7, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    iget v6, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    move-object v0, p7

    move-object v1, p0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/Context;Landroid/content/Intent;[Landroid/content/Intent;Ljava/util/List;I)V

    iput-object p7, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 21
    invoke-virtual {p7}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->getCount()I

    move-result p2

    .line 22
    iget p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    if-gez p4, :cond_0

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1, p1}, Lcom/lody/virtual/client/stub/ResolverActivity;->startSelected(IZ)V

    .line 25
    iput-boolean p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 27
    :cond_1
    new-instance p4, Landroid/app/AlertDialog$Builder;

    invoke-direct {p4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    if-le p2, p1, :cond_2

    .line 29
    new-instance p2, Landroid/widget/ListView;

    invoke-direct {p2, p0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    .line 30
    iget-object p3, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 31
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    invoke-virtual {p2, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 32
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    new-instance p3, Lcom/lody/virtual/client/stub/ResolverActivity$ItemLongClickListener;

    invoke-direct {p3, p0}, Lcom/lody/virtual/client/stub/ResolverActivity$ItemLongClickListener;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;)V

    invoke-virtual {p2, p3}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 33
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    invoke-virtual {p4, p2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    if-eqz p6, :cond_3

    .line 34
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    invoke-virtual {p2, p1}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    goto :goto_0

    .line 35
    :cond_2
    sget p1, Lcom/lody/virtual/R$string;->noApplications:I

    invoke-virtual {p4, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 36
    :cond_3
    :goto_0
    new-instance p1, Lcom/lody/virtual/client/stub/ResolverActivity$1;

    invoke-direct {p1, p0}, Lcom/lody/virtual/client/stub/ResolverActivity$1;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;)V

    invoke-virtual {p4, p1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 37
    invoke-virtual {p4}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->dialog:Landroid/app/AlertDialog;

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->dialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->dialog:Landroid/app/AlertDialog;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method protected onIntentSelected(Landroid/content/pm/ResolveInfo;Landroid/content/Intent;Z)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysUseOption:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    new-instance v0, Landroid/content/IntentFilter;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string v1, "android.intent.category.DEFAULT"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget v1, p1, Landroid/content/pm/ResolveInfo;->match:I

    .line 61
    .line 62
    const/high16 v2, 0xfff0000

    .line 63
    .line 64
    and-int/2addr v1, v2

    .line 65
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/4 v3, 0x0

    .line 70
    const-string v4, "ResolverActivity"

    .line 71
    .line 72
    const/high16 v5, 0x600000

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    if-ne v1, v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {p2, p0}, Landroid/content/Intent;->resolveType(Landroid/content/Context;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-eqz v7, :cond_2

    .line 82
    .line 83
    :try_start_0
    invoke-virtual {v0, v7}, Landroid/content/IntentFilter;->addDataType(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentFilter$MalformedMimeTypeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception v0

    .line 88
    new-instance v7, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v8, "mimeType\n"

    .line 94
    .line 95
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/VLog;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-array v7, v6, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {v4, v0, v7}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v3

    .line 115
    :cond_2
    :goto_1
    if-eqz v2, :cond_a

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    if-eqz v7, :cond_a

    .line 122
    .line 123
    if-ne v1, v5, :cond_3

    .line 124
    .line 125
    const-string v1, "file"

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_a

    .line 136
    .line 137
    const-string v1, "content"

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    :cond_3
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, p1, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/content/IntentFilter;->schemeSpecificPartsIterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    invoke-virtual {v2}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :cond_4
    if-eqz v5, :cond_5

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_5

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, Landroid/os/PatternMatcher;

    .line 181
    .line 182
    invoke-virtual {v7, v5}, Landroid/os/PatternMatcher;->match(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-eqz v8, :cond_4

    .line 187
    .line 188
    invoke-virtual {v7}, Landroid/os/PatternMatcher;->getPath()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v7}, Landroid/os/PatternMatcher;->getType()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    invoke-virtual {v0, v1, v5}, Landroid/content/IntentFilter;->addDataSchemeSpecificPart(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    :cond_5
    iget-object v1, p1, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 200
    .line 201
    invoke-virtual {v1}, Landroid/content/IntentFilter;->authoritiesIterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-eqz v1, :cond_8

    .line 206
    .line 207
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, Landroid/content/IntentFilter$AuthorityEntry;

    .line 218
    .line 219
    invoke-virtual {v5, v2}, Landroid/content/IntentFilter$AuthorityEntry;->match(Landroid/net/Uri;)I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-ltz v7, :cond_6

    .line 224
    .line 225
    invoke-virtual {v5}, Landroid/content/IntentFilter$AuthorityEntry;->getPort()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {v5}, Landroid/content/IntentFilter$AuthorityEntry;->getHost()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    if-ltz v1, :cond_7

    .line 234
    .line 235
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    :cond_7
    invoke-virtual {v0, v5, v3}, Landroid/content/IntentFilter;->addDataAuthority(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroid/content/IntentFilter;->pathsIterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-eqz p1, :cond_a

    .line 249
    .line 250
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :cond_9
    if-eqz v1, :cond_a

    .line 255
    .line 256
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_a

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Landroid/os/PatternMatcher;

    .line 267
    .line 268
    invoke-virtual {v2, v1}, Landroid/os/PatternMatcher;->match(Ljava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_9

    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/os/PatternMatcher;->getPath()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {v2}, Landroid/os/PatternMatcher;->getType()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    invoke-virtual {v0, p1, v1}, Landroid/content/IntentFilter;->addDataPath(Ljava/lang/String;I)V

    .line 283
    .line 284
    .line 285
    :cond_a
    if-eqz v0, :cond_e

    .line 286
    .line 287
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 288
    .line 289
    iget-object p1, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 290
    .line 291
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    new-array v1, p1, [Landroid/content/ComponentName;

    .line 296
    .line 297
    move v2, v6

    .line 298
    move v3, v2

    .line 299
    :goto_2
    if-ge v2, p1, :cond_c

    .line 300
    .line 301
    iget-object v5, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 302
    .line 303
    iget-object v5, v5, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 304
    .line 305
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 310
    .line 311
    new-instance v7, Landroid/content/ComponentName;

    .line 312
    .line 313
    iget-object v8, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 314
    .line 315
    iget-object v9, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 318
    .line 319
    invoke-direct {v7, v9, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    aput-object v7, v1, v2

    .line 323
    .line 324
    iget v5, v5, Landroid/content/pm/ResolveInfo;->match:I

    .line 325
    .line 326
    if-le v5, v3, :cond_b

    .line 327
    .line 328
    move v3, v5

    .line 329
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_c
    if-eqz p3, :cond_d

    .line 333
    .line 334
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 339
    .line 340
    .line 341
    move-result-object p3

    .line 342
    invoke-virtual {p1, v0, v3, v1, p3}, Landroid/content/pm/PackageManager;->addPreferredActivity(Landroid/content/IntentFilter;I[Landroid/content/ComponentName;Landroid/content/ComponentName;)V

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_d
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {p1}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    const-string p3, "setLastChosenActivity"

    .line 363
    .line 364
    const/4 v1, 0x6

    .line 365
    new-array v1, v1, [Ljava/lang/Object;

    .line 366
    .line 367
    aput-object p2, v1, v6

    .line 368
    .line 369
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {p2, v2}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/4 v5, 0x1

    .line 378
    aput-object v2, v1, v5

    .line 379
    .line 380
    const/high16 v2, 0x10000

    .line 381
    .line 382
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    const/4 v5, 0x2

    .line 387
    aput-object v2, v1, v5

    .line 388
    .line 389
    const/4 v2, 0x3

    .line 390
    aput-object v0, v1, v2

    .line 391
    .line 392
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const/4 v2, 0x4

    .line 397
    aput-object v0, v1, v2

    .line 398
    .line 399
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const/4 v2, 0x5

    .line 404
    aput-object v0, v1, v2

    .line 405
    .line 406
    invoke-virtual {p1, p3, v1}, Lcom/lody/virtual/helper/utils/Reflect;->call(Ljava/lang/String;[Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 407
    .line 408
    .line 409
    goto :goto_3

    .line 410
    :catch_1
    move-exception p1

    .line 411
    new-instance p3, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const-string v0, "Error calling setLastChosenActivity\n"

    .line 417
    .line 418
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/VLog;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    new-array p3, v6, [Ljava/lang/Object;

    .line 433
    .line 434
    invoke-static {v4, p1, p3}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_e
    :goto_3
    if-eqz p2, :cond_10

    .line 438
    .line 439
    iget p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    .line 440
    .line 441
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 442
    .line 443
    .line 444
    move-result-object p3

    .line 445
    invoke-virtual {p3}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 446
    .line 447
    .line 448
    move-result p3

    .line 449
    new-instance v0, Landroid/content/Intent;

    .line 450
    .line 451
    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 452
    .line 453
    .line 454
    invoke-static {p1, p3, v0}, Lcom/lody/virtual/helper/utils/ComponentUtils;->processOutsideIntent(IZLandroid/content/Intent;)Landroid/content/Intent;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    iget p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    .line 463
    .line 464
    invoke-virtual {p1, v2, p2}, Lcom/lody/virtual/client/core/VirtualCore;->resolveActivityInfo(Landroid/content/Intent;I)Landroid/content/pm/ActivityInfo;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-nez v3, :cond_f

    .line 469
    .line 470
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 471
    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_f
    const/high16 p1, 0x2000000

    .line 475
    .line 476
    invoke-virtual {v2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    iget-object v4, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mResultTo:Landroid/os/IBinder;

    .line 484
    .line 485
    iget-object v5, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mOptions:Landroid/os/Bundle;

    .line 486
    .line 487
    iget-object v6, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mResultWho:Ljava/lang/String;

    .line 488
    .line 489
    iget v7, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRequestCode:I

    .line 490
    .line 491
    const/4 v8, 0x0

    .line 492
    iget v9, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLaunchedFromUid:I

    .line 493
    .line 494
    invoke-virtual/range {v1 .. v9}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivity(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;ILjava/lang/String;I)I

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    if-eqz p1, :cond_10

    .line 499
    .line 500
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mResultTo:Landroid/os/IBinder;

    .line 501
    .line 502
    if-eqz p1, :cond_10

    .line 503
    .line 504
    iget p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRequestCode:I

    .line 505
    .line 506
    if-lez p1, :cond_10

    .line 507
    .line 508
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mResultTo:Landroid/os/IBinder;

    .line 513
    .line 514
    iget-object p3, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mResultWho:Ljava/lang/String;

    .line 515
    .line 516
    iget v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRequestCode:I

    .line 517
    .line 518
    invoke-virtual {p1, p2, p3, v0}, Lcom/lody/virtual/client/ipc/VActivityManager;->sendCancelActivityResult(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 519
    .line 520
    .line 521
    :cond_10
    :goto_4
    return-void
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, -0x1

    .line 8
    const/4 p4, 0x0

    .line 9
    if-eq p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p2, p4

    .line 14
    :goto_0
    iget-boolean p5, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysUseOption:Z

    .line 15
    .line 16
    if-eqz p5, :cond_3

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget p5, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLastSelected:I

    .line 21
    .line 22
    if-eq p5, p1, :cond_3

    .line 23
    .line 24
    :cond_1
    iget-object p3, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysButton:Landroid/widget/Button;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mOnceButton:Landroid/widget/Button;

    .line 30
    .line 31
    invoke-virtual {p3, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLastSelected:I

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-virtual {p0, p3, p4}, Lcom/lody/virtual/client/stub/ResolverActivity;->startSelected(IZ)V

    .line 45
    .line 46
    .line 47
    :goto_1
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method protected onRestart()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->handlePackagesChanged()V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysUseOption:Z

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, -0x1

    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mLastSelected:I

    .line 21
    .line 22
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAlwaysButton:Landroid/widget/Button;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mOnceButton:Landroid/widget/Button;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mListView:Landroid/widget/ListView;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
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
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mRegistered:Z

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/high16 v1, 0x10000000

    .line 20
    .line 21
    and-int/2addr v0, v1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
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
.end method

.method showAppDetails(Landroid/content/pm/ResolveInfo;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 13
    .line 14
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, "package"

    .line 18
    .line 19
    invoke-static {v2, p1, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/high16 v0, 0x80000

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    return-void
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
.end method

.method startSelected(IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->resolveInfoForPosition(I)Landroid/content/pm/ResolveInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity;->mAdapter:Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->intentForPosition(I)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, v0, p1, p2}, Lcom/lody/virtual/client/stub/ResolverActivity;->onIntentSelected(Landroid/content/pm/ResolveInfo;Landroid/content/Intent;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 24
    .line 25
    .line 26
    return-void
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
