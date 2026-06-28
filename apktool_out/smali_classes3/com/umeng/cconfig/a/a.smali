.class public final Lcom/umeng/cconfig/a/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/cconfig/a/a$a;
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

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x1

    const-string v1, "cc.db"

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    iput-object v2, p0, Lcom/umeng/cconfig/a/a;->a:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/umeng/cconfig/a/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/cconfig/a/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/cconfig/a/a;
    .locals 1

    sget-object v0, Lcom/umeng/cconfig/a/a;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/cconfig/a/a;->b:Landroid/content/Context;

    :cond_0
    invoke-static {}, Lcom/umeng/cconfig/a/a$a;->a()Lcom/umeng/cconfig/a/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    :try_start_0
    const-string v0, "create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)"

    iput-object v0, p0, Lcom/umeng/cconfig/a/a;->a:Ljava/lang/String;

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

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    return-void
.end method
