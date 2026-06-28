.class Lcom/umeng/analytics/pro/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/umeng/analytics/pro/f;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lcom/umeng/analytics/pro/f;

    invoke-static {}, Lcom/umeng/analytics/pro/f;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/umeng/analytics/pro/f;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/umeng/analytics/pro/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILcom/umeng/analytics/pro/f$1;)V

    sput-object v7, Lcom/umeng/analytics/pro/f$a;->a:Lcom/umeng/analytics/pro/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/umeng/analytics/pro/f;
    .locals 1

    sget-object v0, Lcom/umeng/analytics/pro/f$a;->a:Lcom/umeng/analytics/pro/f;

    return-object v0
.end method
