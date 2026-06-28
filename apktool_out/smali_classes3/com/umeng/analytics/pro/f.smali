.class Lcom/umeng/analytics/pro/f;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/f$a;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    .locals 1

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/umeng/analytics/pro/e;->b:Ljava/lang/String;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/f;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/f;->a()V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    .locals 1

    .line 2
    new-instance v0, Lcom/umeng/analytics/pro/c;

    invoke-direct {v0, p1, p2}, Lcom/umeng/analytics/pro/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, v0, p3, p4, p5}, Lcom/umeng/analytics/pro/f;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILcom/umeng/analytics/pro/f$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/umeng/analytics/pro/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/analytics/pro/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/f;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/f;->b:Landroid/content/Context;

    .line 3
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/f$a;->a()Lcom/umeng/analytics/pro/f;

    move-result-object p0

    return-object p0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    :try_start_0
    const-string v0, "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)"

    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/pro/f;->a:Ljava/lang/String;

    .line 14
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 2

    .line 15
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DROP TABLE IF EXISTS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 16
    instance-of v0, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method static synthetic b()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/f;->b:Landroid/content/Context;

    return-object v0
.end method

.method private b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    :try_start_0
    const-string v0, "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)"

    .line 2
    iput-object v0, p0, Lcom/umeng/analytics/pro/f;->a:Ljava/lang/String;

    .line 3
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method private c(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)"

    .line 2
    .line 3
    iput-object v0, p0, Lcom/umeng/analytics/pro/f;->a:Ljava/lang/String;

    .line 4
    .line 5
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    :goto_0
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
.end method

.method private d(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)"

    .line 2
    .line 3
    iput-object v0, p0, Lcom/umeng/analytics/pro/f;->a:Ljava/lang/String;

    .line 4
    .line 5
    instance-of v1, p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1, v0}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    :goto_0
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
.end method

.method private e(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5

    .line 1
    const-string v0, "__sd"

    .line 2
    .line 3
    const-string v1, "__av"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "__vc"

    .line 10
    .line 11
    const-string v4, "TEXT"

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string v2, "__sp"

    .line 16
    .line 17
    invoke-static {p1, v0, v2, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "__pp"

    .line 21
    .line 22
    invoke-static {p1, v0, v2, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0, v1, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v3, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const-string v0, "__et"

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-static {p1, v0, v1, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0, v3, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    const-string v0, "__er"

    .line 46
    .line 47
    invoke-static {p1, v0, v1}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    invoke-static {p1, v0, v1, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0, v3, v4}, Lcom/umeng/analytics/pro/h;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
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

.method private f(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    const-string v0, "__sd"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/pro/f;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "__et"

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/pro/f;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "__er"

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/pro/f;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/f;->a()V

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
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "__sd"

    .line 5
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/h;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/f;->c(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    const-string v1, "__is"

    .line 7
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/h;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/f;->d(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_1
    const-string v1, "__et"

    .line 9
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/h;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 10
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/f;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_2
    const-string v1, "__er"

    .line 11
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/h;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 12
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/f;->a(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->c(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->d(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    :try_start_2
    sget-object v0, Lcom/umeng/analytics/pro/f;->b:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->a(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    :cond_0
    :goto_1
    return-void

    .line 35
    :catchall_2
    move-exception v0

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    :try_start_3
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 39
    .line 40
    .line 41
    :catchall_3
    :cond_1
    throw v0
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

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    if-le p3, p2, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    if-ne p2, p3, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->e(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->e(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_1
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/f;->f(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    return-void
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
.end method
