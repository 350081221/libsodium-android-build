.class public abstract Lorg/greenrobot/greendao/test/f;
.super Landroid/test/AndroidTestCase;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String; = "greendao-unittest-db.temp"


# instance fields
.field protected final a:Ljava/util/Random;

.field protected final b:Z

.field protected c:Lorg/greenrobot/greendao/database/a;

.field private d:Landroid/app/Application;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lorg/greenrobot/greendao/test/f;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/test/AndroidTestCase;-><init>()V

    .line 3
    iput-boolean p1, p0, Lorg/greenrobot/greendao/test/f;->b:Z

    .line 4
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lorg/greenrobot/greendao/test/f;->a:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroid/app/Application;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/app/Application;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "Application already created"

    .line 2
    .line 3
    iget-object v1, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/test/AndroidTestCase;->assertNull(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/test/AndroidTestCase;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Landroid/app/Instrumentation;->newApplication(Ljava/lang/Class;Landroid/content/Context;)Landroid/app/Application;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    invoke-virtual {p1}, Landroid/app/Application;->onCreate()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 20
    .line 21
    return-object p1

    .line 22
    :catch_0
    move-exception v0

    .line 23
    new-instance v1, Ljava/lang/RuntimeException;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "Could not create application "

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    throw v1
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
.end method

.method protected b()Lorg/greenrobot/greendao/database/a;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/greenrobot/greendao/test/f;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v1}, Landroid/database/sqlite/SQLiteDatabase;->create(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/test/AndroidTestCase;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "greendao-unittest-db.temp"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/test/AndroidTestCase;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v2, v3, v1}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    new-instance v1, Lorg/greenrobot/greendao/database/f;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lorg/greenrobot/greendao/database/f;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 32
    .line 33
    .line 34
    return-object v1
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
.end method

.method public c()Landroid/app/Application;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/app/Application;",
            ">()TT;"
        }
    .end annotation

    .line 1
    const-string v0, "Application not yet created"

    .line 2
    .line 3
    iget-object v1, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/test/AndroidTestCase;->assertNotNull(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 9
    .line 10
    return-object v0
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
.end method

.method protected d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->c:Lorg/greenrobot/greendao/database/a;

    .line 2
    .line 3
    instance-of v1, v0, Lorg/greenrobot/greendao/database/f;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lorg/greenrobot/greendao/database/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/greenrobot/greendao/database/f;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Lorg/greenrobot/greendao/f;->f(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "Table dump unsupported for "

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->c:Lorg/greenrobot/greendao/database/a;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lorg/greenrobot/greendao/e;->l(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :goto_0
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
.end method

.method public e()V
    .locals 2

    .line 1
    const-string v0, "Application not yet created"

    .line 2
    .line 3
    iget-object v1, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/test/AndroidTestCase;->assertNotNull(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Application;->onTerminate()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

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
.end method

.method protected setUp()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Landroid/test/AndroidTestCase;->setUp()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/greenrobot/greendao/test/f;->b()Lorg/greenrobot/greendao/database/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lorg/greenrobot/greendao/test/f;->c:Lorg/greenrobot/greendao/database/a;

    .line 9
    .line 10
    return-void
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
.end method

.method protected tearDown()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->d:Landroid/app/Application;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/greenrobot/greendao/test/f;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->c:Lorg/greenrobot/greendao/database/a;

    .line 9
    .line 10
    invoke-interface {v0}, Lorg/greenrobot/greendao/database/a;->close()V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lorg/greenrobot/greendao/test/f;->b:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/test/AndroidTestCase;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "greendao-unittest-db.temp"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-super {p0}, Landroid/test/AndroidTestCase;->tearDown()V

    .line 27
    .line 28
    .line 29
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
.end method
