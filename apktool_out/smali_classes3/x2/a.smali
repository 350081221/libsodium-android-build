.class public Lx2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "NewbieGuide"

.field public static final b:I = 0x1

.field public static final c:I = -0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "NewbieGuide"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public static b(Landroid/app/Activity;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 1

    new-instance v0, Lcom/yuanqi/master/tools/guide/core/a;

    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/a;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static c(Landroidx/fragment/app/Fragment;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 1

    new-instance v0, Lcom/yuanqi/master/tools/guide/core/a;

    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/a;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method
