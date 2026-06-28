.class public Lio/busniess/va/App;
.super Landroid/app/Application;
.source "SourceFile"


# static fields
.field private static gApp:Lio/busniess/va/App;


# instance fields
.field commonApp:Lio/busniess/va/common/CommonApp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/busniess/va/common/CommonApp;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/busniess/va/common/CommonApp;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/busniess/va/App;->commonApp:Lio/busniess/va/common/CommonApp;

    .line 10
    .line 11
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

.method public static getApp()Lio/busniess/va/App;
    .locals 1

    sget-object v0, Lio/busniess/va/App;->gApp:Lio/busniess/va/App;

    return-object v0
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sput-object p0, Lio/busniess/va/App;->gApp:Lio/busniess/va/App;

    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {}, Lcom/a/a/a/g;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/yuanqi/group/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :cond_0
    iget-object v0, p0, Lio/busniess/va/App;->commonApp:Lio/busniess/va/common/CommonApp;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lio/busniess/va/common/CommonApp;->attachBaseContext(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/busniess/va/App;->commonApp:Lio/busniess/va/common/CommonApp;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lio/busniess/va/common/CommonApp;->onCreate(Landroid/app/Application;)V

    .line 7
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
.end method
