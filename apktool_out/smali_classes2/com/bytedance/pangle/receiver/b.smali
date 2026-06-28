.class public final Lcom/bytedance/pangle/receiver/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/receiver/b$c;,
        Lcom/bytedance/pangle/receiver/b$a;,
        Lcom/bytedance/pangle/receiver/b$d;,
        Lcom/bytedance/pangle/receiver/b$e;,
        Lcom/bytedance/pangle/receiver/b$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/bytedance/pangle/receiver/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/pangle/receiver/b$d;

    .line 9
    .line 10
    invoke-direct {v0, v2}, Lcom/bytedance/pangle/receiver/b$d;-><init>(B)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/bytedance/pangle/receiver/b;->a:Lcom/bytedance/pangle/receiver/b$c;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/16 v1, 0x1c

    .line 17
    .line 18
    if-ge v0, v1, :cond_1

    .line 19
    .line 20
    new-instance v0, Lcom/bytedance/pangle/receiver/b$e;

    .line 21
    .line 22
    invoke-direct {v0, v2}, Lcom/bytedance/pangle/receiver/b$e;-><init>(B)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/bytedance/pangle/receiver/b;->a:Lcom/bytedance/pangle/receiver/b$c;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    new-instance v0, Lcom/bytedance/pangle/receiver/b$b;

    .line 29
    .line 30
    invoke-direct {v0, v2}, Lcom/bytedance/pangle/receiver/b$b;-><init>(B)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/bytedance/pangle/receiver/b;->a:Lcom/bytedance/pangle/receiver/b$c;

    .line 34
    .line 35
    return-void
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
.end method

.method public static a(Landroid/app/Application;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "huawei"

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/bytedance/pangle/receiver/b;->a:Lcom/bytedance/pangle/receiver/b$c;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {v0, p0}, Lcom/bytedance/pangle/receiver/b$c;->a(Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    nop

    .line 27
    :catchall_0
    :cond_0
    return-void
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
.end method
