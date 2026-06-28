.class public Lf0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "OpenIdHelper"

.field public static b:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lf0/e;->b()Lf0/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iget-object v1, v0, Lf0/e;->c:Lf0/a;

    invoke-virtual {v0, p0, v1}, Lf0/e;->c(Landroid/content/Context;Lf0/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Z)V
    .locals 0

    invoke-static {}, Lf0/e;->b()Lf0/e;

    invoke-static {p0}, Lf0/e;->f(Z)V

    return-void
.end method

.method public static final c()Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lf0/b;->b:Ljava/lang/reflect/Method;

    if-nez v2, :cond_0

    const-string v2, "android.app.ActivityThread"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "currentApplication"

    :try_start_1
    new-array v4, v0, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lf0/b;->b:Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_0
    sget-object v2, Lf0/b;->b:Ljava/lang/reflect/Method;

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ActivityThread:currentApplication --> "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "OpenIdHelper"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-static {}, Lf0/e;->b()Lf0/e;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lf0/e;->h(Landroid/content/Context;Z)Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lf0/e;->b()Lf0/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iget-object v1, v0, Lf0/e;->b:Lf0/a;

    invoke-virtual {v0, p0, v1}, Lf0/e;->c(Landroid/content/Context;Lf0/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lf0/e;->b()Lf0/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iget-object v1, v0, Lf0/e;->a:Lf0/a;

    invoke-virtual {v0, p0, v1}, Lf0/e;->c(Landroid/content/Context;Lf0/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lf0/e;->b()Lf0/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iget-object v1, v0, Lf0/e;->d:Lf0/a;

    invoke-virtual {v0, p0, v1}, Lf0/e;->c(Landroid/content/Context;Lf0/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
