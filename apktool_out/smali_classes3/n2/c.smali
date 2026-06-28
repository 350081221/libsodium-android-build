.class public final Ln2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Ln2/c;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "a",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/lzf/easyfloat/interfaces/g;",
        "onPermissionResult",
        "Lkotlin/r2;",
        "j",
        "e",
        "g",
        "f",
        "i",
        "h",
        "d",
        "Landroid/app/Fragment;",
        "fragment",
        "b",
        "c",
        "k",
        "(Landroid/app/Fragment;)V",
        "",
        "I",
        "requestCode",
        "",
        "Ljava/lang/String;",
        "TAG",
        "<init>",
        "()V",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:Ln2/c;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final b:I = 0xc7

.field private static final c:Ljava/lang/String; = "PermissionUtils--->"
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln2/c;

    invoke-direct {v0}, Ln2/c;-><init>()V

    sput-object v0, Ln2/c;->a:Ln2/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ln2/c;->a:Ln2/c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ln2/c;->d(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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
.end method

.method private final b(Landroid/app/Fragment;)V
    .locals 2

    .line 1
    sget-object v0, Lo2/f;->a:Lo2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lo2/b;->a(Landroid/app/Fragment;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-static {p1}, Ln2/c;->c(Landroid/app/Fragment;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    sget-object v0, Lcom/lzf/easyfloat/utils/h;->a:Lcom/lzf/easyfloat/utils/h;

    .line 19
    .line 20
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "getStackTraceString(e)"

    .line 25
    .line 26
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "PermissionUtils--->"

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, Lcom/lzf/easyfloat/utils/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
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
.end method

.method public static final c(Landroid/app/Fragment;)V
    .locals 3
    .param p0    # Landroid/app/Fragment;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-class v0, Landroid/provider/Settings;

    .line 7
    .line 8
    const-string v1, "ACTION_MANAGE_OVERLAY_PERMISSION"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "clazz.getDeclaredField(\"\u2026NAGE_OVERLAY_PERMISSION\")"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/content/Intent;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "package:"

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    const/16 v0, 0xc7

    .line 55
    .line 56
    invoke-virtual {p0, v1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception p0

    .line 61
    sget-object v0, Lcom/lzf/easyfloat/utils/h;->a:Lcom/lzf/easyfloat/utils/h;

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v1, "PermissionUtils--->"

    .line 68
    .line 69
    invoke-virtual {v0, v1, p0}, Lcom/lzf/easyfloat/utils/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void
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

.method private final d(Landroid/content/Context;)Z
    .locals 6

    .line 1
    sget-object v0, Lo2/f;->a:Lo2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Ln2/c;->f(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    :try_start_0
    const-class v1, Landroid/provider/Settings;

    .line 16
    .line 17
    const-string v2, "canDrawOverlays"

    .line 18
    .line 19
    new-array v3, v0, [Ljava/lang/Class;

    .line 20
    .line 21
    const-class v4, Landroid/content/Context;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    aput-object v4, v3, v5

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "clazz.getDeclaredMethod(\u2026ys\", Context::class.java)"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-array v2, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    aput-object p1, v2, v5

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 54
    .line 55
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 56
    .line 57
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    const-string v1, "PermissionUtils--->"

    .line 63
    .line 64
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move p1, v0

    .line 72
    :goto_0
    return p1
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

.method private final e(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lo2/a;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method private final f(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lo2/b;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method private final g(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lo2/c;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method private final h(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lo2/d;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method private final i(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lo2/e;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public static final j(Landroid/app/Activity;Lcom/lzf/easyfloat/interfaces/g;)V
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lcom/lzf/easyfloat/interfaces/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onPermissionResult"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ln2/b;->a:Ln2/b$a;

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1}, Ln2/b$a;->a(Landroid/app/Activity;Lcom/lzf/easyfloat/interfaces/g;)V

    .line 14
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
.end method


# virtual methods
.method public final k(Landroid/app/Fragment;)V
    .locals 1
    .param p1    # Landroid/app/Fragment;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ln2/c;->b(Landroid/app/Fragment;)V

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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
